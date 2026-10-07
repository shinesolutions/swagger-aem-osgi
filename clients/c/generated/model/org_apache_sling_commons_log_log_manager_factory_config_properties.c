#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_commons_log_log_manager_factory_config_properties.h"



static org_apache_sling_commons_log_log_manager_factory_config_properties_t *org_apache_sling_commons_log_log_manager_factory_config_properties_create_internal(
    config_node_property_drop_down_t *org_apache_sling_commons_log_level,
    config_node_property_string_t *org_apache_sling_commons_log_file,
    config_node_property_string_t *org_apache_sling_commons_log_pattern,
    config_node_property_array_t *org_apache_sling_commons_log_names,
    config_node_property_boolean_t *org_apache_sling_commons_log_additiv
    ) {
    org_apache_sling_commons_log_log_manager_factory_config_properties_t *org_apache_sling_commons_log_log_manager_factory_config_properties_local_var = malloc(sizeof(org_apache_sling_commons_log_log_manager_factory_config_properties_t));
    if (!org_apache_sling_commons_log_log_manager_factory_config_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_commons_log_log_manager_factory_config_properties_local_var, 0, sizeof(org_apache_sling_commons_log_log_manager_factory_config_properties_t));
    org_apache_sling_commons_log_log_manager_factory_config_properties_local_var->_library_owned = 1;
    org_apache_sling_commons_log_log_manager_factory_config_properties_local_var->org_apache_sling_commons_log_level = org_apache_sling_commons_log_level;
    org_apache_sling_commons_log_log_manager_factory_config_properties_local_var->org_apache_sling_commons_log_file = org_apache_sling_commons_log_file;
    org_apache_sling_commons_log_log_manager_factory_config_properties_local_var->org_apache_sling_commons_log_pattern = org_apache_sling_commons_log_pattern;
    org_apache_sling_commons_log_log_manager_factory_config_properties_local_var->org_apache_sling_commons_log_names = org_apache_sling_commons_log_names;
    org_apache_sling_commons_log_log_manager_factory_config_properties_local_var->org_apache_sling_commons_log_additiv = org_apache_sling_commons_log_additiv;
    return org_apache_sling_commons_log_log_manager_factory_config_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_commons_log_log_manager_factory_config_properties_t *org_apache_sling_commons_log_log_manager_factory_config_properties_create(
    config_node_property_drop_down_t *org_apache_sling_commons_log_level,
    config_node_property_string_t *org_apache_sling_commons_log_file,
    config_node_property_string_t *org_apache_sling_commons_log_pattern,
    config_node_property_array_t *org_apache_sling_commons_log_names,
    config_node_property_boolean_t *org_apache_sling_commons_log_additiv
    ) {
    org_apache_sling_commons_log_log_manager_factory_config_properties_t *result = org_apache_sling_commons_log_log_manager_factory_config_properties_create_internal (
        org_apache_sling_commons_log_level,
        org_apache_sling_commons_log_file,
        org_apache_sling_commons_log_pattern,
        org_apache_sling_commons_log_names,
        org_apache_sling_commons_log_additiv
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_commons_log_log_manager_factory_config_properties_free(org_apache_sling_commons_log_log_manager_factory_config_properties_t *org_apache_sling_commons_log_log_manager_factory_config_properties) {
    if(NULL == org_apache_sling_commons_log_log_manager_factory_config_properties){
        return ;
    }
    if(org_apache_sling_commons_log_log_manager_factory_config_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_commons_log_log_manager_factory_config_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_level) {
        config_node_property_drop_down_free(org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_level);
        org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_level = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_file) {
        config_node_property_string_free(org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_file);
        org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_file = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_pattern) {
        config_node_property_string_free(org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_pattern);
        org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_pattern = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_names) {
        config_node_property_array_free(org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_names);
        org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_names = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_additiv) {
        config_node_property_boolean_free(org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_additiv);
        org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_additiv = NULL;
    }
    free(org_apache_sling_commons_log_log_manager_factory_config_properties);
}

cJSON *org_apache_sling_commons_log_log_manager_factory_config_properties_convertToJSON(org_apache_sling_commons_log_log_manager_factory_config_properties_t *org_apache_sling_commons_log_log_manager_factory_config_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_level
    if(org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_level) {
    cJSON *org_apache_sling_commons_log_level_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_level);
    if(org_apache_sling_commons_log_level_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.level", org_apache_sling_commons_log_level_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_file
    if(org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_file) {
    cJSON *org_apache_sling_commons_log_file_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_file);
    if(org_apache_sling_commons_log_file_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.file", org_apache_sling_commons_log_file_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_pattern
    if(org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_pattern) {
    cJSON *org_apache_sling_commons_log_pattern_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_pattern);
    if(org_apache_sling_commons_log_pattern_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.pattern", org_apache_sling_commons_log_pattern_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_names
    if(org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_names) {
    cJSON *org_apache_sling_commons_log_names_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_names);
    if(org_apache_sling_commons_log_names_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.names", org_apache_sling_commons_log_names_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_additiv
    if(org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_additiv) {
    cJSON *org_apache_sling_commons_log_additiv_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_additiv);
    if(org_apache_sling_commons_log_additiv_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.additiv", org_apache_sling_commons_log_additiv_local_JSON);
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

org_apache_sling_commons_log_log_manager_factory_config_properties_t *org_apache_sling_commons_log_log_manager_factory_config_properties_parseFromJSON(cJSON *org_apache_sling_commons_log_log_manager_factory_config_propertiesJSON){

    org_apache_sling_commons_log_log_manager_factory_config_properties_t *org_apache_sling_commons_log_log_manager_factory_config_properties_local_var = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_level
    config_node_property_drop_down_t *org_apache_sling_commons_log_level_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_file
    config_node_property_string_t *org_apache_sling_commons_log_file_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_pattern
    config_node_property_string_t *org_apache_sling_commons_log_pattern_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_names
    config_node_property_array_t *org_apache_sling_commons_log_names_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_additiv
    config_node_property_boolean_t *org_apache_sling_commons_log_additiv_local_nonprim = NULL;

    // org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_level
    cJSON *org_apache_sling_commons_log_level = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_factory_config_propertiesJSON, "org.apache.sling.commons.log.level");
    if (cJSON_IsNull(org_apache_sling_commons_log_level)) {
        org_apache_sling_commons_log_level = NULL;
    }
    if (org_apache_sling_commons_log_level) { 
    org_apache_sling_commons_log_level_local_nonprim = config_node_property_drop_down_parseFromJSON(org_apache_sling_commons_log_level); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_file
    cJSON *org_apache_sling_commons_log_file = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_factory_config_propertiesJSON, "org.apache.sling.commons.log.file");
    if (cJSON_IsNull(org_apache_sling_commons_log_file)) {
        org_apache_sling_commons_log_file = NULL;
    }
    if (org_apache_sling_commons_log_file) { 
    org_apache_sling_commons_log_file_local_nonprim = config_node_property_string_parseFromJSON(org_apache_sling_commons_log_file); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_pattern
    cJSON *org_apache_sling_commons_log_pattern = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_factory_config_propertiesJSON, "org.apache.sling.commons.log.pattern");
    if (cJSON_IsNull(org_apache_sling_commons_log_pattern)) {
        org_apache_sling_commons_log_pattern = NULL;
    }
    if (org_apache_sling_commons_log_pattern) { 
    org_apache_sling_commons_log_pattern_local_nonprim = config_node_property_string_parseFromJSON(org_apache_sling_commons_log_pattern); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_names
    cJSON *org_apache_sling_commons_log_names = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_factory_config_propertiesJSON, "org.apache.sling.commons.log.names");
    if (cJSON_IsNull(org_apache_sling_commons_log_names)) {
        org_apache_sling_commons_log_names = NULL;
    }
    if (org_apache_sling_commons_log_names) { 
    org_apache_sling_commons_log_names_local_nonprim = config_node_property_array_parseFromJSON(org_apache_sling_commons_log_names); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_factory_config_properties->org_apache_sling_commons_log_additiv
    cJSON *org_apache_sling_commons_log_additiv = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_factory_config_propertiesJSON, "org.apache.sling.commons.log.additiv");
    if (cJSON_IsNull(org_apache_sling_commons_log_additiv)) {
        org_apache_sling_commons_log_additiv = NULL;
    }
    if (org_apache_sling_commons_log_additiv) { 
    org_apache_sling_commons_log_additiv_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_sling_commons_log_additiv); //nonprimitive
    }



    org_apache_sling_commons_log_log_manager_factory_config_properties_local_var = org_apache_sling_commons_log_log_manager_factory_config_properties_create_internal (
        org_apache_sling_commons_log_level ? org_apache_sling_commons_log_level_local_nonprim : NULL,
        org_apache_sling_commons_log_file ? org_apache_sling_commons_log_file_local_nonprim : NULL,
        org_apache_sling_commons_log_pattern ? org_apache_sling_commons_log_pattern_local_nonprim : NULL,
        org_apache_sling_commons_log_names ? org_apache_sling_commons_log_names_local_nonprim : NULL,
        org_apache_sling_commons_log_additiv ? org_apache_sling_commons_log_additiv_local_nonprim : NULL
        );

    if (!org_apache_sling_commons_log_log_manager_factory_config_properties_local_var) {
        goto end;
    }

    return org_apache_sling_commons_log_log_manager_factory_config_properties_local_var;
end:
    if (org_apache_sling_commons_log_level_local_nonprim) {
        config_node_property_drop_down_free(org_apache_sling_commons_log_level_local_nonprim);
        org_apache_sling_commons_log_level_local_nonprim = NULL;
    }
    if (org_apache_sling_commons_log_file_local_nonprim) {
        config_node_property_string_free(org_apache_sling_commons_log_file_local_nonprim);
        org_apache_sling_commons_log_file_local_nonprim = NULL;
    }
    if (org_apache_sling_commons_log_pattern_local_nonprim) {
        config_node_property_string_free(org_apache_sling_commons_log_pattern_local_nonprim);
        org_apache_sling_commons_log_pattern_local_nonprim = NULL;
    }
    if (org_apache_sling_commons_log_names_local_nonprim) {
        config_node_property_array_free(org_apache_sling_commons_log_names_local_nonprim);
        org_apache_sling_commons_log_names_local_nonprim = NULL;
    }
    if (org_apache_sling_commons_log_additiv_local_nonprim) {
        config_node_property_boolean_free(org_apache_sling_commons_log_additiv_local_nonprim);
        org_apache_sling_commons_log_additiv_local_nonprim = NULL;
    }
    return NULL;

}
