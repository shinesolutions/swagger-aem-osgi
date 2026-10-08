/*
 * org_apache_sling_datasource_jndi_data_source_factory_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_datasource_jndi_data_source_factory_properties_H_
#define _org_apache_sling_datasource_jndi_data_source_factory_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_datasource_jndi_data_source_factory_properties_t org_apache_sling_datasource_jndi_data_source_factory_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_datasource_jndi_data_source_factory_properties_t {
    struct config_node_property_string_t *datasource_name; //model
    struct config_node_property_string_t *datasource_svc_prop_name; //model
    struct config_node_property_string_t *datasource_jndi_name; //model
    struct config_node_property_array_t *jndi_properties; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_datasource_jndi_data_source_factory_properties_t;

__attribute__((deprecated)) org_apache_sling_datasource_jndi_data_source_factory_properties_t *org_apache_sling_datasource_jndi_data_source_factory_properties_create(
    config_node_property_string_t *datasource_name,
    config_node_property_string_t *datasource_svc_prop_name,
    config_node_property_string_t *datasource_jndi_name,
    config_node_property_array_t *jndi_properties
);

void org_apache_sling_datasource_jndi_data_source_factory_properties_free(org_apache_sling_datasource_jndi_data_source_factory_properties_t *org_apache_sling_datasource_jndi_data_source_factory_properties);

org_apache_sling_datasource_jndi_data_source_factory_properties_t *org_apache_sling_datasource_jndi_data_source_factory_properties_parseFromJSON(cJSON *org_apache_sling_datasource_jndi_data_source_factory_propertiesJSON);

cJSON *org_apache_sling_datasource_jndi_data_source_factory_properties_convertToJSON(org_apache_sling_datasource_jndi_data_source_factory_properties_t *org_apache_sling_datasource_jndi_data_source_factory_properties);

#endif /* _org_apache_sling_datasource_jndi_data_source_factory_properties_H_ */

