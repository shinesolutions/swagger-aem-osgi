#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_commons_log_log_manager_properties.h"



static org_apache_sling_commons_log_log_manager_properties_t *org_apache_sling_commons_log_log_manager_properties_create_internal(
    config_node_property_drop_down_t *org_apache_sling_commons_log_level,
    config_node_property_string_t *org_apache_sling_commons_log_file,
    config_node_property_integer_t *org_apache_sling_commons_log_file_number,
    config_node_property_string_t *org_apache_sling_commons_log_file_size,
    config_node_property_string_t *org_apache_sling_commons_log_pattern,
    config_node_property_string_t *org_apache_sling_commons_log_configuration_file,
    config_node_property_boolean_t *org_apache_sling_commons_log_packaging_data_enabled,
    config_node_property_integer_t *org_apache_sling_commons_log_max_caller_data_depth,
    config_node_property_integer_t *org_apache_sling_commons_log_max_old_file_count_in_dump,
    config_node_property_integer_t *org_apache_sling_commons_log_num_of_lines
    ) {
    org_apache_sling_commons_log_log_manager_properties_t *org_apache_sling_commons_log_log_manager_properties_local_var = malloc(sizeof(org_apache_sling_commons_log_log_manager_properties_t));
    if (!org_apache_sling_commons_log_log_manager_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_commons_log_log_manager_properties_local_var, 0, sizeof(org_apache_sling_commons_log_log_manager_properties_t));
    org_apache_sling_commons_log_log_manager_properties_local_var->_library_owned = 1;
    org_apache_sling_commons_log_log_manager_properties_local_var->org_apache_sling_commons_log_level = org_apache_sling_commons_log_level;
    org_apache_sling_commons_log_log_manager_properties_local_var->org_apache_sling_commons_log_file = org_apache_sling_commons_log_file;
    org_apache_sling_commons_log_log_manager_properties_local_var->org_apache_sling_commons_log_file_number = org_apache_sling_commons_log_file_number;
    org_apache_sling_commons_log_log_manager_properties_local_var->org_apache_sling_commons_log_file_size = org_apache_sling_commons_log_file_size;
    org_apache_sling_commons_log_log_manager_properties_local_var->org_apache_sling_commons_log_pattern = org_apache_sling_commons_log_pattern;
    org_apache_sling_commons_log_log_manager_properties_local_var->org_apache_sling_commons_log_configuration_file = org_apache_sling_commons_log_configuration_file;
    org_apache_sling_commons_log_log_manager_properties_local_var->org_apache_sling_commons_log_packaging_data_enabled = org_apache_sling_commons_log_packaging_data_enabled;
    org_apache_sling_commons_log_log_manager_properties_local_var->org_apache_sling_commons_log_max_caller_data_depth = org_apache_sling_commons_log_max_caller_data_depth;
    org_apache_sling_commons_log_log_manager_properties_local_var->org_apache_sling_commons_log_max_old_file_count_in_dump = org_apache_sling_commons_log_max_old_file_count_in_dump;
    org_apache_sling_commons_log_log_manager_properties_local_var->org_apache_sling_commons_log_num_of_lines = org_apache_sling_commons_log_num_of_lines;
    return org_apache_sling_commons_log_log_manager_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_commons_log_log_manager_properties_t *org_apache_sling_commons_log_log_manager_properties_create(
    config_node_property_drop_down_t *org_apache_sling_commons_log_level,
    config_node_property_string_t *org_apache_sling_commons_log_file,
    config_node_property_integer_t *org_apache_sling_commons_log_file_number,
    config_node_property_string_t *org_apache_sling_commons_log_file_size,
    config_node_property_string_t *org_apache_sling_commons_log_pattern,
    config_node_property_string_t *org_apache_sling_commons_log_configuration_file,
    config_node_property_boolean_t *org_apache_sling_commons_log_packaging_data_enabled,
    config_node_property_integer_t *org_apache_sling_commons_log_max_caller_data_depth,
    config_node_property_integer_t *org_apache_sling_commons_log_max_old_file_count_in_dump,
    config_node_property_integer_t *org_apache_sling_commons_log_num_of_lines
    ) {
    org_apache_sling_commons_log_log_manager_properties_t *result = org_apache_sling_commons_log_log_manager_properties_create_internal (
        org_apache_sling_commons_log_level,
        org_apache_sling_commons_log_file,
        org_apache_sling_commons_log_file_number,
        org_apache_sling_commons_log_file_size,
        org_apache_sling_commons_log_pattern,
        org_apache_sling_commons_log_configuration_file,
        org_apache_sling_commons_log_packaging_data_enabled,
        org_apache_sling_commons_log_max_caller_data_depth,
        org_apache_sling_commons_log_max_old_file_count_in_dump,
        org_apache_sling_commons_log_num_of_lines
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_commons_log_log_manager_properties_free(org_apache_sling_commons_log_log_manager_properties_t *org_apache_sling_commons_log_log_manager_properties) {
    if(NULL == org_apache_sling_commons_log_log_manager_properties){
        return ;
    }
    if(org_apache_sling_commons_log_log_manager_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_commons_log_log_manager_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_level) {
        config_node_property_drop_down_free(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_level);
        org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_level = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file) {
        config_node_property_string_free(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file);
        org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_number) {
        config_node_property_integer_free(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_number);
        org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_number = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_size) {
        config_node_property_string_free(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_size);
        org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_size = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_pattern) {
        config_node_property_string_free(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_pattern);
        org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_pattern = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_configuration_file) {
        config_node_property_string_free(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_configuration_file);
        org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_configuration_file = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_packaging_data_enabled) {
        config_node_property_boolean_free(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_packaging_data_enabled);
        org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_packaging_data_enabled = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_caller_data_depth) {
        config_node_property_integer_free(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_caller_data_depth);
        org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_caller_data_depth = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_old_file_count_in_dump) {
        config_node_property_integer_free(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_old_file_count_in_dump);
        org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_old_file_count_in_dump = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_num_of_lines) {
        config_node_property_integer_free(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_num_of_lines);
        org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_num_of_lines = NULL;
    }
    free(org_apache_sling_commons_log_log_manager_properties);
}

cJSON *org_apache_sling_commons_log_log_manager_properties_convertToJSON(org_apache_sling_commons_log_log_manager_properties_t *org_apache_sling_commons_log_log_manager_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_level
    if(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_level) {
    cJSON *org_apache_sling_commons_log_level_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_level);
    if(org_apache_sling_commons_log_level_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.level", org_apache_sling_commons_log_level_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file
    if(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file) {
    cJSON *org_apache_sling_commons_log_file_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file);
    if(org_apache_sling_commons_log_file_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.file", org_apache_sling_commons_log_file_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_number
    if(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_number) {
    cJSON *org_apache_sling_commons_log_file_number_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_number);
    if(org_apache_sling_commons_log_file_number_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.file.number", org_apache_sling_commons_log_file_number_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_size
    if(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_size) {
    cJSON *org_apache_sling_commons_log_file_size_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_size);
    if(org_apache_sling_commons_log_file_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.file.size", org_apache_sling_commons_log_file_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_pattern
    if(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_pattern) {
    cJSON *org_apache_sling_commons_log_pattern_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_pattern);
    if(org_apache_sling_commons_log_pattern_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.pattern", org_apache_sling_commons_log_pattern_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_configuration_file
    if(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_configuration_file) {
    cJSON *org_apache_sling_commons_log_configuration_file_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_configuration_file);
    if(org_apache_sling_commons_log_configuration_file_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.configurationFile", org_apache_sling_commons_log_configuration_file_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_packaging_data_enabled
    if(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_packaging_data_enabled) {
    cJSON *org_apache_sling_commons_log_packaging_data_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_packaging_data_enabled);
    if(org_apache_sling_commons_log_packaging_data_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.packagingDataEnabled", org_apache_sling_commons_log_packaging_data_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_caller_data_depth
    if(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_caller_data_depth) {
    cJSON *org_apache_sling_commons_log_max_caller_data_depth_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_caller_data_depth);
    if(org_apache_sling_commons_log_max_caller_data_depth_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.maxCallerDataDepth", org_apache_sling_commons_log_max_caller_data_depth_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_old_file_count_in_dump
    if(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_old_file_count_in_dump) {
    cJSON *org_apache_sling_commons_log_max_old_file_count_in_dump_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_old_file_count_in_dump);
    if(org_apache_sling_commons_log_max_old_file_count_in_dump_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.maxOldFileCountInDump", org_apache_sling_commons_log_max_old_file_count_in_dump_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_num_of_lines
    if(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_num_of_lines) {
    cJSON *org_apache_sling_commons_log_num_of_lines_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_num_of_lines);
    if(org_apache_sling_commons_log_num_of_lines_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.numOfLines", org_apache_sling_commons_log_num_of_lines_local_JSON);
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

org_apache_sling_commons_log_log_manager_properties_t *org_apache_sling_commons_log_log_manager_properties_parseFromJSON(cJSON *org_apache_sling_commons_log_log_manager_propertiesJSON){

    org_apache_sling_commons_log_log_manager_properties_t *org_apache_sling_commons_log_log_manager_properties_local_var = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_level
    config_node_property_drop_down_t *org_apache_sling_commons_log_level_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file
    config_node_property_string_t *org_apache_sling_commons_log_file_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_number
    config_node_property_integer_t *org_apache_sling_commons_log_file_number_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_size
    config_node_property_string_t *org_apache_sling_commons_log_file_size_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_pattern
    config_node_property_string_t *org_apache_sling_commons_log_pattern_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_configuration_file
    config_node_property_string_t *org_apache_sling_commons_log_configuration_file_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_packaging_data_enabled
    config_node_property_boolean_t *org_apache_sling_commons_log_packaging_data_enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_caller_data_depth
    config_node_property_integer_t *org_apache_sling_commons_log_max_caller_data_depth_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_old_file_count_in_dump
    config_node_property_integer_t *org_apache_sling_commons_log_max_old_file_count_in_dump_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_num_of_lines
    config_node_property_integer_t *org_apache_sling_commons_log_num_of_lines_local_nonprim = NULL;

    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_level
    cJSON *org_apache_sling_commons_log_level = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_propertiesJSON, "org.apache.sling.commons.log.level");
    if (cJSON_IsNull(org_apache_sling_commons_log_level)) {
        org_apache_sling_commons_log_level = NULL;
    }
    if (org_apache_sling_commons_log_level) { 
    org_apache_sling_commons_log_level_local_nonprim = config_node_property_drop_down_parseFromJSON(org_apache_sling_commons_log_level); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file
    cJSON *org_apache_sling_commons_log_file = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_propertiesJSON, "org.apache.sling.commons.log.file");
    if (cJSON_IsNull(org_apache_sling_commons_log_file)) {
        org_apache_sling_commons_log_file = NULL;
    }
    if (org_apache_sling_commons_log_file) { 
    org_apache_sling_commons_log_file_local_nonprim = config_node_property_string_parseFromJSON(org_apache_sling_commons_log_file); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_number
    cJSON *org_apache_sling_commons_log_file_number = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_propertiesJSON, "org.apache.sling.commons.log.file.number");
    if (cJSON_IsNull(org_apache_sling_commons_log_file_number)) {
        org_apache_sling_commons_log_file_number = NULL;
    }
    if (org_apache_sling_commons_log_file_number) { 
    org_apache_sling_commons_log_file_number_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_sling_commons_log_file_number); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_file_size
    cJSON *org_apache_sling_commons_log_file_size = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_propertiesJSON, "org.apache.sling.commons.log.file.size");
    if (cJSON_IsNull(org_apache_sling_commons_log_file_size)) {
        org_apache_sling_commons_log_file_size = NULL;
    }
    if (org_apache_sling_commons_log_file_size) { 
    org_apache_sling_commons_log_file_size_local_nonprim = config_node_property_string_parseFromJSON(org_apache_sling_commons_log_file_size); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_pattern
    cJSON *org_apache_sling_commons_log_pattern = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_propertiesJSON, "org.apache.sling.commons.log.pattern");
    if (cJSON_IsNull(org_apache_sling_commons_log_pattern)) {
        org_apache_sling_commons_log_pattern = NULL;
    }
    if (org_apache_sling_commons_log_pattern) { 
    org_apache_sling_commons_log_pattern_local_nonprim = config_node_property_string_parseFromJSON(org_apache_sling_commons_log_pattern); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_configuration_file
    cJSON *org_apache_sling_commons_log_configuration_file = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_propertiesJSON, "org.apache.sling.commons.log.configurationFile");
    if (cJSON_IsNull(org_apache_sling_commons_log_configuration_file)) {
        org_apache_sling_commons_log_configuration_file = NULL;
    }
    if (org_apache_sling_commons_log_configuration_file) { 
    org_apache_sling_commons_log_configuration_file_local_nonprim = config_node_property_string_parseFromJSON(org_apache_sling_commons_log_configuration_file); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_packaging_data_enabled
    cJSON *org_apache_sling_commons_log_packaging_data_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_propertiesJSON, "org.apache.sling.commons.log.packagingDataEnabled");
    if (cJSON_IsNull(org_apache_sling_commons_log_packaging_data_enabled)) {
        org_apache_sling_commons_log_packaging_data_enabled = NULL;
    }
    if (org_apache_sling_commons_log_packaging_data_enabled) { 
    org_apache_sling_commons_log_packaging_data_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_sling_commons_log_packaging_data_enabled); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_caller_data_depth
    cJSON *org_apache_sling_commons_log_max_caller_data_depth = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_propertiesJSON, "org.apache.sling.commons.log.maxCallerDataDepth");
    if (cJSON_IsNull(org_apache_sling_commons_log_max_caller_data_depth)) {
        org_apache_sling_commons_log_max_caller_data_depth = NULL;
    }
    if (org_apache_sling_commons_log_max_caller_data_depth) { 
    org_apache_sling_commons_log_max_caller_data_depth_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_sling_commons_log_max_caller_data_depth); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_max_old_file_count_in_dump
    cJSON *org_apache_sling_commons_log_max_old_file_count_in_dump = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_propertiesJSON, "org.apache.sling.commons.log.maxOldFileCountInDump");
    if (cJSON_IsNull(org_apache_sling_commons_log_max_old_file_count_in_dump)) {
        org_apache_sling_commons_log_max_old_file_count_in_dump = NULL;
    }
    if (org_apache_sling_commons_log_max_old_file_count_in_dump) { 
    org_apache_sling_commons_log_max_old_file_count_in_dump_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_sling_commons_log_max_old_file_count_in_dump); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_properties->org_apache_sling_commons_log_num_of_lines
    cJSON *org_apache_sling_commons_log_num_of_lines = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_propertiesJSON, "org.apache.sling.commons.log.numOfLines");
    if (cJSON_IsNull(org_apache_sling_commons_log_num_of_lines)) {
        org_apache_sling_commons_log_num_of_lines = NULL;
    }
    if (org_apache_sling_commons_log_num_of_lines) { 
    org_apache_sling_commons_log_num_of_lines_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_sling_commons_log_num_of_lines); //nonprimitive
    }



    org_apache_sling_commons_log_log_manager_properties_local_var = org_apache_sling_commons_log_log_manager_properties_create_internal (
        org_apache_sling_commons_log_level ? org_apache_sling_commons_log_level_local_nonprim : NULL,
        org_apache_sling_commons_log_file ? org_apache_sling_commons_log_file_local_nonprim : NULL,
        org_apache_sling_commons_log_file_number ? org_apache_sling_commons_log_file_number_local_nonprim : NULL,
        org_apache_sling_commons_log_file_size ? org_apache_sling_commons_log_file_size_local_nonprim : NULL,
        org_apache_sling_commons_log_pattern ? org_apache_sling_commons_log_pattern_local_nonprim : NULL,
        org_apache_sling_commons_log_configuration_file ? org_apache_sling_commons_log_configuration_file_local_nonprim : NULL,
        org_apache_sling_commons_log_packaging_data_enabled ? org_apache_sling_commons_log_packaging_data_enabled_local_nonprim : NULL,
        org_apache_sling_commons_log_max_caller_data_depth ? org_apache_sling_commons_log_max_caller_data_depth_local_nonprim : NULL,
        org_apache_sling_commons_log_max_old_file_count_in_dump ? org_apache_sling_commons_log_max_old_file_count_in_dump_local_nonprim : NULL,
        org_apache_sling_commons_log_num_of_lines ? org_apache_sling_commons_log_num_of_lines_local_nonprim : NULL
        );

    if (!org_apache_sling_commons_log_log_manager_properties_local_var) {
        goto end;
    }

    return org_apache_sling_commons_log_log_manager_properties_local_var;
end:
    if (org_apache_sling_commons_log_level_local_nonprim) {
        config_node_property_drop_down_free(org_apache_sling_commons_log_level_local_nonprim);
        org_apache_sling_commons_log_level_local_nonprim = NULL;
    }
    if (org_apache_sling_commons_log_file_local_nonprim) {
        config_node_property_string_free(org_apache_sling_commons_log_file_local_nonprim);
        org_apache_sling_commons_log_file_local_nonprim = NULL;
    }
    if (org_apache_sling_commons_log_file_number_local_nonprim) {
        config_node_property_integer_free(org_apache_sling_commons_log_file_number_local_nonprim);
        org_apache_sling_commons_log_file_number_local_nonprim = NULL;
    }
    if (org_apache_sling_commons_log_file_size_local_nonprim) {
        config_node_property_string_free(org_apache_sling_commons_log_file_size_local_nonprim);
        org_apache_sling_commons_log_file_size_local_nonprim = NULL;
    }
    if (org_apache_sling_commons_log_pattern_local_nonprim) {
        config_node_property_string_free(org_apache_sling_commons_log_pattern_local_nonprim);
        org_apache_sling_commons_log_pattern_local_nonprim = NULL;
    }
    if (org_apache_sling_commons_log_configuration_file_local_nonprim) {
        config_node_property_string_free(org_apache_sling_commons_log_configuration_file_local_nonprim);
        org_apache_sling_commons_log_configuration_file_local_nonprim = NULL;
    }
    if (org_apache_sling_commons_log_packaging_data_enabled_local_nonprim) {
        config_node_property_boolean_free(org_apache_sling_commons_log_packaging_data_enabled_local_nonprim);
        org_apache_sling_commons_log_packaging_data_enabled_local_nonprim = NULL;
    }
    if (org_apache_sling_commons_log_max_caller_data_depth_local_nonprim) {
        config_node_property_integer_free(org_apache_sling_commons_log_max_caller_data_depth_local_nonprim);
        org_apache_sling_commons_log_max_caller_data_depth_local_nonprim = NULL;
    }
    if (org_apache_sling_commons_log_max_old_file_count_in_dump_local_nonprim) {
        config_node_property_integer_free(org_apache_sling_commons_log_max_old_file_count_in_dump_local_nonprim);
        org_apache_sling_commons_log_max_old_file_count_in_dump_local_nonprim = NULL;
    }
    if (org_apache_sling_commons_log_num_of_lines_local_nonprim) {
        config_node_property_integer_free(org_apache_sling_commons_log_num_of_lines_local_nonprim);
        org_apache_sling_commons_log_num_of_lines_local_nonprim = NULL;
    }
    return NULL;

}
