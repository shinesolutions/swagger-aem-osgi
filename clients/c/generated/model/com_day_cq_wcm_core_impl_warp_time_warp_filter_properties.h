/*
 * com_day_cq_wcm_core_impl_warp_time_warp_filter_properties.h
 *
 * 
 */

#ifndef _com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_H_
#define _com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t;

#include "config_node_property_string.h"



typedef struct com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t {
    struct config_node_property_string_t *filter_order; //model
    struct config_node_property_string_t *filter_scope; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t;

__attribute__((deprecated)) com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t *com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_create(
    config_node_property_string_t *filter_order,
    config_node_property_string_t *filter_scope
);

void com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_free(com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t *com_day_cq_wcm_core_impl_warp_time_warp_filter_properties);

com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t *com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_warp_time_warp_filter_propertiesJSON);

cJSON *com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_convertToJSON(com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t *com_day_cq_wcm_core_impl_warp_time_warp_filter_properties);

#endif /* _com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_H_ */

