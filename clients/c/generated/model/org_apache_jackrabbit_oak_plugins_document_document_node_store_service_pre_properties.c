#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties.h"



static org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_create_internal(
    config_node_property_array_t *persistent_cache_includes
    ) {
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_t));
    if (!org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_t));
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_local_var->persistent_cache_includes = persistent_cache_includes;
    return org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_create(
    config_node_property_array_t *persistent_cache_includes
    ) {
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_t *result = org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_create_internal (
        persistent_cache_includes
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties) {
    if(NULL == org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties->persistent_cache_includes) {
        config_node_property_array_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties->persistent_cache_includes);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties->persistent_cache_includes = NULL;
    }
    free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties);
}

cJSON *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties->persistent_cache_includes
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties->persistent_cache_includes) {
    cJSON *persistent_cache_includes_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties->persistent_cache_includes);
    if(persistent_cache_includes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "persistentCacheIncludes", persistent_cache_includes_local_JSON);
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

org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_propertiesJSON){

    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties->persistent_cache_includes
    config_node_property_array_t *persistent_cache_includes_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties->persistent_cache_includes
    cJSON *persistent_cache_includes = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_propertiesJSON, "persistentCacheIncludes");
    if (cJSON_IsNull(persistent_cache_includes)) {
        persistent_cache_includes = NULL;
    }
    if (persistent_cache_includes) { 
    persistent_cache_includes_local_nonprim = config_node_property_array_parseFromJSON(persistent_cache_includes); //nonprimitive
    }



    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_local_var = org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_create_internal (
        persistent_cache_includes ? persistent_cache_includes_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties_local_var;
end:
    if (persistent_cache_includes_local_nonprim) {
        config_node_property_array_free(persistent_cache_includes_local_nonprim);
        persistent_cache_includes_local_nonprim = NULL;
    }
    return NULL;

}
