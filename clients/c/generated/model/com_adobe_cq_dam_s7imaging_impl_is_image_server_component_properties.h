/*
 * com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_H_
#define _com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t {
    struct config_node_property_string_t *tcp_port; //model
    struct config_node_property_boolean_t *allow_remote_access; //model
    struct config_node_property_string_t *max_render_rgn_pixels; //model
    struct config_node_property_string_t *max_message_size; //model
    struct config_node_property_integer_t *random_access_url_timeout; //model
    struct config_node_property_integer_t *worker_threads; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t;

__attribute__((deprecated)) com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t *com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_create(
    config_node_property_string_t *tcp_port,
    config_node_property_boolean_t *allow_remote_access,
    config_node_property_string_t *max_render_rgn_pixels,
    config_node_property_string_t *max_message_size,
    config_node_property_integer_t *random_access_url_timeout,
    config_node_property_integer_t *worker_threads
);

void com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_free(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t *com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties);

com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t *com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_parseFromJSON(cJSON *com_adobe_cq_dam_s7imaging_impl_is_image_server_component_propertiesJSON);

cJSON *com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_convertToJSON(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_t *com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties);

#endif /* _com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_H_ */

