/*
 * com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_H_
#define _com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t;

#include "config_node_property_string.h"



typedef struct com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t {
    struct config_node_property_string_t *dam_cfm_component_resource_type; //model
    struct config_node_property_string_t *dam_cfm_component_file_reference_prop; //model
    struct config_node_property_string_t *dam_cfm_component_elements_prop; //model
    struct config_node_property_string_t *dam_cfm_component_variation_prop; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t;

__attribute__((deprecated)) com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_create(
    config_node_property_string_t *dam_cfm_component_resource_type,
    config_node_property_string_t *dam_cfm_component_file_reference_prop,
    config_node_property_string_t *dam_cfm_component_elements_prop,
    config_node_property_string_t *dam_cfm_component_variation_prop
);

void com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_free(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties);

com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_parseFromJSON(cJSON *com_adobe_cq_dam_cfm_impl_component_component_config_impl_propertiesJSON);

cJSON *com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_convertToJSON(com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties);

#endif /* _com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties_H_ */

