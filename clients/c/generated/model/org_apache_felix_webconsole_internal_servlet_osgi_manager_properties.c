#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_felix_webconsole_internal_servlet_osgi_manager_properties.h"



static org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t *org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_create_internal(
    config_node_property_string_t *manager_root,
    config_node_property_string_t *http_service_filter,
    config_node_property_string_t *default_render,
    config_node_property_string_t *realm,
    config_node_property_string_t *username,
    config_node_property_string_t *password,
    config_node_property_string_t *category,
    config_node_property_string_t *locale,
    config_node_property_drop_down_t *loglevel,
    config_node_property_drop_down_t *plugins
    ) {
    org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t *org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var = malloc(sizeof(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t));
    if (!org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var) {
        return NULL;
    }
    memset(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var, 0, sizeof(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t));
    org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var->_library_owned = 1;
    org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var->manager_root = manager_root;
    org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var->http_service_filter = http_service_filter;
    org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var->default_render = default_render;
    org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var->realm = realm;
    org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var->username = username;
    org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var->password = password;
    org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var->category = category;
    org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var->locale = locale;
    org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var->loglevel = loglevel;
    org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var->plugins = plugins;
    return org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var;
}

__attribute__((deprecated)) org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t *org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_create(
    config_node_property_string_t *manager_root,
    config_node_property_string_t *http_service_filter,
    config_node_property_string_t *default_render,
    config_node_property_string_t *realm,
    config_node_property_string_t *username,
    config_node_property_string_t *password,
    config_node_property_string_t *category,
    config_node_property_string_t *locale,
    config_node_property_drop_down_t *loglevel,
    config_node_property_drop_down_t *plugins
    ) {
    org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t *result = org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_create_internal (
        manager_root,
        http_service_filter,
        default_render,
        realm,
        username,
        password,
        category,
        locale,
        loglevel,
        plugins
        );
    if (!result) {
    }
    return result;
}

void org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_free(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t *org_apache_felix_webconsole_internal_servlet_osgi_manager_properties) {
    if(NULL == org_apache_felix_webconsole_internal_servlet_osgi_manager_properties){
        return ;
    }
    if(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->manager_root) {
        config_node_property_string_free(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->manager_root);
        org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->manager_root = NULL;
    }
    if (org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->http_service_filter) {
        config_node_property_string_free(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->http_service_filter);
        org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->http_service_filter = NULL;
    }
    if (org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->default_render) {
        config_node_property_string_free(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->default_render);
        org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->default_render = NULL;
    }
    if (org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->realm) {
        config_node_property_string_free(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->realm);
        org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->realm = NULL;
    }
    if (org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->username) {
        config_node_property_string_free(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->username);
        org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->username = NULL;
    }
    if (org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->password) {
        config_node_property_string_free(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->password);
        org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->password = NULL;
    }
    if (org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->category) {
        config_node_property_string_free(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->category);
        org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->category = NULL;
    }
    if (org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->locale) {
        config_node_property_string_free(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->locale);
        org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->locale = NULL;
    }
    if (org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->loglevel) {
        config_node_property_drop_down_free(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->loglevel);
        org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->loglevel = NULL;
    }
    if (org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->plugins) {
        config_node_property_drop_down_free(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->plugins);
        org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->plugins = NULL;
    }
    free(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties);
}

