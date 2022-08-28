package package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static boolean isThisDateValid (String dateToValidate, String dateFormat){

        if(dateFormat == null){
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);

        try {
            Date date = sdf.parse(dateToValidate);
        } catch (ParseException e){
            e.printStackTrace();
            System.out.println("This worker will add in list with zero year");
            return false;
        }
        return true;
    }

    //___________________________________________________________________________________________________________

    public static void main(String[] args) throws IOException {
        Worker [] worker = new Worker[2];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i< worker.length; i++){

            String fio;
            String post;
            String year;

            System.out.println("Enter FIO:");
            fio = br.readLine();
            System.out.println("Post is: ");
            post = br.readLine();
            System.out.println("Year of recruiting : ");
            year = br.readLine();

            if(isThisDateValid(year, "yyyy")){
                worker[i] = new Worker(fio,post,year);
            } else {
                year = "0000";
                worker[i] = new Worker(fio,post,year);
            }
        }

        Arrays.sort(worker);

        for(int i = 0; i< worker.length;i++){
            System.out.println(worker[i].toString());
        }


        System.out.println("Output workers with stage more than (...years): ");
        int value = Integer.parseInt(br.readLine());

        int yearNow = Calendar.getInstance().get(Calendar.YEAR);

        for(int i = 0;i<worker.length;i++){
            String year = worker[i].year;
            int staj = yearNow - Integer.parseInt(year);
            if(staj>value){
                System.out.println(worker[i].toString());

            }
        }
    }


}
