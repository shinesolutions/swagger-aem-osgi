#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties.h"



static com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_t *com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_create_internal(
    config_node_property_string_t *path,
    config_node_property_string_t *jaas_control_flag,
    config_node_property_string_t *jaas_realm_name,
    config_node_property_integer_t *jaas_ranking,
    config_node_property_boolean_t *oauth_offline_validation
    ) {
    com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_t *com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_local_var = malloc(sizeof(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_t));
    if (!com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_local_var, 0, sizeof(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_t));
    com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_local_var->_library_owned = 1;
    com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_local_var->path = path;
    com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_local_var->jaas_control_flag = jaas_control_flag;
    com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_local_var->jaas_realm_name = jaas_realm_name;
    com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_local_var->jaas_ranking = jaas_ranking;
    com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_local_var->oauth_offline_validation = oauth_offline_validation;
    return com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_t *com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_create(
    config_node_property_string_t *path,
    config_node_property_string_t *jaas_control_flag,
    config_node_property_string_t *jaas_realm_name,
    config_node_property_integer_t *jaas_ranking,
    config_node_property_boolean_t *oauth_offline_validation
    ) {
    com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_t *result = com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_create_internal (
        path,
        jaas_control_flag,
        jaas_realm_name,
        jaas_ranking,
        oauth_offline_validation
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_free(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_t *com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties) {
    if(NULL == com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties){
        return ;
    }
    if(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->path) {
        config_node_property_string_free(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->path);
        com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->path = NULL;
    }
    if (com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_control_flag) {
        config_node_property_string_free(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_control_flag);
        com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_control_flag = NULL;
    }
    if (com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_realm_name) {
        config_node_property_string_free(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_realm_name);
        com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_realm_name = NULL;
    }
    if (com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_ranking) {
        config_node_property_integer_free(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_ranking);
        com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_ranking = NULL;
    }
    if (com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->oauth_offline_validation) {
        config_node_property_boolean_free(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->oauth_offline_validation);
        com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->oauth_offline_validation = NULL;
    }
    free(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties);
}

cJSON *com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_convertToJSON(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_t *com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->path
    if(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->path) {
    cJSON *path_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->path);
    if(path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path", path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_control_flag
    if(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_control_flag) {
    cJSON *jaas_control_flag_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_control_flag);
    if(jaas_control_flag_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.controlFlag", jaas_control_flag_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_realm_name
    if(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_realm_name) {
    cJSON *jaas_realm_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_realm_name);
    if(jaas_realm_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.realmName", jaas_realm_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_ranking
    if(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_ranking) {
    cJSON *jaas_ranking_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_ranking);
    if(jaas_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.ranking", jaas_ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->oauth_offline_validation
    if(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->oauth_offline_validation) {
    cJSON *oauth_offline_validation_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->oauth_offline_validation);
    if(oauth_offline_validation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.offline.validation", oauth_offline_validation_local_JSON);
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

com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_t *com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_parseFromJSON(cJSON *com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_propertiesJSON){

    com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_t *com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->path
    config_node_property_string_t *path_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_control_flag
    config_node_property_string_t *jaas_control_flag_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_realm_name
    config_node_property_string_t *jaas_realm_name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_ranking
    config_node_property_integer_t *jaas_ranking_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->oauth_offline_validation
    config_node_property_boolean_t *oauth_offline_validation_local_nonprim = NULL;

    // com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_propertiesJSON, "path");
    if (cJSON_IsNull(path)) {
        path = NULL;
    }
    if (path) { 
    path_local_nonprim = config_node_property_string_parseFromJSON(path); //nonprimitive
    }

    // com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_control_flag
    cJSON *jaas_control_flag = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_propertiesJSON, "jaas.controlFlag");
    if (cJSON_IsNull(jaas_control_flag)) {
        jaas_control_flag = NULL;
    }
    if (jaas_control_flag) { 
    jaas_control_flag_local_nonprim = config_node_property_string_parseFromJSON(jaas_control_flag); //nonprimitive
    }

    // com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_realm_name
    cJSON *jaas_realm_name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_propertiesJSON, "jaas.realmName");
    if (cJSON_IsNull(jaas_realm_name)) {
        jaas_realm_name = NULL;
    }
    if (jaas_realm_name) { 
    jaas_realm_name_local_nonprim = config_node_property_string_parseFromJSON(jaas_realm_name); //nonprimitive
    }

    // com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->jaas_ranking
    cJSON *jaas_ranking = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_propertiesJSON, "jaas.ranking");
    if (cJSON_IsNull(jaas_ranking)) {
        jaas_ranking = NULL;
    }
    if (jaas_ranking) { 
    jaas_ranking_local_nonprim = config_node_property_integer_parseFromJSON(jaas_ranking); //nonprimitive
    }

    // com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties->oauth_offline_validation
    cJSON *oauth_offline_validation = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_propertiesJSON, "oauth.offline.validation");
    if (cJSON_IsNull(oauth_offline_validation)) {
        oauth_offline_validation = NULL;
    }
    if (oauth_offline_validation) { 
    oauth_offline_validation_local_nonprim = config_node_property_boolean_parseFromJSON(oauth_offline_validation); //nonprimitive
    }



    com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_local_var = com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_create_internal (
        path ? path_local_nonprim : NULL,
        jaas_control_flag ? jaas_control_flag_local_nonprim : NULL,
        jaas_realm_name ? jaas_realm_name_local_nonprim : NULL,
        jaas_ranking ? jaas_ranking_local_nonprim : NULL,
        oauth_offline_validation ? oauth_offline_validation_local_nonprim : NULL
        );

    if (!com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties_local_var;
end:
    if (path_local_nonprim) {
        config_node_property_string_free(path_local_nonprim);
        path_local_nonprim = NULL;
    }
    if (jaas_control_flag_local_nonprim) {
        config_node_property_string_free(jaas_control_flag_local_nonprim);
        jaas_control_flag_local_nonprim = NULL;
    }
    if (jaas_realm_name_local_nonprim) {
        config_node_property_string_free(jaas_realm_name_local_nonprim);
        jaas_realm_name_local_nonprim = NULL;
    }
    if (jaas_ranking_local_nonprim) {
        config_node_property_integer_free(jaas_ranking_local_nonprim);
        jaas_ranking_local_nonprim = NULL;
    }
    if (oauth_offline_validation_local_nonprim) {
        config_node_property_boolean_free(oauth_offline_validation_local_nonprim);
        oauth_offline_validation_local_nonprim = NULL;
    }
    return NULL;

}
