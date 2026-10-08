/*
 * com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_H_
#define _com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t {
    struct config_node_property_string_t *event_filter; //model
    struct config_node_property_integer_t *min_thread_pool_size; //model
    struct config_node_property_integer_t *max_thread_pool_size; //model
    struct config_node_property_boolean_t *cq_wcm_workflow_terminate_on_activate; //model
    struct config_node_property_array_t *cq_wcm_worklfow_terminate_exclusion_list; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t;

__attribute__((deprecated)) com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t *com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_create(
    config_node_property_string_t *event_filter,
    config_node_property_integer_t *min_thread_pool_size,
    config_node_property_integer_t *max_thread_pool_size,
    config_node_property_boolean_t *cq_wcm_workflow_terminate_on_activate,
    config_node_property_array_t *cq_wcm_worklfow_terminate_exclusion_list
);

void com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_free(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t *com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties);

com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t *com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_propertiesJSON);

cJSON *com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_convertToJSON(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t *com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties);

#endif /* _com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_H_ */

