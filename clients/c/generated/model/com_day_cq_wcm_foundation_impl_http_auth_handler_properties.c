#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_foundation_impl_http_auth_handler_properties.h"



static com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t *com_day_cq_wcm_foundation_impl_http_auth_handler_properties_create_internal(
    config_node_property_string_t *path,
    config_node_property_boolean_t *auth_http_nologin,
    config_node_property_string_t *auth_http_realm,
    config_node_property_string_t *auth_default_loginpage,
    config_node_property_array_t *auth_cred_form,
    config_node_property_array_t *auth_cred_utf8
    ) {
    com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t *com_day_cq_wcm_foundation_impl_http_auth_handler_properties_local_var = malloc(sizeof(com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t));
    if (!com_day_cq_wcm_foundation_impl_http_auth_handler_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_foundation_impl_http_auth_handler_properties_local_var, 0, sizeof(com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t));
    com_day_cq_wcm_foundation_impl_http_auth_handler_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_foundation_impl_http_auth_handler_properties_local_var->path = path;
    com_day_cq_wcm_foundation_impl_http_auth_handler_properties_local_var->auth_http_nologin = auth_http_nologin;
    com_day_cq_wcm_foundation_impl_http_auth_handler_properties_local_var->auth_http_realm = auth_http_realm;
    com_day_cq_wcm_foundation_impl_http_auth_handler_properties_local_var->auth_default_loginpage = auth_default_loginpage;
    com_day_cq_wcm_foundation_impl_http_auth_handler_properties_local_var->auth_cred_form = auth_cred_form;
    com_day_cq_wcm_foundation_impl_http_auth_handler_properties_local_var->auth_cred_utf8 = auth_cred_utf8;
    return com_day_cq_wcm_foundation_impl_http_auth_handler_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t *com_day_cq_wcm_foundation_impl_http_auth_handler_properties_create(
    config_node_property_string_t *path,
    config_node_property_boolean_t *auth_http_nologin,
    config_node_property_string_t *auth_http_realm,
    config_node_property_string_t *auth_default_loginpage,
    config_node_property_array_t *auth_cred_form,
    config_node_property_array_t *auth_cred_utf8
    ) {
    com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t *result = com_day_cq_wcm_foundation_impl_http_auth_handler_properties_create_internal (
        path,
        auth_http_nologin,
        auth_http_realm,
        auth_default_loginpage,
        auth_cred_form,
        auth_cred_utf8
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_foundation_impl_http_auth_handler_properties_free(com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t *com_day_cq_wcm_foundation_impl_http_auth_handler_properties) {
    if(NULL == com_day_cq_wcm_foundation_impl_http_auth_handler_properties){
        return ;
    }
    if(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_foundation_impl_http_auth_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_foundation_impl_http_auth_handler_properties->path) {
        config_node_property_string_free(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->path);
        com_day_cq_wcm_foundation_impl_http_auth_handler_properties->path = NULL;
    }
    if (com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_nologin) {
        config_node_property_boolean_free(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_nologin);
        com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_nologin = NULL;
    }
    if (com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_realm) {
        config_node_property_string_free(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_realm);
        com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_realm = NULL;
    }
    if (com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_default_loginpage) {
        config_node_property_string_free(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_default_loginpage);
        com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_default_loginpage = NULL;
    }
    if (com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_form) {
        config_node_property_array_free(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_form);
        com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_form = NULL;
    }
    if (com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_utf8) {
        config_node_property_array_free(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_utf8);
        com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_utf8 = NULL;
    }
    free(com_day_cq_wcm_foundation_impl_http_auth_handler_properties);
}

cJSON *com_day_cq_wcm_foundation_impl_http_auth_handler_properties_convertToJSON(com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t *com_day_cq_wcm_foundation_impl_http_auth_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_foundation_impl_http_auth_handler_properties->path
    if(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->path) {
    cJSON *path_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->path);
    if(path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path", path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_nologin
    if(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_nologin) {
    cJSON *auth_http_nologin_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_nologin);
    if(auth_http_nologin_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.http.nologin", auth_http_nologin_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_realm
    if(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_realm) {
    cJSON *auth_http_realm_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_realm);
    if(auth_http_realm_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.http.realm", auth_http_realm_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_default_loginpage
    if(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_default_loginpage) {
    cJSON *auth_default_loginpage_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_default_loginpage);
    if(auth_default_loginpage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.default.loginpage", auth_default_loginpage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_form
    if(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_form) {
    cJSON *auth_cred_form_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_form);
    if(auth_cred_form_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.cred.form", auth_cred_form_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_utf8
    if(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_utf8) {
    cJSON *auth_cred_utf8_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_utf8);
    if(auth_cred_utf8_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.cred.utf8", auth_cred_utf8_local_JSON);
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

com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t *com_day_cq_wcm_foundation_impl_http_auth_handler_properties_parseFromJSON(cJSON *com_day_cq_wcm_foundation_impl_http_auth_handler_propertiesJSON){

    com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t *com_day_cq_wcm_foundation_impl_http_auth_handler_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_foundation_impl_http_auth_handler_properties->path
    config_node_property_string_t *path_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_nologin
    config_node_property_boolean_t *auth_http_nologin_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_realm
    config_node_property_string_t *auth_http_realm_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_default_loginpage
    config_node_property_string_t *auth_default_loginpage_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_form
    config_node_property_array_t *auth_cred_form_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_utf8
    config_node_property_array_t *auth_cred_utf8_local_nonprim = NULL;

    // com_day_cq_wcm_foundation_impl_http_auth_handler_properties->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_impl_http_auth_handler_propertiesJSON, "path");
    if (cJSON_IsNull(path)) {
        path = NULL;
    }
    if (path) { 
    path_local_nonprim = config_node_property_string_parseFromJSON(path); //nonprimitive
    }

    // com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_nologin
    cJSON *auth_http_nologin = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_impl_http_auth_handler_propertiesJSON, "auth.http.nologin");
    if (cJSON_IsNull(auth_http_nologin)) {
        auth_http_nologin = NULL;
    }
    if (auth_http_nologin) { 
    auth_http_nologin_local_nonprim = config_node_property_boolean_parseFromJSON(auth_http_nologin); //nonprimitive
    }

    // com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_http_realm
    cJSON *auth_http_realm = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_impl_http_auth_handler_propertiesJSON, "auth.http.realm");
    if (cJSON_IsNull(auth_http_realm)) {
        auth_http_realm = NULL;
    }
    if (auth_http_realm) { 
    auth_http_realm_local_nonprim = config_node_property_string_parseFromJSON(auth_http_realm); //nonprimitive
    }

    // com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_default_loginpage
    cJSON *auth_default_loginpage = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_impl_http_auth_handler_propertiesJSON, "auth.default.loginpage");
    if (cJSON_IsNull(auth_default_loginpage)) {
        auth_default_loginpage = NULL;
    }
    if (auth_default_loginpage) { 
    auth_default_loginpage_local_nonprim = config_node_property_string_parseFromJSON(auth_default_loginpage); //nonprimitive
    }

    // com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_form
    cJSON *auth_cred_form = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_impl_http_auth_handler_propertiesJSON, "auth.cred.form");
    if (cJSON_IsNull(auth_cred_form)) {
        auth_cred_form = NULL;
    }
    if (auth_cred_form) { 
    auth_cred_form_local_nonprim = config_node_property_array_parseFromJSON(auth_cred_form); //nonprimitive
    }

    // com_day_cq_wcm_foundation_impl_http_auth_handler_properties->auth_cred_utf8
    cJSON *auth_cred_utf8 = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_impl_http_auth_handler_propertiesJSON, "auth.cred.utf8");
    if (cJSON_IsNull(auth_cred_utf8)) {
        auth_cred_utf8 = NULL;
    }
    if (auth_cred_utf8) { 
    auth_cred_utf8_local_nonprim = config_node_property_array_parseFromJSON(auth_cred_utf8); //nonprimitive
    }



    com_day_cq_wcm_foundation_impl_http_auth_handler_properties_local_var = com_day_cq_wcm_foundation_impl_http_auth_handler_properties_create_internal (
        path ? path_local_nonprim : NULL,
        auth_http_nologin ? auth_http_nologin_local_nonprim : NULL,
        auth_http_realm ? auth_http_realm_local_nonprim : NULL,
        auth_default_loginpage ? auth_default_loginpage_local_nonprim : NULL,
        auth_cred_form ? auth_cred_form_local_nonprim : NULL,
        auth_cred_utf8 ? auth_cred_utf8_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_foundation_impl_http_auth_handler_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_foundation_impl_http_auth_handler_properties_local_var;
end:
    if (path_local_nonprim) {
        config_node_property_string_free(path_local_nonprim);
        path_local_nonprim = NULL;
    }
    if (auth_http_nologin_local_nonprim) {
        config_node_property_boolean_free(auth_http_nologin_local_nonprim);
        auth_http_nologin_local_nonprim = NULL;
    }
    if (auth_http_realm_local_nonprim) {
        config_node_property_string_free(auth_http_realm_local_nonprim);
        auth_http_realm_local_nonprim = NULL;
    }
    if (auth_default_loginpage_local_nonprim) {
        config_node_property_string_free(auth_default_loginpage_local_nonprim);
        auth_default_loginpage_local_nonprim = NULL;
    }
    if (auth_cred_form_local_nonprim) {
        config_node_property_array_free(auth_cred_form_local_nonprim);
        auth_cred_form_local_nonprim = NULL;
    }
    if (auth_cred_utf8_local_nonprim) {
        config_node_property_array_free(auth_cred_utf8_local_nonprim);
        auth_cred_utf8_local_nonprim = NULL;
    }
    return NULL;

}
