#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_auth_impl_login_selector_handler_properties.h"



static com_day_cq_auth_impl_login_selector_handler_properties_t *com_day_cq_auth_impl_login_selector_handler_properties_create_internal(
    config_node_property_string_t *path,
    config_node_property_integer_t *service_ranking,
    config_node_property_array_t *auth_loginselector_mappings,
    config_node_property_array_t *auth_loginselector_changepw_mappings,
    config_node_property_string_t *auth_loginselector_defaultloginpage,
    config_node_property_string_t *auth_loginselector_defaultchangepwpage,
    config_node_property_array_t *auth_loginselector_handle,
    config_node_property_boolean_t *auth_loginselector_handle_all_extensions
    ) {
    com_day_cq_auth_impl_login_selector_handler_properties_t *com_day_cq_auth_impl_login_selector_handler_properties_local_var = malloc(sizeof(com_day_cq_auth_impl_login_selector_handler_properties_t));
    if (!com_day_cq_auth_impl_login_selector_handler_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_auth_impl_login_selector_handler_properties_local_var, 0, sizeof(com_day_cq_auth_impl_login_selector_handler_properties_t));
    com_day_cq_auth_impl_login_selector_handler_properties_local_var->_library_owned = 1;
    com_day_cq_auth_impl_login_selector_handler_properties_local_var->path = path;
    com_day_cq_auth_impl_login_selector_handler_properties_local_var->service_ranking = service_ranking;
    com_day_cq_auth_impl_login_selector_handler_properties_local_var->auth_loginselector_mappings = auth_loginselector_mappings;
    com_day_cq_auth_impl_login_selector_handler_properties_local_var->auth_loginselector_changepw_mappings = auth_loginselector_changepw_mappings;
    com_day_cq_auth_impl_login_selector_handler_properties_local_var->auth_loginselector_defaultloginpage = auth_loginselector_defaultloginpage;
    com_day_cq_auth_impl_login_selector_handler_properties_local_var->auth_loginselector_defaultchangepwpage = auth_loginselector_defaultchangepwpage;
    com_day_cq_auth_impl_login_selector_handler_properties_local_var->auth_loginselector_handle = auth_loginselector_handle;
    com_day_cq_auth_impl_login_selector_handler_properties_local_var->auth_loginselector_handle_all_extensions = auth_loginselector_handle_all_extensions;
    return com_day_cq_auth_impl_login_selector_handler_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_auth_impl_login_selector_handler_properties_t *com_day_cq_auth_impl_login_selector_handler_properties_create(
    config_node_property_string_t *path,
    config_node_property_integer_t *service_ranking,
    config_node_property_array_t *auth_loginselector_mappings,
    config_node_property_array_t *auth_loginselector_changepw_mappings,
    config_node_property_string_t *auth_loginselector_defaultloginpage,
    config_node_property_string_t *auth_loginselector_defaultchangepwpage,
    config_node_property_array_t *auth_loginselector_handle,
    config_node_property_boolean_t *auth_loginselector_handle_all_extensions
    ) {
    com_day_cq_auth_impl_login_selector_handler_properties_t *result = com_day_cq_auth_impl_login_selector_handler_properties_create_internal (
        path,
        service_ranking,
        auth_loginselector_mappings,
        auth_loginselector_changepw_mappings,
        auth_loginselector_defaultloginpage,
        auth_loginselector_defaultchangepwpage,
        auth_loginselector_handle,
        auth_loginselector_handle_all_extensions
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_auth_impl_login_selector_handler_properties_free(com_day_cq_auth_impl_login_selector_handler_properties_t *com_day_cq_auth_impl_login_selector_handler_properties) {
    if(NULL == com_day_cq_auth_impl_login_selector_handler_properties){
        return ;
    }
    if(com_day_cq_auth_impl_login_selector_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_auth_impl_login_selector_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_auth_impl_login_selector_handler_properties->path) {
        config_node_property_string_free(com_day_cq_auth_impl_login_selector_handler_properties->path);
        com_day_cq_auth_impl_login_selector_handler_properties->path = NULL;
    }
    if (com_day_cq_auth_impl_login_selector_handler_properties->service_ranking) {
        config_node_property_integer_free(com_day_cq_auth_impl_login_selector_handler_properties->service_ranking);
        com_day_cq_auth_impl_login_selector_handler_properties->service_ranking = NULL;
    }
    if (com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_mappings) {
        config_node_property_array_free(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_mappings);
        com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_mappings = NULL;
    }
    if (com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_changepw_mappings) {
        config_node_property_array_free(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_changepw_mappings);
        com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_changepw_mappings = NULL;
    }
    if (com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultloginpage) {
        config_node_property_string_free(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultloginpage);
        com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultloginpage = NULL;
    }
    if (com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultchangepwpage) {
        config_node_property_string_free(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultchangepwpage);
        com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultchangepwpage = NULL;
    }
    if (com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle) {
        config_node_property_array_free(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle);
        com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle = NULL;
    }
    if (com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle_all_extensions) {
        config_node_property_boolean_free(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle_all_extensions);
        com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle_all_extensions = NULL;
    }
    free(com_day_cq_auth_impl_login_selector_handler_properties);
}

cJSON *com_day_cq_auth_impl_login_selector_handler_properties_convertToJSON(com_day_cq_auth_impl_login_selector_handler_properties_t *com_day_cq_auth_impl_login_selector_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_auth_impl_login_selector_handler_properties->path
    if(com_day_cq_auth_impl_login_selector_handler_properties->path) {
    cJSON *path_local_JSON = config_node_property_string_convertToJSON(com_day_cq_auth_impl_login_selector_handler_properties->path);
    if(path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path", path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_auth_impl_login_selector_handler_properties->service_ranking
    if(com_day_cq_auth_impl_login_selector_handler_properties->service_ranking) {
    cJSON *service_ranking_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_auth_impl_login_selector_handler_properties->service_ranking);
    if(service_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.ranking", service_ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_mappings
    if(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_mappings) {
    cJSON *auth_loginselector_mappings_local_JSON = config_node_property_array_convertToJSON(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_mappings);
    if(auth_loginselector_mappings_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.loginselector.mappings", auth_loginselector_mappings_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_changepw_mappings
    if(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_changepw_mappings) {
    cJSON *auth_loginselector_changepw_mappings_local_JSON = config_node_property_array_convertToJSON(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_changepw_mappings);
    if(auth_loginselector_changepw_mappings_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.loginselector.changepw.mappings", auth_loginselector_changepw_mappings_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultloginpage
    if(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultloginpage) {
    cJSON *auth_loginselector_defaultloginpage_local_JSON = config_node_property_string_convertToJSON(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultloginpage);
    if(auth_loginselector_defaultloginpage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.loginselector.defaultloginpage", auth_loginselector_defaultloginpage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultchangepwpage
    if(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultchangepwpage) {
    cJSON *auth_loginselector_defaultchangepwpage_local_JSON = config_node_property_string_convertToJSON(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultchangepwpage);
    if(auth_loginselector_defaultchangepwpage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.loginselector.defaultchangepwpage", auth_loginselector_defaultchangepwpage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle
    if(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle) {
    cJSON *auth_loginselector_handle_local_JSON = config_node_property_array_convertToJSON(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle);
    if(auth_loginselector_handle_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.loginselector.handle", auth_loginselector_handle_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle_all_extensions
    if(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle_all_extensions) {
    cJSON *auth_loginselector_handle_all_extensions_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle_all_extensions);
    if(auth_loginselector_handle_all_extensions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.loginselector.handle.all.extensions", auth_loginselector_handle_all_extensions_local_JSON);
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

com_day_cq_auth_impl_login_selector_handler_properties_t *com_day_cq_auth_impl_login_selector_handler_properties_parseFromJSON(cJSON *com_day_cq_auth_impl_login_selector_handler_propertiesJSON){

    com_day_cq_auth_impl_login_selector_handler_properties_t *com_day_cq_auth_impl_login_selector_handler_properties_local_var = NULL;

    // define the local variable for com_day_cq_auth_impl_login_selector_handler_properties->path
    config_node_property_string_t *path_local_nonprim = NULL;

    // define the local variable for com_day_cq_auth_impl_login_selector_handler_properties->service_ranking
    config_node_property_integer_t *service_ranking_local_nonprim = NULL;

    // define the local variable for com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_mappings
    config_node_property_array_t *auth_loginselector_mappings_local_nonprim = NULL;

    // define the local variable for com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_changepw_mappings
    config_node_property_array_t *auth_loginselector_changepw_mappings_local_nonprim = NULL;

    // define the local variable for com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultloginpage
    config_node_property_string_t *auth_loginselector_defaultloginpage_local_nonprim = NULL;

    // define the local variable for com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultchangepwpage
    config_node_property_string_t *auth_loginselector_defaultchangepwpage_local_nonprim = NULL;

    // define the local variable for com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle
    config_node_property_array_t *auth_loginselector_handle_local_nonprim = NULL;

    // define the local variable for com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle_all_extensions
    config_node_property_boolean_t *auth_loginselector_handle_all_extensions_local_nonprim = NULL;

    // com_day_cq_auth_impl_login_selector_handler_properties->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(com_day_cq_auth_impl_login_selector_handler_propertiesJSON, "path");
    if (cJSON_IsNull(path)) {
        path = NULL;
    }
    if (path) { 
    path_local_nonprim = config_node_property_string_parseFromJSON(path); //nonprimitive
    }

    // com_day_cq_auth_impl_login_selector_handler_properties->service_ranking
    cJSON *service_ranking = cJSON_GetObjectItemCaseSensitive(com_day_cq_auth_impl_login_selector_handler_propertiesJSON, "service.ranking");
    if (cJSON_IsNull(service_ranking)) {
        service_ranking = NULL;
    }
    if (service_ranking) { 
    service_ranking_local_nonprim = config_node_property_integer_parseFromJSON(service_ranking); //nonprimitive
    }

    // com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_mappings
    cJSON *auth_loginselector_mappings = cJSON_GetObjectItemCaseSensitive(com_day_cq_auth_impl_login_selector_handler_propertiesJSON, "auth.loginselector.mappings");
    if (cJSON_IsNull(auth_loginselector_mappings)) {
        auth_loginselector_mappings = NULL;
    }
    if (auth_loginselector_mappings) { 
    auth_loginselector_mappings_local_nonprim = config_node_property_array_parseFromJSON(auth_loginselector_mappings); //nonprimitive
    }

    // com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_changepw_mappings
    cJSON *auth_loginselector_changepw_mappings = cJSON_GetObjectItemCaseSensitive(com_day_cq_auth_impl_login_selector_handler_propertiesJSON, "auth.loginselector.changepw.mappings");
    if (cJSON_IsNull(auth_loginselector_changepw_mappings)) {
        auth_loginselector_changepw_mappings = NULL;
    }
    if (auth_loginselector_changepw_mappings) { 
    auth_loginselector_changepw_mappings_local_nonprim = config_node_property_array_parseFromJSON(auth_loginselector_changepw_mappings); //nonprimitive
    }

    // com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultloginpage
    cJSON *auth_loginselector_defaultloginpage = cJSON_GetObjectItemCaseSensitive(com_day_cq_auth_impl_login_selector_handler_propertiesJSON, "auth.loginselector.defaultloginpage");
    if (cJSON_IsNull(auth_loginselector_defaultloginpage)) {
        auth_loginselector_defaultloginpage = NULL;
    }
    if (auth_loginselector_defaultloginpage) { 
    auth_loginselector_defaultloginpage_local_nonprim = config_node_property_string_parseFromJSON(auth_loginselector_defaultloginpage); //nonprimitive
    }

    // com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_defaultchangepwpage
    cJSON *auth_loginselector_defaultchangepwpage = cJSON_GetObjectItemCaseSensitive(com_day_cq_auth_impl_login_selector_handler_propertiesJSON, "auth.loginselector.defaultchangepwpage");
    if (cJSON_IsNull(auth_loginselector_defaultchangepwpage)) {
        auth_loginselector_defaultchangepwpage = NULL;
    }
    if (auth_loginselector_defaultchangepwpage) { 
    auth_loginselector_defaultchangepwpage_local_nonprim = config_node_property_string_parseFromJSON(auth_loginselector_defaultchangepwpage); //nonprimitive
    }

    // com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle
    cJSON *auth_loginselector_handle = cJSON_GetObjectItemCaseSensitive(com_day_cq_auth_impl_login_selector_handler_propertiesJSON, "auth.loginselector.handle");
    if (cJSON_IsNull(auth_loginselector_handle)) {
        auth_loginselector_handle = NULL;
    }
    if (auth_loginselector_handle) { 
    auth_loginselector_handle_local_nonprim = config_node_property_array_parseFromJSON(auth_loginselector_handle); //nonprimitive
    }

    // com_day_cq_auth_impl_login_selector_handler_properties->auth_loginselector_handle_all_extensions
    cJSON *auth_loginselector_handle_all_extensions = cJSON_GetObjectItemCaseSensitive(com_day_cq_auth_impl_login_selector_handler_propertiesJSON, "auth.loginselector.handle.all.extensions");
    if (cJSON_IsNull(auth_loginselector_handle_all_extensions)) {
        auth_loginselector_handle_all_extensions = NULL;
    }
    if (auth_loginselector_handle_all_extensions) { 
    auth_loginselector_handle_all_extensions_local_nonprim = config_node_property_boolean_parseFromJSON(auth_loginselector_handle_all_extensions); //nonprimitive
    }



    com_day_cq_auth_impl_login_selector_handler_properties_local_var = com_day_cq_auth_impl_login_selector_handler_properties_create_internal (
        path ? path_local_nonprim : NULL,
        service_ranking ? service_ranking_local_nonprim : NULL,
        auth_loginselector_mappings ? auth_loginselector_mappings_local_nonprim : NULL,
        auth_loginselector_changepw_mappings ? auth_loginselector_changepw_mappings_local_nonprim : NULL,
        auth_loginselector_defaultloginpage ? auth_loginselector_defaultloginpage_local_nonprim : NULL,
        auth_loginselector_defaultchangepwpage ? auth_loginselector_defaultchangepwpage_local_nonprim : NULL,
        auth_loginselector_handle ? auth_loginselector_handle_local_nonprim : NULL,
        auth_loginselector_handle_all_extensions ? auth_loginselector_handle_all_extensions_local_nonprim : NULL
        );

    if (!com_day_cq_auth_impl_login_selector_handler_properties_local_var) {
        goto end;
    }

    return com_day_cq_auth_impl_login_selector_handler_properties_local_var;
end:
    if (path_local_nonprim) {
        config_node_property_string_free(path_local_nonprim);
        path_local_nonprim = NULL;
    }
    if (service_ranking_local_nonprim) {
        config_node_property_integer_free(service_ranking_local_nonprim);
        service_ranking_local_nonprim = NULL;
    }
    if (auth_loginselector_mappings_local_nonprim) {
        config_node_property_array_free(auth_loginselector_mappings_local_nonprim);
        auth_loginselector_mappings_local_nonprim = NULL;
    }
    if (auth_loginselector_changepw_mappings_local_nonprim) {
        config_node_property_array_free(auth_loginselector_changepw_mappings_local_nonprim);
        auth_loginselector_changepw_mappings_local_nonprim = NULL;
    }
    if (auth_loginselector_defaultloginpage_local_nonprim) {
        config_node_property_string_free(auth_loginselector_defaultloginpage_local_nonprim);
        auth_loginselector_defaultloginpage_local_nonprim = NULL;
    }
    if (auth_loginselector_defaultchangepwpage_local_nonprim) {
        config_node_property_string_free(auth_loginselector_defaultchangepwpage_local_nonprim);
        auth_loginselector_defaultchangepwpage_local_nonprim = NULL;
    }
    if (auth_loginselector_handle_local_nonprim) {
        config_node_property_array_free(auth_loginselector_handle_local_nonprim);
        auth_loginselector_handle_local_nonprim = NULL;
    }
    if (auth_loginselector_handle_all_extensions_local_nonprim) {
        config_node_property_boolean_free(auth_loginselector_handle_all_extensions_local_nonprim);
        auth_loginselector_handle_all_extensions_local_nonprim = NULL;
    }
    return NULL;

}
