#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties.h"



static com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_t *com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_create_internal(
    config_node_property_string_t *sling_auth_requirements
    ) {
    com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_t *com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_local_var = malloc(sizeof(com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_t));
    if (!com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_local_var, 0, sizeof(com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_t));
    com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_local_var->sling_auth_requirements = sling_auth_requirements;
    return com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_t *com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_create(
    config_node_property_string_t *sling_auth_requirements
    ) {
    com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_t *result = com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_create_internal (
        sling_auth_requirements
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_free(com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_t *com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties) {
    if(NULL == com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties){
        return ;
    }
    if(com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties->sling_auth_requirements) {
        config_node_property_string_free(com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties->sling_auth_requirements);
        com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties->sling_auth_requirements = NULL;
    }
    free(com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties);
}

cJSON *com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_convertToJSON(com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_t *com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties->sling_auth_requirements
    if(com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties->sling_auth_requirements) {
    cJSON *sling_auth_requirements_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties->sling_auth_requirements);
    if(sling_auth_requirements_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.auth.requirements", sling_auth_requirements_local_JSON);
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

com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_t *com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_parseFromJSON(cJSON *com_day_cq_wcm_foundation_impl_page_impressions_tracker_propertiesJSON){

    com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_t *com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties->sling_auth_requirements
    config_node_property_string_t *sling_auth_requirements_local_nonprim = NULL;

    // com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties->sling_auth_requirements
    cJSON *sling_auth_requirements = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_impl_page_impressions_tracker_propertiesJSON, "sling.auth.requirements");
    if (cJSON_IsNull(sling_auth_requirements)) {
        sling_auth_requirements = NULL;
    }
    if (sling_auth_requirements) { 
    sling_auth_requirements_local_nonprim = config_node_property_string_parseFromJSON(sling_auth_requirements); //nonprimitive
    }



    com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_local_var = com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_create_internal (
        sling_auth_requirements ? sling_auth_requirements_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties_local_var;
end:
    if (sling_auth_requirements_local_nonprim) {
        config_node_property_string_free(sling_auth_requirements_local_nonprim);
        sling_auth_requirements_local_nonprim = NULL;
    }
    return NULL;

}
