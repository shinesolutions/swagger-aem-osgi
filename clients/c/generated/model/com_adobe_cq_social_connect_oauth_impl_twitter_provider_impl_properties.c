#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties.h"



static com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_t *com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_create_internal(
    config_node_property_string_t *oauth_provider_id,
    config_node_property_string_t *oauth_cloud_config_root,
    config_node_property_string_t *provider_config_root,
    config_node_property_drop_down_t *provider_config_user_folder,
    config_node_property_boolean_t *provider_config_twitter_enable_params,
    config_node_property_array_t *provider_config_twitter_params,
    config_node_property_boolean_t *provider_config_refresh_userdata_enabled
    ) {
    com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_t *com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var = malloc(sizeof(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_t));
    if (!com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var, 0, sizeof(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_t));
    com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var->oauth_provider_id = oauth_provider_id;
    com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var->oauth_cloud_config_root = oauth_cloud_config_root;
    com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var->provider_config_root = provider_config_root;
    com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var->provider_config_user_folder = provider_config_user_folder;
    com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var->provider_config_twitter_enable_params = provider_config_twitter_enable_params;
    com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var->provider_config_twitter_params = provider_config_twitter_params;
    com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var->provider_config_refresh_userdata_enabled = provider_config_refresh_userdata_enabled;
    return com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_t *com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_create(
    config_node_property_string_t *oauth_provider_id,
    config_node_property_string_t *oauth_cloud_config_root,
    config_node_property_string_t *provider_config_root,
    config_node_property_drop_down_t *provider_config_user_folder,
    config_node_property_boolean_t *provider_config_twitter_enable_params,
    config_node_property_array_t *provider_config_twitter_params,
    config_node_property_boolean_t *provider_config_refresh_userdata_enabled
    ) {
    com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_t *result = com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_create_internal (
        oauth_provider_id,
        oauth_cloud_config_root,
        provider_config_root,
        provider_config_user_folder,
        provider_config_twitter_enable_params,
        provider_config_twitter_params,
        provider_config_refresh_userdata_enabled
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_free(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_t *com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties) {
    if(NULL == com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties){
        return ;
    }
    if(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_provider_id) {
        config_node_property_string_free(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_provider_id);
        com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_provider_id = NULL;
    }
    if (com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_cloud_config_root) {
        config_node_property_string_free(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_cloud_config_root);
        com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_cloud_config_root = NULL;
    }
    if (com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_root) {
        config_node_property_string_free(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_root);
        com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_root = NULL;
    }
    if (com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_user_folder) {
        config_node_property_drop_down_free(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_user_folder);
        com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_user_folder = NULL;
    }
    if (com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_enable_params) {
        config_node_property_boolean_free(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_enable_params);
        com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_enable_params = NULL;
    }
    if (com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_params) {
        config_node_property_array_free(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_params);
        com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_params = NULL;
    }
    if (com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_refresh_userdata_enabled) {
        config_node_property_boolean_free(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_refresh_userdata_enabled);
        com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_refresh_userdata_enabled = NULL;
    }
    free(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties);
}

cJSON *com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_convertToJSON(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_t *com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_provider_id
    if(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_provider_id) {
    cJSON *oauth_provider_id_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_provider_id);
    if(oauth_provider_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.id", oauth_provider_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_cloud_config_root
    if(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_cloud_config_root) {
    cJSON *oauth_cloud_config_root_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_cloud_config_root);
    if(oauth_cloud_config_root_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.cloud.config.root", oauth_cloud_config_root_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_root
    if(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_root) {
    cJSON *provider_config_root_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_root);
    if(provider_config_root_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "provider.config.root", provider_config_root_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_user_folder
    if(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_user_folder) {
    cJSON *provider_config_user_folder_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_user_folder);
    if(provider_config_user_folder_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "provider.config.user.folder", provider_config_user_folder_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_enable_params
    if(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_enable_params) {
    cJSON *provider_config_twitter_enable_params_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_enable_params);
    if(provider_config_twitter_enable_params_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "provider.config.twitter.enable.params", provider_config_twitter_enable_params_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_params
    if(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_params) {
    cJSON *provider_config_twitter_params_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_params);
    if(provider_config_twitter_params_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "provider.config.twitter.params", provider_config_twitter_params_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_refresh_userdata_enabled
    if(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_refresh_userdata_enabled) {
    cJSON *provider_config_refresh_userdata_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_refresh_userdata_enabled);
    if(provider_config_refresh_userdata_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "provider.config.refresh.userdata.enabled", provider_config_refresh_userdata_enabled_local_JSON);
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

com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_t *com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_parseFromJSON(cJSON *com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_propertiesJSON){

    com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_t *com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_provider_id
    config_node_property_string_t *oauth_provider_id_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_cloud_config_root
    config_node_property_string_t *oauth_cloud_config_root_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_root
    config_node_property_string_t *provider_config_root_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_user_folder
    config_node_property_drop_down_t *provider_config_user_folder_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_enable_params
    config_node_property_boolean_t *provider_config_twitter_enable_params_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_params
    config_node_property_array_t *provider_config_twitter_params_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_refresh_userdata_enabled
    config_node_property_boolean_t *provider_config_refresh_userdata_enabled_local_nonprim = NULL;

    // com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_provider_id
    cJSON *oauth_provider_id = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_propertiesJSON, "oauth.provider.id");
    if (cJSON_IsNull(oauth_provider_id)) {
        oauth_provider_id = NULL;
    }
    if (oauth_provider_id) { 
    oauth_provider_id_local_nonprim = config_node_property_string_parseFromJSON(oauth_provider_id); //nonprimitive
    }

    // com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->oauth_cloud_config_root
    cJSON *oauth_cloud_config_root = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_propertiesJSON, "oauth.cloud.config.root");
    if (cJSON_IsNull(oauth_cloud_config_root)) {
        oauth_cloud_config_root = NULL;
    }
    if (oauth_cloud_config_root) { 
    oauth_cloud_config_root_local_nonprim = config_node_property_string_parseFromJSON(oauth_cloud_config_root); //nonprimitive
    }

    // com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_root
    cJSON *provider_config_root = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_propertiesJSON, "provider.config.root");
    if (cJSON_IsNull(provider_config_root)) {
        provider_config_root = NULL;
    }
    if (provider_config_root) { 
    provider_config_root_local_nonprim = config_node_property_string_parseFromJSON(provider_config_root); //nonprimitive
    }

    // com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_user_folder
    cJSON *provider_config_user_folder = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_propertiesJSON, "provider.config.user.folder");
    if (cJSON_IsNull(provider_config_user_folder)) {
        provider_config_user_folder = NULL;
    }
    if (provider_config_user_folder) { 
    provider_config_user_folder_local_nonprim = config_node_property_drop_down_parseFromJSON(provider_config_user_folder); //nonprimitive
    }

    // com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_enable_params
    cJSON *provider_config_twitter_enable_params = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_propertiesJSON, "provider.config.twitter.enable.params");
    if (cJSON_IsNull(provider_config_twitter_enable_params)) {
        provider_config_twitter_enable_params = NULL;
    }
    if (provider_config_twitter_enable_params) { 
    provider_config_twitter_enable_params_local_nonprim = config_node_property_boolean_parseFromJSON(provider_config_twitter_enable_params); //nonprimitive
    }

    // com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_twitter_params
    cJSON *provider_config_twitter_params = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_propertiesJSON, "provider.config.twitter.params");
    if (cJSON_IsNull(provider_config_twitter_params)) {
        provider_config_twitter_params = NULL;
    }
    if (provider_config_twitter_params) { 
    provider_config_twitter_params_local_nonprim = config_node_property_array_parseFromJSON(provider_config_twitter_params); //nonprimitive
    }

    // com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties->provider_config_refresh_userdata_enabled
    cJSON *provider_config_refresh_userdata_enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_propertiesJSON, "provider.config.refresh.userdata.enabled");
    if (cJSON_IsNull(provider_config_refresh_userdata_enabled)) {
        provider_config_refresh_userdata_enabled = NULL;
    }
    if (provider_config_refresh_userdata_enabled) { 
    provider_config_refresh_userdata_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(provider_config_refresh_userdata_enabled); //nonprimitive
    }



    com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var = com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_create_internal (
        oauth_provider_id ? oauth_provider_id_local_nonprim : NULL,
        oauth_cloud_config_root ? oauth_cloud_config_root_local_nonprim : NULL,
        provider_config_root ? provider_config_root_local_nonprim : NULL,
        provider_config_user_folder ? provider_config_user_folder_local_nonprim : NULL,
        provider_config_twitter_enable_params ? provider_config_twitter_enable_params_local_nonprim : NULL,
        provider_config_twitter_params ? provider_config_twitter_params_local_nonprim : NULL,
        provider_config_refresh_userdata_enabled ? provider_config_refresh_userdata_enabled_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties_local_var;
end:
    if (oauth_provider_id_local_nonprim) {
        config_node_property_string_free(oauth_provider_id_local_nonprim);
        oauth_provider_id_local_nonprim = NULL;
    }
    if (oauth_cloud_config_root_local_nonprim) {
        config_node_property_string_free(oauth_cloud_config_root_local_nonprim);
        oauth_cloud_config_root_local_nonprim = NULL;
    }
    if (provider_config_root_local_nonprim) {
        config_node_property_string_free(provider_config_root_local_nonprim);
        provider_config_root_local_nonprim = NULL;
    }
    if (provider_config_user_folder_local_nonprim) {
        config_node_property_drop_down_free(provider_config_user_folder_local_nonprim);
        provider_config_user_folder_local_nonprim = NULL;
    }
    if (provider_config_twitter_enable_params_local_nonprim) {
        config_node_property_boolean_free(provider_config_twitter_enable_params_local_nonprim);
        provider_config_twitter_enable_params_local_nonprim = NULL;
    }
    if (provider_config_twitter_params_local_nonprim) {
        config_node_property_array_free(provider_config_twitter_params_local_nonprim);
        provider_config_twitter_params_local_nonprim = NULL;
    }
    if (provider_config_refresh_userdata_enabled_local_nonprim) {
        config_node_property_boolean_free(provider_config_refresh_userdata_enabled_local_nonprim);
        provider_config_refresh_userdata_enabled_local_nonprim = NULL;
    }
    return NULL;

}
