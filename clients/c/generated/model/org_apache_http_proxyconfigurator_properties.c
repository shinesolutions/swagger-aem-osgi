#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_http_proxyconfigurator_properties.h"



static org_apache_http_proxyconfigurator_properties_t *org_apache_http_proxyconfigurator_properties_create_internal(
    config_node_property_boolean_t *proxy_enabled,
    config_node_property_string_t *proxy_host,
    config_node_property_integer_t *proxy_port,
    config_node_property_string_t *proxy_user,
    config_node_property_string_t *proxy_password,
    config_node_property_array_t *proxy_exceptions
    ) {
    org_apache_http_proxyconfigurator_properties_t *org_apache_http_proxyconfigurator_properties_local_var = malloc(sizeof(org_apache_http_proxyconfigurator_properties_t));
    if (!org_apache_http_proxyconfigurator_properties_local_var) {
        return NULL;
    }
    memset(org_apache_http_proxyconfigurator_properties_local_var, 0, sizeof(org_apache_http_proxyconfigurator_properties_t));
    org_apache_http_proxyconfigurator_properties_local_var->_library_owned = 1;
    org_apache_http_proxyconfigurator_properties_local_var->proxy_enabled = proxy_enabled;
    org_apache_http_proxyconfigurator_properties_local_var->proxy_host = proxy_host;
    org_apache_http_proxyconfigurator_properties_local_var->proxy_port = proxy_port;
    org_apache_http_proxyconfigurator_properties_local_var->proxy_user = proxy_user;
    org_apache_http_proxyconfigurator_properties_local_var->proxy_password = proxy_password;
    org_apache_http_proxyconfigurator_properties_local_var->proxy_exceptions = proxy_exceptions;
    return org_apache_http_proxyconfigurator_properties_local_var;
}

__attribute__((deprecated)) org_apache_http_proxyconfigurator_properties_t *org_apache_http_proxyconfigurator_properties_create(
    config_node_property_boolean_t *proxy_enabled,
    config_node_property_string_t *proxy_host,
    config_node_property_integer_t *proxy_port,
    config_node_property_string_t *proxy_user,
    config_node_property_string_t *proxy_password,
    config_node_property_array_t *proxy_exceptions
    ) {
    org_apache_http_proxyconfigurator_properties_t *result = org_apache_http_proxyconfigurator_properties_create_internal (
        proxy_enabled,
        proxy_host,
        proxy_port,
        proxy_user,
        proxy_password,
        proxy_exceptions
        );
    if (!result) {
    }
    return result;
}

void org_apache_http_proxyconfigurator_properties_free(org_apache_http_proxyconfigurator_properties_t *org_apache_http_proxyconfigurator_properties) {
    if(NULL == org_apache_http_proxyconfigurator_properties){
        return ;
    }
    if(org_apache_http_proxyconfigurator_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_http_proxyconfigurator_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_http_proxyconfigurator_properties->proxy_enabled) {
        config_node_property_boolean_free(org_apache_http_proxyconfigurator_properties->proxy_enabled);
        org_apache_http_proxyconfigurator_properties->proxy_enabled = NULL;
    }
    if (org_apache_http_proxyconfigurator_properties->proxy_host) {
        config_node_property_string_free(org_apache_http_proxyconfigurator_properties->proxy_host);
        org_apache_http_proxyconfigurator_properties->proxy_host = NULL;
    }
    if (org_apache_http_proxyconfigurator_properties->proxy_port) {
        config_node_property_integer_free(org_apache_http_proxyconfigurator_properties->proxy_port);
        org_apache_http_proxyconfigurator_properties->proxy_port = NULL;
    }
    if (org_apache_http_proxyconfigurator_properties->proxy_user) {
        config_node_property_string_free(org_apache_http_proxyconfigurator_properties->proxy_user);
        org_apache_http_proxyconfigurator_properties->proxy_user = NULL;
    }
    if (org_apache_http_proxyconfigurator_properties->proxy_password) {
        config_node_property_string_free(org_apache_http_proxyconfigurator_properties->proxy_password);
        org_apache_http_proxyconfigurator_properties->proxy_password = NULL;
    }
    if (org_apache_http_proxyconfigurator_properties->proxy_exceptions) {
        config_node_property_array_free(org_apache_http_proxyconfigurator_properties->proxy_exceptions);
        org_apache_http_proxyconfigurator_properties->proxy_exceptions = NULL;
    }
    free(org_apache_http_proxyconfigurator_properties);
}

