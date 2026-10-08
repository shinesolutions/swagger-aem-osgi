#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties.h"



static org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_t *org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_string_t *title,
    config_node_property_string_t *details,
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *service_name,
    config_node_property_drop_down_t *log_level,
    config_node_property_array_t *allowed_roots,
    config_node_property_boolean_t *queue_processing_enabled,
    config_node_property_array_t *package_importer_endpoints,
    config_node_property_array_t *passive_queues,
    config_node_property_array_t *priority_queues,
    config_node_property_drop_down_t *retry_strategy,
    config_node_property_integer_t *retry_attempts,
    config_node_property_string_t *request_authorization_strategy_target,
    config_node_property_string_t *transport_secret_provider_target,
    config_node_property_string_t *package_builder_target,
    config_node_property_string_t *triggers_target,
    config_node_property_drop_down_t *queue_provider,
    config_node_property_boolean_t *async_delivery,
    config_node_property_integer_t *http_conn_timeout
    ) {
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_t *org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var = malloc(sizeof(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_t));
    if (!org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var, 0, sizeof(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_t));
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->_library_owned = 1;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->name = name;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->title = title;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->details = details;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->enabled = enabled;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->service_name = service_name;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->log_level = log_level;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->allowed_roots = allowed_roots;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->queue_processing_enabled = queue_processing_enabled;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->package_importer_endpoints = package_importer_endpoints;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->passive_queues = passive_queues;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->priority_queues = priority_queues;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->retry_strategy = retry_strategy;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->retry_attempts = retry_attempts;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->request_authorization_strategy_target = request_authorization_strategy_target;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->transport_secret_provider_target = transport_secret_provider_target;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->package_builder_target = package_builder_target;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->triggers_target = triggers_target;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->queue_provider = queue_provider;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->async_delivery = async_delivery;
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var->http_conn_timeout = http_conn_timeout;
    return org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_t *org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *title,
    config_node_property_string_t *details,
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *service_name,
    config_node_property_drop_down_t *log_level,
    config_node_property_array_t *allowed_roots,
    config_node_property_boolean_t *queue_processing_enabled,
    config_node_property_array_t *package_importer_endpoints,
    config_node_property_array_t *passive_queues,
    config_node_property_array_t *priority_queues,
    config_node_property_drop_down_t *retry_strategy,
    config_node_property_integer_t *retry_attempts,
    config_node_property_string_t *request_authorization_strategy_target,
    config_node_property_string_t *transport_secret_provider_target,
    config_node_property_string_t *package_builder_target,
    config_node_property_string_t *triggers_target,
    config_node_property_drop_down_t *queue_provider,
    config_node_property_boolean_t *async_delivery,
    config_node_property_integer_t *http_conn_timeout
    ) {
    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_t *result = org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_create_internal (
        name,
        title,
        details,
        enabled,
        service_name,
        log_level,
        allowed_roots,
        queue_processing_enabled,
        package_importer_endpoints,
        passive_queues,
        priority_queues,
        retry_strategy,
        retry_attempts,
        request_authorization_strategy_target,
        transport_secret_provider_target,
        package_builder_target,
        triggers_target,
        queue_provider,
        async_delivery,
        http_conn_timeout
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_t *org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties) {
    if(NULL == org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties){
        return ;
    }
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->name) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->name);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->name = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->title) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->title);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->title = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->details) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->details);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->details = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->enabled) {
        config_node_property_boolean_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->enabled);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->enabled = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->service_name) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->service_name);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->service_name = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->log_level) {
        config_node_property_drop_down_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->log_level);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->log_level = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->allowed_roots) {
        config_node_property_array_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->allowed_roots);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->allowed_roots = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_processing_enabled) {
        config_node_property_boolean_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_processing_enabled);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_processing_enabled = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_importer_endpoints) {
        config_node_property_array_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_importer_endpoints);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_importer_endpoints = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->passive_queues) {
        config_node_property_array_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->passive_queues);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->passive_queues = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->priority_queues) {
        config_node_property_array_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->priority_queues);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->priority_queues = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_strategy) {
        config_node_property_drop_down_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_strategy);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_strategy = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_attempts) {
        config_node_property_integer_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_attempts);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_attempts = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->request_authorization_strategy_target) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->request_authorization_strategy_target);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->request_authorization_strategy_target = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->transport_secret_provider_target) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->transport_secret_provider_target);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->transport_secret_provider_target = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_builder_target) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_builder_target);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_builder_target = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->triggers_target) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->triggers_target);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->triggers_target = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_provider) {
        config_node_property_drop_down_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_provider);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_provider = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->async_delivery) {
        config_node_property_boolean_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->async_delivery);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->async_delivery = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->http_conn_timeout) {
        config_node_property_integer_free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->http_conn_timeout);
        org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->http_conn_timeout = NULL;
    }
    free(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties);
}

