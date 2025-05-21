from typing import List, Optional


class Solution:
    # Suma: encuentra dos índices cuyo contenido sume el target
    def twoSum(self, nums: List[int], target: int) -> Optional[List[int]]:
        seen = {}
        for i, num in enumerate(nums):
            complement = target - num
            if complement in seen:
                return [seen[complement], i]
            seen[num] = i
        return None
    
    # Multiplicación: encuentra dos índices cuyo contenido multiplicado dé el target
    def twoProduct(self, nums: List[int], target: int) -> Optional[List[int]]:
        if target == 0:
            seen = {}
            for i, num in enumerate(nums):
                if num == 0:
                    if 0 in seen:
                        return [seen[0], i]
                    seen[0] = i
            return None

        seen = {}
        for i, num in enumerate(nums):
            if num != 0 and target % num == 0:
                complement = target // num
                if complement in seen:
                    return [seen[complement], i]
            seen[num] = i
        return None