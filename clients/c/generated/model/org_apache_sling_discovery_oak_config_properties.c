#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_discovery_oak_config_properties.h"



static org_apache_sling_discovery_oak_config_properties_t *org_apache_sling_discovery_oak_config_properties_create_internal(
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
    ) {
    org_apache_sling_discovery_oak_config_properties_t *org_apache_sling_discovery_oak_config_properties_local_var = malloc(sizeof(org_apache_sling_discovery_oak_config_properties_t));
    if (!org_apache_sling_discovery_oak_config_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_discovery_oak_config_properties_local_var, 0, sizeof(org_apache_sling_discovery_oak_config_properties_t));
    org_apache_sling_discovery_oak_config_properties_local_var->_library_owned = 1;
    org_apache_sling_discovery_oak_config_properties_local_var->connector_ping_timeout = connector_ping_timeout;
    org_apache_sling_discovery_oak_config_properties_local_var->connector_ping_interval = connector_ping_interval;
    org_apache_sling_discovery_oak_config_properties_local_var->discovery_lite_check_interval = discovery_lite_check_interval;
    org_apache_sling_discovery_oak_config_properties_local_var->cluster_sync_service_timeout = cluster_sync_service_timeout;
    org_apache_sling_discovery_oak_config_properties_local_var->cluster_sync_service_interval = cluster_sync_service_interval;
    org_apache_sling_discovery_oak_config_properties_local_var->enable_sync_token = enable_sync_token;
    org_apache_sling_discovery_oak_config_properties_local_var->min_event_delay = min_event_delay;
    org_apache_sling_discovery_oak_config_properties_local_var->socket_connect_timeout = socket_connect_timeout;
    org_apache_sling_discovery_oak_config_properties_local_var->so_timeout = so_timeout;
    org_apache_sling_discovery_oak_config_properties_local_var->topology_connector_urls = topology_connector_urls;
    org_apache_sling_discovery_oak_config_properties_local_var->topology_connector_whitelist = topology_connector_whitelist;
    org_apache_sling_discovery_oak_config_properties_local_var->auto_stop_local_loop_enabled = auto_stop_local_loop_enabled;
    org_apache_sling_discovery_oak_config_properties_local_var->gzip_connector_requests_enabled = gzip_connector_requests_enabled;
    org_apache_sling_discovery_oak_config_properties_local_var->hmac_enabled = hmac_enabled;
    org_apache_sling_discovery_oak_config_properties_local_var->enable_encryption = enable_encryption;
    org_apache_sling_discovery_oak_config_properties_local_var->shared_key = shared_key;
    org_apache_sling_discovery_oak_config_properties_local_var->hmac_shared_key_ttl = hmac_shared_key_ttl;
    org_apache_sling_discovery_oak_config_properties_local_var->backoff_standby_factor = backoff_standby_factor;
    org_apache_sling_discovery_oak_config_properties_local_var->backoff_stable_factor = backoff_stable_factor;
    return org_apache_sling_discovery_oak_config_properties_local_var;
}

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
    ) {
    org_apache_sling_discovery_oak_config_properties_t *result = org_apache_sling_discovery_oak_config_properties_create_internal (
        connector_ping_timeout,
        connector_ping_interval,
        discovery_lite_check_interval,
        cluster_sync_service_timeout,
        cluster_sync_service_interval,
        enable_sync_token,
        min_event_delay,
        socket_connect_timeout,
        so_timeout,
        topology_connector_urls,
        topology_connector_whitelist,
        auto_stop_local_loop_enabled,
        gzip_connector_requests_enabled,
        hmac_enabled,
        enable_encryption,
        shared_key,
        hmac_shared_key_ttl,
        backoff_standby_factor,
        backoff_stable_factor
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_discovery_oak_config_properties_free(org_apache_sling_discovery_oak_config_properties_t *org_apache_sling_discovery_oak_config_properties) {
    if(NULL == org_apache_sling_discovery_oak_config_properties){
        return ;
    }
    if(org_apache_sling_discovery_oak_config_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_discovery_oak_config_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_discovery_oak_config_properties->connector_ping_timeout) {
        config_node_property_integer_free(org_apache_sling_discovery_oak_config_properties->connector_ping_timeout);
        org_apache_sling_discovery_oak_config_properties->connector_ping_timeout = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->connector_ping_interval) {
        config_node_property_integer_free(org_apache_sling_discovery_oak_config_properties->connector_ping_interval);
        org_apache_sling_discovery_oak_config_properties->connector_ping_interval = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->discovery_lite_check_interval) {
        config_node_property_integer_free(org_apache_sling_discovery_oak_config_properties->discovery_lite_check_interval);
        org_apache_sling_discovery_oak_config_properties->discovery_lite_check_interval = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->cluster_sync_service_timeout) {
        config_node_property_integer_free(org_apache_sling_discovery_oak_config_properties->cluster_sync_service_timeout);
        org_apache_sling_discovery_oak_config_properties->cluster_sync_service_timeout = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->cluster_sync_service_interval) {
        config_node_property_integer_free(org_apache_sling_discovery_oak_config_properties->cluster_sync_service_interval);
        org_apache_sling_discovery_oak_config_properties->cluster_sync_service_interval = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->enable_sync_token) {
        config_node_property_boolean_free(org_apache_sling_discovery_oak_config_properties->enable_sync_token);
        org_apache_sling_discovery_oak_config_properties->enable_sync_token = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->min_event_delay) {
        config_node_property_integer_free(org_apache_sling_discovery_oak_config_properties->min_event_delay);
        org_apache_sling_discovery_oak_config_properties->min_event_delay = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->socket_connect_timeout) {
        config_node_property_integer_free(org_apache_sling_discovery_oak_config_properties->socket_connect_timeout);
        org_apache_sling_discovery_oak_config_properties->socket_connect_timeout = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->so_timeout) {
        config_node_property_integer_free(org_apache_sling_discovery_oak_config_properties->so_timeout);
        org_apache_sling_discovery_oak_config_properties->so_timeout = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->topology_connector_urls) {
        config_node_property_array_free(org_apache_sling_discovery_oak_config_properties->topology_connector_urls);
        org_apache_sling_discovery_oak_config_properties->topology_connector_urls = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->topology_connector_whitelist) {
        config_node_property_array_free(org_apache_sling_discovery_oak_config_properties->topology_connector_whitelist);
        org_apache_sling_discovery_oak_config_properties->topology_connector_whitelist = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->auto_stop_local_loop_enabled) {
        config_node_property_boolean_free(org_apache_sling_discovery_oak_config_properties->auto_stop_local_loop_enabled);
        org_apache_sling_discovery_oak_config_properties->auto_stop_local_loop_enabled = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->gzip_connector_requests_enabled) {
        config_node_property_boolean_free(org_apache_sling_discovery_oak_config_properties->gzip_connector_requests_enabled);
        org_apache_sling_discovery_oak_config_properties->gzip_connector_requests_enabled = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->hmac_enabled) {
        config_node_property_boolean_free(org_apache_sling_discovery_oak_config_properties->hmac_enabled);
        org_apache_sling_discovery_oak_config_properties->hmac_enabled = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->enable_encryption) {
        config_node_property_boolean_free(org_apache_sling_discovery_oak_config_properties->enable_encryption);
        org_apache_sling_discovery_oak_config_properties->enable_encryption = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->shared_key) {
        config_node_property_string_free(org_apache_sling_discovery_oak_config_properties->shared_key);
        org_apache_sling_discovery_oak_config_properties->shared_key = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->hmac_shared_key_ttl) {
        config_node_property_integer_free(org_apache_sling_discovery_oak_config_properties->hmac_shared_key_ttl);
        org_apache_sling_discovery_oak_config_properties->hmac_shared_key_ttl = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->backoff_standby_factor) {
        config_node_property_string_free(org_apache_sling_discovery_oak_config_properties->backoff_standby_factor);
        org_apache_sling_discovery_oak_config_properties->backoff_standby_factor = NULL;
    }
    if (org_apache_sling_discovery_oak_config_properties->backoff_stable_factor) {
        config_node_property_string_free(org_apache_sling_discovery_oak_config_properties->backoff_stable_factor);
        org_apache_sling_discovery_oak_config_properties->backoff_stable_factor = NULL;
    }
    free(org_apache_sling_discovery_oak_config_properties);
}

cJSON *org_apache_sling_discovery_oak_config_properties_convertToJSON(org_apache_sling_discovery_oak_config_properties_t *org_apache_sling_discovery_oak_config_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_discovery_oak_config_properties->connector_ping_timeout
    if(org_apache_sling_discovery_oak_config_properties->connector_ping_timeout) {
    cJSON *connector_ping_timeout_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_discovery_oak_config_properties->connector_ping_timeout);
    if(connector_ping_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "connectorPingTimeout", connector_ping_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->connector_ping_interval
    if(org_apache_sling_discovery_oak_config_properties->connector_ping_interval) {
    cJSON *connector_ping_interval_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_discovery_oak_config_properties->connector_ping_interval);
    if(connector_ping_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "connectorPingInterval", connector_ping_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->discovery_lite_check_interval
    if(org_apache_sling_discovery_oak_config_properties->discovery_lite_check_interval) {
    cJSON *discovery_lite_check_interval_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_discovery_oak_config_properties->discovery_lite_check_interval);
    if(discovery_lite_check_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "discoveryLiteCheckInterval", discovery_lite_check_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->cluster_sync_service_timeout
    if(org_apache_sling_discovery_oak_config_properties->cluster_sync_service_timeout) {
    cJSON *cluster_sync_service_timeout_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_discovery_oak_config_properties->cluster_sync_service_timeout);
    if(cluster_sync_service_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "clusterSyncServiceTimeout", cluster_sync_service_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->cluster_sync_service_interval
    if(org_apache_sling_discovery_oak_config_properties->cluster_sync_service_interval) {
    cJSON *cluster_sync_service_interval_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_discovery_oak_config_properties->cluster_sync_service_interval);
    if(cluster_sync_service_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "clusterSyncServiceInterval", cluster_sync_service_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->enable_sync_token
    if(org_apache_sling_discovery_oak_config_properties->enable_sync_token) {
    cJSON *enable_sync_token_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_discovery_oak_config_properties->enable_sync_token);
    if(enable_sync_token_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enableSyncToken", enable_sync_token_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->min_event_delay
    if(org_apache_sling_discovery_oak_config_properties->min_event_delay) {
    cJSON *min_event_delay_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_discovery_oak_config_properties->min_event_delay);
    if(min_event_delay_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "minEventDelay", min_event_delay_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->socket_connect_timeout
    if(org_apache_sling_discovery_oak_config_properties->socket_connect_timeout) {
    cJSON *socket_connect_timeout_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_discovery_oak_config_properties->socket_connect_timeout);
    if(socket_connect_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "socketConnectTimeout", socket_connect_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->so_timeout
    if(org_apache_sling_discovery_oak_config_properties->so_timeout) {
    cJSON *so_timeout_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_discovery_oak_config_properties->so_timeout);
    if(so_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "soTimeout", so_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->topology_connector_urls
    if(org_apache_sling_discovery_oak_config_properties->topology_connector_urls) {
    cJSON *topology_connector_urls_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_discovery_oak_config_properties->topology_connector_urls);
    if(topology_connector_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "topologyConnectorUrls", topology_connector_urls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->topology_connector_whitelist
    if(org_apache_sling_discovery_oak_config_properties->topology_connector_whitelist) {
    cJSON *topology_connector_whitelist_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_discovery_oak_config_properties->topology_connector_whitelist);
    if(topology_connector_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "topologyConnectorWhitelist", topology_connector_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->auto_stop_local_loop_enabled
    if(org_apache_sling_discovery_oak_config_properties->auto_stop_local_loop_enabled) {
    cJSON *auto_stop_local_loop_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_discovery_oak_config_properties->auto_stop_local_loop_enabled);
    if(auto_stop_local_loop_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "autoStopLocalLoopEnabled", auto_stop_local_loop_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->gzip_connector_requests_enabled
    if(org_apache_sling_discovery_oak_config_properties->gzip_connector_requests_enabled) {
    cJSON *gzip_connector_requests_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_discovery_oak_config_properties->gzip_connector_requests_enabled);
    if(gzip_connector_requests_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "gzipConnectorRequestsEnabled", gzip_connector_requests_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->hmac_enabled
    if(org_apache_sling_discovery_oak_config_properties->hmac_enabled) {
    cJSON *hmac_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_discovery_oak_config_properties->hmac_enabled);
    if(hmac_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hmacEnabled", hmac_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->enable_encryption
    if(org_apache_sling_discovery_oak_config_properties->enable_encryption) {
    cJSON *enable_encryption_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_discovery_oak_config_properties->enable_encryption);
    if(enable_encryption_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enableEncryption", enable_encryption_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->shared_key
    if(org_apache_sling_discovery_oak_config_properties->shared_key) {
    cJSON *shared_key_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_discovery_oak_config_properties->shared_key);
    if(shared_key_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sharedKey", shared_key_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->hmac_shared_key_ttl
    if(org_apache_sling_discovery_oak_config_properties->hmac_shared_key_ttl) {
    cJSON *hmac_shared_key_ttl_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_discovery_oak_config_properties->hmac_shared_key_ttl);
    if(hmac_shared_key_ttl_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hmacSharedKeyTTL", hmac_shared_key_ttl_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->backoff_standby_factor
    if(org_apache_sling_discovery_oak_config_properties->backoff_standby_factor) {
    cJSON *backoff_standby_factor_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_discovery_oak_config_properties->backoff_standby_factor);
    if(backoff_standby_factor_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "backoffStandbyFactor", backoff_standby_factor_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_discovery_oak_config_properties->backoff_stable_factor
    if(org_apache_sling_discovery_oak_config_properties->backoff_stable_factor) {
    cJSON *backoff_stable_factor_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_discovery_oak_config_properties->backoff_stable_factor);
    if(backoff_stable_factor_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "backoffStableFactor", backoff_stable_factor_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

org_apache_sling_discovery_oak_config_properties_t *org_apache_sling_discovery_oak_config_properties_parseFromJSON(cJSON *org_apache_sling_discovery_oak_config_propertiesJSON){

    org_apache_sling_discovery_oak_config_properties_t *org_apache_sling_discovery_oak_config_properties_local_var = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->connector_ping_timeout
    config_node_property_integer_t *connector_ping_timeout_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->connector_ping_interval
    config_node_property_integer_t *connector_ping_interval_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->discovery_lite_check_interval
    config_node_property_integer_t *discovery_lite_check_interval_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->cluster_sync_service_timeout
    config_node_property_integer_t *cluster_sync_service_timeout_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->cluster_sync_service_interval
    config_node_property_integer_t *cluster_sync_service_interval_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->enable_sync_token
    config_node_property_boolean_t *enable_sync_token_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->min_event_delay
    config_node_property_integer_t *min_event_delay_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->socket_connect_timeout
    config_node_property_integer_t *socket_connect_timeout_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->so_timeout
    config_node_property_integer_t *so_timeout_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->topology_connector_urls
    config_node_property_array_t *topology_connector_urls_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->topology_connector_whitelist
    config_node_property_array_t *topology_connector_whitelist_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->auto_stop_local_loop_enabled
    config_node_property_boolean_t *auto_stop_local_loop_enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->gzip_connector_requests_enabled
    config_node_property_boolean_t *gzip_connector_requests_enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->hmac_enabled
    config_node_property_boolean_t *hmac_enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->enable_encryption
    config_node_property_boolean_t *enable_encryption_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->shared_key
    config_node_property_string_t *shared_key_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->hmac_shared_key_ttl
    config_node_property_integer_t *hmac_shared_key_ttl_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->backoff_standby_factor
    config_node_property_string_t *backoff_standby_factor_local_nonprim = NULL;

    // define the local variable for org_apache_sling_discovery_oak_config_properties->backoff_stable_factor
    config_node_property_string_t *backoff_stable_factor_local_nonprim = NULL;

    // org_apache_sling_discovery_oak_config_properties->connector_ping_timeout
    cJSON *connector_ping_timeout = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "connectorPingTimeout");
    if (cJSON_IsNull(connector_ping_timeout)) {
        connector_ping_timeout = NULL;
    }
    if (connector_ping_timeout) { 
    connector_ping_timeout_local_nonprim = config_node_property_integer_parseFromJSON(connector_ping_timeout); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->connector_ping_interval
    cJSON *connector_ping_interval = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "connectorPingInterval");
    if (cJSON_IsNull(connector_ping_interval)) {
        connector_ping_interval = NULL;
    }
    if (connector_ping_interval) { 
    connector_ping_interval_local_nonprim = config_node_property_integer_parseFromJSON(connector_ping_interval); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->discovery_lite_check_interval
    cJSON *discovery_lite_check_interval = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "discoveryLiteCheckInterval");
    if (cJSON_IsNull(discovery_lite_check_interval)) {
        discovery_lite_check_interval = NULL;
    }
    if (discovery_lite_check_interval) { 
    discovery_lite_check_interval_local_nonprim = config_node_property_integer_parseFromJSON(discovery_lite_check_interval); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->cluster_sync_service_timeout
    cJSON *cluster_sync_service_timeout = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "clusterSyncServiceTimeout");
    if (cJSON_IsNull(cluster_sync_service_timeout)) {
        cluster_sync_service_timeout = NULL;
    }
    if (cluster_sync_service_timeout) { 
    cluster_sync_service_timeout_local_nonprim = config_node_property_integer_parseFromJSON(cluster_sync_service_timeout); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->cluster_sync_service_interval
    cJSON *cluster_sync_service_interval = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "clusterSyncServiceInterval");
    if (cJSON_IsNull(cluster_sync_service_interval)) {
        cluster_sync_service_interval = NULL;
    }
    if (cluster_sync_service_interval) { 
    cluster_sync_service_interval_local_nonprim = config_node_property_integer_parseFromJSON(cluster_sync_service_interval); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->enable_sync_token
    cJSON *enable_sync_token = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "enableSyncToken");
    if (cJSON_IsNull(enable_sync_token)) {
        enable_sync_token = NULL;
    }
    if (enable_sync_token) { 
    enable_sync_token_local_nonprim = config_node_property_boolean_parseFromJSON(enable_sync_token); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->min_event_delay
    cJSON *min_event_delay = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "minEventDelay");
    if (cJSON_IsNull(min_event_delay)) {
        min_event_delay = NULL;
    }
    if (min_event_delay) { 
    min_event_delay_local_nonprim = config_node_property_integer_parseFromJSON(min_event_delay); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->socket_connect_timeout
    cJSON *socket_connect_timeout = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "socketConnectTimeout");
    if (cJSON_IsNull(socket_connect_timeout)) {
        socket_connect_timeout = NULL;
    }
    if (socket_connect_timeout) { 
    socket_connect_timeout_local_nonprim = config_node_property_integer_parseFromJSON(socket_connect_timeout); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->so_timeout
    cJSON *so_timeout = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "soTimeout");
    if (cJSON_IsNull(so_timeout)) {
        so_timeout = NULL;
    }
    if (so_timeout) { 
    so_timeout_local_nonprim = config_node_property_integer_parseFromJSON(so_timeout); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->topology_connector_urls
    cJSON *topology_connector_urls = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "topologyConnectorUrls");
    if (cJSON_IsNull(topology_connector_urls)) {
        topology_connector_urls = NULL;
    }
    if (topology_connector_urls) { 
    topology_connector_urls_local_nonprim = config_node_property_array_parseFromJSON(topology_connector_urls); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->topology_connector_whitelist
    cJSON *topology_connector_whitelist = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "topologyConnectorWhitelist");
    if (cJSON_IsNull(topology_connector_whitelist)) {
        topology_connector_whitelist = NULL;
    }
    if (topology_connector_whitelist) { 
    topology_connector_whitelist_local_nonprim = config_node_property_array_parseFromJSON(topology_connector_whitelist); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->auto_stop_local_loop_enabled
    cJSON *auto_stop_local_loop_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "autoStopLocalLoopEnabled");
    if (cJSON_IsNull(auto_stop_local_loop_enabled)) {
        auto_stop_local_loop_enabled = NULL;
    }
    if (auto_stop_local_loop_enabled) { 
    auto_stop_local_loop_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(auto_stop_local_loop_enabled); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->gzip_connector_requests_enabled
    cJSON *gzip_connector_requests_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "gzipConnectorRequestsEnabled");
    if (cJSON_IsNull(gzip_connector_requests_enabled)) {
        gzip_connector_requests_enabled = NULL;
    }
    if (gzip_connector_requests_enabled) { 
    gzip_connector_requests_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(gzip_connector_requests_enabled); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->hmac_enabled
    cJSON *hmac_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "hmacEnabled");
    if (cJSON_IsNull(hmac_enabled)) {
        hmac_enabled = NULL;
    }
    if (hmac_enabled) { 
    hmac_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(hmac_enabled); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->enable_encryption
    cJSON *enable_encryption = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "enableEncryption");
    if (cJSON_IsNull(enable_encryption)) {
        enable_encryption = NULL;
    }
    if (enable_encryption) { 
    enable_encryption_local_nonprim = config_node_property_boolean_parseFromJSON(enable_encryption); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->shared_key
    cJSON *shared_key = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "sharedKey");
    if (cJSON_IsNull(shared_key)) {
        shared_key = NULL;
    }
    if (shared_key) { 
    shared_key_local_nonprim = config_node_property_string_parseFromJSON(shared_key); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->hmac_shared_key_ttl
    cJSON *hmac_shared_key_ttl = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "hmacSharedKeyTTL");
    if (cJSON_IsNull(hmac_shared_key_ttl)) {
        hmac_shared_key_ttl = NULL;
    }
    if (hmac_shared_key_ttl) { 
    hmac_shared_key_ttl_local_nonprim = config_node_property_integer_parseFromJSON(hmac_shared_key_ttl); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->backoff_standby_factor
    cJSON *backoff_standby_factor = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "backoffStandbyFactor");
    if (cJSON_IsNull(backoff_standby_factor)) {
        backoff_standby_factor = NULL;
    }
    if (backoff_standby_factor) { 
    backoff_standby_factor_local_nonprim = config_node_property_string_parseFromJSON(backoff_standby_factor); //nonprimitive
    }

    // org_apache_sling_discovery_oak_config_properties->backoff_stable_factor
    cJSON *backoff_stable_factor = cJSON_GetObjectItemCaseSensitive(org_apache_sling_discovery_oak_config_propertiesJSON, "backoffStableFactor");
    if (cJSON_IsNull(backoff_stable_factor)) {
        backoff_stable_factor = NULL;
    }
    if (backoff_stable_factor) { 
    backoff_stable_factor_local_nonprim = config_node_property_string_parseFromJSON(backoff_stable_factor); //nonprimitive
    }



    org_apache_sling_discovery_oak_config_properties_local_var = org_apache_sling_discovery_oak_config_properties_create_internal (
        connector_ping_timeout ? connector_ping_timeout_local_nonprim : NULL,
        connector_ping_interval ? connector_ping_interval_local_nonprim : NULL,
        discovery_lite_check_interval ? discovery_lite_check_interval_local_nonprim : NULL,
        cluster_sync_service_timeout ? cluster_sync_service_timeout_local_nonprim : NULL,
        cluster_sync_service_interval ? cluster_sync_service_interval_local_nonprim : NULL,
        enable_sync_token ? enable_sync_token_local_nonprim : NULL,
        min_event_delay ? min_event_delay_local_nonprim : NULL,
        socket_connect_timeout ? socket_connect_timeout_local_nonprim : NULL,
        so_timeout ? so_timeout_local_nonprim : NULL,
        topology_connector_urls ? topology_connector_urls_local_nonprim : NULL,
        topology_connector_whitelist ? topology_connector_whitelist_local_nonprim : NULL,
        auto_stop_local_loop_enabled ? auto_stop_local_loop_enabled_local_nonprim : NULL,
        gzip_connector_requests_enabled ? gzip_connector_requests_enabled_local_nonprim : NULL,
        hmac_enabled ? hmac_enabled_local_nonprim : NULL,
        enable_encryption ? enable_encryption_local_nonprim : NULL,
        shared_key ? shared_key_local_nonprim : NULL,
        hmac_shared_key_ttl ? hmac_shared_key_ttl_local_nonprim : NULL,
        backoff_standby_factor ? backoff_standby_factor_local_nonprim : NULL,
        backoff_stable_factor ? backoff_stable_factor_local_nonprim : NULL
        );

    if (!org_apache_sling_discovery_oak_config_properties_local_var) {
        goto end;
    }

    return org_apache_sling_discovery_oak_config_properties_local_var;
end:
    if (connector_ping_timeout_local_nonprim) {
        config_node_property_integer_free(connector_ping_timeout_local_nonprim);
        connector_ping_timeout_local_nonprim = NULL;
    }
    if (connector_ping_interval_local_nonprim) {
        config_node_property_integer_free(connector_ping_interval_local_nonprim);
        connector_ping_interval_local_nonprim = NULL;
    }
    if (discovery_lite_check_interval_local_nonprim) {
        config_node_property_integer_free(discovery_lite_check_interval_local_nonprim);
        discovery_lite_check_interval_local_nonprim = NULL;
    }
    if (cluster_sync_service_timeout_local_nonprim) {
        config_node_property_integer_free(cluster_sync_service_timeout_local_nonprim);
        cluster_sync_service_timeout_local_nonprim = NULL;
    }
    if (cluster_sync_service_interval_local_nonprim) {
        config_node_property_integer_free(cluster_sync_service_interval_local_nonprim);
        cluster_sync_service_interval_local_nonprim = NULL;
    }
    if (enable_sync_token_local_nonprim) {
        config_node_property_boolean_free(enable_sync_token_local_nonprim);
        enable_sync_token_local_nonprim = NULL;
    }
    if (min_event_delay_local_nonprim) {
        config_node_property_integer_free(min_event_delay_local_nonprim);
        min_event_delay_local_nonprim = NULL;
    }
    if (socket_connect_timeout_local_nonprim) {
        config_node_property_integer_free(socket_connect_timeout_local_nonprim);
        socket_connect_timeout_local_nonprim = NULL;
    }
    if (so_timeout_local_nonprim) {
        config_node_property_integer_free(so_timeout_local_nonprim);
        so_timeout_local_nonprim = NULL;
    }
    if (topology_connector_urls_local_nonprim) {
        config_node_property_array_free(topology_connector_urls_local_nonprim);
        topology_connector_urls_local_nonprim = NULL;
    }
    if (topology_connector_whitelist_local_nonprim) {
        config_node_property_array_free(topology_connector_whitelist_local_nonprim);
        topology_connector_whitelist_local_nonprim = NULL;
    }
    if (auto_stop_local_loop_enabled_local_nonprim) {
        config_node_property_boolean_free(auto_stop_local_loop_enabled_local_nonprim);
        auto_stop_local_loop_enabled_local_nonprim = NULL;
    }
    if (gzip_connector_requests_enabled_local_nonprim) {
        config_node_property_boolean_free(gzip_connector_requests_enabled_local_nonprim);
        gzip_connector_requests_enabled_local_nonprim = NULL;
    }
    if (hmac_enabled_local_nonprim) {
        config_node_property_boolean_free(hmac_enabled_local_nonprim);
        hmac_enabled_local_nonprim = NULL;
    }
    if (enable_encryption_local_nonprim) {
        config_node_property_boolean_free(enable_encryption_local_nonprim);
        enable_encryption_local_nonprim = NULL;
    }
    if (shared_key_local_nonprim) {
        config_node_property_string_free(shared_key_local_nonprim);
        shared_key_local_nonprim = NULL;
    }
    if (hmac_shared_key_ttl_local_nonprim) {
        config_node_property_integer_free(hmac_shared_key_ttl_local_nonprim);
        hmac_shared_key_ttl_local_nonprim = NULL;
    }
    if (backoff_standby_factor_local_nonprim) {
        config_node_property_string_free(backoff_standby_factor_local_nonprim);
        backoff_standby_factor_local_nonprim = NULL;
    }
    if (backoff_stable_factor_local_nonprim) {
        config_node_property_string_free(backoff_stable_factor_local_nonprim);
        backoff_stable_factor_local_nonprim = NULL;
    }
    return NULL;

}
