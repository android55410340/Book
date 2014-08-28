package app.buusk.my_layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Activity55410340 extends Activity implements OnClickListener{
    private Button btnone,btntwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnone = (Button) findViewById(R.id.btn_book);
        btntwo = (Button) findViewById(R.id.chang1);
        btntwo.setOnClickListener(this);
			//@Override
			//public void onClick(View v) {
				// TODO Auto-generated method stub
			//	Toast.makeText(Activity55410340.this, "Phichapha",Toast.LENGTH_LONG).show();
			//}
		//}
        	
}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
		case R.id.chang1:
			Intent i = new Intent(getApplicationContext(),main.class);
			startActivity(i);
			break;
	
		default:
			break;
	   }
	}
}
