#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_auth_oauth_provider_properties.h"



static com_adobe_granite_auth_oauth_provider_properties_t *com_adobe_granite_auth_oauth_provider_properties_create_internal(
    config_node_property_string_t *oauth_config_id,
    config_node_property_string_t *oauth_client_id,
    config_node_property_string_t *oauth_client_secret,
    config_node_property_array_t *oauth_scope,
    config_node_property_string_t *oauth_config_provider_id,
    config_node_property_boolean_t *oauth_create_users,
    config_node_property_string_t *oauth_userid_property,
    config_node_property_boolean_t *force_strict_username_matching,
    config_node_property_boolean_t *oauth_encode_userids,
    config_node_property_boolean_t *oauth_hash_userids,
    config_node_property_string_t *oauth_call_back_url,
    config_node_property_boolean_t *oauth_access_token_persist,
    config_node_property_boolean_t *oauth_access_token_persist_cookie,
    config_node_property_boolean_t *oauth_csrf_state_protection,
    config_node_property_boolean_t *oauth_redirect_request_params,
    config_node_property_boolean_t *oauth_config_siblings_allow
    ) {
    com_adobe_granite_auth_oauth_provider_properties_t *com_adobe_granite_auth_oauth_provider_properties_local_var = malloc(sizeof(com_adobe_granite_auth_oauth_provider_properties_t));
    if (!com_adobe_granite_auth_oauth_provider_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_auth_oauth_provider_properties_local_var, 0, sizeof(com_adobe_granite_auth_oauth_provider_properties_t));
    com_adobe_granite_auth_oauth_provider_properties_local_var->_library_owned = 1;
    com_adobe_granite_auth_oauth_provider_properties_local_var->oauth_config_id = oauth_config_id;
    com_adobe_granite_auth_oauth_provider_properties_local_var->oauth_client_id = oauth_client_id;
    com_adobe_granite_auth_oauth_provider_properties_local_var->oauth_client_secret = oauth_client_secret;
    com_adobe_granite_auth_oauth_provider_properties_local_var->oauth_scope = oauth_scope;
    com_adobe_granite_auth_oauth_provider_properties_local_var->oauth_config_provider_id = oauth_config_provider_id;
    com_adobe_granite_auth_oauth_provider_properties_local_var->oauth_create_users = oauth_create_users;
    com_adobe_granite_auth_oauth_provider_properties_local_var->oauth_userid_property = oauth_userid_property;
    com_adobe_granite_auth_oauth_provider_properties_local_var->force_strict_username_matching = force_strict_username_matching;
    com_adobe_granite_auth_oauth_provider_properties_local_var->oauth_encode_userids = oauth_encode_userids;
    com_adobe_granite_auth_oauth_provider_properties_local_var->oauth_hash_userids = oauth_hash_userids;
    com_adobe_granite_auth_oauth_provider_properties_local_var->oauth_call_back_url = oauth_call_back_url;
    com_adobe_granite_auth_oauth_provider_properties_local_var->oauth_access_token_persist = oauth_access_token_persist;
    com_adobe_granite_auth_oauth_provider_properties_local_var->oauth_access_token_persist_cookie = oauth_access_token_persist_cookie;
    com_adobe_granite_auth_oauth_provider_properties_local_var->oauth_csrf_state_protection = oauth_csrf_state_protection;
    com_adobe_granite_auth_oauth_provider_properties_local_var->oauth_redirect_request_params = oauth_redirect_request_params;
    com_adobe_granite_auth_oauth_provider_properties_local_var->oauth_config_siblings_allow = oauth_config_siblings_allow;
    return com_adobe_granite_auth_oauth_provider_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_auth_oauth_provider_properties_t *com_adobe_granite_auth_oauth_provider_properties_create(
    config_node_property_string_t *oauth_config_id,
    config_node_property_string_t *oauth_client_id,
    config_node_property_string_t *oauth_client_secret,
    config_node_property_array_t *oauth_scope,
    config_node_property_string_t *oauth_config_provider_id,
    config_node_property_boolean_t *oauth_create_users,
    config_node_property_string_t *oauth_userid_property,
    config_node_property_boolean_t *force_strict_username_matching,
    config_node_property_boolean_t *oauth_encode_userids,
    config_node_property_boolean_t *oauth_hash_userids,
    config_node_property_string_t *oauth_call_back_url,
    config_node_property_boolean_t *oauth_access_token_persist,
    config_node_property_boolean_t *oauth_access_token_persist_cookie,
    config_node_property_boolean_t *oauth_csrf_state_protection,
    config_node_property_boolean_t *oauth_redirect_request_params,
    config_node_property_boolean_t *oauth_config_siblings_allow
    ) {
    com_adobe_granite_auth_oauth_provider_properties_t *result = com_adobe_granite_auth_oauth_provider_properties_create_internal (
        oauth_config_id,
        oauth_client_id,
        oauth_client_secret,
        oauth_scope,
        oauth_config_provider_id,
        oauth_create_users,
        oauth_userid_property,
        force_strict_username_matching,
        oauth_encode_userids,
        oauth_hash_userids,
        oauth_call_back_url,
        oauth_access_token_persist,
        oauth_access_token_persist_cookie,
        oauth_csrf_state_protection,
        oauth_redirect_request_params,
        oauth_config_siblings_allow
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_auth_oauth_provider_properties_free(com_adobe_granite_auth_oauth_provider_properties_t *com_adobe_granite_auth_oauth_provider_properties) {
    if(NULL == com_adobe_granite_auth_oauth_provider_properties){
        return ;
    }
    if(com_adobe_granite_auth_oauth_provider_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_auth_oauth_provider_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_auth_oauth_provider_properties->oauth_config_id) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_provider_properties->oauth_config_id);
        com_adobe_granite_auth_oauth_provider_properties->oauth_config_id = NULL;
    }
    if (com_adobe_granite_auth_oauth_provider_properties->oauth_client_id) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_provider_properties->oauth_client_id);
        com_adobe_granite_auth_oauth_provider_properties->oauth_client_id = NULL;
    }
    if (com_adobe_granite_auth_oauth_provider_properties->oauth_client_secret) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_provider_properties->oauth_client_secret);
        com_adobe_granite_auth_oauth_provider_properties->oauth_client_secret = NULL;
    }
    if (com_adobe_granite_auth_oauth_provider_properties->oauth_scope) {
        config_node_property_array_free(com_adobe_granite_auth_oauth_provider_properties->oauth_scope);
        com_adobe_granite_auth_oauth_provider_properties->oauth_scope = NULL;
    }
    if (com_adobe_granite_auth_oauth_provider_properties->oauth_config_provider_id) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_provider_properties->oauth_config_provider_id);
        com_adobe_granite_auth_oauth_provider_properties->oauth_config_provider_id = NULL;
    }
    if (com_adobe_granite_auth_oauth_provider_properties->oauth_create_users) {
        config_node_property_boolean_free(com_adobe_granite_auth_oauth_provider_properties->oauth_create_users);
        com_adobe_granite_auth_oauth_provider_properties->oauth_create_users = NULL;
    }
    if (com_adobe_granite_auth_oauth_provider_properties->oauth_userid_property) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_provider_properties->oauth_userid_property);
        com_adobe_granite_auth_oauth_provider_properties->oauth_userid_property = NULL;
    }
    if (com_adobe_granite_auth_oauth_provider_properties->force_strict_username_matching) {
        config_node_property_boolean_free(com_adobe_granite_auth_oauth_provider_properties->force_strict_username_matching);
        com_adobe_granite_auth_oauth_provider_properties->force_strict_username_matching = NULL;
    }
    if (com_adobe_granite_auth_oauth_provider_properties->oauth_encode_userids) {
        config_node_property_boolean_free(com_adobe_granite_auth_oauth_provider_properties->oauth_encode_userids);
        com_adobe_granite_auth_oauth_provider_properties->oauth_encode_userids = NULL;
    }
    if (com_adobe_granite_auth_oauth_provider_properties->oauth_hash_userids) {
        config_node_property_boolean_free(com_adobe_granite_auth_oauth_provider_properties->oauth_hash_userids);
        com_adobe_granite_auth_oauth_provider_properties->oauth_hash_userids = NULL;
    }
    if (com_adobe_granite_auth_oauth_provider_properties->oauth_call_back_url) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_provider_properties->oauth_call_back_url);
        com_adobe_granite_auth_oauth_provider_properties->oauth_call_back_url = NULL;
    }
    if (com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist) {
        config_node_property_boolean_free(com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist);
        com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist = NULL;
    }
    if (com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist_cookie) {
        config_node_property_boolean_free(com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist_cookie);
        com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist_cookie = NULL;
    }
    if (com_adobe_granite_auth_oauth_provider_properties->oauth_csrf_state_protection) {
        config_node_property_boolean_free(com_adobe_granite_auth_oauth_provider_properties->oauth_csrf_state_protection);
        com_adobe_granite_auth_oauth_provider_properties->oauth_csrf_state_protection = NULL;
    }
    if (com_adobe_granite_auth_oauth_provider_properties->oauth_redirect_request_params) {
        config_node_property_boolean_free(com_adobe_granite_auth_oauth_provider_properties->oauth_redirect_request_params);
        com_adobe_granite_auth_oauth_provider_properties->oauth_redirect_request_params = NULL;
    }
    if (com_adobe_granite_auth_oauth_provider_properties->oauth_config_siblings_allow) {
        config_node_property_boolean_free(com_adobe_granite_auth_oauth_provider_properties->oauth_config_siblings_allow);
        com_adobe_granite_auth_oauth_provider_properties->oauth_config_siblings_allow = NULL;
    }
    free(com_adobe_granite_auth_oauth_provider_properties);
}

