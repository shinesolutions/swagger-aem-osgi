#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties.h"



static com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_create_internal(
    config_node_property_string_t *oauth_issuer,
    config_node_property_string_t *oauth_access_token_expires_in,
    config_node_property_string_t *osgi_http_whiteboard_servlet_pattern,
    config_node_property_string_t *osgi_http_whiteboard_context_select
    ) {
    com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_local_var = malloc(sizeof(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_t));
    if (!com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_local_var, 0, sizeof(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_t));
    com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_local_var->_library_owned = 1;
    com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_local_var->oauth_issuer = oauth_issuer;
    com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_local_var->oauth_access_token_expires_in = oauth_access_token_expires_in;
    com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_local_var->osgi_http_whiteboard_servlet_pattern = osgi_http_whiteboard_servlet_pattern;
    com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_local_var->osgi_http_whiteboard_context_select = osgi_http_whiteboard_context_select;
    return com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_create(
    config_node_property_string_t *oauth_issuer,
    config_node_property_string_t *oauth_access_token_expires_in,
    config_node_property_string_t *osgi_http_whiteboard_servlet_pattern,
    config_node_property_string_t *osgi_http_whiteboard_context_select
    ) {
    com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_t *result = com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_create_internal (
        oauth_issuer,
        oauth_access_token_expires_in,
        osgi_http_whiteboard_servlet_pattern,
        osgi_http_whiteboard_context_select
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_free(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties) {
    if(NULL == com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties){
        return ;
    }
    if(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_issuer) {
        config_node_property_string_free(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_issuer);
        com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_issuer = NULL;
    }
    if (com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_access_token_expires_in) {
        config_node_property_string_free(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_access_token_expires_in);
        com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_access_token_expires_in = NULL;
    }
    if (com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_servlet_pattern) {
        config_node_property_string_free(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_servlet_pattern);
        com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_servlet_pattern = NULL;
    }
    if (com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_context_select) {
        config_node_property_string_free(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_context_select);
        com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_context_select = NULL;
    }
    free(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties);
}

cJSON *com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_convertToJSON(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_issuer
    if(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_issuer) {
    cJSON *oauth_issuer_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_issuer);
    if(oauth_issuer_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.issuer", oauth_issuer_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_access_token_expires_in
    if(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_access_token_expires_in) {
    cJSON *oauth_access_token_expires_in_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_access_token_expires_in);
    if(oauth_access_token_expires_in_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.access.token.expires.in", oauth_access_token_expires_in_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_servlet_pattern
    if(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_servlet_pattern) {
    cJSON *osgi_http_whiteboard_servlet_pattern_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_servlet_pattern);
    if(osgi_http_whiteboard_servlet_pattern_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "osgi.http.whiteboard.servlet.pattern", osgi_http_whiteboard_servlet_pattern_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_context_select
    if(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_context_select) {
    cJSON *osgi_http_whiteboard_context_select_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_context_select);
    if(osgi_http_whiteboard_context_select_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "osgi.http.whiteboard.context.select", osgi_http_whiteboard_context_select_local_JSON);
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

com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_parseFromJSON(cJSON *com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_propertiesJSON){

    com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_issuer
    config_node_property_string_t *oauth_issuer_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_access_token_expires_in
    config_node_property_string_t *oauth_access_token_expires_in_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_servlet_pattern
    config_node_property_string_t *osgi_http_whiteboard_servlet_pattern_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_context_select
    config_node_property_string_t *osgi_http_whiteboard_context_select_local_nonprim = NULL;

    // com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_issuer
    cJSON *oauth_issuer = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_propertiesJSON, "oauth.issuer");
    if (cJSON_IsNull(oauth_issuer)) {
        oauth_issuer = NULL;
    }
    if (oauth_issuer) { 
    oauth_issuer_local_nonprim = config_node_property_string_parseFromJSON(oauth_issuer); //nonprimitive
    }

    // com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->oauth_access_token_expires_in
    cJSON *oauth_access_token_expires_in = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_propertiesJSON, "oauth.access.token.expires.in");
    if (cJSON_IsNull(oauth_access_token_expires_in)) {
        oauth_access_token_expires_in = NULL;
    }
    if (oauth_access_token_expires_in) { 
    oauth_access_token_expires_in_local_nonprim = config_node_property_string_parseFromJSON(oauth_access_token_expires_in); //nonprimitive
    }

    // com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_servlet_pattern
    cJSON *osgi_http_whiteboard_servlet_pattern = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_propertiesJSON, "osgi.http.whiteboard.servlet.pattern");
    if (cJSON_IsNull(osgi_http_whiteboard_servlet_pattern)) {
        osgi_http_whiteboard_servlet_pattern = NULL;
    }
    if (osgi_http_whiteboard_servlet_pattern) { 
    osgi_http_whiteboard_servlet_pattern_local_nonprim = config_node_property_string_parseFromJSON(osgi_http_whiteboard_servlet_pattern); //nonprimitive
    }

    // com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties->osgi_http_whiteboard_context_select
    cJSON *osgi_http_whiteboard_context_select = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_propertiesJSON, "osgi.http.whiteboard.context.select");
    if (cJSON_IsNull(osgi_http_whiteboard_context_select)) {
        osgi_http_whiteboard_context_select = NULL;
    }
    if (osgi_http_whiteboard_context_select) { 
    osgi_http_whiteboard_context_select_local_nonprim = config_node_property_string_parseFromJSON(osgi_http_whiteboard_context_select); //nonprimitive
    }



    com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_local_var = com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_create_internal (
        oauth_issuer ? oauth_issuer_local_nonprim : NULL,
        oauth_access_token_expires_in ? oauth_access_token_expires_in_local_nonprim : NULL,
        osgi_http_whiteboard_servlet_pattern ? osgi_http_whiteboard_servlet_pattern_local_nonprim : NULL,
        osgi_http_whiteboard_context_select ? osgi_http_whiteboard_context_select_local_nonprim : NULL
        );

    if (!com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties_local_var;
end:
    if (oauth_issuer_local_nonprim) {
        config_node_property_string_free(oauth_issuer_local_nonprim);
        oauth_issuer_local_nonprim = NULL;
    }
    if (oauth_access_token_expires_in_local_nonprim) {
        config_node_property_string_free(oauth_access_token_expires_in_local_nonprim);
        oauth_access_token_expires_in_local_nonprim = NULL;
    }
    if (osgi_http_whiteboard_servlet_pattern_local_nonprim) {
        config_node_property_string_free(osgi_http_whiteboard_servlet_pattern_local_nonprim);
        osgi_http_whiteboard_servlet_pattern_local_nonprim = NULL;
    }
    if (osgi_http_whiteboard_context_select_local_nonprim) {
        config_node_property_string_free(osgi_http_whiteboard_context_select_local_nonprim);
        osgi_http_whiteboard_context_select_local_nonprim = NULL;
    }
    return NULL;

}
