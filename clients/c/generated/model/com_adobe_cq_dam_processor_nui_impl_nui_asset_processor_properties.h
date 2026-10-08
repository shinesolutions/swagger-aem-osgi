/*
 * com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_H_
#define _com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t {
    struct config_node_property_boolean_t *nui_enabled; //model
    struct config_node_property_string_t *nui_service_url; //model
    struct config_node_property_string_t *nui_api_key; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t;

__attribute__((deprecated)) com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t *com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_create(
    config_node_property_boolean_t *nui_enabled,
    config_node_property_string_t *nui_service_url,
    config_node_property_string_t *nui_api_key
);

void com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_free(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t *com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties);

com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t *com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_parseFromJSON(cJSON *com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_propertiesJSON);

cJSON *com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_convertToJSON(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t *com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties);

#endif /* _com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_H_ */

