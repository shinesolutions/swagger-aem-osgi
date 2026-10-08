#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_commons_log_log_manager_factory_writer_properties.h"



static org_apache_sling_commons_log_log_manager_factory_writer_properties_t *org_apache_sling_commons_log_log_manager_factory_writer_properties_create_internal(
    config_node_property_string_t *org_apache_sling_commons_log_file,
    config_node_property_integer_t *org_apache_sling_commons_log_file_number,
    config_node_property_string_t *org_apache_sling_commons_log_file_size,
    config_node_property_boolean_t *org_apache_sling_commons_log_file_buffered
    ) {
    org_apache_sling_commons_log_log_manager_factory_writer_properties_t *org_apache_sling_commons_log_log_manager_factory_writer_properties_local_var = malloc(sizeof(org_apache_sling_commons_log_log_manager_factory_writer_properties_t));
    if (!org_apache_sling_commons_log_log_manager_factory_writer_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_commons_log_log_manager_factory_writer_properties_local_var, 0, sizeof(org_apache_sling_commons_log_log_manager_factory_writer_properties_t));
    org_apache_sling_commons_log_log_manager_factory_writer_properties_local_var->_library_owned = 1;
    org_apache_sling_commons_log_log_manager_factory_writer_properties_local_var->org_apache_sling_commons_log_file = org_apache_sling_commons_log_file;
    org_apache_sling_commons_log_log_manager_factory_writer_properties_local_var->org_apache_sling_commons_log_file_number = org_apache_sling_commons_log_file_number;
    org_apache_sling_commons_log_log_manager_factory_writer_properties_local_var->org_apache_sling_commons_log_file_size = org_apache_sling_commons_log_file_size;
    org_apache_sling_commons_log_log_manager_factory_writer_properties_local_var->org_apache_sling_commons_log_file_buffered = org_apache_sling_commons_log_file_buffered;
    return org_apache_sling_commons_log_log_manager_factory_writer_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_commons_log_log_manager_factory_writer_properties_t *org_apache_sling_commons_log_log_manager_factory_writer_properties_create(
    config_node_property_string_t *org_apache_sling_commons_log_file,
    config_node_property_integer_t *org_apache_sling_commons_log_file_number,
    config_node_property_string_t *org_apache_sling_commons_log_file_size,
    config_node_property_boolean_t *org_apache_sling_commons_log_file_buffered
    ) {
    org_apache_sling_commons_log_log_manager_factory_writer_properties_t *result = org_apache_sling_commons_log_log_manager_factory_writer_properties_create_internal (
        org_apache_sling_commons_log_file,
        org_apache_sling_commons_log_file_number,
        org_apache_sling_commons_log_file_size,
        org_apache_sling_commons_log_file_buffered
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_commons_log_log_manager_factory_writer_properties_free(org_apache_sling_commons_log_log_manager_factory_writer_properties_t *org_apache_sling_commons_log_log_manager_factory_writer_properties) {
    if(NULL == org_apache_sling_commons_log_log_manager_factory_writer_properties){
        return ;
    }
    if(org_apache_sling_commons_log_log_manager_factory_writer_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_commons_log_log_manager_factory_writer_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file) {
        config_node_property_string_free(org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file);
        org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_number) {
        config_node_property_integer_free(org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_number);
        org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_number = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_size) {
        config_node_property_string_free(org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_size);
        org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_size = NULL;
    }
    if (org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_buffered) {
        config_node_property_boolean_free(org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_buffered);
        org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_buffered = NULL;
    }
    free(org_apache_sling_commons_log_log_manager_factory_writer_properties);
}

cJSON *org_apache_sling_commons_log_log_manager_factory_writer_properties_convertToJSON(org_apache_sling_commons_log_log_manager_factory_writer_properties_t *org_apache_sling_commons_log_log_manager_factory_writer_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file
    if(org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file) {
    cJSON *org_apache_sling_commons_log_file_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file);
    if(org_apache_sling_commons_log_file_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.file", org_apache_sling_commons_log_file_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_number
    if(org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_number) {
    cJSON *org_apache_sling_commons_log_file_number_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_number);
    if(org_apache_sling_commons_log_file_number_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.file.number", org_apache_sling_commons_log_file_number_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_size
    if(org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_size) {
    cJSON *org_apache_sling_commons_log_file_size_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_size);
    if(org_apache_sling_commons_log_file_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.file.size", org_apache_sling_commons_log_file_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_buffered
    if(org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_buffered) {
    cJSON *org_apache_sling_commons_log_file_buffered_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_buffered);
    if(org_apache_sling_commons_log_file_buffered_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.commons.log.file.buffered", org_apache_sling_commons_log_file_buffered_local_JSON);
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

org_apache_sling_commons_log_log_manager_factory_writer_properties_t *org_apache_sling_commons_log_log_manager_factory_writer_properties_parseFromJSON(cJSON *org_apache_sling_commons_log_log_manager_factory_writer_propertiesJSON){

    org_apache_sling_commons_log_log_manager_factory_writer_properties_t *org_apache_sling_commons_log_log_manager_factory_writer_properties_local_var = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file
    config_node_property_string_t *org_apache_sling_commons_log_file_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_number
    config_node_property_integer_t *org_apache_sling_commons_log_file_number_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_size
    config_node_property_string_t *org_apache_sling_commons_log_file_size_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_buffered
    config_node_property_boolean_t *org_apache_sling_commons_log_file_buffered_local_nonprim = NULL;

    // org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file
    cJSON *org_apache_sling_commons_log_file = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_factory_writer_propertiesJSON, "org.apache.sling.commons.log.file");
    if (cJSON_IsNull(org_apache_sling_commons_log_file)) {
        org_apache_sling_commons_log_file = NULL;
    }
    if (org_apache_sling_commons_log_file) { 
    org_apache_sling_commons_log_file_local_nonprim = config_node_property_string_parseFromJSON(org_apache_sling_commons_log_file); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_number
    cJSON *org_apache_sling_commons_log_file_number = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_factory_writer_propertiesJSON, "org.apache.sling.commons.log.file.number");
    if (cJSON_IsNull(org_apache_sling_commons_log_file_number)) {
        org_apache_sling_commons_log_file_number = NULL;
    }
    if (org_apache_sling_commons_log_file_number) { 
    org_apache_sling_commons_log_file_number_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_sling_commons_log_file_number); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_size
    cJSON *org_apache_sling_commons_log_file_size = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_factory_writer_propertiesJSON, "org.apache.sling.commons.log.file.size");
    if (cJSON_IsNull(org_apache_sling_commons_log_file_size)) {
        org_apache_sling_commons_log_file_size = NULL;
    }
    if (org_apache_sling_commons_log_file_size) { 
    org_apache_sling_commons_log_file_size_local_nonprim = config_node_property_string_parseFromJSON(org_apache_sling_commons_log_file_size); //nonprimitive
    }

    // org_apache_sling_commons_log_log_manager_factory_writer_properties->org_apache_sling_commons_log_file_buffered
    cJSON *org_apache_sling_commons_log_file_buffered = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_log_log_manager_factory_writer_propertiesJSON, "org.apache.sling.commons.log.file.buffered");
    if (cJSON_IsNull(org_apache_sling_commons_log_file_buffered)) {
        org_apache_sling_commons_log_file_buffered = NULL;
    }
    if (org_apache_sling_commons_log_file_buffered) { 
    org_apache_sling_commons_log_file_buffered_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_sling_commons_log_file_buffered); //nonprimitive
    }



    org_apache_sling_commons_log_log_manager_factory_writer_properties_local_var = org_apache_sling_commons_log_log_manager_factory_writer_properties_create_internal (
        org_apache_sling_commons_log_file ? org_apache_sling_commons_log_file_local_nonprim : NULL,
        org_apache_sling_commons_log_file_number ? org_apache_sling_commons_log_file_number_local_nonprim : NULL,
        org_apache_sling_commons_log_file_size ? org_apache_sling_commons_log_file_size_local_nonprim : NULL,
        org_apache_sling_commons_log_file_buffered ? org_apache_sling_commons_log_file_buffered_local_nonprim : NULL
        );

    if (!org_apache_sling_commons_log_log_manager_factory_writer_properties_local_var) {
        goto end;
    }

    return org_apache_sling_commons_log_log_manager_factory_writer_properties_local_var;
end:
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
    if (org_apache_sling_commons_log_file_buffered_local_nonprim) {
        config_node_property_boolean_free(org_apache_sling_commons_log_file_buffered_local_nonprim);
        org_apache_sling_commons_log_file_buffered_local_nonprim = NULL;
    }
    return NULL;

}
