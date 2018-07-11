package io.pivotal.directoryservice.repo;

import io.pivotal.directoryservice.domain.Directory;
import org.springframework.data.repository.CrudRepository;

public interface DirectoryRepository extends CrudRepository<Directory, Long> {

}
