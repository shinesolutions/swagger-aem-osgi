/*
 * org_apache_aries_jmx_framework_state_config_properties.h
 *
 * 
 */

#ifndef _org_apache_aries_jmx_framework_state_config_properties_H_
#define _org_apache_aries_jmx_framework_state_config_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_aries_jmx_framework_state_config_properties_t org_apache_aries_jmx_framework_state_config_properties_t;

#include "config_node_property_boolean.h"



typedef struct org_apache_aries_jmx_framework_state_config_properties_t {
    struct config_node_property_boolean_t *attribute_change_notification_enabled; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_aries_jmx_framework_state_config_properties_t;

__attribute__((deprecated)) org_apache_aries_jmx_framework_state_config_properties_t *org_apache_aries_jmx_framework_state_config_properties_create(
    config_node_property_boolean_t *attribute_change_notification_enabled
);

void org_apache_aries_jmx_framework_state_config_properties_free(org_apache_aries_jmx_framework_state_config_properties_t *org_apache_aries_jmx_framework_state_config_properties);

org_apache_aries_jmx_framework_state_config_properties_t *org_apache_aries_jmx_framework_state_config_properties_parseFromJSON(cJSON *org_apache_aries_jmx_framework_state_config_propertiesJSON);

cJSON *org_apache_aries_jmx_framework_state_config_properties_convertToJSON(org_apache_aries_jmx_framework_state_config_properties_t *org_apache_aries_jmx_framework_state_config_properties);

#endif /* _org_apache_aries_jmx_framework_state_config_properties_H_ */

