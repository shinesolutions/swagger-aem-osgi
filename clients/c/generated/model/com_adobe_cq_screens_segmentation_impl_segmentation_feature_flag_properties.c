#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties.h"



static com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_t *com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_create_internal(
    config_node_property_boolean_t *enable_data_triggered_content
    ) {
    com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_t *com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_local_var = malloc(sizeof(com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_t));
    if (!com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_local_var, 0, sizeof(com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_t));
    com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_local_var->_library_owned = 1;
    com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_local_var->enable_data_triggered_content = enable_data_triggered_content;
    return com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_t *com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_create(
    config_node_property_boolean_t *enable_data_triggered_content
    ) {
    com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_t *result = com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_create_internal (
        enable_data_triggered_content
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_free(com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_t *com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties) {
    if(NULL == com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties){
        return ;
    }
    if(com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties->enable_data_triggered_content) {
        config_node_property_boolean_free(com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties->enable_data_triggered_content);
        com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties->enable_data_triggered_content = NULL;
    }
    free(com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties);
}

cJSON *com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_convertToJSON(com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_t *com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties->enable_data_triggered_content
    if(com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties->enable_data_triggered_content) {
    cJSON *enable_data_triggered_content_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties->enable_data_triggered_content);
    if(enable_data_triggered_content_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enableDataTriggeredContent", enable_data_triggered_content_local_JSON);
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

com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_t *com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_parseFromJSON(cJSON *com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_propertiesJSON){

    com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_t *com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties->enable_data_triggered_content
    config_node_property_boolean_t *enable_data_triggered_content_local_nonprim = NULL;

    // com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties->enable_data_triggered_content
    cJSON *enable_data_triggered_content = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_propertiesJSON, "enableDataTriggeredContent");
    if (cJSON_IsNull(enable_data_triggered_content)) {
        enable_data_triggered_content = NULL;
    }
    if (enable_data_triggered_content) { 
    enable_data_triggered_content_local_nonprim = config_node_property_boolean_parseFromJSON(enable_data_triggered_content); //nonprimitive
    }



    com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_local_var = com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_create_internal (
        enable_data_triggered_content ? enable_data_triggered_content_local_nonprim : NULL
        );

    if (!com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties_local_var;
end:
    if (enable_data_triggered_content_local_nonprim) {
        config_node_property_boolean_free(enable_data_triggered_content_local_nonprim);
        enable_data_triggered_content_local_nonprim = NULL;
    }
    return NULL;

}
