#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties.h"



static com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_t *com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_create_internal(
    config_node_property_array_t *cq_wcm_msm_action_excludednodetypes,
    config_node_property_array_t *cq_wcm_msm_action_excludedparagraphitems,
    config_node_property_array_t *cq_wcm_msm_action_excludedprops
    ) {
    com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_t *com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_local_var = malloc(sizeof(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_t));
    if (!com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_local_var, 0, sizeof(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_t));
    com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_local_var->cq_wcm_msm_action_excludednodetypes = cq_wcm_msm_action_excludednodetypes;
    com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_local_var->cq_wcm_msm_action_excludedparagraphitems = cq_wcm_msm_action_excludedparagraphitems;
    com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_local_var->cq_wcm_msm_action_excludedprops = cq_wcm_msm_action_excludedprops;
    return com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_t *com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_create(
    config_node_property_array_t *cq_wcm_msm_action_excludednodetypes,
    config_node_property_array_t *cq_wcm_msm_action_excludedparagraphitems,
    config_node_property_array_t *cq_wcm_msm_action_excludedprops
    ) {
    com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_t *result = com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_create_internal (
        cq_wcm_msm_action_excludednodetypes,
        cq_wcm_msm_action_excludedparagraphitems,
        cq_wcm_msm_action_excludedprops
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_free(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_t *com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties) {
    if(NULL == com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties){
        return ;
    }
    if(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludednodetypes) {
        config_node_property_array_free(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludednodetypes);
        com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludednodetypes = NULL;
    }
    if (com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedparagraphitems) {
        config_node_property_array_free(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedparagraphitems);
        com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedparagraphitems = NULL;
    }
    if (com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedprops) {
        config_node_property_array_free(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedprops);
        com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedprops = NULL;
    }
    free(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties);
}

cJSON *com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_convertToJSON(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_t *com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludednodetypes
    if(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludednodetypes) {
    cJSON *cq_wcm_msm_action_excludednodetypes_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludednodetypes);
    if(cq_wcm_msm_action_excludednodetypes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.wcm.msm.action.excludednodetypes", cq_wcm_msm_action_excludednodetypes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedparagraphitems
    if(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedparagraphitems) {
    cJSON *cq_wcm_msm_action_excludedparagraphitems_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedparagraphitems);
    if(cq_wcm_msm_action_excludedparagraphitems_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.wcm.msm.action.excludedparagraphitems", cq_wcm_msm_action_excludedparagraphitems_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedprops
    if(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedprops) {
    cJSON *cq_wcm_msm_action_excludedprops_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedprops);
    if(cq_wcm_msm_action_excludedprops_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.wcm.msm.action.excludedprops", cq_wcm_msm_action_excludedprops_local_JSON);
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

com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_t *com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_parseFromJSON(cJSON *com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_propertiesJSON){

    com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_t *com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludednodetypes
    config_node_property_array_t *cq_wcm_msm_action_excludednodetypes_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedparagraphitems
    config_node_property_array_t *cq_wcm_msm_action_excludedparagraphitems_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedprops
    config_node_property_array_t *cq_wcm_msm_action_excludedprops_local_nonprim = NULL;

    // com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludednodetypes
    cJSON *cq_wcm_msm_action_excludednodetypes = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_propertiesJSON, "cq.wcm.msm.action.excludednodetypes");
    if (cJSON_IsNull(cq_wcm_msm_action_excludednodetypes)) {
        cq_wcm_msm_action_excludednodetypes = NULL;
    }
    if (cq_wcm_msm_action_excludednodetypes) { 
    cq_wcm_msm_action_excludednodetypes_local_nonprim = config_node_property_array_parseFromJSON(cq_wcm_msm_action_excludednodetypes); //nonprimitive
    }

    // com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedparagraphitems
    cJSON *cq_wcm_msm_action_excludedparagraphitems = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_propertiesJSON, "cq.wcm.msm.action.excludedparagraphitems");
    if (cJSON_IsNull(cq_wcm_msm_action_excludedparagraphitems)) {
        cq_wcm_msm_action_excludedparagraphitems = NULL;
    }
    if (cq_wcm_msm_action_excludedparagraphitems) { 
    cq_wcm_msm_action_excludedparagraphitems_local_nonprim = config_node_property_array_parseFromJSON(cq_wcm_msm_action_excludedparagraphitems); //nonprimitive
    }

    // com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties->cq_wcm_msm_action_excludedprops
    cJSON *cq_wcm_msm_action_excludedprops = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_propertiesJSON, "cq.wcm.msm.action.excludedprops");
    if (cJSON_IsNull(cq_wcm_msm_action_excludedprops)) {
        cq_wcm_msm_action_excludedprops = NULL;
    }
    if (cq_wcm_msm_action_excludedprops) { 
    cq_wcm_msm_action_excludedprops_local_nonprim = config_node_property_array_parseFromJSON(cq_wcm_msm_action_excludedprops); //nonprimitive
    }



    com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_local_var = com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_create_internal (
        cq_wcm_msm_action_excludednodetypes ? cq_wcm_msm_action_excludednodetypes_local_nonprim : NULL,
        cq_wcm_msm_action_excludedparagraphitems ? cq_wcm_msm_action_excludedparagraphitems_local_nonprim : NULL,
        cq_wcm_msm_action_excludedprops ? cq_wcm_msm_action_excludedprops_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties_local_var;
end:
    if (cq_wcm_msm_action_excludednodetypes_local_nonprim) {
        config_node_property_array_free(cq_wcm_msm_action_excludednodetypes_local_nonprim);
        cq_wcm_msm_action_excludednodetypes_local_nonprim = NULL;
    }
    if (cq_wcm_msm_action_excludedparagraphitems_local_nonprim) {
        config_node_property_array_free(cq_wcm_msm_action_excludedparagraphitems_local_nonprim);
        cq_wcm_msm_action_excludedparagraphitems_local_nonprim = NULL;
    }
    if (cq_wcm_msm_action_excludedprops_local_nonprim) {
        config_node_property_array_free(cq_wcm_msm_action_excludedprops_local_nonprim);
        cq_wcm_msm_action_excludedprops_local_nonprim = NULL;
    }
    return NULL;

}
