package com.wecreate.repositories;

import com.wecreate.entities.Stakeholder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "stakeholder", path="stakeholder")
public interface StakeholderRepository extends MongoRepository<Stakeholder, String> {

    List<Stakeholder> findByFirstName(
            @Param("firstName")
            String firstName);


    List<Stakeholder> findByFirstNameIsNullOrFirstNameContainsAndLastNameIsNullOrLastNameContains(@Param("firstName") String firstName, @Param("lastName") String lastName);

}


//@RequestMapping(method = RequestMethod.GET, value = "/byname")
//  @RequestParam("name")