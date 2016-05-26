package pw.elka.pik.mkdev1.web.rest;

import com.codahale.metrics.annotation.Timed;
import pw.elka.pik.mkdev1.domain.TaskList;
import pw.elka.pik.mkdev1.domain.User;
import pw.elka.pik.mkdev1.repository.TaskListRepository;
import pw.elka.pik.mkdev1.repository.UserRepository;
import pw.elka.pik.mkdev1.service.MailService;
import pw.elka.pik.mkdev1.service.TaskListService;
import pw.elka.pik.mkdev1.web.rest.dto.ManagedUserDTO;
import pw.elka.pik.mkdev1.web.rest.dto.ProjectDTO;
import pw.elka.pik.mkdev1.web.rest.dto.TaskListDTO;
import pw.elka.pik.mkdev1.web.rest.util.HeaderUtil;
import pw.elka.pik.mkdev1.web.rest.util.PaginationUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.net.URI;
import java.net.URISyntaxException;
import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class TaskListResource {
//	
//    private final Logger log = LoggerFactory.getLogger(TaskListResource.class);
//
//    @Inject
//    private TaskListService taskListService;
//
//    @RequestMapping(value = "/tasklists/{id}",
//            method = RequestMethod.GET,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//        @Timed
//        public ResponseEntity<TaskListDTO> getTaskList(@PathVariable Long id){
//            log.debug("REST request to get TaskList : {}", id);
//            return taskListService.getDetailsById(id)
//                .map(taskListDTO -> new ResponseEntity<>(taskListDTO, HttpStatus.OK))
//                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
//        }
}