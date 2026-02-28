## Quick github guide for Team 203
were mainly using the [Github Desktop app](https://desktop.github.com/) 3ashan as-hal w it prevents us from accidently uploading broken eclipse files (dw I set up the .gitignore fa HOPEFULLY no need to worry abt accidentally uploading cache)

**Index:**
1. [First-Time Setup](#1-first-time-setup)
2. [The Daily Start (Pulling)](#2-the-daily-start-pulling)
3. [The Daily Finish (Saving)](#3-the-daily-finish-saving)
4. [Merge Conflicts](#4-merge-conflicts)
5. [Emergency Abort](#5-emergency-abort)
6. [Interrupted Save (Stashing)](#6-interrupted-save-stashing)
7. [Rollback a Bug](#7-rollback-a-bug)
8. [Safe Sandbox (Branches)](#8-safe-sandbox-branches)

### 1. First-Time Setup
- download github desktop and login
- go to `File > Clone repository...`
- click the **URL** tab and paste our link `https://github.com/ishatemsalem/CSEN401-Team203.git`
- choose ur exact eclipse workspace in the local path (like `C:\Users\ishatemsalem\eclipse-workspace\CSEN401-Team203`). clone it
- to link it in eclipse: `File > Import > General > Existing Projects into Workspace`, select the folder, hit finish
- CRITICAL: Ensure JDK 21: In Eclipse, go to Window > Preferences > Java > Installed JREs. Law JDK 21 msh mawgoud, click Add > Standard VM > Directory w dawwar 3ala el folder beta3 JDK 21. Check the box gambo 3ashan yeb2a el default.
- Bardo double-check Window > Preferences > Java > Compiler w et2akked en el "Compiler compliance level" is set to 21.

### 2. The Daily Start (Pulling)
awal ma tefta7 el PC te3mel keda. **dont write code without checking this first**
- open github desktop and click **Fetch origin** on top
- law 7ad mel team rafa3 code gded it changes to **Pull origin**. click it
- **CRITICAL:** open eclipse, click our project folder w click **F5** (Refresh). law neseit eclipse will literally overwrite their new code with ur cached files

### 3. The Daily Finish (Saving)
khalast shoghl? time to save
- look at the **Changes** panel on the left in the app. green = added lines, red = deleted
- check the boxes for the files u actually finished (mathalan `Dasher.java`). uncheck any half baked stuff
- ekteb summary wade7 in the bottom left (like *"implemented Dasher momentum"*)
- click **Commit to main** then **Push origin** at the top. ur unfinished stuff stays safe locally on ur PC for tmrw

### 4. Merge Conflicts
law enta w 7ad tany edited the exact same file at the same time app will yell at u: "resolve conflicts before merging"
- open eclipse, hit **F5**
- open the broken file (`Board.java`). hatla2y weird symbols malhash lazma like `<<<<<<< HEAD` w `=======`
- manually delete the symbols w zabbat el code sa7
- save, go back to github desktop hit **Continue Merge** and push

### 5. Emergency Abort
law 3akeit el denya w want to go back to the last working server version
- make sure u havent clicked commit
- open terminal/CMD w edkhol 3ala the project folder: `cd C:\Users\YourName\eclipse-workspace\CSEN401-Team203`
- ekteb `git restore .` (this absolute command wipes all uncommitted local changes)
- eclipse -> F5. everything is clean again

### 6. Interrupted Save (Stashing)
ur halfway through writing code bas someone pushed an urgent update
- click **Pull origin**. the app will ask what to do with ur unfinished files
- choose **"Stash my changes and continue."**
- github hides ur code in a vault, downloads the teams update then u click **View Stashed Changes > Restore** (bottom left) to drop ur unfinished code back on top

### 7. Rollback a Bug
pushed a bug that broke the game for everyone?
- go to the **History** tab in github desktop
- right click ur bad commit w ekhter **Revert commit**
- it does the mathematical opposite of ur mistake (deletes what u added, adds what u deleted). hit **Push origin** to send the fix

### 8. Safe Sandbox (Branches)
want to test a feature bas khayef it crashes `main`?
- click **Current Branch: main** at the top center -> **New Branch**. name it something descriptive (like `dataloader-test`)
- publish branch. enta keda in a parallel universe, a3mel el enta 3aizo
- when its 100% bug free click **Create Pull Request** and tell me and i'll merge it into our main game
