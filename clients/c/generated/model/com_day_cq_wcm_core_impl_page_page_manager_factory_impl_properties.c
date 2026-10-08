#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties.h"



static com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_t *com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_create_internal(
    config_node_property_string_t *illegal_char_mapping,
    config_node_property_boolean_t *page_sub_tree_activation_check
    ) {
    com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_t *com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_t));
    if (!com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_t));
    com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_local_var->illegal_char_mapping = illegal_char_mapping;
    com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_local_var->page_sub_tree_activation_check = page_sub_tree_activation_check;
    return com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_t *com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_create(
    config_node_property_string_t *illegal_char_mapping,
    config_node_property_boolean_t *page_sub_tree_activation_check
    ) {
    com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_t *result = com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_create_internal (
        illegal_char_mapping,
        page_sub_tree_activation_check
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_free(com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_t *com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties) {
    if(NULL == com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->illegal_char_mapping) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->illegal_char_mapping);
        com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->illegal_char_mapping = NULL;
    }
    if (com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->page_sub_tree_activation_check) {
        config_node_property_boolean_free(com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->page_sub_tree_activation_check);
        com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->page_sub_tree_activation_check = NULL;
    }
    free(com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties);
}

cJSON *com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_convertToJSON(com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_t *com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->illegal_char_mapping
    if(com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->illegal_char_mapping) {
    cJSON *illegal_char_mapping_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->illegal_char_mapping);
    if(illegal_char_mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "illegalCharMapping", illegal_char_mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->page_sub_tree_activation_check
    if(com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->page_sub_tree_activation_check) {
    cJSON *page_sub_tree_activation_check_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->page_sub_tree_activation_check);
    if(page_sub_tree_activation_check_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pageSubTreeActivationCheck", page_sub_tree_activation_check_local_JSON);
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

com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_t *com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_page_page_manager_factory_impl_propertiesJSON){

    com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_t *com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->illegal_char_mapping
    config_node_property_string_t *illegal_char_mapping_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->page_sub_tree_activation_check
    config_node_property_boolean_t *page_sub_tree_activation_check_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->illegal_char_mapping
    cJSON *illegal_char_mapping = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_page_page_manager_factory_impl_propertiesJSON, "illegalCharMapping");
    if (cJSON_IsNull(illegal_char_mapping)) {
        illegal_char_mapping = NULL;
    }
    if (illegal_char_mapping) { 
    illegal_char_mapping_local_nonprim = config_node_property_string_parseFromJSON(illegal_char_mapping); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties->page_sub_tree_activation_check
    cJSON *page_sub_tree_activation_check = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_page_page_manager_factory_impl_propertiesJSON, "pageSubTreeActivationCheck");
    if (cJSON_IsNull(page_sub_tree_activation_check)) {
        page_sub_tree_activation_check = NULL;
    }
    if (page_sub_tree_activation_check) { 
    page_sub_tree_activation_check_local_nonprim = config_node_property_boolean_parseFromJSON(page_sub_tree_activation_check); //nonprimitive
    }



    com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_local_var = com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_create_internal (
        illegal_char_mapping ? illegal_char_mapping_local_nonprim : NULL,
        page_sub_tree_activation_check ? page_sub_tree_activation_check_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_local_var;
end:
    if (illegal_char_mapping_local_nonprim) {
        config_node_property_string_free(illegal_char_mapping_local_nonprim);
        illegal_char_mapping_local_nonprim = NULL;
    }
    if (page_sub_tree_activation_check_local_nonprim) {
        config_node_property_boolean_free(page_sub_tree_activation_check_local_nonprim);
        page_sub_tree_activation_check_local_nonprim = NULL;
    }
    return NULL;

}
