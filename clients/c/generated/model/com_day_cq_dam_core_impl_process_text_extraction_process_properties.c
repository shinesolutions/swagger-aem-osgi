#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_process_text_extraction_process_properties.h"



static com_day_cq_dam_core_impl_process_text_extraction_process_properties_t *com_day_cq_dam_core_impl_process_text_extraction_process_properties_create_internal(
    config_node_property_array_t *mime_types,
    config_node_property_integer_t *max_extract
    ) {
    com_day_cq_dam_core_impl_process_text_extraction_process_properties_t *com_day_cq_dam_core_impl_process_text_extraction_process_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_process_text_extraction_process_properties_t));
    if (!com_day_cq_dam_core_impl_process_text_extraction_process_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_process_text_extraction_process_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_process_text_extraction_process_properties_t));
    com_day_cq_dam_core_impl_process_text_extraction_process_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_process_text_extraction_process_properties_local_var->mime_types = mime_types;
    com_day_cq_dam_core_impl_process_text_extraction_process_properties_local_var->max_extract = max_extract;
    return com_day_cq_dam_core_impl_process_text_extraction_process_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_process_text_extraction_process_properties_t *com_day_cq_dam_core_impl_process_text_extraction_process_properties_create(
    config_node_property_array_t *mime_types,
    config_node_property_integer_t *max_extract
    ) {
    com_day_cq_dam_core_impl_process_text_extraction_process_properties_t *result = com_day_cq_dam_core_impl_process_text_extraction_process_properties_create_internal (
        mime_types,
        max_extract
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_process_text_extraction_process_properties_free(com_day_cq_dam_core_impl_process_text_extraction_process_properties_t *com_day_cq_dam_core_impl_process_text_extraction_process_properties) {
    if(NULL == com_day_cq_dam_core_impl_process_text_extraction_process_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_process_text_extraction_process_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_process_text_extraction_process_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_process_text_extraction_process_properties->mime_types) {
        config_node_property_array_free(com_day_cq_dam_core_impl_process_text_extraction_process_properties->mime_types);
        com_day_cq_dam_core_impl_process_text_extraction_process_properties->mime_types = NULL;
    }
    if (com_day_cq_dam_core_impl_process_text_extraction_process_properties->max_extract) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_process_text_extraction_process_properties->max_extract);
        com_day_cq_dam_core_impl_process_text_extraction_process_properties->max_extract = NULL;
    }
    free(com_day_cq_dam_core_impl_process_text_extraction_process_properties);
}

cJSON *com_day_cq_dam_core_impl_process_text_extraction_process_properties_convertToJSON(com_day_cq_dam_core_impl_process_text_extraction_process_properties_t *com_day_cq_dam_core_impl_process_text_extraction_process_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_process_text_extraction_process_properties->mime_types
    if(com_day_cq_dam_core_impl_process_text_extraction_process_properties->mime_types) {
    cJSON *mime_types_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_core_impl_process_text_extraction_process_properties->mime_types);
    if(mime_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mimeTypes", mime_types_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_process_text_extraction_process_properties->max_extract
    if(com_day_cq_dam_core_impl_process_text_extraction_process_properties->max_extract) {
    cJSON *max_extract_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_process_text_extraction_process_properties->max_extract);
    if(max_extract_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxExtract", max_extract_local_JSON);
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

com_day_cq_dam_core_impl_process_text_extraction_process_properties_t *com_day_cq_dam_core_impl_process_text_extraction_process_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_process_text_extraction_process_propertiesJSON){

    com_day_cq_dam_core_impl_process_text_extraction_process_properties_t *com_day_cq_dam_core_impl_process_text_extraction_process_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_process_text_extraction_process_properties->mime_types
    config_node_property_array_t *mime_types_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_process_text_extraction_process_properties->max_extract
    config_node_property_integer_t *max_extract_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_process_text_extraction_process_properties->mime_types
    cJSON *mime_types = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_process_text_extraction_process_propertiesJSON, "mimeTypes");
    if (cJSON_IsNull(mime_types)) {
        mime_types = NULL;
    }
    if (mime_types) { 
    mime_types_local_nonprim = config_node_property_array_parseFromJSON(mime_types); //nonprimitive
    }

    // com_day_cq_dam_core_impl_process_text_extraction_process_properties->max_extract
    cJSON *max_extract = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_process_text_extraction_process_propertiesJSON, "maxExtract");
    if (cJSON_IsNull(max_extract)) {
        max_extract = NULL;
    }
    if (max_extract) { 
    max_extract_local_nonprim = config_node_property_integer_parseFromJSON(max_extract); //nonprimitive
    }



    com_day_cq_dam_core_impl_process_text_extraction_process_properties_local_var = com_day_cq_dam_core_impl_process_text_extraction_process_properties_create_internal (
        mime_types ? mime_types_local_nonprim : NULL,
        max_extract ? max_extract_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_process_text_extraction_process_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_process_text_extraction_process_properties_local_var;
end:
    if (mime_types_local_nonprim) {
        config_node_property_array_free(mime_types_local_nonprim);
        mime_types_local_nonprim = NULL;
    }
    if (max_extract_local_nonprim) {
        config_node_property_integer_free(max_extract_local_nonprim);
        max_extract_local_nonprim = NULL;
    }
    return NULL;

}
