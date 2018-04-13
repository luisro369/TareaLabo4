package com.luisro00005513.tarealabo4;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuPlanetas extends Fragment {


    public MenuPlanetas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_planetas, container, false);

    }// on create





    //metodo de fragmento el cual quisiera que llamara a la Main2Activity cada vez que se le de clic al LinearLayout
    public void onClickLayout(View view){
        Intent planeta = new Intent(getActivity().getApplicationContext(), Main2Activity.class);
        startActivity(planeta);

    }//onClickLayout


}
