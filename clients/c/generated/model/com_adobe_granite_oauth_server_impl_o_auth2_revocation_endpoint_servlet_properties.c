#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties.h"



static com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_create_internal(
    config_node_property_string_t *sling_servlet_paths,
    config_node_property_boolean_t *oauth_revocation_active
    ) {
    com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_local_var = malloc(sizeof(com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_t));
    if (!com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_local_var, 0, sizeof(com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_t));
    com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_local_var->_library_owned = 1;
    com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_local_var->sling_servlet_paths = sling_servlet_paths;
    com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_local_var->oauth_revocation_active = oauth_revocation_active;
    return com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_create(
    config_node_property_string_t *sling_servlet_paths,
    config_node_property_boolean_t *oauth_revocation_active
    ) {
    com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_t *result = com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_create_internal (
        sling_servlet_paths,
        oauth_revocation_active
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_free(com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties) {
    if(NULL == com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties){
        return ;
    }
    if(com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->sling_servlet_paths) {
        config_node_property_string_free(com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->sling_servlet_paths);
        com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->sling_servlet_paths = NULL;
    }
    if (com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->oauth_revocation_active) {
        config_node_property_boolean_free(com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->oauth_revocation_active);
        com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->oauth_revocation_active = NULL;
    }
    free(com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties);
}

cJSON *com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_convertToJSON(com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->sling_servlet_paths
    if(com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->sling_servlet_paths) {
    cJSON *sling_servlet_paths_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->sling_servlet_paths);
    if(sling_servlet_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.paths", sling_servlet_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->oauth_revocation_active
    if(com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->oauth_revocation_active) {
    cJSON *oauth_revocation_active_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->oauth_revocation_active);
    if(oauth_revocation_active_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.revocation.active", oauth_revocation_active_local_JSON);
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

com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_parseFromJSON(cJSON *com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_propertiesJSON){

    com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->sling_servlet_paths
    config_node_property_string_t *sling_servlet_paths_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->oauth_revocation_active
    config_node_property_boolean_t *oauth_revocation_active_local_nonprim = NULL;

    // com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->sling_servlet_paths
    cJSON *sling_servlet_paths = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_propertiesJSON, "sling.servlet.paths");
    if (cJSON_IsNull(sling_servlet_paths)) {
        sling_servlet_paths = NULL;
    }
    if (sling_servlet_paths) { 
    sling_servlet_paths_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_paths); //nonprimitive
    }

    // com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties->oauth_revocation_active
    cJSON *oauth_revocation_active = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_propertiesJSON, "oauth.revocation.active");
    if (cJSON_IsNull(oauth_revocation_active)) {
        oauth_revocation_active = NULL;
    }
    if (oauth_revocation_active) { 
    oauth_revocation_active_local_nonprim = config_node_property_boolean_parseFromJSON(oauth_revocation_active); //nonprimitive
    }



    com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_local_var = com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_create_internal (
        sling_servlet_paths ? sling_servlet_paths_local_nonprim : NULL,
        oauth_revocation_active ? oauth_revocation_active_local_nonprim : NULL
        );

    if (!com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties_local_var;
end:
    if (sling_servlet_paths_local_nonprim) {
        config_node_property_string_free(sling_servlet_paths_local_nonprim);
        sling_servlet_paths_local_nonprim = NULL;
    }
    if (oauth_revocation_active_local_nonprim) {
        config_node_property_boolean_free(oauth_revocation_active_local_nonprim);
        oauth_revocation_active_local_nonprim = NULL;
    }
    return NULL;

}
