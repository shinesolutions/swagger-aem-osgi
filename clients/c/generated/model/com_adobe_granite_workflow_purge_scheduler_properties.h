/*
 * com_adobe_granite_workflow_purge_scheduler_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_workflow_purge_scheduler_properties_H_
#define _com_adobe_granite_workflow_purge_scheduler_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_workflow_purge_scheduler_properties_t com_adobe_granite_workflow_purge_scheduler_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_granite_workflow_purge_scheduler_properties_t {
    struct config_node_property_string_t *scheduledpurge_name; //model
    struct config_node_property_drop_down_t *scheduledpurge_workflow_status; //model
    struct config_node_property_array_t *scheduledpurge_model_ids; //model
    struct config_node_property_integer_t *scheduledpurge_daysold; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_workflow_purge_scheduler_properties_t;

__attribute__((deprecated)) com_adobe_granite_workflow_purge_scheduler_properties_t *com_adobe_granite_workflow_purge_scheduler_properties_create(
    config_node_property_string_t *scheduledpurge_name,
    config_node_property_drop_down_t *scheduledpurge_workflow_status,
    config_node_property_array_t *scheduledpurge_model_ids,
    config_node_property_integer_t *scheduledpurge_daysold
);

void com_adobe_granite_workflow_purge_scheduler_properties_free(com_adobe_granite_workflow_purge_scheduler_properties_t *com_adobe_granite_workflow_purge_scheduler_properties);

com_adobe_granite_workflow_purge_scheduler_properties_t *com_adobe_granite_workflow_purge_scheduler_properties_parseFromJSON(cJSON *com_adobe_granite_workflow_purge_scheduler_propertiesJSON);

cJSON *com_adobe_granite_workflow_purge_scheduler_properties_convertToJSON(com_adobe_granite_workflow_purge_scheduler_properties_t *com_adobe_granite_workflow_purge_scheduler_properties);

#endif /* _com_adobe_granite_workflow_purge_scheduler_properties_H_ */

