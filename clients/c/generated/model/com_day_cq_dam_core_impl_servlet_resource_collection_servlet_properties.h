/*
 * com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties.h
 *
 * 
 */

#ifndef _com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_H_
#define _com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t {
    struct config_node_property_array_t *sling_servlet_resource_types; //model
    struct config_node_property_string_t *sling_servlet_methods; //model
    struct config_node_property_string_t *sling_servlet_selectors; //model
    struct config_node_property_string_t *download_config; //model
    struct config_node_property_string_t *view_selector; //model
    struct config_node_property_boolean_t *send_email; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t;

__attribute__((deprecated)) com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t *com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_create(
    config_node_property_array_t *sling_servlet_resource_types,
    config_node_property_string_t *sling_servlet_methods,
    config_node_property_string_t *sling_servlet_selectors,
    config_node_property_string_t *download_config,
    config_node_property_string_t *view_selector,
    config_node_property_boolean_t *send_email
);

void com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_free(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t *com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties);

com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t *com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_servlet_resource_collection_servlet_propertiesJSON);

cJSON *com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_convertToJSON(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_t *com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties);

#endif /* _com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_H_ */

