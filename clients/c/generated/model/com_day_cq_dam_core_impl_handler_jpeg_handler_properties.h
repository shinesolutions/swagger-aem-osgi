/*
 * com_day_cq_dam_core_impl_handler_jpeg_handler_properties.h
 *
 * 
 */

#ifndef _com_day_cq_dam_core_impl_handler_jpeg_handler_properties_H_
#define _com_day_cq_dam_core_impl_handler_jpeg_handler_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"



typedef struct com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t {
    struct config_node_property_boolean_t *cq_dam_enable_ext_meta_extraction; //model
    struct config_node_property_integer_t *large_file_threshold; //model
    struct config_node_property_integer_t *large_comment_threshold; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t;

__attribute__((deprecated)) com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t *com_day_cq_dam_core_impl_handler_jpeg_handler_properties_create(
    config_node_property_boolean_t *cq_dam_enable_ext_meta_extraction,
    config_node_property_integer_t *large_file_threshold,
    config_node_property_integer_t *large_comment_threshold
);

void com_day_cq_dam_core_impl_handler_jpeg_handler_properties_free(com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t *com_day_cq_dam_core_impl_handler_jpeg_handler_properties);

com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t *com_day_cq_dam_core_impl_handler_jpeg_handler_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_handler_jpeg_handler_propertiesJSON);

cJSON *com_day_cq_dam_core_impl_handler_jpeg_handler_properties_convertToJSON(com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t *com_day_cq_dam_core_impl_handler_jpeg_handler_properties);

#endif /* _com_day_cq_dam_core_impl_handler_jpeg_handler_properties_H_ */

