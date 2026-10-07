/*
 * com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_H_
#define _com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t;

#include "config_node_property_array.h"



typedef struct com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t {
    struct config_node_property_array_t *dam_cfm_resource_types; //model
    struct config_node_property_array_t *dam_cfm_reference_properties; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t;

__attribute__((deprecated)) com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_create(
    config_node_property_array_t *dam_cfm_resource_types,
    config_node_property_array_t *dam_cfm_reference_properties
);

void com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_free(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties);

com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_parseFromJSON(cJSON *com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_propertiesJSON);

cJSON *com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_convertToJSON(com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_t *com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties);

#endif /* _com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties_H_ */

