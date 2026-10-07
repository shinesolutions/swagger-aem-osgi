/*
 * com_day_cq_wcm_undo_undo_config_properties.h
 *
 * 
 */

#ifndef _com_day_cq_wcm_undo_undo_config_properties_H_
#define _com_day_cq_wcm_undo_undo_config_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_wcm_undo_undo_config_properties_t com_day_cq_wcm_undo_undo_config_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_wcm_undo_undo_config_properties_t {
    struct config_node_property_boolean_t *cq_wcm_undo_enabled; //model
    struct config_node_property_string_t *cq_wcm_undo_path; //model
    struct config_node_property_integer_t *cq_wcm_undo_validity; //model
    struct config_node_property_integer_t *cq_wcm_undo_steps; //model
    struct config_node_property_string_t *cq_wcm_undo_persistence; //model
    struct config_node_property_boolean_t *cq_wcm_undo_persistence_mode; //model
    struct config_node_property_string_t *cq_wcm_undo_markermode; //model
    struct config_node_property_array_t *cq_wcm_undo_whitelist; //model
    struct config_node_property_array_t *cq_wcm_undo_blacklist; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_wcm_undo_undo_config_properties_t;

__attribute__((deprecated)) com_day_cq_wcm_undo_undo_config_properties_t *com_day_cq_wcm_undo_undo_config_properties_create(
    config_node_property_boolean_t *cq_wcm_undo_enabled,
    config_node_property_string_t *cq_wcm_undo_path,
    config_node_property_integer_t *cq_wcm_undo_validity,
    config_node_property_integer_t *cq_wcm_undo_steps,
    config_node_property_string_t *cq_wcm_undo_persistence,
    config_node_property_boolean_t *cq_wcm_undo_persistence_mode,
    config_node_property_string_t *cq_wcm_undo_markermode,
    config_node_property_array_t *cq_wcm_undo_whitelist,
    config_node_property_array_t *cq_wcm_undo_blacklist
);

void com_day_cq_wcm_undo_undo_config_properties_free(com_day_cq_wcm_undo_undo_config_properties_t *com_day_cq_wcm_undo_undo_config_properties);

com_day_cq_wcm_undo_undo_config_properties_t *com_day_cq_wcm_undo_undo_config_properties_parseFromJSON(cJSON *com_day_cq_wcm_undo_undo_config_propertiesJSON);

cJSON *com_day_cq_wcm_undo_undo_config_properties_convertToJSON(com_day_cq_wcm_undo_undo_config_properties_t *com_day_cq_wcm_undo_undo_config_properties);

#endif /* _com_day_cq_wcm_undo_undo_config_properties_H_ */

