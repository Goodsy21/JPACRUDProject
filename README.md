# JPACRUDProject

# OVERVIEW
This project is a page to display a hockey team of skaters from data stored in a database. It starts with the full team displayed and provides options for the user to add, delete, or edit a players information. Each player (skater) has an id which is autogenerated, a first and last name, hometown, position played, and hometown. All fields can be edited on an existing player. When a player is edited, deleted or added to the team, it is updated in the MySQL database and a confirmation page is displayed, with a return to home which then displays the updated roster. Users can also search for a player by any of the attributes that are in the Skater class.

# LESSONS LEARNED
Separate JSP files, while tedious, are much easier to navigate than trying to return multiple methods to the same page. Naming consistency will also save a lot of time. Initially I wanted to have things named after the team name I play on, but that was only making things harder to follow so I switched back to simple names. Most importantly, make a change, check that it works; instead of making many changes then checking after only to find that the change broke your code. 

# TECHNOLOGIES USED
MySQL Workbench, Java 1.8, JSP, Spring Boot, Gradle, HTML, CSS, GitHub, Atom, XML, JPQL
