#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties.h"



static com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t *com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_create_internal(
    config_node_property_string_t *path,
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *jaas_control_flag,
    config_node_property_string_t *jaas_realm_name,
    config_node_property_integer_t *jaas_ranking,
    config_node_property_array_t *headers,
    config_node_property_array_t *cookies,
    config_node_property_array_t *parameters,
    config_node_property_array_t *usermap,
    config_node_property_string_t *format,
    config_node_property_string_t *trusted_credentials_attribute
    ) {
    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t *com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var = malloc(sizeof(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t));
    if (!com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var, 0, sizeof(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t));
    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var->_library_owned = 1;
    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var->path = path;
    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var->service_ranking = service_ranking;
    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var->jaas_control_flag = jaas_control_flag;
    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var->jaas_realm_name = jaas_realm_name;
    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var->jaas_ranking = jaas_ranking;
    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var->headers = headers;
    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var->cookies = cookies;
    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var->parameters = parameters;
    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var->usermap = usermap;
    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var->format = format;
    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var->trusted_credentials_attribute = trusted_credentials_attribute;
    return com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t *com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_create(
    config_node_property_string_t *path,
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *jaas_control_flag,
    config_node_property_string_t *jaas_realm_name,
    config_node_property_integer_t *jaas_ranking,
    config_node_property_array_t *headers,
    config_node_property_array_t *cookies,
    config_node_property_array_t *parameters,
    config_node_property_array_t *usermap,
    config_node_property_string_t *format,
    config_node_property_string_t *trusted_credentials_attribute
    ) {
    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t *result = com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_create_internal (
        path,
        service_ranking,
        jaas_control_flag,
        jaas_realm_name,
        jaas_ranking,
        headers,
        cookies,
        parameters,
        usermap,
        format,
        trusted_credentials_attribute
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_free(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t *com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties) {
    if(NULL == com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties){
        return ;
    }
    if(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->path) {
        config_node_property_string_free(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->path);
        com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->path = NULL;
    }
    if (com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->service_ranking) {
        config_node_property_integer_free(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->service_ranking);
        com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->service_ranking = NULL;
    }
    if (com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_control_flag) {
        config_node_property_string_free(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_control_flag);
        com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_control_flag = NULL;
    }
    if (com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_realm_name) {
        config_node_property_string_free(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_realm_name);
        com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_realm_name = NULL;
    }
    if (com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_ranking) {
        config_node_property_integer_free(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_ranking);
        com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_ranking = NULL;
    }
    if (com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->headers) {
        config_node_property_array_free(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->headers);
        com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->headers = NULL;
    }
    if (com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->cookies) {
        config_node_property_array_free(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->cookies);
        com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->cookies = NULL;
    }
    if (com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->parameters) {
        config_node_property_array_free(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->parameters);
        com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->parameters = NULL;
    }
    if (com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->usermap) {
        config_node_property_array_free(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->usermap);
        com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->usermap = NULL;
    }
    if (com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->format) {
        config_node_property_string_free(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->format);
        com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->format = NULL;
    }
    if (com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->trusted_credentials_attribute) {
        config_node_property_string_free(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->trusted_credentials_attribute);
        com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->trusted_credentials_attribute = NULL;
    }
    free(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties);
}

cJSON *com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_convertToJSON(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t *com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->path
    if(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->path) {
    cJSON *path_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->path);
    if(path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path", path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->service_ranking
    if(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->service_ranking) {
    cJSON *service_ranking_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->service_ranking);
    if(service_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.ranking", service_ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_control_flag
    if(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_control_flag) {
    cJSON *jaas_control_flag_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_control_flag);
    if(jaas_control_flag_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.controlFlag", jaas_control_flag_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_realm_name
    if(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_realm_name) {
    cJSON *jaas_realm_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_realm_name);
    if(jaas_realm_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.realmName", jaas_realm_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_ranking
    if(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_ranking) {
    cJSON *jaas_ranking_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_ranking);
    if(jaas_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.ranking", jaas_ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->headers
    if(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->headers) {
    cJSON *headers_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->headers);
    if(headers_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "headers", headers_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->cookies
    if(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->cookies) {
    cJSON *cookies_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->cookies);
    if(cookies_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cookies", cookies_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->parameters
    if(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->parameters) {
    cJSON *parameters_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->parameters);
    if(parameters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "parameters", parameters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->usermap
    if(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->usermap) {
    cJSON *usermap_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->usermap);
    if(usermap_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "usermap", usermap_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->format
    if(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->format) {
    cJSON *format_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->format);
    if(format_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "format", format_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->trusted_credentials_attribute
    if(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->trusted_credentials_attribute) {
    cJSON *trusted_credentials_attribute_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->trusted_credentials_attribute);
    if(trusted_credentials_attribute_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "trustedCredentialsAttribute", trusted_credentials_attribute_local_JSON);
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

com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t *com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_parseFromJSON(cJSON *com_adobe_granite_auth_sso_impl_sso_authentication_handler_propertiesJSON){

    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t *com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->path
    config_node_property_string_t *path_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->service_ranking
    config_node_property_integer_t *service_ranking_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_control_flag
    config_node_property_string_t *jaas_control_flag_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_realm_name
    config_node_property_string_t *jaas_realm_name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_ranking
    config_node_property_integer_t *jaas_ranking_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->headers
    config_node_property_array_t *headers_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->cookies
    config_node_property_array_t *cookies_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->parameters
    config_node_property_array_t *parameters_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->usermap
    config_node_property_array_t *usermap_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->format
    config_node_property_string_t *format_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->trusted_credentials_attribute
    config_node_property_string_t *trusted_credentials_attribute_local_nonprim = NULL;

    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_sso_impl_sso_authentication_handler_propertiesJSON, "path");
    if (cJSON_IsNull(path)) {
        path = NULL;
    }
    if (path) { 
    path_local_nonprim = config_node_property_string_parseFromJSON(path); //nonprimitive
    }

    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->service_ranking
    cJSON *service_ranking = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_sso_impl_sso_authentication_handler_propertiesJSON, "service.ranking");
    if (cJSON_IsNull(service_ranking)) {
        service_ranking = NULL;
    }
    if (service_ranking) { 
    service_ranking_local_nonprim = config_node_property_integer_parseFromJSON(service_ranking); //nonprimitive
    }

    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_control_flag
    cJSON *jaas_control_flag = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_sso_impl_sso_authentication_handler_propertiesJSON, "jaas.controlFlag");
    if (cJSON_IsNull(jaas_control_flag)) {
        jaas_control_flag = NULL;
    }
    if (jaas_control_flag) { 
    jaas_control_flag_local_nonprim = config_node_property_string_parseFromJSON(jaas_control_flag); //nonprimitive
    }

    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_realm_name
    cJSON *jaas_realm_name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_sso_impl_sso_authentication_handler_propertiesJSON, "jaas.realmName");
    if (cJSON_IsNull(jaas_realm_name)) {
        jaas_realm_name = NULL;
    }
    if (jaas_realm_name) { 
    jaas_realm_name_local_nonprim = config_node_property_string_parseFromJSON(jaas_realm_name); //nonprimitive
    }

    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->jaas_ranking
    cJSON *jaas_ranking = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_sso_impl_sso_authentication_handler_propertiesJSON, "jaas.ranking");
    if (cJSON_IsNull(jaas_ranking)) {
        jaas_ranking = NULL;
    }
    if (jaas_ranking) { 
    jaas_ranking_local_nonprim = config_node_property_integer_parseFromJSON(jaas_ranking); //nonprimitive
    }

    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->headers
    cJSON *headers = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_sso_impl_sso_authentication_handler_propertiesJSON, "headers");
    if (cJSON_IsNull(headers)) {
        headers = NULL;
    }
    if (headers) { 
    headers_local_nonprim = config_node_property_array_parseFromJSON(headers); //nonprimitive
    }

    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->cookies
    cJSON *cookies = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_sso_impl_sso_authentication_handler_propertiesJSON, "cookies");
    if (cJSON_IsNull(cookies)) {
        cookies = NULL;
    }
    if (cookies) { 
    cookies_local_nonprim = config_node_property_array_parseFromJSON(cookies); //nonprimitive
    }

    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->parameters
    cJSON *parameters = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_sso_impl_sso_authentication_handler_propertiesJSON, "parameters");
    if (cJSON_IsNull(parameters)) {
        parameters = NULL;
    }
    if (parameters) { 
    parameters_local_nonprim = config_node_property_array_parseFromJSON(parameters); //nonprimitive
    }

    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->usermap
    cJSON *usermap = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_sso_impl_sso_authentication_handler_propertiesJSON, "usermap");
    if (cJSON_IsNull(usermap)) {
        usermap = NULL;
    }
    if (usermap) { 
    usermap_local_nonprim = config_node_property_array_parseFromJSON(usermap); //nonprimitive
    }

    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->format
    cJSON *format = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_sso_impl_sso_authentication_handler_propertiesJSON, "format");
    if (cJSON_IsNull(format)) {
        format = NULL;
    }
    if (format) { 
    format_local_nonprim = config_node_property_string_parseFromJSON(format); //nonprimitive
    }

    // com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties->trusted_credentials_attribute
    cJSON *trusted_credentials_attribute = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_sso_impl_sso_authentication_handler_propertiesJSON, "trustedCredentialsAttribute");
    if (cJSON_IsNull(trusted_credentials_attribute)) {
        trusted_credentials_attribute = NULL;
    }
    if (trusted_credentials_attribute) { 
    trusted_credentials_attribute_local_nonprim = config_node_property_string_parseFromJSON(trusted_credentials_attribute); //nonprimitive
    }



    com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var = com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_create_internal (
        path ? path_local_nonprim : NULL,
        service_ranking ? service_ranking_local_nonprim : NULL,
        jaas_control_flag ? jaas_control_flag_local_nonprim : NULL,
        jaas_realm_name ? jaas_realm_name_local_nonprim : NULL,
        jaas_ranking ? jaas_ranking_local_nonprim : NULL,
        headers ? headers_local_nonprim : NULL,
        cookies ? cookies_local_nonprim : NULL,
        parameters ? parameters_local_nonprim : NULL,
        usermap ? usermap_local_nonprim : NULL,
        format ? format_local_nonprim : NULL,
        trusted_credentials_attribute ? trusted_credentials_attribute_local_nonprim : NULL
        );

    if (!com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_local_var;
end:
    if (path_local_nonprim) {
        config_node_property_string_free(path_local_nonprim);
        path_local_nonprim = NULL;
    }
    if (service_ranking_local_nonprim) {
        config_node_property_integer_free(service_ranking_local_nonprim);
        service_ranking_local_nonprim = NULL;
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
    if (headers_local_nonprim) {
        config_node_property_array_free(headers_local_nonprim);
        headers_local_nonprim = NULL;
    }
    if (cookies_local_nonprim) {
        config_node_property_array_free(cookies_local_nonprim);
        cookies_local_nonprim = NULL;
    }
    if (parameters_local_nonprim) {
        config_node_property_array_free(parameters_local_nonprim);
        parameters_local_nonprim = NULL;
    }
    if (usermap_local_nonprim) {
        config_node_property_array_free(usermap_local_nonprim);
        usermap_local_nonprim = NULL;
    }
    if (format_local_nonprim) {
        config_node_property_string_free(format_local_nonprim);
        format_local_nonprim = NULL;
    }
    if (trusted_credentials_attribute_local_nonprim) {
        config_node_property_string_free(trusted_credentials_attribute_local_nonprim);
        trusted_credentials_attribute_local_nonprim = NULL;
    }
    return NULL;

}
