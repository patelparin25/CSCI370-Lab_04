package com.example.asynctask;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentAsyncTask extends AsyncTask<Void, Void, ArrayList> {
    private Context mainContext;
    private ListView listEle;
    public StudentAsyncTask(Context context, ListView listpassed) {
        mainContext = context;
        listEle = listpassed;
    }
    @Override
    protected ArrayList doInBackground(Void... voids) {
        StudentDao studentout = new StudentDao();
        return studentout.getAllStudents();
    }

    @Override
    protected void onPostExecute(ArrayList arrayList) {
        StudentAdapter adapter = new StudentAdapter(mainContext, arrayList);
        listEle.setAdapter(adapter);
    }
}
