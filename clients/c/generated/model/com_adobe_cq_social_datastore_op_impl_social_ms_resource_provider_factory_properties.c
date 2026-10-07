#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties.h"



static com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_t *com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_create_internal(
    config_node_property_string_t *solr_zk_timeout,
    config_node_property_string_t *solr_commit,
    config_node_property_boolean_t *cache_on,
    config_node_property_integer_t *concurrency_level,
    config_node_property_integer_t *cache_start_size,
    config_node_property_integer_t *cache_ttl,
    config_node_property_integer_t *cache_size
    ) {
    com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_t *com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var = malloc(sizeof(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_t));
    if (!com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var, 0, sizeof(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_t));
    com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var->solr_zk_timeout = solr_zk_timeout;
    com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var->solr_commit = solr_commit;
    com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var->cache_on = cache_on;
    com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var->concurrency_level = concurrency_level;
    com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var->cache_start_size = cache_start_size;
    com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var->cache_ttl = cache_ttl;
    com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var->cache_size = cache_size;
    return com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_t *com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_create(
    config_node_property_string_t *solr_zk_timeout,
    config_node_property_string_t *solr_commit,
    config_node_property_boolean_t *cache_on,
    config_node_property_integer_t *concurrency_level,
    config_node_property_integer_t *cache_start_size,
    config_node_property_integer_t *cache_ttl,
    config_node_property_integer_t *cache_size
    ) {
    com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_t *result = com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_create_internal (
        solr_zk_timeout,
        solr_commit,
        cache_on,
        concurrency_level,
        cache_start_size,
        cache_ttl,
        cache_size
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_free(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_t *com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties) {
    if(NULL == com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties){
        return ;
    }
    if(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_zk_timeout) {
        config_node_property_string_free(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_zk_timeout);
        com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_zk_timeout = NULL;
    }
    if (com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_commit) {
        config_node_property_string_free(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_commit);
        com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_commit = NULL;
    }
    if (com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_on) {
        config_node_property_boolean_free(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_on);
        com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_on = NULL;
    }
    if (com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->concurrency_level) {
        config_node_property_integer_free(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->concurrency_level);
        com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->concurrency_level = NULL;
    }
    if (com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_start_size) {
        config_node_property_integer_free(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_start_size);
        com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_start_size = NULL;
    }
    if (com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_ttl) {
        config_node_property_integer_free(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_ttl);
        com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_ttl = NULL;
    }
    if (com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_size) {
        config_node_property_integer_free(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_size);
        com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_size = NULL;
    }
    free(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties);
}

cJSON *com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_convertToJSON(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_t *com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_zk_timeout
    if(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_zk_timeout) {
    cJSON *solr_zk_timeout_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_zk_timeout);
    if(solr_zk_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "solr.zk.timeout", solr_zk_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_commit
    if(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_commit) {
    cJSON *solr_commit_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_commit);
    if(solr_commit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "solr.commit", solr_commit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_on
    if(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_on) {
    cJSON *cache_on_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_on);
    if(cache_on_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cache.on", cache_on_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->concurrency_level
    if(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->concurrency_level) {
    cJSON *concurrency_level_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->concurrency_level);
    if(concurrency_level_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "concurrency.level", concurrency_level_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_start_size
    if(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_start_size) {
    cJSON *cache_start_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_start_size);
    if(cache_start_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cache.start.size", cache_start_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_ttl
    if(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_ttl) {
    cJSON *cache_ttl_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_ttl);
    if(cache_ttl_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cache.ttl", cache_ttl_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_size
    if(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_size) {
    cJSON *cache_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_size);
    if(cache_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cache.size", cache_size_local_JSON);
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

com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_t *com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_parseFromJSON(cJSON *com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_propertiesJSON){

    com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_t *com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_zk_timeout
    config_node_property_string_t *solr_zk_timeout_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_commit
    config_node_property_string_t *solr_commit_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_on
    config_node_property_boolean_t *cache_on_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->concurrency_level
    config_node_property_integer_t *concurrency_level_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_start_size
    config_node_property_integer_t *cache_start_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_ttl
    config_node_property_integer_t *cache_ttl_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_size
    config_node_property_integer_t *cache_size_local_nonprim = NULL;

    // com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_zk_timeout
    cJSON *solr_zk_timeout = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_propertiesJSON, "solr.zk.timeout");
    if (cJSON_IsNull(solr_zk_timeout)) {
        solr_zk_timeout = NULL;
    }
    if (solr_zk_timeout) { 
    solr_zk_timeout_local_nonprim = config_node_property_string_parseFromJSON(solr_zk_timeout); //nonprimitive
    }

    // com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->solr_commit
    cJSON *solr_commit = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_propertiesJSON, "solr.commit");
    if (cJSON_IsNull(solr_commit)) {
        solr_commit = NULL;
    }
    if (solr_commit) { 
    solr_commit_local_nonprim = config_node_property_string_parseFromJSON(solr_commit); //nonprimitive
    }

    // com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_on
    cJSON *cache_on = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_propertiesJSON, "cache.on");
    if (cJSON_IsNull(cache_on)) {
        cache_on = NULL;
    }
    if (cache_on) { 
    cache_on_local_nonprim = config_node_property_boolean_parseFromJSON(cache_on); //nonprimitive
    }

    // com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->concurrency_level
    cJSON *concurrency_level = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_propertiesJSON, "concurrency.level");
    if (cJSON_IsNull(concurrency_level)) {
        concurrency_level = NULL;
    }
    if (concurrency_level) { 
    concurrency_level_local_nonprim = config_node_property_integer_parseFromJSON(concurrency_level); //nonprimitive
    }

    // com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_start_size
    cJSON *cache_start_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_propertiesJSON, "cache.start.size");
    if (cJSON_IsNull(cache_start_size)) {
        cache_start_size = NULL;
    }
    if (cache_start_size) { 
    cache_start_size_local_nonprim = config_node_property_integer_parseFromJSON(cache_start_size); //nonprimitive
    }

    // com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_ttl
    cJSON *cache_ttl = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_propertiesJSON, "cache.ttl");
    if (cJSON_IsNull(cache_ttl)) {
        cache_ttl = NULL;
    }
    if (cache_ttl) { 
    cache_ttl_local_nonprim = config_node_property_integer_parseFromJSON(cache_ttl); //nonprimitive
    }

    // com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties->cache_size
    cJSON *cache_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_propertiesJSON, "cache.size");
    if (cJSON_IsNull(cache_size)) {
        cache_size = NULL;
    }
    if (cache_size) { 
    cache_size_local_nonprim = config_node_property_integer_parseFromJSON(cache_size); //nonprimitive
    }



    com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var = com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_create_internal (
        solr_zk_timeout ? solr_zk_timeout_local_nonprim : NULL,
        solr_commit ? solr_commit_local_nonprim : NULL,
        cache_on ? cache_on_local_nonprim : NULL,
        concurrency_level ? concurrency_level_local_nonprim : NULL,
        cache_start_size ? cache_start_size_local_nonprim : NULL,
        cache_ttl ? cache_ttl_local_nonprim : NULL,
        cache_size ? cache_size_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties_local_var;
end:
    if (solr_zk_timeout_local_nonprim) {
        config_node_property_string_free(solr_zk_timeout_local_nonprim);
        solr_zk_timeout_local_nonprim = NULL;
    }
    if (solr_commit_local_nonprim) {
        config_node_property_string_free(solr_commit_local_nonprim);
        solr_commit_local_nonprim = NULL;
    }
    if (cache_on_local_nonprim) {
        config_node_property_boolean_free(cache_on_local_nonprim);
        cache_on_local_nonprim = NULL;
    }
    if (concurrency_level_local_nonprim) {
        config_node_property_integer_free(concurrency_level_local_nonprim);
        concurrency_level_local_nonprim = NULL;
    }
    if (cache_start_size_local_nonprim) {
        config_node_property_integer_free(cache_start_size_local_nonprim);
        cache_start_size_local_nonprim = NULL;
    }
    if (cache_ttl_local_nonprim) {
        config_node_property_integer_free(cache_ttl_local_nonprim);
        cache_ttl_local_nonprim = NULL;
    }
    if (cache_size_local_nonprim) {
        config_node_property_integer_free(cache_size_local_nonprim);
        cache_size_local_nonprim = NULL;
    }
    return NULL;

}
