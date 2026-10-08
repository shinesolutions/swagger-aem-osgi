#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties.h"



static com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_t *com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_create_internal(
    config_node_property_array_t *granite_data
    ) {
    com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_t *com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_t));
    if (!com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_t));
    com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_local_var->granite_data = granite_data;
    return com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_t *com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_create(
    config_node_property_array_t *granite_data
    ) {
    com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_t *result = com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_create_internal (
        granite_data
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_free(com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_t *com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties) {
    if(NULL == com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties->granite_data) {
        config_node_property_array_free(com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties->granite_data);
        com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties->granite_data = NULL;
    }
    free(com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties);
}

cJSON *com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_convertToJSON(com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_t *com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties->granite_data
    if(com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties->granite_data) {
    cJSON *granite_data_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties->granite_data);
    if(granite_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "granite:data", granite_data_local_JSON);
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

com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_t *com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_metadata_editor_select_component_handler_propertiesJSON){

    com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_t *com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties->granite_data
    config_node_property_array_t *granite_data_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties->granite_data
    cJSON *granite_data = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_metadata_editor_select_component_handler_propertiesJSON, "granite:data");
    if (cJSON_IsNull(granite_data)) {
        granite_data = NULL;
    }
    if (granite_data) { 
    granite_data_local_nonprim = config_node_property_array_parseFromJSON(granite_data); //nonprimitive
    }



    com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_local_var = com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_create_internal (
        granite_data ? granite_data_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties_local_var;
end:
    if (granite_data_local_nonprim) {
        config_node_property_array_free(granite_data_local_nonprim);
        granite_data_local_nonprim = NULL;
    }
    return NULL;

}
