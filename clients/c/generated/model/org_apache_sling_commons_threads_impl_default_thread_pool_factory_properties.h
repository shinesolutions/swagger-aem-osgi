/*
 * org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_H_
#define _org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t {
    struct config_node_property_string_t *name; //model
    struct config_node_property_integer_t *min_pool_size; //model
    struct config_node_property_integer_t *max_pool_size; //model
    struct config_node_property_integer_t *queue_size; //model
    struct config_node_property_integer_t *max_thread_age; //model
    struct config_node_property_integer_t *keep_alive_time; //model
    struct config_node_property_drop_down_t *block_policy; //model
    struct config_node_property_boolean_t *shutdown_graceful; //model
    struct config_node_property_boolean_t *daemon; //model
    struct config_node_property_integer_t *shutdown_wait_time; //model
    struct config_node_property_drop_down_t *priority; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t;

__attribute__((deprecated)) org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t *org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_create(
    config_node_property_string_t *name,
    config_node_property_integer_t *min_pool_size,
    config_node_property_integer_t *max_pool_size,
    config_node_property_integer_t *queue_size,
    config_node_property_integer_t *max_thread_age,
    config_node_property_integer_t *keep_alive_time,
    config_node_property_drop_down_t *block_policy,
    config_node_property_boolean_t *shutdown_graceful,
    config_node_property_boolean_t *daemon,
    config_node_property_integer_t *shutdown_wait_time,
    config_node_property_drop_down_t *priority
);

void org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_free(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t *org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties);

org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t *org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_parseFromJSON(cJSON *org_apache_sling_commons_threads_impl_default_thread_pool_factory_propertiesJSON);

cJSON *org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_convertToJSON(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t *org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties);

#endif /* _org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_H_ */

