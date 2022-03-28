package com.example.recyclerview;
import java.util.ArrayList;

public class ContactData {
    public static String[][] data = new String[][]{
            {"vitome", "https://i.pinimg.com/564x/88/5c/90/885c907993d774ded7f4ebd72f2e0561.jpg"},
            {"Newchic", "https://i.pinimg.com/564x/83/d0/5c/83d05c49fb1b03e446f656df5f4066d7.jpg"},
            {"Adidas", "https://i.pinimg.com/564x/5c/91/89/5c918993c3598df2fc763e920157db37.jpg"},
            {"Nike", "https://i.pinimg.com/564x/08/68/58/0868586faed6875d32a026354065b278.jpg"},
            {"Puma", "https://i.pinimg.com/564x/50/b1/ba/50b1bada5dd0f804c0bd55819c614bf5.jpg"},
            {"Reebok", "https://i.pinimg.com/564x/50/b1/ba/50b1bada5dd0f804c0bd55819c614bf5.jpg"},
            {"Mizuno", "https://i.pinimg.com/564x/9b/ad/b4/9badb423bc0d1ae249cd72f37355e33e.jpg"},
            {"Polo", "https://i.pinimg.com/564x/84/a9/0c/84a90c7ab7136c9fb49cc453d91312f8.jpg"},
            {"Levis", "https://i.pinimg.com/564x/20/5c/67/205c67000f9bb51ef3f775bbeaecf24a.jpg"},
            {"Nevada", "https://i.pinimg.com/564x/8c/27/3b/8c273bb36cf70acece5cfdffa0f47a17.jpg"}
};
    public static ArrayList<Contact> getListData(){
        Contact contact = null;
        ArrayList<Contact> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++){
        contact = new Contact();
        contact.setName(data[i][0]);
        contact.setPhoto(data[i][1]);
        list.add(contact);
        }
        return list;
        }

}
