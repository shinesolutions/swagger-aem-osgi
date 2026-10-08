#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties.h"



static com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t *com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_create_internal(
    config_node_property_string_t *link_expired_prefix,
    config_node_property_boolean_t *link_expired_remove,
    config_node_property_string_t *link_expired_suffix,
    config_node_property_string_t *link_invalid_prefix,
    config_node_property_boolean_t *link_invalid_remove,
    config_node_property_string_t *link_invalid_suffix,
    config_node_property_string_t *link_predated_prefix,
    config_node_property_boolean_t *link_predated_remove,
    config_node_property_string_t *link_predated_suffix,
    config_node_property_array_t *link_wcmmodes
    ) {
    com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t *com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t));
    if (!com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t));
    com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var->link_expired_prefix = link_expired_prefix;
    com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var->link_expired_remove = link_expired_remove;
    com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var->link_expired_suffix = link_expired_suffix;
    com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var->link_invalid_prefix = link_invalid_prefix;
    com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var->link_invalid_remove = link_invalid_remove;
    com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var->link_invalid_suffix = link_invalid_suffix;
    com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var->link_predated_prefix = link_predated_prefix;
    com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var->link_predated_remove = link_predated_remove;
    com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var->link_predated_suffix = link_predated_suffix;
    com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var->link_wcmmodes = link_wcmmodes;
    return com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t *com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_create(
    config_node_property_string_t *link_expired_prefix,
    config_node_property_boolean_t *link_expired_remove,
    config_node_property_string_t *link_expired_suffix,
    config_node_property_string_t *link_invalid_prefix,
    config_node_property_boolean_t *link_invalid_remove,
    config_node_property_string_t *link_invalid_suffix,
    config_node_property_string_t *link_predated_prefix,
    config_node_property_boolean_t *link_predated_remove,
    config_node_property_string_t *link_predated_suffix,
    config_node_property_array_t *link_wcmmodes
    ) {
    com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t *result = com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_create_internal (
        link_expired_prefix,
        link_expired_remove,
        link_expired_suffix,
        link_invalid_prefix,
        link_invalid_remove,
        link_invalid_suffix,
        link_predated_prefix,
        link_predated_remove,
        link_predated_suffix,
        link_wcmmodes
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_free(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t *com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties) {
    if(NULL == com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_prefix) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_prefix);
        com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_prefix = NULL;
    }
    if (com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_remove) {
        config_node_property_boolean_free(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_remove);
        com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_remove = NULL;
    }
    if (com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_suffix) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_suffix);
        com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_suffix = NULL;
    }
    if (com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_prefix) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_prefix);
        com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_prefix = NULL;
    }
    if (com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_remove) {
        config_node_property_boolean_free(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_remove);
        com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_remove = NULL;
    }
    if (com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_suffix) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_suffix);
        com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_suffix = NULL;
    }
    if (com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_prefix) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_prefix);
        com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_prefix = NULL;
    }
    if (com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_remove) {
        config_node_property_boolean_free(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_remove);
        com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_remove = NULL;
    }
    if (com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_suffix) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_suffix);
        com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_suffix = NULL;
    }
    if (com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_wcmmodes) {
        config_node_property_array_free(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_wcmmodes);
        com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_wcmmodes = NULL;
    }
    free(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties);
}

