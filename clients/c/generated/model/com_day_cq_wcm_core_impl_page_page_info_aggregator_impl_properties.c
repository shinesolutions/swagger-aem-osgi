#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties.h"



static com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_t *com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_create_internal(
    config_node_property_string_t *page_info_provider_property_regex_default,
    config_node_property_string_t *page_info_provider_property_name
    ) {
    com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_t *com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_t));
    if (!com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_t));
    com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_local_var->page_info_provider_property_regex_default = page_info_provider_property_regex_default;
    com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_local_var->page_info_provider_property_name = page_info_provider_property_name;
    return com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_t *com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_create(
    config_node_property_string_t *page_info_provider_property_regex_default,
    config_node_property_string_t *page_info_provider_property_name
    ) {
    com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_t *result = com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_create_internal (
        page_info_provider_property_regex_default,
        page_info_provider_property_name
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_free(com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_t *com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties) {
    if(NULL == com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_regex_default) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_regex_default);
        com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_regex_default = NULL;
    }
    if (com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_name) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_name);
        com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_name = NULL;
    }
    free(com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties);
}

cJSON *com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_convertToJSON(com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_t *com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_regex_default
    if(com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_regex_default) {
    cJSON *page_info_provider_property_regex_default_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_regex_default);
    if(page_info_provider_property_regex_default_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "page.info.provider.property.regex.default", page_info_provider_property_regex_default_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_name
    if(com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_name) {
    cJSON *page_info_provider_property_name_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_name);
    if(page_info_provider_property_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "page.info.provider.property.name", page_info_provider_property_name_local_JSON);
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

com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_t *com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_propertiesJSON){

    com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_t *com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_regex_default
    config_node_property_string_t *page_info_provider_property_regex_default_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_name
    config_node_property_string_t *page_info_provider_property_name_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_regex_default
    cJSON *page_info_provider_property_regex_default = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_propertiesJSON, "page.info.provider.property.regex.default");
    if (cJSON_IsNull(page_info_provider_property_regex_default)) {
        page_info_provider_property_regex_default = NULL;
    }
    if (page_info_provider_property_regex_default) { 
    page_info_provider_property_regex_default_local_nonprim = config_node_property_string_parseFromJSON(page_info_provider_property_regex_default); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties->page_info_provider_property_name
    cJSON *page_info_provider_property_name = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_propertiesJSON, "page.info.provider.property.name");
    if (cJSON_IsNull(page_info_provider_property_name)) {
        page_info_provider_property_name = NULL;
    }
    if (page_info_provider_property_name) { 
    page_info_provider_property_name_local_nonprim = config_node_property_string_parseFromJSON(page_info_provider_property_name); //nonprimitive
    }



    com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_local_var = com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_create_internal (
        page_info_provider_property_regex_default ? page_info_provider_property_regex_default_local_nonprim : NULL,
        page_info_provider_property_name ? page_info_provider_property_name_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties_local_var;
end:
    if (page_info_provider_property_regex_default_local_nonprim) {
        config_node_property_string_free(page_info_provider_property_regex_default_local_nonprim);
        page_info_provider_property_regex_default_local_nonprim = NULL;
    }
    if (page_info_provider_property_name_local_nonprim) {
        config_node_property_string_free(page_info_provider_property_name_local_nonprim);
        page_info_provider_property_name_local_nonprim = NULL;
    }
    return NULL;

}
