/*
 * com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties.h
 *
 * 
 */

#ifndef _com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_H_
#define _com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t;

#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t {
    struct config_node_property_integer_t *cq_dam_image_cache_max_memory; //model
    struct config_node_property_integer_t *cq_dam_image_cache_max_age; //model
    struct config_node_property_string_t *cq_dam_image_cache_max_dimension; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t;

__attribute__((deprecated)) com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t *com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_create(
    config_node_property_integer_t *cq_dam_image_cache_max_memory,
    config_node_property_integer_t *cq_dam_image_cache_max_age,
    config_node_property_string_t *cq_dam_image_cache_max_dimension
);

void com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_free(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t *com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties);

com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t *com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_propertiesJSON);

cJSON *com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_convertToJSON(com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_t *com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties);

#endif /* _com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties_H_ */

