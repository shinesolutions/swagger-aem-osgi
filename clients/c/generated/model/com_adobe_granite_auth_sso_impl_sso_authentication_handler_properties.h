/*
 * com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_H_
#define _com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t {
    struct config_node_property_string_t *path; //model
    struct config_node_property_integer_t *service_ranking; //model
    struct config_node_property_string_t *jaas_control_flag; //model
    struct config_node_property_string_t *jaas_realm_name; //model
    struct config_node_property_integer_t *jaas_ranking; //model
    struct config_node_property_array_t *headers; //model
    struct config_node_property_array_t *cookies; //model
    struct config_node_property_array_t *parameters; //model
    struct config_node_property_array_t *usermap; //model
    struct config_node_property_string_t *format; //model
    struct config_node_property_string_t *trusted_credentials_attribute; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t;

__attribute__((deprecated)) com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t *com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_create(
    config_node_property_string_t *path,
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *jaas_control_flag,
    config_node_property_string_t *jaas_realm_name,
    config_node_property_integer_t *jaas_ranking,
    config_node_property_array_t *headers,
    config_node_property_array_t *cookies,
    config_node_property_array_t *parameters,
    config_node_property_array_t *usermap,
    config_node_property_string_t *format,
    config_node_property_string_t *trusted_credentials_attribute
);

void com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_free(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t *com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties);

com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t *com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_parseFromJSON(cJSON *com_adobe_granite_auth_sso_impl_sso_authentication_handler_propertiesJSON);

cJSON *com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_convertToJSON(com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_t *com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties);

#endif /* _com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties_H_ */

