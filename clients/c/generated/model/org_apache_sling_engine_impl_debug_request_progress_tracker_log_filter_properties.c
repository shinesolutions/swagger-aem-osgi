#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties.h"



static org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_t *org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_create_internal(
    config_node_property_array_t *extensions,
    config_node_property_integer_t *min_duration_ms,
    config_node_property_integer_t *max_duration_ms,
    config_node_property_boolean_t *compact_log_format
    ) {
    org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_t *org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_local_var = malloc(sizeof(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_t));
    if (!org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_local_var, 0, sizeof(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_t));
    org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_local_var->_library_owned = 1;
    org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_local_var->extensions = extensions;
    org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_local_var->min_duration_ms = min_duration_ms;
    org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_local_var->max_duration_ms = max_duration_ms;
    org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_local_var->compact_log_format = compact_log_format;
    return org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_t *org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_create(
    config_node_property_array_t *extensions,
    config_node_property_integer_t *min_duration_ms,
    config_node_property_integer_t *max_duration_ms,
    config_node_property_boolean_t *compact_log_format
    ) {
    org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_t *result = org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_create_internal (
        extensions,
        min_duration_ms,
        max_duration_ms,
        compact_log_format
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_free(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_t *org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties) {
    if(NULL == org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties){
        return ;
    }
    if(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->extensions) {
        config_node_property_array_free(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->extensions);
        org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->extensions = NULL;
    }
    if (org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->min_duration_ms) {
        config_node_property_integer_free(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->min_duration_ms);
        org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->min_duration_ms = NULL;
    }
    if (org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->max_duration_ms) {
        config_node_property_integer_free(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->max_duration_ms);
        org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->max_duration_ms = NULL;
    }
    if (org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->compact_log_format) {
        config_node_property_boolean_free(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->compact_log_format);
        org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->compact_log_format = NULL;
    }
    free(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties);
}

cJSON *org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_convertToJSON(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_t *org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->extensions
    if(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->extensions) {
    cJSON *extensions_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->extensions);
    if(extensions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "extensions", extensions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->min_duration_ms
    if(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->min_duration_ms) {
    cJSON *min_duration_ms_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->min_duration_ms);
    if(min_duration_ms_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "minDurationMs", min_duration_ms_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->max_duration_ms
    if(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->max_duration_ms) {
    cJSON *max_duration_ms_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->max_duration_ms);
    if(max_duration_ms_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxDurationMs", max_duration_ms_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->compact_log_format
    if(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->compact_log_format) {
    cJSON *compact_log_format_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->compact_log_format);
    if(compact_log_format_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "compactLogFormat", compact_log_format_local_JSON);
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

org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_t *org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_parseFromJSON(cJSON *org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_propertiesJSON){

    org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_t *org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_local_var = NULL;

    // define the local variable for org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->extensions
    config_node_property_array_t *extensions_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->min_duration_ms
    config_node_property_integer_t *min_duration_ms_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->max_duration_ms
    config_node_property_integer_t *max_duration_ms_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->compact_log_format
    config_node_property_boolean_t *compact_log_format_local_nonprim = NULL;

    // org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->extensions
    cJSON *extensions = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_propertiesJSON, "extensions");
    if (cJSON_IsNull(extensions)) {
        extensions = NULL;
    }
    if (extensions) { 
    extensions_local_nonprim = config_node_property_array_parseFromJSON(extensions); //nonprimitive
    }

    // org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->min_duration_ms
    cJSON *min_duration_ms = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_propertiesJSON, "minDurationMs");
    if (cJSON_IsNull(min_duration_ms)) {
        min_duration_ms = NULL;
    }
    if (min_duration_ms) { 
    min_duration_ms_local_nonprim = config_node_property_integer_parseFromJSON(min_duration_ms); //nonprimitive
    }

    // org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->max_duration_ms
    cJSON *max_duration_ms = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_propertiesJSON, "maxDurationMs");
    if (cJSON_IsNull(max_duration_ms)) {
        max_duration_ms = NULL;
    }
    if (max_duration_ms) { 
    max_duration_ms_local_nonprim = config_node_property_integer_parseFromJSON(max_duration_ms); //nonprimitive
    }

    // org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties->compact_log_format
    cJSON *compact_log_format = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_propertiesJSON, "compactLogFormat");
    if (cJSON_IsNull(compact_log_format)) {
        compact_log_format = NULL;
    }
    if (compact_log_format) { 
    compact_log_format_local_nonprim = config_node_property_boolean_parseFromJSON(compact_log_format); //nonprimitive
    }



    org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_local_var = org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_create_internal (
        extensions ? extensions_local_nonprim : NULL,
        min_duration_ms ? min_duration_ms_local_nonprim : NULL,
        max_duration_ms ? max_duration_ms_local_nonprim : NULL,
        compact_log_format ? compact_log_format_local_nonprim : NULL
        );

    if (!org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_local_var) {
        goto end;
    }

    return org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties_local_var;
end:
    if (extensions_local_nonprim) {
        config_node_property_array_free(extensions_local_nonprim);
        extensions_local_nonprim = NULL;
    }
    if (min_duration_ms_local_nonprim) {
        config_node_property_integer_free(min_duration_ms_local_nonprim);
        min_duration_ms_local_nonprim = NULL;
    }
    if (max_duration_ms_local_nonprim) {
        config_node_property_integer_free(max_duration_ms_local_nonprim);
        max_duration_ms_local_nonprim = NULL;
    }
    if (compact_log_format_local_nonprim) {
        config_node_property_boolean_free(compact_log_format_local_nonprim);
        compact_log_format_local_nonprim = NULL;
    }
    return NULL;

}
