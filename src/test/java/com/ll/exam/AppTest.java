package com.ll.exam;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

}

class HashMapTest{

    @Test
    void 클래스가_존재(){
        HashMap hashMap = new HashMap();
    }

    @Test
    void 제네릭_가능(){
        HashMap<String, Object> hashMap = new HashMap<>();
    }

    @Test
    void put(){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("asd", 123);
    }

    @Test
    void get(){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("asd", 123);
        hashMap.put("qwe", 456);
        hashMap.put("zxc", 789);

        int num = hashMap.get("asd");

        System.out.println(num);

    }

    @Test
    void 데이터_수정(){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("asd", 123);
        hashMap.put("qwe", 456);
        hashMap.put("zxc", 789);

        hashMap.put("qwe", 000);

        assertEquals(000, hashMap.get("qwe"));
    }

    @Test
    void remove(){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("asd", 123);
        hashMap.put("qwe", 456);
        hashMap.put("zxc", 789);

        hashMap.remove("zxc");

        assertEquals(2, hashMap.size());
    }

    @Test
    void keySet(){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("asd", 123);
        hashMap.put("qwe", 456);
        hashMap.put("zxc", 789);

        List<String> keySet = hashMap.keySet();
        for (String s : keySet){
            System.out.println(s);
        }
    }

    @Test
    void monkey_map(){
        HashMap<String, Object> variousMap = new HashMap<>();
        variousMap.put("mk1", new 원숭이("mk1"));
        variousMap.put("man1", new 사람("kim"));

        원숭이 monkey_1 = (원숭이)variousMap.get("mk1");
        사람 kim = (사람)variousMap.get("man1");

        monkey_1.juggling();
        kim.talk();
    }
    class 원숭이{
        String name;

        public 원숭이(String name) {
            this.name = name;
        }

        public void juggling() {
            System.out.println(name + "가 저글링을 합니다.");
        }
    }

    class 사람{
        String name;

        public 사람(String name) {
            this.name = name;
        }

        public void talk() {
            System.out.println(name + "이 말을 합니다.");
        }
    }
}