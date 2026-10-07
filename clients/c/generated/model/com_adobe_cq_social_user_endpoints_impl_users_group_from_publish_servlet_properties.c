#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties.h"



static com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_t *com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_create_internal(
    config_node_property_string_t *sling_servlet_extensions,
    config_node_property_string_t *sling_servlet_paths,
    config_node_property_string_t *sling_servlet_methods
    ) {
    com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_t *com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_local_var = malloc(sizeof(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_t));
    if (!com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_local_var, 0, sizeof(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_t));
    com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_local_var->sling_servlet_extensions = sling_servlet_extensions;
    com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_local_var->sling_servlet_paths = sling_servlet_paths;
    com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_local_var->sling_servlet_methods = sling_servlet_methods;
    return com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_t *com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_create(
    config_node_property_string_t *sling_servlet_extensions,
    config_node_property_string_t *sling_servlet_paths,
    config_node_property_string_t *sling_servlet_methods
    ) {
    com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_t *result = com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_create_internal (
        sling_servlet_extensions,
        sling_servlet_paths,
        sling_servlet_methods
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_free(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_t *com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties) {
    if(NULL == com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties){
        return ;
    }
    if(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_extensions) {
        config_node_property_string_free(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_extensions);
        com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_extensions = NULL;
    }
    if (com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_paths) {
        config_node_property_string_free(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_paths);
        com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_paths = NULL;
    }
    if (com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_methods) {
        config_node_property_string_free(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_methods);
        com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_methods = NULL;
    }
    free(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties);
}

cJSON *com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_convertToJSON(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_t *com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_extensions
    if(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_extensions) {
    cJSON *sling_servlet_extensions_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_extensions);
    if(sling_servlet_extensions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.extensions", sling_servlet_extensions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_paths
    if(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_paths) {
    cJSON *sling_servlet_paths_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_paths);
    if(sling_servlet_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.paths", sling_servlet_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_methods
    if(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_methods) {
    cJSON *sling_servlet_methods_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_methods);
    if(sling_servlet_methods_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.methods", sling_servlet_methods_local_JSON);
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

com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_t *com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_parseFromJSON(cJSON *com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_propertiesJSON){

    com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_t *com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_extensions
    config_node_property_string_t *sling_servlet_extensions_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_paths
    config_node_property_string_t *sling_servlet_paths_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_methods
    config_node_property_string_t *sling_servlet_methods_local_nonprim = NULL;

    // com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_extensions
    cJSON *sling_servlet_extensions = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_propertiesJSON, "sling.servlet.extensions");
    if (cJSON_IsNull(sling_servlet_extensions)) {
        sling_servlet_extensions = NULL;
    }
    if (sling_servlet_extensions) { 
    sling_servlet_extensions_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_extensions); //nonprimitive
    }

    // com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_paths
    cJSON *sling_servlet_paths = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_propertiesJSON, "sling.servlet.paths");
    if (cJSON_IsNull(sling_servlet_paths)) {
        sling_servlet_paths = NULL;
    }
    if (sling_servlet_paths) { 
    sling_servlet_paths_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_paths); //nonprimitive
    }

    // com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties->sling_servlet_methods
    cJSON *sling_servlet_methods = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_propertiesJSON, "sling.servlet.methods");
    if (cJSON_IsNull(sling_servlet_methods)) {
        sling_servlet_methods = NULL;
    }
    if (sling_servlet_methods) { 
    sling_servlet_methods_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_methods); //nonprimitive
    }



    com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_local_var = com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_create_internal (
        sling_servlet_extensions ? sling_servlet_extensions_local_nonprim : NULL,
        sling_servlet_paths ? sling_servlet_paths_local_nonprim : NULL,
        sling_servlet_methods ? sling_servlet_methods_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_properties_local_var;
end:
    if (sling_servlet_extensions_local_nonprim) {
        config_node_property_string_free(sling_servlet_extensions_local_nonprim);
        sling_servlet_extensions_local_nonprim = NULL;
    }
    if (sling_servlet_paths_local_nonprim) {
        config_node_property_string_free(sling_servlet_paths_local_nonprim);
        sling_servlet_paths_local_nonprim = NULL;
    }
    if (sling_servlet_methods_local_nonprim) {
        config_node_property_string_free(sling_servlet_methods_local_nonprim);
        sling_servlet_methods_local_nonprim = NULL;
    }
    return NULL;

}
