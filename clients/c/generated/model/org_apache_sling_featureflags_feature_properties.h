/*
 * org_apache_sling_featureflags_feature_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_featureflags_feature_properties_H_
#define _org_apache_sling_featureflags_feature_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_featureflags_feature_properties_t org_apache_sling_featureflags_feature_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_featureflags_feature_properties_t {
    struct config_node_property_string_t *name; //model
    struct config_node_property_string_t *description; //model
    struct config_node_property_boolean_t *enabled; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_featureflags_feature_properties_t;

__attribute__((deprecated)) org_apache_sling_featureflags_feature_properties_t *org_apache_sling_featureflags_feature_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *description,
    config_node_property_boolean_t *enabled
);

void org_apache_sling_featureflags_feature_properties_free(org_apache_sling_featureflags_feature_properties_t *org_apache_sling_featureflags_feature_properties);

org_apache_sling_featureflags_feature_properties_t *org_apache_sling_featureflags_feature_properties_parseFromJSON(cJSON *org_apache_sling_featureflags_feature_propertiesJSON);

cJSON *org_apache_sling_featureflags_feature_properties_convertToJSON(org_apache_sling_featureflags_feature_properties_t *org_apache_sling_featureflags_feature_properties);

#endif /* _org_apache_sling_featureflags_feature_properties_H_ */

