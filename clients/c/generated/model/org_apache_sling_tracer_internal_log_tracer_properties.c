#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_tracer_internal_log_tracer_properties.h"



static org_apache_sling_tracer_internal_log_tracer_properties_t *org_apache_sling_tracer_internal_log_tracer_properties_create_internal(
    config_node_property_array_t *tracer_sets,
    config_node_property_boolean_t *enabled,
    config_node_property_boolean_t *servlet_enabled,
    config_node_property_integer_t *recording_cache_size_in_mb,
    config_node_property_integer_t *recording_cache_duration_in_secs,
    config_node_property_boolean_t *recording_compression_enabled,
    config_node_property_boolean_t *gzip_response
    ) {
    org_apache_sling_tracer_internal_log_tracer_properties_t *org_apache_sling_tracer_internal_log_tracer_properties_local_var = malloc(sizeof(org_apache_sling_tracer_internal_log_tracer_properties_t));
    if (!org_apache_sling_tracer_internal_log_tracer_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_tracer_internal_log_tracer_properties_local_var, 0, sizeof(org_apache_sling_tracer_internal_log_tracer_properties_t));
    org_apache_sling_tracer_internal_log_tracer_properties_local_var->_library_owned = 1;
    org_apache_sling_tracer_internal_log_tracer_properties_local_var->tracer_sets = tracer_sets;
    org_apache_sling_tracer_internal_log_tracer_properties_local_var->enabled = enabled;
    org_apache_sling_tracer_internal_log_tracer_properties_local_var->servlet_enabled = servlet_enabled;
    org_apache_sling_tracer_internal_log_tracer_properties_local_var->recording_cache_size_in_mb = recording_cache_size_in_mb;
    org_apache_sling_tracer_internal_log_tracer_properties_local_var->recording_cache_duration_in_secs = recording_cache_duration_in_secs;
    org_apache_sling_tracer_internal_log_tracer_properties_local_var->recording_compression_enabled = recording_compression_enabled;
    org_apache_sling_tracer_internal_log_tracer_properties_local_var->gzip_response = gzip_response;
    return org_apache_sling_tracer_internal_log_tracer_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_tracer_internal_log_tracer_properties_t *org_apache_sling_tracer_internal_log_tracer_properties_create(
    config_node_property_array_t *tracer_sets,
    config_node_property_boolean_t *enabled,
    config_node_property_boolean_t *servlet_enabled,
    config_node_property_integer_t *recording_cache_size_in_mb,
    config_node_property_integer_t *recording_cache_duration_in_secs,
    config_node_property_boolean_t *recording_compression_enabled,
    config_node_property_boolean_t *gzip_response
    ) {
    org_apache_sling_tracer_internal_log_tracer_properties_t *result = org_apache_sling_tracer_internal_log_tracer_properties_create_internal (
        tracer_sets,
        enabled,
        servlet_enabled,
        recording_cache_size_in_mb,
        recording_cache_duration_in_secs,
        recording_compression_enabled,
        gzip_response
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_tracer_internal_log_tracer_properties_free(org_apache_sling_tracer_internal_log_tracer_properties_t *org_apache_sling_tracer_internal_log_tracer_properties) {
    if(NULL == org_apache_sling_tracer_internal_log_tracer_properties){
        return ;
    }
    if(org_apache_sling_tracer_internal_log_tracer_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_tracer_internal_log_tracer_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_tracer_internal_log_tracer_properties->tracer_sets) {
        config_node_property_array_free(org_apache_sling_tracer_internal_log_tracer_properties->tracer_sets);
        org_apache_sling_tracer_internal_log_tracer_properties->tracer_sets = NULL;
    }
    if (org_apache_sling_tracer_internal_log_tracer_properties->enabled) {
        config_node_property_boolean_free(org_apache_sling_tracer_internal_log_tracer_properties->enabled);
        org_apache_sling_tracer_internal_log_tracer_properties->enabled = NULL;
    }
    if (org_apache_sling_tracer_internal_log_tracer_properties->servlet_enabled) {
        config_node_property_boolean_free(org_apache_sling_tracer_internal_log_tracer_properties->servlet_enabled);
        org_apache_sling_tracer_internal_log_tracer_properties->servlet_enabled = NULL;
    }
    if (org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_size_in_mb) {
        config_node_property_integer_free(org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_size_in_mb);
        org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_size_in_mb = NULL;
    }
    if (org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_duration_in_secs) {
        config_node_property_integer_free(org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_duration_in_secs);
        org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_duration_in_secs = NULL;
    }
    if (org_apache_sling_tracer_internal_log_tracer_properties->recording_compression_enabled) {
        config_node_property_boolean_free(org_apache_sling_tracer_internal_log_tracer_properties->recording_compression_enabled);
        org_apache_sling_tracer_internal_log_tracer_properties->recording_compression_enabled = NULL;
    }
    if (org_apache_sling_tracer_internal_log_tracer_properties->gzip_response) {
        config_node_property_boolean_free(org_apache_sling_tracer_internal_log_tracer_properties->gzip_response);
        org_apache_sling_tracer_internal_log_tracer_properties->gzip_response = NULL;
    }
    free(org_apache_sling_tracer_internal_log_tracer_properties);
}

cJSON *org_apache_sling_tracer_internal_log_tracer_properties_convertToJSON(org_apache_sling_tracer_internal_log_tracer_properties_t *org_apache_sling_tracer_internal_log_tracer_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_tracer_internal_log_tracer_properties->tracer_sets
    if(org_apache_sling_tracer_internal_log_tracer_properties->tracer_sets) {
    cJSON *tracer_sets_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_tracer_internal_log_tracer_properties->tracer_sets);
    if(tracer_sets_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracerSets", tracer_sets_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_tracer_internal_log_tracer_properties->enabled
    if(org_apache_sling_tracer_internal_log_tracer_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_tracer_internal_log_tracer_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_tracer_internal_log_tracer_properties->servlet_enabled
    if(org_apache_sling_tracer_internal_log_tracer_properties->servlet_enabled) {
    cJSON *servlet_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_tracer_internal_log_tracer_properties->servlet_enabled);
    if(servlet_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "servletEnabled", servlet_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_size_in_mb
    if(org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_size_in_mb) {
    cJSON *recording_cache_size_in_mb_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_size_in_mb);
    if(recording_cache_size_in_mb_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "recordingCacheSizeInMB", recording_cache_size_in_mb_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_duration_in_secs
    if(org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_duration_in_secs) {
    cJSON *recording_cache_duration_in_secs_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_duration_in_secs);
    if(recording_cache_duration_in_secs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "recordingCacheDurationInSecs", recording_cache_duration_in_secs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_tracer_internal_log_tracer_properties->recording_compression_enabled
    if(org_apache_sling_tracer_internal_log_tracer_properties->recording_compression_enabled) {
    cJSON *recording_compression_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_tracer_internal_log_tracer_properties->recording_compression_enabled);
    if(recording_compression_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "recordingCompressionEnabled", recording_compression_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_tracer_internal_log_tracer_properties->gzip_response
    if(org_apache_sling_tracer_internal_log_tracer_properties->gzip_response) {
    cJSON *gzip_response_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_tracer_internal_log_tracer_properties->gzip_response);
    if(gzip_response_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "gzipResponse", gzip_response_local_JSON);
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

org_apache_sling_tracer_internal_log_tracer_properties_t *org_apache_sling_tracer_internal_log_tracer_properties_parseFromJSON(cJSON *org_apache_sling_tracer_internal_log_tracer_propertiesJSON){

    org_apache_sling_tracer_internal_log_tracer_properties_t *org_apache_sling_tracer_internal_log_tracer_properties_local_var = NULL;

    // define the local variable for org_apache_sling_tracer_internal_log_tracer_properties->tracer_sets
    config_node_property_array_t *tracer_sets_local_nonprim = NULL;

    // define the local variable for org_apache_sling_tracer_internal_log_tracer_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_tracer_internal_log_tracer_properties->servlet_enabled
    config_node_property_boolean_t *servlet_enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_size_in_mb
    config_node_property_integer_t *recording_cache_size_in_mb_local_nonprim = NULL;

    // define the local variable for org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_duration_in_secs
    config_node_property_integer_t *recording_cache_duration_in_secs_local_nonprim = NULL;

    // define the local variable for org_apache_sling_tracer_internal_log_tracer_properties->recording_compression_enabled
    config_node_property_boolean_t *recording_compression_enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_tracer_internal_log_tracer_properties->gzip_response
    config_node_property_boolean_t *gzip_response_local_nonprim = NULL;

    // org_apache_sling_tracer_internal_log_tracer_properties->tracer_sets
    cJSON *tracer_sets = cJSON_GetObjectItemCaseSensitive(org_apache_sling_tracer_internal_log_tracer_propertiesJSON, "tracerSets");
    if (cJSON_IsNull(tracer_sets)) {
        tracer_sets = NULL;
    }
    if (tracer_sets) { 
    tracer_sets_local_nonprim = config_node_property_array_parseFromJSON(tracer_sets); //nonprimitive
    }

    // org_apache_sling_tracer_internal_log_tracer_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_tracer_internal_log_tracer_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }

    // org_apache_sling_tracer_internal_log_tracer_properties->servlet_enabled
    cJSON *servlet_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_tracer_internal_log_tracer_propertiesJSON, "servletEnabled");
    if (cJSON_IsNull(servlet_enabled)) {
        servlet_enabled = NULL;
    }
    if (servlet_enabled) { 
    servlet_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(servlet_enabled); //nonprimitive
    }

    // org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_size_in_mb
    cJSON *recording_cache_size_in_mb = cJSON_GetObjectItemCaseSensitive(org_apache_sling_tracer_internal_log_tracer_propertiesJSON, "recordingCacheSizeInMB");
    if (cJSON_IsNull(recording_cache_size_in_mb)) {
        recording_cache_size_in_mb = NULL;
    }
    if (recording_cache_size_in_mb) { 
    recording_cache_size_in_mb_local_nonprim = config_node_property_integer_parseFromJSON(recording_cache_size_in_mb); //nonprimitive
    }

    // org_apache_sling_tracer_internal_log_tracer_properties->recording_cache_duration_in_secs
    cJSON *recording_cache_duration_in_secs = cJSON_GetObjectItemCaseSensitive(org_apache_sling_tracer_internal_log_tracer_propertiesJSON, "recordingCacheDurationInSecs");
    if (cJSON_IsNull(recording_cache_duration_in_secs)) {
        recording_cache_duration_in_secs = NULL;
    }
    if (recording_cache_duration_in_secs) { 
    recording_cache_duration_in_secs_local_nonprim = config_node_property_integer_parseFromJSON(recording_cache_duration_in_secs); //nonprimitive
    }

    // org_apache_sling_tracer_internal_log_tracer_properties->recording_compression_enabled
    cJSON *recording_compression_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_tracer_internal_log_tracer_propertiesJSON, "recordingCompressionEnabled");
    if (cJSON_IsNull(recording_compression_enabled)) {
        recording_compression_enabled = NULL;
    }
    if (recording_compression_enabled) { 
    recording_compression_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(recording_compression_enabled); //nonprimitive
    }

    // org_apache_sling_tracer_internal_log_tracer_properties->gzip_response
    cJSON *gzip_response = cJSON_GetObjectItemCaseSensitive(org_apache_sling_tracer_internal_log_tracer_propertiesJSON, "gzipResponse");
    if (cJSON_IsNull(gzip_response)) {
        gzip_response = NULL;
    }
    if (gzip_response) { 
    gzip_response_local_nonprim = config_node_property_boolean_parseFromJSON(gzip_response); //nonprimitive
    }



    org_apache_sling_tracer_internal_log_tracer_properties_local_var = org_apache_sling_tracer_internal_log_tracer_properties_create_internal (
        tracer_sets ? tracer_sets_local_nonprim : NULL,
        enabled ? enabled_local_nonprim : NULL,
        servlet_enabled ? servlet_enabled_local_nonprim : NULL,
        recording_cache_size_in_mb ? recording_cache_size_in_mb_local_nonprim : NULL,
        recording_cache_duration_in_secs ? recording_cache_duration_in_secs_local_nonprim : NULL,
        recording_compression_enabled ? recording_compression_enabled_local_nonprim : NULL,
        gzip_response ? gzip_response_local_nonprim : NULL
        );

    if (!org_apache_sling_tracer_internal_log_tracer_properties_local_var) {
        goto end;
    }

    return org_apache_sling_tracer_internal_log_tracer_properties_local_var;
end:
    if (tracer_sets_local_nonprim) {
        config_node_property_array_free(tracer_sets_local_nonprim);
        tracer_sets_local_nonprim = NULL;
    }
    if (enabled_local_nonprim) {
        config_node_property_boolean_free(enabled_local_nonprim);
        enabled_local_nonprim = NULL;
    }
    if (servlet_enabled_local_nonprim) {
        config_node_property_boolean_free(servlet_enabled_local_nonprim);
        servlet_enabled_local_nonprim = NULL;
    }
    if (recording_cache_size_in_mb_local_nonprim) {
        config_node_property_integer_free(recording_cache_size_in_mb_local_nonprim);
        recording_cache_size_in_mb_local_nonprim = NULL;
    }
    if (recording_cache_duration_in_secs_local_nonprim) {
        config_node_property_integer_free(recording_cache_duration_in_secs_local_nonprim);
        recording_cache_duration_in_secs_local_nonprim = NULL;
    }
    if (recording_compression_enabled_local_nonprim) {
        config_node_property_boolean_free(recording_compression_enabled_local_nonprim);
        recording_compression_enabled_local_nonprim = NULL;
    }
    if (gzip_response_local_nonprim) {
        config_node_property_boolean_free(gzip_response_local_nonprim);
        gzip_response_local_nonprim = NULL;
    }
    return NULL;

}
