#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_engine_impl_auth_sling_authenticator_properties.h"



static org_apache_sling_engine_impl_auth_sling_authenticator_properties_t *org_apache_sling_engine_impl_auth_sling_authenticator_properties_create_internal(
    config_node_property_string_t *osgi_http_whiteboard_context_select,
    config_node_property_string_t *osgi_http_whiteboard_listener,
    config_node_property_string_t *auth_sudo_cookie,
    config_node_property_string_t *auth_sudo_parameter,
    config_node_property_boolean_t *auth_annonymous,
    config_node_property_array_t *sling_auth_requirements,
    config_node_property_string_t *sling_auth_anonymous_user,
    config_node_property_string_t *sling_auth_anonymous_password,
    config_node_property_drop_down_t *auth_http,
    config_node_property_string_t *auth_http_realm,
    config_node_property_array_t *auth_uri_suffix
    ) {
    org_apache_sling_engine_impl_auth_sling_authenticator_properties_t *org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var = malloc(sizeof(org_apache_sling_engine_impl_auth_sling_authenticator_properties_t));
    if (!org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var, 0, sizeof(org_apache_sling_engine_impl_auth_sling_authenticator_properties_t));
    org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var->_library_owned = 1;
    org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var->osgi_http_whiteboard_context_select = osgi_http_whiteboard_context_select;
    org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var->osgi_http_whiteboard_listener = osgi_http_whiteboard_listener;
    org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var->auth_sudo_cookie = auth_sudo_cookie;
    org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var->auth_sudo_parameter = auth_sudo_parameter;
    org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var->auth_annonymous = auth_annonymous;
    org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var->sling_auth_requirements = sling_auth_requirements;
    org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var->sling_auth_anonymous_user = sling_auth_anonymous_user;
    org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var->sling_auth_anonymous_password = sling_auth_anonymous_password;
    org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var->auth_http = auth_http;
    org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var->auth_http_realm = auth_http_realm;
    org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var->auth_uri_suffix = auth_uri_suffix;
    return org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_engine_impl_auth_sling_authenticator_properties_t *org_apache_sling_engine_impl_auth_sling_authenticator_properties_create(
    config_node_property_string_t *osgi_http_whiteboard_context_select,
    config_node_property_string_t *osgi_http_whiteboard_listener,
    config_node_property_string_t *auth_sudo_cookie,
    config_node_property_string_t *auth_sudo_parameter,
    config_node_property_boolean_t *auth_annonymous,
    config_node_property_array_t *sling_auth_requirements,
    config_node_property_string_t *sling_auth_anonymous_user,
    config_node_property_string_t *sling_auth_anonymous_password,
    config_node_property_drop_down_t *auth_http,
    config_node_property_string_t *auth_http_realm,
    config_node_property_array_t *auth_uri_suffix
    ) {
    org_apache_sling_engine_impl_auth_sling_authenticator_properties_t *result = org_apache_sling_engine_impl_auth_sling_authenticator_properties_create_internal (
        osgi_http_whiteboard_context_select,
        osgi_http_whiteboard_listener,
        auth_sudo_cookie,
        auth_sudo_parameter,
        auth_annonymous,
        sling_auth_requirements,
        sling_auth_anonymous_user,
        sling_auth_anonymous_password,
        auth_http,
        auth_http_realm,
        auth_uri_suffix
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_engine_impl_auth_sling_authenticator_properties_free(org_apache_sling_engine_impl_auth_sling_authenticator_properties_t *org_apache_sling_engine_impl_auth_sling_authenticator_properties) {
    if(NULL == org_apache_sling_engine_impl_auth_sling_authenticator_properties){
        return ;
    }
    if(org_apache_sling_engine_impl_auth_sling_authenticator_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_engine_impl_auth_sling_authenticator_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_context_select) {
        config_node_property_string_free(org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_context_select);
        org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_context_select = NULL;
    }
    if (org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_listener) {
        config_node_property_string_free(org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_listener);
        org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_listener = NULL;
    }
    if (org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_cookie) {
        config_node_property_string_free(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_cookie);
        org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_cookie = NULL;
    }
    if (org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_parameter) {
        config_node_property_string_free(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_parameter);
        org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_parameter = NULL;
    }
    if (org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_annonymous) {
        config_node_property_boolean_free(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_annonymous);
        org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_annonymous = NULL;
    }
    if (org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_requirements) {
        config_node_property_array_free(org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_requirements);
        org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_requirements = NULL;
    }
    if (org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_user) {
        config_node_property_string_free(org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_user);
        org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_user = NULL;
    }
    if (org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_password) {
        config_node_property_string_free(org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_password);
        org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_password = NULL;
    }
    if (org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http) {
        config_node_property_drop_down_free(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http);
        org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http = NULL;
    }
    if (org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http_realm) {
        config_node_property_string_free(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http_realm);
        org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http_realm = NULL;
    }
    if (org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_uri_suffix) {
        config_node_property_array_free(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_uri_suffix);
        org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_uri_suffix = NULL;
    }
    free(org_apache_sling_engine_impl_auth_sling_authenticator_properties);
}

cJSON *org_apache_sling_engine_impl_auth_sling_authenticator_properties_convertToJSON(org_apache_sling_engine_impl_auth_sling_authenticator_properties_t *org_apache_sling_engine_impl_auth_sling_authenticator_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_context_select
    if(org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_context_select) {
    cJSON *osgi_http_whiteboard_context_select_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_context_select);
    if(osgi_http_whiteboard_context_select_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "osgi.http.whiteboard.context.select", osgi_http_whiteboard_context_select_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_listener
    if(org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_listener) {
    cJSON *osgi_http_whiteboard_listener_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_listener);
    if(osgi_http_whiteboard_listener_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "osgi.http.whiteboard.listener", osgi_http_whiteboard_listener_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_cookie
    if(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_cookie) {
    cJSON *auth_sudo_cookie_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_cookie);
    if(auth_sudo_cookie_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.sudo.cookie", auth_sudo_cookie_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_parameter
    if(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_parameter) {
    cJSON *auth_sudo_parameter_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_parameter);
    if(auth_sudo_parameter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.sudo.parameter", auth_sudo_parameter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_annonymous
    if(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_annonymous) {
    cJSON *auth_annonymous_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_annonymous);
    if(auth_annonymous_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.annonymous", auth_annonymous_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_requirements
    if(org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_requirements) {
    cJSON *sling_auth_requirements_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_requirements);
    if(sling_auth_requirements_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.auth.requirements", sling_auth_requirements_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_user
    if(org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_user) {
    cJSON *sling_auth_anonymous_user_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_user);
    if(sling_auth_anonymous_user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.auth.anonymous.user", sling_auth_anonymous_user_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_password
    if(org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_password) {
    cJSON *sling_auth_anonymous_password_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_password);
    if(sling_auth_anonymous_password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.auth.anonymous.password", sling_auth_anonymous_password_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http
    if(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http) {
    cJSON *auth_http_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http);
    if(auth_http_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.http", auth_http_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http_realm
    if(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http_realm) {
    cJSON *auth_http_realm_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http_realm);
    if(auth_http_realm_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.http.realm", auth_http_realm_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_uri_suffix
    if(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_uri_suffix) {
    cJSON *auth_uri_suffix_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_uri_suffix);
    if(auth_uri_suffix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.uri.suffix", auth_uri_suffix_local_JSON);
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

org_apache_sling_engine_impl_auth_sling_authenticator_properties_t *org_apache_sling_engine_impl_auth_sling_authenticator_properties_parseFromJSON(cJSON *org_apache_sling_engine_impl_auth_sling_authenticator_propertiesJSON){

    org_apache_sling_engine_impl_auth_sling_authenticator_properties_t *org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var = NULL;

    // define the local variable for org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_context_select
    config_node_property_string_t *osgi_http_whiteboard_context_select_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_listener
    config_node_property_string_t *osgi_http_whiteboard_listener_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_cookie
    config_node_property_string_t *auth_sudo_cookie_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_parameter
    config_node_property_string_t *auth_sudo_parameter_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_annonymous
    config_node_property_boolean_t *auth_annonymous_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_requirements
    config_node_property_array_t *sling_auth_requirements_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_user
    config_node_property_string_t *sling_auth_anonymous_user_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_password
    config_node_property_string_t *sling_auth_anonymous_password_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http
    config_node_property_drop_down_t *auth_http_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http_realm
    config_node_property_string_t *auth_http_realm_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_uri_suffix
    config_node_property_array_t *auth_uri_suffix_local_nonprim = NULL;

    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_context_select
    cJSON *osgi_http_whiteboard_context_select = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_auth_sling_authenticator_propertiesJSON, "osgi.http.whiteboard.context.select");
    if (cJSON_IsNull(osgi_http_whiteboard_context_select)) {
        osgi_http_whiteboard_context_select = NULL;
    }
    if (osgi_http_whiteboard_context_select) { 
    osgi_http_whiteboard_context_select_local_nonprim = config_node_property_string_parseFromJSON(osgi_http_whiteboard_context_select); //nonprimitive
    }

    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->osgi_http_whiteboard_listener
    cJSON *osgi_http_whiteboard_listener = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_auth_sling_authenticator_propertiesJSON, "osgi.http.whiteboard.listener");
    if (cJSON_IsNull(osgi_http_whiteboard_listener)) {
        osgi_http_whiteboard_listener = NULL;
    }
    if (osgi_http_whiteboard_listener) { 
    osgi_http_whiteboard_listener_local_nonprim = config_node_property_string_parseFromJSON(osgi_http_whiteboard_listener); //nonprimitive
    }

    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_cookie
    cJSON *auth_sudo_cookie = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_auth_sling_authenticator_propertiesJSON, "auth.sudo.cookie");
    if (cJSON_IsNull(auth_sudo_cookie)) {
        auth_sudo_cookie = NULL;
    }
    if (auth_sudo_cookie) { 
    auth_sudo_cookie_local_nonprim = config_node_property_string_parseFromJSON(auth_sudo_cookie); //nonprimitive
    }

    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_sudo_parameter
    cJSON *auth_sudo_parameter = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_auth_sling_authenticator_propertiesJSON, "auth.sudo.parameter");
    if (cJSON_IsNull(auth_sudo_parameter)) {
        auth_sudo_parameter = NULL;
    }
    if (auth_sudo_parameter) { 
    auth_sudo_parameter_local_nonprim = config_node_property_string_parseFromJSON(auth_sudo_parameter); //nonprimitive
    }

    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_annonymous
    cJSON *auth_annonymous = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_auth_sling_authenticator_propertiesJSON, "auth.annonymous");
    if (cJSON_IsNull(auth_annonymous)) {
        auth_annonymous = NULL;
    }
    if (auth_annonymous) { 
    auth_annonymous_local_nonprim = config_node_property_boolean_parseFromJSON(auth_annonymous); //nonprimitive
    }

    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_requirements
    cJSON *sling_auth_requirements = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_auth_sling_authenticator_propertiesJSON, "sling.auth.requirements");
    if (cJSON_IsNull(sling_auth_requirements)) {
        sling_auth_requirements = NULL;
    }
    if (sling_auth_requirements) { 
    sling_auth_requirements_local_nonprim = config_node_property_array_parseFromJSON(sling_auth_requirements); //nonprimitive
    }

    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_user
    cJSON *sling_auth_anonymous_user = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_auth_sling_authenticator_propertiesJSON, "sling.auth.anonymous.user");
    if (cJSON_IsNull(sling_auth_anonymous_user)) {
        sling_auth_anonymous_user = NULL;
    }
    if (sling_auth_anonymous_user) { 
    sling_auth_anonymous_user_local_nonprim = config_node_property_string_parseFromJSON(sling_auth_anonymous_user); //nonprimitive
    }

    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->sling_auth_anonymous_password
    cJSON *sling_auth_anonymous_password = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_auth_sling_authenticator_propertiesJSON, "sling.auth.anonymous.password");
    if (cJSON_IsNull(sling_auth_anonymous_password)) {
        sling_auth_anonymous_password = NULL;
    }
    if (sling_auth_anonymous_password) { 
    sling_auth_anonymous_password_local_nonprim = config_node_property_string_parseFromJSON(sling_auth_anonymous_password); //nonprimitive
    }

    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http
    cJSON *auth_http = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_auth_sling_authenticator_propertiesJSON, "auth.http");
    if (cJSON_IsNull(auth_http)) {
        auth_http = NULL;
    }
    if (auth_http) { 
    auth_http_local_nonprim = config_node_property_drop_down_parseFromJSON(auth_http); //nonprimitive
    }

    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_http_realm
    cJSON *auth_http_realm = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_auth_sling_authenticator_propertiesJSON, "auth.http.realm");
    if (cJSON_IsNull(auth_http_realm)) {
        auth_http_realm = NULL;
    }
    if (auth_http_realm) { 
    auth_http_realm_local_nonprim = config_node_property_string_parseFromJSON(auth_http_realm); //nonprimitive
    }

    // org_apache_sling_engine_impl_auth_sling_authenticator_properties->auth_uri_suffix
    cJSON *auth_uri_suffix = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_auth_sling_authenticator_propertiesJSON, "auth.uri.suffix");
    if (cJSON_IsNull(auth_uri_suffix)) {
        auth_uri_suffix = NULL;
    }
    if (auth_uri_suffix) { 
    auth_uri_suffix_local_nonprim = config_node_property_array_parseFromJSON(auth_uri_suffix); //nonprimitive
    }



    org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var = org_apache_sling_engine_impl_auth_sling_authenticator_properties_create_internal (
        osgi_http_whiteboard_context_select ? osgi_http_whiteboard_context_select_local_nonprim : NULL,
        osgi_http_whiteboard_listener ? osgi_http_whiteboard_listener_local_nonprim : NULL,
        auth_sudo_cookie ? auth_sudo_cookie_local_nonprim : NULL,
        auth_sudo_parameter ? auth_sudo_parameter_local_nonprim : NULL,
        auth_annonymous ? auth_annonymous_local_nonprim : NULL,
        sling_auth_requirements ? sling_auth_requirements_local_nonprim : NULL,
        sling_auth_anonymous_user ? sling_auth_anonymous_user_local_nonprim : NULL,
        sling_auth_anonymous_password ? sling_auth_anonymous_password_local_nonprim : NULL,
        auth_http ? auth_http_local_nonprim : NULL,
        auth_http_realm ? auth_http_realm_local_nonprim : NULL,
        auth_uri_suffix ? auth_uri_suffix_local_nonprim : NULL
        );

    if (!org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var) {
        goto end;
    }

    return org_apache_sling_engine_impl_auth_sling_authenticator_properties_local_var;
end:
    if (osgi_http_whiteboard_context_select_local_nonprim) {
        config_node_property_string_free(osgi_http_whiteboard_context_select_local_nonprim);
        osgi_http_whiteboard_context_select_local_nonprim = NULL;
    }
    if (osgi_http_whiteboard_listener_local_nonprim) {
        config_node_property_string_free(osgi_http_whiteboard_listener_local_nonprim);
        osgi_http_whiteboard_listener_local_nonprim = NULL;
    }
    if (auth_sudo_cookie_local_nonprim) {
        config_node_property_string_free(auth_sudo_cookie_local_nonprim);
        auth_sudo_cookie_local_nonprim = NULL;
    }
    if (auth_sudo_parameter_local_nonprim) {
        config_node_property_string_free(auth_sudo_parameter_local_nonprim);
        auth_sudo_parameter_local_nonprim = NULL;
    }
    if (auth_annonymous_local_nonprim) {
        config_node_property_boolean_free(auth_annonymous_local_nonprim);
        auth_annonymous_local_nonprim = NULL;
    }
    if (sling_auth_requirements_local_nonprim) {
        config_node_property_array_free(sling_auth_requirements_local_nonprim);
        sling_auth_requirements_local_nonprim = NULL;
    }
    if (sling_auth_anonymous_user_local_nonprim) {
        config_node_property_string_free(sling_auth_anonymous_user_local_nonprim);
        sling_auth_anonymous_user_local_nonprim = NULL;
    }
    if (sling_auth_anonymous_password_local_nonprim) {
        config_node_property_string_free(sling_auth_anonymous_password_local_nonprim);
        sling_auth_anonymous_password_local_nonprim = NULL;
    }
    if (auth_http_local_nonprim) {
        config_node_property_drop_down_free(auth_http_local_nonprim);
        auth_http_local_nonprim = NULL;
    }
    if (auth_http_realm_local_nonprim) {
        config_node_property_string_free(auth_http_realm_local_nonprim);
        auth_http_realm_local_nonprim = NULL;
    }
    if (auth_uri_suffix_local_nonprim) {
        config_node_property_array_free(auth_uri_suffix_local_nonprim);
        auth_uri_suffix_local_nonprim = NULL;
    }
    return NULL;

}
