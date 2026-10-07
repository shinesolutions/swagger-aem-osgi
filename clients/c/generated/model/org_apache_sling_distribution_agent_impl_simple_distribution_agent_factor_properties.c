#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties.h"



static org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_t *org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_string_t *title,
    config_node_property_string_t *details,
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *service_name,
    config_node_property_drop_down_t *log_level,
    config_node_property_boolean_t *queue_processing_enabled,
    config_node_property_string_t *package_exporter_target,
    config_node_property_string_t *package_importer_target,
    config_node_property_string_t *request_authorization_strategy_target,
    config_node_property_string_t *triggers_target
    ) {
    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_t *org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var = malloc(sizeof(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_t));
    if (!org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var, 0, sizeof(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_t));
    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var->_library_owned = 1;
    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var->name = name;
    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var->title = title;
    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var->details = details;
    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var->enabled = enabled;
    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var->service_name = service_name;
    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var->log_level = log_level;
    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var->queue_processing_enabled = queue_processing_enabled;
    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var->package_exporter_target = package_exporter_target;
    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var->package_importer_target = package_importer_target;
    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var->request_authorization_strategy_target = request_authorization_strategy_target;
    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var->triggers_target = triggers_target;
    return org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_t *org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *title,
    config_node_property_string_t *details,
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *service_name,
    config_node_property_drop_down_t *log_level,
    config_node_property_boolean_t *queue_processing_enabled,
    config_node_property_string_t *package_exporter_target,
    config_node_property_string_t *package_importer_target,
    config_node_property_string_t *request_authorization_strategy_target,
    config_node_property_string_t *triggers_target
    ) {
    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_t *result = org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_create_internal (
        name,
        title,
        details,
        enabled,
        service_name,
        log_level,
        queue_processing_enabled,
        package_exporter_target,
        package_importer_target,
        request_authorization_strategy_target,
        triggers_target
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_free(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_t *org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties) {
    if(NULL == org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties){
        return ;
    }
    if(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->name) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->name);
        org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->name = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->title) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->title);
        org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->title = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->details) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->details);
        org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->details = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->enabled) {
        config_node_property_boolean_free(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->enabled);
        org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->enabled = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->service_name) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->service_name);
        org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->service_name = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->log_level) {
        config_node_property_drop_down_free(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->log_level);
        org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->log_level = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->queue_processing_enabled) {
        config_node_property_boolean_free(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->queue_processing_enabled);
        org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->queue_processing_enabled = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_exporter_target) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_exporter_target);
        org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_exporter_target = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_importer_target) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_importer_target);
        org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_importer_target = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->request_authorization_strategy_target) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->request_authorization_strategy_target);
        org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->request_authorization_strategy_target = NULL;
    }
    if (org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->triggers_target) {
        config_node_property_string_free(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->triggers_target);
        org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->triggers_target = NULL;
    }
    free(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties);
}