cJSON *org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_t *org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->name
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->title
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->title) {
    cJSON *title_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->title);
    if(title_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "title", title_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->details
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->details) {
    cJSON *details_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->details);
    if(details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "details", details_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->enabled
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->service_name
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->service_name) {
    cJSON *service_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->service_name);
    if(service_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "serviceName", service_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->log_level
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->log_level) {
    cJSON *log_level_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->log_level);
    if(log_level_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "log.level", log_level_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->allowed_roots
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->allowed_roots) {
    cJSON *allowed_roots_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->allowed_roots);
    if(allowed_roots_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "allowed.roots", allowed_roots_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_processing_enabled
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_processing_enabled) {
    cJSON *queue_processing_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_processing_enabled);
    if(queue_processing_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.processing.enabled", queue_processing_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_importer_endpoints
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_importer_endpoints) {
    cJSON *package_importer_endpoints_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_importer_endpoints);
    if(package_importer_endpoints_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "packageImporter.endpoints", package_importer_endpoints_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->passive_queues
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->passive_queues) {
    cJSON *passive_queues_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->passive_queues);
    if(passive_queues_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "passiveQueues", passive_queues_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->priority_queues
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->priority_queues) {
    cJSON *priority_queues_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->priority_queues);
    if(priority_queues_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "priorityQueues", priority_queues_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_strategy
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_strategy) {
    cJSON *retry_strategy_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_strategy);
    if(retry_strategy_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "retry.strategy", retry_strategy_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_attempts
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_attempts) {
    cJSON *retry_attempts_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_attempts);
    if(retry_attempts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "retry.attempts", retry_attempts_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->request_authorization_strategy_target
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->request_authorization_strategy_target) {
    cJSON *request_authorization_strategy_target_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->request_authorization_strategy_target);
    if(request_authorization_strategy_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "requestAuthorizationStrategy.target", request_authorization_strategy_target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->transport_secret_provider_target
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->transport_secret_provider_target) {
    cJSON *transport_secret_provider_target_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->transport_secret_provider_target);
    if(transport_secret_provider_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "transportSecretProvider.target", transport_secret_provider_target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_builder_target
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_builder_target) {
    cJSON *package_builder_target_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_builder_target);
    if(package_builder_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "packageBuilder.target", package_builder_target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->triggers_target
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->triggers_target) {
    cJSON *triggers_target_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->triggers_target);
    if(triggers_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "triggers.target", triggers_target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_provider
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_provider) {
    cJSON *queue_provider_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_provider);
    if(queue_provider_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.provider", queue_provider_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->async_delivery
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->async_delivery) {
    cJSON *async_delivery_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->async_delivery);
    if(async_delivery_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "async.delivery", async_delivery_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->http_conn_timeout
    if(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->http_conn_timeout) {
    cJSON *http_conn_timeout_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->http_conn_timeout);
    if(http_conn_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "http.conn.timeout", http_conn_timeout_local_JSON);
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

org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_t *org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_parseFromJSON(cJSON *org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON){

    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_t *org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->title
    config_node_property_string_t *title_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->details
    config_node_property_string_t *details_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->service_name
    config_node_property_string_t *service_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->log_level
    config_node_property_drop_down_t *log_level_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->allowed_roots
    config_node_property_array_t *allowed_roots_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_processing_enabled
    config_node_property_boolean_t *queue_processing_enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_importer_endpoints
    config_node_property_array_t *package_importer_endpoints_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->passive_queues
    config_node_property_array_t *passive_queues_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->priority_queues
    config_node_property_array_t *priority_queues_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_strategy
    config_node_property_drop_down_t *retry_strategy_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_attempts
    config_node_property_integer_t *retry_attempts_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->request_authorization_strategy_target
    config_node_property_string_t *request_authorization_strategy_target_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->transport_secret_provider_target
    config_node_property_string_t *transport_secret_provider_target_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_builder_target
    config_node_property_string_t *package_builder_target_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->triggers_target
    config_node_property_string_t *triggers_target_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_provider
    config_node_property_drop_down_t *queue_provider_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->async_delivery
    config_node_property_boolean_t *async_delivery_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->http_conn_timeout
    config_node_property_integer_t *http_conn_timeout_local_nonprim = NULL;

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    title_local_nonprim = config_node_property_string_parseFromJSON(title); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->details
    cJSON *details = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "details");
    if (cJSON_IsNull(details)) {
        details = NULL;
    }
    if (details) { 
    details_local_nonprim = config_node_property_string_parseFromJSON(details); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->service_name
    cJSON *service_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "serviceName");
    if (cJSON_IsNull(service_name)) {
        service_name = NULL;
    }
    if (service_name) { 
    service_name_local_nonprim = config_node_property_string_parseFromJSON(service_name); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->log_level
    cJSON *log_level = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "log.level");
    if (cJSON_IsNull(log_level)) {
        log_level = NULL;
    }
    if (log_level) { 
    log_level_local_nonprim = config_node_property_drop_down_parseFromJSON(log_level); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->allowed_roots
    cJSON *allowed_roots = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "allowed.roots");
    if (cJSON_IsNull(allowed_roots)) {
        allowed_roots = NULL;
    }
    if (allowed_roots) { 
    allowed_roots_local_nonprim = config_node_property_array_parseFromJSON(allowed_roots); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_processing_enabled
    cJSON *queue_processing_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "queue.processing.enabled");
    if (cJSON_IsNull(queue_processing_enabled)) {
        queue_processing_enabled = NULL;
    }
    if (queue_processing_enabled) { 
    queue_processing_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(queue_processing_enabled); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_importer_endpoints
    cJSON *package_importer_endpoints = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "packageImporter.endpoints");
    if (cJSON_IsNull(package_importer_endpoints)) {
        package_importer_endpoints = NULL;
    }
    if (package_importer_endpoints) { 
    package_importer_endpoints_local_nonprim = config_node_property_array_parseFromJSON(package_importer_endpoints); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->passive_queues
    cJSON *passive_queues = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "passiveQueues");
    if (cJSON_IsNull(passive_queues)) {
        passive_queues = NULL;
    }
    if (passive_queues) { 
    passive_queues_local_nonprim = config_node_property_array_parseFromJSON(passive_queues); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->priority_queues
    cJSON *priority_queues = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "priorityQueues");
    if (cJSON_IsNull(priority_queues)) {
        priority_queues = NULL;
    }
    if (priority_queues) { 
    priority_queues_local_nonprim = config_node_property_array_parseFromJSON(priority_queues); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_strategy
    cJSON *retry_strategy = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "retry.strategy");
    if (cJSON_IsNull(retry_strategy)) {
        retry_strategy = NULL;
    }
    if (retry_strategy) { 
    retry_strategy_local_nonprim = config_node_property_drop_down_parseFromJSON(retry_strategy); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->retry_attempts
    cJSON *retry_attempts = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "retry.attempts");
    if (cJSON_IsNull(retry_attempts)) {
        retry_attempts = NULL;
    }
    if (retry_attempts) { 
    retry_attempts_local_nonprim = config_node_property_integer_parseFromJSON(retry_attempts); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->request_authorization_strategy_target
    cJSON *request_authorization_strategy_target = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "requestAuthorizationStrategy.target");
    if (cJSON_IsNull(request_authorization_strategy_target)) {
        request_authorization_strategy_target = NULL;
    }
    if (request_authorization_strategy_target) { 
    request_authorization_strategy_target_local_nonprim = config_node_property_string_parseFromJSON(request_authorization_strategy_target); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->transport_secret_provider_target
    cJSON *transport_secret_provider_target = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "transportSecretProvider.target");
    if (cJSON_IsNull(transport_secret_provider_target)) {
        transport_secret_provider_target = NULL;
    }
    if (transport_secret_provider_target) { 
    transport_secret_provider_target_local_nonprim = config_node_property_string_parseFromJSON(transport_secret_provider_target); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->package_builder_target
    cJSON *package_builder_target = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "packageBuilder.target");
    if (cJSON_IsNull(package_builder_target)) {
        package_builder_target = NULL;
    }
    if (package_builder_target) { 
    package_builder_target_local_nonprim = config_node_property_string_parseFromJSON(package_builder_target); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->triggers_target
    cJSON *triggers_target = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "triggers.target");
    if (cJSON_IsNull(triggers_target)) {
        triggers_target = NULL;
    }
    if (triggers_target) { 
    triggers_target_local_nonprim = config_node_property_string_parseFromJSON(triggers_target); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->queue_provider
    cJSON *queue_provider = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "queue.provider");
    if (cJSON_IsNull(queue_provider)) {
        queue_provider = NULL;
    }
    if (queue_provider) { 
    queue_provider_local_nonprim = config_node_property_drop_down_parseFromJSON(queue_provider); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->async_delivery
    cJSON *async_delivery = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "async.delivery");
    if (cJSON_IsNull(async_delivery)) {
        async_delivery = NULL;
    }
    if (async_delivery) { 
    async_delivery_local_nonprim = config_node_property_boolean_parseFromJSON(async_delivery); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties->http_conn_timeout
    cJSON *http_conn_timeout = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_propertiesJSON, "http.conn.timeout");
    if (cJSON_IsNull(http_conn_timeout)) {
        http_conn_timeout = NULL;
    }
    if (http_conn_timeout) { 
    http_conn_timeout_local_nonprim = config_node_property_integer_parseFromJSON(http_conn_timeout); //nonprimitive
    }



    org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var = org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_create_internal (
        name ? name_local_nonprim : NULL,
        title ? title_local_nonprim : NULL,
        details ? details_local_nonprim : NULL,
        enabled ? enabled_local_nonprim : NULL,
        service_name ? service_name_local_nonprim : NULL,
        log_level ? log_level_local_nonprim : NULL,
        allowed_roots ? allowed_roots_local_nonprim : NULL,
        queue_processing_enabled ? queue_processing_enabled_local_nonprim : NULL,
        package_importer_endpoints ? package_importer_endpoints_local_nonprim : NULL,
        passive_queues ? passive_queues_local_nonprim : NULL,
        priority_queues ? priority_queues_local_nonprim : NULL,
        retry_strategy ? retry_strategy_local_nonprim : NULL,
        retry_attempts ? retry_attempts_local_nonprim : NULL,
        request_authorization_strategy_target ? request_authorization_strategy_target_local_nonprim : NULL,
        transport_secret_provider_target ? transport_secret_provider_target_local_nonprim : NULL,
        package_builder_target ? package_builder_target_local_nonprim : NULL,
        triggers_target ? triggers_target_local_nonprim : NULL,
        queue_provider ? queue_provider_local_nonprim : NULL,
        async_delivery ? async_delivery_local_nonprim : NULL,
        http_conn_timeout ? http_conn_timeout_local_nonprim : NULL
        );

    if (!org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var) {
        goto end;
    }

    return org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties_local_var;
end:
    if (name_local_nonprim) {
        config_node_property_string_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    if (title_local_nonprim) {
        config_node_property_string_free(title_local_nonprim);
        title_local_nonprim = NULL;
    }
    if (details_local_nonprim) {
        config_node_property_string_free(details_local_nonprim);
        details_local_nonprim = NULL;
    }
    if (enabled_local_nonprim) {
        config_node_property_boolean_free(enabled_local_nonprim);
        enabled_local_nonprim = NULL;
    }
    if (service_name_local_nonprim) {
        config_node_property_string_free(service_name_local_nonprim);
        service_name_local_nonprim = NULL;
    }
    if (log_level_local_nonprim) {
        config_node_property_drop_down_free(log_level_local_nonprim);
        log_level_local_nonprim = NULL;
    }
    if (allowed_roots_local_nonprim) {
        config_node_property_array_free(allowed_roots_local_nonprim);
        allowed_roots_local_nonprim = NULL;
    }
    if (queue_processing_enabled_local_nonprim) {
        config_node_property_boolean_free(queue_processing_enabled_local_nonprim);
        queue_processing_enabled_local_nonprim = NULL;
    }
    if (package_importer_endpoints_local_nonprim) {
        config_node_property_array_free(package_importer_endpoints_local_nonprim);
        package_importer_endpoints_local_nonprim = NULL;
    }
    if (passive_queues_local_nonprim) {
        config_node_property_array_free(passive_queues_local_nonprim);
        passive_queues_local_nonprim = NULL;
    }
    if (priority_queues_local_nonprim) {
        config_node_property_array_free(priority_queues_local_nonprim);
        priority_queues_local_nonprim = NULL;
    }
    if (retry_strategy_local_nonprim) {
        config_node_property_drop_down_free(retry_strategy_local_nonprim);
        retry_strategy_local_nonprim = NULL;
    }
    if (retry_attempts_local_nonprim) {
        config_node_property_integer_free(retry_attempts_local_nonprim);
        retry_attempts_local_nonprim = NULL;
    }
    if (request_authorization_strategy_target_local_nonprim) {
        config_node_property_string_free(request_authorization_strategy_target_local_nonprim);
        request_authorization_strategy_target_local_nonprim = NULL;
    }
    if (transport_secret_provider_target_local_nonprim) {
        config_node_property_string_free(transport_secret_provider_target_local_nonprim);
        transport_secret_provider_target_local_nonprim = NULL;
    }
    if (package_builder_target_local_nonprim) {
        config_node_property_string_free(package_builder_target_local_nonprim);
        package_builder_target_local_nonprim = NULL;
    }
    if (triggers_target_local_nonprim) {
        config_node_property_string_free(triggers_target_local_nonprim);
        triggers_target_local_nonprim = NULL;
    }
    if (queue_provider_local_nonprim) {
        config_node_property_drop_down_free(queue_provider_local_nonprim);
        queue_provider_local_nonprim = NULL;
    }
    if (async_delivery_local_nonprim) {
        config_node_property_boolean_free(async_delivery_local_nonprim);
        async_delivery_local_nonprim = NULL;
    }
    if (http_conn_timeout_local_nonprim) {
        config_node_property_integer_free(http_conn_timeout_local_nonprim);
        http_conn_timeout_local_nonprim = NULL;
    }
    return NULL;

}
