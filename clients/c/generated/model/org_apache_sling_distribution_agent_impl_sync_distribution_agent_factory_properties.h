/*
 * org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties_H_
#define _org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties_t org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties_t {
    struct config_node_property_string_t *name; //model
    struct config_node_property_string_t *title; //model
    struct config_node_property_string_t *details; //model
    struct config_node_property_boolean_t *enabled; //model
    struct config_node_property_string_t *service_name; //model
    struct config_node_property_drop_down_t *log_level; //model
    struct config_node_property_boolean_t *queue_processing_enabled; //model
    struct config_node_property_array_t *passive_queues; //model
    struct config_node_property_array_t *package_exporter_endpoints; //model
    struct config_node_property_array_t *package_importer_endpoints; //model
    struct config_node_property_drop_down_t *retry_strategy; //model
    struct config_node_property_integer_t *retry_attempts; //model
    struct config_node_property_integer_t *pull_items; //model
    struct config_node_property_integer_t *http_conn_timeout; //model
    struct config_node_property_string_t *request_authorization_strategy_target; //model
    struct config_node_property_string_t *transport_secret_provider_target; //model
    struct config_node_property_string_t *package_builder_target; //model
    struct config_node_property_string_t *triggers_target; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties_t;

__attribute__((deprecated)) org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties_t *org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *title,
    config_node_property_string_t *details,
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *service_name,
    config_node_property_drop_down_t *log_level,
    config_node_property_boolean_t *queue_processing_enabled,
    config_node_property_array_t *passive_queues,
    config_node_property_array_t *package_exporter_endpoints,
    config_node_property_array_t *package_importer_endpoints,
    config_node_property_drop_down_t *retry_strategy,
    config_node_property_integer_t *retry_attempts,
    config_node_property_integer_t *pull_items,
    config_node_property_integer_t *http_conn_timeout,
    config_node_property_string_t *request_authorization_strategy_target,
    config_node_property_string_t *transport_secret_provider_target,
    config_node_property_string_t *package_builder_target,
    config_node_property_string_t *triggers_target
);

void org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties_free(org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties_t *org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties);

org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties_t *org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties_parseFromJSON(cJSON *org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_propertiesJSON);

cJSON *org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties_convertToJSON(org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties_t *org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties);

#endif /* _org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties_H_ */

