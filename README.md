# Fordonssystem
This is a Java Swing application originally created as a high school project/Lab assignment. It allows users to manage vehicles, customers, and repair records using a simple graphical interface. The purpose of this repository is to document the project and make it possible to build and run it easily on other systems. 
### Features
- Manage various types of vehicles (personal, municipal, motorcycles, etc.)
- Register and track customers
- Record and view repairs
- Simple text-based data storage (no database)
- GUI built using Java Swing
- Admin privleges
    - in Welcome page ->  Email: -admin -> Login

### Project Structure

The project is built using NetBeans with Ant (not Maven). The GUI uses NetBeans’ AbsoluteLayout, which is only supported directly in NetBeans.
Fordonssystem/ 
<br>├── nbproject/ 
<br>├── lib/ # Contains AbsoluteLayout.jar 
<br>├── src/
<br>├—— —— fordon/ 
<br>├—— —— —— GUI and logic classes <-- Sart.java is main source file
<br>├── build.xml

### Requirements
- NetBeans IDE (version 12 or later)
- Java JDK 17 (or compatible)
- Ant (automatically handled by NetBeans)

### How to Run
1. Clone the repository:
In NetBeans project folder (default: User/<user>/Documents/NetBeansProjects)
   ```bash
   git clone https://github.com/RoboKamu/Fordonssystem.git
2. Open NetBeans and go to File > Open Project. Select the cloned folder.

3. Make sure the AbsoluteLayout library is available:

  - Source Packages (src) → fordon → fordon.GUI (GUI) → right clock Start.java → Compile file 

  -  If missing, click Add Library > Absolute Layout

  -  If not listed, you can add it manually from: /path/to/netbeans/java/modules/ext/AbsoluteLayout.jar

4. Build and run the project:

  - Right-click the project → Build Project (Fordonssystem)
  - Right-click the project → Run Project (Fordonssystem)
    -  Or press Shift + F6 inside Start.java

### Notes
  -  File paths for reading/writing data have been updated to work on both Windows and Linux.

  -  All layout code is in Start.java — the .form file is no longer available.

  -  Data is saved to plain text files in the src/fordon/Data/ directory.


### ⚠️ This code is no longer actively developed but remains available for reference, experimentation, or review.