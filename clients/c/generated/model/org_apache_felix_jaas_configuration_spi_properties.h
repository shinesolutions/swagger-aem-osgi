/*
 * org_apache_felix_jaas_configuration_spi_properties.h
 *
 * 
 */

#ifndef _org_apache_felix_jaas_configuration_spi_properties_H_
#define _org_apache_felix_jaas_configuration_spi_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_felix_jaas_configuration_spi_properties_t org_apache_felix_jaas_configuration_spi_properties_t;

#include "config_node_property_drop_down.h"
#include "config_node_property_string.h"



typedef struct org_apache_felix_jaas_configuration_spi_properties_t {
    struct config_node_property_string_t *jaas_default_realm_name; //model
    struct config_node_property_string_t *jaas_config_provider_name; //model
    struct config_node_property_drop_down_t *jaas_global_config_policy; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_felix_jaas_configuration_spi_properties_t;

__attribute__((deprecated)) org_apache_felix_jaas_configuration_spi_properties_t *org_apache_felix_jaas_configuration_spi_properties_create(
    config_node_property_string_t *jaas_default_realm_name,
    config_node_property_string_t *jaas_config_provider_name,
    config_node_property_drop_down_t *jaas_global_config_policy
);

void org_apache_felix_jaas_configuration_spi_properties_free(org_apache_felix_jaas_configuration_spi_properties_t *org_apache_felix_jaas_configuration_spi_properties);

org_apache_felix_jaas_configuration_spi_properties_t *org_apache_felix_jaas_configuration_spi_properties_parseFromJSON(cJSON *org_apache_felix_jaas_configuration_spi_propertiesJSON);

cJSON *org_apache_felix_jaas_configuration_spi_properties_convertToJSON(org_apache_felix_jaas_configuration_spi_properties_t *org_apache_felix_jaas_configuration_spi_properties);

#endif /* _org_apache_felix_jaas_configuration_spi_properties_H_ */

