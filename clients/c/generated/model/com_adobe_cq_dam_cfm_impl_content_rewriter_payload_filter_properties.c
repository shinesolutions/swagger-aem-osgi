#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties.h"



static com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_t *com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_create_internal(
    config_node_property_string_t *pipeline_type
    ) {
    com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_t *com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_local_var = malloc(sizeof(com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_t));
    if (!com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_local_var, 0, sizeof(com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_t));
    com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_local_var->_library_owned = 1;
    com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_local_var->pipeline_type = pipeline_type;
    return com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_t *com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_create(
    config_node_property_string_t *pipeline_type
    ) {
    com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_t *result = com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_create_internal (
        pipeline_type
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_free(com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_t *com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties) {
    if(NULL == com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties){
        return ;
    }
    if(com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties->pipeline_type) {
        config_node_property_string_free(com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties->pipeline_type);
        com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties->pipeline_type = NULL;
    }
    free(com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties);
}

cJSON *com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_convertToJSON(com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_t *com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties->pipeline_type
    if(com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties->pipeline_type) {
    cJSON *pipeline_type_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties->pipeline_type);
    if(pipeline_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pipeline.type", pipeline_type_local_JSON);
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

com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_t *com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_parseFromJSON(cJSON *com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_propertiesJSON){

    com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_t *com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties->pipeline_type
    config_node_property_string_t *pipeline_type_local_nonprim = NULL;

    // com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties->pipeline_type
    cJSON *pipeline_type = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_propertiesJSON, "pipeline.type");
    if (cJSON_IsNull(pipeline_type)) {
        pipeline_type = NULL;
    }
    if (pipeline_type) { 
    pipeline_type_local_nonprim = config_node_property_string_parseFromJSON(pipeline_type); //nonprimitive
    }



    com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_local_var = com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_create_internal (
        pipeline_type ? pipeline_type_local_nonprim : NULL
        );

    if (!com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_properties_local_var;
end:
    if (pipeline_type_local_nonprim) {
        config_node_property_string_free(pipeline_type_local_nonprim);
        pipeline_type_local_nonprim = NULL;
    }
    return NULL;

}
