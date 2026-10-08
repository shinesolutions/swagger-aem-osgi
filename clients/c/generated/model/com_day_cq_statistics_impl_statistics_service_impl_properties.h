/*
 * com_day_cq_statistics_impl_statistics_service_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_statistics_impl_statistics_service_impl_properties_H_
#define _com_day_cq_statistics_impl_statistics_service_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_statistics_impl_statistics_service_impl_properties_t com_day_cq_statistics_impl_statistics_service_impl_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_statistics_impl_statistics_service_impl_properties_t {
    struct config_node_property_integer_t *scheduler_period; //model
    struct config_node_property_boolean_t *scheduler_concurrent; //model
    struct config_node_property_string_t *path; //model
    struct config_node_property_string_t *workspace; //model
    struct config_node_property_string_t *keywords_path; //model
    struct config_node_property_boolean_t *async_entries; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_statistics_impl_statistics_service_impl_properties_t;

__attribute__((deprecated)) com_day_cq_statistics_impl_statistics_service_impl_properties_t *com_day_cq_statistics_impl_statistics_service_impl_properties_create(
    config_node_property_integer_t *scheduler_period,
    config_node_property_boolean_t *scheduler_concurrent,
    config_node_property_string_t *path,
    config_node_property_string_t *workspace,
    config_node_property_string_t *keywords_path,
    config_node_property_boolean_t *async_entries
);

void com_day_cq_statistics_impl_statistics_service_impl_properties_free(com_day_cq_statistics_impl_statistics_service_impl_properties_t *com_day_cq_statistics_impl_statistics_service_impl_properties);

com_day_cq_statistics_impl_statistics_service_impl_properties_t *com_day_cq_statistics_impl_statistics_service_impl_properties_parseFromJSON(cJSON *com_day_cq_statistics_impl_statistics_service_impl_propertiesJSON);

cJSON *com_day_cq_statistics_impl_statistics_service_impl_properties_convertToJSON(com_day_cq_statistics_impl_statistics_service_impl_properties_t *com_day_cq_statistics_impl_statistics_service_impl_properties);

#endif /* _com_day_cq_statistics_impl_statistics_service_impl_properties_H_ */

