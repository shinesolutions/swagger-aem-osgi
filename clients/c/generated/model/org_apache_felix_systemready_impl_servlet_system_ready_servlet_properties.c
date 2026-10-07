#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties.h"



static org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_t *org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_create_internal(
    config_node_property_string_t *osgi_http_whiteboard_servlet_pattern,
    config_node_property_string_t *osgi_http_whiteboard_context_select
    ) {
    org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_t *org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_local_var = malloc(sizeof(org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_t));
    if (!org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_local_var) {
        return NULL;
    }
    memset(org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_local_var, 0, sizeof(org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_t));
    org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_local_var->_library_owned = 1;
    org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_local_var->osgi_http_whiteboard_servlet_pattern = osgi_http_whiteboard_servlet_pattern;
    org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_local_var->osgi_http_whiteboard_context_select = osgi_http_whiteboard_context_select;
    return org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_local_var;
}

__attribute__((deprecated)) org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_t *org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_create(
    config_node_property_string_t *osgi_http_whiteboard_servlet_pattern,
    config_node_property_string_t *osgi_http_whiteboard_context_select
    ) {
    org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_t *result = org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_create_internal (
        osgi_http_whiteboard_servlet_pattern,
        osgi_http_whiteboard_context_select
        );
    if (!result) {
    }
    return result;
}

void org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_free(org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_t *org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties) {
    if(NULL == org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties){
        return ;
    }
    if(org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_servlet_pattern) {
        config_node_property_string_free(org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_servlet_pattern);
        org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_servlet_pattern = NULL;
    }
    if (org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_context_select) {
        config_node_property_string_free(org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_context_select);
        org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_context_select = NULL;
    }
    free(org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties);
}

cJSON *org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_convertToJSON(org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_t *org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_servlet_pattern
    if(org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_servlet_pattern) {
    cJSON *osgi_http_whiteboard_servlet_pattern_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_servlet_pattern);
    if(osgi_http_whiteboard_servlet_pattern_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "osgi.http.whiteboard.servlet.pattern", osgi_http_whiteboard_servlet_pattern_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_context_select
    if(org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_context_select) {
    cJSON *osgi_http_whiteboard_context_select_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_context_select);
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

org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_t *org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_parseFromJSON(cJSON *org_apache_felix_systemready_impl_servlet_system_ready_servlet_propertiesJSON){

    org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_t *org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_local_var = NULL;

    // define the local variable for org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_servlet_pattern
    config_node_property_string_t *osgi_http_whiteboard_servlet_pattern_local_nonprim = NULL;

    // define the local variable for org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_context_select
    config_node_property_string_t *osgi_http_whiteboard_context_select_local_nonprim = NULL;

    // org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_servlet_pattern
    cJSON *osgi_http_whiteboard_servlet_pattern = cJSON_GetObjectItemCaseSensitive(org_apache_felix_systemready_impl_servlet_system_ready_servlet_propertiesJSON, "osgi.http.whiteboard.servlet.pattern");
    if (cJSON_IsNull(osgi_http_whiteboard_servlet_pattern)) {
        osgi_http_whiteboard_servlet_pattern = NULL;
    }
    if (osgi_http_whiteboard_servlet_pattern) { 
    osgi_http_whiteboard_servlet_pattern_local_nonprim = config_node_property_string_parseFromJSON(osgi_http_whiteboard_servlet_pattern); //nonprimitive
    }

    // org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties->osgi_http_whiteboard_context_select
    cJSON *osgi_http_whiteboard_context_select = cJSON_GetObjectItemCaseSensitive(org_apache_felix_systemready_impl_servlet_system_ready_servlet_propertiesJSON, "osgi.http.whiteboard.context.select");
    if (cJSON_IsNull(osgi_http_whiteboard_context_select)) {
        osgi_http_whiteboard_context_select = NULL;
    }
    if (osgi_http_whiteboard_context_select) { 
    osgi_http_whiteboard_context_select_local_nonprim = config_node_property_string_parseFromJSON(osgi_http_whiteboard_context_select); //nonprimitive
    }



    org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_local_var = org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_create_internal (
        osgi_http_whiteboard_servlet_pattern ? osgi_http_whiteboard_servlet_pattern_local_nonprim : NULL,
        osgi_http_whiteboard_context_select ? osgi_http_whiteboard_context_select_local_nonprim : NULL
        );

    if (!org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_local_var) {
        goto end;
    }

    return org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties_local_var;
end:
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
