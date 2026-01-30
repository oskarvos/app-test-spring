package com.oskarvos.apptestspring.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectComponent {
    @Before("execution(* MusicPlayer.playRandomMusician())")
    public void before(JoinPoint jp) {
        System.out.println("🎵 [АСПЕКТ] Перед вызовом " +
                jp.getSignature().getName());
    }

    @After("execution(* MusicPlayer.playRandomMusician())")
    public void after(JoinPoint jp) {
        System.out.println("🎵 [АСПЕКТ] После вызова " +
                jp.getSignature().getName());
    }

}
