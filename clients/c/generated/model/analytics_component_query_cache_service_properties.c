#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "analytics_component_query_cache_service_properties.h"



static analytics_component_query_cache_service_properties_t *analytics_component_query_cache_service_properties_create_internal(
    config_node_property_integer_t *cq_analytics_component_query_cache_size
    ) {
    analytics_component_query_cache_service_properties_t *analytics_component_query_cache_service_properties_local_var = malloc(sizeof(analytics_component_query_cache_service_properties_t));
    if (!analytics_component_query_cache_service_properties_local_var) {
        return NULL;
    }
    memset(analytics_component_query_cache_service_properties_local_var, 0, sizeof(analytics_component_query_cache_service_properties_t));
    analytics_component_query_cache_service_properties_local_var->_library_owned = 1;
    analytics_component_query_cache_service_properties_local_var->cq_analytics_component_query_cache_size = cq_analytics_component_query_cache_size;
    return analytics_component_query_cache_service_properties_local_var;
}

__attribute__((deprecated)) analytics_component_query_cache_service_properties_t *analytics_component_query_cache_service_properties_create(
    config_node_property_integer_t *cq_analytics_component_query_cache_size
    ) {
    analytics_component_query_cache_service_properties_t *result = analytics_component_query_cache_service_properties_create_internal (
        cq_analytics_component_query_cache_size
        );
    if (!result) {
    }
    return result;
}

void analytics_component_query_cache_service_properties_free(analytics_component_query_cache_service_properties_t *analytics_component_query_cache_service_properties) {
    if(NULL == analytics_component_query_cache_service_properties){
        return ;
    }
    if(analytics_component_query_cache_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "analytics_component_query_cache_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (analytics_component_query_cache_service_properties->cq_analytics_component_query_cache_size) {
        config_node_property_integer_free(analytics_component_query_cache_service_properties->cq_analytics_component_query_cache_size);
        analytics_component_query_cache_service_properties->cq_analytics_component_query_cache_size = NULL;
    }
    free(analytics_component_query_cache_service_properties);
}

cJSON *analytics_component_query_cache_service_properties_convertToJSON(analytics_component_query_cache_service_properties_t *analytics_component_query_cache_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // analytics_component_query_cache_service_properties->cq_analytics_component_query_cache_size
    if(analytics_component_query_cache_service_properties->cq_analytics_component_query_cache_size) {
    cJSON *cq_analytics_component_query_cache_size_local_JSON = config_node_property_integer_convertToJSON(analytics_component_query_cache_service_properties->cq_analytics_component_query_cache_size);
    if(cq_analytics_component_query_cache_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.analytics.component.query.cache.size", cq_analytics_component_query_cache_size_local_JSON);
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

analytics_component_query_cache_service_properties_t *analytics_component_query_cache_service_properties_parseFromJSON(cJSON *analytics_component_query_cache_service_propertiesJSON){

    analytics_component_query_cache_service_properties_t *analytics_component_query_cache_service_properties_local_var = NULL;

    // define the local variable for analytics_component_query_cache_service_properties->cq_analytics_component_query_cache_size
    config_node_property_integer_t *cq_analytics_component_query_cache_size_local_nonprim = NULL;

    // analytics_component_query_cache_service_properties->cq_analytics_component_query_cache_size
    cJSON *cq_analytics_component_query_cache_size = cJSON_GetObjectItemCaseSensitive(analytics_component_query_cache_service_propertiesJSON, "cq.analytics.component.query.cache.size");
    if (cJSON_IsNull(cq_analytics_component_query_cache_size)) {
        cq_analytics_component_query_cache_size = NULL;
    }
    if (cq_analytics_component_query_cache_size) { 
    cq_analytics_component_query_cache_size_local_nonprim = config_node_property_integer_parseFromJSON(cq_analytics_component_query_cache_size); //nonprimitive
    }



    analytics_component_query_cache_service_properties_local_var = analytics_component_query_cache_service_properties_create_internal (
        cq_analytics_component_query_cache_size ? cq_analytics_component_query_cache_size_local_nonprim : NULL
        );

    if (!analytics_component_query_cache_service_properties_local_var) {
        goto end;
    }

    return analytics_component_query_cache_service_properties_local_var;
end:
    if (cq_analytics_component_query_cache_size_local_nonprim) {
        config_node_property_integer_free(cq_analytics_component_query_cache_size_local_nonprim);
        cq_analytics_component_query_cache_size_local_nonprim = NULL;
    }
    return NULL;

}
