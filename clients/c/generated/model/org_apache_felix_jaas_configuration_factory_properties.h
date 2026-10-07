/*
 * org_apache_felix_jaas_configuration_factory_properties.h
 *
 * 
 */

#ifndef _org_apache_felix_jaas_configuration_factory_properties_H_
#define _org_apache_felix_jaas_configuration_factory_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_felix_jaas_configuration_factory_properties_t org_apache_felix_jaas_configuration_factory_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_felix_jaas_configuration_factory_properties_t {
    struct config_node_property_drop_down_t *jaas_control_flag; //model
    struct config_node_property_integer_t *jaas_ranking; //model
    struct config_node_property_string_t *jaas_realm_name; //model
    struct config_node_property_string_t *jaas_classname; //model
    struct config_node_property_array_t *jaas_options; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_felix_jaas_configuration_factory_properties_t;

__attribute__((deprecated)) org_apache_felix_jaas_configuration_factory_properties_t *org_apache_felix_jaas_configuration_factory_properties_create(
    config_node_property_drop_down_t *jaas_control_flag,
    config_node_property_integer_t *jaas_ranking,
    config_node_property_string_t *jaas_realm_name,
    config_node_property_string_t *jaas_classname,
    config_node_property_array_t *jaas_options
);

void org_apache_felix_jaas_configuration_factory_properties_free(org_apache_felix_jaas_configuration_factory_properties_t *org_apache_felix_jaas_configuration_factory_properties);

org_apache_felix_jaas_configuration_factory_properties_t *org_apache_felix_jaas_configuration_factory_properties_parseFromJSON(cJSON *org_apache_felix_jaas_configuration_factory_propertiesJSON);

cJSON *org_apache_felix_jaas_configuration_factory_properties_convertToJSON(org_apache_felix_jaas_configuration_factory_properties_t *org_apache_felix_jaas_configuration_factory_properties);

#endif /* _org_apache_felix_jaas_configuration_factory_properties_H_ */

