/*
 * com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_H_
#define _com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t {
    struct config_node_property_array_t *inbox_impl_typeprovider_registrypaths; //model
    struct config_node_property_array_t *inbox_impl_typeprovider_legacypaths; //model
    struct config_node_property_string_t *inbox_impl_typeprovider_defaulturl_failureitem; //model
    struct config_node_property_string_t *inbox_impl_typeprovider_defaulturl_workitem; //model
    struct config_node_property_string_t *inbox_impl_typeprovider_defaulturl_task; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t;

__attribute__((deprecated)) com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t *com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_create(
    config_node_property_array_t *inbox_impl_typeprovider_registrypaths,
    config_node_property_array_t *inbox_impl_typeprovider_legacypaths,
    config_node_property_string_t *inbox_impl_typeprovider_defaulturl_failureitem,
    config_node_property_string_t *inbox_impl_typeprovider_defaulturl_workitem,
    config_node_property_string_t *inbox_impl_typeprovider_defaulturl_task
);

void com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_free(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t *com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties);

com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t *com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_parseFromJSON(cJSON *com_adobe_cq_inbox_impl_typeprovider_item_type_provider_propertiesJSON);

cJSON *com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_convertToJSON(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t *com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties);

#endif /* _com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_H_ */

