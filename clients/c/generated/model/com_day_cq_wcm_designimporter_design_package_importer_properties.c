#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_designimporter_design_package_importer_properties.h"



static com_day_cq_wcm_designimporter_design_package_importer_properties_t *com_day_cq_wcm_designimporter_design_package_importer_properties_create_internal(
    config_node_property_array_t *extract_filter
    ) {
    com_day_cq_wcm_designimporter_design_package_importer_properties_t *com_day_cq_wcm_designimporter_design_package_importer_properties_local_var = malloc(sizeof(com_day_cq_wcm_designimporter_design_package_importer_properties_t));
    if (!com_day_cq_wcm_designimporter_design_package_importer_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_designimporter_design_package_importer_properties_local_var, 0, sizeof(com_day_cq_wcm_designimporter_design_package_importer_properties_t));
    com_day_cq_wcm_designimporter_design_package_importer_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_designimporter_design_package_importer_properties_local_var->extract_filter = extract_filter;
    return com_day_cq_wcm_designimporter_design_package_importer_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_designimporter_design_package_importer_properties_t *com_day_cq_wcm_designimporter_design_package_importer_properties_create(
    config_node_property_array_t *extract_filter
    ) {
    com_day_cq_wcm_designimporter_design_package_importer_properties_t *result = com_day_cq_wcm_designimporter_design_package_importer_properties_create_internal (
        extract_filter
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_designimporter_design_package_importer_properties_free(com_day_cq_wcm_designimporter_design_package_importer_properties_t *com_day_cq_wcm_designimporter_design_package_importer_properties) {
    if(NULL == com_day_cq_wcm_designimporter_design_package_importer_properties){
        return ;
    }
    if(com_day_cq_wcm_designimporter_design_package_importer_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_designimporter_design_package_importer_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_designimporter_design_package_importer_properties->extract_filter) {
        config_node_property_array_free(com_day_cq_wcm_designimporter_design_package_importer_properties->extract_filter);
        com_day_cq_wcm_designimporter_design_package_importer_properties->extract_filter = NULL;
    }
    free(com_day_cq_wcm_designimporter_design_package_importer_properties);
}

cJSON *com_day_cq_wcm_designimporter_design_package_importer_properties_convertToJSON(com_day_cq_wcm_designimporter_design_package_importer_properties_t *com_day_cq_wcm_designimporter_design_package_importer_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_designimporter_design_package_importer_properties->extract_filter
    if(com_day_cq_wcm_designimporter_design_package_importer_properties->extract_filter) {
    cJSON *extract_filter_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_designimporter_design_package_importer_properties->extract_filter);
    if(extract_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "extract.filter", extract_filter_local_JSON);
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

com_day_cq_wcm_designimporter_design_package_importer_properties_t *com_day_cq_wcm_designimporter_design_package_importer_properties_parseFromJSON(cJSON *com_day_cq_wcm_designimporter_design_package_importer_propertiesJSON){

    com_day_cq_wcm_designimporter_design_package_importer_properties_t *com_day_cq_wcm_designimporter_design_package_importer_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_designimporter_design_package_importer_properties->extract_filter
    config_node_property_array_t *extract_filter_local_nonprim = NULL;

    // com_day_cq_wcm_designimporter_design_package_importer_properties->extract_filter
    cJSON *extract_filter = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_designimporter_design_package_importer_propertiesJSON, "extract.filter");
    if (cJSON_IsNull(extract_filter)) {
        extract_filter = NULL;
    }
    if (extract_filter) { 
    extract_filter_local_nonprim = config_node_property_array_parseFromJSON(extract_filter); //nonprimitive
    }



    com_day_cq_wcm_designimporter_design_package_importer_properties_local_var = com_day_cq_wcm_designimporter_design_package_importer_properties_create_internal (
        extract_filter ? extract_filter_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_designimporter_design_package_importer_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_designimporter_design_package_importer_properties_local_var;
end:
    if (extract_filter_local_nonprim) {
        config_node_property_array_free(extract_filter_local_nonprim);
        extract_filter_local_nonprim = NULL;
    }
    return NULL;

}
