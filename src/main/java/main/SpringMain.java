package main;

import com.ins.test.Animal;
import dao.AnimalDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:config.xml");
        AnimalDao animalDao = applicationContext.getBean(AnimalDao.class);
//        Animal animal1 = new Animal();
//        animal1.setName("fish");
//        animal1.setColor("red");
//        animal1.setAge(1);
//        animalDao.insertAnimal(animal1);

        Animal animal2 = animalDao.selectAnimal(1);
        System.out.println("id为1的Animal是：" + animal2.getName() + "，它的颜色是：" + animal2.getColor() + "，年龄是：" + animal2.getAge());

        int i = animalDao.updateByName("fish",4);

        Animal animal3 = animalDao.getByName("fish");
        System.out.println("name为fish的Animal的id是：" + animal3.getId() + "，它的颜色是：" + animal3.getColor() + "，年龄是：" + animal3.getAge());

        animalDao.deleteByName("cat");
    }

}
