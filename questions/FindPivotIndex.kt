package questions

/*
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
 */


class FindPivotIndex {
    fun pivotIndex(nums: IntArray): Int {
         var sum = 0
         var temp = 0
         var position = -1
        for(i in nums.indices){
            sum+= nums[i]
        }
        if (sum-nums[0]==0)
            position = 0
        else
        for(i in 0 until nums.size-1){
            temp += nums[i]
            if(temp == (sum-nums[i+1]-temp)){
                position = i+1
                break
            }
        }
        return position
    }
}