cJSON *com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_convertToJSON(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t *com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_prefix
    if(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_prefix) {
    cJSON *link_expired_prefix_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_prefix);
    if(link_expired_prefix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "link.expired.prefix", link_expired_prefix_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_remove
    if(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_remove) {
    cJSON *link_expired_remove_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_remove);
    if(link_expired_remove_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "link.expired.remove", link_expired_remove_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_suffix
    if(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_suffix) {
    cJSON *link_expired_suffix_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_suffix);
    if(link_expired_suffix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "link.expired.suffix", link_expired_suffix_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_prefix
    if(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_prefix) {
    cJSON *link_invalid_prefix_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_prefix);
    if(link_invalid_prefix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "link.invalid.prefix", link_invalid_prefix_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_remove
    if(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_remove) {
    cJSON *link_invalid_remove_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_remove);
    if(link_invalid_remove_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "link.invalid.remove", link_invalid_remove_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_suffix
    if(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_suffix) {
    cJSON *link_invalid_suffix_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_suffix);
    if(link_invalid_suffix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "link.invalid.suffix", link_invalid_suffix_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_prefix
    if(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_prefix) {
    cJSON *link_predated_prefix_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_prefix);
    if(link_predated_prefix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "link.predated.prefix", link_predated_prefix_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_remove
    if(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_remove) {
    cJSON *link_predated_remove_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_remove);
    if(link_predated_remove_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "link.predated.remove", link_predated_remove_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_suffix
    if(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_suffix) {
    cJSON *link_predated_suffix_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_suffix);
    if(link_predated_suffix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "link.predated.suffix", link_predated_suffix_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_wcmmodes
    if(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_wcmmodes) {
    cJSON *link_wcmmodes_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_wcmmodes);
    if(link_wcmmodes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "link.wcmmodes", link_wcmmodes_local_JSON);
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

com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t *com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_propertiesJSON){

    com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t *com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_prefix
    config_node_property_string_t *link_expired_prefix_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_remove
    config_node_property_boolean_t *link_expired_remove_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_suffix
    config_node_property_string_t *link_expired_suffix_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_prefix
    config_node_property_string_t *link_invalid_prefix_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_remove
    config_node_property_boolean_t *link_invalid_remove_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_suffix
    config_node_property_string_t *link_invalid_suffix_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_prefix
    config_node_property_string_t *link_predated_prefix_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_remove
    config_node_property_boolean_t *link_predated_remove_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_suffix
    config_node_property_string_t *link_predated_suffix_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_wcmmodes
    config_node_property_array_t *link_wcmmodes_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_prefix
    cJSON *link_expired_prefix = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_propertiesJSON, "link.expired.prefix");
    if (cJSON_IsNull(link_expired_prefix)) {
        link_expired_prefix = NULL;
    }
    if (link_expired_prefix) { 
    link_expired_prefix_local_nonprim = config_node_property_string_parseFromJSON(link_expired_prefix); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_remove
    cJSON *link_expired_remove = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_propertiesJSON, "link.expired.remove");
    if (cJSON_IsNull(link_expired_remove)) {
        link_expired_remove = NULL;
    }
    if (link_expired_remove) { 
    link_expired_remove_local_nonprim = config_node_property_boolean_parseFromJSON(link_expired_remove); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_expired_suffix
    cJSON *link_expired_suffix = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_propertiesJSON, "link.expired.suffix");
    if (cJSON_IsNull(link_expired_suffix)) {
        link_expired_suffix = NULL;
    }
    if (link_expired_suffix) { 
    link_expired_suffix_local_nonprim = config_node_property_string_parseFromJSON(link_expired_suffix); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_prefix
    cJSON *link_invalid_prefix = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_propertiesJSON, "link.invalid.prefix");
    if (cJSON_IsNull(link_invalid_prefix)) {
        link_invalid_prefix = NULL;
    }
    if (link_invalid_prefix) { 
    link_invalid_prefix_local_nonprim = config_node_property_string_parseFromJSON(link_invalid_prefix); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_remove
    cJSON *link_invalid_remove = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_propertiesJSON, "link.invalid.remove");
    if (cJSON_IsNull(link_invalid_remove)) {
        link_invalid_remove = NULL;
    }
    if (link_invalid_remove) { 
    link_invalid_remove_local_nonprim = config_node_property_boolean_parseFromJSON(link_invalid_remove); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_invalid_suffix
    cJSON *link_invalid_suffix = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_propertiesJSON, "link.invalid.suffix");
    if (cJSON_IsNull(link_invalid_suffix)) {
        link_invalid_suffix = NULL;
    }
    if (link_invalid_suffix) { 
    link_invalid_suffix_local_nonprim = config_node_property_string_parseFromJSON(link_invalid_suffix); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_prefix
    cJSON *link_predated_prefix = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_propertiesJSON, "link.predated.prefix");
    if (cJSON_IsNull(link_predated_prefix)) {
        link_predated_prefix = NULL;
    }
    if (link_predated_prefix) { 
    link_predated_prefix_local_nonprim = config_node_property_string_parseFromJSON(link_predated_prefix); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_remove
    cJSON *link_predated_remove = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_propertiesJSON, "link.predated.remove");
    if (cJSON_IsNull(link_predated_remove)) {
        link_predated_remove = NULL;
    }
    if (link_predated_remove) { 
    link_predated_remove_local_nonprim = config_node_property_boolean_parseFromJSON(link_predated_remove); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_predated_suffix
    cJSON *link_predated_suffix = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_propertiesJSON, "link.predated.suffix");
    if (cJSON_IsNull(link_predated_suffix)) {
        link_predated_suffix = NULL;
    }
    if (link_predated_suffix) { 
    link_predated_suffix_local_nonprim = config_node_property_string_parseFromJSON(link_predated_suffix); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties->link_wcmmodes
    cJSON *link_wcmmodes = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_propertiesJSON, "link.wcmmodes");
    if (cJSON_IsNull(link_wcmmodes)) {
        link_wcmmodes = NULL;
    }
    if (link_wcmmodes) { 
    link_wcmmodes_local_nonprim = config_node_property_array_parseFromJSON(link_wcmmodes); //nonprimitive
    }



    com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var = com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_create_internal (
        link_expired_prefix ? link_expired_prefix_local_nonprim : NULL,
        link_expired_remove ? link_expired_remove_local_nonprim : NULL,
        link_expired_suffix ? link_expired_suffix_local_nonprim : NULL,
        link_invalid_prefix ? link_invalid_prefix_local_nonprim : NULL,
        link_invalid_remove ? link_invalid_remove_local_nonprim : NULL,
        link_invalid_suffix ? link_invalid_suffix_local_nonprim : NULL,
        link_predated_prefix ? link_predated_prefix_local_nonprim : NULL,
        link_predated_remove ? link_predated_remove_local_nonprim : NULL,
        link_predated_suffix ? link_predated_suffix_local_nonprim : NULL,
        link_wcmmodes ? link_wcmmodes_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_local_var;
end:
    if (link_expired_prefix_local_nonprim) {
        config_node_property_string_free(link_expired_prefix_local_nonprim);
        link_expired_prefix_local_nonprim = NULL;
    }
    if (link_expired_remove_local_nonprim) {
        config_node_property_boolean_free(link_expired_remove_local_nonprim);
        link_expired_remove_local_nonprim = NULL;
    }
    if (link_expired_suffix_local_nonprim) {
        config_node_property_string_free(link_expired_suffix_local_nonprim);
        link_expired_suffix_local_nonprim = NULL;
    }
    if (link_invalid_prefix_local_nonprim) {
        config_node_property_string_free(link_invalid_prefix_local_nonprim);
        link_invalid_prefix_local_nonprim = NULL;
    }
    if (link_invalid_remove_local_nonprim) {
        config_node_property_boolean_free(link_invalid_remove_local_nonprim);
        link_invalid_remove_local_nonprim = NULL;
    }
    if (link_invalid_suffix_local_nonprim) {
        config_node_property_string_free(link_invalid_suffix_local_nonprim);
        link_invalid_suffix_local_nonprim = NULL;
    }
    if (link_predated_prefix_local_nonprim) {
        config_node_property_string_free(link_predated_prefix_local_nonprim);
        link_predated_prefix_local_nonprim = NULL;
    }
    if (link_predated_remove_local_nonprim) {
        config_node_property_boolean_free(link_predated_remove_local_nonprim);
        link_predated_remove_local_nonprim = NULL;
    }
    if (link_predated_suffix_local_nonprim) {
        config_node_property_string_free(link_predated_suffix_local_nonprim);
        link_predated_suffix_local_nonprim = NULL;
    }
    if (link_wcmmodes_local_nonprim) {
        config_node_property_array_free(link_wcmmodes_local_nonprim);
        link_wcmmodes_local_nonprim = NULL;
    }
    return NULL;

}
