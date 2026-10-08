#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties.h"



static org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_t *org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_string_t *title,
    config_node_property_string_t *details,
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *service_name,
    config_node_property_drop_down_t *log_level,
    config_node_property_array_t *allowed_roots,
    config_node_property_string_t *request_authorization_strategy_target,
    config_node_property_string_t *queue_provider_factory_target,
    config_node_property_string_t *package_builder_target,
    config_node_property_string_t *triggers_target,
    config_node_property_array_t *priority_queues
    ) {
    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_t *org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var = malloc(sizeof(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_t));
    if (!org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var, 0, sizeof(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_t));
    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var->_library_owned = 1;
    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var->name = name;
    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var->title = title;
    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var->details = details;
    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var->enabled = enabled;
    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var->service_name = service_name;
    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var->log_level = log_level;
    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var->allowed_roots = allowed_roots;
    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var->request_authorization_strategy_target = request_authorization_strategy_target;
    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var->queue_provider_factory_target = queue_provider_factory_target;
    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var->package_builder_target = package_builder_target;
    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var->triggers_target = triggers_target;
    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var->priority_queues = priority_queues;
    return org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_t *org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *title,
    config_node_property_string_t *details,
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *service_name,
    config_node_property_drop_down_t *log_level,
    config_node_property_array_t *allowed_roots,
    config_node_property_string_t *request_authorization_strategy_target,
    config_node_property_string_t *queue_provider_factory_target,
    config_node_property_string_t *package_builder_target,
    config_node_property_string_t *triggers_target,
    config_node_property_array_t *priority_queues
    ) {
    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_t *result = org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_create_internal (
        name,
        title,
        details,
        enabled,
        service_name,
        log_level,
        allowed_roots,
        request_authorization_strategy_target,
        queue_provider_factory_target,
        package_builder_target,
        triggers_target,
        priority_queues
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_free(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_t *org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties) {
    if(NULL == org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties){
        return ;
    }
    if(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->name) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->name);
        org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->name = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->title) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->title);
        org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->title = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->details) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->details);
        org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->details = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->enabled) {
        config_node_property_boolean_free(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->enabled);
        org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->enabled = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->service_name) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->service_name);
        org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->service_name = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->log_level) {
        config_node_property_drop_down_free(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->log_level);
        org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->log_level = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->allowed_roots) {
        config_node_property_array_free(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->allowed_roots);
        org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->allowed_roots = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->request_authorization_strategy_target) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->request_authorization_strategy_target);
        org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->request_authorization_strategy_target = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->queue_provider_factory_target) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->queue_provider_factory_target);
        org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->queue_provider_factory_target = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->package_builder_target) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->package_builder_target);
        org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->package_builder_target = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->triggers_target) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->triggers_target);
        org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->triggers_target = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->priority_queues) {
        config_node_property_array_free(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->priority_queues);
        org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->priority_queues = NULL;
    }
    free(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties);
}

