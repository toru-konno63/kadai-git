package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task2;

public class Task2Validator {
    // バリデーションを実行する
    public static List<String> validate(Task2 m) {
        List<String> errors = new ArrayList<String>();

        String content_error = validateContent(m.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    // タスクの必須入力チェック
    private static String validateContent(String content) {
        if(content == null || content.equals("")) {
            return "タスクを入力してください。";
        }

        return "";
    }
}
