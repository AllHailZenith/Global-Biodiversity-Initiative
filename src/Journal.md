Phase 1
I created a HashMap to store five species and their population counts. A HashMap is better than an array or ArrayList because it uses species names as keys, making it easier to find and update population counts.

Phase 2
I checked whether each species was already in the HashMap. If it existed, I increased its count by one. If it was new, I added it with a count of one. The hardest part was making sure the file was in the correct location and reading each line properly.

Phase 3
I added a loop to find the species with the highest and lowest population counts. Looking up one species by name is faster because a HashMap usually provides constant-time lookup. Finding the highest and lowest counts requires checking every species.

