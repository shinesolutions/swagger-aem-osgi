/*
 * com_adobe_granite_auth_oauth_accesstoken_provider_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_auth_oauth_accesstoken_provider_properties_H_
#define _com_adobe_granite_auth_oauth_accesstoken_provider_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_auth_oauth_accesstoken_provider_properties_t com_adobe_granite_auth_oauth_accesstoken_provider_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_granite_auth_oauth_accesstoken_provider_properties_t {
    struct config_node_property_string_t *name; //model
    struct config_node_property_string_t *auth_token_provider_title; //model
    struct config_node_property_array_t *auth_token_provider_default_claims; //model
    struct config_node_property_string_t *auth_token_provider_endpoint; //model
    struct config_node_property_string_t *auth_access_token_request; //model
    struct config_node_property_string_t *auth_token_provider_keypair_alias; //model
    struct config_node_property_integer_t *auth_token_provider_conn_timeout; //model
    struct config_node_property_integer_t *auth_token_provider_so_timeout; //model
    struct config_node_property_string_t *auth_token_provider_client_id; //model
    struct config_node_property_string_t *auth_token_provider_scope; //model
    struct config_node_property_boolean_t *auth_token_provider_reuse_access_token; //model
    struct config_node_property_boolean_t *auth_token_provider_relaxed_ssl; //model
    struct config_node_property_string_t *token_request_customizer_type; //model
    struct config_node_property_string_t *auth_token_validator_type; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_auth_oauth_accesstoken_provider_properties_t;

__attribute__((deprecated)) com_adobe_granite_auth_oauth_accesstoken_provider_properties_t *com_adobe_granite_auth_oauth_accesstoken_provider_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *auth_token_provider_title,
    config_node_property_array_t *auth_token_provider_default_claims,
    config_node_property_string_t *auth_token_provider_endpoint,
    config_node_property_string_t *auth_access_token_request,
    config_node_property_string_t *auth_token_provider_keypair_alias,
    config_node_property_integer_t *auth_token_provider_conn_timeout,
    config_node_property_integer_t *auth_token_provider_so_timeout,
    config_node_property_string_t *auth_token_provider_client_id,
    config_node_property_string_t *auth_token_provider_scope,
    config_node_property_boolean_t *auth_token_provider_reuse_access_token,
    config_node_property_boolean_t *auth_token_provider_relaxed_ssl,
    config_node_property_string_t *token_request_customizer_type,
    config_node_property_string_t *auth_token_validator_type
);

void com_adobe_granite_auth_oauth_accesstoken_provider_properties_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties_t *com_adobe_granite_auth_oauth_accesstoken_provider_properties);

com_adobe_granite_auth_oauth_accesstoken_provider_properties_t *com_adobe_granite_auth_oauth_accesstoken_provider_properties_parseFromJSON(cJSON *com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON);

cJSON *com_adobe_granite_auth_oauth_accesstoken_provider_properties_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties_t *com_adobe_granite_auth_oauth_accesstoken_provider_properties);

#endif /* _com_adobe_granite_auth_oauth_accesstoken_provider_properties_H_ */

