package com.panhchakly.server.repo;

import com.panhchakly.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

/* A repository includes all the methods such as sorting, paginating data and CRUD operations.
For specifying that the underlying interface is a repository, a marker annotation @Repository is used.
JpaRepository<Server, Long>
Server: model
Long: primary key of id
*/
public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress); //method default jpa findBy-name
}
