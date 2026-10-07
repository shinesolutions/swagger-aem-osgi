#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_commons_httpclient_properties.h"



static com_day_commons_httpclient_properties_t *com_day_commons_httpclient_properties_create_internal(
    config_node_property_boolean_t *proxy_enabled,
    config_node_property_string_t *proxy_host,
    config_node_property_string_t *proxy_user,
    config_node_property_string_t *proxy_password,
    config_node_property_string_t *proxy_ntlm_host,
    config_node_property_string_t *proxy_ntlm_domain,
    config_node_property_array_t *proxy_exceptions
    ) {
    com_day_commons_httpclient_properties_t *com_day_commons_httpclient_properties_local_var = malloc(sizeof(com_day_commons_httpclient_properties_t));
    if (!com_day_commons_httpclient_properties_local_var) {
        return NULL;
    }
    memset(com_day_commons_httpclient_properties_local_var, 0, sizeof(com_day_commons_httpclient_properties_t));
    com_day_commons_httpclient_properties_local_var->_library_owned = 1;
    com_day_commons_httpclient_properties_local_var->proxy_enabled = proxy_enabled;
    com_day_commons_httpclient_properties_local_var->proxy_host = proxy_host;
    com_day_commons_httpclient_properties_local_var->proxy_user = proxy_user;
    com_day_commons_httpclient_properties_local_var->proxy_password = proxy_password;
    com_day_commons_httpclient_properties_local_var->proxy_ntlm_host = proxy_ntlm_host;
    com_day_commons_httpclient_properties_local_var->proxy_ntlm_domain = proxy_ntlm_domain;
    com_day_commons_httpclient_properties_local_var->proxy_exceptions = proxy_exceptions;
    return com_day_commons_httpclient_properties_local_var;
}

__attribute__((deprecated)) com_day_commons_httpclient_properties_t *com_day_commons_httpclient_properties_create(
    config_node_property_boolean_t *proxy_enabled,
    config_node_property_string_t *proxy_host,
    config_node_property_string_t *proxy_user,
    config_node_property_string_t *proxy_password,
    config_node_property_string_t *proxy_ntlm_host,
    config_node_property_string_t *proxy_ntlm_domain,
    config_node_property_array_t *proxy_exceptions
    ) {
    com_day_commons_httpclient_properties_t *result = com_day_commons_httpclient_properties_create_internal (
        proxy_enabled,
        proxy_host,
        proxy_user,
        proxy_password,
        proxy_ntlm_host,
        proxy_ntlm_domain,
        proxy_exceptions
        );
    if (!result) {
    }
    return result;
}

void com_day_commons_httpclient_properties_free(com_day_commons_httpclient_properties_t *com_day_commons_httpclient_properties) {
    if(NULL == com_day_commons_httpclient_properties){
        return ;
    }
    if(com_day_commons_httpclient_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_commons_httpclient_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_commons_httpclient_properties->proxy_enabled) {
        config_node_property_boolean_free(com_day_commons_httpclient_properties->proxy_enabled);
        com_day_commons_httpclient_properties->proxy_enabled = NULL;
    }
    if (com_day_commons_httpclient_properties->proxy_host) {
        config_node_property_string_free(com_day_commons_httpclient_properties->proxy_host);
        com_day_commons_httpclient_properties->proxy_host = NULL;
    }
    if (com_day_commons_httpclient_properties->proxy_user) {
        config_node_property_string_free(com_day_commons_httpclient_properties->proxy_user);
        com_day_commons_httpclient_properties->proxy_user = NULL;
    }
    if (com_day_commons_httpclient_properties->proxy_password) {
        config_node_property_string_free(com_day_commons_httpclient_properties->proxy_password);
        com_day_commons_httpclient_properties->proxy_password = NULL;
    }
    if (com_day_commons_httpclient_properties->proxy_ntlm_host) {
        config_node_property_string_free(com_day_commons_httpclient_properties->proxy_ntlm_host);
        com_day_commons_httpclient_properties->proxy_ntlm_host = NULL;
    }
    if (com_day_commons_httpclient_properties->proxy_ntlm_domain) {
        config_node_property_string_free(com_day_commons_httpclient_properties->proxy_ntlm_domain);
        com_day_commons_httpclient_properties->proxy_ntlm_domain = NULL;
    }
    if (com_day_commons_httpclient_properties->proxy_exceptions) {
        config_node_property_array_free(com_day_commons_httpclient_properties->proxy_exceptions);
        com_day_commons_httpclient_properties->proxy_exceptions = NULL;
    }
    free(com_day_commons_httpclient_properties);
}

