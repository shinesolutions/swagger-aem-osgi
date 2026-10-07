/*
 * com_adobe_granite_auth_saml_saml_authentication_handler_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_auth_saml_saml_authentication_handler_properties_H_
#define _com_adobe_granite_auth_saml_saml_authentication_handler_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_auth_saml_saml_authentication_handler_properties_t com_adobe_granite_auth_saml_saml_authentication_handler_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_granite_auth_saml_saml_authentication_handler_properties_t {
    struct config_node_property_array_t *path; //model
    struct config_node_property_integer_t *service_ranking; //model
    struct config_node_property_string_t *idp_url; //model
    struct config_node_property_string_t *idp_cert_alias; //model
    struct config_node_property_boolean_t *idp_http_redirect; //model
    struct config_node_property_string_t *service_provider_entity_id; //model
    struct config_node_property_string_t *assertion_consumer_service_url; //model
    struct config_node_property_string_t *sp_private_key_alias; //model
    struct config_node_property_string_t *key_store_password; //model
    struct config_node_property_string_t *default_redirect_url; //model
    struct config_node_property_string_t *user_id_attribute; //model
    struct config_node_property_boolean_t *use_encryption; //model
    struct config_node_property_boolean_t *create_user; //model
    struct config_node_property_string_t *user_intermediate_path; //model
    struct config_node_property_boolean_t *add_group_memberships; //model
    struct config_node_property_string_t *group_membership_attribute; //model
    struct config_node_property_array_t *default_groups; //model
    struct config_node_property_string_t *name_id_format; //model
    struct config_node_property_array_t *synchronize_attributes; //model
    struct config_node_property_boolean_t *handle_logout; //model
    struct config_node_property_string_t *logout_url; //model
    struct config_node_property_integer_t *clock_tolerance; //model
    struct config_node_property_string_t *digest_method; //model
    struct config_node_property_string_t *signature_method; //model
    struct config_node_property_drop_down_t *identity_sync_type; //model
    struct config_node_property_string_t *idp_identifier; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_auth_saml_saml_authentication_handler_properties_t;

__attribute__((deprecated)) com_adobe_granite_auth_saml_saml_authentication_handler_properties_t *com_adobe_granite_auth_saml_saml_authentication_handler_properties_create(
    config_node_property_array_t *path,
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *idp_url,
    config_node_property_string_t *idp_cert_alias,
    config_node_property_boolean_t *idp_http_redirect,
    config_node_property_string_t *service_provider_entity_id,
    config_node_property_string_t *assertion_consumer_service_url,
    config_node_property_string_t *sp_private_key_alias,
    config_node_property_string_t *key_store_password,
    config_node_property_string_t *default_redirect_url,
    config_node_property_string_t *user_id_attribute,
    config_node_property_boolean_t *use_encryption,
    config_node_property_boolean_t *create_user,
    config_node_property_string_t *user_intermediate_path,
    config_node_property_boolean_t *add_group_memberships,
    config_node_property_string_t *group_membership_attribute,
    config_node_property_array_t *default_groups,
    config_node_property_string_t *name_id_format,
    config_node_property_array_t *synchronize_attributes,
    config_node_property_boolean_t *handle_logout,
    config_node_property_string_t *logout_url,
    config_node_property_integer_t *clock_tolerance,
    config_node_property_string_t *digest_method,
    config_node_property_string_t *signature_method,
    config_node_property_drop_down_t *identity_sync_type,
    config_node_property_string_t *idp_identifier
);

void com_adobe_granite_auth_saml_saml_authentication_handler_properties_free(com_adobe_granite_auth_saml_saml_authentication_handler_properties_t *com_adobe_granite_auth_saml_saml_authentication_handler_properties);

com_adobe_granite_auth_saml_saml_authentication_handler_properties_t *com_adobe_granite_auth_saml_saml_authentication_handler_properties_parseFromJSON(cJSON *com_adobe_granite_auth_saml_saml_authentication_handler_propertiesJSON);

cJSON *com_adobe_granite_auth_saml_saml_authentication_handler_properties_convertToJSON(com_adobe_granite_auth_saml_saml_authentication_handler_properties_t *com_adobe_granite_auth_saml_saml_authentication_handler_properties);

#endif /* _com_adobe_granite_auth_saml_saml_authentication_handler_properties_H_ */

