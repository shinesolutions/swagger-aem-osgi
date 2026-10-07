#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_commons_util_impl_asset_cache_impl_properties.h"



static com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_t *com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_create_internal(
    config_node_property_integer_t *large_file_min,
    config_node_property_boolean_t *cache_apply,
    config_node_property_array_t *mime_types
    ) {
    com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_t *com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_local_var = malloc(sizeof(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_t));
    if (!com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_local_var, 0, sizeof(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_t));
    com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_local_var->_library_owned = 1;
    com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_local_var->large_file_min = large_file_min;
    com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_local_var->cache_apply = cache_apply;
    com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_local_var->mime_types = mime_types;
    return com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_t *com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_create(
    config_node_property_integer_t *large_file_min,
    config_node_property_boolean_t *cache_apply,
    config_node_property_array_t *mime_types
    ) {
    com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_t *result = com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_create_internal (
        large_file_min,
        cache_apply,
        mime_types
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_free(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_t *com_day_cq_dam_commons_util_impl_asset_cache_impl_properties) {
    if(NULL == com_day_cq_dam_commons_util_impl_asset_cache_impl_properties){
        return ;
    }
    if(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->large_file_min) {
        config_node_property_integer_free(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->large_file_min);
        com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->large_file_min = NULL;
    }
    if (com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->cache_apply) {
        config_node_property_boolean_free(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->cache_apply);
        com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->cache_apply = NULL;
    }
    if (com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->mime_types) {
        config_node_property_array_free(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->mime_types);
        com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->mime_types = NULL;
    }
    free(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties);
}

cJSON *com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_convertToJSON(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_t *com_day_cq_dam_commons_util_impl_asset_cache_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->large_file_min
    if(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->large_file_min) {
    cJSON *large_file_min_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->large_file_min);
    if(large_file_min_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "large.file.min", large_file_min_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->cache_apply
    if(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->cache_apply) {
    cJSON *cache_apply_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->cache_apply);
    if(cache_apply_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cache.apply", cache_apply_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->mime_types
    if(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->mime_types) {
    cJSON *mime_types_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->mime_types);
    if(mime_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mime.types", mime_types_local_JSON);
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

com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_t *com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_commons_util_impl_asset_cache_impl_propertiesJSON){

    com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_t *com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->large_file_min
    config_node_property_integer_t *large_file_min_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->cache_apply
    config_node_property_boolean_t *cache_apply_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->mime_types
    config_node_property_array_t *mime_types_local_nonprim = NULL;

    // com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->large_file_min
    cJSON *large_file_min = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_commons_util_impl_asset_cache_impl_propertiesJSON, "large.file.min");
    if (cJSON_IsNull(large_file_min)) {
        large_file_min = NULL;
    }
    if (large_file_min) { 
    large_file_min_local_nonprim = config_node_property_integer_parseFromJSON(large_file_min); //nonprimitive
    }

    // com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->cache_apply
    cJSON *cache_apply = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_commons_util_impl_asset_cache_impl_propertiesJSON, "cache.apply");
    if (cJSON_IsNull(cache_apply)) {
        cache_apply = NULL;
    }
    if (cache_apply) { 
    cache_apply_local_nonprim = config_node_property_boolean_parseFromJSON(cache_apply); //nonprimitive
    }

    // com_day_cq_dam_commons_util_impl_asset_cache_impl_properties->mime_types
    cJSON *mime_types = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_commons_util_impl_asset_cache_impl_propertiesJSON, "mime.types");
    if (cJSON_IsNull(mime_types)) {
        mime_types = NULL;
    }
    if (mime_types) { 
    mime_types_local_nonprim = config_node_property_array_parseFromJSON(mime_types); //nonprimitive
    }



    com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_local_var = com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_create_internal (
        large_file_min ? large_file_min_local_nonprim : NULL,
        cache_apply ? cache_apply_local_nonprim : NULL,
        mime_types ? mime_types_local_nonprim : NULL
        );

    if (!com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_commons_util_impl_asset_cache_impl_properties_local_var;
end:
    if (large_file_min_local_nonprim) {
        config_node_property_integer_free(large_file_min_local_nonprim);
        large_file_min_local_nonprim = NULL;
    }
    if (cache_apply_local_nonprim) {
        config_node_property_boolean_free(cache_apply_local_nonprim);
        cache_apply_local_nonprim = NULL;
    }
    if (mime_types_local_nonprim) {
        config_node_property_array_free(mime_types_local_nonprim);
        mime_types_local_nonprim = NULL;
    }
    return NULL;

}
