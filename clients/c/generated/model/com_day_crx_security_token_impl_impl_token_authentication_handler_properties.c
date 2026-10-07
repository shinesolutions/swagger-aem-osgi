#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_crx_security_token_impl_impl_token_authentication_handler_properties.h"



static com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t *com_day_crx_security_token_impl_impl_token_authentication_handler_properties_create_internal(
    config_node_property_string_t *path,
    config_node_property_drop_down_t *token_required_attr,
    config_node_property_string_t *token_alternate_url,
    config_node_property_boolean_t *token_encapsulated,
    config_node_property_array_t *skip_token_refresh
    ) {
    com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t *com_day_crx_security_token_impl_impl_token_authentication_handler_properties_local_var = malloc(sizeof(com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t));
    if (!com_day_crx_security_token_impl_impl_token_authentication_handler_properties_local_var) {
        return NULL;
    }
    memset(com_day_crx_security_token_impl_impl_token_authentication_handler_properties_local_var, 0, sizeof(com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t));
    com_day_crx_security_token_impl_impl_token_authentication_handler_properties_local_var->_library_owned = 1;
    com_day_crx_security_token_impl_impl_token_authentication_handler_properties_local_var->path = path;
    com_day_crx_security_token_impl_impl_token_authentication_handler_properties_local_var->token_required_attr = token_required_attr;
    com_day_crx_security_token_impl_impl_token_authentication_handler_properties_local_var->token_alternate_url = token_alternate_url;
    com_day_crx_security_token_impl_impl_token_authentication_handler_properties_local_var->token_encapsulated = token_encapsulated;
    com_day_crx_security_token_impl_impl_token_authentication_handler_properties_local_var->skip_token_refresh = skip_token_refresh;
    return com_day_crx_security_token_impl_impl_token_authentication_handler_properties_local_var;
}

__attribute__((deprecated)) com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t *com_day_crx_security_token_impl_impl_token_authentication_handler_properties_create(
    config_node_property_string_t *path,
    config_node_property_drop_down_t *token_required_attr,
    config_node_property_string_t *token_alternate_url,
    config_node_property_boolean_t *token_encapsulated,
    config_node_property_array_t *skip_token_refresh
    ) {
    com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t *result = com_day_crx_security_token_impl_impl_token_authentication_handler_properties_create_internal (
        path,
        token_required_attr,
        token_alternate_url,
        token_encapsulated,
        skip_token_refresh
        );
    if (!result) {
    }
    return result;
}

void com_day_crx_security_token_impl_impl_token_authentication_handler_properties_free(com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t *com_day_crx_security_token_impl_impl_token_authentication_handler_properties) {
    if(NULL == com_day_crx_security_token_impl_impl_token_authentication_handler_properties){
        return ;
    }
    if(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_crx_security_token_impl_impl_token_authentication_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_crx_security_token_impl_impl_token_authentication_handler_properties->path) {
        config_node_property_string_free(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->path);
        com_day_crx_security_token_impl_impl_token_authentication_handler_properties->path = NULL;
    }
    if (com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_required_attr) {
        config_node_property_drop_down_free(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_required_attr);
        com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_required_attr = NULL;
    }
    if (com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_alternate_url) {
        config_node_property_string_free(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_alternate_url);
        com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_alternate_url = NULL;
    }
    if (com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_encapsulated) {
        config_node_property_boolean_free(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_encapsulated);
        com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_encapsulated = NULL;
    }
    if (com_day_crx_security_token_impl_impl_token_authentication_handler_properties->skip_token_refresh) {
        config_node_property_array_free(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->skip_token_refresh);
        com_day_crx_security_token_impl_impl_token_authentication_handler_properties->skip_token_refresh = NULL;
    }
    free(com_day_crx_security_token_impl_impl_token_authentication_handler_properties);
}

