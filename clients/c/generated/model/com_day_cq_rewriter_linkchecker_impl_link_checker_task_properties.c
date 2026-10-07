#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties.h"



static com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_create_internal(
    config_node_property_integer_t *scheduler_period,
    config_node_property_boolean_t *scheduler_concurrent,
    config_node_property_integer_t *good_link_test_interval,
    config_node_property_integer_t *bad_link_test_interval,
    config_node_property_integer_t *link_unused_interval,
    config_node_property_integer_t *connection_timeout
    ) {
    com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_local_var = malloc(sizeof(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_t));
    if (!com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_local_var, 0, sizeof(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_t));
    com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_local_var->_library_owned = 1;
    com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_local_var->scheduler_period = scheduler_period;
    com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_local_var->scheduler_concurrent = scheduler_concurrent;
    com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_local_var->good_link_test_interval = good_link_test_interval;
    com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_local_var->bad_link_test_interval = bad_link_test_interval;
    com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_local_var->link_unused_interval = link_unused_interval;
    com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_local_var->connection_timeout = connection_timeout;
    return com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_create(
    config_node_property_integer_t *scheduler_period,
    config_node_property_boolean_t *scheduler_concurrent,
    config_node_property_integer_t *good_link_test_interval,
    config_node_property_integer_t *bad_link_test_interval,
    config_node_property_integer_t *link_unused_interval,
    config_node_property_integer_t *connection_timeout
    ) {
    com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_t *result = com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_create_internal (
        scheduler_period,
        scheduler_concurrent,
        good_link_test_interval,
        bad_link_test_interval,
        link_unused_interval,
        connection_timeout
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_free(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties) {
    if(NULL == com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties){
        return ;
    }
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_period) {
        config_node_property_integer_free(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_period);
        com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_period = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_concurrent) {
        config_node_property_boolean_free(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_concurrent);
        com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_concurrent = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->good_link_test_interval) {
        config_node_property_integer_free(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->good_link_test_interval);
        com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->good_link_test_interval = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->bad_link_test_interval) {
        config_node_property_integer_free(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->bad_link_test_interval);
        com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->bad_link_test_interval = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->link_unused_interval) {
        config_node_property_integer_free(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->link_unused_interval);
        com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->link_unused_interval = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->connection_timeout) {
        config_node_property_integer_free(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->connection_timeout);
        com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->connection_timeout = NULL;
    }
    free(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties);
}

cJSON *com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_period
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_period) {
    cJSON *scheduler_period_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_period);
    if(scheduler_period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.period", scheduler_period_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_concurrent
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_concurrent) {
    cJSON *scheduler_concurrent_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_concurrent);
    if(scheduler_concurrent_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.concurrent", scheduler_concurrent_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->good_link_test_interval
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->good_link_test_interval) {
    cJSON *good_link_test_interval_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->good_link_test_interval);
    if(good_link_test_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "good_link_test_interval", good_link_test_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->bad_link_test_interval
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->bad_link_test_interval) {
    cJSON *bad_link_test_interval_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->bad_link_test_interval);
    if(bad_link_test_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "bad_link_test_interval", bad_link_test_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->link_unused_interval
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->link_unused_interval) {
    cJSON *link_unused_interval_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->link_unused_interval);
    if(link_unused_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "link_unused_interval", link_unused_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->connection_timeout
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->connection_timeout) {
    cJSON *connection_timeout_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->connection_timeout);
    if(connection_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "connection.timeout", connection_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_parseFromJSON(cJSON *com_day_cq_rewriter_linkchecker_impl_link_checker_task_propertiesJSON){

    com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_local_var = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_period
    config_node_property_integer_t *scheduler_period_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_concurrent
    config_node_property_boolean_t *scheduler_concurrent_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->good_link_test_interval
    config_node_property_integer_t *good_link_test_interval_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->bad_link_test_interval
    config_node_property_integer_t *bad_link_test_interval_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->link_unused_interval
    config_node_property_integer_t *link_unused_interval_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->connection_timeout
    config_node_property_integer_t *connection_timeout_local_nonprim = NULL;

    // com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_period
    cJSON *scheduler_period = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_task_propertiesJSON, "scheduler.period");
    if (cJSON_IsNull(scheduler_period)) {
        scheduler_period = NULL;
    }
    if (scheduler_period) { 
    scheduler_period_local_nonprim = config_node_property_integer_parseFromJSON(scheduler_period); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->scheduler_concurrent
    cJSON *scheduler_concurrent = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_task_propertiesJSON, "scheduler.concurrent");
    if (cJSON_IsNull(scheduler_concurrent)) {
        scheduler_concurrent = NULL;
    }
    if (scheduler_concurrent) { 
    scheduler_concurrent_local_nonprim = config_node_property_boolean_parseFromJSON(scheduler_concurrent); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->good_link_test_interval
    cJSON *good_link_test_interval = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_task_propertiesJSON, "good_link_test_interval");
    if (cJSON_IsNull(good_link_test_interval)) {
        good_link_test_interval = NULL;
    }
    if (good_link_test_interval) { 
    good_link_test_interval_local_nonprim = config_node_property_integer_parseFromJSON(good_link_test_interval); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->bad_link_test_interval
    cJSON *bad_link_test_interval = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_task_propertiesJSON, "bad_link_test_interval");
    if (cJSON_IsNull(bad_link_test_interval)) {
        bad_link_test_interval = NULL;
    }
    if (bad_link_test_interval) { 
    bad_link_test_interval_local_nonprim = config_node_property_integer_parseFromJSON(bad_link_test_interval); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->link_unused_interval
    cJSON *link_unused_interval = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_task_propertiesJSON, "link_unused_interval");
    if (cJSON_IsNull(link_unused_interval)) {
        link_unused_interval = NULL;
    }
    if (link_unused_interval) { 
    link_unused_interval_local_nonprim = config_node_property_integer_parseFromJSON(link_unused_interval); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties->connection_timeout
    cJSON *connection_timeout = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_task_propertiesJSON, "connection.timeout");
    if (cJSON_IsNull(connection_timeout)) {
        connection_timeout = NULL;
    }
    if (connection_timeout) { 
    connection_timeout_local_nonprim = config_node_property_integer_parseFromJSON(connection_timeout); //nonprimitive
    }



    com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_local_var = com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_create_internal (
        scheduler_period ? scheduler_period_local_nonprim : NULL,
        scheduler_concurrent ? scheduler_concurrent_local_nonprim : NULL,
        good_link_test_interval ? good_link_test_interval_local_nonprim : NULL,
        bad_link_test_interval ? bad_link_test_interval_local_nonprim : NULL,
        link_unused_interval ? link_unused_interval_local_nonprim : NULL,
        connection_timeout ? connection_timeout_local_nonprim : NULL
        );

    if (!com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_local_var) {
        goto end;
    }

    return com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_local_var;
end:
    if (scheduler_period_local_nonprim) {
        config_node_property_integer_free(scheduler_period_local_nonprim);
        scheduler_period_local_nonprim = NULL;
    }
    if (scheduler_concurrent_local_nonprim) {
        config_node_property_boolean_free(scheduler_concurrent_local_nonprim);
        scheduler_concurrent_local_nonprim = NULL;
    }
    if (good_link_test_interval_local_nonprim) {
        config_node_property_integer_free(good_link_test_interval_local_nonprim);
        good_link_test_interval_local_nonprim = NULL;
    }
    if (bad_link_test_interval_local_nonprim) {
        config_node_property_integer_free(bad_link_test_interval_local_nonprim);
        bad_link_test_interval_local_nonprim = NULL;
    }
    if (link_unused_interval_local_nonprim) {
        config_node_property_integer_free(link_unused_interval_local_nonprim);
        link_unused_interval_local_nonprim = NULL;
    }
    if (connection_timeout_local_nonprim) {
        config_node_property_integer_free(connection_timeout_local_nonprim);
        connection_timeout_local_nonprim = NULL;
    }
    return NULL;

}
