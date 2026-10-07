#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties.h"



static com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_t *com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_create_internal(
    config_node_property_string_t *liverelationshipmgr_relationsconfig_default
    ) {
    com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_t *com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_local_var = malloc(sizeof(com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_t));
    if (!com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_local_var, 0, sizeof(com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_t));
    com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_local_var->liverelationshipmgr_relationsconfig_default = liverelationshipmgr_relationsconfig_default;
    return com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_t *com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_create(
    config_node_property_string_t *liverelationshipmgr_relationsconfig_default
    ) {
    com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_t *result = com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_create_internal (
        liverelationshipmgr_relationsconfig_default
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_free(com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_t *com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties) {
    if(NULL == com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties){
        return ;
    }
    if(com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties->liverelationshipmgr_relationsconfig_default) {
        config_node_property_string_free(com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties->liverelationshipmgr_relationsconfig_default);
        com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties->liverelationshipmgr_relationsconfig_default = NULL;
    }
    free(com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties);
}

cJSON *com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_convertToJSON(com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_t *com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties->liverelationshipmgr_relationsconfig_default
    if(com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties->liverelationshipmgr_relationsconfig_default) {
    cJSON *liverelationshipmgr_relationsconfig_default_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties->liverelationshipmgr_relationsconfig_default);
    if(liverelationshipmgr_relationsconfig_default_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "liverelationshipmgr.relationsconfig.default", liverelationshipmgr_relationsconfig_default_local_JSON);
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

com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_t *com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_msm_impl_live_relationship_manager_impl_propertiesJSON){

    com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_t *com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties->liverelationshipmgr_relationsconfig_default
    config_node_property_string_t *liverelationshipmgr_relationsconfig_default_local_nonprim = NULL;

    // com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties->liverelationshipmgr_relationsconfig_default
    cJSON *liverelationshipmgr_relationsconfig_default = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_msm_impl_live_relationship_manager_impl_propertiesJSON, "liverelationshipmgr.relationsconfig.default");
    if (cJSON_IsNull(liverelationshipmgr_relationsconfig_default)) {
        liverelationshipmgr_relationsconfig_default = NULL;
    }
    if (liverelationshipmgr_relationsconfig_default) { 
    liverelationshipmgr_relationsconfig_default_local_nonprim = config_node_property_string_parseFromJSON(liverelationshipmgr_relationsconfig_default); //nonprimitive
    }



    com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_local_var = com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_create_internal (
        liverelationshipmgr_relationsconfig_default ? liverelationshipmgr_relationsconfig_default_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties_local_var;
end:
    if (liverelationshipmgr_relationsconfig_default_local_nonprim) {
        config_node_property_string_free(liverelationshipmgr_relationsconfig_default_local_nonprim);
        liverelationshipmgr_relationsconfig_default_local_nonprim = NULL;
    }
    return NULL;

}
