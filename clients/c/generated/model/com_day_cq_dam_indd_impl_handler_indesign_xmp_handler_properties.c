#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties.h"



static com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_t *com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_create_internal(
    config_node_property_string_t *process_label,
    config_node_property_boolean_t *extract_pages
    ) {
    com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_t *com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_local_var = malloc(sizeof(com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_t));
    if (!com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_local_var, 0, sizeof(com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_t));
    com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_local_var->_library_owned = 1;
    com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_local_var->process_label = process_label;
    com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_local_var->extract_pages = extract_pages;
    return com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_t *com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_create(
    config_node_property_string_t *process_label,
    config_node_property_boolean_t *extract_pages
    ) {
    com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_t *result = com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_create_internal (
        process_label,
        extract_pages
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_free(com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_t *com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties) {
    if(NULL == com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties){
        return ;
    }
    if(com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->process_label) {
        config_node_property_string_free(com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->process_label);
        com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->process_label = NULL;
    }
    if (com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->extract_pages) {
        config_node_property_boolean_free(com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->extract_pages);
        com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->extract_pages = NULL;
    }
    free(com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties);
}

cJSON *com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_convertToJSON(com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_t *com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->process_label
    if(com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->process_label) {
    cJSON *process_label_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->process_label);
    if(process_label_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "process.label", process_label_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->extract_pages
    if(com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->extract_pages) {
    cJSON *extract_pages_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->extract_pages);
    if(extract_pages_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "extract.pages", extract_pages_local_JSON);
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

com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_t *com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_parseFromJSON(cJSON *com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_propertiesJSON){

    com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_t *com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->process_label
    config_node_property_string_t *process_label_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->extract_pages
    config_node_property_boolean_t *extract_pages_local_nonprim = NULL;

    // com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->process_label
    cJSON *process_label = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_propertiesJSON, "process.label");
    if (cJSON_IsNull(process_label)) {
        process_label = NULL;
    }
    if (process_label) { 
    process_label_local_nonprim = config_node_property_string_parseFromJSON(process_label); //nonprimitive
    }

    // com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties->extract_pages
    cJSON *extract_pages = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_propertiesJSON, "extract.pages");
    if (cJSON_IsNull(extract_pages)) {
        extract_pages = NULL;
    }
    if (extract_pages) { 
    extract_pages_local_nonprim = config_node_property_boolean_parseFromJSON(extract_pages); //nonprimitive
    }



    com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_local_var = com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_create_internal (
        process_label ? process_label_local_nonprim : NULL,
        extract_pages ? extract_pages_local_nonprim : NULL
        );

    if (!com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties_local_var;
end:
    if (process_label_local_nonprim) {
        config_node_property_string_free(process_label_local_nonprim);
        process_label_local_nonprim = NULL;
    }
    if (extract_pages_local_nonprim) {
        config_node_property_boolean_free(extract_pages_local_nonprim);
        extract_pages_local_nonprim = NULL;
    }
    return NULL;

}
