#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties.h"



static com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_t *com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_create_internal(
    config_node_property_boolean_t *skip_bufferedcache
    ) {
    com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_t *com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_t));
    if (!com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_t));
    com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_local_var->skip_bufferedcache = skip_bufferedcache;
    return com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_t *com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_create(
    config_node_property_boolean_t *skip_bufferedcache
    ) {
    com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_t *result = com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_create_internal (
        skip_bufferedcache
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_free(com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_t *com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties) {
    if(NULL == com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties->skip_bufferedcache) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties->skip_bufferedcache);
        com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties->skip_bufferedcache = NULL;
    }
    free(com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties);
}

cJSON *com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_convertToJSON(com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_t *com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties->skip_bufferedcache
    if(com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties->skip_bufferedcache) {
    cJSON *skip_bufferedcache_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties->skip_bufferedcache);
    if(skip_bufferedcache_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "skip.bufferedcache", skip_bufferedcache_local_JSON);
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

com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_t *com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_propertiesJSON){

    com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_t *com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties->skip_bufferedcache
    config_node_property_boolean_t *skip_bufferedcache_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties->skip_bufferedcache
    cJSON *skip_bufferedcache = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_propertiesJSON, "skip.bufferedcache");
    if (cJSON_IsNull(skip_bufferedcache)) {
        skip_bufferedcache = NULL;
    }
    if (skip_bufferedcache) { 
    skip_bufferedcache_local_nonprim = config_node_property_boolean_parseFromJSON(skip_bufferedcache); //nonprimitive
    }



    com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_local_var = com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_create_internal (
        skip_bufferedcache ? skip_bufferedcache_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties_local_var;
end:
    if (skip_bufferedcache_local_nonprim) {
        config_node_property_boolean_free(skip_bufferedcache_local_nonprim);
        skip_bufferedcache_local_nonprim = NULL;
    }
    return NULL;

}
