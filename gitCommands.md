# Team 203 Version Control SOP
**Objective:** To prevent accidental code deletion, manage concurrent development, and protect the CSEN401 backend architecture. 

**Required Software:** [Download GitHub Desktop](https://desktop.github.com/)
*(Note: This guide utilizes GitHub Desktop as the primary tool due to its visual safety nets, which prevent accidental uploads of unfinished Java classes).*

---

## 📑 Index of Operations
1. [Scenario A: First-Time Setup](#scenario-a-first-time-setup-the-initial-clone) *(App)*
2. [Scenario B: The Daily Start](#scenario-b-the-daily-start-the-pull) *(App)*
3. [Scenario C: The Daily Finish & Selective Save](#scenario-c-the-daily-finish--selective-save) *(App)*
4. [Scenario D: The Merge Conflict](#scenario-d-the-merge-conflict-simultaneous-editing) *(App + Eclipse)*
5. [Scenario E: The Emergency Abort](#scenario-e-the-emergency-abort-scrapping-changes) *(Terminal)*
6. [Scenario F: The Interrupted Save](#scenario-f-the-interrupted-save-stashing) *(App)*
7. [Scenario G: The "I Pushed a Bug" Rollback](#scenario-g-the-i-pushed-a-bug-rollback-reverting) *(App)*
8. [Scenario H: The Safe Sandbox](#scenario-h-the-safe-sandbox-branching) *(App)*

---

## Scenario A: First-Time Setup (The Initial Clone)
**Method:** GitHub Desktop (Superior for avoiding terminal pathing/directory errors).
**Context:** Downloading the project to your PC for the very first time.

1. Open **GitHub Desktop** and sign in.
2. Navigate to `File > Clone repository...`
3. Click the **URL** tab at the top.
4. Paste our repository link (e.g., `https://github.com/ishatemsalem/CSEN401-Team203.git`).
5. In the **Local Path** box, click "Choose..." and select your exact Eclipse workspace (e.g., `C:\Users\ishatemsalem\eclipse-workspace\CSEN401-Team203`).
6. Click **Clone**.
7. **Eclipse Integration:** Open Eclipse, go to `File > Import > General > Existing Projects into Workspace`, select the cloned folder, and click Finish.

---

## Scenario B: The Daily Start (The Pull)
**Method:** GitHub Desktop (Superior because it visually alerts you if teammates have pushed new code).
**Context:** You are sitting down to work. **Never write new code without doing this first.**

1. Open **GitHub Desktop**.
2. Click the **Fetch origin** button at the top center. (This pings the server to check for updates).
3. If Judy, Rokaya, or Jana uploaded new code, the button will change to **Pull origin** with a downward arrow. Click it to download their code.
4. ⚠️ **CRITICAL ECLIPSE STEP:** Open Eclipse, click the project folder in the Package Explorer, and press **F5** (Refresh). If you skip this, Eclipse will overwrite the new downloads with its cached files!

---

## Scenario C: The Daily Finish & Selective Save
**Method:** GitHub Desktop (Superior because it allows line-by-line visual review and easy un-checking of unfinished files).
**Context:** You finished writing `Dasher.java` but only half-finished `Dynamo.java`. You want to safely upload the finished one.

1. Open **GitHub Desktop**.
2. Look at the **Changes** panel on the left. You will see every file you touched.
3. Click a file to view the exact lines changed (Green = Added, Red = Deleted). Use this as a self-review.
4. **Selective Save:** Keep the box next to `Dasher.java` **checked**. Uncheck the box next to `Dynamo.java`. 
5. In the bottom left **Summary** box, write a professional message: *"Implemented Dasher momentum logic"*.
6. Click **Commit to main**.
7. Click **Push origin** at the top center to upload it to the server. Your unfinished `Dynamo.java` remains safely hidden on your PC for tomorrow.

---

## Scenario D: The Merge Conflict (Simultaneous Editing)
**Method:** GitHub Desktop + Eclipse (Superior because the App locks you from uploading broken merge markers).
**Context:** You and a teammate edited `Board.java` at the exact same time. The app throws an error when you try to Pull.

1. GitHub Desktop will display a warning: **"Resolve conflicts before merging."**
2. Open Eclipse and press **F5** to refresh.
3. Open the conflicting file (`Board.java`). You will see bizarre symbols injected into our code:
   ```java
   <<<<<<< HEAD
   private int energy = 1000; // Your code
   =======
   private int energy = 500; // Their code
   >>>>>>> 8a2b3c4d5e...
4. Manually delete the Git markers (<<<<<<<, =======, >>>>>>>) and edit the code to reflect the correct Milestone 1 requirements.

5.  Save the file in Eclipse.

6. Return to GitHub Desktop. It will now allow you to click Continue Merge and then Push origin.

## Scenario E: The Emergency Abort (Scrapping Changes)
**Method:** Terminal / Command Prompt (Superior because reverting a massive, project-wide break is faster via a single command than clicking 50 files in the GUI).
**Context:** You accidentally deleted critical Milestone 1 files or completely broke a class, and you want to wipe your local PC clean and return to the last working server state.

1. Ensure you have not clicked "Commit" yet.

2. Open your terminal and navigate to the project folder:
      ```java
      cd C:\Users\YourName\eclipse-workspace\CSEN401-Team203

3. Execute the absolute restore command (this wipes all uncommitted local changes):
      ```java
      git restore .

4. Open Eclipse and press F5. Your project is magically restored to its last clean state.

## Scenario F: The Interrupted Save (Stashing)
**Method:** GitHub Desktop (Superior because the app handles the stashing automatically).
**Context:** You are halfway through writing a class. A teammate tells you they just pushed a critical update. You cannot pull their update because you have unsaved changes, but your code isn't finished enough to commit.

1. Open **GitHub Desktop**.
2. Click **Pull origin** to download the team's new code.
3. GitHub Desktop will stop you and pop up a warning window asking what to do with your unfinished files.
4. Select the option: **"Stash my changes and continue."**
5. GitHub will temporarily hide your unfinished code in a safe vault and apply the team's new updates to your Eclipse.
6. Once the pull is complete, look at the bottom of the left panel in GitHub Desktop. Click **View Stashed Changes**, and click **Restore**.
7. Your unfinished code is brought back from the vault and placed perfectly on top of the new updates.

---

## Scenario G: The "I Pushed a Bug" Rollback (Reverting)
**Method:** GitHub Desktop (Superior because executing this in the terminal is highly dangerous).
**Context:** You wrote broken code, committed it, AND pushed it to the server. The team's game is now broken.

1. Open **GitHub Desktop**.
2. Click the **History** tab on the left panel.
3. Locate the specific commit where you uploaded the broken code.
4. **Right-click** that commit and select **Revert commit**.
5. GitHub Desktop will automatically generate a new update that does the exact mathematical opposite of your broken update (e.g., if you added 5 bad lines, it deletes those exactly).
6. Click **Push origin** to send the fix to the server. 

---

## Scenario H: The Safe Sandbox (Branching)
**Method:** GitHub Desktop (Superior for visualizing parallel timelines).
**Context:** You want to test a highly complex feature, but you are afraid it might crash the `main` game that everyone else relies on.

1. Open **GitHub Desktop**.
2. At the top center, click the **Current Branch: main** button.
3. Click **New Branch** and name it something descriptive (e.g., `islam-dataloader-test`).
4. Click **Publish branch** to send this safe sandbox to the server.
5. You are now working in an isolated parallel universe. You can write code, commit, and push as much as you want without affecting the `main` game.
6. Once you are 100% sure your code compiles perfectly, click the **Create Pull Request** button to merge your sandbox back into the `main` timeline.
