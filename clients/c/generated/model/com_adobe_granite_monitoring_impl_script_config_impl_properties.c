#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_monitoring_impl_script_config_impl_properties.h"



static com_adobe_granite_monitoring_impl_script_config_impl_properties_t *com_adobe_granite_monitoring_impl_script_config_impl_properties_create_internal(
    config_node_property_string_t *script_filename,
    config_node_property_string_t *script_display,
    config_node_property_string_t *script_path,
    config_node_property_array_t *script_platform,
    config_node_property_integer_t *interval,
    config_node_property_string_t *jmxdomain
    ) {
    com_adobe_granite_monitoring_impl_script_config_impl_properties_t *com_adobe_granite_monitoring_impl_script_config_impl_properties_local_var = malloc(sizeof(com_adobe_granite_monitoring_impl_script_config_impl_properties_t));
    if (!com_adobe_granite_monitoring_impl_script_config_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_monitoring_impl_script_config_impl_properties_local_var, 0, sizeof(com_adobe_granite_monitoring_impl_script_config_impl_properties_t));
    com_adobe_granite_monitoring_impl_script_config_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_monitoring_impl_script_config_impl_properties_local_var->script_filename = script_filename;
    com_adobe_granite_monitoring_impl_script_config_impl_properties_local_var->script_display = script_display;
    com_adobe_granite_monitoring_impl_script_config_impl_properties_local_var->script_path = script_path;
    com_adobe_granite_monitoring_impl_script_config_impl_properties_local_var->script_platform = script_platform;
    com_adobe_granite_monitoring_impl_script_config_impl_properties_local_var->interval = interval;
    com_adobe_granite_monitoring_impl_script_config_impl_properties_local_var->jmxdomain = jmxdomain;
    return com_adobe_granite_monitoring_impl_script_config_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_monitoring_impl_script_config_impl_properties_t *com_adobe_granite_monitoring_impl_script_config_impl_properties_create(
    config_node_property_string_t *script_filename,
    config_node_property_string_t *script_display,
    config_node_property_string_t *script_path,
    config_node_property_array_t *script_platform,
    config_node_property_integer_t *interval,
    config_node_property_string_t *jmxdomain
    ) {
    com_adobe_granite_monitoring_impl_script_config_impl_properties_t *result = com_adobe_granite_monitoring_impl_script_config_impl_properties_create_internal (
        script_filename,
        script_display,
        script_path,
        script_platform,
        interval,
        jmxdomain
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_monitoring_impl_script_config_impl_properties_free(com_adobe_granite_monitoring_impl_script_config_impl_properties_t *com_adobe_granite_monitoring_impl_script_config_impl_properties) {
    if(NULL == com_adobe_granite_monitoring_impl_script_config_impl_properties){
        return ;
    }
    if(com_adobe_granite_monitoring_impl_script_config_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_monitoring_impl_script_config_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_monitoring_impl_script_config_impl_properties->script_filename) {
        config_node_property_string_free(com_adobe_granite_monitoring_impl_script_config_impl_properties->script_filename);
        com_adobe_granite_monitoring_impl_script_config_impl_properties->script_filename = NULL;
    }
    if (com_adobe_granite_monitoring_impl_script_config_impl_properties->script_display) {
        config_node_property_string_free(com_adobe_granite_monitoring_impl_script_config_impl_properties->script_display);
        com_adobe_granite_monitoring_impl_script_config_impl_properties->script_display = NULL;
    }
    if (com_adobe_granite_monitoring_impl_script_config_impl_properties->script_path) {
        config_node_property_string_free(com_adobe_granite_monitoring_impl_script_config_impl_properties->script_path);
        com_adobe_granite_monitoring_impl_script_config_impl_properties->script_path = NULL;
    }
    if (com_adobe_granite_monitoring_impl_script_config_impl_properties->script_platform) {
        config_node_property_array_free(com_adobe_granite_monitoring_impl_script_config_impl_properties->script_platform);
        com_adobe_granite_monitoring_impl_script_config_impl_properties->script_platform = NULL;
    }
    if (com_adobe_granite_monitoring_impl_script_config_impl_properties->interval) {
        config_node_property_integer_free(com_adobe_granite_monitoring_impl_script_config_impl_properties->interval);
        com_adobe_granite_monitoring_impl_script_config_impl_properties->interval = NULL;
    }
    if (com_adobe_granite_monitoring_impl_script_config_impl_properties->jmxdomain) {
        config_node_property_string_free(com_adobe_granite_monitoring_impl_script_config_impl_properties->jmxdomain);
        com_adobe_granite_monitoring_impl_script_config_impl_properties->jmxdomain = NULL;
    }
    free(com_adobe_granite_monitoring_impl_script_config_impl_properties);
}

cJSON *com_adobe_granite_monitoring_impl_script_config_impl_properties_convertToJSON(com_adobe_granite_monitoring_impl_script_config_impl_properties_t *com_adobe_granite_monitoring_impl_script_config_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_monitoring_impl_script_config_impl_properties->script_filename
    if(com_adobe_granite_monitoring_impl_script_config_impl_properties->script_filename) {
    cJSON *script_filename_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_monitoring_impl_script_config_impl_properties->script_filename);
    if(script_filename_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "script.filename", script_filename_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_monitoring_impl_script_config_impl_properties->script_display
    if(com_adobe_granite_monitoring_impl_script_config_impl_properties->script_display) {
    cJSON *script_display_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_monitoring_impl_script_config_impl_properties->script_display);
    if(script_display_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "script.display", script_display_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_monitoring_impl_script_config_impl_properties->script_path
    if(com_adobe_granite_monitoring_impl_script_config_impl_properties->script_path) {
    cJSON *script_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_monitoring_impl_script_config_impl_properties->script_path);
    if(script_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "script.path", script_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_monitoring_impl_script_config_impl_properties->script_platform
    if(com_adobe_granite_monitoring_impl_script_config_impl_properties->script_platform) {
    cJSON *script_platform_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_monitoring_impl_script_config_impl_properties->script_platform);
    if(script_platform_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "script.platform", script_platform_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_monitoring_impl_script_config_impl_properties->interval
    if(com_adobe_granite_monitoring_impl_script_config_impl_properties->interval) {
    cJSON *interval_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_monitoring_impl_script_config_impl_properties->interval);
    if(interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "interval", interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_monitoring_impl_script_config_impl_properties->jmxdomain
    if(com_adobe_granite_monitoring_impl_script_config_impl_properties->jmxdomain) {
    cJSON *jmxdomain_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_monitoring_impl_script_config_impl_properties->jmxdomain);
    if(jmxdomain_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jmxdomain", jmxdomain_local_JSON);
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

com_adobe_granite_monitoring_impl_script_config_impl_properties_t *com_adobe_granite_monitoring_impl_script_config_impl_properties_parseFromJSON(cJSON *com_adobe_granite_monitoring_impl_script_config_impl_propertiesJSON){

    com_adobe_granite_monitoring_impl_script_config_impl_properties_t *com_adobe_granite_monitoring_impl_script_config_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_monitoring_impl_script_config_impl_properties->script_filename
    config_node_property_string_t *script_filename_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_monitoring_impl_script_config_impl_properties->script_display
    config_node_property_string_t *script_display_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_monitoring_impl_script_config_impl_properties->script_path
    config_node_property_string_t *script_path_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_monitoring_impl_script_config_impl_properties->script_platform
    config_node_property_array_t *script_platform_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_monitoring_impl_script_config_impl_properties->interval
    config_node_property_integer_t *interval_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_monitoring_impl_script_config_impl_properties->jmxdomain
    config_node_property_string_t *jmxdomain_local_nonprim = NULL;

    // com_adobe_granite_monitoring_impl_script_config_impl_properties->script_filename
    cJSON *script_filename = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_monitoring_impl_script_config_impl_propertiesJSON, "script.filename");
    if (cJSON_IsNull(script_filename)) {
        script_filename = NULL;
    }
    if (script_filename) { 
    script_filename_local_nonprim = config_node_property_string_parseFromJSON(script_filename); //nonprimitive
    }

    // com_adobe_granite_monitoring_impl_script_config_impl_properties->script_display
    cJSON *script_display = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_monitoring_impl_script_config_impl_propertiesJSON, "script.display");
    if (cJSON_IsNull(script_display)) {
        script_display = NULL;
    }
    if (script_display) { 
    script_display_local_nonprim = config_node_property_string_parseFromJSON(script_display); //nonprimitive
    }

    // com_adobe_granite_monitoring_impl_script_config_impl_properties->script_path
    cJSON *script_path = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_monitoring_impl_script_config_impl_propertiesJSON, "script.path");
    if (cJSON_IsNull(script_path)) {
        script_path = NULL;
    }
    if (script_path) { 
    script_path_local_nonprim = config_node_property_string_parseFromJSON(script_path); //nonprimitive
    }

    // com_adobe_granite_monitoring_impl_script_config_impl_properties->script_platform
    cJSON *script_platform = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_monitoring_impl_script_config_impl_propertiesJSON, "script.platform");
    if (cJSON_IsNull(script_platform)) {
        script_platform = NULL;
    }
    if (script_platform) { 
    script_platform_local_nonprim = config_node_property_array_parseFromJSON(script_platform); //nonprimitive
    }

    // com_adobe_granite_monitoring_impl_script_config_impl_properties->interval
    cJSON *interval = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_monitoring_impl_script_config_impl_propertiesJSON, "interval");
    if (cJSON_IsNull(interval)) {
        interval = NULL;
    }
    if (interval) { 
    interval_local_nonprim = config_node_property_integer_parseFromJSON(interval); //nonprimitive
    }

    // com_adobe_granite_monitoring_impl_script_config_impl_properties->jmxdomain
    cJSON *jmxdomain = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_monitoring_impl_script_config_impl_propertiesJSON, "jmxdomain");
    if (cJSON_IsNull(jmxdomain)) {
        jmxdomain = NULL;
    }
    if (jmxdomain) { 
    jmxdomain_local_nonprim = config_node_property_string_parseFromJSON(jmxdomain); //nonprimitive
    }



    com_adobe_granite_monitoring_impl_script_config_impl_properties_local_var = com_adobe_granite_monitoring_impl_script_config_impl_properties_create_internal (
        script_filename ? script_filename_local_nonprim : NULL,
        script_display ? script_display_local_nonprim : NULL,
        script_path ? script_path_local_nonprim : NULL,
        script_platform ? script_platform_local_nonprim : NULL,
        interval ? interval_local_nonprim : NULL,
        jmxdomain ? jmxdomain_local_nonprim : NULL
        );

    if (!com_adobe_granite_monitoring_impl_script_config_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_monitoring_impl_script_config_impl_properties_local_var;
end:
    if (script_filename_local_nonprim) {
        config_node_property_string_free(script_filename_local_nonprim);
        script_filename_local_nonprim = NULL;
    }
    if (script_display_local_nonprim) {
        config_node_property_string_free(script_display_local_nonprim);
        script_display_local_nonprim = NULL;
    }
    if (script_path_local_nonprim) {
        config_node_property_string_free(script_path_local_nonprim);
        script_path_local_nonprim = NULL;
    }
    if (script_platform_local_nonprim) {
        config_node_property_array_free(script_platform_local_nonprim);
        script_platform_local_nonprim = NULL;
    }
    if (interval_local_nonprim) {
        config_node_property_integer_free(interval_local_nonprim);
        interval_local_nonprim = NULL;
    }
    if (jmxdomain_local_nonprim) {
        config_node_property_string_free(jmxdomain_local_nonprim);
        jmxdomain_local_nonprim = NULL;
    }
    return NULL;

}