cJSON *com_day_commons_httpclient_properties_convertToJSON(com_day_commons_httpclient_properties_t *com_day_commons_httpclient_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_commons_httpclient_properties->proxy_enabled
    if(com_day_commons_httpclient_properties->proxy_enabled) {
    cJSON *proxy_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_commons_httpclient_properties->proxy_enabled);
    if(proxy_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "proxy.enabled", proxy_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_httpclient_properties->proxy_host
    if(com_day_commons_httpclient_properties->proxy_host) {
    cJSON *proxy_host_local_JSON = config_node_property_string_convertToJSON(com_day_commons_httpclient_properties->proxy_host);
    if(proxy_host_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "proxy.host", proxy_host_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_httpclient_properties->proxy_user
    if(com_day_commons_httpclient_properties->proxy_user) {
    cJSON *proxy_user_local_JSON = config_node_property_string_convertToJSON(com_day_commons_httpclient_properties->proxy_user);
    if(proxy_user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "proxy.user", proxy_user_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_httpclient_properties->proxy_password
    if(com_day_commons_httpclient_properties->proxy_password) {
    cJSON *proxy_password_local_JSON = config_node_property_string_convertToJSON(com_day_commons_httpclient_properties->proxy_password);
    if(proxy_password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "proxy.password", proxy_password_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_httpclient_properties->proxy_ntlm_host
    if(com_day_commons_httpclient_properties->proxy_ntlm_host) {
    cJSON *proxy_ntlm_host_local_JSON = config_node_property_string_convertToJSON(com_day_commons_httpclient_properties->proxy_ntlm_host);
    if(proxy_ntlm_host_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "proxy.ntlm.host", proxy_ntlm_host_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_httpclient_properties->proxy_ntlm_domain
    if(com_day_commons_httpclient_properties->proxy_ntlm_domain) {
    cJSON *proxy_ntlm_domain_local_JSON = config_node_property_string_convertToJSON(com_day_commons_httpclient_properties->proxy_ntlm_domain);
    if(proxy_ntlm_domain_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "proxy.ntlm.domain", proxy_ntlm_domain_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_httpclient_properties->proxy_exceptions
    if(com_day_commons_httpclient_properties->proxy_exceptions) {
    cJSON *proxy_exceptions_local_JSON = config_node_property_array_convertToJSON(com_day_commons_httpclient_properties->proxy_exceptions);
    if(proxy_exceptions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "proxy.exceptions", proxy_exceptions_local_JSON);
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

com_day_commons_httpclient_properties_t *com_day_commons_httpclient_properties_parseFromJSON(cJSON *com_day_commons_httpclient_propertiesJSON){

    com_day_commons_httpclient_properties_t *com_day_commons_httpclient_properties_local_var = NULL;

    // define the local variable for com_day_commons_httpclient_properties->proxy_enabled
    config_node_property_boolean_t *proxy_enabled_local_nonprim = NULL;

    // define the local variable for com_day_commons_httpclient_properties->proxy_host
    config_node_property_string_t *proxy_host_local_nonprim = NULL;

    // define the local variable for com_day_commons_httpclient_properties->proxy_user
    config_node_property_string_t *proxy_user_local_nonprim = NULL;

    // define the local variable for com_day_commons_httpclient_properties->proxy_password
    config_node_property_string_t *proxy_password_local_nonprim = NULL;

    // define the local variable for com_day_commons_httpclient_properties->proxy_ntlm_host
    config_node_property_string_t *proxy_ntlm_host_local_nonprim = NULL;

    // define the local variable for com_day_commons_httpclient_properties->proxy_ntlm_domain
    config_node_property_string_t *proxy_ntlm_domain_local_nonprim = NULL;

    // define the local variable for com_day_commons_httpclient_properties->proxy_exceptions
    config_node_property_array_t *proxy_exceptions_local_nonprim = NULL;

    // com_day_commons_httpclient_properties->proxy_enabled
    cJSON *proxy_enabled = cJSON_GetObjectItemCaseSensitive(com_day_commons_httpclient_propertiesJSON, "proxy.enabled");
    if (cJSON_IsNull(proxy_enabled)) {
        proxy_enabled = NULL;
    }
    if (proxy_enabled) { 
    proxy_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(proxy_enabled); //nonprimitive
    }

    // com_day_commons_httpclient_properties->proxy_host
    cJSON *proxy_host = cJSON_GetObjectItemCaseSensitive(com_day_commons_httpclient_propertiesJSON, "proxy.host");
    if (cJSON_IsNull(proxy_host)) {
        proxy_host = NULL;
    }
    if (proxy_host) { 
    proxy_host_local_nonprim = config_node_property_string_parseFromJSON(proxy_host); //nonprimitive
    }

    // com_day_commons_httpclient_properties->proxy_user
    cJSON *proxy_user = cJSON_GetObjectItemCaseSensitive(com_day_commons_httpclient_propertiesJSON, "proxy.user");
    if (cJSON_IsNull(proxy_user)) {
        proxy_user = NULL;
    }
    if (proxy_user) { 
    proxy_user_local_nonprim = config_node_property_string_parseFromJSON(proxy_user); //nonprimitive
    }

    // com_day_commons_httpclient_properties->proxy_password
    cJSON *proxy_password = cJSON_GetObjectItemCaseSensitive(com_day_commons_httpclient_propertiesJSON, "proxy.password");
    if (cJSON_IsNull(proxy_password)) {
        proxy_password = NULL;
    }
    if (proxy_password) { 
    proxy_password_local_nonprim = config_node_property_string_parseFromJSON(proxy_password); //nonprimitive
    }

    // com_day_commons_httpclient_properties->proxy_ntlm_host
    cJSON *proxy_ntlm_host = cJSON_GetObjectItemCaseSensitive(com_day_commons_httpclient_propertiesJSON, "proxy.ntlm.host");
    if (cJSON_IsNull(proxy_ntlm_host)) {
        proxy_ntlm_host = NULL;
    }
    if (proxy_ntlm_host) { 
    proxy_ntlm_host_local_nonprim = config_node_property_string_parseFromJSON(proxy_ntlm_host); //nonprimitive
    }

    // com_day_commons_httpclient_properties->proxy_ntlm_domain
    cJSON *proxy_ntlm_domain = cJSON_GetObjectItemCaseSensitive(com_day_commons_httpclient_propertiesJSON, "proxy.ntlm.domain");
    if (cJSON_IsNull(proxy_ntlm_domain)) {
        proxy_ntlm_domain = NULL;
    }
    if (proxy_ntlm_domain) { 
    proxy_ntlm_domain_local_nonprim = config_node_property_string_parseFromJSON(proxy_ntlm_domain); //nonprimitive
    }

    // com_day_commons_httpclient_properties->proxy_exceptions
    cJSON *proxy_exceptions = cJSON_GetObjectItemCaseSensitive(com_day_commons_httpclient_propertiesJSON, "proxy.exceptions");
    if (cJSON_IsNull(proxy_exceptions)) {
        proxy_exceptions = NULL;
    }
    if (proxy_exceptions) { 
    proxy_exceptions_local_nonprim = config_node_property_array_parseFromJSON(proxy_exceptions); //nonprimitive
    }



    com_day_commons_httpclient_properties_local_var = com_day_commons_httpclient_properties_create_internal (
        proxy_enabled ? proxy_enabled_local_nonprim : NULL,
        proxy_host ? proxy_host_local_nonprim : NULL,
        proxy_user ? proxy_user_local_nonprim : NULL,
        proxy_password ? proxy_password_local_nonprim : NULL,
        proxy_ntlm_host ? proxy_ntlm_host_local_nonprim : NULL,
        proxy_ntlm_domain ? proxy_ntlm_domain_local_nonprim : NULL,
        proxy_exceptions ? proxy_exceptions_local_nonprim : NULL
        );

    if (!com_day_commons_httpclient_properties_local_var) {
        goto end;
    }

    return com_day_commons_httpclient_properties_local_var;
end:
    if (proxy_enabled_local_nonprim) {
        config_node_property_boolean_free(proxy_enabled_local_nonprim);
        proxy_enabled_local_nonprim = NULL;
    }
    if (proxy_host_local_nonprim) {
        config_node_property_string_free(proxy_host_local_nonprim);
        proxy_host_local_nonprim = NULL;
    }
    if (proxy_user_local_nonprim) {
        config_node_property_string_free(proxy_user_local_nonprim);
        proxy_user_local_nonprim = NULL;
    }
    if (proxy_password_local_nonprim) {
        config_node_property_string_free(proxy_password_local_nonprim);
        proxy_password_local_nonprim = NULL;
    }
    if (proxy_ntlm_host_local_nonprim) {
        config_node_property_string_free(proxy_ntlm_host_local_nonprim);
        proxy_ntlm_host_local_nonprim = NULL;
    }
    if (proxy_ntlm_domain_local_nonprim) {
        config_node_property_string_free(proxy_ntlm_domain_local_nonprim);
        proxy_ntlm_domain_local_nonprim = NULL;
    }
    if (proxy_exceptions_local_nonprim) {
        config_node_property_array_free(proxy_exceptions_local_nonprim);
        proxy_exceptions_local_nonprim = NULL;
    }
    return NULL;

}
