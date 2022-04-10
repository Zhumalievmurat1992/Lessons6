package kg.geektech.lessons6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import kg.geektech.lessons6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
   private ActivityMainBinding binding;
   private CustomMath math;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        math = new CustomMath();
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          binding.tvResult.setVisibility(View.VISIBLE);
                int a = Integer.parseInt(binding.etNum1.getText().toString());
                int b = Integer.parseInt(binding.etNum2.getText().toString());
                binding.tvResult.setText(math.add(a,b));
            }
        });
        binding.btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvResult.setVisibility(View.VISIBLE);
                int a = Integer.parseInt(binding.etNum1.getText().toString());
                int b = Integer.parseInt(binding.etNum2.getText().toString());
                binding.tvResult.setText(math.sub(a,b));
            }
        });
        binding.btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvResult.setVisibility(View.VISIBLE);
                int a = Integer.parseInt(binding.etNum1.getText().toString());
                int b = Integer.parseInt(binding.etNum2.getText().toString());
                binding.tvResult.setText(math.multiply(a,b));
            }
        });
        binding.btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvResult.setVisibility(View.VISIBLE);
                int a = Integer.parseInt(binding.etNum1.getText().toString());
                int b = Integer.parseInt(binding.etNum2.getText().toString());
                binding.tvResult.setText(math.div(a,b));
                Toast.makeText(MainActivity.this, "нельзя делить на ноль", Toast.LENGTH_SHORT).show();
            }
        });
    }
}