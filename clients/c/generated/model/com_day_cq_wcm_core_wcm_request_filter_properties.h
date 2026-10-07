/*
 * com_day_cq_wcm_core_wcm_request_filter_properties.h
 *
 * 
 */

#ifndef _com_day_cq_wcm_core_wcm_request_filter_properties_H_
#define _com_day_cq_wcm_core_wcm_request_filter_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_wcm_core_wcm_request_filter_properties_t com_day_cq_wcm_core_wcm_request_filter_properties_t;

#include "config_node_property_drop_down.h"



typedef struct com_day_cq_wcm_core_wcm_request_filter_properties_t {
    struct config_node_property_drop_down_t *wcmfilter_mode; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_wcm_core_wcm_request_filter_properties_t;

__attribute__((deprecated)) com_day_cq_wcm_core_wcm_request_filter_properties_t *com_day_cq_wcm_core_wcm_request_filter_properties_create(
    config_node_property_drop_down_t *wcmfilter_mode
);

void com_day_cq_wcm_core_wcm_request_filter_properties_free(com_day_cq_wcm_core_wcm_request_filter_properties_t *com_day_cq_wcm_core_wcm_request_filter_properties);

com_day_cq_wcm_core_wcm_request_filter_properties_t *com_day_cq_wcm_core_wcm_request_filter_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_wcm_request_filter_propertiesJSON);

cJSON *com_day_cq_wcm_core_wcm_request_filter_properties_convertToJSON(com_day_cq_wcm_core_wcm_request_filter_properties_t *com_day_cq_wcm_core_wcm_request_filter_properties);

#endif /* _com_day_cq_wcm_core_wcm_request_filter_properties_H_ */

