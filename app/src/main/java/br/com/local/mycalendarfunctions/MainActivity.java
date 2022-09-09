package br.com.local.mycalendarfunctions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.MaterialDatePicker;

public class MainActivity extends AppCompatActivity {
    Button btnSelecionarData;
    TextView txtSelecionaData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSelecionarData = findViewById(R.id.btnSelecionarData);
        txtSelecionaData = findViewById(R.id.txtDataSelecionada);

        CalendarConstraints.Builder calendarConstraintBuilder = new CalendarConstraints.Builder();
        calendarConstraintBuilder.setValidator(DateValidatorPointForward.now());

        MaterialDatePicker.Builder materialDatePickerBuilder = MaterialDatePicker.Builder.datePicker();
        materialDatePickerBuilder.setTitleText("SELECIONE A DATA");

    }
}