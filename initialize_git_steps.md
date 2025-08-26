
# Steps to Initialize a Git Repository for a Java Project

Follow the steps below to set up your Java project with a Git repository:

### 1. Create a Java Project in IDE
- Open your IDE (e.g., IntelliJ IDEA or Eclipse).
- Create a new Java project and set up your required environment (Java version, dependencies, etc.).

### 2. Remove Unnecessary Folders and Files (If Required)
- Remove or clean up any unnecessary folders or files that were automatically created by the IDE (e.g., `.idea`, `out/`, or `target/` directories).

### 3. Create a Repository with the Same Name in Git
- Go to [GitHub](https://github.com) and create a new repository.
- Use the same name as your project (e.g., `notification_system`).

### 4. Initiate Git in the Project Directory
- Go back to your project in the terminal or command prompt.
- Execute the following command to initialize a Git repository:
  ```bash
  git init
  ```

### 5. Establish Link to the Remote Git Repository
- Link your local repository to the remote Git repository with the following command:
  ```bash
  git remote add origin https://github.com/sauravq405/notification-system.git
  ```

### 6. Execute Git Branch Command to Set Main Branch
- Ensure you are working with the main branch by executing:
  ```bash
  git branch -M main
  ```

### 7. Check Git Status
- Check the status of your project with:
  ```bash
  git status
  ```

### 8. Add All Files to Git
- Add all files in your project directory to the staging area:
  ```bash
  git add .
  ```

### 9. Commit the Files
- Commit your changes with a message:
  ```bash
  git commit --no-verify -m "Initial commit"
  ```

### 10. Push the Changes to GitHub
- Push your local repository to GitHub with the following command:
  ```bash
  git push -u origin main
  ```

---

### Conclusion
Now your Java project is initialized with Git and pushed to a remote GitHub repository. You can continue working on your project, committing changes, and pushing updates to the repository.