cJSON *com_adobe_granite_auth_oauth_provider_properties_convertToJSON(com_adobe_granite_auth_oauth_provider_properties_t *com_adobe_granite_auth_oauth_provider_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_auth_oauth_provider_properties->oauth_config_id
    if(com_adobe_granite_auth_oauth_provider_properties->oauth_config_id) {
    cJSON *oauth_config_id_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->oauth_config_id);
    if(oauth_config_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.config.id", oauth_config_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_provider_properties->oauth_client_id
    if(com_adobe_granite_auth_oauth_provider_properties->oauth_client_id) {
    cJSON *oauth_client_id_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->oauth_client_id);
    if(oauth_client_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.client.id", oauth_client_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_provider_properties->oauth_client_secret
    if(com_adobe_granite_auth_oauth_provider_properties->oauth_client_secret) {
    cJSON *oauth_client_secret_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->oauth_client_secret);
    if(oauth_client_secret_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.client.secret", oauth_client_secret_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_provider_properties->oauth_scope
    if(com_adobe_granite_auth_oauth_provider_properties->oauth_scope) {
    cJSON *oauth_scope_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->oauth_scope);
    if(oauth_scope_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.scope", oauth_scope_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_provider_properties->oauth_config_provider_id
    if(com_adobe_granite_auth_oauth_provider_properties->oauth_config_provider_id) {
    cJSON *oauth_config_provider_id_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->oauth_config_provider_id);
    if(oauth_config_provider_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.config.provider.id", oauth_config_provider_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_provider_properties->oauth_create_users
    if(com_adobe_granite_auth_oauth_provider_properties->oauth_create_users) {
    cJSON *oauth_create_users_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->oauth_create_users);
    if(oauth_create_users_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.create.users", oauth_create_users_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_provider_properties->oauth_userid_property
    if(com_adobe_granite_auth_oauth_provider_properties->oauth_userid_property) {
    cJSON *oauth_userid_property_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->oauth_userid_property);
    if(oauth_userid_property_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.userid.property", oauth_userid_property_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_provider_properties->force_strict_username_matching
    if(com_adobe_granite_auth_oauth_provider_properties->force_strict_username_matching) {
    cJSON *force_strict_username_matching_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->force_strict_username_matching);
    if(force_strict_username_matching_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "force.strict.username.matching", force_strict_username_matching_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_provider_properties->oauth_encode_userids
    if(com_adobe_granite_auth_oauth_provider_properties->oauth_encode_userids) {
    cJSON *oauth_encode_userids_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->oauth_encode_userids);
    if(oauth_encode_userids_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.encode.userids", oauth_encode_userids_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_provider_properties->oauth_hash_userids
    if(com_adobe_granite_auth_oauth_provider_properties->oauth_hash_userids) {
    cJSON *oauth_hash_userids_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->oauth_hash_userids);
    if(oauth_hash_userids_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.hash.userids", oauth_hash_userids_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_provider_properties->oauth_call_back_url
    if(com_adobe_granite_auth_oauth_provider_properties->oauth_call_back_url) {
    cJSON *oauth_call_back_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->oauth_call_back_url);
    if(oauth_call_back_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.callBackUrl", oauth_call_back_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist
    if(com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist) {
    cJSON *oauth_access_token_persist_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist);
    if(oauth_access_token_persist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.access.token.persist", oauth_access_token_persist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist_cookie
    if(com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist_cookie) {
    cJSON *oauth_access_token_persist_cookie_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist_cookie);
    if(oauth_access_token_persist_cookie_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.access.token.persist.cookie", oauth_access_token_persist_cookie_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_provider_properties->oauth_csrf_state_protection
    if(com_adobe_granite_auth_oauth_provider_properties->oauth_csrf_state_protection) {
    cJSON *oauth_csrf_state_protection_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->oauth_csrf_state_protection);
    if(oauth_csrf_state_protection_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.csrf.state.protection", oauth_csrf_state_protection_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_provider_properties->oauth_redirect_request_params
    if(com_adobe_granite_auth_oauth_provider_properties->oauth_redirect_request_params) {
    cJSON *oauth_redirect_request_params_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->oauth_redirect_request_params);
    if(oauth_redirect_request_params_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.redirect.request.params", oauth_redirect_request_params_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_provider_properties->oauth_config_siblings_allow
    if(com_adobe_granite_auth_oauth_provider_properties->oauth_config_siblings_allow) {
    cJSON *oauth_config_siblings_allow_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_oauth_provider_properties->oauth_config_siblings_allow);
    if(oauth_config_siblings_allow_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.config.siblings.allow", oauth_config_siblings_allow_local_JSON);
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

com_adobe_granite_auth_oauth_provider_properties_t *com_adobe_granite_auth_oauth_provider_properties_parseFromJSON(cJSON *com_adobe_granite_auth_oauth_provider_propertiesJSON){

    com_adobe_granite_auth_oauth_provider_properties_t *com_adobe_granite_auth_oauth_provider_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->oauth_config_id
    config_node_property_string_t *oauth_config_id_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->oauth_client_id
    config_node_property_string_t *oauth_client_id_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->oauth_client_secret
    config_node_property_string_t *oauth_client_secret_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->oauth_scope
    config_node_property_array_t *oauth_scope_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->oauth_config_provider_id
    config_node_property_string_t *oauth_config_provider_id_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->oauth_create_users
    config_node_property_boolean_t *oauth_create_users_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->oauth_userid_property
    config_node_property_string_t *oauth_userid_property_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->force_strict_username_matching
    config_node_property_boolean_t *force_strict_username_matching_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->oauth_encode_userids
    config_node_property_boolean_t *oauth_encode_userids_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->oauth_hash_userids
    config_node_property_boolean_t *oauth_hash_userids_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->oauth_call_back_url
    config_node_property_string_t *oauth_call_back_url_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist
    config_node_property_boolean_t *oauth_access_token_persist_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist_cookie
    config_node_property_boolean_t *oauth_access_token_persist_cookie_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->oauth_csrf_state_protection
    config_node_property_boolean_t *oauth_csrf_state_protection_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->oauth_redirect_request_params
    config_node_property_boolean_t *oauth_redirect_request_params_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_provider_properties->oauth_config_siblings_allow
    config_node_property_boolean_t *oauth_config_siblings_allow_local_nonprim = NULL;

    // com_adobe_granite_auth_oauth_provider_properties->oauth_config_id
    cJSON *oauth_config_id = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "oauth.config.id");
    if (cJSON_IsNull(oauth_config_id)) {
        oauth_config_id = NULL;
    }
    if (oauth_config_id) { 
    oauth_config_id_local_nonprim = config_node_property_string_parseFromJSON(oauth_config_id); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_provider_properties->oauth_client_id
    cJSON *oauth_client_id = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "oauth.client.id");
    if (cJSON_IsNull(oauth_client_id)) {
        oauth_client_id = NULL;
    }
    if (oauth_client_id) { 
    oauth_client_id_local_nonprim = config_node_property_string_parseFromJSON(oauth_client_id); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_provider_properties->oauth_client_secret
    cJSON *oauth_client_secret = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "oauth.client.secret");
    if (cJSON_IsNull(oauth_client_secret)) {
        oauth_client_secret = NULL;
    }
    if (oauth_client_secret) { 
    oauth_client_secret_local_nonprim = config_node_property_string_parseFromJSON(oauth_client_secret); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_provider_properties->oauth_scope
    cJSON *oauth_scope = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "oauth.scope");
    if (cJSON_IsNull(oauth_scope)) {
        oauth_scope = NULL;
    }
    if (oauth_scope) { 
    oauth_scope_local_nonprim = config_node_property_array_parseFromJSON(oauth_scope); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_provider_properties->oauth_config_provider_id
    cJSON *oauth_config_provider_id = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "oauth.config.provider.id");
    if (cJSON_IsNull(oauth_config_provider_id)) {
        oauth_config_provider_id = NULL;
    }
    if (oauth_config_provider_id) { 
    oauth_config_provider_id_local_nonprim = config_node_property_string_parseFromJSON(oauth_config_provider_id); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_provider_properties->oauth_create_users
    cJSON *oauth_create_users = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "oauth.create.users");
    if (cJSON_IsNull(oauth_create_users)) {
        oauth_create_users = NULL;
    }
    if (oauth_create_users) { 
    oauth_create_users_local_nonprim = config_node_property_boolean_parseFromJSON(oauth_create_users); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_provider_properties->oauth_userid_property
    cJSON *oauth_userid_property = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "oauth.userid.property");
    if (cJSON_IsNull(oauth_userid_property)) {
        oauth_userid_property = NULL;
    }
    if (oauth_userid_property) { 
    oauth_userid_property_local_nonprim = config_node_property_string_parseFromJSON(oauth_userid_property); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_provider_properties->force_strict_username_matching
    cJSON *force_strict_username_matching = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "force.strict.username.matching");
    if (cJSON_IsNull(force_strict_username_matching)) {
        force_strict_username_matching = NULL;
    }
    if (force_strict_username_matching) { 
    force_strict_username_matching_local_nonprim = config_node_property_boolean_parseFromJSON(force_strict_username_matching); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_provider_properties->oauth_encode_userids
    cJSON *oauth_encode_userids = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "oauth.encode.userids");
    if (cJSON_IsNull(oauth_encode_userids)) {
        oauth_encode_userids = NULL;
    }
    if (oauth_encode_userids) { 
    oauth_encode_userids_local_nonprim = config_node_property_boolean_parseFromJSON(oauth_encode_userids); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_provider_properties->oauth_hash_userids
    cJSON *oauth_hash_userids = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "oauth.hash.userids");
    if (cJSON_IsNull(oauth_hash_userids)) {
        oauth_hash_userids = NULL;
    }
    if (oauth_hash_userids) { 
    oauth_hash_userids_local_nonprim = config_node_property_boolean_parseFromJSON(oauth_hash_userids); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_provider_properties->oauth_call_back_url
    cJSON *oauth_call_back_url = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "oauth.callBackUrl");
    if (cJSON_IsNull(oauth_call_back_url)) {
        oauth_call_back_url = NULL;
    }
    if (oauth_call_back_url) { 
    oauth_call_back_url_local_nonprim = config_node_property_string_parseFromJSON(oauth_call_back_url); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist
    cJSON *oauth_access_token_persist = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "oauth.access.token.persist");
    if (cJSON_IsNull(oauth_access_token_persist)) {
        oauth_access_token_persist = NULL;
    }
    if (oauth_access_token_persist) { 
    oauth_access_token_persist_local_nonprim = config_node_property_boolean_parseFromJSON(oauth_access_token_persist); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_provider_properties->oauth_access_token_persist_cookie
    cJSON *oauth_access_token_persist_cookie = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "oauth.access.token.persist.cookie");
    if (cJSON_IsNull(oauth_access_token_persist_cookie)) {
        oauth_access_token_persist_cookie = NULL;
    }
    if (oauth_access_token_persist_cookie) { 
    oauth_access_token_persist_cookie_local_nonprim = config_node_property_boolean_parseFromJSON(oauth_access_token_persist_cookie); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_provider_properties->oauth_csrf_state_protection
    cJSON *oauth_csrf_state_protection = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "oauth.csrf.state.protection");
    if (cJSON_IsNull(oauth_csrf_state_protection)) {
        oauth_csrf_state_protection = NULL;
    }
    if (oauth_csrf_state_protection) { 
    oauth_csrf_state_protection_local_nonprim = config_node_property_boolean_parseFromJSON(oauth_csrf_state_protection); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_provider_properties->oauth_redirect_request_params
    cJSON *oauth_redirect_request_params = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "oauth.redirect.request.params");
    if (cJSON_IsNull(oauth_redirect_request_params)) {
        oauth_redirect_request_params = NULL;
    }
    if (oauth_redirect_request_params) { 
    oauth_redirect_request_params_local_nonprim = config_node_property_boolean_parseFromJSON(oauth_redirect_request_params); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_provider_properties->oauth_config_siblings_allow
    cJSON *oauth_config_siblings_allow = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_provider_propertiesJSON, "oauth.config.siblings.allow");
    if (cJSON_IsNull(oauth_config_siblings_allow)) {
        oauth_config_siblings_allow = NULL;
    }
    if (oauth_config_siblings_allow) { 
    oauth_config_siblings_allow_local_nonprim = config_node_property_boolean_parseFromJSON(oauth_config_siblings_allow); //nonprimitive
    }



    com_adobe_granite_auth_oauth_provider_properties_local_var = com_adobe_granite_auth_oauth_provider_properties_create_internal (
        oauth_config_id ? oauth_config_id_local_nonprim : NULL,
        oauth_client_id ? oauth_client_id_local_nonprim : NULL,
        oauth_client_secret ? oauth_client_secret_local_nonprim : NULL,
        oauth_scope ? oauth_scope_local_nonprim : NULL,
        oauth_config_provider_id ? oauth_config_provider_id_local_nonprim : NULL,
        oauth_create_users ? oauth_create_users_local_nonprim : NULL,
        oauth_userid_property ? oauth_userid_property_local_nonprim : NULL,
        force_strict_username_matching ? force_strict_username_matching_local_nonprim : NULL,
        oauth_encode_userids ? oauth_encode_userids_local_nonprim : NULL,
        oauth_hash_userids ? oauth_hash_userids_local_nonprim : NULL,
        oauth_call_back_url ? oauth_call_back_url_local_nonprim : NULL,
        oauth_access_token_persist ? oauth_access_token_persist_local_nonprim : NULL,
        oauth_access_token_persist_cookie ? oauth_access_token_persist_cookie_local_nonprim : NULL,
        oauth_csrf_state_protection ? oauth_csrf_state_protection_local_nonprim : NULL,
        oauth_redirect_request_params ? oauth_redirect_request_params_local_nonprim : NULL,
        oauth_config_siblings_allow ? oauth_config_siblings_allow_local_nonprim : NULL
        );

    if (!com_adobe_granite_auth_oauth_provider_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_auth_oauth_provider_properties_local_var;
end:
    if (oauth_config_id_local_nonprim) {
        config_node_property_string_free(oauth_config_id_local_nonprim);
        oauth_config_id_local_nonprim = NULL;
    }
    if (oauth_client_id_local_nonprim) {
        config_node_property_string_free(oauth_client_id_local_nonprim);
        oauth_client_id_local_nonprim = NULL;
    }
    if (oauth_client_secret_local_nonprim) {
        config_node_property_string_free(oauth_client_secret_local_nonprim);
        oauth_client_secret_local_nonprim = NULL;
    }
    if (oauth_scope_local_nonprim) {
        config_node_property_array_free(oauth_scope_local_nonprim);
        oauth_scope_local_nonprim = NULL;
    }
    if (oauth_config_provider_id_local_nonprim) {
        config_node_property_string_free(oauth_config_provider_id_local_nonprim);
        oauth_config_provider_id_local_nonprim = NULL;
    }
    if (oauth_create_users_local_nonprim) {
        config_node_property_boolean_free(oauth_create_users_local_nonprim);
        oauth_create_users_local_nonprim = NULL;
    }
    if (oauth_userid_property_local_nonprim) {
        config_node_property_string_free(oauth_userid_property_local_nonprim);
        oauth_userid_property_local_nonprim = NULL;
    }
    if (force_strict_username_matching_local_nonprim) {
        config_node_property_boolean_free(force_strict_username_matching_local_nonprim);
        force_strict_username_matching_local_nonprim = NULL;
    }
    if (oauth_encode_userids_local_nonprim) {
        config_node_property_boolean_free(oauth_encode_userids_local_nonprim);
        oauth_encode_userids_local_nonprim = NULL;
    }
    if (oauth_hash_userids_local_nonprim) {
        config_node_property_boolean_free(oauth_hash_userids_local_nonprim);
        oauth_hash_userids_local_nonprim = NULL;
    }
    if (oauth_call_back_url_local_nonprim) {
        config_node_property_string_free(oauth_call_back_url_local_nonprim);
        oauth_call_back_url_local_nonprim = NULL;
    }
    if (oauth_access_token_persist_local_nonprim) {
        config_node_property_boolean_free(oauth_access_token_persist_local_nonprim);
        oauth_access_token_persist_local_nonprim = NULL;
    }
    if (oauth_access_token_persist_cookie_local_nonprim) {
        config_node_property_boolean_free(oauth_access_token_persist_cookie_local_nonprim);
        oauth_access_token_persist_cookie_local_nonprim = NULL;
    }
    if (oauth_csrf_state_protection_local_nonprim) {
        config_node_property_boolean_free(oauth_csrf_state_protection_local_nonprim);
        oauth_csrf_state_protection_local_nonprim = NULL;
    }
    if (oauth_redirect_request_params_local_nonprim) {
        config_node_property_boolean_free(oauth_redirect_request_params_local_nonprim);
        oauth_redirect_request_params_local_nonprim = NULL;
    }
    if (oauth_config_siblings_allow_local_nonprim) {
        config_node_property_boolean_free(oauth_config_siblings_allow_local_nonprim);
        oauth_config_siblings_allow_local_nonprim = NULL;
    }
    return NULL;

}
