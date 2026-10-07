/*
 * com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_H_
#define _com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_t com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_t {
    struct config_node_property_boolean_t *cq_commerce_asset_handler_active; //model
    struct config_node_property_string_t *cq_commerce_asset_handler_name; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_t;

__attribute__((deprecated)) com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_t *com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_create(
    config_node_property_boolean_t *cq_commerce_asset_handler_active,
    config_node_property_string_t *cq_commerce_asset_handler_name
);

void com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_free(com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_t *com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties);

com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_t *com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_parseFromJSON(cJSON *com_adobe_cq_commerce_impl_asset_dynamic_image_handler_propertiesJSON);

cJSON *com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_convertToJSON(com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_t *com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties);

#endif /* _com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_H_ */

