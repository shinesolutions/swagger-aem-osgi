/*
 * com_adobe_granite_threaddump_thread_dump_collector_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_threaddump_thread_dump_collector_properties_H_
#define _com_adobe_granite_threaddump_thread_dump_collector_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_threaddump_thread_dump_collector_properties_t com_adobe_granite_threaddump_thread_dump_collector_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_granite_threaddump_thread_dump_collector_properties_t {
    struct config_node_property_integer_t *scheduler_period; //model
    struct config_node_property_drop_down_t *scheduler_run_on; //model
    struct config_node_property_boolean_t *granite_threaddump_enabled; //model
    struct config_node_property_integer_t *granite_threaddump_dumps_per_file; //model
    struct config_node_property_boolean_t *granite_threaddump_enable_gzip_compression; //model
    struct config_node_property_boolean_t *granite_threaddump_enable_directories_compression; //model
    struct config_node_property_boolean_t *granite_threaddump_enable_j_stack; //model
    struct config_node_property_integer_t *granite_threaddump_max_backup_days; //model
    struct config_node_property_string_t *granite_threaddump_backup_clean_trigger; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_threaddump_thread_dump_collector_properties_t;

__attribute__((deprecated)) com_adobe_granite_threaddump_thread_dump_collector_properties_t *com_adobe_granite_threaddump_thread_dump_collector_properties_create(
    config_node_property_integer_t *scheduler_period,
    config_node_property_drop_down_t *scheduler_run_on,
    config_node_property_boolean_t *granite_threaddump_enabled,
    config_node_property_integer_t *granite_threaddump_dumps_per_file,
    config_node_property_boolean_t *granite_threaddump_enable_gzip_compression,
    config_node_property_boolean_t *granite_threaddump_enable_directories_compression,
    config_node_property_boolean_t *granite_threaddump_enable_j_stack,
    config_node_property_integer_t *granite_threaddump_max_backup_days,
    config_node_property_string_t *granite_threaddump_backup_clean_trigger
);

void com_adobe_granite_threaddump_thread_dump_collector_properties_free(com_adobe_granite_threaddump_thread_dump_collector_properties_t *com_adobe_granite_threaddump_thread_dump_collector_properties);

com_adobe_granite_threaddump_thread_dump_collector_properties_t *com_adobe_granite_threaddump_thread_dump_collector_properties_parseFromJSON(cJSON *com_adobe_granite_threaddump_thread_dump_collector_propertiesJSON);

cJSON *com_adobe_granite_threaddump_thread_dump_collector_properties_convertToJSON(com_adobe_granite_threaddump_thread_dump_collector_properties_t *com_adobe_granite_threaddump_thread_dump_collector_properties);

#endif /* _com_adobe_granite_threaddump_thread_dump_collector_properties_H_ */

