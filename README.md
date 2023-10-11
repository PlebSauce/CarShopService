# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will use the Integrated Development Environment (IDE) link in the web links section of this assessment to install the IDE, IntelliJ IDEA (Ultimate Edition). All relevant links are on the course page. Please refer to the course of study for specific links. You will sign up for a free student license using your WGU.edu email address. Please see the “IntelliJ Ultimate Edition Instructions” attachment for instructions on how do this. Next you will download the “Inventory Management Application Template Code” provided in the web links section and open it in IntelliJ IDEA (Ultimate Edition). You will upload this project to a private external GitLab repository and backup regularly. As a part of this, you have been provided with a base code (starting point). 

Example:
Section C:
1. mainscreen.html, lines 14 and 19: changed title and header to reflect my choice of shop (custom car)

Section D:
1. about.html, line 13: added title for new "About us" page
2. about.html, line 17: added new header for "About us" page
3. about.html, lines 18-21: added a short description of what this company is about
4. about.html, line 23: added button to return to main menu

5. mainscreen.html, line 89: added button to navigate to about.html

6. aboutUsController.java, lines 6-7: defined a controller for the about us page
7. aboutUsController.java, lines 9-10 made a mapping for the about us page

Section E:
1. BootStrapData.java, lines 59-97: added sample inventory of 5 different parts
2. BootStrapData.java, lines 111-121: added sample inventory of 5 products
3. BootStrapData.java, lines 58 and 110: added checks to see if the lists for product and part are 0 and only then do we add the sample inventory values

Section D:
1. confirmationPurchaseProduct.html, line 6: modified timer to redirect after 5 seconds instead of instant
2. confirmationPurchaseProduct.html, line 10 and 12: modified text to reflect what the page does better (indicates successful purchase).

3. failurePurchaseProduct.html, line 6: modified timer to redirect after 5 seconds instead of instant
4. failurePurchaseProduct.html, line 10 and 12: modified text to reflect what the page does better (indicates failure to purchase product).

5. AddProductController.java, lines 124 and 125: initialized buyProduct()
6. AddProdcutController.java, lines 216 and 127: created new objects 
7. AddProdcutController.java, lines 128-131: check that product is valid to be purchased
8. AddProdcutController.java, lines 132-137: deincrement the inventory and delete if no inventory left

9. ProductService.java, line 20: initialized deincrement method

10. ProductServiceImpl.java, lines 70-74: defined deincrement method and intialized values we would need to perform opertations
11. ProductServiceImpl.java, lines 76-82: double checked that our object (result) is valid
12. ProductServiceImpl.java, lines 83-86: grabbed inventory value from our product object, deincremented it, and put it back in using getter and setter methods.
13. ProductServiceImpl.java, line 87: returns our updated object

14. mainscreen.html, lines 85 and 86: added new button that prompts to confirm purchase and redirects to new page, passes value needed to perform action to the controller

Section G:
1. Part.java, line 20: added validation to part entity
2. Part.java, line 4: imported validation file in
3. Part.java, lines 33-37: initialzed integers for minInv and maxInv for parts
4. Part.java, lines 47, 51-52, 55, and 60-61: updated constructors to account for minInv and maxInv fields
5. Part.java, lines 103-118: added getter and setter methods for new minInv and maxInv fields

6. BootStrapData.java, lines 65-66: Updated sample part to store min and max values for inventory
7. BootStrapData.java, lines 75-76: Updated sample part to store min and max values for inventory
8. BootStrapData.java, lines 85-86: Updated sample part to store min and max values for inventory
9. BootStrapData.java, lines 95-96: Updated sample part to store min and max values for inventory
10. BootStrapData.java, lines 105-106: Updated sample part to store min and max values for inventory

11. mainscreen.html, lines 38-39 and 48-49: updated mainscreen tables to show new min and max values

12. InhousePartFrom.html, lines 27-28: added minInv field to inhouse part form
13. InhousePartForm.html, lines 30-31: added maxInv field to inhouse part form
14. InhousePartForm.html, lines 23-25: added prompt to show up when an error is detected in form fields (validation)

15. OuthousePartFrom.html, lines 27-28: added minInv field to outhouse part form
16. OuthousePartForm.html, lines 30-31: added maxInv field to outhouse part form
17. OuthousePartForm.html, lines 24-26: added prompt to show up when an error is detected in form fields (validation)

18. ValidMinMax.java, lines 1-8: added imports needed to run
19. ValidMinMax.java, lines 10-12: specified the constraint, target, and retention of our annotation file
20. ValidMinMax.java, line 13: declared class ValidMinMax
21. ValidMinMax.java, lines 14-16: specified message, scripts, and payload

22. MinMaxValidator.java, lines 1-8: added imports needed to run
23. MinMaxValidator.java, line 10: declared class that implements a constraint validator that our ValidMinMax class will use. Accepts a part object as input
24. MinMaxValidator.java, lines 11-13: defined our context objects
25. MinMaxValidator.java, lines 14-16: define our intialize class that is the super classs of constraint validator
26. MinMaxValidator.java, lines 19-26: define our isValid class to actually do the check of whether or not a given part's inv is within the min-max range

27. application.properties, line 6: updated h2 database name according to what I named it in my file system.

Section H:

Section I:
PartTest.java, lines 158-165: added test for the minimum inventory values
PartTest.java, lines 166-173: added test for the maximum inventory values