cJSON *org_apache_http_proxyconfigurator_properties_convertToJSON(org_apache_http_proxyconfigurator_properties_t *org_apache_http_proxyconfigurator_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_http_proxyconfigurator_properties->proxy_enabled
    if(org_apache_http_proxyconfigurator_properties->proxy_enabled) {
    cJSON *proxy_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_http_proxyconfigurator_properties->proxy_enabled);
    if(proxy_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "proxy.enabled", proxy_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_http_proxyconfigurator_properties->proxy_host
    if(org_apache_http_proxyconfigurator_properties->proxy_host) {
    cJSON *proxy_host_local_JSON = config_node_property_string_convertToJSON(org_apache_http_proxyconfigurator_properties->proxy_host);
    if(proxy_host_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "proxy.host", proxy_host_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_http_proxyconfigurator_properties->proxy_port
    if(org_apache_http_proxyconfigurator_properties->proxy_port) {
    cJSON *proxy_port_local_JSON = config_node_property_integer_convertToJSON(org_apache_http_proxyconfigurator_properties->proxy_port);
    if(proxy_port_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "proxy.port", proxy_port_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_http_proxyconfigurator_properties->proxy_user
    if(org_apache_http_proxyconfigurator_properties->proxy_user) {
    cJSON *proxy_user_local_JSON = config_node_property_string_convertToJSON(org_apache_http_proxyconfigurator_properties->proxy_user);
    if(proxy_user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "proxy.user", proxy_user_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_http_proxyconfigurator_properties->proxy_password
    if(org_apache_http_proxyconfigurator_properties->proxy_password) {
    cJSON *proxy_password_local_JSON = config_node_property_string_convertToJSON(org_apache_http_proxyconfigurator_properties->proxy_password);
    if(proxy_password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "proxy.password", proxy_password_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_http_proxyconfigurator_properties->proxy_exceptions
    if(org_apache_http_proxyconfigurator_properties->proxy_exceptions) {
    cJSON *proxy_exceptions_local_JSON = config_node_property_array_convertToJSON(org_apache_http_proxyconfigurator_properties->proxy_exceptions);
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

org_apache_http_proxyconfigurator_properties_t *org_apache_http_proxyconfigurator_properties_parseFromJSON(cJSON *org_apache_http_proxyconfigurator_propertiesJSON){

    org_apache_http_proxyconfigurator_properties_t *org_apache_http_proxyconfigurator_properties_local_var = NULL;

    // define the local variable for org_apache_http_proxyconfigurator_properties->proxy_enabled
    config_node_property_boolean_t *proxy_enabled_local_nonprim = NULL;

    // define the local variable for org_apache_http_proxyconfigurator_properties->proxy_host
    config_node_property_string_t *proxy_host_local_nonprim = NULL;

    // define the local variable for org_apache_http_proxyconfigurator_properties->proxy_port
    config_node_property_integer_t *proxy_port_local_nonprim = NULL;

    // define the local variable for org_apache_http_proxyconfigurator_properties->proxy_user
    config_node_property_string_t *proxy_user_local_nonprim = NULL;

    // define the local variable for org_apache_http_proxyconfigurator_properties->proxy_password
    config_node_property_string_t *proxy_password_local_nonprim = NULL;

    // define the local variable for org_apache_http_proxyconfigurator_properties->proxy_exceptions
    config_node_property_array_t *proxy_exceptions_local_nonprim = NULL;

    // org_apache_http_proxyconfigurator_properties->proxy_enabled
    cJSON *proxy_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_http_proxyconfigurator_propertiesJSON, "proxy.enabled");
    if (cJSON_IsNull(proxy_enabled)) {
        proxy_enabled = NULL;
    }
    if (proxy_enabled) { 
    proxy_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(proxy_enabled); //nonprimitive
    }

    // org_apache_http_proxyconfigurator_properties->proxy_host
    cJSON *proxy_host = cJSON_GetObjectItemCaseSensitive(org_apache_http_proxyconfigurator_propertiesJSON, "proxy.host");
    if (cJSON_IsNull(proxy_host)) {
        proxy_host = NULL;
    }
    if (proxy_host) { 
    proxy_host_local_nonprim = config_node_property_string_parseFromJSON(proxy_host); //nonprimitive
    }

    // org_apache_http_proxyconfigurator_properties->proxy_port
    cJSON *proxy_port = cJSON_GetObjectItemCaseSensitive(org_apache_http_proxyconfigurator_propertiesJSON, "proxy.port");
    if (cJSON_IsNull(proxy_port)) {
        proxy_port = NULL;
    }
    if (proxy_port) { 
    proxy_port_local_nonprim = config_node_property_integer_parseFromJSON(proxy_port); //nonprimitive
    }

    // org_apache_http_proxyconfigurator_properties->proxy_user
    cJSON *proxy_user = cJSON_GetObjectItemCaseSensitive(org_apache_http_proxyconfigurator_propertiesJSON, "proxy.user");
    if (cJSON_IsNull(proxy_user)) {
        proxy_user = NULL;
    }
    if (proxy_user) { 
    proxy_user_local_nonprim = config_node_property_string_parseFromJSON(proxy_user); //nonprimitive
    }

    // org_apache_http_proxyconfigurator_properties->proxy_password
    cJSON *proxy_password = cJSON_GetObjectItemCaseSensitive(org_apache_http_proxyconfigurator_propertiesJSON, "proxy.password");
    if (cJSON_IsNull(proxy_password)) {
        proxy_password = NULL;
    }
    if (proxy_password) { 
    proxy_password_local_nonprim = config_node_property_string_parseFromJSON(proxy_password); //nonprimitive
    }

    // org_apache_http_proxyconfigurator_properties->proxy_exceptions
    cJSON *proxy_exceptions = cJSON_GetObjectItemCaseSensitive(org_apache_http_proxyconfigurator_propertiesJSON, "proxy.exceptions");
    if (cJSON_IsNull(proxy_exceptions)) {
        proxy_exceptions = NULL;
    }
    if (proxy_exceptions) { 
    proxy_exceptions_local_nonprim = config_node_property_array_parseFromJSON(proxy_exceptions); //nonprimitive
    }



    org_apache_http_proxyconfigurator_properties_local_var = org_apache_http_proxyconfigurator_properties_create_internal (
        proxy_enabled ? proxy_enabled_local_nonprim : NULL,
        proxy_host ? proxy_host_local_nonprim : NULL,
        proxy_port ? proxy_port_local_nonprim : NULL,
        proxy_user ? proxy_user_local_nonprim : NULL,
        proxy_password ? proxy_password_local_nonprim : NULL,
        proxy_exceptions ? proxy_exceptions_local_nonprim : NULL
        );

    if (!org_apache_http_proxyconfigurator_properties_local_var) {
        goto end;
    }

    return org_apache_http_proxyconfigurator_properties_local_var;
end:
    if (proxy_enabled_local_nonprim) {
        config_node_property_boolean_free(proxy_enabled_local_nonprim);
        proxy_enabled_local_nonprim = NULL;
    }
    if (proxy_host_local_nonprim) {
        config_node_property_string_free(proxy_host_local_nonprim);
        proxy_host_local_nonprim = NULL;
    }
    if (proxy_port_local_nonprim) {
        config_node_property_integer_free(proxy_port_local_nonprim);
        proxy_port_local_nonprim = NULL;
    }
    if (proxy_user_local_nonprim) {
        config_node_property_string_free(proxy_user_local_nonprim);
        proxy_user_local_nonprim = NULL;
    }
    if (proxy_password_local_nonprim) {
        config_node_property_string_free(proxy_password_local_nonprim);
        proxy_password_local_nonprim = NULL;
    }
    if (proxy_exceptions_local_nonprim) {
        config_node_property_array_free(proxy_exceptions_local_nonprim);
        proxy_exceptions_local_nonprim = NULL;
    }
    return NULL;

}