cJSON *org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_convertToJSON(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_t *org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->name
    if(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->title
    if(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->title) {
    cJSON *title_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->title);
    if(title_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "title", title_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->details
    if(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->details) {
    cJSON *details_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->details);
    if(details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "details", details_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->enabled
    if(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->service_name
    if(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->service_name) {
    cJSON *service_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->service_name);
    if(service_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "serviceName", service_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->log_level
    if(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->log_level) {
    cJSON *log_level_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->log_level);
    if(log_level_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "log.level", log_level_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->queue_processing_enabled
    if(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->queue_processing_enabled) {
    cJSON *queue_processing_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->queue_processing_enabled);
    if(queue_processing_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.processing.enabled", queue_processing_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_exporter_target
    if(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_exporter_target) {
    cJSON *package_exporter_target_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_exporter_target);
    if(package_exporter_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "packageExporter.target", package_exporter_target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_importer_target
    if(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_importer_target) {
    cJSON *package_importer_target_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_importer_target);
    if(package_importer_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "packageImporter.target", package_importer_target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->request_authorization_strategy_target
    if(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->request_authorization_strategy_target) {
    cJSON *request_authorization_strategy_target_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->request_authorization_strategy_target);
    if(request_authorization_strategy_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "requestAuthorizationStrategy.target", request_authorization_strategy_target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->triggers_target
    if(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->triggers_target) {
    cJSON *triggers_target_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->triggers_target);
    if(triggers_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "triggers.target", triggers_target_local_JSON);
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

org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_t *org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_parseFromJSON(cJSON *org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_propertiesJSON){

    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_t *org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->title
    config_node_property_string_t *title_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->details
    config_node_property_string_t *details_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->service_name
    config_node_property_string_t *service_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->log_level
    config_node_property_drop_down_t *log_level_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->queue_processing_enabled
    config_node_property_boolean_t *queue_processing_enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_exporter_target
    config_node_property_string_t *package_exporter_target_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_importer_target
    config_node_property_string_t *package_importer_target_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->request_authorization_strategy_target
    config_node_property_string_t *request_authorization_strategy_target_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->triggers_target
    config_node_property_string_t *triggers_target_local_nonprim = NULL;

    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_propertiesJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    title_local_nonprim = config_node_property_string_parseFromJSON(title); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->details
    cJSON *details = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_propertiesJSON, "details");
    if (cJSON_IsNull(details)) {
        details = NULL;
    }
    if (details) { 
    details_local_nonprim = config_node_property_string_parseFromJSON(details); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->service_name
    cJSON *service_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_propertiesJSON, "serviceName");
    if (cJSON_IsNull(service_name)) {
        service_name = NULL;
    }
    if (service_name) { 
    service_name_local_nonprim = config_node_property_string_parseFromJSON(service_name); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->log_level
    cJSON *log_level = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_propertiesJSON, "log.level");
    if (cJSON_IsNull(log_level)) {
        log_level = NULL;
    }
    if (log_level) { 
    log_level_local_nonprim = config_node_property_drop_down_parseFromJSON(log_level); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->queue_processing_enabled
    cJSON *queue_processing_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_propertiesJSON, "queue.processing.enabled");
    if (cJSON_IsNull(queue_processing_enabled)) {
        queue_processing_enabled = NULL;
    }
    if (queue_processing_enabled) { 
    queue_processing_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(queue_processing_enabled); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_exporter_target
    cJSON *package_exporter_target = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_propertiesJSON, "packageExporter.target");
    if (cJSON_IsNull(package_exporter_target)) {
        package_exporter_target = NULL;
    }
    if (package_exporter_target) { 
    package_exporter_target_local_nonprim = config_node_property_string_parseFromJSON(package_exporter_target); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->package_importer_target
    cJSON *package_importer_target = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_propertiesJSON, "packageImporter.target");
    if (cJSON_IsNull(package_importer_target)) {
        package_importer_target = NULL;
    }
    if (package_importer_target) { 
    package_importer_target_local_nonprim = config_node_property_string_parseFromJSON(package_importer_target); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->request_authorization_strategy_target
    cJSON *request_authorization_strategy_target = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_propertiesJSON, "requestAuthorizationStrategy.target");
    if (cJSON_IsNull(request_authorization_strategy_target)) {
        request_authorization_strategy_target = NULL;
    }
    if (request_authorization_strategy_target) { 
    request_authorization_strategy_target_local_nonprim = config_node_property_string_parseFromJSON(request_authorization_strategy_target); //nonprimitive
    }

    // org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties->triggers_target
    cJSON *triggers_target = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_propertiesJSON, "triggers.target");
    if (cJSON_IsNull(triggers_target)) {
        triggers_target = NULL;
    }
    if (triggers_target) { 
    triggers_target_local_nonprim = config_node_property_string_parseFromJSON(triggers_target); //nonprimitive
    }



    org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var = org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_create_internal (
        name ? name_local_nonprim : NULL,
        title ? title_local_nonprim : NULL,
        details ? details_local_nonprim : NULL,
        enabled ? enabled_local_nonprim : NULL,
        service_name ? service_name_local_nonprim : NULL,
        log_level ? log_level_local_nonprim : NULL,
        queue_processing_enabled ? queue_processing_enabled_local_nonprim : NULL,
        package_exporter_target ? package_exporter_target_local_nonprim : NULL,
        package_importer_target ? package_importer_target_local_nonprim : NULL,
        request_authorization_strategy_target ? request_authorization_strategy_target_local_nonprim : NULL,
        triggers_target ? triggers_target_local_nonprim : NULL
        );

    if (!org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var) {
        goto end;
    }

    return org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties_local_var;
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
    if (queue_processing_enabled_local_nonprim) {
        config_node_property_boolean_free(queue_processing_enabled_local_nonprim);
        queue_processing_enabled_local_nonprim = NULL;
    }
    if (package_exporter_target_local_nonprim) {
        config_node_property_string_free(package_exporter_target_local_nonprim);
        package_exporter_target_local_nonprim = NULL;
    }
    if (package_importer_target_local_nonprim) {
        config_node_property_string_free(package_importer_target_local_nonprim);
        package_importer_target_local_nonprim = NULL;
    }
    if (request_authorization_strategy_target_local_nonprim) {
        config_node_property_string_free(request_authorization_strategy_target_local_nonprim);
        request_authorization_strategy_target_local_nonprim = NULL;
    }
    if (triggers_target_local_nonprim) {
        config_node_property_string_free(triggers_target_local_nonprim);
        triggers_target_local_nonprim = NULL;
    }
    return NULL;

}
