/*
 * com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties.h
 *
 * 
 */

#ifndef _com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties_H_
#define _com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties_t com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties_t {
    struct config_node_property_boolean_t *dam_showexpired; //model
    struct config_node_property_boolean_t *dam_showhidden; //model
    struct config_node_property_boolean_t *tag_title_search; //model
    struct config_node_property_string_t *guess_total; //model
    struct config_node_property_string_t *dam_expiry_property; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties_t;

__attribute__((deprecated)) com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties_t *com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties_create(
    config_node_property_boolean_t *dam_showexpired,
    config_node_property_boolean_t *dam_showhidden,
    config_node_property_boolean_t *tag_title_search,
    config_node_property_string_t *guess_total,
    config_node_property_string_t *dam_expiry_property
);

void com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties_free(com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties_t *com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties);

com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties_t *com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_propertiesJSON);

cJSON *com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties_convertToJSON(com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties_t *com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties);

#endif /* _com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties_H_ */

