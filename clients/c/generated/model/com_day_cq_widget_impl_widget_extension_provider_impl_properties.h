/*
 * com_day_cq_widget_impl_widget_extension_provider_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_widget_impl_widget_extension_provider_impl_properties_H_
#define _com_day_cq_widget_impl_widget_extension_provider_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_widget_impl_widget_extension_provider_impl_properties_t com_day_cq_widget_impl_widget_extension_provider_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"



typedef struct com_day_cq_widget_impl_widget_extension_provider_impl_properties_t {
    struct config_node_property_array_t *extendable_widgets; //model
    struct config_node_property_boolean_t *widgetextensionprovider_debug; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_widget_impl_widget_extension_provider_impl_properties_t;

__attribute__((deprecated)) com_day_cq_widget_impl_widget_extension_provider_impl_properties_t *com_day_cq_widget_impl_widget_extension_provider_impl_properties_create(
    config_node_property_array_t *extendable_widgets,
    config_node_property_boolean_t *widgetextensionprovider_debug
);

void com_day_cq_widget_impl_widget_extension_provider_impl_properties_free(com_day_cq_widget_impl_widget_extension_provider_impl_properties_t *com_day_cq_widget_impl_widget_extension_provider_impl_properties);

com_day_cq_widget_impl_widget_extension_provider_impl_properties_t *com_day_cq_widget_impl_widget_extension_provider_impl_properties_parseFromJSON(cJSON *com_day_cq_widget_impl_widget_extension_provider_impl_propertiesJSON);

cJSON *com_day_cq_widget_impl_widget_extension_provider_impl_properties_convertToJSON(com_day_cq_widget_impl_widget_extension_provider_impl_properties_t *com_day_cq_widget_impl_widget_extension_provider_impl_properties);

#endif /* _com_day_cq_widget_impl_widget_extension_provider_impl_properties_H_ */

