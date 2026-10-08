/*
 * com_adobe_granite_auth_oauth_impl_granite_provider_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_auth_oauth_impl_granite_provider_properties_H_
#define _com_adobe_granite_auth_oauth_impl_granite_provider_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_auth_oauth_impl_granite_provider_properties_t com_adobe_granite_auth_oauth_impl_granite_provider_properties_t;

#include "config_node_property_string.h"



typedef struct com_adobe_granite_auth_oauth_impl_granite_provider_properties_t {
    struct config_node_property_string_t *oauth_provider_id; //model
    struct config_node_property_string_t *oauth_provider_granite_authorization_url; //model
    struct config_node_property_string_t *oauth_provider_granite_token_url; //model
    struct config_node_property_string_t *oauth_provider_granite_profile_url; //model
    struct config_node_property_string_t *oauth_provider_granite_extended_details_urls; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_auth_oauth_impl_granite_provider_properties_t;

__attribute__((deprecated)) com_adobe_granite_auth_oauth_impl_granite_provider_properties_t *com_adobe_granite_auth_oauth_impl_granite_provider_properties_create(
    config_node_property_string_t *oauth_provider_id,
    config_node_property_string_t *oauth_provider_granite_authorization_url,
    config_node_property_string_t *oauth_provider_granite_token_url,
    config_node_property_string_t *oauth_provider_granite_profile_url,
    config_node_property_string_t *oauth_provider_granite_extended_details_urls
);

void com_adobe_granite_auth_oauth_impl_granite_provider_properties_free(com_adobe_granite_auth_oauth_impl_granite_provider_properties_t *com_adobe_granite_auth_oauth_impl_granite_provider_properties);

com_adobe_granite_auth_oauth_impl_granite_provider_properties_t *com_adobe_granite_auth_oauth_impl_granite_provider_properties_parseFromJSON(cJSON *com_adobe_granite_auth_oauth_impl_granite_provider_propertiesJSON);

cJSON *com_adobe_granite_auth_oauth_impl_granite_provider_properties_convertToJSON(com_adobe_granite_auth_oauth_impl_granite_provider_properties_t *com_adobe_granite_auth_oauth_impl_granite_provider_properties);

#endif /* _com_adobe_granite_auth_oauth_impl_granite_provider_properties_H_ */

