package ucf.assignments;

import java.util.ArrayList;

public class ListEntry {
    private String listName;
    private ArrayList<EventEntry> EventArray;

    public ListEntry(){
        this.listName = listName;
        this.EventArray = EventArray;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public ArrayList<EventEntry> getEventArray() {
        return EventArray;
    }

    //Will store list name and the array
    //of events
}
