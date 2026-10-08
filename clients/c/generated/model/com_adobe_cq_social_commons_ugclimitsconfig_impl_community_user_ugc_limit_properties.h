/*
 * com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_H_
#define _com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"



typedef struct com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t {
    struct config_node_property_boolean_t *enable; //model
    struct config_node_property_integer_t *ugc_limit; //model
    struct config_node_property_integer_t *ugc_limit_duration; //model
    struct config_node_property_array_t *domains; //model
    struct config_node_property_array_t *to_list; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t;

__attribute__((deprecated)) com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t *com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_create(
    config_node_property_boolean_t *enable,
    config_node_property_integer_t *ugc_limit,
    config_node_property_integer_t *ugc_limit_duration,
    config_node_property_array_t *domains,
    config_node_property_array_t *to_list
);

void com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_free(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t *com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties);

com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t *com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_parseFromJSON(cJSON *com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_propertiesJSON);

cJSON *com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_convertToJSON(com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_t *com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties);

#endif /* _com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties_H_ */

