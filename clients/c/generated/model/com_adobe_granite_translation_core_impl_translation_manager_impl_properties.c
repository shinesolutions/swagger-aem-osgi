#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_translation_core_impl_translation_manager_impl_properties.h"



static com_adobe_granite_translation_core_impl_translation_manager_impl_properties_t *com_adobe_granite_translation_core_impl_translation_manager_impl_properties_create_internal(
    config_node_property_string_t *default_connector_name,
    config_node_property_string_t *default_category
    ) {
    com_adobe_granite_translation_core_impl_translation_manager_impl_properties_t *com_adobe_granite_translation_core_impl_translation_manager_impl_properties_local_var = malloc(sizeof(com_adobe_granite_translation_core_impl_translation_manager_impl_properties_t));
    if (!com_adobe_granite_translation_core_impl_translation_manager_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_translation_core_impl_translation_manager_impl_properties_local_var, 0, sizeof(com_adobe_granite_translation_core_impl_translation_manager_impl_properties_t));
    com_adobe_granite_translation_core_impl_translation_manager_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_translation_core_impl_translation_manager_impl_properties_local_var->default_connector_name = default_connector_name;
    com_adobe_granite_translation_core_impl_translation_manager_impl_properties_local_var->default_category = default_category;
    return com_adobe_granite_translation_core_impl_translation_manager_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_translation_core_impl_translation_manager_impl_properties_t *com_adobe_granite_translation_core_impl_translation_manager_impl_properties_create(
    config_node_property_string_t *default_connector_name,
    config_node_property_string_t *default_category
    ) {
    com_adobe_granite_translation_core_impl_translation_manager_impl_properties_t *result = com_adobe_granite_translation_core_impl_translation_manager_impl_properties_create_internal (
        default_connector_name,
        default_category
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_translation_core_impl_translation_manager_impl_properties_free(com_adobe_granite_translation_core_impl_translation_manager_impl_properties_t *com_adobe_granite_translation_core_impl_translation_manager_impl_properties) {
    if(NULL == com_adobe_granite_translation_core_impl_translation_manager_impl_properties){
        return ;
    }
    if(com_adobe_granite_translation_core_impl_translation_manager_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_translation_core_impl_translation_manager_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_connector_name) {
        config_node_property_string_free(com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_connector_name);
        com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_connector_name = NULL;
    }
    if (com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_category) {
        config_node_property_string_free(com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_category);
        com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_category = NULL;
    }
    free(com_adobe_granite_translation_core_impl_translation_manager_impl_properties);
}

cJSON *com_adobe_granite_translation_core_impl_translation_manager_impl_properties_convertToJSON(com_adobe_granite_translation_core_impl_translation_manager_impl_properties_t *com_adobe_granite_translation_core_impl_translation_manager_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_connector_name
    if(com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_connector_name) {
    cJSON *default_connector_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_connector_name);
    if(default_connector_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultConnectorName", default_connector_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_category
    if(com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_category) {
    cJSON *default_category_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_category);
    if(default_category_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultCategory", default_category_local_JSON);
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

com_adobe_granite_translation_core_impl_translation_manager_impl_properties_t *com_adobe_granite_translation_core_impl_translation_manager_impl_properties_parseFromJSON(cJSON *com_adobe_granite_translation_core_impl_translation_manager_impl_propertiesJSON){

    com_adobe_granite_translation_core_impl_translation_manager_impl_properties_t *com_adobe_granite_translation_core_impl_translation_manager_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_connector_name
    config_node_property_string_t *default_connector_name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_category
    config_node_property_string_t *default_category_local_nonprim = NULL;

    // com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_connector_name
    cJSON *default_connector_name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_translation_core_impl_translation_manager_impl_propertiesJSON, "defaultConnectorName");
    if (cJSON_IsNull(default_connector_name)) {
        default_connector_name = NULL;
    }
    if (default_connector_name) { 
    default_connector_name_local_nonprim = config_node_property_string_parseFromJSON(default_connector_name); //nonprimitive
    }

    // com_adobe_granite_translation_core_impl_translation_manager_impl_properties->default_category
    cJSON *default_category = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_translation_core_impl_translation_manager_impl_propertiesJSON, "defaultCategory");
    if (cJSON_IsNull(default_category)) {
        default_category = NULL;
    }
    if (default_category) { 
    default_category_local_nonprim = config_node_property_string_parseFromJSON(default_category); //nonprimitive
    }



    com_adobe_granite_translation_core_impl_translation_manager_impl_properties_local_var = com_adobe_granite_translation_core_impl_translation_manager_impl_properties_create_internal (
        default_connector_name ? default_connector_name_local_nonprim : NULL,
        default_category ? default_category_local_nonprim : NULL
        );

    if (!com_adobe_granite_translation_core_impl_translation_manager_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_translation_core_impl_translation_manager_impl_properties_local_var;
end:
    if (default_connector_name_local_nonprim) {
        config_node_property_string_free(default_connector_name_local_nonprim);
        default_connector_name_local_nonprim = NULL;
    }
    if (default_category_local_nonprim) {
        config_node_property_string_free(default_category_local_nonprim);
        default_category_local_nonprim = NULL;
    }
    return NULL;

}
