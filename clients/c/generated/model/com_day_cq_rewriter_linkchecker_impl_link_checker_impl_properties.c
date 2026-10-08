#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties.h"



static com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_create_internal(
    config_node_property_integer_t *scheduler_period,
    config_node_property_boolean_t *scheduler_concurrent,
    config_node_property_integer_t *service_bad_link_tolerance_interval,
    config_node_property_array_t *service_check_override_patterns,
    config_node_property_boolean_t *service_cache_broken_internal_links,
    config_node_property_array_t *service_special_link_prefix,
    config_node_property_array_t *service_special_link_patterns
    ) {
    com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var = malloc(sizeof(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t));
    if (!com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var, 0, sizeof(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t));
    com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var->_library_owned = 1;
    com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var->scheduler_period = scheduler_period;
    com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var->scheduler_concurrent = scheduler_concurrent;
    com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var->service_bad_link_tolerance_interval = service_bad_link_tolerance_interval;
    com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var->service_check_override_patterns = service_check_override_patterns;
    com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var->service_cache_broken_internal_links = service_cache_broken_internal_links;
    com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var->service_special_link_prefix = service_special_link_prefix;
    com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var->service_special_link_patterns = service_special_link_patterns;
    return com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_create(
    config_node_property_integer_t *scheduler_period,
    config_node_property_boolean_t *scheduler_concurrent,
    config_node_property_integer_t *service_bad_link_tolerance_interval,
    config_node_property_array_t *service_check_override_patterns,
    config_node_property_boolean_t *service_cache_broken_internal_links,
    config_node_property_array_t *service_special_link_prefix,
    config_node_property_array_t *service_special_link_patterns
    ) {
    com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t *result = com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_create_internal (
        scheduler_period,
        scheduler_concurrent,
        service_bad_link_tolerance_interval,
        service_check_override_patterns,
        service_cache_broken_internal_links,
        service_special_link_prefix,
        service_special_link_patterns
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_free(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties) {
    if(NULL == com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties){
        return ;
    }
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_period) {
        config_node_property_integer_free(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_period);
        com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_period = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_concurrent) {
        config_node_property_boolean_free(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_concurrent);
        com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_concurrent = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_bad_link_tolerance_interval) {
        config_node_property_integer_free(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_bad_link_tolerance_interval);
        com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_bad_link_tolerance_interval = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_check_override_patterns) {
        config_node_property_array_free(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_check_override_patterns);
        com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_check_override_patterns = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_cache_broken_internal_links) {
        config_node_property_boolean_free(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_cache_broken_internal_links);
        com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_cache_broken_internal_links = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_prefix) {
        config_node_property_array_free(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_prefix);
        com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_prefix = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_patterns) {
        config_node_property_array_free(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_patterns);
        com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_patterns = NULL;
    }
    free(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties);
}

cJSON *com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_period
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_period) {
    cJSON *scheduler_period_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_period);
    if(scheduler_period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.period", scheduler_period_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_concurrent
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_concurrent) {
    cJSON *scheduler_concurrent_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_concurrent);
    if(scheduler_concurrent_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.concurrent", scheduler_concurrent_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_bad_link_tolerance_interval
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_bad_link_tolerance_interval) {
    cJSON *service_bad_link_tolerance_interval_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_bad_link_tolerance_interval);
    if(service_bad_link_tolerance_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.bad_link_tolerance_interval", service_bad_link_tolerance_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_check_override_patterns
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_check_override_patterns) {
    cJSON *service_check_override_patterns_local_JSON = config_node_property_array_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_check_override_patterns);
    if(service_check_override_patterns_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.check_override_patterns", service_check_override_patterns_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_cache_broken_internal_links
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_cache_broken_internal_links) {
    cJSON *service_cache_broken_internal_links_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_cache_broken_internal_links);
    if(service_cache_broken_internal_links_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.cache_broken_internal_links", service_cache_broken_internal_links_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_prefix
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_prefix) {
    cJSON *service_special_link_prefix_local_JSON = config_node_property_array_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_prefix);
    if(service_special_link_prefix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.special_link_prefix", service_special_link_prefix_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_patterns
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_patterns) {
    cJSON *service_special_link_patterns_local_JSON = config_node_property_array_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_patterns);
    if(service_special_link_patterns_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.special_link_patterns", service_special_link_patterns_local_JSON);
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

com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_parseFromJSON(cJSON *com_day_cq_rewriter_linkchecker_impl_link_checker_impl_propertiesJSON){

    com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_period
    config_node_property_integer_t *scheduler_period_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_concurrent
    config_node_property_boolean_t *scheduler_concurrent_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_bad_link_tolerance_interval
    config_node_property_integer_t *service_bad_link_tolerance_interval_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_check_override_patterns
    config_node_property_array_t *service_check_override_patterns_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_cache_broken_internal_links
    config_node_property_boolean_t *service_cache_broken_internal_links_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_prefix
    config_node_property_array_t *service_special_link_prefix_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_patterns
    config_node_property_array_t *service_special_link_patterns_local_nonprim = NULL;

    // com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_period
    cJSON *scheduler_period = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_propertiesJSON, "scheduler.period");
    if (cJSON_IsNull(scheduler_period)) {
        scheduler_period = NULL;
    }
    if (scheduler_period) { 
    scheduler_period_local_nonprim = config_node_property_integer_parseFromJSON(scheduler_period); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->scheduler_concurrent
    cJSON *scheduler_concurrent = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_propertiesJSON, "scheduler.concurrent");
    if (cJSON_IsNull(scheduler_concurrent)) {
        scheduler_concurrent = NULL;
    }
    if (scheduler_concurrent) { 
    scheduler_concurrent_local_nonprim = config_node_property_boolean_parseFromJSON(scheduler_concurrent); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_bad_link_tolerance_interval
    cJSON *service_bad_link_tolerance_interval = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_propertiesJSON, "service.bad_link_tolerance_interval");
    if (cJSON_IsNull(service_bad_link_tolerance_interval)) {
        service_bad_link_tolerance_interval = NULL;
    }
    if (service_bad_link_tolerance_interval) { 
    service_bad_link_tolerance_interval_local_nonprim = config_node_property_integer_parseFromJSON(service_bad_link_tolerance_interval); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_check_override_patterns
    cJSON *service_check_override_patterns = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_propertiesJSON, "service.check_override_patterns");
    if (cJSON_IsNull(service_check_override_patterns)) {
        service_check_override_patterns = NULL;
    }
    if (service_check_override_patterns) { 
    service_check_override_patterns_local_nonprim = config_node_property_array_parseFromJSON(service_check_override_patterns); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_cache_broken_internal_links
    cJSON *service_cache_broken_internal_links = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_propertiesJSON, "service.cache_broken_internal_links");
    if (cJSON_IsNull(service_cache_broken_internal_links)) {
        service_cache_broken_internal_links = NULL;
    }
    if (service_cache_broken_internal_links) { 
    service_cache_broken_internal_links_local_nonprim = config_node_property_boolean_parseFromJSON(service_cache_broken_internal_links); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_prefix
    cJSON *service_special_link_prefix = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_propertiesJSON, "service.special_link_prefix");
    if (cJSON_IsNull(service_special_link_prefix)) {
        service_special_link_prefix = NULL;
    }
    if (service_special_link_prefix) { 
    service_special_link_prefix_local_nonprim = config_node_property_array_parseFromJSON(service_special_link_prefix); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties->service_special_link_patterns
    cJSON *service_special_link_patterns = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_propertiesJSON, "service.special_link_patterns");
    if (cJSON_IsNull(service_special_link_patterns)) {
        service_special_link_patterns = NULL;
    }
    if (service_special_link_patterns) { 
    service_special_link_patterns_local_nonprim = config_node_property_array_parseFromJSON(service_special_link_patterns); //nonprimitive
    }



    com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var = com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_create_internal (
        scheduler_period ? scheduler_period_local_nonprim : NULL,
        scheduler_concurrent ? scheduler_concurrent_local_nonprim : NULL,
        service_bad_link_tolerance_interval ? service_bad_link_tolerance_interval_local_nonprim : NULL,
        service_check_override_patterns ? service_check_override_patterns_local_nonprim : NULL,
        service_cache_broken_internal_links ? service_cache_broken_internal_links_local_nonprim : NULL,
        service_special_link_prefix ? service_special_link_prefix_local_nonprim : NULL,
        service_special_link_patterns ? service_special_link_patterns_local_nonprim : NULL
        );

    if (!com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_local_var;
end:
    if (scheduler_period_local_nonprim) {
        config_node_property_integer_free(scheduler_period_local_nonprim);
        scheduler_period_local_nonprim = NULL;
    }
    if (scheduler_concurrent_local_nonprim) {
        config_node_property_boolean_free(scheduler_concurrent_local_nonprim);
        scheduler_concurrent_local_nonprim = NULL;
    }
    if (service_bad_link_tolerance_interval_local_nonprim) {
        config_node_property_integer_free(service_bad_link_tolerance_interval_local_nonprim);
        service_bad_link_tolerance_interval_local_nonprim = NULL;
    }
    if (service_check_override_patterns_local_nonprim) {
        config_node_property_array_free(service_check_override_patterns_local_nonprim);
        service_check_override_patterns_local_nonprim = NULL;
    }
    if (service_cache_broken_internal_links_local_nonprim) {
        config_node_property_boolean_free(service_cache_broken_internal_links_local_nonprim);
        service_cache_broken_internal_links_local_nonprim = NULL;
    }
    if (service_special_link_prefix_local_nonprim) {
        config_node_property_array_free(service_special_link_prefix_local_nonprim);
        service_special_link_prefix_local_nonprim = NULL;
    }
    if (service_special_link_patterns_local_nonprim) {
        config_node_property_array_free(service_special_link_patterns_local_nonprim);
        service_special_link_patterns_local_nonprim = NULL;
    }
    return NULL;

}
