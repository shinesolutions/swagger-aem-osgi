#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties.h"



static com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_t *com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_string_t *service_name,
    config_node_property_string_t *user_id,
    config_node_property_string_t *access_token_provider_target
    ) {
    com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_t *com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_local_var = malloc(sizeof(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_t));
    if (!com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_local_var, 0, sizeof(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_t));
    com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_local_var->_library_owned = 1;
    com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_local_var->name = name;
    com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_local_var->service_name = service_name;
    com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_local_var->user_id = user_id;
    com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_local_var->access_token_provider_target = access_token_provider_target;
    return com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_t *com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *service_name,
    config_node_property_string_t *user_id,
    config_node_property_string_t *access_token_provider_target
    ) {
    com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_t *result = com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_create_internal (
        name,
        service_name,
        user_id,
        access_token_provider_target
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_free(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_t *com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties) {
    if(NULL == com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties){
        return ;
    }
    if(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->name) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->name);
        com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->name = NULL;
    }
    if (com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->service_name) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->service_name);
        com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->service_name = NULL;
    }
    if (com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->user_id) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->user_id);
        com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->user_id = NULL;
    }
    if (com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->access_token_provider_target) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->access_token_provider_target);
        com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->access_token_provider_target = NULL;
    }
    free(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties);
}

cJSON *com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_convertToJSON(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_t *com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->name
    if(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->service_name
    if(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->service_name) {
    cJSON *service_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->service_name);
    if(service_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "serviceName", service_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->user_id
    if(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->user_id) {
    cJSON *user_id_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->user_id);
    if(user_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "userId", user_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->access_token_provider_target
    if(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->access_token_provider_target) {
    cJSON *access_token_provider_target_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->access_token_provider_target);
    if(access_token_provider_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "accessTokenProvider.target", access_token_provider_target_local_JSON);
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

com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_t *com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_parseFromJSON(cJSON *com_adobe_granite_distribution_core_impl_transport_access_token_distribu_propertiesJSON){

    com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_t *com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->service_name
    config_node_property_string_t *service_name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->user_id
    config_node_property_string_t *user_id_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->access_token_provider_target
    config_node_property_string_t *access_token_provider_target_local_nonprim = NULL;

    // com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->service_name
    cJSON *service_name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_propertiesJSON, "serviceName");
    if (cJSON_IsNull(service_name)) {
        service_name = NULL;
    }
    if (service_name) { 
    service_name_local_nonprim = config_node_property_string_parseFromJSON(service_name); //nonprimitive
    }

    // com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_propertiesJSON, "userId");
    if (cJSON_IsNull(user_id)) {
        user_id = NULL;
    }
    if (user_id) { 
    user_id_local_nonprim = config_node_property_string_parseFromJSON(user_id); //nonprimitive
    }

    // com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties->access_token_provider_target
    cJSON *access_token_provider_target = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_transport_access_token_distribu_propertiesJSON, "accessTokenProvider.target");
    if (cJSON_IsNull(access_token_provider_target)) {
        access_token_provider_target = NULL;
    }
    if (access_token_provider_target) { 
    access_token_provider_target_local_nonprim = config_node_property_string_parseFromJSON(access_token_provider_target); //nonprimitive
    }



    com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_local_var = com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_create_internal (
        name ? name_local_nonprim : NULL,
        service_name ? service_name_local_nonprim : NULL,
        user_id ? user_id_local_nonprim : NULL,
        access_token_provider_target ? access_token_provider_target_local_nonprim : NULL
        );

    if (!com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties_local_var;
end:
    if (name_local_nonprim) {
        config_node_property_string_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    if (service_name_local_nonprim) {
        config_node_property_string_free(service_name_local_nonprim);
        service_name_local_nonprim = NULL;
    }
    if (user_id_local_nonprim) {
        config_node_property_string_free(user_id_local_nonprim);
        user_id_local_nonprim = NULL;
    }
    if (access_token_provider_target_local_nonprim) {
        config_node_property_string_free(access_token_provider_target_local_nonprim);
        access_token_provider_target_local_nonprim = NULL;
    }
    return NULL;

}
