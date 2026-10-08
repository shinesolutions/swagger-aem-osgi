#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties.h"



static org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t *org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_create_internal(
    config_node_property_string_t *pool_name,
    config_node_property_array_t *allowed_pool_names,
    config_node_property_boolean_t *scheduler_useleaderforsingle,
    config_node_property_array_t *metrics_filters,
    config_node_property_integer_t *slow_threshold_millis
    ) {
    org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t *org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_local_var = malloc(sizeof(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t));
    if (!org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_local_var, 0, sizeof(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t));
    org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_local_var->_library_owned = 1;
    org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_local_var->pool_name = pool_name;
    org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_local_var->allowed_pool_names = allowed_pool_names;
    org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_local_var->scheduler_useleaderforsingle = scheduler_useleaderforsingle;
    org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_local_var->metrics_filters = metrics_filters;
    org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_local_var->slow_threshold_millis = slow_threshold_millis;
    return org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t *org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_create(
    config_node_property_string_t *pool_name,
    config_node_property_array_t *allowed_pool_names,
    config_node_property_boolean_t *scheduler_useleaderforsingle,
    config_node_property_array_t *metrics_filters,
    config_node_property_integer_t *slow_threshold_millis
    ) {
    org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t *result = org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_create_internal (
        pool_name,
        allowed_pool_names,
        scheduler_useleaderforsingle,
        metrics_filters,
        slow_threshold_millis
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_free(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t *org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties) {
    if(NULL == org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties){
        return ;
    }
    if(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->pool_name) {
        config_node_property_string_free(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->pool_name);
        org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->pool_name = NULL;
    }
    if (org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->allowed_pool_names) {
        config_node_property_array_free(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->allowed_pool_names);
        org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->allowed_pool_names = NULL;
    }
    if (org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->scheduler_useleaderforsingle) {
        config_node_property_boolean_free(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->scheduler_useleaderforsingle);
        org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->scheduler_useleaderforsingle = NULL;
    }
    if (org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->metrics_filters) {
        config_node_property_array_free(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->metrics_filters);
        org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->metrics_filters = NULL;
    }
    if (org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->slow_threshold_millis) {
        config_node_property_integer_free(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->slow_threshold_millis);
        org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->slow_threshold_millis = NULL;
    }
    free(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties);
}

cJSON *org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_convertToJSON(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t *org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->pool_name
    if(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->pool_name) {
    cJSON *pool_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->pool_name);
    if(pool_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "poolName", pool_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->allowed_pool_names
    if(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->allowed_pool_names) {
    cJSON *allowed_pool_names_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->allowed_pool_names);
    if(allowed_pool_names_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "allowedPoolNames", allowed_pool_names_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->scheduler_useleaderforsingle
    if(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->scheduler_useleaderforsingle) {
    cJSON *scheduler_useleaderforsingle_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->scheduler_useleaderforsingle);
    if(scheduler_useleaderforsingle_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.useleaderforsingle", scheduler_useleaderforsingle_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->metrics_filters
    if(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->metrics_filters) {
    cJSON *metrics_filters_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->metrics_filters);
    if(metrics_filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metrics.filters", metrics_filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->slow_threshold_millis
    if(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->slow_threshold_millis) {
    cJSON *slow_threshold_millis_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->slow_threshold_millis);
    if(slow_threshold_millis_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "slowThresholdMillis", slow_threshold_millis_local_JSON);
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

org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t *org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_parseFromJSON(cJSON *org_apache_sling_commons_scheduler_impl_quartz_scheduler_propertiesJSON){

    org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t *org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_local_var = NULL;

    // define the local variable for org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->pool_name
    config_node_property_string_t *pool_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->allowed_pool_names
    config_node_property_array_t *allowed_pool_names_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->scheduler_useleaderforsingle
    config_node_property_boolean_t *scheduler_useleaderforsingle_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->metrics_filters
    config_node_property_array_t *metrics_filters_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->slow_threshold_millis
    config_node_property_integer_t *slow_threshold_millis_local_nonprim = NULL;

    // org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->pool_name
    cJSON *pool_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_scheduler_impl_quartz_scheduler_propertiesJSON, "poolName");
    if (cJSON_IsNull(pool_name)) {
        pool_name = NULL;
    }
    if (pool_name) { 
    pool_name_local_nonprim = config_node_property_string_parseFromJSON(pool_name); //nonprimitive
    }

    // org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->allowed_pool_names
    cJSON *allowed_pool_names = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_scheduler_impl_quartz_scheduler_propertiesJSON, "allowedPoolNames");
    if (cJSON_IsNull(allowed_pool_names)) {
        allowed_pool_names = NULL;
    }
    if (allowed_pool_names) { 
    allowed_pool_names_local_nonprim = config_node_property_array_parseFromJSON(allowed_pool_names); //nonprimitive
    }

    // org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->scheduler_useleaderforsingle
    cJSON *scheduler_useleaderforsingle = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_scheduler_impl_quartz_scheduler_propertiesJSON, "scheduler.useleaderforsingle");
    if (cJSON_IsNull(scheduler_useleaderforsingle)) {
        scheduler_useleaderforsingle = NULL;
    }
    if (scheduler_useleaderforsingle) { 
    scheduler_useleaderforsingle_local_nonprim = config_node_property_boolean_parseFromJSON(scheduler_useleaderforsingle); //nonprimitive
    }

    // org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->metrics_filters
    cJSON *metrics_filters = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_scheduler_impl_quartz_scheduler_propertiesJSON, "metrics.filters");
    if (cJSON_IsNull(metrics_filters)) {
        metrics_filters = NULL;
    }
    if (metrics_filters) { 
    metrics_filters_local_nonprim = config_node_property_array_parseFromJSON(metrics_filters); //nonprimitive
    }

    // org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties->slow_threshold_millis
    cJSON *slow_threshold_millis = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_scheduler_impl_quartz_scheduler_propertiesJSON, "slowThresholdMillis");
    if (cJSON_IsNull(slow_threshold_millis)) {
        slow_threshold_millis = NULL;
    }
    if (slow_threshold_millis) { 
    slow_threshold_millis_local_nonprim = config_node_property_integer_parseFromJSON(slow_threshold_millis); //nonprimitive
    }



    org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_local_var = org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_create_internal (
        pool_name ? pool_name_local_nonprim : NULL,
        allowed_pool_names ? allowed_pool_names_local_nonprim : NULL,
        scheduler_useleaderforsingle ? scheduler_useleaderforsingle_local_nonprim : NULL,
        metrics_filters ? metrics_filters_local_nonprim : NULL,
        slow_threshold_millis ? slow_threshold_millis_local_nonprim : NULL
        );

    if (!org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_local_var) {
        goto end;
    }

    return org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_local_var;
end:
    if (pool_name_local_nonprim) {
        config_node_property_string_free(pool_name_local_nonprim);
        pool_name_local_nonprim = NULL;
    }
    if (allowed_pool_names_local_nonprim) {
        config_node_property_array_free(allowed_pool_names_local_nonprim);
        allowed_pool_names_local_nonprim = NULL;
    }
    if (scheduler_useleaderforsingle_local_nonprim) {
        config_node_property_boolean_free(scheduler_useleaderforsingle_local_nonprim);
        scheduler_useleaderforsingle_local_nonprim = NULL;
    }
    if (metrics_filters_local_nonprim) {
        config_node_property_array_free(metrics_filters_local_nonprim);
        metrics_filters_local_nonprim = NULL;
    }
    if (slow_threshold_millis_local_nonprim) {
        config_node_property_integer_free(slow_threshold_millis_local_nonprim);
        slow_threshold_millis_local_nonprim = NULL;
    }
    return NULL;

}
