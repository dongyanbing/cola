#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain.customer.gateway;

import ${package}.domain.customer.Customer;
import ${package}.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
