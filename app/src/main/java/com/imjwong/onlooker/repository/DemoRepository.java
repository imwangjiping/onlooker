package com.imjwong.onlooker.repository;

import com.imjwong.onlooker.domain.DemoDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * DemoRepository class
 *
 * @author J.Wong
 * @date 2018/01/19
 */
public interface DemoRepository extends JpaRepository<DemoDomain, Long>, QueryDslPredicateExecutor<DemoDomain> {


}
