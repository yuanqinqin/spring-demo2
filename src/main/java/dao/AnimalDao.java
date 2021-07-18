package dao;

import com.ins.test.Animal;
import org.apache.ibatis.annotations.Param;

public interface AnimalDao {
    public int insertAnimal(Animal animal);
    public Animal selectAnimal(@Param("id") int animalId);
    public Animal getByName(@Param("name") String animalName);
    public void deleteByName(@Param("name") String animalName);
    public int updateByName(@Param("name") String animalName,@Param("age") int animalAge);

}
