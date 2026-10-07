#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties.h"



static org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t *org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_create_internal(
    config_node_property_string_t *account_name,
    config_node_property_string_t *container_name,
    config_node_property_string_t *access_key,
    config_node_property_string_t *root_path,
    config_node_property_string_t *connection_url
    ) {
    org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t *org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t));
    if (!org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t));
    org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_local_var->account_name = account_name;
    org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_local_var->container_name = container_name;
    org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_local_var->access_key = access_key;
    org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_local_var->root_path = root_path;
    org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_local_var->connection_url = connection_url;
    return org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t *org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_create(
    config_node_property_string_t *account_name,
    config_node_property_string_t *container_name,
    config_node_property_string_t *access_key,
    config_node_property_string_t *root_path,
    config_node_property_string_t *connection_url
    ) {
    org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t *result = org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_create_internal (
        account_name,
        container_name,
        access_key,
        root_path,
        connection_url
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_free(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t *org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties) {
    if(NULL == org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->account_name) {
        config_node_property_string_free(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->account_name);
        org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->account_name = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->container_name) {
        config_node_property_string_free(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->container_name);
        org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->container_name = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->access_key) {
        config_node_property_string_free(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->access_key);
        org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->access_key = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->root_path) {
        config_node_property_string_free(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->root_path);
        org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->root_path = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->connection_url) {
        config_node_property_string_free(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->connection_url);
        org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->connection_url = NULL;
    }
    free(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties);
}

cJSON *org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_convertToJSON(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t *org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->account_name
    if(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->account_name) {
    cJSON *account_name_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->account_name);
    if(account_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "accountName", account_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->container_name
    if(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->container_name) {
    cJSON *container_name_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->container_name);
    if(container_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "containerName", container_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->access_key
    if(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->access_key) {
    cJSON *access_key_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->access_key);
    if(access_key_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "accessKey", access_key_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->root_path
    if(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->root_path) {
    cJSON *root_path_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->root_path);
    if(root_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rootPath", root_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->connection_url
    if(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->connection_url) {
    cJSON *connection_url_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->connection_url);
    if(connection_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "connectionURL", connection_url_local_JSON);
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

org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t *org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_propertiesJSON){

    org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t *org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->account_name
    config_node_property_string_t *account_name_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->container_name
    config_node_property_string_t *container_name_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->access_key
    config_node_property_string_t *access_key_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->root_path
    config_node_property_string_t *root_path_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->connection_url
    config_node_property_string_t *connection_url_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->account_name
    cJSON *account_name = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_propertiesJSON, "accountName");
    if (cJSON_IsNull(account_name)) {
        account_name = NULL;
    }
    if (account_name) { 
    account_name_local_nonprim = config_node_property_string_parseFromJSON(account_name); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->container_name
    cJSON *container_name = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_propertiesJSON, "containerName");
    if (cJSON_IsNull(container_name)) {
        container_name = NULL;
    }
    if (container_name) { 
    container_name_local_nonprim = config_node_property_string_parseFromJSON(container_name); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->access_key
    cJSON *access_key = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_propertiesJSON, "accessKey");
    if (cJSON_IsNull(access_key)) {
        access_key = NULL;
    }
    if (access_key) { 
    access_key_local_nonprim = config_node_property_string_parseFromJSON(access_key); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->root_path
    cJSON *root_path = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_propertiesJSON, "rootPath");
    if (cJSON_IsNull(root_path)) {
        root_path = NULL;
    }
    if (root_path) { 
    root_path_local_nonprim = config_node_property_string_parseFromJSON(root_path); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties->connection_url
    cJSON *connection_url = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_propertiesJSON, "connectionURL");
    if (cJSON_IsNull(connection_url)) {
        connection_url = NULL;
    }
    if (connection_url) { 
    connection_url_local_nonprim = config_node_property_string_parseFromJSON(connection_url); //nonprimitive
    }



    org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_local_var = org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_create_internal (
        account_name ? account_name_local_nonprim : NULL,
        container_name ? container_name_local_nonprim : NULL,
        access_key ? access_key_local_nonprim : NULL,
        root_path ? root_path_local_nonprim : NULL,
        connection_url ? connection_url_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_local_var;
end:
    if (account_name_local_nonprim) {
        config_node_property_string_free(account_name_local_nonprim);
        account_name_local_nonprim = NULL;
    }
    if (container_name_local_nonprim) {
        config_node_property_string_free(container_name_local_nonprim);
        container_name_local_nonprim = NULL;
    }
    if (access_key_local_nonprim) {
        config_node_property_string_free(access_key_local_nonprim);
        access_key_local_nonprim = NULL;
    }
    if (root_path_local_nonprim) {
        config_node_property_string_free(root_path_local_nonprim);
        root_path_local_nonprim = NULL;
    }
    if (connection_url_local_nonprim) {
        config_node_property_string_free(connection_url_local_nonprim);
        connection_url_local_nonprim = NULL;
    }
    return NULL;

}
