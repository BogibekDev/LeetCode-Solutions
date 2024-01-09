package Leetcode

fun twoSum(nums: IntArray, target: Int): IntArray {
    val res = IntArray(2)

    for (i in nums.indices) {
        val index = nums.indexOf(target - nums[i])
        if (index != i && index != -1) {
            res[0] = i
            res[1] = index
            break
        }
    }
    return res
}