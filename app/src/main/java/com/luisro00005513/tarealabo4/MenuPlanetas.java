package com.luisro00005513.tarealabo4;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuPlanetas extends Fragment {

    private int LinearArray [] = {R.id.mercurio, R.id.venus, R.id.tierra, R.id.marte, R.id.jupiter, R.id.saturno
            , R.id.urano, R.id.neptuno, R.id.pluton};


    public MenuPlanetas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View views = inflater.inflate(R.layout.fragment_menu_planetas, container, false);

        LinearLayout menuLinear;

        for(int i= 0; i < LinearArray.length; i++){
            menuLinear = (LinearLayout) views.findViewById(LinearArray[i]);

            final int QUELINEARPRESIONADO = i;

            menuLinear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Activity estaActividad = getActivity();
                    ((NexusInterface)estaActividad).menuLinear(QUELINEARPRESIONADO);
                }
            });

        }//for



        return views;
    }// on create


}
