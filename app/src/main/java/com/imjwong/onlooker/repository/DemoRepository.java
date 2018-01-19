package com.imjwong.onlooker.repository;

import com.imjwong.onlooker.domain.DemoDomain;
import com.imjwong.onlooker.domain.QDemoDomain;
import com.querydsl.core.types.dsl.SimpleExpression;
import com.querydsl.core.types.dsl.StringExpression;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

/**
 * DemoRepository class
 *
 * @author J.Wong
 * @date 2018/01/19
 */
public interface DemoRepository extends JpaRepository<DemoDomain, Long>, QueryDslPredicateExecutor<DemoDomain>, QuerydslBinderCustomizer<QDemoDomain> {

    @Override
    default void customize(QuerydslBindings bindings, QDemoDomain demoDomain) {
        bindings.bind(demoDomain.name).first(StringExpression::contains);
        bindings.bind(demoDomain.id).first(SimpleExpression::eq);
    }

}
