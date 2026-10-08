#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_auth_oauth_impl_github_provider_impl_properties.h"



static com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_t *com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_create_internal(
    config_node_property_string_t *oauth_provider_id,
    config_node_property_string_t *oauth_provider_github_authorization_url,
    config_node_property_string_t *oauth_provider_github_token_url,
    config_node_property_string_t *oauth_provider_github_profile_url
    ) {
    com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_t *com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_local_var = malloc(sizeof(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_t));
    if (!com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_local_var, 0, sizeof(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_t));
    com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_local_var->oauth_provider_id = oauth_provider_id;
    com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_local_var->oauth_provider_github_authorization_url = oauth_provider_github_authorization_url;
    com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_local_var->oauth_provider_github_token_url = oauth_provider_github_token_url;
    com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_local_var->oauth_provider_github_profile_url = oauth_provider_github_profile_url;
    return com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_t *com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_create(
    config_node_property_string_t *oauth_provider_id,
    config_node_property_string_t *oauth_provider_github_authorization_url,
    config_node_property_string_t *oauth_provider_github_token_url,
    config_node_property_string_t *oauth_provider_github_profile_url
    ) {
    com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_t *result = com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_create_internal (
        oauth_provider_id,
        oauth_provider_github_authorization_url,
        oauth_provider_github_token_url,
        oauth_provider_github_profile_url
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_free(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_t *com_adobe_granite_auth_oauth_impl_github_provider_impl_properties) {
    if(NULL == com_adobe_granite_auth_oauth_impl_github_provider_impl_properties){
        return ;
    }
    if(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_id) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_id);
        com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_id = NULL;
    }
    if (com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_authorization_url) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_authorization_url);
        com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_authorization_url = NULL;
    }
    if (com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_token_url) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_token_url);
        com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_token_url = NULL;
    }
    if (com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_profile_url) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_profile_url);
        com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_profile_url = NULL;
    }
    free(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties);
}

cJSON *com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_convertToJSON(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_t *com_adobe_granite_auth_oauth_impl_github_provider_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_id
    if(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_id) {
    cJSON *oauth_provider_id_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_id);
    if(oauth_provider_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.id", oauth_provider_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_authorization_url
    if(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_authorization_url) {
    cJSON *oauth_provider_github_authorization_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_authorization_url);
    if(oauth_provider_github_authorization_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.github.authorization.url", oauth_provider_github_authorization_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_token_url
    if(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_token_url) {
    cJSON *oauth_provider_github_token_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_token_url);
    if(oauth_provider_github_token_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.github.token.url", oauth_provider_github_token_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_profile_url
    if(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_profile_url) {
    cJSON *oauth_provider_github_profile_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_profile_url);
    if(oauth_provider_github_profile_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.provider.github.profile.url", oauth_provider_github_profile_url_local_JSON);
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

com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_t *com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_parseFromJSON(cJSON *com_adobe_granite_auth_oauth_impl_github_provider_impl_propertiesJSON){

    com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_t *com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_id
    config_node_property_string_t *oauth_provider_id_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_authorization_url
    config_node_property_string_t *oauth_provider_github_authorization_url_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_token_url
    config_node_property_string_t *oauth_provider_github_token_url_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_profile_url
    config_node_property_string_t *oauth_provider_github_profile_url_local_nonprim = NULL;

    // com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_id
    cJSON *oauth_provider_id = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_impl_github_provider_impl_propertiesJSON, "oauth.provider.id");
    if (cJSON_IsNull(oauth_provider_id)) {
        oauth_provider_id = NULL;
    }
    if (oauth_provider_id) { 
    oauth_provider_id_local_nonprim = config_node_property_string_parseFromJSON(oauth_provider_id); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_authorization_url
    cJSON *oauth_provider_github_authorization_url = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_impl_github_provider_impl_propertiesJSON, "oauth.provider.github.authorization.url");
    if (cJSON_IsNull(oauth_provider_github_authorization_url)) {
        oauth_provider_github_authorization_url = NULL;
    }
    if (oauth_provider_github_authorization_url) { 
    oauth_provider_github_authorization_url_local_nonprim = config_node_property_string_parseFromJSON(oauth_provider_github_authorization_url); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_token_url
    cJSON *oauth_provider_github_token_url = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_impl_github_provider_impl_propertiesJSON, "oauth.provider.github.token.url");
    if (cJSON_IsNull(oauth_provider_github_token_url)) {
        oauth_provider_github_token_url = NULL;
    }
    if (oauth_provider_github_token_url) { 
    oauth_provider_github_token_url_local_nonprim = config_node_property_string_parseFromJSON(oauth_provider_github_token_url); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_impl_github_provider_impl_properties->oauth_provider_github_profile_url
    cJSON *oauth_provider_github_profile_url = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_impl_github_provider_impl_propertiesJSON, "oauth.provider.github.profile.url");
    if (cJSON_IsNull(oauth_provider_github_profile_url)) {
        oauth_provider_github_profile_url = NULL;
    }
    if (oauth_provider_github_profile_url) { 
    oauth_provider_github_profile_url_local_nonprim = config_node_property_string_parseFromJSON(oauth_provider_github_profile_url); //nonprimitive
    }



    com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_local_var = com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_create_internal (
        oauth_provider_id ? oauth_provider_id_local_nonprim : NULL,
        oauth_provider_github_authorization_url ? oauth_provider_github_authorization_url_local_nonprim : NULL,
        oauth_provider_github_token_url ? oauth_provider_github_token_url_local_nonprim : NULL,
        oauth_provider_github_profile_url ? oauth_provider_github_profile_url_local_nonprim : NULL
        );

    if (!com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_auth_oauth_impl_github_provider_impl_properties_local_var;
end:
    if (oauth_provider_id_local_nonprim) {
        config_node_property_string_free(oauth_provider_id_local_nonprim);
        oauth_provider_id_local_nonprim = NULL;
    }
    if (oauth_provider_github_authorization_url_local_nonprim) {
        config_node_property_string_free(oauth_provider_github_authorization_url_local_nonprim);
        oauth_provider_github_authorization_url_local_nonprim = NULL;
    }
    if (oauth_provider_github_token_url_local_nonprim) {
        config_node_property_string_free(oauth_provider_github_token_url_local_nonprim);
        oauth_provider_github_token_url_local_nonprim = NULL;
    }
    if (oauth_provider_github_profile_url_local_nonprim) {
        config_node_property_string_free(oauth_provider_github_profile_url_local_nonprim);
        oauth_provider_github_profile_url_local_nonprim = NULL;
    }
    return NULL;

}
