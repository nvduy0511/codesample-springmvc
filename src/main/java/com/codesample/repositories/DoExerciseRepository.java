package com.codesample.repositories;

import com.codesample.entities.DoExercise;
import com.codesample.entities.User;
import com.codesample.models.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.SqlResultSetMapping;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface DoExerciseRepository extends JpaRepository<DoExercise, Integer> {
    @Query("SELECT u FROM DoExercise u WHERE u.user.id = ?1 and u.exercise.id = ?2")
    List<DoExercise> getDoExerciseByIdUserAndIdExercise(int idUser, int idExercise);



    @Query(value = "select user.userName as userName, rank.testCasePass as testCasePass, rank.time as timeSubmit\n" +
            "from (select d.idUser, d.testCasePass, MIN(time) as time\n" +
            "from doexercise as d\n" +
            "where d.idExercise = ?1 && d.testCasePass = (\n" +
            "\tselect MAX(testCasePass)\n" +
            "    from doexercise\n" +
            "    WHERE doexercise.idUser = d.idUser\n" +
            ")\n" +
            "GROUP BY d.idUser, d.testCasePass ) as rank INNER JOIN user\n" +
            "on rank.idUser = user.id\n", nativeQuery = true)
    List<Object[]> getRankByIdExercise(int idExercise);

}
