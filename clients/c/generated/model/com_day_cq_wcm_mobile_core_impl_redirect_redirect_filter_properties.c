#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties.h"



static com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_t *com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_create_internal(
    config_node_property_boolean_t *redirect_enabled,
    config_node_property_boolean_t *redirect_stats_enabled,
    config_node_property_array_t *redirect_extensions,
    config_node_property_array_t *redirect_paths
    ) {
    com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_t *com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_local_var = malloc(sizeof(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_t));
    if (!com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_local_var, 0, sizeof(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_t));
    com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_local_var->redirect_enabled = redirect_enabled;
    com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_local_var->redirect_stats_enabled = redirect_stats_enabled;
    com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_local_var->redirect_extensions = redirect_extensions;
    com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_local_var->redirect_paths = redirect_paths;
    return com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_t *com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_create(
    config_node_property_boolean_t *redirect_enabled,
    config_node_property_boolean_t *redirect_stats_enabled,
    config_node_property_array_t *redirect_extensions,
    config_node_property_array_t *redirect_paths
    ) {
    com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_t *result = com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_create_internal (
        redirect_enabled,
        redirect_stats_enabled,
        redirect_extensions,
        redirect_paths
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_free(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_t *com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties) {
    if(NULL == com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties){
        return ;
    }
    if(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_enabled) {
        config_node_property_boolean_free(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_enabled);
        com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_enabled = NULL;
    }
    if (com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_stats_enabled) {
        config_node_property_boolean_free(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_stats_enabled);
        com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_stats_enabled = NULL;
    }
    if (com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_extensions) {
        config_node_property_array_free(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_extensions);
        com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_extensions = NULL;
    }
    if (com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_paths) {
        config_node_property_array_free(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_paths);
        com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_paths = NULL;
    }
    free(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties);
}

cJSON *com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_convertToJSON(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_t *com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_enabled
    if(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_enabled) {
    cJSON *redirect_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_enabled);
    if(redirect_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "redirect.enabled", redirect_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_stats_enabled
    if(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_stats_enabled) {
    cJSON *redirect_stats_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_stats_enabled);
    if(redirect_stats_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "redirect.stats.enabled", redirect_stats_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_extensions
    if(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_extensions) {
    cJSON *redirect_extensions_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_extensions);
    if(redirect_extensions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "redirect.extensions", redirect_extensions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_paths
    if(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_paths) {
    cJSON *redirect_paths_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_paths);
    if(redirect_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "redirect.paths", redirect_paths_local_JSON);
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

com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_t *com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_parseFromJSON(cJSON *com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_propertiesJSON){

    com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_t *com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_enabled
    config_node_property_boolean_t *redirect_enabled_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_stats_enabled
    config_node_property_boolean_t *redirect_stats_enabled_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_extensions
    config_node_property_array_t *redirect_extensions_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_paths
    config_node_property_array_t *redirect_paths_local_nonprim = NULL;

    // com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_enabled
    cJSON *redirect_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_propertiesJSON, "redirect.enabled");
    if (cJSON_IsNull(redirect_enabled)) {
        redirect_enabled = NULL;
    }
    if (redirect_enabled) { 
    redirect_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(redirect_enabled); //nonprimitive
    }

    // com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_stats_enabled
    cJSON *redirect_stats_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_propertiesJSON, "redirect.stats.enabled");
    if (cJSON_IsNull(redirect_stats_enabled)) {
        redirect_stats_enabled = NULL;
    }
    if (redirect_stats_enabled) { 
    redirect_stats_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(redirect_stats_enabled); //nonprimitive
    }

    // com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_extensions
    cJSON *redirect_extensions = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_propertiesJSON, "redirect.extensions");
    if (cJSON_IsNull(redirect_extensions)) {
        redirect_extensions = NULL;
    }
    if (redirect_extensions) { 
    redirect_extensions_local_nonprim = config_node_property_array_parseFromJSON(redirect_extensions); //nonprimitive
    }

    // com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties->redirect_paths
    cJSON *redirect_paths = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_propertiesJSON, "redirect.paths");
    if (cJSON_IsNull(redirect_paths)) {
        redirect_paths = NULL;
    }
    if (redirect_paths) { 
    redirect_paths_local_nonprim = config_node_property_array_parseFromJSON(redirect_paths); //nonprimitive
    }



    com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_local_var = com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_create_internal (
        redirect_enabled ? redirect_enabled_local_nonprim : NULL,
        redirect_stats_enabled ? redirect_stats_enabled_local_nonprim : NULL,
        redirect_extensions ? redirect_extensions_local_nonprim : NULL,
        redirect_paths ? redirect_paths_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties_local_var;
end:
    if (redirect_enabled_local_nonprim) {
        config_node_property_boolean_free(redirect_enabled_local_nonprim);
        redirect_enabled_local_nonprim = NULL;
    }
    if (redirect_stats_enabled_local_nonprim) {
        config_node_property_boolean_free(redirect_stats_enabled_local_nonprim);
        redirect_stats_enabled_local_nonprim = NULL;
    }
    if (redirect_extensions_local_nonprim) {
        config_node_property_array_free(redirect_extensions_local_nonprim);
        redirect_extensions_local_nonprim = NULL;
    }
    if (redirect_paths_local_nonprim) {
        config_node_property_array_free(redirect_paths_local_nonprim);
        redirect_paths_local_nonprim = NULL;
    }
    return NULL;

}
