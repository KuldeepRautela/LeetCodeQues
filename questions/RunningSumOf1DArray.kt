package questions


/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
 */

class RunningSumOf1DArray {

    fun runningSum(nums: IntArray): IntArray {
         val resultArr = IntArray(nums.size)
            var sum = 0
            for (i in nums.indices){
                resultArr[i] = sum + nums[i]
                println(resultArr[i])
                sum += nums[i]
            }
            return resultArr
        }

}