#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties.h"



static org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t *org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_create_internal(
    config_node_property_array_t *handler_schemes,
    config_node_property_string_t *sling_jcrinstall_folder_name_regexp,
    config_node_property_integer_t *sling_jcrinstall_folder_max_depth,
    config_node_property_array_t *sling_jcrinstall_search_path,
    config_node_property_string_t *sling_jcrinstall_new_config_path,
    config_node_property_string_t *sling_jcrinstall_signal_path,
    config_node_property_boolean_t *sling_jcrinstall_enable_writeback
    ) {
    org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t *org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var = malloc(sizeof(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t));
    if (!org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var, 0, sizeof(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t));
    org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var->_library_owned = 1;
    org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var->handler_schemes = handler_schemes;
    org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var->sling_jcrinstall_folder_name_regexp = sling_jcrinstall_folder_name_regexp;
    org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var->sling_jcrinstall_folder_max_depth = sling_jcrinstall_folder_max_depth;
    org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var->sling_jcrinstall_search_path = sling_jcrinstall_search_path;
    org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var->sling_jcrinstall_new_config_path = sling_jcrinstall_new_config_path;
    org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var->sling_jcrinstall_signal_path = sling_jcrinstall_signal_path;
    org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var->sling_jcrinstall_enable_writeback = sling_jcrinstall_enable_writeback;
    return org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t *org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_create(
    config_node_property_array_t *handler_schemes,
    config_node_property_string_t *sling_jcrinstall_folder_name_regexp,
    config_node_property_integer_t *sling_jcrinstall_folder_max_depth,
    config_node_property_array_t *sling_jcrinstall_search_path,
    config_node_property_string_t *sling_jcrinstall_new_config_path,
    config_node_property_string_t *sling_jcrinstall_signal_path,
    config_node_property_boolean_t *sling_jcrinstall_enable_writeback
    ) {
    org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t *result = org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_create_internal (
        handler_schemes,
        sling_jcrinstall_folder_name_regexp,
        sling_jcrinstall_folder_max_depth,
        sling_jcrinstall_search_path,
        sling_jcrinstall_new_config_path,
        sling_jcrinstall_signal_path,
        sling_jcrinstall_enable_writeback
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_free(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t *org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties) {
    if(NULL == org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties){
        return ;
    }
    if(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->handler_schemes) {
        config_node_property_array_free(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->handler_schemes);
        org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->handler_schemes = NULL;
    }
    if (org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_name_regexp) {
        config_node_property_string_free(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_name_regexp);
        org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_name_regexp = NULL;
    }
    if (org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_max_depth) {
        config_node_property_integer_free(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_max_depth);
        org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_max_depth = NULL;
    }
    if (org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_search_path) {
        config_node_property_array_free(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_search_path);
        org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_search_path = NULL;
    }
    if (org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_new_config_path) {
        config_node_property_string_free(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_new_config_path);
        org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_new_config_path = NULL;
    }
    if (org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_signal_path) {
        config_node_property_string_free(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_signal_path);
        org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_signal_path = NULL;
    }
    if (org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_enable_writeback) {
        config_node_property_boolean_free(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_enable_writeback);
        org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_enable_writeback = NULL;
    }
    free(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties);
}

cJSON *org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_convertToJSON(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t *org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->handler_schemes
    if(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->handler_schemes) {
    cJSON *handler_schemes_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->handler_schemes);
    if(handler_schemes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "handler.schemes", handler_schemes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_name_regexp
    if(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_name_regexp) {
    cJSON *sling_jcrinstall_folder_name_regexp_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_name_regexp);
    if(sling_jcrinstall_folder_name_regexp_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.jcrinstall.folder.name.regexp", sling_jcrinstall_folder_name_regexp_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_max_depth
    if(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_max_depth) {
    cJSON *sling_jcrinstall_folder_max_depth_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_max_depth);
    if(sling_jcrinstall_folder_max_depth_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.jcrinstall.folder.max.depth", sling_jcrinstall_folder_max_depth_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_search_path
    if(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_search_path) {
    cJSON *sling_jcrinstall_search_path_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_search_path);
    if(sling_jcrinstall_search_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.jcrinstall.search.path", sling_jcrinstall_search_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_new_config_path
    if(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_new_config_path) {
    cJSON *sling_jcrinstall_new_config_path_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_new_config_path);
    if(sling_jcrinstall_new_config_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.jcrinstall.new.config.path", sling_jcrinstall_new_config_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_signal_path
    if(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_signal_path) {
    cJSON *sling_jcrinstall_signal_path_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_signal_path);
    if(sling_jcrinstall_signal_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.jcrinstall.signal.path", sling_jcrinstall_signal_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_enable_writeback
    if(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_enable_writeback) {
    cJSON *sling_jcrinstall_enable_writeback_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_enable_writeback);
    if(sling_jcrinstall_enable_writeback_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.jcrinstall.enable.writeback", sling_jcrinstall_enable_writeback_local_JSON);
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

org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t *org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_parseFromJSON(cJSON *org_apache_sling_installer_provider_jcr_impl_jcr_installer_propertiesJSON){

    org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t *org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var = NULL;

    // define the local variable for org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->handler_schemes
    config_node_property_array_t *handler_schemes_local_nonprim = NULL;

    // define the local variable for org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_name_regexp
    config_node_property_string_t *sling_jcrinstall_folder_name_regexp_local_nonprim = NULL;

    // define the local variable for org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_max_depth
    config_node_property_integer_t *sling_jcrinstall_folder_max_depth_local_nonprim = NULL;

    // define the local variable for org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_search_path
    config_node_property_array_t *sling_jcrinstall_search_path_local_nonprim = NULL;

    // define the local variable for org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_new_config_path
    config_node_property_string_t *sling_jcrinstall_new_config_path_local_nonprim = NULL;

    // define the local variable for org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_signal_path
    config_node_property_string_t *sling_jcrinstall_signal_path_local_nonprim = NULL;

    // define the local variable for org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_enable_writeback
    config_node_property_boolean_t *sling_jcrinstall_enable_writeback_local_nonprim = NULL;

    // org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->handler_schemes
    cJSON *handler_schemes = cJSON_GetObjectItemCaseSensitive(org_apache_sling_installer_provider_jcr_impl_jcr_installer_propertiesJSON, "handler.schemes");
    if (cJSON_IsNull(handler_schemes)) {
        handler_schemes = NULL;
    }
    if (handler_schemes) { 
    handler_schemes_local_nonprim = config_node_property_array_parseFromJSON(handler_schemes); //nonprimitive
    }

    // org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_name_regexp
    cJSON *sling_jcrinstall_folder_name_regexp = cJSON_GetObjectItemCaseSensitive(org_apache_sling_installer_provider_jcr_impl_jcr_installer_propertiesJSON, "sling.jcrinstall.folder.name.regexp");
    if (cJSON_IsNull(sling_jcrinstall_folder_name_regexp)) {
        sling_jcrinstall_folder_name_regexp = NULL;
    }
    if (sling_jcrinstall_folder_name_regexp) { 
    sling_jcrinstall_folder_name_regexp_local_nonprim = config_node_property_string_parseFromJSON(sling_jcrinstall_folder_name_regexp); //nonprimitive
    }

    // org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_folder_max_depth
    cJSON *sling_jcrinstall_folder_max_depth = cJSON_GetObjectItemCaseSensitive(org_apache_sling_installer_provider_jcr_impl_jcr_installer_propertiesJSON, "sling.jcrinstall.folder.max.depth");
    if (cJSON_IsNull(sling_jcrinstall_folder_max_depth)) {
        sling_jcrinstall_folder_max_depth = NULL;
    }
    if (sling_jcrinstall_folder_max_depth) { 
    sling_jcrinstall_folder_max_depth_local_nonprim = config_node_property_integer_parseFromJSON(sling_jcrinstall_folder_max_depth); //nonprimitive
    }

    // org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_search_path
    cJSON *sling_jcrinstall_search_path = cJSON_GetObjectItemCaseSensitive(org_apache_sling_installer_provider_jcr_impl_jcr_installer_propertiesJSON, "sling.jcrinstall.search.path");
    if (cJSON_IsNull(sling_jcrinstall_search_path)) {
        sling_jcrinstall_search_path = NULL;
    }
    if (sling_jcrinstall_search_path) { 
    sling_jcrinstall_search_path_local_nonprim = config_node_property_array_parseFromJSON(sling_jcrinstall_search_path); //nonprimitive
    }

    // org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_new_config_path
    cJSON *sling_jcrinstall_new_config_path = cJSON_GetObjectItemCaseSensitive(org_apache_sling_installer_provider_jcr_impl_jcr_installer_propertiesJSON, "sling.jcrinstall.new.config.path");
    if (cJSON_IsNull(sling_jcrinstall_new_config_path)) {
        sling_jcrinstall_new_config_path = NULL;
    }
    if (sling_jcrinstall_new_config_path) { 
    sling_jcrinstall_new_config_path_local_nonprim = config_node_property_string_parseFromJSON(sling_jcrinstall_new_config_path); //nonprimitive
    }

    // org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_signal_path
    cJSON *sling_jcrinstall_signal_path = cJSON_GetObjectItemCaseSensitive(org_apache_sling_installer_provider_jcr_impl_jcr_installer_propertiesJSON, "sling.jcrinstall.signal.path");
    if (cJSON_IsNull(sling_jcrinstall_signal_path)) {
        sling_jcrinstall_signal_path = NULL;
    }
    if (sling_jcrinstall_signal_path) { 
    sling_jcrinstall_signal_path_local_nonprim = config_node_property_string_parseFromJSON(sling_jcrinstall_signal_path); //nonprimitive
    }

    // org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties->sling_jcrinstall_enable_writeback
    cJSON *sling_jcrinstall_enable_writeback = cJSON_GetObjectItemCaseSensitive(org_apache_sling_installer_provider_jcr_impl_jcr_installer_propertiesJSON, "sling.jcrinstall.enable.writeback");
    if (cJSON_IsNull(sling_jcrinstall_enable_writeback)) {
        sling_jcrinstall_enable_writeback = NULL;
    }
    if (sling_jcrinstall_enable_writeback) { 
    sling_jcrinstall_enable_writeback_local_nonprim = config_node_property_boolean_parseFromJSON(sling_jcrinstall_enable_writeback); //nonprimitive
    }



    org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var = org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_create_internal (
        handler_schemes ? handler_schemes_local_nonprim : NULL,
        sling_jcrinstall_folder_name_regexp ? sling_jcrinstall_folder_name_regexp_local_nonprim : NULL,
        sling_jcrinstall_folder_max_depth ? sling_jcrinstall_folder_max_depth_local_nonprim : NULL,
        sling_jcrinstall_search_path ? sling_jcrinstall_search_path_local_nonprim : NULL,
        sling_jcrinstall_new_config_path ? sling_jcrinstall_new_config_path_local_nonprim : NULL,
        sling_jcrinstall_signal_path ? sling_jcrinstall_signal_path_local_nonprim : NULL,
        sling_jcrinstall_enable_writeback ? sling_jcrinstall_enable_writeback_local_nonprim : NULL
        );

    if (!org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var) {
        goto end;
    }

    return org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_local_var;
end:
    if (handler_schemes_local_nonprim) {
        config_node_property_array_free(handler_schemes_local_nonprim);
        handler_schemes_local_nonprim = NULL;
    }
    if (sling_jcrinstall_folder_name_regexp_local_nonprim) {
        config_node_property_string_free(sling_jcrinstall_folder_name_regexp_local_nonprim);
        sling_jcrinstall_folder_name_regexp_local_nonprim = NULL;
    }
    if (sling_jcrinstall_folder_max_depth_local_nonprim) {
        config_node_property_integer_free(sling_jcrinstall_folder_max_depth_local_nonprim);
        sling_jcrinstall_folder_max_depth_local_nonprim = NULL;
    }
    if (sling_jcrinstall_search_path_local_nonprim) {
        config_node_property_array_free(sling_jcrinstall_search_path_local_nonprim);
        sling_jcrinstall_search_path_local_nonprim = NULL;
    }
    if (sling_jcrinstall_new_config_path_local_nonprim) {
        config_node_property_string_free(sling_jcrinstall_new_config_path_local_nonprim);
        sling_jcrinstall_new_config_path_local_nonprim = NULL;
    }
    if (sling_jcrinstall_signal_path_local_nonprim) {
        config_node_property_string_free(sling_jcrinstall_signal_path_local_nonprim);
        sling_jcrinstall_signal_path_local_nonprim = NULL;
    }
    if (sling_jcrinstall_enable_writeback_local_nonprim) {
        config_node_property_boolean_free(sling_jcrinstall_enable_writeback_local_nonprim);
        sling_jcrinstall_enable_writeback_local_nonprim = NULL;
    }
    return NULL;

}
