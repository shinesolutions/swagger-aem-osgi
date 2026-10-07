/*
 * com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_H_
#define _com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_t com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_t {
    struct config_node_property_string_t *version_id; //model
    struct config_node_property_boolean_t *cache_on; //model
    struct config_node_property_integer_t *concurrency_level; //model
    struct config_node_property_integer_t *cache_start_size; //model
    struct config_node_property_integer_t *cache_ttl; //model
    struct config_node_property_integer_t *cache_size; //model
    struct config_node_property_integer_t *time_limit; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_t;

__attribute__((deprecated)) com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_t *com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_create(
    config_node_property_string_t *version_id,
    config_node_property_boolean_t *cache_on,
    config_node_property_integer_t *concurrency_level,
    config_node_property_integer_t *cache_start_size,
    config_node_property_integer_t *cache_ttl,
    config_node_property_integer_t *cache_size,
    config_node_property_integer_t *time_limit
);

void com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_free(com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_t *com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties);

com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_t *com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_parseFromJSON(cJSON *com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_propertiesJSON);

cJSON *com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_convertToJSON(com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_t *com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties);

#endif /* _com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_H_ */

