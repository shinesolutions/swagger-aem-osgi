#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_reporting_impl_cache_cache_impl_properties.h"



static com_day_cq_reporting_impl_cache_cache_impl_properties_t *com_day_cq_reporting_impl_cache_cache_impl_properties_create_internal(
    config_node_property_boolean_t *repcache_enable,
    config_node_property_integer_t *repcache_ttl,
    config_node_property_integer_t *repcache_max
    ) {
    com_day_cq_reporting_impl_cache_cache_impl_properties_t *com_day_cq_reporting_impl_cache_cache_impl_properties_local_var = malloc(sizeof(com_day_cq_reporting_impl_cache_cache_impl_properties_t));
    if (!com_day_cq_reporting_impl_cache_cache_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_reporting_impl_cache_cache_impl_properties_local_var, 0, sizeof(com_day_cq_reporting_impl_cache_cache_impl_properties_t));
    com_day_cq_reporting_impl_cache_cache_impl_properties_local_var->_library_owned = 1;
    com_day_cq_reporting_impl_cache_cache_impl_properties_local_var->repcache_enable = repcache_enable;
    com_day_cq_reporting_impl_cache_cache_impl_properties_local_var->repcache_ttl = repcache_ttl;
    com_day_cq_reporting_impl_cache_cache_impl_properties_local_var->repcache_max = repcache_max;
    return com_day_cq_reporting_impl_cache_cache_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_reporting_impl_cache_cache_impl_properties_t *com_day_cq_reporting_impl_cache_cache_impl_properties_create(
    config_node_property_boolean_t *repcache_enable,
    config_node_property_integer_t *repcache_ttl,
    config_node_property_integer_t *repcache_max
    ) {
    com_day_cq_reporting_impl_cache_cache_impl_properties_t *result = com_day_cq_reporting_impl_cache_cache_impl_properties_create_internal (
        repcache_enable,
        repcache_ttl,
        repcache_max
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_reporting_impl_cache_cache_impl_properties_free(com_day_cq_reporting_impl_cache_cache_impl_properties_t *com_day_cq_reporting_impl_cache_cache_impl_properties) {
    if(NULL == com_day_cq_reporting_impl_cache_cache_impl_properties){
        return ;
    }
    if(com_day_cq_reporting_impl_cache_cache_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_reporting_impl_cache_cache_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_enable) {
        config_node_property_boolean_free(com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_enable);
        com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_enable = NULL;
    }
    if (com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_ttl) {
        config_node_property_integer_free(com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_ttl);
        com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_ttl = NULL;
    }
    if (com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_max) {
        config_node_property_integer_free(com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_max);
        com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_max = NULL;
    }
    free(com_day_cq_reporting_impl_cache_cache_impl_properties);
}

cJSON *com_day_cq_reporting_impl_cache_cache_impl_properties_convertToJSON(com_day_cq_reporting_impl_cache_cache_impl_properties_t *com_day_cq_reporting_impl_cache_cache_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_enable
    if(com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_enable) {
    cJSON *repcache_enable_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_enable);
    if(repcache_enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repcache.enable", repcache_enable_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_ttl
    if(com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_ttl) {
    cJSON *repcache_ttl_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_ttl);
    if(repcache_ttl_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repcache.ttl", repcache_ttl_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_max
    if(com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_max) {
    cJSON *repcache_max_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_max);
    if(repcache_max_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repcache.max", repcache_max_local_JSON);
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

com_day_cq_reporting_impl_cache_cache_impl_properties_t *com_day_cq_reporting_impl_cache_cache_impl_properties_parseFromJSON(cJSON *com_day_cq_reporting_impl_cache_cache_impl_propertiesJSON){

    com_day_cq_reporting_impl_cache_cache_impl_properties_t *com_day_cq_reporting_impl_cache_cache_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_enable
    config_node_property_boolean_t *repcache_enable_local_nonprim = NULL;

    // define the local variable for com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_ttl
    config_node_property_integer_t *repcache_ttl_local_nonprim = NULL;

    // define the local variable for com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_max
    config_node_property_integer_t *repcache_max_local_nonprim = NULL;

    // com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_enable
    cJSON *repcache_enable = cJSON_GetObjectItemCaseSensitive(com_day_cq_reporting_impl_cache_cache_impl_propertiesJSON, "repcache.enable");
    if (cJSON_IsNull(repcache_enable)) {
        repcache_enable = NULL;
    }
    if (repcache_enable) { 
    repcache_enable_local_nonprim = config_node_property_boolean_parseFromJSON(repcache_enable); //nonprimitive
    }

    // com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_ttl
    cJSON *repcache_ttl = cJSON_GetObjectItemCaseSensitive(com_day_cq_reporting_impl_cache_cache_impl_propertiesJSON, "repcache.ttl");
    if (cJSON_IsNull(repcache_ttl)) {
        repcache_ttl = NULL;
    }
    if (repcache_ttl) { 
    repcache_ttl_local_nonprim = config_node_property_integer_parseFromJSON(repcache_ttl); //nonprimitive
    }

    // com_day_cq_reporting_impl_cache_cache_impl_properties->repcache_max
    cJSON *repcache_max = cJSON_GetObjectItemCaseSensitive(com_day_cq_reporting_impl_cache_cache_impl_propertiesJSON, "repcache.max");
    if (cJSON_IsNull(repcache_max)) {
        repcache_max = NULL;
    }
    if (repcache_max) { 
    repcache_max_local_nonprim = config_node_property_integer_parseFromJSON(repcache_max); //nonprimitive
    }



    com_day_cq_reporting_impl_cache_cache_impl_properties_local_var = com_day_cq_reporting_impl_cache_cache_impl_properties_create_internal (
        repcache_enable ? repcache_enable_local_nonprim : NULL,
        repcache_ttl ? repcache_ttl_local_nonprim : NULL,
        repcache_max ? repcache_max_local_nonprim : NULL
        );

    if (!com_day_cq_reporting_impl_cache_cache_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_reporting_impl_cache_cache_impl_properties_local_var;
end:
    if (repcache_enable_local_nonprim) {
        config_node_property_boolean_free(repcache_enable_local_nonprim);
        repcache_enable_local_nonprim = NULL;
    }
    if (repcache_ttl_local_nonprim) {
        config_node_property_integer_free(repcache_ttl_local_nonprim);
        repcache_ttl_local_nonprim = NULL;
    }
    if (repcache_max_local_nonprim) {
        config_node_property_integer_free(repcache_max_local_nonprim);
        repcache_max_local_nonprim = NULL;
    }
    return NULL;

}
