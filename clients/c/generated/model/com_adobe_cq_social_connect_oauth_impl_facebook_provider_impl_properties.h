/*
 * com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_H_
#define _com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_t com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_t {
    struct config_node_property_string_t *oauth_provider_id; //model
    struct config_node_property_string_t *oauth_cloud_config_root; //model
    struct config_node_property_string_t *provider_config_root; //model
    struct config_node_property_boolean_t *provider_config_create_tags_enabled; //model
    struct config_node_property_drop_down_t *provider_config_user_folder; //model
    struct config_node_property_boolean_t *provider_config_facebook_fetch_fields; //model
    struct config_node_property_array_t *provider_config_facebook_fields; //model
    struct config_node_property_boolean_t *provider_config_refresh_userdata_enabled; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_t;

__attribute__((deprecated)) com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_t *com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_create(
    config_node_property_string_t *oauth_provider_id,
    config_node_property_string_t *oauth_cloud_config_root,
    config_node_property_string_t *provider_config_root,
    config_node_property_boolean_t *provider_config_create_tags_enabled,
    config_node_property_drop_down_t *provider_config_user_folder,
    config_node_property_boolean_t *provider_config_facebook_fetch_fields,
    config_node_property_array_t *provider_config_facebook_fields,
    config_node_property_boolean_t *provider_config_refresh_userdata_enabled
);

void com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_free(com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_t *com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties);

com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_t *com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_parseFromJSON(cJSON *com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_propertiesJSON);

cJSON *com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_convertToJSON(com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_t *com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties);

#endif /* _com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties_H_ */

