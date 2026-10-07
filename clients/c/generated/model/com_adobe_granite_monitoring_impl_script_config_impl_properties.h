/*
 * com_adobe_granite_monitoring_impl_script_config_impl_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_monitoring_impl_script_config_impl_properties_H_
#define _com_adobe_granite_monitoring_impl_script_config_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_monitoring_impl_script_config_impl_properties_t com_adobe_granite_monitoring_impl_script_config_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_granite_monitoring_impl_script_config_impl_properties_t {
    struct config_node_property_string_t *script_filename; //model
    struct config_node_property_string_t *script_display; //model
    struct config_node_property_string_t *script_path; //model
    struct config_node_property_array_t *script_platform; //model
    struct config_node_property_integer_t *interval; //model
    struct config_node_property_string_t *jmxdomain; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_monitoring_impl_script_config_impl_properties_t;

__attribute__((deprecated)) com_adobe_granite_monitoring_impl_script_config_impl_properties_t *com_adobe_granite_monitoring_impl_script_config_impl_properties_create(
    config_node_property_string_t *script_filename,
    config_node_property_string_t *script_display,
    config_node_property_string_t *script_path,
    config_node_property_array_t *script_platform,
    config_node_property_integer_t *interval,
    config_node_property_string_t *jmxdomain
);

void com_adobe_granite_monitoring_impl_script_config_impl_properties_free(com_adobe_granite_monitoring_impl_script_config_impl_properties_t *com_adobe_granite_monitoring_impl_script_config_impl_properties);

com_adobe_granite_monitoring_impl_script_config_impl_properties_t *com_adobe_granite_monitoring_impl_script_config_impl_properties_parseFromJSON(cJSON *com_adobe_granite_monitoring_impl_script_config_impl_propertiesJSON);

cJSON *com_adobe_granite_monitoring_impl_script_config_impl_properties_convertToJSON(com_adobe_granite_monitoring_impl_script_config_impl_properties_t *com_adobe_granite_monitoring_impl_script_config_impl_properties);

#endif /* _com_adobe_granite_monitoring_impl_script_config_impl_properties_H_ */

