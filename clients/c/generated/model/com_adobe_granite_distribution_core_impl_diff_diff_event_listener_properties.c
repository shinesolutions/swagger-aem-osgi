#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties.h"



static com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_create_internal(
    config_node_property_string_t *diff_path,
    config_node_property_string_t *service_name,
    config_node_property_string_t *service_user_target
    ) {
    com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_local_var = malloc(sizeof(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_t));
    if (!com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_local_var, 0, sizeof(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_t));
    com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_local_var->_library_owned = 1;
    com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_local_var->diff_path = diff_path;
    com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_local_var->service_name = service_name;
    com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_local_var->service_user_target = service_user_target;
    return com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_create(
    config_node_property_string_t *diff_path,
    config_node_property_string_t *service_name,
    config_node_property_string_t *service_user_target
    ) {
    com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_t *result = com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_create_internal (
        diff_path,
        service_name,
        service_user_target
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_free(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties) {
    if(NULL == com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties){
        return ;
    }
    if(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->diff_path) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->diff_path);
        com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->diff_path = NULL;
    }
    if (com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_name) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_name);
        com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_name = NULL;
    }
    if (com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_user_target) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_user_target);
        com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_user_target = NULL;
    }
    free(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties);
}

cJSON *com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_convertToJSON(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->diff_path
    if(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->diff_path) {
    cJSON *diff_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->diff_path);
    if(diff_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "diffPath", diff_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_name
    if(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_name) {
    cJSON *service_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_name);
    if(service_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "serviceName", service_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_user_target
    if(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_user_target) {
    cJSON *service_user_target_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_user_target);
    if(service_user_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "serviceUser.target", service_user_target_local_JSON);
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

com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_parseFromJSON(cJSON *com_adobe_granite_distribution_core_impl_diff_diff_event_listener_propertiesJSON){

    com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->diff_path
    config_node_property_string_t *diff_path_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_name
    config_node_property_string_t *service_name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_user_target
    config_node_property_string_t *service_user_target_local_nonprim = NULL;

    // com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->diff_path
    cJSON *diff_path = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_propertiesJSON, "diffPath");
    if (cJSON_IsNull(diff_path)) {
        diff_path = NULL;
    }
    if (diff_path) { 
    diff_path_local_nonprim = config_node_property_string_parseFromJSON(diff_path); //nonprimitive
    }

    // com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_name
    cJSON *service_name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_propertiesJSON, "serviceName");
    if (cJSON_IsNull(service_name)) {
        service_name = NULL;
    }
    if (service_name) { 
    service_name_local_nonprim = config_node_property_string_parseFromJSON(service_name); //nonprimitive
    }

    // com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties->service_user_target
    cJSON *service_user_target = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_diff_diff_event_listener_propertiesJSON, "serviceUser.target");
    if (cJSON_IsNull(service_user_target)) {
        service_user_target = NULL;
    }
    if (service_user_target) { 
    service_user_target_local_nonprim = config_node_property_string_parseFromJSON(service_user_target); //nonprimitive
    }



    com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_local_var = com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_create_internal (
        diff_path ? diff_path_local_nonprim : NULL,
        service_name ? service_name_local_nonprim : NULL,
        service_user_target ? service_user_target_local_nonprim : NULL
        );

    if (!com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties_local_var;
end:
    if (diff_path_local_nonprim) {
        config_node_property_string_free(diff_path_local_nonprim);
        diff_path_local_nonprim = NULL;
    }
    if (service_name_local_nonprim) {
        config_node_property_string_free(service_name_local_nonprim);
        service_name_local_nonprim = NULL;
    }
    if (service_user_target_local_nonprim) {
        config_node_property_string_free(service_user_target_local_nonprim);
        service_user_target_local_nonprim = NULL;
    }
    return NULL;

}
