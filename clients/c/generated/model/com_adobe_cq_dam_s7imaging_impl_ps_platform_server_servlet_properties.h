/*
 * com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_H_
#define _com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"



typedef struct com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t {
    struct config_node_property_boolean_t *cache_enable; //model
    struct config_node_property_array_t *cache_root_paths; //model
    struct config_node_property_integer_t *cache_max_size; //model
    struct config_node_property_integer_t *cache_max_entries; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t;

__attribute__((deprecated)) com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t *com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_create(
    config_node_property_boolean_t *cache_enable,
    config_node_property_array_t *cache_root_paths,
    config_node_property_integer_t *cache_max_size,
    config_node_property_integer_t *cache_max_entries
);

void com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_free(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t *com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties);

com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t *com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_parseFromJSON(cJSON *com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_propertiesJSON);

cJSON *com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_convertToJSON(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t *com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties);

#endif /* _com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_H_ */

