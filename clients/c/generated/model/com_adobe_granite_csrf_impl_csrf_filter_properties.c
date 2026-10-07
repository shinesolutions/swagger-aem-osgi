#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_csrf_impl_csrf_filter_properties.h"



static com_adobe_granite_csrf_impl_csrf_filter_properties_t *com_adobe_granite_csrf_impl_csrf_filter_properties_create_internal(
    config_node_property_array_t *filter_methods,
    config_node_property_boolean_t *filter_enable_safe_user_agents,
    config_node_property_array_t *filter_safe_user_agents,
    config_node_property_array_t *filter_excluded_paths
    ) {
    com_adobe_granite_csrf_impl_csrf_filter_properties_t *com_adobe_granite_csrf_impl_csrf_filter_properties_local_var = malloc(sizeof(com_adobe_granite_csrf_impl_csrf_filter_properties_t));
    if (!com_adobe_granite_csrf_impl_csrf_filter_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_csrf_impl_csrf_filter_properties_local_var, 0, sizeof(com_adobe_granite_csrf_impl_csrf_filter_properties_t));
    com_adobe_granite_csrf_impl_csrf_filter_properties_local_var->_library_owned = 1;
    com_adobe_granite_csrf_impl_csrf_filter_properties_local_var->filter_methods = filter_methods;
    com_adobe_granite_csrf_impl_csrf_filter_properties_local_var->filter_enable_safe_user_agents = filter_enable_safe_user_agents;
    com_adobe_granite_csrf_impl_csrf_filter_properties_local_var->filter_safe_user_agents = filter_safe_user_agents;
    com_adobe_granite_csrf_impl_csrf_filter_properties_local_var->filter_excluded_paths = filter_excluded_paths;
    return com_adobe_granite_csrf_impl_csrf_filter_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_csrf_impl_csrf_filter_properties_t *com_adobe_granite_csrf_impl_csrf_filter_properties_create(
    config_node_property_array_t *filter_methods,
    config_node_property_boolean_t *filter_enable_safe_user_agents,
    config_node_property_array_t *filter_safe_user_agents,
    config_node_property_array_t *filter_excluded_paths
    ) {
    com_adobe_granite_csrf_impl_csrf_filter_properties_t *result = com_adobe_granite_csrf_impl_csrf_filter_properties_create_internal (
        filter_methods,
        filter_enable_safe_user_agents,
        filter_safe_user_agents,
        filter_excluded_paths
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_csrf_impl_csrf_filter_properties_free(com_adobe_granite_csrf_impl_csrf_filter_properties_t *com_adobe_granite_csrf_impl_csrf_filter_properties) {
    if(NULL == com_adobe_granite_csrf_impl_csrf_filter_properties){
        return ;
    }
    if(com_adobe_granite_csrf_impl_csrf_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_csrf_impl_csrf_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_csrf_impl_csrf_filter_properties->filter_methods) {
        config_node_property_array_free(com_adobe_granite_csrf_impl_csrf_filter_properties->filter_methods);
        com_adobe_granite_csrf_impl_csrf_filter_properties->filter_methods = NULL;
    }
    if (com_adobe_granite_csrf_impl_csrf_filter_properties->filter_enable_safe_user_agents) {
        config_node_property_boolean_free(com_adobe_granite_csrf_impl_csrf_filter_properties->filter_enable_safe_user_agents);
        com_adobe_granite_csrf_impl_csrf_filter_properties->filter_enable_safe_user_agents = NULL;
    }
    if (com_adobe_granite_csrf_impl_csrf_filter_properties->filter_safe_user_agents) {
        config_node_property_array_free(com_adobe_granite_csrf_impl_csrf_filter_properties->filter_safe_user_agents);
        com_adobe_granite_csrf_impl_csrf_filter_properties->filter_safe_user_agents = NULL;
    }
    if (com_adobe_granite_csrf_impl_csrf_filter_properties->filter_excluded_paths) {
        config_node_property_array_free(com_adobe_granite_csrf_impl_csrf_filter_properties->filter_excluded_paths);
        com_adobe_granite_csrf_impl_csrf_filter_properties->filter_excluded_paths = NULL;
    }
    free(com_adobe_granite_csrf_impl_csrf_filter_properties);
}

cJSON *com_adobe_granite_csrf_impl_csrf_filter_properties_convertToJSON(com_adobe_granite_csrf_impl_csrf_filter_properties_t *com_adobe_granite_csrf_impl_csrf_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_csrf_impl_csrf_filter_properties->filter_methods
    if(com_adobe_granite_csrf_impl_csrf_filter_properties->filter_methods) {
    cJSON *filter_methods_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_csrf_impl_csrf_filter_properties->filter_methods);
    if(filter_methods_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filter.methods", filter_methods_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_csrf_impl_csrf_filter_properties->filter_enable_safe_user_agents
    if(com_adobe_granite_csrf_impl_csrf_filter_properties->filter_enable_safe_user_agents) {
    cJSON *filter_enable_safe_user_agents_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_csrf_impl_csrf_filter_properties->filter_enable_safe_user_agents);
    if(filter_enable_safe_user_agents_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filter.enable.safe.user.agents", filter_enable_safe_user_agents_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_csrf_impl_csrf_filter_properties->filter_safe_user_agents
    if(com_adobe_granite_csrf_impl_csrf_filter_properties->filter_safe_user_agents) {
    cJSON *filter_safe_user_agents_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_csrf_impl_csrf_filter_properties->filter_safe_user_agents);
    if(filter_safe_user_agents_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filter.safe.user.agents", filter_safe_user_agents_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_csrf_impl_csrf_filter_properties->filter_excluded_paths
    if(com_adobe_granite_csrf_impl_csrf_filter_properties->filter_excluded_paths) {
    cJSON *filter_excluded_paths_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_csrf_impl_csrf_filter_properties->filter_excluded_paths);
    if(filter_excluded_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filter.excluded.paths", filter_excluded_paths_local_JSON);
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

com_adobe_granite_csrf_impl_csrf_filter_properties_t *com_adobe_granite_csrf_impl_csrf_filter_properties_parseFromJSON(cJSON *com_adobe_granite_csrf_impl_csrf_filter_propertiesJSON){

    com_adobe_granite_csrf_impl_csrf_filter_properties_t *com_adobe_granite_csrf_impl_csrf_filter_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_csrf_impl_csrf_filter_properties->filter_methods
    config_node_property_array_t *filter_methods_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_csrf_impl_csrf_filter_properties->filter_enable_safe_user_agents
    config_node_property_boolean_t *filter_enable_safe_user_agents_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_csrf_impl_csrf_filter_properties->filter_safe_user_agents
    config_node_property_array_t *filter_safe_user_agents_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_csrf_impl_csrf_filter_properties->filter_excluded_paths
    config_node_property_array_t *filter_excluded_paths_local_nonprim = NULL;

    // com_adobe_granite_csrf_impl_csrf_filter_properties->filter_methods
    cJSON *filter_methods = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_csrf_impl_csrf_filter_propertiesJSON, "filter.methods");
    if (cJSON_IsNull(filter_methods)) {
        filter_methods = NULL;
    }
    if (filter_methods) { 
    filter_methods_local_nonprim = config_node_property_array_parseFromJSON(filter_methods); //nonprimitive
    }

    // com_adobe_granite_csrf_impl_csrf_filter_properties->filter_enable_safe_user_agents
    cJSON *filter_enable_safe_user_agents = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_csrf_impl_csrf_filter_propertiesJSON, "filter.enable.safe.user.agents");
    if (cJSON_IsNull(filter_enable_safe_user_agents)) {
        filter_enable_safe_user_agents = NULL;
    }
    if (filter_enable_safe_user_agents) { 
    filter_enable_safe_user_agents_local_nonprim = config_node_property_boolean_parseFromJSON(filter_enable_safe_user_agents); //nonprimitive
    }

    // com_adobe_granite_csrf_impl_csrf_filter_properties->filter_safe_user_agents
    cJSON *filter_safe_user_agents = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_csrf_impl_csrf_filter_propertiesJSON, "filter.safe.user.agents");
    if (cJSON_IsNull(filter_safe_user_agents)) {
        filter_safe_user_agents = NULL;
    }
    if (filter_safe_user_agents) { 
    filter_safe_user_agents_local_nonprim = config_node_property_array_parseFromJSON(filter_safe_user_agents); //nonprimitive
    }

    // com_adobe_granite_csrf_impl_csrf_filter_properties->filter_excluded_paths
    cJSON *filter_excluded_paths = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_csrf_impl_csrf_filter_propertiesJSON, "filter.excluded.paths");
    if (cJSON_IsNull(filter_excluded_paths)) {
        filter_excluded_paths = NULL;
    }
    if (filter_excluded_paths) { 
    filter_excluded_paths_local_nonprim = config_node_property_array_parseFromJSON(filter_excluded_paths); //nonprimitive
    }



    com_adobe_granite_csrf_impl_csrf_filter_properties_local_var = com_adobe_granite_csrf_impl_csrf_filter_properties_create_internal (
        filter_methods ? filter_methods_local_nonprim : NULL,
        filter_enable_safe_user_agents ? filter_enable_safe_user_agents_local_nonprim : NULL,
        filter_safe_user_agents ? filter_safe_user_agents_local_nonprim : NULL,
        filter_excluded_paths ? filter_excluded_paths_local_nonprim : NULL
        );

    if (!com_adobe_granite_csrf_impl_csrf_filter_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_csrf_impl_csrf_filter_properties_local_var;
end:
    if (filter_methods_local_nonprim) {
        config_node_property_array_free(filter_methods_local_nonprim);
        filter_methods_local_nonprim = NULL;
    }
    if (filter_enable_safe_user_agents_local_nonprim) {
        config_node_property_boolean_free(filter_enable_safe_user_agents_local_nonprim);
        filter_enable_safe_user_agents_local_nonprim = NULL;
    }
    if (filter_safe_user_agents_local_nonprim) {
        config_node_property_array_free(filter_safe_user_agents_local_nonprim);
        filter_safe_user_agents_local_nonprim = NULL;
    }
    if (filter_excluded_paths_local_nonprim) {
        config_node_property_array_free(filter_excluded_paths_local_nonprim);
        filter_excluded_paths_local_nonprim = NULL;
    }
    return NULL;

}
