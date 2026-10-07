/*
 * org_apache_sling_commons_metrics_internal_log_reporter_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_commons_metrics_internal_log_reporter_properties_H_
#define _org_apache_sling_commons_metrics_internal_log_reporter_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_commons_metrics_internal_log_reporter_properties_t org_apache_sling_commons_metrics_internal_log_reporter_properties_t;

#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_commons_metrics_internal_log_reporter_properties_t {
    struct config_node_property_integer_t *period; //model
    struct config_node_property_drop_down_t *time_unit; //model
    struct config_node_property_drop_down_t *level; //model
    struct config_node_property_string_t *logger_name; //model
    struct config_node_property_string_t *prefix; //model
    struct config_node_property_string_t *pattern; //model
    struct config_node_property_string_t *registry_name; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_commons_metrics_internal_log_reporter_properties_t;

__attribute__((deprecated)) org_apache_sling_commons_metrics_internal_log_reporter_properties_t *org_apache_sling_commons_metrics_internal_log_reporter_properties_create(
    config_node_property_integer_t *period,
    config_node_property_drop_down_t *time_unit,
    config_node_property_drop_down_t *level,
    config_node_property_string_t *logger_name,
    config_node_property_string_t *prefix,
    config_node_property_string_t *pattern,
    config_node_property_string_t *registry_name
);

void org_apache_sling_commons_metrics_internal_log_reporter_properties_free(org_apache_sling_commons_metrics_internal_log_reporter_properties_t *org_apache_sling_commons_metrics_internal_log_reporter_properties);

org_apache_sling_commons_metrics_internal_log_reporter_properties_t *org_apache_sling_commons_metrics_internal_log_reporter_properties_parseFromJSON(cJSON *org_apache_sling_commons_metrics_internal_log_reporter_propertiesJSON);

cJSON *org_apache_sling_commons_metrics_internal_log_reporter_properties_convertToJSON(org_apache_sling_commons_metrics_internal_log_reporter_properties_t *org_apache_sling_commons_metrics_internal_log_reporter_properties);

#endif /* _org_apache_sling_commons_metrics_internal_log_reporter_properties_H_ */

