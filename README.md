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
1. Part.java, lines 31-34: initialized minInv and maxInv
2. Part.java, lines 48-49 and 57-58: Updated constructor classes to use minInv and maxInv as well
3. Part.java, lines 100-115: defined getter and setter methods for minInv and maxInv

