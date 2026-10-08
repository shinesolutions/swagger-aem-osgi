/*
 * org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties.h
 *
 * 
 */

#ifndef _org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_H_
#define _org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t {
    struct config_node_property_string_t *path_desc_field; //model
    struct config_node_property_string_t *path_child_field; //model
    struct config_node_property_string_t *path_parent_field; //model
    struct config_node_property_string_t *path_exact_field; //model
    struct config_node_property_string_t *catch_all_field; //model
    struct config_node_property_string_t *collapsed_path_field; //model
    struct config_node_property_string_t *path_depth_field; //model
    struct config_node_property_drop_down_t *commit_policy; //model
    struct config_node_property_integer_t *rows; //model
    struct config_node_property_boolean_t *path_restrictions; //model
    struct config_node_property_boolean_t *property_restrictions; //model
    struct config_node_property_boolean_t *primarytypes_restrictions; //model
    struct config_node_property_array_t *ignored_properties; //model
    struct config_node_property_array_t *used_properties; //model
    struct config_node_property_array_t *type_mappings; //model
    struct config_node_property_array_t *property_mappings; //model
    struct config_node_property_boolean_t *collapse_jcrcontent_nodes; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t;

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_create(
    config_node_property_string_t *path_desc_field,
    config_node_property_string_t *path_child_field,
    config_node_property_string_t *path_parent_field,
    config_node_property_string_t *path_exact_field,
    config_node_property_string_t *catch_all_field,
    config_node_property_string_t *collapsed_path_field,
    config_node_property_string_t *path_depth_field,
    config_node_property_drop_down_t *commit_policy,
    config_node_property_integer_t *rows,
    config_node_property_boolean_t *path_restrictions,
    config_node_property_boolean_t *property_restrictions,
    config_node_property_boolean_t *primarytypes_restrictions,
    config_node_property_array_t *ignored_properties,
    config_node_property_array_t *used_properties,
    config_node_property_array_t *type_mappings,
    config_node_property_array_t *property_mappings,
    config_node_property_boolean_t *collapse_jcrcontent_nodes
);

void org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties);

org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_propertiesJSON);

cJSON *org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties);

#endif /* _org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_H_ */

