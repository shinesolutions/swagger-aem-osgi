#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties.h"



static com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_t *com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_create_internal(
    config_node_property_array_t *workflowpackageinfoprovider_filter,
    config_node_property_string_t *workflowpackageinfoprovider_filter_rootpath
    ) {
    com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_t *com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_local_var = malloc(sizeof(com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_t));
    if (!com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_local_var, 0, sizeof(com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_t));
    com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_local_var->workflowpackageinfoprovider_filter = workflowpackageinfoprovider_filter;
    com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_local_var->workflowpackageinfoprovider_filter_rootpath = workflowpackageinfoprovider_filter_rootpath;
    return com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_t *com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_create(
    config_node_property_array_t *workflowpackageinfoprovider_filter,
    config_node_property_string_t *workflowpackageinfoprovider_filter_rootpath
    ) {
    com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_t *result = com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_create_internal (
        workflowpackageinfoprovider_filter,
        workflowpackageinfoprovider_filter_rootpath
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_free(com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_t *com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties) {
    if(NULL == com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties){
        return ;
    }
    if(com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter) {
        config_node_property_array_free(com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter);
        com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter = NULL;
    }
    if (com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter_rootpath) {
        config_node_property_string_free(com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter_rootpath);
        com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter_rootpath = NULL;
    }
    free(com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties);
}

cJSON *com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_convertToJSON(com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_t *com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter
    if(com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter) {
    cJSON *workflowpackageinfoprovider_filter_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter);
    if(workflowpackageinfoprovider_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "workflowpackageinfoprovider.filter", workflowpackageinfoprovider_filter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter_rootpath
    if(com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter_rootpath) {
    cJSON *workflowpackageinfoprovider_filter_rootpath_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter_rootpath);
    if(workflowpackageinfoprovider_filter_rootpath_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "workflowpackageinfoprovider.filter.rootpath", workflowpackageinfoprovider_filter_rootpath_local_JSON);
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

com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_t *com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_parseFromJSON(cJSON *com_day_cq_wcm_workflow_impl_workflow_package_info_provider_propertiesJSON){

    com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_t *com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter
    config_node_property_array_t *workflowpackageinfoprovider_filter_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter_rootpath
    config_node_property_string_t *workflowpackageinfoprovider_filter_rootpath_local_nonprim = NULL;

    // com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter
    cJSON *workflowpackageinfoprovider_filter = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_workflow_impl_workflow_package_info_provider_propertiesJSON, "workflowpackageinfoprovider.filter");
    if (cJSON_IsNull(workflowpackageinfoprovider_filter)) {
        workflowpackageinfoprovider_filter = NULL;
    }
    if (workflowpackageinfoprovider_filter) { 
    workflowpackageinfoprovider_filter_local_nonprim = config_node_property_array_parseFromJSON(workflowpackageinfoprovider_filter); //nonprimitive
    }

    // com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties->workflowpackageinfoprovider_filter_rootpath
    cJSON *workflowpackageinfoprovider_filter_rootpath = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_workflow_impl_workflow_package_info_provider_propertiesJSON, "workflowpackageinfoprovider.filter.rootpath");
    if (cJSON_IsNull(workflowpackageinfoprovider_filter_rootpath)) {
        workflowpackageinfoprovider_filter_rootpath = NULL;
    }
    if (workflowpackageinfoprovider_filter_rootpath) { 
    workflowpackageinfoprovider_filter_rootpath_local_nonprim = config_node_property_string_parseFromJSON(workflowpackageinfoprovider_filter_rootpath); //nonprimitive
    }



    com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_local_var = com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_create_internal (
        workflowpackageinfoprovider_filter ? workflowpackageinfoprovider_filter_local_nonprim : NULL,
        workflowpackageinfoprovider_filter_rootpath ? workflowpackageinfoprovider_filter_rootpath_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_workflow_impl_workflow_package_info_provider_properties_local_var;
end:
    if (workflowpackageinfoprovider_filter_local_nonprim) {
        config_node_property_array_free(workflowpackageinfoprovider_filter_local_nonprim);
        workflowpackageinfoprovider_filter_local_nonprim = NULL;
    }
    if (workflowpackageinfoprovider_filter_rootpath_local_nonprim) {
        config_node_property_string_free(workflowpackageinfoprovider_filter_rootpath_local_nonprim);
        workflowpackageinfoprovider_filter_rootpath_local_nonprim = NULL;
    }
    return NULL;

}