cJSON *org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_convertToJSON(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_t *org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->name
    if(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->title
    if(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->title) {
    cJSON *title_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->title);
    if(title_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "title", title_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->details
    if(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->details) {
    cJSON *details_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->details);
    if(details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "details", details_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->enabled
    if(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->service_name
    if(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->service_name) {
    cJSON *service_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->service_name);
    if(service_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "serviceName", service_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->log_level
    if(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->log_level) {
    cJSON *log_level_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->log_level);
    if(log_level_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "log.level", log_level_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->allowed_roots
    if(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->allowed_roots) {
    cJSON *allowed_roots_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->allowed_roots);
    if(allowed_roots_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "allowed.roots", allowed_roots_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->request_authorization_strategy_target
    if(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->request_authorization_strategy_target) {
    cJSON *request_authorization_strategy_target_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->request_authorization_strategy_target);
    if(request_authorization_strategy_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "requestAuthorizationStrategy.target", request_authorization_strategy_target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->queue_provider_factory_target
    if(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->queue_provider_factory_target) {
    cJSON *queue_provider_factory_target_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->queue_provider_factory_target);
    if(queue_provider_factory_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queueProviderFactory.target", queue_provider_factory_target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->package_builder_target
    if(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->package_builder_target) {
    cJSON *package_builder_target_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->package_builder_target);
    if(package_builder_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "packageBuilder.target", package_builder_target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->triggers_target
    if(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->triggers_target) {
    cJSON *triggers_target_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->triggers_target);
    if(triggers_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "triggers.target", triggers_target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->priority_queues
    if(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->priority_queues) {
    cJSON *priority_queues_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->priority_queues);
    if(priority_queues_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "priorityQueues", priority_queues_local_JSON);
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

org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_t *org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_parseFromJSON(cJSON *org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_propertiesJSON){

    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_t *org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->title
    config_node_property_string_t *title_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->details
    config_node_property_string_t *details_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->service_name
    config_node_property_string_t *service_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->log_level
    config_node_property_drop_down_t *log_level_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->allowed_roots
    config_node_property_array_t *allowed_roots_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->request_authorization_strategy_target
    config_node_property_string_t *request_authorization_strategy_target_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->queue_provider_factory_target
    config_node_property_string_t *queue_provider_factory_target_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->package_builder_target
    config_node_property_string_t *package_builder_target_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->triggers_target
    config_node_property_string_t *triggers_target_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->priority_queues
    config_node_property_array_t *priority_queues_local_nonprim = NULL;

    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_propertiesJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    title_local_nonprim = config_node_property_string_parseFromJSON(title); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->details
    cJSON *details = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_propertiesJSON, "details");
    if (cJSON_IsNull(details)) {
        details = NULL;
    }
    if (details) { 
    details_local_nonprim = config_node_property_string_parseFromJSON(details); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->service_name
    cJSON *service_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_propertiesJSON, "serviceName");
    if (cJSON_IsNull(service_name)) {
        service_name = NULL;
    }
    if (service_name) { 
    service_name_local_nonprim = config_node_property_string_parseFromJSON(service_name); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->log_level
    cJSON *log_level = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_propertiesJSON, "log.level");
    if (cJSON_IsNull(log_level)) {
        log_level = NULL;
    }
    if (log_level) { 
    log_level_local_nonprim = config_node_property_drop_down_parseFromJSON(log_level); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->allowed_roots
    cJSON *allowed_roots = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_propertiesJSON, "allowed.roots");
    if (cJSON_IsNull(allowed_roots)) {
        allowed_roots = NULL;
    }
    if (allowed_roots) { 
    allowed_roots_local_nonprim = config_node_property_array_parseFromJSON(allowed_roots); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->request_authorization_strategy_target
    cJSON *request_authorization_strategy_target = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_propertiesJSON, "requestAuthorizationStrategy.target");
    if (cJSON_IsNull(request_authorization_strategy_target)) {
        request_authorization_strategy_target = NULL;
    }
    if (request_authorization_strategy_target) { 
    request_authorization_strategy_target_local_nonprim = config_node_property_string_parseFromJSON(request_authorization_strategy_target); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->queue_provider_factory_target
    cJSON *queue_provider_factory_target = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_propertiesJSON, "queueProviderFactory.target");
    if (cJSON_IsNull(queue_provider_factory_target)) {
        queue_provider_factory_target = NULL;
    }
    if (queue_provider_factory_target) { 
    queue_provider_factory_target_local_nonprim = config_node_property_string_parseFromJSON(queue_provider_factory_target); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->package_builder_target
    cJSON *package_builder_target = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_propertiesJSON, "packageBuilder.target");
    if (cJSON_IsNull(package_builder_target)) {
        package_builder_target = NULL;
    }
    if (package_builder_target) { 
    package_builder_target_local_nonprim = config_node_property_string_parseFromJSON(package_builder_target); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->triggers_target
    cJSON *triggers_target = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_propertiesJSON, "triggers.target");
    if (cJSON_IsNull(triggers_target)) {
        triggers_target = NULL;
    }
    if (triggers_target) { 
    triggers_target_local_nonprim = config_node_property_string_parseFromJSON(triggers_target); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties->priority_queues
    cJSON *priority_queues = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_propertiesJSON, "priorityQueues");
    if (cJSON_IsNull(priority_queues)) {
        priority_queues = NULL;
    }
    if (priority_queues) { 
    priority_queues_local_nonprim = config_node_property_array_parseFromJSON(priority_queues); //nonprimitive
    }



    org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var = org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_create_internal (
        name ? name_local_nonprim : NULL,
        title ? title_local_nonprim : NULL,
        details ? details_local_nonprim : NULL,
        enabled ? enabled_local_nonprim : NULL,
        service_name ? service_name_local_nonprim : NULL,
        log_level ? log_level_local_nonprim : NULL,
        allowed_roots ? allowed_roots_local_nonprim : NULL,
        request_authorization_strategy_target ? request_authorization_strategy_target_local_nonprim : NULL,
        queue_provider_factory_target ? queue_provider_factory_target_local_nonprim : NULL,
        package_builder_target ? package_builder_target_local_nonprim : NULL,
        triggers_target ? triggers_target_local_nonprim : NULL,
        priority_queues ? priority_queues_local_nonprim : NULL
        );

    if (!org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var) {
        goto end;
    }

    return org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties_local_var;
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
    if (request_authorization_strategy_target_local_nonprim) {
        config_node_property_string_free(request_authorization_strategy_target_local_nonprim);
        request_authorization_strategy_target_local_nonprim = NULL;
    }
    if (queue_provider_factory_target_local_nonprim) {
        config_node_property_string_free(queue_provider_factory_target_local_nonprim);
        queue_provider_factory_target_local_nonprim = NULL;
    }
    if (package_builder_target_local_nonprim) {
        config_node_property_string_free(package_builder_target_local_nonprim);
        package_builder_target_local_nonprim = NULL;
    }
    if (triggers_target_local_nonprim) {
        config_node_property_string_free(triggers_target_local_nonprim);
        triggers_target_local_nonprim = NULL;
    }
    if (priority_queues_local_nonprim) {
        config_node_property_array_free(priority_queues_local_nonprim);
        priority_queues_local_nonprim = NULL;
    }
    return NULL;

}
