package sg.edu.rp.c346.id20045524.demotodolist;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ToDoItem {

    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDateString(){
        Date date2 = this.date.getTime();
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy (EEEE)");
        String dateStr = format1.format(date2);
        return dateStr;
    }

    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)
                +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;

        return "Product Name: " + name + "\nPrice: $" + price;
    }

    private String getDay(int day) {
        switch (day) {
            case 1: return "Monday";

            case 2: return "Tuesday";

            case 3: return "Wednesday";

            case 4: return "Thursday";

            case 5: return "Friday";

            case 6: return "Saturday";

            case 7: return "Sunday";

            default: return "";
        }
    }

}
