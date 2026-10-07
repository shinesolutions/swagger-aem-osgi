#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_process_metadata_processor_process_properties.h"



static com_day_cq_dam_core_process_metadata_processor_process_properties_t *com_day_cq_dam_core_process_metadata_processor_process_properties_create_internal(
    config_node_property_string_t *process_label,
    config_node_property_boolean_t *cq_dam_enable_sha1,
    config_node_property_array_t *cq_dam_metadata_xssprotected_properties
    ) {
    com_day_cq_dam_core_process_metadata_processor_process_properties_t *com_day_cq_dam_core_process_metadata_processor_process_properties_local_var = malloc(sizeof(com_day_cq_dam_core_process_metadata_processor_process_properties_t));
    if (!com_day_cq_dam_core_process_metadata_processor_process_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_process_metadata_processor_process_properties_local_var, 0, sizeof(com_day_cq_dam_core_process_metadata_processor_process_properties_t));
    com_day_cq_dam_core_process_metadata_processor_process_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_process_metadata_processor_process_properties_local_var->process_label = process_label;
    com_day_cq_dam_core_process_metadata_processor_process_properties_local_var->cq_dam_enable_sha1 = cq_dam_enable_sha1;
    com_day_cq_dam_core_process_metadata_processor_process_properties_local_var->cq_dam_metadata_xssprotected_properties = cq_dam_metadata_xssprotected_properties;
    return com_day_cq_dam_core_process_metadata_processor_process_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_process_metadata_processor_process_properties_t *com_day_cq_dam_core_process_metadata_processor_process_properties_create(
    config_node_property_string_t *process_label,
    config_node_property_boolean_t *cq_dam_enable_sha1,
    config_node_property_array_t *cq_dam_metadata_xssprotected_properties
    ) {
    com_day_cq_dam_core_process_metadata_processor_process_properties_t *result = com_day_cq_dam_core_process_metadata_processor_process_properties_create_internal (
        process_label,
        cq_dam_enable_sha1,
        cq_dam_metadata_xssprotected_properties
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_process_metadata_processor_process_properties_free(com_day_cq_dam_core_process_metadata_processor_process_properties_t *com_day_cq_dam_core_process_metadata_processor_process_properties) {
    if(NULL == com_day_cq_dam_core_process_metadata_processor_process_properties){
        return ;
    }
    if(com_day_cq_dam_core_process_metadata_processor_process_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_process_metadata_processor_process_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_process_metadata_processor_process_properties->process_label) {
        config_node_property_string_free(com_day_cq_dam_core_process_metadata_processor_process_properties->process_label);
        com_day_cq_dam_core_process_metadata_processor_process_properties->process_label = NULL;
    }
    if (com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_enable_sha1) {
        config_node_property_boolean_free(com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_enable_sha1);
        com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_enable_sha1 = NULL;
    }
    if (com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_metadata_xssprotected_properties) {
        config_node_property_array_free(com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_metadata_xssprotected_properties);
        com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_metadata_xssprotected_properties = NULL;
    }
    free(com_day_cq_dam_core_process_metadata_processor_process_properties);
}

cJSON *com_day_cq_dam_core_process_metadata_processor_process_properties_convertToJSON(com_day_cq_dam_core_process_metadata_processor_process_properties_t *com_day_cq_dam_core_process_metadata_processor_process_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_process_metadata_processor_process_properties->process_label
    if(com_day_cq_dam_core_process_metadata_processor_process_properties->process_label) {
    cJSON *process_label_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_process_metadata_processor_process_properties->process_label);
    if(process_label_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "process.label", process_label_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_enable_sha1
    if(com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_enable_sha1) {
    cJSON *cq_dam_enable_sha1_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_enable_sha1);
    if(cq_dam_enable_sha1_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.enable.sha1", cq_dam_enable_sha1_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_metadata_xssprotected_properties
    if(com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_metadata_xssprotected_properties) {
    cJSON *cq_dam_metadata_xssprotected_properties_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_metadata_xssprotected_properties);
    if(cq_dam_metadata_xssprotected_properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.metadata.xssprotected.properties", cq_dam_metadata_xssprotected_properties_local_JSON);
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

com_day_cq_dam_core_process_metadata_processor_process_properties_t *com_day_cq_dam_core_process_metadata_processor_process_properties_parseFromJSON(cJSON *com_day_cq_dam_core_process_metadata_processor_process_propertiesJSON){

    com_day_cq_dam_core_process_metadata_processor_process_properties_t *com_day_cq_dam_core_process_metadata_processor_process_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_process_metadata_processor_process_properties->process_label
    config_node_property_string_t *process_label_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_enable_sha1
    config_node_property_boolean_t *cq_dam_enable_sha1_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_metadata_xssprotected_properties
    config_node_property_array_t *cq_dam_metadata_xssprotected_properties_local_nonprim = NULL;

    // com_day_cq_dam_core_process_metadata_processor_process_properties->process_label
    cJSON *process_label = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_process_metadata_processor_process_propertiesJSON, "process.label");
    if (cJSON_IsNull(process_label)) {
        process_label = NULL;
    }
    if (process_label) { 
    process_label_local_nonprim = config_node_property_string_parseFromJSON(process_label); //nonprimitive
    }

    // com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_enable_sha1
    cJSON *cq_dam_enable_sha1 = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_process_metadata_processor_process_propertiesJSON, "cq.dam.enable.sha1");
    if (cJSON_IsNull(cq_dam_enable_sha1)) {
        cq_dam_enable_sha1 = NULL;
    }
    if (cq_dam_enable_sha1) { 
    cq_dam_enable_sha1_local_nonprim = config_node_property_boolean_parseFromJSON(cq_dam_enable_sha1); //nonprimitive
    }

    // com_day_cq_dam_core_process_metadata_processor_process_properties->cq_dam_metadata_xssprotected_properties
    cJSON *cq_dam_metadata_xssprotected_properties = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_process_metadata_processor_process_propertiesJSON, "cq.dam.metadata.xssprotected.properties");
    if (cJSON_IsNull(cq_dam_metadata_xssprotected_properties)) {
        cq_dam_metadata_xssprotected_properties = NULL;
    }
    if (cq_dam_metadata_xssprotected_properties) { 
    cq_dam_metadata_xssprotected_properties_local_nonprim = config_node_property_array_parseFromJSON(cq_dam_metadata_xssprotected_properties); //nonprimitive
    }



    com_day_cq_dam_core_process_metadata_processor_process_properties_local_var = com_day_cq_dam_core_process_metadata_processor_process_properties_create_internal (
        process_label ? process_label_local_nonprim : NULL,
        cq_dam_enable_sha1 ? cq_dam_enable_sha1_local_nonprim : NULL,
        cq_dam_metadata_xssprotected_properties ? cq_dam_metadata_xssprotected_properties_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_process_metadata_processor_process_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_process_metadata_processor_process_properties_local_var;
end:
    if (process_label_local_nonprim) {
        config_node_property_string_free(process_label_local_nonprim);
        process_label_local_nonprim = NULL;
    }
    if (cq_dam_enable_sha1_local_nonprim) {
        config_node_property_boolean_free(cq_dam_enable_sha1_local_nonprim);
        cq_dam_enable_sha1_local_nonprim = NULL;
    }
    if (cq_dam_metadata_xssprotected_properties_local_nonprim) {
        config_node_property_array_free(cq_dam_metadata_xssprotected_properties_local_nonprim);
        cq_dam_metadata_xssprotected_properties_local_nonprim = NULL;
    }
    return NULL;

}
