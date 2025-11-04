package com.example.banking;

import com.example.banking.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.banking.config.AppConfig;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService service = context.getBean(AccountService.class);

        service.transferMoney(1, 2, 500.0);

        context.close();
    }
}
