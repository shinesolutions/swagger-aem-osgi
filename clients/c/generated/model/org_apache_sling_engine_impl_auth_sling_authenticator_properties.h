/*
 * org_apache_sling_engine_impl_auth_sling_authenticator_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_engine_impl_auth_sling_authenticator_properties_H_
#define _org_apache_sling_engine_impl_auth_sling_authenticator_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_engine_impl_auth_sling_authenticator_properties_t org_apache_sling_engine_impl_auth_sling_authenticator_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_engine_impl_auth_sling_authenticator_properties_t {
    struct config_node_property_string_t *osgi_http_whiteboard_context_select; //model
    struct config_node_property_string_t *osgi_http_whiteboard_listener; //model
    struct config_node_property_string_t *auth_sudo_cookie; //model
    struct config_node_property_string_t *auth_sudo_parameter; //model
    struct config_node_property_boolean_t *auth_annonymous; //model
    struct config_node_property_array_t *sling_auth_requirements; //model
    struct config_node_property_string_t *sling_auth_anonymous_user; //model
    struct config_node_property_string_t *sling_auth_anonymous_password; //model
    struct config_node_property_drop_down_t *auth_http; //model
    struct config_node_property_string_t *auth_http_realm; //model
    struct config_node_property_array_t *auth_uri_suffix; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_engine_impl_auth_sling_authenticator_properties_t;

__attribute__((deprecated)) org_apache_sling_engine_impl_auth_sling_authenticator_properties_t *org_apache_sling_engine_impl_auth_sling_authenticator_properties_create(
    config_node_property_string_t *osgi_http_whiteboard_context_select,
    config_node_property_string_t *osgi_http_whiteboard_listener,
    config_node_property_string_t *auth_sudo_cookie,
    config_node_property_string_t *auth_sudo_parameter,
    config_node_property_boolean_t *auth_annonymous,
    config_node_property_array_t *sling_auth_requirements,
    config_node_property_string_t *sling_auth_anonymous_user,
    config_node_property_string_t *sling_auth_anonymous_password,
    config_node_property_drop_down_t *auth_http,
    config_node_property_string_t *auth_http_realm,
    config_node_property_array_t *auth_uri_suffix
);

void org_apache_sling_engine_impl_auth_sling_authenticator_properties_free(org_apache_sling_engine_impl_auth_sling_authenticator_properties_t *org_apache_sling_engine_impl_auth_sling_authenticator_properties);

org_apache_sling_engine_impl_auth_sling_authenticator_properties_t *org_apache_sling_engine_impl_auth_sling_authenticator_properties_parseFromJSON(cJSON *org_apache_sling_engine_impl_auth_sling_authenticator_propertiesJSON);

cJSON *org_apache_sling_engine_impl_auth_sling_authenticator_properties_convertToJSON(org_apache_sling_engine_impl_auth_sling_authenticator_properties_t *org_apache_sling_engine_impl_auth_sling_authenticator_properties);

#endif /* _org_apache_sling_engine_impl_auth_sling_authenticator_properties_H_ */

