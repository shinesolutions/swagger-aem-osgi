/*
 * com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_H_
#define _com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t {
    struct config_node_property_string_t *filepattern; //model
    struct config_node_property_array_t *device_groups; //model
    struct config_node_property_boolean_t *build_page_nodes; //model
    struct config_node_property_boolean_t *build_client_libs; //model
    struct config_node_property_boolean_t *build_canvas_component; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t;

__attribute__((deprecated)) com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t *com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_create(
    config_node_property_string_t *filepattern,
    config_node_property_array_t *device_groups,
    config_node_property_boolean_t *build_page_nodes,
    config_node_property_boolean_t *build_client_libs,
    config_node_property_boolean_t *build_canvas_component
);

void com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_free(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t *com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties);

com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t *com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_propertiesJSON);

cJSON *com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_convertToJSON(com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_t *com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties);

#endif /* _com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties_H_ */

