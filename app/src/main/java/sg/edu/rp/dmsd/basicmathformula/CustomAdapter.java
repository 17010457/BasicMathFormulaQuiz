package sg.edu.rp.dmsd.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by 17010457 on 7/18/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<mathFormula> formulaList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<mathFormula> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.formulaList = objects;
    }

    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvFormula = rowView.findViewById(R.id.tvFormula);
        TextView tvType = rowView.findViewById(R.id.tvType);

        mathFormula currentItem = formulaList.get(position);
        tvName.setText(currentItem.getTvName());
        tvFormula.setText(currentItem.getTvFormula());
        tvType.setText(currentItem.getTvType());

        return rowView;
    }
}

