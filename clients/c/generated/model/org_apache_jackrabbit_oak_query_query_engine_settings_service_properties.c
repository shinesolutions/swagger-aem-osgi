#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_query_query_engine_settings_service_properties.h"



static org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t *org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_create_internal(
    config_node_property_integer_t *query_limit_in_memory,
    config_node_property_integer_t *query_limit_reads,
    config_node_property_boolean_t *query_fail_traversal,
    config_node_property_boolean_t *fast_query_size
    ) {
    org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t *org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t));
    if (!org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t));
    org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_local_var->query_limit_in_memory = query_limit_in_memory;
    org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_local_var->query_limit_reads = query_limit_reads;
    org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_local_var->query_fail_traversal = query_fail_traversal;
    org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_local_var->fast_query_size = fast_query_size;
    return org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t *org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_create(
    config_node_property_integer_t *query_limit_in_memory,
    config_node_property_integer_t *query_limit_reads,
    config_node_property_boolean_t *query_fail_traversal,
    config_node_property_boolean_t *fast_query_size
    ) {
    org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t *result = org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_create_internal (
        query_limit_in_memory,
        query_limit_reads,
        query_fail_traversal,
        fast_query_size
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_free(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t *org_apache_jackrabbit_oak_query_query_engine_settings_service_properties) {
    if(NULL == org_apache_jackrabbit_oak_query_query_engine_settings_service_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_in_memory) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_in_memory);
        org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_in_memory = NULL;
    }
    if (org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_reads) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_reads);
        org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_reads = NULL;
    }
    if (org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_fail_traversal) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_fail_traversal);
        org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_fail_traversal = NULL;
    }
    if (org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->fast_query_size) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->fast_query_size);
        org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->fast_query_size = NULL;
    }
    free(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties);
}

cJSON *org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_convertToJSON(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t *org_apache_jackrabbit_oak_query_query_engine_settings_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_in_memory
    if(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_in_memory) {
    cJSON *query_limit_in_memory_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_in_memory);
    if(query_limit_in_memory_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queryLimitInMemory", query_limit_in_memory_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_reads
    if(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_reads) {
    cJSON *query_limit_reads_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_reads);
    if(query_limit_reads_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queryLimitReads", query_limit_reads_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_fail_traversal
    if(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_fail_traversal) {
    cJSON *query_fail_traversal_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_fail_traversal);
    if(query_fail_traversal_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queryFailTraversal", query_fail_traversal_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->fast_query_size
    if(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->fast_query_size) {
    cJSON *fast_query_size_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->fast_query_size);
    if(fast_query_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fastQuerySize", fast_query_size_local_JSON);
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

org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t *org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_query_query_engine_settings_service_propertiesJSON){

    org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t *org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_in_memory
    config_node_property_integer_t *query_limit_in_memory_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_reads
    config_node_property_integer_t *query_limit_reads_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_fail_traversal
    config_node_property_boolean_t *query_fail_traversal_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->fast_query_size
    config_node_property_boolean_t *fast_query_size_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_in_memory
    cJSON *query_limit_in_memory = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_query_query_engine_settings_service_propertiesJSON, "queryLimitInMemory");
    if (cJSON_IsNull(query_limit_in_memory)) {
        query_limit_in_memory = NULL;
    }
    if (query_limit_in_memory) { 
    query_limit_in_memory_local_nonprim = config_node_property_integer_parseFromJSON(query_limit_in_memory); //nonprimitive
    }

    // org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_limit_reads
    cJSON *query_limit_reads = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_query_query_engine_settings_service_propertiesJSON, "queryLimitReads");
    if (cJSON_IsNull(query_limit_reads)) {
        query_limit_reads = NULL;
    }
    if (query_limit_reads) { 
    query_limit_reads_local_nonprim = config_node_property_integer_parseFromJSON(query_limit_reads); //nonprimitive
    }

    // org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->query_fail_traversal
    cJSON *query_fail_traversal = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_query_query_engine_settings_service_propertiesJSON, "queryFailTraversal");
    if (cJSON_IsNull(query_fail_traversal)) {
        query_fail_traversal = NULL;
    }
    if (query_fail_traversal) { 
    query_fail_traversal_local_nonprim = config_node_property_boolean_parseFromJSON(query_fail_traversal); //nonprimitive
    }

    // org_apache_jackrabbit_oak_query_query_engine_settings_service_properties->fast_query_size
    cJSON *fast_query_size = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_query_query_engine_settings_service_propertiesJSON, "fastQuerySize");
    if (cJSON_IsNull(fast_query_size)) {
        fast_query_size = NULL;
    }
    if (fast_query_size) { 
    fast_query_size_local_nonprim = config_node_property_boolean_parseFromJSON(fast_query_size); //nonprimitive
    }



    org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_local_var = org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_create_internal (
        query_limit_in_memory ? query_limit_in_memory_local_nonprim : NULL,
        query_limit_reads ? query_limit_reads_local_nonprim : NULL,
        query_fail_traversal ? query_fail_traversal_local_nonprim : NULL,
        fast_query_size ? fast_query_size_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_local_var;
end:
    if (query_limit_in_memory_local_nonprim) {
        config_node_property_integer_free(query_limit_in_memory_local_nonprim);
        query_limit_in_memory_local_nonprim = NULL;
    }
    if (query_limit_reads_local_nonprim) {
        config_node_property_integer_free(query_limit_reads_local_nonprim);
        query_limit_reads_local_nonprim = NULL;
    }
    if (query_fail_traversal_local_nonprim) {
        config_node_property_boolean_free(query_fail_traversal_local_nonprim);
        query_fail_traversal_local_nonprim = NULL;
    }
    if (fast_query_size_local_nonprim) {
        config_node_property_boolean_free(fast_query_size_local_nonprim);
        fast_query_size_local_nonprim = NULL;
    }
    return NULL;

}
