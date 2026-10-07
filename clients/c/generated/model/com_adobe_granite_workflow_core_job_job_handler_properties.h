/*
 * com_adobe_granite_workflow_core_job_job_handler_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_workflow_core_job_job_handler_properties_H_
#define _com_adobe_granite_workflow_core_job_job_handler_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_workflow_core_job_job_handler_properties_t com_adobe_granite_workflow_core_job_job_handler_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"



typedef struct com_adobe_granite_workflow_core_job_job_handler_properties_t {
    struct config_node_property_array_t *job_topics; //model
    struct config_node_property_boolean_t *allow_self_process_termination; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_workflow_core_job_job_handler_properties_t;

__attribute__((deprecated)) com_adobe_granite_workflow_core_job_job_handler_properties_t *com_adobe_granite_workflow_core_job_job_handler_properties_create(
    config_node_property_array_t *job_topics,
    config_node_property_boolean_t *allow_self_process_termination
);

void com_adobe_granite_workflow_core_job_job_handler_properties_free(com_adobe_granite_workflow_core_job_job_handler_properties_t *com_adobe_granite_workflow_core_job_job_handler_properties);

com_adobe_granite_workflow_core_job_job_handler_properties_t *com_adobe_granite_workflow_core_job_job_handler_properties_parseFromJSON(cJSON *com_adobe_granite_workflow_core_job_job_handler_propertiesJSON);

cJSON *com_adobe_granite_workflow_core_job_job_handler_properties_convertToJSON(com_adobe_granite_workflow_core_job_job_handler_properties_t *com_adobe_granite_workflow_core_job_job_handler_properties);

#endif /* _com_adobe_granite_workflow_core_job_job_handler_properties_H_ */

