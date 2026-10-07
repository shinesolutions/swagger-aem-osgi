#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties.h"



static org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_t *org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_create_internal(
    config_node_property_integer_t *max_size
    ) {
    org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_t *org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_local_var = malloc(sizeof(org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_t));
    if (!org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_local_var) {
        return NULL;
    }
    memset(org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_local_var, 0, sizeof(org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_t));
    org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_local_var->_library_owned = 1;
    org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_local_var->max_size = max_size;
    return org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_local_var;
}

__attribute__((deprecated)) org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_t *org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_create(
    config_node_property_integer_t *max_size
    ) {
    org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_t *result = org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_create_internal (
        max_size
        );
    if (!result) {
    }
    return result;
}

void org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_free(org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_t *org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties) {
    if(NULL == org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties){
        return ;
    }
    if(org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties->max_size) {
        config_node_property_integer_free(org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties->max_size);
        org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties->max_size = NULL;
    }
    free(org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties);
}

cJSON *org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_convertToJSON(org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_t *org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties->max_size
    if(org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties->max_size) {
    cJSON *max_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties->max_size);
    if(max_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "max.size", max_size_local_JSON);
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

org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_t *org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_parseFromJSON(cJSON *org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_propertiesJSON){

    org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_t *org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_local_var = NULL;

    // define the local variable for org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties->max_size
    config_node_property_integer_t *max_size_local_nonprim = NULL;

    // org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties->max_size
    cJSON *max_size = cJSON_GetObjectItemCaseSensitive(org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_propertiesJSON, "max.size");
    if (cJSON_IsNull(max_size)) {
        max_size = NULL;
    }
    if (max_size) { 
    max_size_local_nonprim = config_node_property_integer_parseFromJSON(max_size); //nonprimitive
    }



    org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_local_var = org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_create_internal (
        max_size ? max_size_local_nonprim : NULL
        );

    if (!org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_local_var) {
        goto end;
    }

    return org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties_local_var;
end:
    if (max_size_local_nonprim) {
        config_node_property_integer_free(max_size_local_nonprim);
        max_size_local_nonprim = NULL;
    }
    return NULL;

}
