Proof-of-concept reproducing (possible) issue with @Order combined with (nested) @Configuration

# Case 0

Proofs that @Order works while being applied to configuration which triggers @ScanComponent

![Case 0 - diagram](/README-resources/case0.jpg "Case 0 - diagram")

**Expected**: b1

**Outcome**: b1

# Case 1

![Case 1 - diagram](/README-resources/case1.jpg "Case 1 - diagram")

**Expected**: B2#b2

**Outcome**: a1


# Case 2

![Case 2 - diagram](/README-resources/case2.jpg "Case 2 - diagram")

**Expected**: B2#b2

**Outcome**: A2#a2

# Case 3

![Case 3 - diagram](/README-resources/case3.jpg "Case 3 - diagram")

**Expected**: A2#a2

**Outcome**: A2#a2

# Case 4

![Case 4 - diagram](/README-resources/case4.jpg "Case 4 - diagram")

**Expected**: A1#a1

**Outcome**: A2#a2

-------------------------------------------------------------------------

All starts working once I remove "static" from A1/A2/B1/B2 @Configuration classes