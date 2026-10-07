#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_commons_metrics_internal_log_reporter_properties.h"



static org_apache_sling_commons_metrics_internal_log_reporter_properties_t *org_apache_sling_commons_metrics_internal_log_reporter_properties_create_internal(
    config_node_property_integer_t *period,
    config_node_property_drop_down_t *time_unit,
    config_node_property_drop_down_t *level,
    config_node_property_string_t *logger_name,
    config_node_property_string_t *prefix,
    config_node_property_string_t *pattern,
    config_node_property_string_t *registry_name
    ) {
    org_apache_sling_commons_metrics_internal_log_reporter_properties_t *org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var = malloc(sizeof(org_apache_sling_commons_metrics_internal_log_reporter_properties_t));
    if (!org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var, 0, sizeof(org_apache_sling_commons_metrics_internal_log_reporter_properties_t));
    org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var->_library_owned = 1;
    org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var->period = period;
    org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var->time_unit = time_unit;
    org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var->level = level;
    org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var->logger_name = logger_name;
    org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var->prefix = prefix;
    org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var->pattern = pattern;
    org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var->registry_name = registry_name;
    return org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_commons_metrics_internal_log_reporter_properties_t *org_apache_sling_commons_metrics_internal_log_reporter_properties_create(
    config_node_property_integer_t *period,
    config_node_property_drop_down_t *time_unit,
    config_node_property_drop_down_t *level,
    config_node_property_string_t *logger_name,
    config_node_property_string_t *prefix,
    config_node_property_string_t *pattern,
    config_node_property_string_t *registry_name
    ) {
    org_apache_sling_commons_metrics_internal_log_reporter_properties_t *result = org_apache_sling_commons_metrics_internal_log_reporter_properties_create_internal (
        period,
        time_unit,
        level,
        logger_name,
        prefix,
        pattern,
        registry_name
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_commons_metrics_internal_log_reporter_properties_free(org_apache_sling_commons_metrics_internal_log_reporter_properties_t *org_apache_sling_commons_metrics_internal_log_reporter_properties) {
    if(NULL == org_apache_sling_commons_metrics_internal_log_reporter_properties){
        return ;
    }
    if(org_apache_sling_commons_metrics_internal_log_reporter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_commons_metrics_internal_log_reporter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_commons_metrics_internal_log_reporter_properties->period) {
        config_node_property_integer_free(org_apache_sling_commons_metrics_internal_log_reporter_properties->period);
        org_apache_sling_commons_metrics_internal_log_reporter_properties->period = NULL;
    }
    if (org_apache_sling_commons_metrics_internal_log_reporter_properties->time_unit) {
        config_node_property_drop_down_free(org_apache_sling_commons_metrics_internal_log_reporter_properties->time_unit);
        org_apache_sling_commons_metrics_internal_log_reporter_properties->time_unit = NULL;
    }
    if (org_apache_sling_commons_metrics_internal_log_reporter_properties->level) {
        config_node_property_drop_down_free(org_apache_sling_commons_metrics_internal_log_reporter_properties->level);
        org_apache_sling_commons_metrics_internal_log_reporter_properties->level = NULL;
    }
    if (org_apache_sling_commons_metrics_internal_log_reporter_properties->logger_name) {
        config_node_property_string_free(org_apache_sling_commons_metrics_internal_log_reporter_properties->logger_name);
        org_apache_sling_commons_metrics_internal_log_reporter_properties->logger_name = NULL;
    }
    if (org_apache_sling_commons_metrics_internal_log_reporter_properties->prefix) {
        config_node_property_string_free(org_apache_sling_commons_metrics_internal_log_reporter_properties->prefix);
        org_apache_sling_commons_metrics_internal_log_reporter_properties->prefix = NULL;
    }
    if (org_apache_sling_commons_metrics_internal_log_reporter_properties->pattern) {
        config_node_property_string_free(org_apache_sling_commons_metrics_internal_log_reporter_properties->pattern);
        org_apache_sling_commons_metrics_internal_log_reporter_properties->pattern = NULL;
    }
    if (org_apache_sling_commons_metrics_internal_log_reporter_properties->registry_name) {
        config_node_property_string_free(org_apache_sling_commons_metrics_internal_log_reporter_properties->registry_name);
        org_apache_sling_commons_metrics_internal_log_reporter_properties->registry_name = NULL;
    }
    free(org_apache_sling_commons_metrics_internal_log_reporter_properties);
}

cJSON *org_apache_sling_commons_metrics_internal_log_reporter_properties_convertToJSON(org_apache_sling_commons_metrics_internal_log_reporter_properties_t *org_apache_sling_commons_metrics_internal_log_reporter_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_commons_metrics_internal_log_reporter_properties->period
    if(org_apache_sling_commons_metrics_internal_log_reporter_properties->period) {
    cJSON *period_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_commons_metrics_internal_log_reporter_properties->period);
    if(period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "period", period_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_metrics_internal_log_reporter_properties->time_unit
    if(org_apache_sling_commons_metrics_internal_log_reporter_properties->time_unit) {
    cJSON *time_unit_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_commons_metrics_internal_log_reporter_properties->time_unit);
    if(time_unit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "timeUnit", time_unit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_metrics_internal_log_reporter_properties->level
    if(org_apache_sling_commons_metrics_internal_log_reporter_properties->level) {
    cJSON *level_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_commons_metrics_internal_log_reporter_properties->level);
    if(level_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "level", level_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_metrics_internal_log_reporter_properties->logger_name
    if(org_apache_sling_commons_metrics_internal_log_reporter_properties->logger_name) {
    cJSON *logger_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_commons_metrics_internal_log_reporter_properties->logger_name);
    if(logger_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "loggerName", logger_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_metrics_internal_log_reporter_properties->prefix
    if(org_apache_sling_commons_metrics_internal_log_reporter_properties->prefix) {
    cJSON *prefix_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_commons_metrics_internal_log_reporter_properties->prefix);
    if(prefix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "prefix", prefix_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_metrics_internal_log_reporter_properties->pattern
    if(org_apache_sling_commons_metrics_internal_log_reporter_properties->pattern) {
    cJSON *pattern_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_commons_metrics_internal_log_reporter_properties->pattern);
    if(pattern_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pattern", pattern_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_metrics_internal_log_reporter_properties->registry_name
    if(org_apache_sling_commons_metrics_internal_log_reporter_properties->registry_name) {
    cJSON *registry_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_commons_metrics_internal_log_reporter_properties->registry_name);
    if(registry_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "registryName", registry_name_local_JSON);
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

org_apache_sling_commons_metrics_internal_log_reporter_properties_t *org_apache_sling_commons_metrics_internal_log_reporter_properties_parseFromJSON(cJSON *org_apache_sling_commons_metrics_internal_log_reporter_propertiesJSON){

    org_apache_sling_commons_metrics_internal_log_reporter_properties_t *org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var = NULL;

    // define the local variable for org_apache_sling_commons_metrics_internal_log_reporter_properties->period
    config_node_property_integer_t *period_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_metrics_internal_log_reporter_properties->time_unit
    config_node_property_drop_down_t *time_unit_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_metrics_internal_log_reporter_properties->level
    config_node_property_drop_down_t *level_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_metrics_internal_log_reporter_properties->logger_name
    config_node_property_string_t *logger_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_metrics_internal_log_reporter_properties->prefix
    config_node_property_string_t *prefix_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_metrics_internal_log_reporter_properties->pattern
    config_node_property_string_t *pattern_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_metrics_internal_log_reporter_properties->registry_name
    config_node_property_string_t *registry_name_local_nonprim = NULL;

    // org_apache_sling_commons_metrics_internal_log_reporter_properties->period
    cJSON *period = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_metrics_internal_log_reporter_propertiesJSON, "period");
    if (cJSON_IsNull(period)) {
        period = NULL;
    }
    if (period) { 
    period_local_nonprim = config_node_property_integer_parseFromJSON(period); //nonprimitive
    }

    // org_apache_sling_commons_metrics_internal_log_reporter_properties->time_unit
    cJSON *time_unit = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_metrics_internal_log_reporter_propertiesJSON, "timeUnit");
    if (cJSON_IsNull(time_unit)) {
        time_unit = NULL;
    }
    if (time_unit) { 
    time_unit_local_nonprim = config_node_property_drop_down_parseFromJSON(time_unit); //nonprimitive
    }

    // org_apache_sling_commons_metrics_internal_log_reporter_properties->level
    cJSON *level = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_metrics_internal_log_reporter_propertiesJSON, "level");
    if (cJSON_IsNull(level)) {
        level = NULL;
    }
    if (level) { 
    level_local_nonprim = config_node_property_drop_down_parseFromJSON(level); //nonprimitive
    }

    // org_apache_sling_commons_metrics_internal_log_reporter_properties->logger_name
    cJSON *logger_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_metrics_internal_log_reporter_propertiesJSON, "loggerName");
    if (cJSON_IsNull(logger_name)) {
        logger_name = NULL;
    }
    if (logger_name) { 
    logger_name_local_nonprim = config_node_property_string_parseFromJSON(logger_name); //nonprimitive
    }

    // org_apache_sling_commons_metrics_internal_log_reporter_properties->prefix
    cJSON *prefix = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_metrics_internal_log_reporter_propertiesJSON, "prefix");
    if (cJSON_IsNull(prefix)) {
        prefix = NULL;
    }
    if (prefix) { 
    prefix_local_nonprim = config_node_property_string_parseFromJSON(prefix); //nonprimitive
    }

    // org_apache_sling_commons_metrics_internal_log_reporter_properties->pattern
    cJSON *pattern = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_metrics_internal_log_reporter_propertiesJSON, "pattern");
    if (cJSON_IsNull(pattern)) {
        pattern = NULL;
    }
    if (pattern) { 
    pattern_local_nonprim = config_node_property_string_parseFromJSON(pattern); //nonprimitive
    }

    // org_apache_sling_commons_metrics_internal_log_reporter_properties->registry_name
    cJSON *registry_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_metrics_internal_log_reporter_propertiesJSON, "registryName");
    if (cJSON_IsNull(registry_name)) {
        registry_name = NULL;
    }
    if (registry_name) { 
    registry_name_local_nonprim = config_node_property_string_parseFromJSON(registry_name); //nonprimitive
    }



    org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var = org_apache_sling_commons_metrics_internal_log_reporter_properties_create_internal (
        period ? period_local_nonprim : NULL,
        time_unit ? time_unit_local_nonprim : NULL,
        level ? level_local_nonprim : NULL,
        logger_name ? logger_name_local_nonprim : NULL,
        prefix ? prefix_local_nonprim : NULL,
        pattern ? pattern_local_nonprim : NULL,
        registry_name ? registry_name_local_nonprim : NULL
        );

    if (!org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var) {
        goto end;
    }

    return org_apache_sling_commons_metrics_internal_log_reporter_properties_local_var;
end:
    if (period_local_nonprim) {
        config_node_property_integer_free(period_local_nonprim);
        period_local_nonprim = NULL;
    }
    if (time_unit_local_nonprim) {
        config_node_property_drop_down_free(time_unit_local_nonprim);
        time_unit_local_nonprim = NULL;
    }
    if (level_local_nonprim) {
        config_node_property_drop_down_free(level_local_nonprim);
        level_local_nonprim = NULL;
    }
    if (logger_name_local_nonprim) {
        config_node_property_string_free(logger_name_local_nonprim);
        logger_name_local_nonprim = NULL;
    }
    if (prefix_local_nonprim) {
        config_node_property_string_free(prefix_local_nonprim);
        prefix_local_nonprim = NULL;
    }
    if (pattern_local_nonprim) {
        config_node_property_string_free(pattern_local_nonprim);
        pattern_local_nonprim = NULL;
    }
    if (registry_name_local_nonprim) {
        config_node_property_string_free(registry_name_local_nonprim);
        registry_name_local_nonprim = NULL;
    }
    return NULL;

}
