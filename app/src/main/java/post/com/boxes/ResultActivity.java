package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        float length = getIntent().getFloatExtra("Length",0);
        float width = getIntent().getFloatExtra("Width",0);
        float height = getIntent().getFloatExtra("Height",0);
        TextView box = findViewById(R.id.box);
        TextView dimension = findViewById(R.id.dimension);
        TextView price = findViewById(R.id.price);
        if(length <= 23 && width <= 14 && height <= 13){
            box.setText("BOX3");
            dimension.setText("Dimension: 23 / 14 / 13 cm");
            price.setText("Price:65");
        }else {
            box.setText("BOX5");
            dimension.setText("Dimension: 39.5 / 27.5 / 23 cm");
            price.setText("Price:90");
        }
    }
}
