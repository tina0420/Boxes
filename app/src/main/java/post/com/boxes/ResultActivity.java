package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView box;
    private TextView box1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        float length = getIntent().getFloatExtra("Length",0);
        float width = getIntent().getFloatExtra("Width",0);
        float height = getIntent().getFloatExtra("Height",0);
        TextView box = findViewById(R.id.box);
        TextView data = findViewById(R.id.data);
        TextView price = findViewById(R.id.price);
        if(length <=23 && width <= 14 && height<=13){
            box.setText("BOX3");
            data.setText("Dimention : "+ length +"/" + width +"/"+ height + "cm");
            price.setText("Price : 65");
        }else{
            box.setText("BOX5");
            data.setText("Dimension : "+length + "/" + width + "/" + height + "cm");
            price.setText("Price : 90");
        }



    }
}
