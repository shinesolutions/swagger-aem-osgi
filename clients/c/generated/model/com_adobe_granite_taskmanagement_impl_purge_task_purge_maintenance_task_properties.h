/*
 * com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_H_
#define _com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"



typedef struct com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t {
    struct config_node_property_boolean_t *purge_completed; //model
    struct config_node_property_integer_t *completed_age; //model
    struct config_node_property_boolean_t *purge_active; //model
    struct config_node_property_integer_t *active_age; //model
    struct config_node_property_integer_t *save_threshold; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t;

__attribute__((deprecated)) com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t *com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_create(
    config_node_property_boolean_t *purge_completed,
    config_node_property_integer_t *completed_age,
    config_node_property_boolean_t *purge_active,
    config_node_property_integer_t *active_age,
    config_node_property_integer_t *save_threshold
);

void com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_free(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t *com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties);

com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t *com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_parseFromJSON(cJSON *com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_propertiesJSON);

cJSON *com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_convertToJSON(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t *com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties);

#endif /* _com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_H_ */