cJSON *com_day_crx_security_token_impl_impl_token_authentication_handler_properties_convertToJSON(com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t *com_day_crx_security_token_impl_impl_token_authentication_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_crx_security_token_impl_impl_token_authentication_handler_properties->path
    if(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->path) {
    cJSON *path_local_JSON = config_node_property_string_convertToJSON(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->path);
    if(path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path", path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_required_attr
    if(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_required_attr) {
    cJSON *token_required_attr_local_JSON = config_node_property_drop_down_convertToJSON(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_required_attr);
    if(token_required_attr_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "token.required.attr", token_required_attr_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_alternate_url
    if(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_alternate_url) {
    cJSON *token_alternate_url_local_JSON = config_node_property_string_convertToJSON(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_alternate_url);
    if(token_alternate_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "token.alternate.url", token_alternate_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_encapsulated
    if(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_encapsulated) {
    cJSON *token_encapsulated_local_JSON = config_node_property_boolean_convertToJSON(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_encapsulated);
    if(token_encapsulated_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "token.encapsulated", token_encapsulated_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_crx_security_token_impl_impl_token_authentication_handler_properties->skip_token_refresh
    if(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->skip_token_refresh) {
    cJSON *skip_token_refresh_local_JSON = config_node_property_array_convertToJSON(com_day_crx_security_token_impl_impl_token_authentication_handler_properties->skip_token_refresh);
    if(skip_token_refresh_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "skip.token.refresh", skip_token_refresh_local_JSON);
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

com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t *com_day_crx_security_token_impl_impl_token_authentication_handler_properties_parseFromJSON(cJSON *com_day_crx_security_token_impl_impl_token_authentication_handler_propertiesJSON){

    com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t *com_day_crx_security_token_impl_impl_token_authentication_handler_properties_local_var = NULL;

    // define the local variable for com_day_crx_security_token_impl_impl_token_authentication_handler_properties->path
    config_node_property_string_t *path_local_nonprim = NULL;

    // define the local variable for com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_required_attr
    config_node_property_drop_down_t *token_required_attr_local_nonprim = NULL;

    // define the local variable for com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_alternate_url
    config_node_property_string_t *token_alternate_url_local_nonprim = NULL;

    // define the local variable for com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_encapsulated
    config_node_property_boolean_t *token_encapsulated_local_nonprim = NULL;

    // define the local variable for com_day_crx_security_token_impl_impl_token_authentication_handler_properties->skip_token_refresh
    config_node_property_array_t *skip_token_refresh_local_nonprim = NULL;

    // com_day_crx_security_token_impl_impl_token_authentication_handler_properties->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(com_day_crx_security_token_impl_impl_token_authentication_handler_propertiesJSON, "path");
    if (cJSON_IsNull(path)) {
        path = NULL;
    }
    if (path) { 
    path_local_nonprim = config_node_property_string_parseFromJSON(path); //nonprimitive
    }

    // com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_required_attr
    cJSON *token_required_attr = cJSON_GetObjectItemCaseSensitive(com_day_crx_security_token_impl_impl_token_authentication_handler_propertiesJSON, "token.required.attr");
    if (cJSON_IsNull(token_required_attr)) {
        token_required_attr = NULL;
    }
    if (token_required_attr) { 
    token_required_attr_local_nonprim = config_node_property_drop_down_parseFromJSON(token_required_attr); //nonprimitive
    }

    // com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_alternate_url
    cJSON *token_alternate_url = cJSON_GetObjectItemCaseSensitive(com_day_crx_security_token_impl_impl_token_authentication_handler_propertiesJSON, "token.alternate.url");
    if (cJSON_IsNull(token_alternate_url)) {
        token_alternate_url = NULL;
    }
    if (token_alternate_url) { 
    token_alternate_url_local_nonprim = config_node_property_string_parseFromJSON(token_alternate_url); //nonprimitive
    }

    // com_day_crx_security_token_impl_impl_token_authentication_handler_properties->token_encapsulated
    cJSON *token_encapsulated = cJSON_GetObjectItemCaseSensitive(com_day_crx_security_token_impl_impl_token_authentication_handler_propertiesJSON, "token.encapsulated");
    if (cJSON_IsNull(token_encapsulated)) {
        token_encapsulated = NULL;
    }
    if (token_encapsulated) { 
    token_encapsulated_local_nonprim = config_node_property_boolean_parseFromJSON(token_encapsulated); //nonprimitive
    }

    // com_day_crx_security_token_impl_impl_token_authentication_handler_properties->skip_token_refresh
    cJSON *skip_token_refresh = cJSON_GetObjectItemCaseSensitive(com_day_crx_security_token_impl_impl_token_authentication_handler_propertiesJSON, "skip.token.refresh");
    if (cJSON_IsNull(skip_token_refresh)) {
        skip_token_refresh = NULL;
    }
    if (skip_token_refresh) { 
    skip_token_refresh_local_nonprim = config_node_property_array_parseFromJSON(skip_token_refresh); //nonprimitive
    }



    com_day_crx_security_token_impl_impl_token_authentication_handler_properties_local_var = com_day_crx_security_token_impl_impl_token_authentication_handler_properties_create_internal (
        path ? path_local_nonprim : NULL,
        token_required_attr ? token_required_attr_local_nonprim : NULL,
        token_alternate_url ? token_alternate_url_local_nonprim : NULL,
        token_encapsulated ? token_encapsulated_local_nonprim : NULL,
        skip_token_refresh ? skip_token_refresh_local_nonprim : NULL
        );

    if (!com_day_crx_security_token_impl_impl_token_authentication_handler_properties_local_var) {
        goto end;
    }

    return com_day_crx_security_token_impl_impl_token_authentication_handler_properties_local_var;
end:
    if (path_local_nonprim) {
        config_node_property_string_free(path_local_nonprim);
        path_local_nonprim = NULL;
    }
    if (token_required_attr_local_nonprim) {
        config_node_property_drop_down_free(token_required_attr_local_nonprim);
        token_required_attr_local_nonprim = NULL;
    }
    if (token_alternate_url_local_nonprim) {
        config_node_property_string_free(token_alternate_url_local_nonprim);
        token_alternate_url_local_nonprim = NULL;
    }
    if (token_encapsulated_local_nonprim) {
        config_node_property_boolean_free(token_encapsulated_local_nonprim);
        token_encapsulated_local_nonprim = NULL;
    }
    if (skip_token_refresh_local_nonprim) {
        config_node_property_array_free(skip_token_refresh_local_nonprim);
        skip_token_refresh_local_nonprim = NULL;
    }
    return NULL;

}
