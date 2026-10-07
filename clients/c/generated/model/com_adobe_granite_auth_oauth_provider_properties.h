/*
 * com_adobe_granite_auth_oauth_provider_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_auth_oauth_provider_properties_H_
#define _com_adobe_granite_auth_oauth_provider_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_auth_oauth_provider_properties_t com_adobe_granite_auth_oauth_provider_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_adobe_granite_auth_oauth_provider_properties_t {
    struct config_node_property_string_t *oauth_config_id; //model
    struct config_node_property_string_t *oauth_client_id; //model
    struct config_node_property_string_t *oauth_client_secret; //model
    struct config_node_property_array_t *oauth_scope; //model
    struct config_node_property_string_t *oauth_config_provider_id; //model
    struct config_node_property_boolean_t *oauth_create_users; //model
    struct config_node_property_string_t *oauth_userid_property; //model
    struct config_node_property_boolean_t *force_strict_username_matching; //model
    struct config_node_property_boolean_t *oauth_encode_userids; //model
    struct config_node_property_boolean_t *oauth_hash_userids; //model
    struct config_node_property_string_t *oauth_call_back_url; //model
    struct config_node_property_boolean_t *oauth_access_token_persist; //model
    struct config_node_property_boolean_t *oauth_access_token_persist_cookie; //model
    struct config_node_property_boolean_t *oauth_csrf_state_protection; //model
    struct config_node_property_boolean_t *oauth_redirect_request_params; //model
    struct config_node_property_boolean_t *oauth_config_siblings_allow; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_auth_oauth_provider_properties_t;

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
);

void com_adobe_granite_auth_oauth_provider_properties_free(com_adobe_granite_auth_oauth_provider_properties_t *com_adobe_granite_auth_oauth_provider_properties);

com_adobe_granite_auth_oauth_provider_properties_t *com_adobe_granite_auth_oauth_provider_properties_parseFromJSON(cJSON *com_adobe_granite_auth_oauth_provider_propertiesJSON);

cJSON *com_adobe_granite_auth_oauth_provider_properties_convertToJSON(com_adobe_granite_auth_oauth_provider_properties_t *com_adobe_granite_auth_oauth_provider_properties);

#endif /* _com_adobe_granite_auth_oauth_provider_properties_H_ */

