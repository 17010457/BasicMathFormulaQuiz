package sg.edu.rp.dmsd.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;
    ArrayList<mathFormula> alFormulaList;
    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvFormula = findViewById(R.id.ListViewFormula);
        alFormulaList = new ArrayList<>();
        mathFormula formula1 = new mathFormula("Area of rentangle","Length x Length","Formula type is: Area");
        mathFormula formula2 = new mathFormula("Area of triangle","(Length of base x Length)/2","Formula type is Area");
        mathFormula formula3 = new mathFormula("Volume of cube","Length x Length x Length","Formula type is Volume");

        alFormulaList.add(formula1);
        alFormulaList.add(formula2);
        alFormulaList.add(formula3);

        caFormula = new CustomAdapter(this,R.layout.math_formula2,alFormulaList);
        lvFormula.setAdapter(caFormula);
    }
}
