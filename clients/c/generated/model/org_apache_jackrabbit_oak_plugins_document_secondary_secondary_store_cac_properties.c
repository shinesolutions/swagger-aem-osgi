#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties.h"



static org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_t *org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_create_internal(
    config_node_property_array_t *included_paths,
    config_node_property_boolean_t *enable_async_observer,
    config_node_property_integer_t *observer_queue_size
    ) {
    org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_t *org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_t));
    if (!org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_t));
    org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_local_var->included_paths = included_paths;
    org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_local_var->enable_async_observer = enable_async_observer;
    org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_local_var->observer_queue_size = observer_queue_size;
    return org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_t *org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_create(
    config_node_property_array_t *included_paths,
    config_node_property_boolean_t *enable_async_observer,
    config_node_property_integer_t *observer_queue_size
    ) {
    org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_t *result = org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_create_internal (
        included_paths,
        enable_async_observer,
        observer_queue_size
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_free(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_t *org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties) {
    if(NULL == org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->included_paths) {
        config_node_property_array_free(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->included_paths);
        org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->included_paths = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->enable_async_observer) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->enable_async_observer);
        org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->enable_async_observer = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->observer_queue_size) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->observer_queue_size);
        org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->observer_queue_size = NULL;
    }
    free(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties);
}

cJSON *org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_t *org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->included_paths
    if(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->included_paths) {
    cJSON *included_paths_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->included_paths);
    if(included_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "includedPaths", included_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->enable_async_observer
    if(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->enable_async_observer) {
    cJSON *enable_async_observer_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->enable_async_observer);
    if(enable_async_observer_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enableAsyncObserver", enable_async_observer_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->observer_queue_size
    if(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->observer_queue_size) {
    cJSON *observer_queue_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->observer_queue_size);
    if(observer_queue_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "observerQueueSize", observer_queue_size_local_JSON);
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

org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_t *org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_propertiesJSON){

    org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_t *org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->included_paths
    config_node_property_array_t *included_paths_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->enable_async_observer
    config_node_property_boolean_t *enable_async_observer_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->observer_queue_size
    config_node_property_integer_t *observer_queue_size_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->included_paths
    cJSON *included_paths = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_propertiesJSON, "includedPaths");
    if (cJSON_IsNull(included_paths)) {
        included_paths = NULL;
    }
    if (included_paths) { 
    included_paths_local_nonprim = config_node_property_array_parseFromJSON(included_paths); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->enable_async_observer
    cJSON *enable_async_observer = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_propertiesJSON, "enableAsyncObserver");
    if (cJSON_IsNull(enable_async_observer)) {
        enable_async_observer = NULL;
    }
    if (enable_async_observer) { 
    enable_async_observer_local_nonprim = config_node_property_boolean_parseFromJSON(enable_async_observer); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties->observer_queue_size
    cJSON *observer_queue_size = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_propertiesJSON, "observerQueueSize");
    if (cJSON_IsNull(observer_queue_size)) {
        observer_queue_size = NULL;
    }
    if (observer_queue_size) { 
    observer_queue_size_local_nonprim = config_node_property_integer_parseFromJSON(observer_queue_size); //nonprimitive
    }



    org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_local_var = org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_create_internal (
        included_paths ? included_paths_local_nonprim : NULL,
        enable_async_observer ? enable_async_observer_local_nonprim : NULL,
        observer_queue_size ? observer_queue_size_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties_local_var;
end:
    if (included_paths_local_nonprim) {
        config_node_property_array_free(included_paths_local_nonprim);
        included_paths_local_nonprim = NULL;
    }
    if (enable_async_observer_local_nonprim) {
        config_node_property_boolean_free(enable_async_observer_local_nonprim);
        enable_async_observer_local_nonprim = NULL;
    }
    if (observer_queue_size_local_nonprim) {
        config_node_property_integer_free(observer_queue_size_local_nonprim);
        observer_queue_size_local_nonprim = NULL;
    }
    return NULL;

}
