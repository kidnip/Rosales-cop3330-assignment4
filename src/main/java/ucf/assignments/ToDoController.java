package ucf.assignments;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToDoController /*implements Initializable*/ {

    public void onRadioButtonClick(){
        //will check state of toggle group and changes the
        //label based on state returned
    }

    public void onClickSubmit(){
        //an if statement is used to compare the state
        //of the toggle group and get the respective
        //components needed to create an element in
        //a list
        //see #6 and #9 for more info
    }

    public ArrayList<ListEntry> editTitle(){
        //will loop through the list of lists and
        //find the one that was selected. The user
        //will be prompted the new title and the
        //new title with be saved over the old one

        //return list

        return null;
    }

    public ArrayList<ListEntry> deleteList(){
        //will loop through the list of lists and
        //find the one that was selected. It will
        //then delete the list and events included
        //in it

        //return list

        return null;
    }

    public void showAllItems(){
        // shows all items in a list by un-hiding all
        // items in the list view
    }

    public void showComplete(){
        // shows only complete items by checking each
        // item in the list view and seeing if the
        // item is marked as complete
        // hides the other items not marked
    }

    public void showIncomplete(){
        // the opposite of showComplete
        //shows all unmarked and hide marked
    }

    public void viewListOptions(){
        // displays a context item beside the menu item
        // that says View Options that allows user to
        // show all items, only complete, and incomplete
        // items

        // if show all is selected, call showAllItems()
        // if show complete is selected, call showComplete()
        // if show incomplete is selected, call
        // showIncomplete()

        // hide list

    }

    public void onRightClickList(){
        // if user right-clicks a list element in the
        // list view, a menu with options for editing
        // and removing the list is shown
        // show option is also available

        // if user chooses to edit title, call
        // editTitle() method
        // if user chooses to delete list, call
        // deleteList() method
        // if user clicks the View option menu
        // item, call viewListOptions() method


        // hide menu
    }

    public ListEntry deleteEvent(ListEntry root){
        // takes in the list that contains the event
        // and deletes it by using a loop to find its
        // index

        //return the list

        return null;
    }

    public EventEntry editDescription(EventEntry root, String desc){
        // takes in the event of description to change
        // and replace the old description with the new

        // return event

        return null;
    }

    public EventEntry editDate(EventEntry root, int year, int month, int day){
        // takes in the event of date to change and
        // replace each parameter of the date

        //return event

        return null;
    }

    public EventEntry markComplete(){
        // takes in event to mark as complete
        // and changes the value within the
        // class

        // return event

        return null;
    }

    public void onRightClickItem(){
        // if user right-clicks an event in the list
        // view, then display a menu with options
        // for removing and editing an event

        // if user chooses to remove event, call
        // deleteEvent() method
        // if user chooses to edit the event
        // description, call editDescription() method
        // if user chooses to edit due date, call
        // editDate() method
        // if user chooses to mark an item as
        // complete, call markComplete()

        // hide menu
    }

    public void createFile(String listName, String path){
        // creates a text file after finding the list
        // needed to be saved and writing its contents
        // to the file

        // list listName is received as "ALL", then
        // write all lists to the same file
    }

    public void saveAList(){
        // open a pop-up view that asks user for the
        // name of the list that is wanted to be saved
        // and a destination folder

        // call createFile(), passing list name and file
        // path
    }

    public void saveAll(){
        // open same pop-up and take just destination
        // path for the file

        // call createFile(), passing just file path
        // and listName as "ALL"
    }

    public ArrayList<ListEntry> createLists(String path){
        // find path and scan the list names, which
        // are above all events and create a list
        // with the name. Scan everything after as
        // an event with the respective parameters
        // do this until end of file

        // return the array of lists

        return null;
    }

    public void loadLists() {
        // open pop-up and take file destination
        // path for file to load

        // call createLists(), passing file path
    }

    /*
    6.  To add a new todo list, user will click on the radio button
        that says "Add New List", and enter just the list name.
        On button click, the label at the bottom of the screen will
        change according to the button selected using an if statement
        and provide the user with instructions. After pressing the
        "Submit" button, an on button click method with an if statement
        comparing the state of the radio buttons to then take the value
        in the List Name text field and add it into a list, while
        showing it to the list view.

    7.  To remove an existing todo list, the user will have to right-click
        on a list, which will show a menu with a button that will say
        "Delete list". After an on button click, the list element will be
        removed from the list and list view.

    8.  Just like #7, user will right-click the list and the menu will
        also display a button called "Edit title", where the user can
        then type in a new title name and it will be saved and displayed
        in the list view.

    9.  To add a new item to a todo list, user will click on the button
        that says "Add New Event", and enter the list name the event
        will go into, event description, and due date. On button click
        of the radio button, the label at the button will change like in
        #6. After pressing the "Submit" button, an on button click method
        with an if statement will compare the state of the button group
        and find the list the event will go into. Each element will then
        be saved in another list for the list entered and be displayed in
        list view.

    10. To remove an item from a todo list, just like #7, the user will
        right-click the item in the list view and select a button from
        and menu that says "Remove item". An on button click method will
        delete the item from the list's list and remove it from the list
        view.

    11. To edit the description of an item in an existing todo list, the
        user will right-click the item in the list view, where a menu will
        appear and show an option to edit the description. It will then be
        saved to the event entry in the respective list

    12. To edit the due date, it will be the same as #11, but user will
        click an option that says "Edit Date". User will enter a new date
        and will be saved

    13. To mark an item in a todo list as complete, just like in #11 and
        #12, user will click an option that say "Mark as Complete". This
        will then update the completed value in the event entry and display
        an "*" or change the text color (TBD)

    14. The user will be able to see every item in a list by default once
        they click on the list (On click method). However, right-clicking
        the list of the event with show another menu within the other menu
        titled "View Options", with one of the choices being "Show All"

    15. To show only incomplete items, in the menu mentioned in #14, there
        will be an option titled "Show Incomplete". This will update the
        list view to only include those not marked as complete, which should
        be by default once entered. This will be done by hiding all events
        in the list view using a loop to find all events marked as incomplete

    16. Like #14 and #15, there will be an option that displays "Show Complete",
        This will update the list view to show only events marked as complete
        via user input. This will be done using a loop to find and hide all
        elements marked as complete and update the list view according

    17. To save all the items in a single todo list, there is a menu bar at
        the top of the application that a user can select named "Save" which
        will allow the user to click an option named "Save Items". This
        will trigger a pop-up that will prompt the user for the name of the
        list with items and a destination to save the data to. It will then
        create a text file with the name of the list at the top of the file
        and each event afterwards, separated with newlines.

    18. To save all the lists, like #17, there will be an option titled
        "Save All". A pop-up will appear prompting the user for a directory
        to save the data to. Each list will alternate by list name and events,
        in a way that distinguishes the lists from each other.

    19. To load a single todo list, there is a menu bar at the top of the
        application that a user can select called "Load" which will allow the
        user to click an option called "Load List". This will trigger a pop-up
        screen that asks for the file directory for the file containing the
        list data. It will then scan the file, with list name first and events
        after. It will then enter the list into the list array and display it
        to the list view.

    20. To load multiple lists, like #19, there will be an option titled
        "Load Lists" which will a trigger a pop up that will prompt the
        user for a file directory. Then the file will be scanned, reading
        the distinguishable list names and events and inserting them into
        the list array and displaying each lists and events in the list views







     */
}
