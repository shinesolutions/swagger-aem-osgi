/*
 * org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties.h
 *
 * 
 */

#ifndef _org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_H_
#define _org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t {
    struct config_node_property_boolean_t *org_apache_sling_installer_configuration_persist; //model
    struct config_node_property_drop_down_t *mode; //model
    struct config_node_property_integer_t *port; //model
    struct config_node_property_string_t *primary_host; //model
    struct config_node_property_integer_t *interval; //model
    struct config_node_property_array_t *primary_allowed_client_ip_ranges; //model
    struct config_node_property_boolean_t *secure; //model
    struct config_node_property_integer_t *standby_readtimeout; //model
    struct config_node_property_boolean_t *standby_autoclean; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t;

__attribute__((deprecated)) org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t *org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_create(
    config_node_property_boolean_t *org_apache_sling_installer_configuration_persist,
    config_node_property_drop_down_t *mode,
    config_node_property_integer_t *port,
    config_node_property_string_t *primary_host,
    config_node_property_integer_t *interval,
    config_node_property_array_t *primary_allowed_client_ip_ranges,
    config_node_property_boolean_t *secure,
    config_node_property_integer_t *standby_readtimeout,
    config_node_property_boolean_t *standby_autoclean
);

void org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_free(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t *org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties);

org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t *org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_propertiesJSON);

cJSON *org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_convertToJSON(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t *org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties);

#endif /* _org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_H_ */

