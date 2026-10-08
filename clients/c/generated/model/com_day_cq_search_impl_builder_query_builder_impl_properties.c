#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_search_impl_builder_query_builder_impl_properties.h"



static com_day_cq_search_impl_builder_query_builder_impl_properties_t *com_day_cq_search_impl_builder_query_builder_impl_properties_create_internal(
    config_node_property_array_t *excerpt_properties,
    config_node_property_integer_t *cache_max_entries,
    config_node_property_integer_t *cache_entry_lifetime,
    config_node_property_boolean_t *xpath_union
    ) {
    com_day_cq_search_impl_builder_query_builder_impl_properties_t *com_day_cq_search_impl_builder_query_builder_impl_properties_local_var = malloc(sizeof(com_day_cq_search_impl_builder_query_builder_impl_properties_t));
    if (!com_day_cq_search_impl_builder_query_builder_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_search_impl_builder_query_builder_impl_properties_local_var, 0, sizeof(com_day_cq_search_impl_builder_query_builder_impl_properties_t));
    com_day_cq_search_impl_builder_query_builder_impl_properties_local_var->_library_owned = 1;
    com_day_cq_search_impl_builder_query_builder_impl_properties_local_var->excerpt_properties = excerpt_properties;
    com_day_cq_search_impl_builder_query_builder_impl_properties_local_var->cache_max_entries = cache_max_entries;
    com_day_cq_search_impl_builder_query_builder_impl_properties_local_var->cache_entry_lifetime = cache_entry_lifetime;
    com_day_cq_search_impl_builder_query_builder_impl_properties_local_var->xpath_union = xpath_union;
    return com_day_cq_search_impl_builder_query_builder_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_search_impl_builder_query_builder_impl_properties_t *com_day_cq_search_impl_builder_query_builder_impl_properties_create(
    config_node_property_array_t *excerpt_properties,
    config_node_property_integer_t *cache_max_entries,
    config_node_property_integer_t *cache_entry_lifetime,
    config_node_property_boolean_t *xpath_union
    ) {
    com_day_cq_search_impl_builder_query_builder_impl_properties_t *result = com_day_cq_search_impl_builder_query_builder_impl_properties_create_internal (
        excerpt_properties,
        cache_max_entries,
        cache_entry_lifetime,
        xpath_union
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_search_impl_builder_query_builder_impl_properties_free(com_day_cq_search_impl_builder_query_builder_impl_properties_t *com_day_cq_search_impl_builder_query_builder_impl_properties) {
    if(NULL == com_day_cq_search_impl_builder_query_builder_impl_properties){
        return ;
    }
    if(com_day_cq_search_impl_builder_query_builder_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_search_impl_builder_query_builder_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_search_impl_builder_query_builder_impl_properties->excerpt_properties) {
        config_node_property_array_free(com_day_cq_search_impl_builder_query_builder_impl_properties->excerpt_properties);
        com_day_cq_search_impl_builder_query_builder_impl_properties->excerpt_properties = NULL;
    }
    if (com_day_cq_search_impl_builder_query_builder_impl_properties->cache_max_entries) {
        config_node_property_integer_free(com_day_cq_search_impl_builder_query_builder_impl_properties->cache_max_entries);
        com_day_cq_search_impl_builder_query_builder_impl_properties->cache_max_entries = NULL;
    }
    if (com_day_cq_search_impl_builder_query_builder_impl_properties->cache_entry_lifetime) {
        config_node_property_integer_free(com_day_cq_search_impl_builder_query_builder_impl_properties->cache_entry_lifetime);
        com_day_cq_search_impl_builder_query_builder_impl_properties->cache_entry_lifetime = NULL;
    }
    if (com_day_cq_search_impl_builder_query_builder_impl_properties->xpath_union) {
        config_node_property_boolean_free(com_day_cq_search_impl_builder_query_builder_impl_properties->xpath_union);
        com_day_cq_search_impl_builder_query_builder_impl_properties->xpath_union = NULL;
    }
    free(com_day_cq_search_impl_builder_query_builder_impl_properties);
}

cJSON *com_day_cq_search_impl_builder_query_builder_impl_properties_convertToJSON(com_day_cq_search_impl_builder_query_builder_impl_properties_t *com_day_cq_search_impl_builder_query_builder_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_search_impl_builder_query_builder_impl_properties->excerpt_properties
    if(com_day_cq_search_impl_builder_query_builder_impl_properties->excerpt_properties) {
    cJSON *excerpt_properties_local_JSON = config_node_property_array_convertToJSON(com_day_cq_search_impl_builder_query_builder_impl_properties->excerpt_properties);
    if(excerpt_properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "excerpt.properties", excerpt_properties_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_search_impl_builder_query_builder_impl_properties->cache_max_entries
    if(com_day_cq_search_impl_builder_query_builder_impl_properties->cache_max_entries) {
    cJSON *cache_max_entries_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_search_impl_builder_query_builder_impl_properties->cache_max_entries);
    if(cache_max_entries_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cache.max.entries", cache_max_entries_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_search_impl_builder_query_builder_impl_properties->cache_entry_lifetime
    if(com_day_cq_search_impl_builder_query_builder_impl_properties->cache_entry_lifetime) {
    cJSON *cache_entry_lifetime_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_search_impl_builder_query_builder_impl_properties->cache_entry_lifetime);
    if(cache_entry_lifetime_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cache.entry.lifetime", cache_entry_lifetime_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_search_impl_builder_query_builder_impl_properties->xpath_union
    if(com_day_cq_search_impl_builder_query_builder_impl_properties->xpath_union) {
    cJSON *xpath_union_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_search_impl_builder_query_builder_impl_properties->xpath_union);
    if(xpath_union_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "xpath.union", xpath_union_local_JSON);
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

com_day_cq_search_impl_builder_query_builder_impl_properties_t *com_day_cq_search_impl_builder_query_builder_impl_properties_parseFromJSON(cJSON *com_day_cq_search_impl_builder_query_builder_impl_propertiesJSON){

    com_day_cq_search_impl_builder_query_builder_impl_properties_t *com_day_cq_search_impl_builder_query_builder_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_search_impl_builder_query_builder_impl_properties->excerpt_properties
    config_node_property_array_t *excerpt_properties_local_nonprim = NULL;

    // define the local variable for com_day_cq_search_impl_builder_query_builder_impl_properties->cache_max_entries
    config_node_property_integer_t *cache_max_entries_local_nonprim = NULL;

    // define the local variable for com_day_cq_search_impl_builder_query_builder_impl_properties->cache_entry_lifetime
    config_node_property_integer_t *cache_entry_lifetime_local_nonprim = NULL;

    // define the local variable for com_day_cq_search_impl_builder_query_builder_impl_properties->xpath_union
    config_node_property_boolean_t *xpath_union_local_nonprim = NULL;

    // com_day_cq_search_impl_builder_query_builder_impl_properties->excerpt_properties
    cJSON *excerpt_properties = cJSON_GetObjectItemCaseSensitive(com_day_cq_search_impl_builder_query_builder_impl_propertiesJSON, "excerpt.properties");
    if (cJSON_IsNull(excerpt_properties)) {
        excerpt_properties = NULL;
    }
    if (excerpt_properties) { 
    excerpt_properties_local_nonprim = config_node_property_array_parseFromJSON(excerpt_properties); //nonprimitive
    }

    // com_day_cq_search_impl_builder_query_builder_impl_properties->cache_max_entries
    cJSON *cache_max_entries = cJSON_GetObjectItemCaseSensitive(com_day_cq_search_impl_builder_query_builder_impl_propertiesJSON, "cache.max.entries");
    if (cJSON_IsNull(cache_max_entries)) {
        cache_max_entries = NULL;
    }
    if (cache_max_entries) { 
    cache_max_entries_local_nonprim = config_node_property_integer_parseFromJSON(cache_max_entries); //nonprimitive
    }

    // com_day_cq_search_impl_builder_query_builder_impl_properties->cache_entry_lifetime
    cJSON *cache_entry_lifetime = cJSON_GetObjectItemCaseSensitive(com_day_cq_search_impl_builder_query_builder_impl_propertiesJSON, "cache.entry.lifetime");
    if (cJSON_IsNull(cache_entry_lifetime)) {
        cache_entry_lifetime = NULL;
    }
    if (cache_entry_lifetime) { 
    cache_entry_lifetime_local_nonprim = config_node_property_integer_parseFromJSON(cache_entry_lifetime); //nonprimitive
    }

    // com_day_cq_search_impl_builder_query_builder_impl_properties->xpath_union
    cJSON *xpath_union = cJSON_GetObjectItemCaseSensitive(com_day_cq_search_impl_builder_query_builder_impl_propertiesJSON, "xpath.union");
    if (cJSON_IsNull(xpath_union)) {
        xpath_union = NULL;
    }
    if (xpath_union) { 
    xpath_union_local_nonprim = config_node_property_boolean_parseFromJSON(xpath_union); //nonprimitive
    }



    com_day_cq_search_impl_builder_query_builder_impl_properties_local_var = com_day_cq_search_impl_builder_query_builder_impl_properties_create_internal (
        excerpt_properties ? excerpt_properties_local_nonprim : NULL,
        cache_max_entries ? cache_max_entries_local_nonprim : NULL,
        cache_entry_lifetime ? cache_entry_lifetime_local_nonprim : NULL,
        xpath_union ? xpath_union_local_nonprim : NULL
        );

    if (!com_day_cq_search_impl_builder_query_builder_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_search_impl_builder_query_builder_impl_properties_local_var;
end:
    if (excerpt_properties_local_nonprim) {
        config_node_property_array_free(excerpt_properties_local_nonprim);
        excerpt_properties_local_nonprim = NULL;
    }
    if (cache_max_entries_local_nonprim) {
        config_node_property_integer_free(cache_max_entries_local_nonprim);
        cache_max_entries_local_nonprim = NULL;
    }
    if (cache_entry_lifetime_local_nonprim) {
        config_node_property_integer_free(cache_entry_lifetime_local_nonprim);
        cache_entry_lifetime_local_nonprim = NULL;
    }
    if (xpath_union_local_nonprim) {
        config_node_property_boolean_free(xpath_union_local_nonprim);
        xpath_union_local_nonprim = NULL;
    }
    return NULL;

}
