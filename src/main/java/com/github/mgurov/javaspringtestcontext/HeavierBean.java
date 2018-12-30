package com.github.mgurov.javaspringtestcontext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class HeavierBean {
    public HeavierBean(@Value("${delay-sping-context-startup-ms:1000}") long delay) {
        try {
            TimeUnit.MILLISECONDS.sleep(delay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
