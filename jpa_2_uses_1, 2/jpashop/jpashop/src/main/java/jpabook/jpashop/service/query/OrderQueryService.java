package jpabook.jpashop.service.query;

import jpabook.jpashop.api.OrderSimpleApiController;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Transactional(readOnly = true)
public class OrderQueryService {

}
