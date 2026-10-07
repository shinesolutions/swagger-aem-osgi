/*
 * com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_H_
#define _com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t {
    struct config_node_property_string_t *link_expired_prefix; //model
    struct config_node_property_boolean_t *link_expired_remove; //model
    struct config_node_property_string_t *link_expired_suffix; //model
    struct config_node_property_string_t *link_invalid_prefix; //model
    struct config_node_property_boolean_t *link_invalid_remove; //model
    struct config_node_property_string_t *link_invalid_suffix; //model
    struct config_node_property_string_t *link_predated_prefix; //model
    struct config_node_property_boolean_t *link_predated_remove; //model
    struct config_node_property_string_t *link_predated_suffix; //model
    struct config_node_property_array_t *link_wcmmodes; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t;

__attribute__((deprecated)) com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t *com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_create(
    config_node_property_string_t *link_expired_prefix,
    config_node_property_boolean_t *link_expired_remove,
    config_node_property_string_t *link_expired_suffix,
    config_node_property_string_t *link_invalid_prefix,
    config_node_property_boolean_t *link_invalid_remove,
    config_node_property_string_t *link_invalid_suffix,
    config_node_property_string_t *link_predated_prefix,
    config_node_property_boolean_t *link_predated_remove,
    config_node_property_string_t *link_predated_suffix,
    config_node_property_array_t *link_wcmmodes
);

void com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_free(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t *com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties);

com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t *com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_propertiesJSON);

cJSON *com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_convertToJSON(com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_t *com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties);

#endif /* _com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties_H_ */

