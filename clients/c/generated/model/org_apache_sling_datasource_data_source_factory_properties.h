/*
 * org_apache_sling_datasource_data_source_factory_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_datasource_data_source_factory_properties_H_
#define _org_apache_sling_datasource_data_source_factory_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_datasource_data_source_factory_properties_t org_apache_sling_datasource_data_source_factory_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_datasource_data_source_factory_properties_t {
    struct config_node_property_string_t *datasource_name; //model
    struct config_node_property_string_t *datasource_svc_prop_name; //model
    struct config_node_property_string_t *driver_class_name; //model
    struct config_node_property_string_t *url; //model
    struct config_node_property_string_t *username; //model
    struct config_node_property_string_t *password; //model
    struct config_node_property_drop_down_t *default_auto_commit; //model
    struct config_node_property_drop_down_t *default_read_only; //model
    struct config_node_property_drop_down_t *default_transaction_isolation; //model
    struct config_node_property_string_t *default_catalog; //model
    struct config_node_property_integer_t *max_active; //model
    struct config_node_property_integer_t *max_idle; //model
    struct config_node_property_integer_t *min_idle; //model
    struct config_node_property_integer_t *initial_size; //model
    struct config_node_property_integer_t *max_wait; //model
    struct config_node_property_integer_t *max_age; //model
    struct config_node_property_boolean_t *test_on_borrow; //model
    struct config_node_property_boolean_t *test_on_return; //model
    struct config_node_property_boolean_t *test_while_idle; //model
    struct config_node_property_string_t *validation_query; //model
    struct config_node_property_integer_t *validation_query_timeout; //model
    struct config_node_property_integer_t *time_between_eviction_runs_millis; //model
    struct config_node_property_integer_t *min_evictable_idle_time_millis; //model
    struct config_node_property_string_t *connection_properties; //model
    struct config_node_property_string_t *init_sql; //model
    struct config_node_property_string_t *jdbc_interceptors; //model
    struct config_node_property_integer_t *validation_interval; //model
    struct config_node_property_boolean_t *log_validation_errors; //model
    struct config_node_property_array_t *datasource_svc_properties; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_datasource_data_source_factory_properties_t;

__attribute__((deprecated)) org_apache_sling_datasource_data_source_factory_properties_t *org_apache_sling_datasource_data_source_factory_properties_create(
    config_node_property_string_t *datasource_name,
    config_node_property_string_t *datasource_svc_prop_name,
    config_node_property_string_t *driver_class_name,
    config_node_property_string_t *url,
    config_node_property_string_t *username,
    config_node_property_string_t *password,
    config_node_property_drop_down_t *default_auto_commit,
    config_node_property_drop_down_t *default_read_only,
    config_node_property_drop_down_t *default_transaction_isolation,
    config_node_property_string_t *default_catalog,
    config_node_property_integer_t *max_active,
    config_node_property_integer_t *max_idle,
    config_node_property_integer_t *min_idle,
    config_node_property_integer_t *initial_size,
    config_node_property_integer_t *max_wait,
    config_node_property_integer_t *max_age,
    config_node_property_boolean_t *test_on_borrow,
    config_node_property_boolean_t *test_on_return,
    config_node_property_boolean_t *test_while_idle,
    config_node_property_string_t *validation_query,
    config_node_property_integer_t *validation_query_timeout,
    config_node_property_integer_t *time_between_eviction_runs_millis,
    config_node_property_integer_t *min_evictable_idle_time_millis,
    config_node_property_string_t *connection_properties,
    config_node_property_string_t *init_sql,
    config_node_property_string_t *jdbc_interceptors,
    config_node_property_integer_t *validation_interval,
    config_node_property_boolean_t *log_validation_errors,
    config_node_property_array_t *datasource_svc_properties
);

void org_apache_sling_datasource_data_source_factory_properties_free(org_apache_sling_datasource_data_source_factory_properties_t *org_apache_sling_datasource_data_source_factory_properties);

org_apache_sling_datasource_data_source_factory_properties_t *org_apache_sling_datasource_data_source_factory_properties_parseFromJSON(cJSON *org_apache_sling_datasource_data_source_factory_propertiesJSON);

cJSON *org_apache_sling_datasource_data_source_factory_properties_convertToJSON(org_apache_sling_datasource_data_source_factory_properties_t *org_apache_sling_datasource_data_source_factory_properties);

#endif /* _org_apache_sling_datasource_data_source_factory_properties_H_ */

