#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties.h"



static com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_t *com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_create_internal(
    config_node_property_array_t *hc_tags,
    config_node_property_array_t *exclude_search_path
    ) {
    com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_t *com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_local_var = malloc(sizeof(com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_t));
    if (!com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_local_var, 0, sizeof(com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_t));
    com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_local_var->_library_owned = 1;
    com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_local_var->hc_tags = hc_tags;
    com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_local_var->exclude_search_path = exclude_search_path;
    return com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_t *com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_create(
    config_node_property_array_t *hc_tags,
    config_node_property_array_t *exclude_search_path
    ) {
    com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_t *result = com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_create_internal (
        hc_tags,
        exclude_search_path
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_free(com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_t *com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties) {
    if(NULL == com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties){
        return ;
    }
    if(com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->hc_tags) {
        config_node_property_array_free(com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->hc_tags);
        com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->hc_tags = NULL;
    }
    if (com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->exclude_search_path) {
        config_node_property_array_free(com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->exclude_search_path);
        com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->exclude_search_path = NULL;
    }
    free(com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties);
}

cJSON *com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_convertToJSON(com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_t *com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->hc_tags
    if(com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->hc_tags) {
    cJSON *hc_tags_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->hc_tags);
    if(hc_tags_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hc.tags", hc_tags_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->exclude_search_path
    if(com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->exclude_search_path) {
    cJSON *exclude_search_path_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->exclude_search_path);
    if(exclude_search_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "exclude.search.path", exclude_search_path_local_JSON);
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

com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_t *com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_parseFromJSON(cJSON *com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_propertiesJSON){

    com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_t *com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->hc_tags
    config_node_property_array_t *hc_tags_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->exclude_search_path
    config_node_property_array_t *exclude_search_path_local_nonprim = NULL;

    // com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->hc_tags
    cJSON *hc_tags = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_propertiesJSON, "hc.tags");
    if (cJSON_IsNull(hc_tags)) {
        hc_tags = NULL;
    }
    if (hc_tags) { 
    hc_tags_local_nonprim = config_node_property_array_parseFromJSON(hc_tags); //nonprimitive
    }

    // com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties->exclude_search_path
    cJSON *exclude_search_path = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_propertiesJSON, "exclude.search.path");
    if (cJSON_IsNull(exclude_search_path)) {
        exclude_search_path = NULL;
    }
    if (exclude_search_path) { 
    exclude_search_path_local_nonprim = config_node_property_array_parseFromJSON(exclude_search_path); //nonprimitive
    }



    com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_local_var = com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_create_internal (
        hc_tags ? hc_tags_local_nonprim : NULL,
        exclude_search_path ? exclude_search_path_local_nonprim : NULL
        );

    if (!com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties_local_var;
end:
    if (hc_tags_local_nonprim) {
        config_node_property_array_free(hc_tags_local_nonprim);
        hc_tags_local_nonprim = NULL;
    }
    if (exclude_search_path_local_nonprim) {
        config_node_property_array_free(exclude_search_path_local_nonprim);
        exclude_search_path_local_nonprim = NULL;
    }
    return NULL;

}
