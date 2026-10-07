/*
 * org_apache_sling_discovery_oak_config_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_discovery_oak_config_properties_H_
#define _org_apache_sling_discovery_oak_config_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_discovery_oak_config_properties_t org_apache_sling_discovery_oak_config_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_discovery_oak_config_properties_t {
    struct config_node_property_integer_t *connector_ping_timeout; //model
    struct config_node_property_integer_t *connector_ping_interval; //model
    struct config_node_property_integer_t *discovery_lite_check_interval; //model
    struct config_node_property_integer_t *cluster_sync_service_timeout; //model
    struct config_node_property_integer_t *cluster_sync_service_interval; //model
    struct config_node_property_boolean_t *enable_sync_token; //model
    struct config_node_property_integer_t *min_event_delay; //model
    struct config_node_property_integer_t *socket_connect_timeout; //model
    struct config_node_property_integer_t *so_timeout; //model
    struct config_node_property_array_t *topology_connector_urls; //model
    struct config_node_property_array_t *topology_connector_whitelist; //model
    struct config_node_property_boolean_t *auto_stop_local_loop_enabled; //model
    struct config_node_property_boolean_t *gzip_connector_requests_enabled; //model
    struct config_node_property_boolean_t *hmac_enabled; //model
    struct config_node_property_boolean_t *enable_encryption; //model
    struct config_node_property_string_t *shared_key; //model
    struct config_node_property_integer_t *hmac_shared_key_ttl; //model
    struct config_node_property_string_t *backoff_standby_factor; //model
    struct config_node_property_string_t *backoff_stable_factor; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_discovery_oak_config_properties_t;

__attribute__((deprecated)) org_apache_sling_discovery_oak_config_properties_t *org_apache_sling_discovery_oak_config_properties_create(
    config_node_property_integer_t *connector_ping_timeout,
    config_node_property_integer_t *connector_ping_interval,
    config_node_property_integer_t *discovery_lite_check_interval,
    config_node_property_integer_t *cluster_sync_service_timeout,
    config_node_property_integer_t *cluster_sync_service_interval,
    config_node_property_boolean_t *enable_sync_token,
    config_node_property_integer_t *min_event_delay,
    config_node_property_integer_t *socket_connect_timeout,
    config_node_property_integer_t *so_timeout,
    config_node_property_array_t *topology_connector_urls,
    config_node_property_array_t *topology_connector_whitelist,
    config_node_property_boolean_t *auto_stop_local_loop_enabled,
    config_node_property_boolean_t *gzip_connector_requests_enabled,
    config_node_property_boolean_t *hmac_enabled,
    config_node_property_boolean_t *enable_encryption,
    config_node_property_string_t *shared_key,
    config_node_property_integer_t *hmac_shared_key_ttl,
    config_node_property_string_t *backoff_standby_factor,
    config_node_property_string_t *backoff_stable_factor
);

void org_apache_sling_discovery_oak_config_properties_free(org_apache_sling_discovery_oak_config_properties_t *org_apache_sling_discovery_oak_config_properties);

org_apache_sling_discovery_oak_config_properties_t *org_apache_sling_discovery_oak_config_properties_parseFromJSON(cJSON *org_apache_sling_discovery_oak_config_propertiesJSON);

cJSON *org_apache_sling_discovery_oak_config_properties_convertToJSON(org_apache_sling_discovery_oak_config_properties_t *org_apache_sling_discovery_oak_config_properties);

#endif /* _org_apache_sling_discovery_oak_config_properties_H_ */

