/*
 * com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_H_
#define _com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t;

#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t {
    struct config_node_property_string_t *translation_factory; //model
    struct config_node_property_string_t *default_connector_label; //model
    struct config_node_property_string_t *default_connector_attribution; //model
    struct config_node_property_string_t *default_connector_workspace_id; //model
    struct config_node_property_string_t *default_connector_subscription_key; //model
    struct config_node_property_string_t *language_map_location; //model
    struct config_node_property_string_t *category_map_location; //model
    struct config_node_property_integer_t *retry_attempts; //model
    struct config_node_property_integer_t *timeout_count; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t;

__attribute__((deprecated)) com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t *com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_create(
    config_node_property_string_t *translation_factory,
    config_node_property_string_t *default_connector_label,
    config_node_property_string_t *default_connector_attribution,
    config_node_property_string_t *default_connector_workspace_id,
    config_node_property_string_t *default_connector_subscription_key,
    config_node_property_string_t *language_map_location,
    config_node_property_string_t *category_map_location,
    config_node_property_integer_t *retry_attempts,
    config_node_property_integer_t *timeout_count
);

void com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_free(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t *com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties);

com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t *com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_parseFromJSON(cJSON *com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_propertiesJSON);

cJSON *com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_convertToJSON(com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_t *com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties);

#endif /* _com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties_H_ */

