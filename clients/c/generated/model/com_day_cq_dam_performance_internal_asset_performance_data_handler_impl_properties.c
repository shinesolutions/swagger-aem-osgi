#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties.h"



static com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_t *com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_create_internal(
    config_node_property_integer_t *batch_commit_size
    ) {
    com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_t *com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_local_var = malloc(sizeof(com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_t));
    if (!com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_local_var, 0, sizeof(com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_t));
    com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_local_var->_library_owned = 1;
    com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_local_var->batch_commit_size = batch_commit_size;
    return com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_t *com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_create(
    config_node_property_integer_t *batch_commit_size
    ) {
    com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_t *result = com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_create_internal (
        batch_commit_size
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_free(com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_t *com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties) {
    if(NULL == com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties){
        return ;
    }
    if(com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties->batch_commit_size) {
        config_node_property_integer_free(com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties->batch_commit_size);
        com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties->batch_commit_size = NULL;
    }
    free(com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties);
}

cJSON *com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_convertToJSON(com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_t *com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties->batch_commit_size
    if(com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties->batch_commit_size) {
    cJSON *batch_commit_size_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties->batch_commit_size);
    if(batch_commit_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "batch.commit.size", batch_commit_size_local_JSON);
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

com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_t *com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_propertiesJSON){

    com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_t *com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties->batch_commit_size
    config_node_property_integer_t *batch_commit_size_local_nonprim = NULL;

    // com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties->batch_commit_size
    cJSON *batch_commit_size = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_propertiesJSON, "batch.commit.size");
    if (cJSON_IsNull(batch_commit_size)) {
        batch_commit_size = NULL;
    }
    if (batch_commit_size) { 
    batch_commit_size_local_nonprim = config_node_property_integer_parseFromJSON(batch_commit_size); //nonprimitive
    }



    com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_local_var = com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_create_internal (
        batch_commit_size ? batch_commit_size_local_nonprim : NULL
        );

    if (!com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties_local_var;
end:
    if (batch_commit_size_local_nonprim) {
        config_node_property_integer_free(batch_commit_size_local_nonprim);
        batch_commit_size_local_nonprim = NULL;
    }
    return NULL;

}
