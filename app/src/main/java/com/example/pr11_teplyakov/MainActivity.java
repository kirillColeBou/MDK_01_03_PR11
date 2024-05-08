package com.example.pr11_teplyakov;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void AlertDialog(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title).setMessage(message).setCancelable(false).setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) { dialog.cancel(); }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void SelectUser(View view){AlertDialog("Уведомление","Пользователь");}

    public void SelectBasket(View view){AlertDialog("Уведомление","Корзина");}

    public void SelectMenu(View view){AlertDialog("Уведомление","Меню");}

    public void SelectWallet(View view){AlertDialog("Уведомление","Кошелек");}

    public void SelectHideInformation(View view){AlertDialog("Уведомление","Скрыть информацию по картам");}

    public void SelectOther(View view){AlertDialog("Уведомление","Другое");}

    public void SelectScan(View view){AlertDialog("Уведомление","Сканировать QR-код");}

    public void SelectCheck(View view){AlertDialog("Уведомление","Не знаю что за кнопка, у меня нет сбера)");}

    public void SelectGoldCard(View view){AlertDialog("Уведомление","Зарплатная карта");}

    public void SelectGrayCard(View view){AlertDialog("Уведомление","Резервная карта");}

    public void SelectBlackCard(View view){AlertDialog("Уведомление","Кредитная карта");}

    public void SelectAdvertising(View view){AlertDialog("Уведомление","Перейти (нажатие по рекламе)");}

    public void SelectHideAdvertising(View view){AlertDialog("Уведомление","Скрыть рекламу");}

    public void SelectAllTransaction(View view){AlertDialog("Уведомление","Все переводы");}

    public void SelectNewTransaction(View view){AlertDialog("Уведомление","Новый перевод");}

    public void SelectUserTransaction(View view){AlertDialog("Уведомление","Перевод пользователю");}

    public void SelectHideUserTransaction(View view){AlertDialog("Уведомление","Скрыть пользователя для перевода");}

    public void SelectExpenses(View view){AlertDialog("Уведомление","Раскрыть расходы");}

    public void SelectAllExpenses(View view){AlertDialog("Уведомление","Все расходы");}

    public void SelectBusExpenses(View view){AlertDialog("Уведомление","Расходы на транспорт");}

    public void SelectEatExpenses(View view){AlertDialog("Уведомление","Расходы на рестораны");}

    public void SelectCredit(View view){AlertDialog("Уведомление","Кредит");}

    public void SelectNewCredit(View view){AlertDialog("Уведомление","Новый кредит");}

    public void SelectNewService(View view){AlertDialog("Уведомление","Оформить");}

    public void SelectAllService(View view){AlertDialog("Уведомление","Все сервисы");}

    public void SelectServiceForYou(View view){AlertDialog("Уведомление","Сервисы для вас");}

    public void SelectRecommendation(View view){AlertDialog("Уведомление","Рекомендации");}

    public void SelectBirthday(View view){AlertDialog("Уведомление","День рождения Мегамаркета");}

    public void SelectPromocode(View view){AlertDialog("Уведомление","Промокод");}

    public void SelectSale(View view){AlertDialog("Уведомление","Скидка");}

    public void SelectAllCourseValute(View view){AlertDialog("Уведомление","Все курсы");}

    public void SelectCNYCourseValute(View view){AlertDialog("Уведомление","Курс юани");}

    public void SelectUSDCourseValute(View view){AlertDialog("Уведомление","Курс доллара");}

    public void SelectEURCourseValute(View view){AlertDialog("Уведомление","Курс евро");}

    public void SelectHomePage(View view){AlertDialog("Уведомление","Главная страница");}

    public void SelectDiagramPage(View view){AlertDialog("Уведомление","Страница накопления");}

    public void SelectAssistentPage(View view){AlertDialog("Уведомление","Страница ассистент");}

    public void SelectPaymentPage(View view){AlertDialog("Уведомление","Страница платежи");}

    public void SelectClockPage(View view){AlertDialog("Уведомление","Страница история");}
}