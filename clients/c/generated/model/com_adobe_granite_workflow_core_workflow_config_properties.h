/*
 * com_adobe_granite_workflow_core_workflow_config_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_workflow_core_workflow_config_properties_H_
#define _com_adobe_granite_workflow_core_workflow_config_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_workflow_core_workflow_config_properties_t com_adobe_granite_workflow_core_workflow_config_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"



typedef struct com_adobe_granite_workflow_core_workflow_config_properties_t {
    struct config_node_property_array_t *cq_workflow_config_workflow_packages_root_path; //model
    struct config_node_property_boolean_t *cq_workflow_config_workflow_process_legacy_mode; //model
    struct config_node_property_boolean_t *cq_workflow_config_allow_locking; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_workflow_core_workflow_config_properties_t;

__attribute__((deprecated)) com_adobe_granite_workflow_core_workflow_config_properties_t *com_adobe_granite_workflow_core_workflow_config_properties_create(
    config_node_property_array_t *cq_workflow_config_workflow_packages_root_path,
    config_node_property_boolean_t *cq_workflow_config_workflow_process_legacy_mode,
    config_node_property_boolean_t *cq_workflow_config_allow_locking
);

void com_adobe_granite_workflow_core_workflow_config_properties_free(com_adobe_granite_workflow_core_workflow_config_properties_t *com_adobe_granite_workflow_core_workflow_config_properties);

com_adobe_granite_workflow_core_workflow_config_properties_t *com_adobe_granite_workflow_core_workflow_config_properties_parseFromJSON(cJSON *com_adobe_granite_workflow_core_workflow_config_propertiesJSON);

cJSON *com_adobe_granite_workflow_core_workflow_config_properties_convertToJSON(com_adobe_granite_workflow_core_workflow_config_properties_t *com_adobe_granite_workflow_core_workflow_config_properties);

#endif /* _com_adobe_granite_workflow_core_workflow_config_properties_H_ */

