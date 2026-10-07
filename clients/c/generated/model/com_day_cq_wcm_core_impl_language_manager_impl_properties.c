#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_language_manager_impl_properties.h"



static com_day_cq_wcm_core_impl_language_manager_impl_properties_t *com_day_cq_wcm_core_impl_language_manager_impl_properties_create_internal(
    config_node_property_string_t *langmgr_list_path,
    config_node_property_array_t *langmgr_country_default
    ) {
    com_day_cq_wcm_core_impl_language_manager_impl_properties_t *com_day_cq_wcm_core_impl_language_manager_impl_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_language_manager_impl_properties_t));
    if (!com_day_cq_wcm_core_impl_language_manager_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_language_manager_impl_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_language_manager_impl_properties_t));
    com_day_cq_wcm_core_impl_language_manager_impl_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_language_manager_impl_properties_local_var->langmgr_list_path = langmgr_list_path;
    com_day_cq_wcm_core_impl_language_manager_impl_properties_local_var->langmgr_country_default = langmgr_country_default;
    return com_day_cq_wcm_core_impl_language_manager_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_language_manager_impl_properties_t *com_day_cq_wcm_core_impl_language_manager_impl_properties_create(
    config_node_property_string_t *langmgr_list_path,
    config_node_property_array_t *langmgr_country_default
    ) {
    com_day_cq_wcm_core_impl_language_manager_impl_properties_t *result = com_day_cq_wcm_core_impl_language_manager_impl_properties_create_internal (
        langmgr_list_path,
        langmgr_country_default
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_language_manager_impl_properties_free(com_day_cq_wcm_core_impl_language_manager_impl_properties_t *com_day_cq_wcm_core_impl_language_manager_impl_properties) {
    if(NULL == com_day_cq_wcm_core_impl_language_manager_impl_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_language_manager_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_language_manager_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_list_path) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_list_path);
        com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_list_path = NULL;
    }
    if (com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_country_default) {
        config_node_property_array_free(com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_country_default);
        com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_country_default = NULL;
    }
    free(com_day_cq_wcm_core_impl_language_manager_impl_properties);
}

cJSON *com_day_cq_wcm_core_impl_language_manager_impl_properties_convertToJSON(com_day_cq_wcm_core_impl_language_manager_impl_properties_t *com_day_cq_wcm_core_impl_language_manager_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_list_path
    if(com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_list_path) {
    cJSON *langmgr_list_path_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_list_path);
    if(langmgr_list_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "langmgr.list.path", langmgr_list_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_country_default
    if(com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_country_default) {
    cJSON *langmgr_country_default_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_country_default);
    if(langmgr_country_default_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "langmgr.country.default", langmgr_country_default_local_JSON);
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

com_day_cq_wcm_core_impl_language_manager_impl_properties_t *com_day_cq_wcm_core_impl_language_manager_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_language_manager_impl_propertiesJSON){

    com_day_cq_wcm_core_impl_language_manager_impl_properties_t *com_day_cq_wcm_core_impl_language_manager_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_list_path
    config_node_property_string_t *langmgr_list_path_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_country_default
    config_node_property_array_t *langmgr_country_default_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_list_path
    cJSON *langmgr_list_path = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_language_manager_impl_propertiesJSON, "langmgr.list.path");
    if (cJSON_IsNull(langmgr_list_path)) {
        langmgr_list_path = NULL;
    }
    if (langmgr_list_path) { 
    langmgr_list_path_local_nonprim = config_node_property_string_parseFromJSON(langmgr_list_path); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_language_manager_impl_properties->langmgr_country_default
    cJSON *langmgr_country_default = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_language_manager_impl_propertiesJSON, "langmgr.country.default");
    if (cJSON_IsNull(langmgr_country_default)) {
        langmgr_country_default = NULL;
    }
    if (langmgr_country_default) { 
    langmgr_country_default_local_nonprim = config_node_property_array_parseFromJSON(langmgr_country_default); //nonprimitive
    }



    com_day_cq_wcm_core_impl_language_manager_impl_properties_local_var = com_day_cq_wcm_core_impl_language_manager_impl_properties_create_internal (
        langmgr_list_path ? langmgr_list_path_local_nonprim : NULL,
        langmgr_country_default ? langmgr_country_default_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_language_manager_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_language_manager_impl_properties_local_var;
end:
    if (langmgr_list_path_local_nonprim) {
        config_node_property_string_free(langmgr_list_path_local_nonprim);
        langmgr_list_path_local_nonprim = NULL;
    }
    if (langmgr_country_default_local_nonprim) {
        config_node_property_array_free(langmgr_country_default_local_nonprim);
        langmgr_country_default_local_nonprim = NULL;
    }
    return NULL;

}
