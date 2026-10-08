#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_models_impl_model_adapter_factory_properties.h"



static org_apache_sling_models_impl_model_adapter_factory_properties_t *org_apache_sling_models_impl_model_adapter_factory_properties_create_internal(
    config_node_property_string_t *osgi_http_whiteboard_listener,
    config_node_property_string_t *osgi_http_whiteboard_context_select,
    config_node_property_integer_t *max_recursion_depth,
    config_node_property_integer_t *cleanup_job_period
    ) {
    org_apache_sling_models_impl_model_adapter_factory_properties_t *org_apache_sling_models_impl_model_adapter_factory_properties_local_var = malloc(sizeof(org_apache_sling_models_impl_model_adapter_factory_properties_t));
    if (!org_apache_sling_models_impl_model_adapter_factory_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_models_impl_model_adapter_factory_properties_local_var, 0, sizeof(org_apache_sling_models_impl_model_adapter_factory_properties_t));
    org_apache_sling_models_impl_model_adapter_factory_properties_local_var->_library_owned = 1;
    org_apache_sling_models_impl_model_adapter_factory_properties_local_var->osgi_http_whiteboard_listener = osgi_http_whiteboard_listener;
    org_apache_sling_models_impl_model_adapter_factory_properties_local_var->osgi_http_whiteboard_context_select = osgi_http_whiteboard_context_select;
    org_apache_sling_models_impl_model_adapter_factory_properties_local_var->max_recursion_depth = max_recursion_depth;
    org_apache_sling_models_impl_model_adapter_factory_properties_local_var->cleanup_job_period = cleanup_job_period;
    return org_apache_sling_models_impl_model_adapter_factory_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_models_impl_model_adapter_factory_properties_t *org_apache_sling_models_impl_model_adapter_factory_properties_create(
    config_node_property_string_t *osgi_http_whiteboard_listener,
    config_node_property_string_t *osgi_http_whiteboard_context_select,
    config_node_property_integer_t *max_recursion_depth,
    config_node_property_integer_t *cleanup_job_period
    ) {
    org_apache_sling_models_impl_model_adapter_factory_properties_t *result = org_apache_sling_models_impl_model_adapter_factory_properties_create_internal (
        osgi_http_whiteboard_listener,
        osgi_http_whiteboard_context_select,
        max_recursion_depth,
        cleanup_job_period
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_models_impl_model_adapter_factory_properties_free(org_apache_sling_models_impl_model_adapter_factory_properties_t *org_apache_sling_models_impl_model_adapter_factory_properties) {
    if(NULL == org_apache_sling_models_impl_model_adapter_factory_properties){
        return ;
    }
    if(org_apache_sling_models_impl_model_adapter_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_models_impl_model_adapter_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_listener) {
        config_node_property_string_free(org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_listener);
        org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_listener = NULL;
    }
    if (org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_context_select) {
        config_node_property_string_free(org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_context_select);
        org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_context_select = NULL;
    }
    if (org_apache_sling_models_impl_model_adapter_factory_properties->max_recursion_depth) {
        config_node_property_integer_free(org_apache_sling_models_impl_model_adapter_factory_properties->max_recursion_depth);
        org_apache_sling_models_impl_model_adapter_factory_properties->max_recursion_depth = NULL;
    }
    if (org_apache_sling_models_impl_model_adapter_factory_properties->cleanup_job_period) {
        config_node_property_integer_free(org_apache_sling_models_impl_model_adapter_factory_properties->cleanup_job_period);
        org_apache_sling_models_impl_model_adapter_factory_properties->cleanup_job_period = NULL;
    }
    free(org_apache_sling_models_impl_model_adapter_factory_properties);
}

cJSON *org_apache_sling_models_impl_model_adapter_factory_properties_convertToJSON(org_apache_sling_models_impl_model_adapter_factory_properties_t *org_apache_sling_models_impl_model_adapter_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_listener
    if(org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_listener) {
    cJSON *osgi_http_whiteboard_listener_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_listener);
    if(osgi_http_whiteboard_listener_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "osgi.http.whiteboard.listener", osgi_http_whiteboard_listener_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_context_select
    if(org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_context_select) {
    cJSON *osgi_http_whiteboard_context_select_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_context_select);
    if(osgi_http_whiteboard_context_select_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "osgi.http.whiteboard.context.select", osgi_http_whiteboard_context_select_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_models_impl_model_adapter_factory_properties->max_recursion_depth
    if(org_apache_sling_models_impl_model_adapter_factory_properties->max_recursion_depth) {
    cJSON *max_recursion_depth_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_models_impl_model_adapter_factory_properties->max_recursion_depth);
    if(max_recursion_depth_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "max.recursion.depth", max_recursion_depth_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_models_impl_model_adapter_factory_properties->cleanup_job_period
    if(org_apache_sling_models_impl_model_adapter_factory_properties->cleanup_job_period) {
    cJSON *cleanup_job_period_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_models_impl_model_adapter_factory_properties->cleanup_job_period);
    if(cleanup_job_period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cleanup.job.period", cleanup_job_period_local_JSON);
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

org_apache_sling_models_impl_model_adapter_factory_properties_t *org_apache_sling_models_impl_model_adapter_factory_properties_parseFromJSON(cJSON *org_apache_sling_models_impl_model_adapter_factory_propertiesJSON){

    org_apache_sling_models_impl_model_adapter_factory_properties_t *org_apache_sling_models_impl_model_adapter_factory_properties_local_var = NULL;

    // define the local variable for org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_listener
    config_node_property_string_t *osgi_http_whiteboard_listener_local_nonprim = NULL;

    // define the local variable for org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_context_select
    config_node_property_string_t *osgi_http_whiteboard_context_select_local_nonprim = NULL;

    // define the local variable for org_apache_sling_models_impl_model_adapter_factory_properties->max_recursion_depth
    config_node_property_integer_t *max_recursion_depth_local_nonprim = NULL;

    // define the local variable for org_apache_sling_models_impl_model_adapter_factory_properties->cleanup_job_period
    config_node_property_integer_t *cleanup_job_period_local_nonprim = NULL;

    // org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_listener
    cJSON *osgi_http_whiteboard_listener = cJSON_GetObjectItemCaseSensitive(org_apache_sling_models_impl_model_adapter_factory_propertiesJSON, "osgi.http.whiteboard.listener");
    if (cJSON_IsNull(osgi_http_whiteboard_listener)) {
        osgi_http_whiteboard_listener = NULL;
    }
    if (osgi_http_whiteboard_listener) { 
    osgi_http_whiteboard_listener_local_nonprim = config_node_property_string_parseFromJSON(osgi_http_whiteboard_listener); //nonprimitive
    }

    // org_apache_sling_models_impl_model_adapter_factory_properties->osgi_http_whiteboard_context_select
    cJSON *osgi_http_whiteboard_context_select = cJSON_GetObjectItemCaseSensitive(org_apache_sling_models_impl_model_adapter_factory_propertiesJSON, "osgi.http.whiteboard.context.select");
    if (cJSON_IsNull(osgi_http_whiteboard_context_select)) {
        osgi_http_whiteboard_context_select = NULL;
    }
    if (osgi_http_whiteboard_context_select) { 
    osgi_http_whiteboard_context_select_local_nonprim = config_node_property_string_parseFromJSON(osgi_http_whiteboard_context_select); //nonprimitive
    }

    // org_apache_sling_models_impl_model_adapter_factory_properties->max_recursion_depth
    cJSON *max_recursion_depth = cJSON_GetObjectItemCaseSensitive(org_apache_sling_models_impl_model_adapter_factory_propertiesJSON, "max.recursion.depth");
    if (cJSON_IsNull(max_recursion_depth)) {
        max_recursion_depth = NULL;
    }
    if (max_recursion_depth) { 
    max_recursion_depth_local_nonprim = config_node_property_integer_parseFromJSON(max_recursion_depth); //nonprimitive
    }

    // org_apache_sling_models_impl_model_adapter_factory_properties->cleanup_job_period
    cJSON *cleanup_job_period = cJSON_GetObjectItemCaseSensitive(org_apache_sling_models_impl_model_adapter_factory_propertiesJSON, "cleanup.job.period");
    if (cJSON_IsNull(cleanup_job_period)) {
        cleanup_job_period = NULL;
    }
    if (cleanup_job_period) { 
    cleanup_job_period_local_nonprim = config_node_property_integer_parseFromJSON(cleanup_job_period); //nonprimitive
    }



    org_apache_sling_models_impl_model_adapter_factory_properties_local_var = org_apache_sling_models_impl_model_adapter_factory_properties_create_internal (
        osgi_http_whiteboard_listener ? osgi_http_whiteboard_listener_local_nonprim : NULL,
        osgi_http_whiteboard_context_select ? osgi_http_whiteboard_context_select_local_nonprim : NULL,
        max_recursion_depth ? max_recursion_depth_local_nonprim : NULL,
        cleanup_job_period ? cleanup_job_period_local_nonprim : NULL
        );

    if (!org_apache_sling_models_impl_model_adapter_factory_properties_local_var) {
        goto end;
    }

    return org_apache_sling_models_impl_model_adapter_factory_properties_local_var;
end:
    if (osgi_http_whiteboard_listener_local_nonprim) {
        config_node_property_string_free(osgi_http_whiteboard_listener_local_nonprim);
        osgi_http_whiteboard_listener_local_nonprim = NULL;
    }
    if (osgi_http_whiteboard_context_select_local_nonprim) {
        config_node_property_string_free(osgi_http_whiteboard_context_select_local_nonprim);
        osgi_http_whiteboard_context_select_local_nonprim = NULL;
    }
    if (max_recursion_depth_local_nonprim) {
        config_node_property_integer_free(max_recursion_depth_local_nonprim);
        max_recursion_depth_local_nonprim = NULL;
    }
    if (cleanup_job_period_local_nonprim) {
        config_node_property_integer_free(cleanup_job_period_local_nonprim);
        cleanup_job_period_local_nonprim = NULL;
    }
    return NULL;

}
