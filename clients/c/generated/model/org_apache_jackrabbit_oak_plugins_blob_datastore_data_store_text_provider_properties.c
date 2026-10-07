#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties.h"



static org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_t *org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_create_internal(
    config_node_property_string_t *dir
    ) {
    org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_t *org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_t));
    if (!org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_t));
    org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_local_var->dir = dir;
    return org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_t *org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_create(
    config_node_property_string_t *dir
    ) {
    org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_t *result = org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_create_internal (
        dir
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_free(org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_t *org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties) {
    if(NULL == org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties->dir) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties->dir);
        org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties->dir = NULL;
    }
    free(org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties);
}

cJSON *org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_t *org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties->dir
    if(org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties->dir) {
    cJSON *dir_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties->dir);
    if(dir_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dir", dir_local_JSON);
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

org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_t *org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_propertiesJSON){

    org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_t *org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties->dir
    config_node_property_string_t *dir_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties->dir
    cJSON *dir = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_propertiesJSON, "dir");
    if (cJSON_IsNull(dir)) {
        dir = NULL;
    }
    if (dir) { 
    dir_local_nonprim = config_node_property_string_parseFromJSON(dir); //nonprimitive
    }



    org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_local_var = org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_create_internal (
        dir ? dir_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties_local_var;
end:
    if (dir_local_nonprim) {
        config_node_property_string_free(dir_local_nonprim);
        dir_local_nonprim = NULL;
    }
    return NULL;

}
