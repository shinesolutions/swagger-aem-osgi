#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties.h"



static com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_t *com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_create_internal(
    config_node_property_array_t *hc_tags,
    config_node_property_array_t *ignored_bundles
    ) {
    com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_t *com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_local_var = malloc(sizeof(com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_t));
    if (!com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_local_var, 0, sizeof(com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_t));
    com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_local_var->_library_owned = 1;
    com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_local_var->hc_tags = hc_tags;
    com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_local_var->ignored_bundles = ignored_bundles;
    return com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_t *com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_create(
    config_node_property_array_t *hc_tags,
    config_node_property_array_t *ignored_bundles
    ) {
    com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_t *result = com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_create_internal (
        hc_tags,
        ignored_bundles
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_free(com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_t *com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties) {
    if(NULL == com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties){
        return ;
    }
    if(com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->hc_tags) {
        config_node_property_array_free(com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->hc_tags);
        com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->hc_tags = NULL;
    }
    if (com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->ignored_bundles) {
        config_node_property_array_free(com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->ignored_bundles);
        com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->ignored_bundles = NULL;
    }
    free(com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties);
}

cJSON *com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_convertToJSON(com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_t *com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->hc_tags
    if(com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->hc_tags) {
    cJSON *hc_tags_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->hc_tags);
    if(hc_tags_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hc.tags", hc_tags_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->ignored_bundles
    if(com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->ignored_bundles) {
    cJSON *ignored_bundles_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->ignored_bundles);
    if(ignored_bundles_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ignored.bundles", ignored_bundles_local_JSON);
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

com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_t *com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_parseFromJSON(cJSON *com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_propertiesJSON){

    com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_t *com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->hc_tags
    config_node_property_array_t *hc_tags_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->ignored_bundles
    config_node_property_array_t *ignored_bundles_local_nonprim = NULL;

    // com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->hc_tags
    cJSON *hc_tags = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_propertiesJSON, "hc.tags");
    if (cJSON_IsNull(hc_tags)) {
        hc_tags = NULL;
    }
    if (hc_tags) { 
    hc_tags_local_nonprim = config_node_property_array_parseFromJSON(hc_tags); //nonprimitive
    }

    // com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties->ignored_bundles
    cJSON *ignored_bundles = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_propertiesJSON, "ignored.bundles");
    if (cJSON_IsNull(ignored_bundles)) {
        ignored_bundles = NULL;
    }
    if (ignored_bundles) { 
    ignored_bundles_local_nonprim = config_node_property_array_parseFromJSON(ignored_bundles); //nonprimitive
    }



    com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_local_var = com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_create_internal (
        hc_tags ? hc_tags_local_nonprim : NULL,
        ignored_bundles ? ignored_bundles_local_nonprim : NULL
        );

    if (!com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties_local_var;
end:
    if (hc_tags_local_nonprim) {
        config_node_property_array_free(hc_tags_local_nonprim);
        hc_tags_local_nonprim = NULL;
    }
    if (ignored_bundles_local_nonprim) {
        config_node_property_array_free(ignored_bundles_local_nonprim);
        ignored_bundles_local_nonprim = NULL;
    }
    return NULL;

}
