/*
 * com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties.h
 *
 * 
 */

#ifndef _com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_H_
#define _com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_float.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t {
    struct config_node_property_string_t *jmx_objectname; //model
    struct config_node_property_boolean_t *property_measure_enabled; //model
    struct config_node_property_string_t *property_name; //model
    struct config_node_property_integer_t *property_max_wait_ms; //model
    struct config_node_property_float_t *property_max_rate; //model
    struct config_node_property_boolean_t *fulltext_measure_enabled; //model
    struct config_node_property_string_t *fulltext_name; //model
    struct config_node_property_integer_t *fulltext_max_wait_ms; //model
    struct config_node_property_float_t *fulltext_max_rate; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t;

__attribute__((deprecated)) com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t *com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_create(
    config_node_property_string_t *jmx_objectname,
    config_node_property_boolean_t *property_measure_enabled,
    config_node_property_string_t *property_name,
    config_node_property_integer_t *property_max_wait_ms,
    config_node_property_float_t *property_max_rate,
    config_node_property_boolean_t *fulltext_measure_enabled,
    config_node_property_string_t *fulltext_name,
    config_node_property_integer_t *fulltext_max_wait_ms,
    config_node_property_float_t *fulltext_max_rate
);

void com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_free(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t *com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties);

com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t *com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propertiesJSON);

cJSON *com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t *com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties);

#endif /* _com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_H_ */