cJSON *org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_convertToJSON(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t *org_apache_felix_webconsole_internal_servlet_osgi_manager_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->manager_root
    if(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->manager_root) {
    cJSON *manager_root_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->manager_root);
    if(manager_root_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "manager.root", manager_root_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->http_service_filter
    if(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->http_service_filter) {
    cJSON *http_service_filter_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->http_service_filter);
    if(http_service_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "http.service.filter", http_service_filter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->default_render
    if(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->default_render) {
    cJSON *default_render_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->default_render);
    if(default_render_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.render", default_render_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->realm
    if(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->realm) {
    cJSON *realm_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->realm);
    if(realm_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "realm", realm_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->username
    if(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->username) {
    cJSON *username_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->username);
    if(username_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "username", username_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->password
    if(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->password) {
    cJSON *password_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->password);
    if(password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "password", password_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->category
    if(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->category) {
    cJSON *category_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->category);
    if(category_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "category", category_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->locale
    if(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->locale) {
    cJSON *locale_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->locale);
    if(locale_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "locale", locale_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->loglevel
    if(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->loglevel) {
    cJSON *loglevel_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->loglevel);
    if(loglevel_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "loglevel", loglevel_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->plugins
    if(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->plugins) {
    cJSON *plugins_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->plugins);
    if(plugins_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "plugins", plugins_local_JSON);
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

org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t *org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_parseFromJSON(cJSON *org_apache_felix_webconsole_internal_servlet_osgi_manager_propertiesJSON){

    org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t *org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var = NULL;

    // define the local variable for org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->manager_root
    config_node_property_string_t *manager_root_local_nonprim = NULL;

    // define the local variable for org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->http_service_filter
    config_node_property_string_t *http_service_filter_local_nonprim = NULL;

    // define the local variable for org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->default_render
    config_node_property_string_t *default_render_local_nonprim = NULL;

    // define the local variable for org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->realm
    config_node_property_string_t *realm_local_nonprim = NULL;

    // define the local variable for org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->username
    config_node_property_string_t *username_local_nonprim = NULL;

    // define the local variable for org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->password
    config_node_property_string_t *password_local_nonprim = NULL;

    // define the local variable for org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->category
    config_node_property_string_t *category_local_nonprim = NULL;

    // define the local variable for org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->locale
    config_node_property_string_t *locale_local_nonprim = NULL;

    // define the local variable for org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->loglevel
    config_node_property_drop_down_t *loglevel_local_nonprim = NULL;

    // define the local variable for org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->plugins
    config_node_property_drop_down_t *plugins_local_nonprim = NULL;

    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->manager_root
    cJSON *manager_root = cJSON_GetObjectItemCaseSensitive(org_apache_felix_webconsole_internal_servlet_osgi_manager_propertiesJSON, "manager.root");
    if (cJSON_IsNull(manager_root)) {
        manager_root = NULL;
    }
    if (manager_root) { 
    manager_root_local_nonprim = config_node_property_string_parseFromJSON(manager_root); //nonprimitive
    }

    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->http_service_filter
    cJSON *http_service_filter = cJSON_GetObjectItemCaseSensitive(org_apache_felix_webconsole_internal_servlet_osgi_manager_propertiesJSON, "http.service.filter");
    if (cJSON_IsNull(http_service_filter)) {
        http_service_filter = NULL;
    }
    if (http_service_filter) { 
    http_service_filter_local_nonprim = config_node_property_string_parseFromJSON(http_service_filter); //nonprimitive
    }

    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->default_render
    cJSON *default_render = cJSON_GetObjectItemCaseSensitive(org_apache_felix_webconsole_internal_servlet_osgi_manager_propertiesJSON, "default.render");
    if (cJSON_IsNull(default_render)) {
        default_render = NULL;
    }
    if (default_render) { 
    default_render_local_nonprim = config_node_property_string_parseFromJSON(default_render); //nonprimitive
    }

    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->realm
    cJSON *realm = cJSON_GetObjectItemCaseSensitive(org_apache_felix_webconsole_internal_servlet_osgi_manager_propertiesJSON, "realm");
    if (cJSON_IsNull(realm)) {
        realm = NULL;
    }
    if (realm) { 
    realm_local_nonprim = config_node_property_string_parseFromJSON(realm); //nonprimitive
    }

    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(org_apache_felix_webconsole_internal_servlet_osgi_manager_propertiesJSON, "username");
    if (cJSON_IsNull(username)) {
        username = NULL;
    }
    if (username) { 
    username_local_nonprim = config_node_property_string_parseFromJSON(username); //nonprimitive
    }

    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->password
    cJSON *password = cJSON_GetObjectItemCaseSensitive(org_apache_felix_webconsole_internal_servlet_osgi_manager_propertiesJSON, "password");
    if (cJSON_IsNull(password)) {
        password = NULL;
    }
    if (password) { 
    password_local_nonprim = config_node_property_string_parseFromJSON(password); //nonprimitive
    }

    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->category
    cJSON *category = cJSON_GetObjectItemCaseSensitive(org_apache_felix_webconsole_internal_servlet_osgi_manager_propertiesJSON, "category");
    if (cJSON_IsNull(category)) {
        category = NULL;
    }
    if (category) { 
    category_local_nonprim = config_node_property_string_parseFromJSON(category); //nonprimitive
    }

    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->locale
    cJSON *locale = cJSON_GetObjectItemCaseSensitive(org_apache_felix_webconsole_internal_servlet_osgi_manager_propertiesJSON, "locale");
    if (cJSON_IsNull(locale)) {
        locale = NULL;
    }
    if (locale) { 
    locale_local_nonprim = config_node_property_string_parseFromJSON(locale); //nonprimitive
    }

    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->loglevel
    cJSON *loglevel = cJSON_GetObjectItemCaseSensitive(org_apache_felix_webconsole_internal_servlet_osgi_manager_propertiesJSON, "loglevel");
    if (cJSON_IsNull(loglevel)) {
        loglevel = NULL;
    }
    if (loglevel) { 
    loglevel_local_nonprim = config_node_property_drop_down_parseFromJSON(loglevel); //nonprimitive
    }

    // org_apache_felix_webconsole_internal_servlet_osgi_manager_properties->plugins
    cJSON *plugins = cJSON_GetObjectItemCaseSensitive(org_apache_felix_webconsole_internal_servlet_osgi_manager_propertiesJSON, "plugins");
    if (cJSON_IsNull(plugins)) {
        plugins = NULL;
    }
    if (plugins) { 
    plugins_local_nonprim = config_node_property_drop_down_parseFromJSON(plugins); //nonprimitive
    }



    org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var = org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_create_internal (
        manager_root ? manager_root_local_nonprim : NULL,
        http_service_filter ? http_service_filter_local_nonprim : NULL,
        default_render ? default_render_local_nonprim : NULL,
        realm ? realm_local_nonprim : NULL,
        username ? username_local_nonprim : NULL,
        password ? password_local_nonprim : NULL,
        category ? category_local_nonprim : NULL,
        locale ? locale_local_nonprim : NULL,
        loglevel ? loglevel_local_nonprim : NULL,
        plugins ? plugins_local_nonprim : NULL
        );

    if (!org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var) {
        goto end;
    }

    return org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_local_var;
end:
    if (manager_root_local_nonprim) {
        config_node_property_string_free(manager_root_local_nonprim);
        manager_root_local_nonprim = NULL;
    }
    if (http_service_filter_local_nonprim) {
        config_node_property_string_free(http_service_filter_local_nonprim);
        http_service_filter_local_nonprim = NULL;
    }
    if (default_render_local_nonprim) {
        config_node_property_string_free(default_render_local_nonprim);
        default_render_local_nonprim = NULL;
    }
    if (realm_local_nonprim) {
        config_node_property_string_free(realm_local_nonprim);
        realm_local_nonprim = NULL;
    }
    if (username_local_nonprim) {
        config_node_property_string_free(username_local_nonprim);
        username_local_nonprim = NULL;
    }
    if (password_local_nonprim) {
        config_node_property_string_free(password_local_nonprim);
        password_local_nonprim = NULL;
    }
    if (category_local_nonprim) {
        config_node_property_string_free(category_local_nonprim);
        category_local_nonprim = NULL;
    }
    if (locale_local_nonprim) {
        config_node_property_string_free(locale_local_nonprim);
        locale_local_nonprim = NULL;
    }
    if (loglevel_local_nonprim) {
        config_node_property_drop_down_free(loglevel_local_nonprim);
        loglevel_local_nonprim = NULL;
    }
    if (plugins_local_nonprim) {
        config_node_property_drop_down_free(plugins_local_nonprim);
        plugins_local_nonprim = NULL;
    }
    return NULL;

}
