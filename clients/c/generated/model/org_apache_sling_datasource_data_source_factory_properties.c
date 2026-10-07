#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_datasource_data_source_factory_properties.h"



static org_apache_sling_datasource_data_source_factory_properties_t *org_apache_sling_datasource_data_source_factory_properties_create_internal(
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
    ) {
    org_apache_sling_datasource_data_source_factory_properties_t *org_apache_sling_datasource_data_source_factory_properties_local_var = malloc(sizeof(org_apache_sling_datasource_data_source_factory_properties_t));
    if (!org_apache_sling_datasource_data_source_factory_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_datasource_data_source_factory_properties_local_var, 0, sizeof(org_apache_sling_datasource_data_source_factory_properties_t));
    org_apache_sling_datasource_data_source_factory_properties_local_var->_library_owned = 1;
    org_apache_sling_datasource_data_source_factory_properties_local_var->datasource_name = datasource_name;
    org_apache_sling_datasource_data_source_factory_properties_local_var->datasource_svc_prop_name = datasource_svc_prop_name;
    org_apache_sling_datasource_data_source_factory_properties_local_var->driver_class_name = driver_class_name;
    org_apache_sling_datasource_data_source_factory_properties_local_var->url = url;
    org_apache_sling_datasource_data_source_factory_properties_local_var->username = username;
    org_apache_sling_datasource_data_source_factory_properties_local_var->password = password;
    org_apache_sling_datasource_data_source_factory_properties_local_var->default_auto_commit = default_auto_commit;
    org_apache_sling_datasource_data_source_factory_properties_local_var->default_read_only = default_read_only;
    org_apache_sling_datasource_data_source_factory_properties_local_var->default_transaction_isolation = default_transaction_isolation;
    org_apache_sling_datasource_data_source_factory_properties_local_var->default_catalog = default_catalog;
    org_apache_sling_datasource_data_source_factory_properties_local_var->max_active = max_active;
    org_apache_sling_datasource_data_source_factory_properties_local_var->max_idle = max_idle;
    org_apache_sling_datasource_data_source_factory_properties_local_var->min_idle = min_idle;
    org_apache_sling_datasource_data_source_factory_properties_local_var->initial_size = initial_size;
    org_apache_sling_datasource_data_source_factory_properties_local_var->max_wait = max_wait;
    org_apache_sling_datasource_data_source_factory_properties_local_var->max_age = max_age;
    org_apache_sling_datasource_data_source_factory_properties_local_var->test_on_borrow = test_on_borrow;
    org_apache_sling_datasource_data_source_factory_properties_local_var->test_on_return = test_on_return;
    org_apache_sling_datasource_data_source_factory_properties_local_var->test_while_idle = test_while_idle;
    org_apache_sling_datasource_data_source_factory_properties_local_var->validation_query = validation_query;
    org_apache_sling_datasource_data_source_factory_properties_local_var->validation_query_timeout = validation_query_timeout;
    org_apache_sling_datasource_data_source_factory_properties_local_var->time_between_eviction_runs_millis = time_between_eviction_runs_millis;
    org_apache_sling_datasource_data_source_factory_properties_local_var->min_evictable_idle_time_millis = min_evictable_idle_time_millis;
    org_apache_sling_datasource_data_source_factory_properties_local_var->connection_properties = connection_properties;
    org_apache_sling_datasource_data_source_factory_properties_local_var->init_sql = init_sql;
    org_apache_sling_datasource_data_source_factory_properties_local_var->jdbc_interceptors = jdbc_interceptors;
    org_apache_sling_datasource_data_source_factory_properties_local_var->validation_interval = validation_interval;
    org_apache_sling_datasource_data_source_factory_properties_local_var->log_validation_errors = log_validation_errors;
    org_apache_sling_datasource_data_source_factory_properties_local_var->datasource_svc_properties = datasource_svc_properties;
    return org_apache_sling_datasource_data_source_factory_properties_local_var;
}

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
    ) {
    org_apache_sling_datasource_data_source_factory_properties_t *result = org_apache_sling_datasource_data_source_factory_properties_create_internal (
        datasource_name,
        datasource_svc_prop_name,
        driver_class_name,
        url,
        username,
        password,
        default_auto_commit,
        default_read_only,
        default_transaction_isolation,
        default_catalog,
        max_active,
        max_idle,
        min_idle,
        initial_size,
        max_wait,
        max_age,
        test_on_borrow,
        test_on_return,
        test_while_idle,
        validation_query,
        validation_query_timeout,
        time_between_eviction_runs_millis,
        min_evictable_idle_time_millis,
        connection_properties,
        init_sql,
        jdbc_interceptors,
        validation_interval,
        log_validation_errors,
        datasource_svc_properties
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_datasource_data_source_factory_properties_free(org_apache_sling_datasource_data_source_factory_properties_t *org_apache_sling_datasource_data_source_factory_properties) {
    if(NULL == org_apache_sling_datasource_data_source_factory_properties){
        return ;
    }
    if(org_apache_sling_datasource_data_source_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_datasource_data_source_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_datasource_data_source_factory_properties->datasource_name) {
        config_node_property_string_free(org_apache_sling_datasource_data_source_factory_properties->datasource_name);
        org_apache_sling_datasource_data_source_factory_properties->datasource_name = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->datasource_svc_prop_name) {
        config_node_property_string_free(org_apache_sling_datasource_data_source_factory_properties->datasource_svc_prop_name);
        org_apache_sling_datasource_data_source_factory_properties->datasource_svc_prop_name = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->driver_class_name) {
        config_node_property_string_free(org_apache_sling_datasource_data_source_factory_properties->driver_class_name);
        org_apache_sling_datasource_data_source_factory_properties->driver_class_name = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->url) {
        config_node_property_string_free(org_apache_sling_datasource_data_source_factory_properties->url);
        org_apache_sling_datasource_data_source_factory_properties->url = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->username) {
        config_node_property_string_free(org_apache_sling_datasource_data_source_factory_properties->username);
        org_apache_sling_datasource_data_source_factory_properties->username = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->password) {
        config_node_property_string_free(org_apache_sling_datasource_data_source_factory_properties->password);
        org_apache_sling_datasource_data_source_factory_properties->password = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->default_auto_commit) {
        config_node_property_drop_down_free(org_apache_sling_datasource_data_source_factory_properties->default_auto_commit);
        org_apache_sling_datasource_data_source_factory_properties->default_auto_commit = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->default_read_only) {
        config_node_property_drop_down_free(org_apache_sling_datasource_data_source_factory_properties->default_read_only);
        org_apache_sling_datasource_data_source_factory_properties->default_read_only = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->default_transaction_isolation) {
        config_node_property_drop_down_free(org_apache_sling_datasource_data_source_factory_properties->default_transaction_isolation);
        org_apache_sling_datasource_data_source_factory_properties->default_transaction_isolation = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->default_catalog) {
        config_node_property_string_free(org_apache_sling_datasource_data_source_factory_properties->default_catalog);
        org_apache_sling_datasource_data_source_factory_properties->default_catalog = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->max_active) {
        config_node_property_integer_free(org_apache_sling_datasource_data_source_factory_properties->max_active);
        org_apache_sling_datasource_data_source_factory_properties->max_active = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->max_idle) {
        config_node_property_integer_free(org_apache_sling_datasource_data_source_factory_properties->max_idle);
        org_apache_sling_datasource_data_source_factory_properties->max_idle = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->min_idle) {
        config_node_property_integer_free(org_apache_sling_datasource_data_source_factory_properties->min_idle);
        org_apache_sling_datasource_data_source_factory_properties->min_idle = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->initial_size) {
        config_node_property_integer_free(org_apache_sling_datasource_data_source_factory_properties->initial_size);
        org_apache_sling_datasource_data_source_factory_properties->initial_size = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->max_wait) {
        config_node_property_integer_free(org_apache_sling_datasource_data_source_factory_properties->max_wait);
        org_apache_sling_datasource_data_source_factory_properties->max_wait = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->max_age) {
        config_node_property_integer_free(org_apache_sling_datasource_data_source_factory_properties->max_age);
        org_apache_sling_datasource_data_source_factory_properties->max_age = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->test_on_borrow) {
        config_node_property_boolean_free(org_apache_sling_datasource_data_source_factory_properties->test_on_borrow);
        org_apache_sling_datasource_data_source_factory_properties->test_on_borrow = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->test_on_return) {
        config_node_property_boolean_free(org_apache_sling_datasource_data_source_factory_properties->test_on_return);
        org_apache_sling_datasource_data_source_factory_properties->test_on_return = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->test_while_idle) {
        config_node_property_boolean_free(org_apache_sling_datasource_data_source_factory_properties->test_while_idle);
        org_apache_sling_datasource_data_source_factory_properties->test_while_idle = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->validation_query) {
        config_node_property_string_free(org_apache_sling_datasource_data_source_factory_properties->validation_query);
        org_apache_sling_datasource_data_source_factory_properties->validation_query = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->validation_query_timeout) {
        config_node_property_integer_free(org_apache_sling_datasource_data_source_factory_properties->validation_query_timeout);
        org_apache_sling_datasource_data_source_factory_properties->validation_query_timeout = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->time_between_eviction_runs_millis) {
        config_node_property_integer_free(org_apache_sling_datasource_data_source_factory_properties->time_between_eviction_runs_millis);
        org_apache_sling_datasource_data_source_factory_properties->time_between_eviction_runs_millis = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->min_evictable_idle_time_millis) {
        config_node_property_integer_free(org_apache_sling_datasource_data_source_factory_properties->min_evictable_idle_time_millis);
        org_apache_sling_datasource_data_source_factory_properties->min_evictable_idle_time_millis = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->connection_properties) {
        config_node_property_string_free(org_apache_sling_datasource_data_source_factory_properties->connection_properties);
        org_apache_sling_datasource_data_source_factory_properties->connection_properties = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->init_sql) {
        config_node_property_string_free(org_apache_sling_datasource_data_source_factory_properties->init_sql);
        org_apache_sling_datasource_data_source_factory_properties->init_sql = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->jdbc_interceptors) {
        config_node_property_string_free(org_apache_sling_datasource_data_source_factory_properties->jdbc_interceptors);
        org_apache_sling_datasource_data_source_factory_properties->jdbc_interceptors = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->validation_interval) {
        config_node_property_integer_free(org_apache_sling_datasource_data_source_factory_properties->validation_interval);
        org_apache_sling_datasource_data_source_factory_properties->validation_interval = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->log_validation_errors) {
        config_node_property_boolean_free(org_apache_sling_datasource_data_source_factory_properties->log_validation_errors);
        org_apache_sling_datasource_data_source_factory_properties->log_validation_errors = NULL;
    }
    if (org_apache_sling_datasource_data_source_factory_properties->datasource_svc_properties) {
        config_node_property_array_free(org_apache_sling_datasource_data_source_factory_properties->datasource_svc_properties);
        org_apache_sling_datasource_data_source_factory_properties->datasource_svc_properties = NULL;
    }
    free(org_apache_sling_datasource_data_source_factory_properties);
}

cJSON *org_apache_sling_datasource_data_source_factory_properties_convertToJSON(org_apache_sling_datasource_data_source_factory_properties_t *org_apache_sling_datasource_data_source_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_datasource_data_source_factory_properties->datasource_name
    if(org_apache_sling_datasource_data_source_factory_properties->datasource_name) {
    cJSON *datasource_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->datasource_name);
    if(datasource_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "datasource.name", datasource_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->datasource_svc_prop_name
    if(org_apache_sling_datasource_data_source_factory_properties->datasource_svc_prop_name) {
    cJSON *datasource_svc_prop_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->datasource_svc_prop_name);
    if(datasource_svc_prop_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "datasource.svc.prop.name", datasource_svc_prop_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->driver_class_name
    if(org_apache_sling_datasource_data_source_factory_properties->driver_class_name) {
    cJSON *driver_class_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->driver_class_name);
    if(driver_class_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "driverClassName", driver_class_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->url
    if(org_apache_sling_datasource_data_source_factory_properties->url) {
    cJSON *url_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->url);
    if(url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "url", url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->username
    if(org_apache_sling_datasource_data_source_factory_properties->username) {
    cJSON *username_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->username);
    if(username_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "username", username_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->password
    if(org_apache_sling_datasource_data_source_factory_properties->password) {
    cJSON *password_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->password);
    if(password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "password", password_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->default_auto_commit
    if(org_apache_sling_datasource_data_source_factory_properties->default_auto_commit) {
    cJSON *default_auto_commit_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->default_auto_commit);
    if(default_auto_commit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultAutoCommit", default_auto_commit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->default_read_only
    if(org_apache_sling_datasource_data_source_factory_properties->default_read_only) {
    cJSON *default_read_only_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->default_read_only);
    if(default_read_only_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultReadOnly", default_read_only_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->default_transaction_isolation
    if(org_apache_sling_datasource_data_source_factory_properties->default_transaction_isolation) {
    cJSON *default_transaction_isolation_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->default_transaction_isolation);
    if(default_transaction_isolation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultTransactionIsolation", default_transaction_isolation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->default_catalog
    if(org_apache_sling_datasource_data_source_factory_properties->default_catalog) {
    cJSON *default_catalog_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->default_catalog);
    if(default_catalog_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultCatalog", default_catalog_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->max_active
    if(org_apache_sling_datasource_data_source_factory_properties->max_active) {
    cJSON *max_active_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->max_active);
    if(max_active_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxActive", max_active_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->max_idle
    if(org_apache_sling_datasource_data_source_factory_properties->max_idle) {
    cJSON *max_idle_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->max_idle);
    if(max_idle_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxIdle", max_idle_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->min_idle
    if(org_apache_sling_datasource_data_source_factory_properties->min_idle) {
    cJSON *min_idle_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->min_idle);
    if(min_idle_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "minIdle", min_idle_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->initial_size
    if(org_apache_sling_datasource_data_source_factory_properties->initial_size) {
    cJSON *initial_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->initial_size);
    if(initial_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "initialSize", initial_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->max_wait
    if(org_apache_sling_datasource_data_source_factory_properties->max_wait) {
    cJSON *max_wait_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->max_wait);
    if(max_wait_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxWait", max_wait_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->max_age
    if(org_apache_sling_datasource_data_source_factory_properties->max_age) {
    cJSON *max_age_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->max_age);
    if(max_age_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxAge", max_age_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->test_on_borrow
    if(org_apache_sling_datasource_data_source_factory_properties->test_on_borrow) {
    cJSON *test_on_borrow_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->test_on_borrow);
    if(test_on_borrow_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "testOnBorrow", test_on_borrow_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->test_on_return
    if(org_apache_sling_datasource_data_source_factory_properties->test_on_return) {
    cJSON *test_on_return_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->test_on_return);
    if(test_on_return_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "testOnReturn", test_on_return_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->test_while_idle
    if(org_apache_sling_datasource_data_source_factory_properties->test_while_idle) {
    cJSON *test_while_idle_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->test_while_idle);
    if(test_while_idle_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "testWhileIdle", test_while_idle_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->validation_query
    if(org_apache_sling_datasource_data_source_factory_properties->validation_query) {
    cJSON *validation_query_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->validation_query);
    if(validation_query_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "validationQuery", validation_query_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->validation_query_timeout
    if(org_apache_sling_datasource_data_source_factory_properties->validation_query_timeout) {
    cJSON *validation_query_timeout_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->validation_query_timeout);
    if(validation_query_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "validationQueryTimeout", validation_query_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->time_between_eviction_runs_millis
    if(org_apache_sling_datasource_data_source_factory_properties->time_between_eviction_runs_millis) {
    cJSON *time_between_eviction_runs_millis_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->time_between_eviction_runs_millis);
    if(time_between_eviction_runs_millis_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "timeBetweenEvictionRunsMillis", time_between_eviction_runs_millis_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->min_evictable_idle_time_millis
    if(org_apache_sling_datasource_data_source_factory_properties->min_evictable_idle_time_millis) {
    cJSON *min_evictable_idle_time_millis_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->min_evictable_idle_time_millis);
    if(min_evictable_idle_time_millis_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "minEvictableIdleTimeMillis", min_evictable_idle_time_millis_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->connection_properties
    if(org_apache_sling_datasource_data_source_factory_properties->connection_properties) {
    cJSON *connection_properties_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->connection_properties);
    if(connection_properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "connectionProperties", connection_properties_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->init_sql
    if(org_apache_sling_datasource_data_source_factory_properties->init_sql) {
    cJSON *init_sql_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->init_sql);
    if(init_sql_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "initSQL", init_sql_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->jdbc_interceptors
    if(org_apache_sling_datasource_data_source_factory_properties->jdbc_interceptors) {
    cJSON *jdbc_interceptors_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->jdbc_interceptors);
    if(jdbc_interceptors_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jdbcInterceptors", jdbc_interceptors_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->validation_interval
    if(org_apache_sling_datasource_data_source_factory_properties->validation_interval) {
    cJSON *validation_interval_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->validation_interval);
    if(validation_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "validationInterval", validation_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->log_validation_errors
    if(org_apache_sling_datasource_data_source_factory_properties->log_validation_errors) {
    cJSON *log_validation_errors_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->log_validation_errors);
    if(log_validation_errors_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "logValidationErrors", log_validation_errors_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_datasource_data_source_factory_properties->datasource_svc_properties
    if(org_apache_sling_datasource_data_source_factory_properties->datasource_svc_properties) {
    cJSON *datasource_svc_properties_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_datasource_data_source_factory_properties->datasource_svc_properties);
    if(datasource_svc_properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "datasource.svc.properties", datasource_svc_properties_local_JSON);
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

org_apache_sling_datasource_data_source_factory_properties_t *org_apache_sling_datasource_data_source_factory_properties_parseFromJSON(cJSON *org_apache_sling_datasource_data_source_factory_propertiesJSON){

    org_apache_sling_datasource_data_source_factory_properties_t *org_apache_sling_datasource_data_source_factory_properties_local_var = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->datasource_name
    config_node_property_string_t *datasource_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->datasource_svc_prop_name
    config_node_property_string_t *datasource_svc_prop_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->driver_class_name
    config_node_property_string_t *driver_class_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->url
    config_node_property_string_t *url_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->username
    config_node_property_string_t *username_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->password
    config_node_property_string_t *password_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->default_auto_commit
    config_node_property_drop_down_t *default_auto_commit_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->default_read_only
    config_node_property_drop_down_t *default_read_only_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->default_transaction_isolation
    config_node_property_drop_down_t *default_transaction_isolation_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->default_catalog
    config_node_property_string_t *default_catalog_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->max_active
    config_node_property_integer_t *max_active_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->max_idle
    config_node_property_integer_t *max_idle_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->min_idle
    config_node_property_integer_t *min_idle_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->initial_size
    config_node_property_integer_t *initial_size_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->max_wait
    config_node_property_integer_t *max_wait_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->max_age
    config_node_property_integer_t *max_age_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->test_on_borrow
    config_node_property_boolean_t *test_on_borrow_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->test_on_return
    config_node_property_boolean_t *test_on_return_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->test_while_idle
    config_node_property_boolean_t *test_while_idle_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->validation_query
    config_node_property_string_t *validation_query_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->validation_query_timeout
    config_node_property_integer_t *validation_query_timeout_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->time_between_eviction_runs_millis
    config_node_property_integer_t *time_between_eviction_runs_millis_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->min_evictable_idle_time_millis
    config_node_property_integer_t *min_evictable_idle_time_millis_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->connection_properties
    config_node_property_string_t *connection_properties_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->init_sql
    config_node_property_string_t *init_sql_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->jdbc_interceptors
    config_node_property_string_t *jdbc_interceptors_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->validation_interval
    config_node_property_integer_t *validation_interval_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->log_validation_errors
    config_node_property_boolean_t *log_validation_errors_local_nonprim = NULL;

    // define the local variable for org_apache_sling_datasource_data_source_factory_properties->datasource_svc_properties
    config_node_property_array_t *datasource_svc_properties_local_nonprim = NULL;

    // org_apache_sling_datasource_data_source_factory_properties->datasource_name
    cJSON *datasource_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "datasource.name");
    if (cJSON_IsNull(datasource_name)) {
        datasource_name = NULL;
    }
    if (datasource_name) { 
    datasource_name_local_nonprim = config_node_property_string_parseFromJSON(datasource_name); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->datasource_svc_prop_name
    cJSON *datasource_svc_prop_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "datasource.svc.prop.name");
    if (cJSON_IsNull(datasource_svc_prop_name)) {
        datasource_svc_prop_name = NULL;
    }
    if (datasource_svc_prop_name) { 
    datasource_svc_prop_name_local_nonprim = config_node_property_string_parseFromJSON(datasource_svc_prop_name); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->driver_class_name
    cJSON *driver_class_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "driverClassName");
    if (cJSON_IsNull(driver_class_name)) {
        driver_class_name = NULL;
    }
    if (driver_class_name) { 
    driver_class_name_local_nonprim = config_node_property_string_parseFromJSON(driver_class_name); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (url) { 
    url_local_nonprim = config_node_property_string_parseFromJSON(url); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "username");
    if (cJSON_IsNull(username)) {
        username = NULL;
    }
    if (username) { 
    username_local_nonprim = config_node_property_string_parseFromJSON(username); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->password
    cJSON *password = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "password");
    if (cJSON_IsNull(password)) {
        password = NULL;
    }
    if (password) { 
    password_local_nonprim = config_node_property_string_parseFromJSON(password); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->default_auto_commit
    cJSON *default_auto_commit = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "defaultAutoCommit");
    if (cJSON_IsNull(default_auto_commit)) {
        default_auto_commit = NULL;
    }
    if (default_auto_commit) { 
    default_auto_commit_local_nonprim = config_node_property_drop_down_parseFromJSON(default_auto_commit); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->default_read_only
    cJSON *default_read_only = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "defaultReadOnly");
    if (cJSON_IsNull(default_read_only)) {
        default_read_only = NULL;
    }
    if (default_read_only) { 
    default_read_only_local_nonprim = config_node_property_drop_down_parseFromJSON(default_read_only); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->default_transaction_isolation
    cJSON *default_transaction_isolation = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "defaultTransactionIsolation");
    if (cJSON_IsNull(default_transaction_isolation)) {
        default_transaction_isolation = NULL;
    }
    if (default_transaction_isolation) { 
    default_transaction_isolation_local_nonprim = config_node_property_drop_down_parseFromJSON(default_transaction_isolation); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->default_catalog
    cJSON *default_catalog = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "defaultCatalog");
    if (cJSON_IsNull(default_catalog)) {
        default_catalog = NULL;
    }
    if (default_catalog) { 
    default_catalog_local_nonprim = config_node_property_string_parseFromJSON(default_catalog); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->max_active
    cJSON *max_active = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "maxActive");
    if (cJSON_IsNull(max_active)) {
        max_active = NULL;
    }
    if (max_active) { 
    max_active_local_nonprim = config_node_property_integer_parseFromJSON(max_active); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->max_idle
    cJSON *max_idle = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "maxIdle");
    if (cJSON_IsNull(max_idle)) {
        max_idle = NULL;
    }
    if (max_idle) { 
    max_idle_local_nonprim = config_node_property_integer_parseFromJSON(max_idle); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->min_idle
    cJSON *min_idle = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "minIdle");
    if (cJSON_IsNull(min_idle)) {
        min_idle = NULL;
    }
    if (min_idle) { 
    min_idle_local_nonprim = config_node_property_integer_parseFromJSON(min_idle); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->initial_size
    cJSON *initial_size = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "initialSize");
    if (cJSON_IsNull(initial_size)) {
        initial_size = NULL;
    }
    if (initial_size) { 
    initial_size_local_nonprim = config_node_property_integer_parseFromJSON(initial_size); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->max_wait
    cJSON *max_wait = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "maxWait");
    if (cJSON_IsNull(max_wait)) {
        max_wait = NULL;
    }
    if (max_wait) { 
    max_wait_local_nonprim = config_node_property_integer_parseFromJSON(max_wait); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->max_age
    cJSON *max_age = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "maxAge");
    if (cJSON_IsNull(max_age)) {
        max_age = NULL;
    }
    if (max_age) { 
    max_age_local_nonprim = config_node_property_integer_parseFromJSON(max_age); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->test_on_borrow
    cJSON *test_on_borrow = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "testOnBorrow");
    if (cJSON_IsNull(test_on_borrow)) {
        test_on_borrow = NULL;
    }
    if (test_on_borrow) { 
    test_on_borrow_local_nonprim = config_node_property_boolean_parseFromJSON(test_on_borrow); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->test_on_return
    cJSON *test_on_return = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "testOnReturn");
    if (cJSON_IsNull(test_on_return)) {
        test_on_return = NULL;
    }
    if (test_on_return) { 
    test_on_return_local_nonprim = config_node_property_boolean_parseFromJSON(test_on_return); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->test_while_idle
    cJSON *test_while_idle = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "testWhileIdle");
    if (cJSON_IsNull(test_while_idle)) {
        test_while_idle = NULL;
    }
    if (test_while_idle) { 
    test_while_idle_local_nonprim = config_node_property_boolean_parseFromJSON(test_while_idle); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->validation_query
    cJSON *validation_query = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "validationQuery");
    if (cJSON_IsNull(validation_query)) {
        validation_query = NULL;
    }
    if (validation_query) { 
    validation_query_local_nonprim = config_node_property_string_parseFromJSON(validation_query); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->validation_query_timeout
    cJSON *validation_query_timeout = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "validationQueryTimeout");
    if (cJSON_IsNull(validation_query_timeout)) {
        validation_query_timeout = NULL;
    }
    if (validation_query_timeout) { 
    validation_query_timeout_local_nonprim = config_node_property_integer_parseFromJSON(validation_query_timeout); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->time_between_eviction_runs_millis
    cJSON *time_between_eviction_runs_millis = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "timeBetweenEvictionRunsMillis");
    if (cJSON_IsNull(time_between_eviction_runs_millis)) {
        time_between_eviction_runs_millis = NULL;
    }
    if (time_between_eviction_runs_millis) { 
    time_between_eviction_runs_millis_local_nonprim = config_node_property_integer_parseFromJSON(time_between_eviction_runs_millis); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->min_evictable_idle_time_millis
    cJSON *min_evictable_idle_time_millis = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "minEvictableIdleTimeMillis");
    if (cJSON_IsNull(min_evictable_idle_time_millis)) {
        min_evictable_idle_time_millis = NULL;
    }
    if (min_evictable_idle_time_millis) { 
    min_evictable_idle_time_millis_local_nonprim = config_node_property_integer_parseFromJSON(min_evictable_idle_time_millis); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->connection_properties
    cJSON *connection_properties = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "connectionProperties");
    if (cJSON_IsNull(connection_properties)) {
        connection_properties = NULL;
    }
    if (connection_properties) { 
    connection_properties_local_nonprim = config_node_property_string_parseFromJSON(connection_properties); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->init_sql
    cJSON *init_sql = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "initSQL");
    if (cJSON_IsNull(init_sql)) {
        init_sql = NULL;
    }
    if (init_sql) { 
    init_sql_local_nonprim = config_node_property_string_parseFromJSON(init_sql); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->jdbc_interceptors
    cJSON *jdbc_interceptors = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "jdbcInterceptors");
    if (cJSON_IsNull(jdbc_interceptors)) {
        jdbc_interceptors = NULL;
    }
    if (jdbc_interceptors) { 
    jdbc_interceptors_local_nonprim = config_node_property_string_parseFromJSON(jdbc_interceptors); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->validation_interval
    cJSON *validation_interval = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "validationInterval");
    if (cJSON_IsNull(validation_interval)) {
        validation_interval = NULL;
    }
    if (validation_interval) { 
    validation_interval_local_nonprim = config_node_property_integer_parseFromJSON(validation_interval); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->log_validation_errors
    cJSON *log_validation_errors = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "logValidationErrors");
    if (cJSON_IsNull(log_validation_errors)) {
        log_validation_errors = NULL;
    }
    if (log_validation_errors) { 
    log_validation_errors_local_nonprim = config_node_property_boolean_parseFromJSON(log_validation_errors); //nonprimitive
    }

    // org_apache_sling_datasource_data_source_factory_properties->datasource_svc_properties
    cJSON *datasource_svc_properties = cJSON_GetObjectItemCaseSensitive(org_apache_sling_datasource_data_source_factory_propertiesJSON, "datasource.svc.properties");
    if (cJSON_IsNull(datasource_svc_properties)) {
        datasource_svc_properties = NULL;
    }
    if (datasource_svc_properties) { 
    datasource_svc_properties_local_nonprim = config_node_property_array_parseFromJSON(datasource_svc_properties); //nonprimitive
    }



    org_apache_sling_datasource_data_source_factory_properties_local_var = org_apache_sling_datasource_data_source_factory_properties_create_internal (
        datasource_name ? datasource_name_local_nonprim : NULL,
        datasource_svc_prop_name ? datasource_svc_prop_name_local_nonprim : NULL,
        driver_class_name ? driver_class_name_local_nonprim : NULL,
        url ? url_local_nonprim : NULL,
        username ? username_local_nonprim : NULL,
        password ? password_local_nonprim : NULL,
        default_auto_commit ? default_auto_commit_local_nonprim : NULL,
        default_read_only ? default_read_only_local_nonprim : NULL,
        default_transaction_isolation ? default_transaction_isolation_local_nonprim : NULL,
        default_catalog ? default_catalog_local_nonprim : NULL,
        max_active ? max_active_local_nonprim : NULL,
        max_idle ? max_idle_local_nonprim : NULL,
        min_idle ? min_idle_local_nonprim : NULL,
        initial_size ? initial_size_local_nonprim : NULL,
        max_wait ? max_wait_local_nonprim : NULL,
        max_age ? max_age_local_nonprim : NULL,
        test_on_borrow ? test_on_borrow_local_nonprim : NULL,
        test_on_return ? test_on_return_local_nonprim : NULL,
        test_while_idle ? test_while_idle_local_nonprim : NULL,
        validation_query ? validation_query_local_nonprim : NULL,
        validation_query_timeout ? validation_query_timeout_local_nonprim : NULL,
        time_between_eviction_runs_millis ? time_between_eviction_runs_millis_local_nonprim : NULL,
        min_evictable_idle_time_millis ? min_evictable_idle_time_millis_local_nonprim : NULL,
        connection_properties ? connection_properties_local_nonprim : NULL,
        init_sql ? init_sql_local_nonprim : NULL,
        jdbc_interceptors ? jdbc_interceptors_local_nonprim : NULL,
        validation_interval ? validation_interval_local_nonprim : NULL,
        log_validation_errors ? log_validation_errors_local_nonprim : NULL,
        datasource_svc_properties ? datasource_svc_properties_local_nonprim : NULL
        );

    if (!org_apache_sling_datasource_data_source_factory_properties_local_var) {
        goto end;
    }

    return org_apache_sling_datasource_data_source_factory_properties_local_var;
end:
    if (datasource_name_local_nonprim) {
        config_node_property_string_free(datasource_name_local_nonprim);
        datasource_name_local_nonprim = NULL;
    }
    if (datasource_svc_prop_name_local_nonprim) {
        config_node_property_string_free(datasource_svc_prop_name_local_nonprim);
        datasource_svc_prop_name_local_nonprim = NULL;
    }
    if (driver_class_name_local_nonprim) {
        config_node_property_string_free(driver_class_name_local_nonprim);
        driver_class_name_local_nonprim = NULL;
    }
    if (url_local_nonprim) {
        config_node_property_string_free(url_local_nonprim);
        url_local_nonprim = NULL;
    }
    if (username_local_nonprim) {
        config_node_property_string_free(username_local_nonprim);
        username_local_nonprim = NULL;
    }
    if (password_local_nonprim) {
        config_node_property_string_free(password_local_nonprim);
        password_local_nonprim = NULL;
    }
    if (default_auto_commit_local_nonprim) {
        config_node_property_drop_down_free(default_auto_commit_local_nonprim);
        default_auto_commit_local_nonprim = NULL;
    }
    if (default_read_only_local_nonprim) {
        config_node_property_drop_down_free(default_read_only_local_nonprim);
        default_read_only_local_nonprim = NULL;
    }
    if (default_transaction_isolation_local_nonprim) {
        config_node_property_drop_down_free(default_transaction_isolation_local_nonprim);
        default_transaction_isolation_local_nonprim = NULL;
    }
    if (default_catalog_local_nonprim) {
        config_node_property_string_free(default_catalog_local_nonprim);
        default_catalog_local_nonprim = NULL;
    }
    if (max_active_local_nonprim) {
        config_node_property_integer_free(max_active_local_nonprim);
        max_active_local_nonprim = NULL;
    }
    if (max_idle_local_nonprim) {
        config_node_property_integer_free(max_idle_local_nonprim);
        max_idle_local_nonprim = NULL;
    }
    if (min_idle_local_nonprim) {
        config_node_property_integer_free(min_idle_local_nonprim);
        min_idle_local_nonprim = NULL;
    }
    if (initial_size_local_nonprim) {
        config_node_property_integer_free(initial_size_local_nonprim);
        initial_size_local_nonprim = NULL;
    }
    if (max_wait_local_nonprim) {
        config_node_property_integer_free(max_wait_local_nonprim);
        max_wait_local_nonprim = NULL;
    }
    if (max_age_local_nonprim) {
        config_node_property_integer_free(max_age_local_nonprim);
        max_age_local_nonprim = NULL;
    }
    if (test_on_borrow_local_nonprim) {
        config_node_property_boolean_free(test_on_borrow_local_nonprim);
        test_on_borrow_local_nonprim = NULL;
    }
    if (test_on_return_local_nonprim) {
        config_node_property_boolean_free(test_on_return_local_nonprim);
        test_on_return_local_nonprim = NULL;
    }
    if (test_while_idle_local_nonprim) {
        config_node_property_boolean_free(test_while_idle_local_nonprim);
        test_while_idle_local_nonprim = NULL;
    }
    if (validation_query_local_nonprim) {
        config_node_property_string_free(validation_query_local_nonprim);
        validation_query_local_nonprim = NULL;
    }
    if (validation_query_timeout_local_nonprim) {
        config_node_property_integer_free(validation_query_timeout_local_nonprim);
        validation_query_timeout_local_nonprim = NULL;
    }
    if (time_between_eviction_runs_millis_local_nonprim) {
        config_node_property_integer_free(time_between_eviction_runs_millis_local_nonprim);
        time_between_eviction_runs_millis_local_nonprim = NULL;
    }
    if (min_evictable_idle_time_millis_local_nonprim) {
        config_node_property_integer_free(min_evictable_idle_time_millis_local_nonprim);
        min_evictable_idle_time_millis_local_nonprim = NULL;
    }
    if (connection_properties_local_nonprim) {
        config_node_property_string_free(connection_properties_local_nonprim);
        connection_properties_local_nonprim = NULL;
    }
    if (init_sql_local_nonprim) {
        config_node_property_string_free(init_sql_local_nonprim);
        init_sql_local_nonprim = NULL;
    }
    if (jdbc_interceptors_local_nonprim) {
        config_node_property_string_free(jdbc_interceptors_local_nonprim);
        jdbc_interceptors_local_nonprim = NULL;
    }
    if (validation_interval_local_nonprim) {
        config_node_property_integer_free(validation_interval_local_nonprim);
        validation_interval_local_nonprim = NULL;
    }
    if (log_validation_errors_local_nonprim) {
        config_node_property_boolean_free(log_validation_errors_local_nonprim);
        log_validation_errors_local_nonprim = NULL;
    }
    if (datasource_svc_properties_local_nonprim) {
        config_node_property_array_free(datasource_svc_properties_local_nonprim);
        datasource_svc_properties_local_nonprim = NULL;
    }
    return NULL;

}
