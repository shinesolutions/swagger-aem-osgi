/*
 * com_adobe_granite_auth_ims_impl_ims_provider_impl_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_H_
#define _com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t {
    struct config_node_property_string_t *oauth_provider_id; //model
    struct config_node_property_string_t *oauth_provider_ims_authorization_url; //model
    struct config_node_property_string_t *oauth_provider_ims_token_url; //model
    struct config_node_property_string_t *oauth_provider_ims_profile_url; //model
    struct config_node_property_array_t *oauth_provider_ims_extended_details_urls; //model
    struct config_node_property_string_t *oauth_provider_ims_validate_token_url; //model
    struct config_node_property_string_t *oauth_provider_ims_session_property; //model
    struct config_node_property_string_t *oauth_provider_ims_service_token_client_id; //model
    struct config_node_property_string_t *oauth_provider_ims_service_token_client_secret; //model
    struct config_node_property_string_t *oauth_provider_ims_service_token; //model
    struct config_node_property_string_t *ims_org_ref; //model
    struct config_node_property_array_t *ims_group_mapping; //model
    struct config_node_property_boolean_t *oauth_provider_ims_only_license_group; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t;

__attribute__((deprecated)) com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_create(
    config_node_property_string_t *oauth_provider_id,
    config_node_property_string_t *oauth_provider_ims_authorization_url,
    config_node_property_string_t *oauth_provider_ims_token_url,
    config_node_property_string_t *oauth_provider_ims_profile_url,
    config_node_property_array_t *oauth_provider_ims_extended_details_urls,
    config_node_property_string_t *oauth_provider_ims_validate_token_url,
    config_node_property_string_t *oauth_provider_ims_session_property,
    config_node_property_string_t *oauth_provider_ims_service_token_client_id,
    config_node_property_string_t *oauth_provider_ims_service_token_client_secret,
    config_node_property_string_t *oauth_provider_ims_service_token,
    config_node_property_string_t *ims_org_ref,
    config_node_property_array_t *ims_group_mapping,
    config_node_property_boolean_t *oauth_provider_ims_only_license_group
);

void com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_free(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_provider_impl_properties);

com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_parseFromJSON(cJSON *com_adobe_granite_auth_ims_impl_ims_provider_impl_propertiesJSON);

cJSON *com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_convertToJSON(com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_provider_impl_properties);

#endif /* _com_adobe_granite_auth_ims_impl_ims_provider_impl_properties_H_ */

