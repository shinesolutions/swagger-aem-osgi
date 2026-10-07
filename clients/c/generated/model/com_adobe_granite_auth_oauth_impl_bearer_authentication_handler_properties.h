/*
 * com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_H_
#define _com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t {
    struct config_node_property_string_t *path; //model
    struct config_node_property_array_t *oauth_client_ids_allowed; //model
    struct config_node_property_boolean_t *auth_bearer_sync_ims; //model
    struct config_node_property_string_t *auth_token_request_parameter; //model
    struct config_node_property_string_t *oauth_bearer_configid; //model
    struct config_node_property_boolean_t *oauth_jwt_support; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t;

__attribute__((deprecated)) com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t *com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_create(
    config_node_property_string_t *path,
    config_node_property_array_t *oauth_client_ids_allowed,
    config_node_property_boolean_t *auth_bearer_sync_ims,
    config_node_property_string_t *auth_token_request_parameter,
    config_node_property_string_t *oauth_bearer_configid,
    config_node_property_boolean_t *oauth_jwt_support
);

void com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_free(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t *com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties);

com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t *com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_parseFromJSON(cJSON *com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_propertiesJSON);

cJSON *com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_convertToJSON(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t *com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties);

#endif /* _com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_H_ */

