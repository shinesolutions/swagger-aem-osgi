#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties.h"



static com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t *com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_create_internal(
    config_node_property_string_t *jdbc_driver_class,
    config_node_property_string_t *jdbc_connection_uri,
    config_node_property_string_t *jdbc_username,
    config_node_property_string_t *jdbc_password,
    config_node_property_string_t *jdbc_validation_query,
    config_node_property_boolean_t *default_readonly,
    config_node_property_boolean_t *default_autocommit,
    config_node_property_integer_t *pool_size,
    config_node_property_integer_t *pool_max_wait_msec,
    config_node_property_string_t *datasource_name,
    config_node_property_array_t *datasource_svc_properties
    ) {
    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t *com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var = malloc(sizeof(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t));
    if (!com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var) {
        return NULL;
    }
    memset(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var, 0, sizeof(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t));
    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var->_library_owned = 1;
    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var->jdbc_driver_class = jdbc_driver_class;
    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var->jdbc_connection_uri = jdbc_connection_uri;
    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var->jdbc_username = jdbc_username;
    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var->jdbc_password = jdbc_password;
    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var->jdbc_validation_query = jdbc_validation_query;
    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var->default_readonly = default_readonly;
    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var->default_autocommit = default_autocommit;
    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var->pool_size = pool_size;
    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var->pool_max_wait_msec = pool_max_wait_msec;
    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var->datasource_name = datasource_name;
    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var->datasource_svc_properties = datasource_svc_properties;
    return com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var;
}

__attribute__((deprecated)) com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t *com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_create(
    config_node_property_string_t *jdbc_driver_class,
    config_node_property_string_t *jdbc_connection_uri,
    config_node_property_string_t *jdbc_username,
    config_node_property_string_t *jdbc_password,
    config_node_property_string_t *jdbc_validation_query,
    config_node_property_boolean_t *default_readonly,
    config_node_property_boolean_t *default_autocommit,
    config_node_property_integer_t *pool_size,
    config_node_property_integer_t *pool_max_wait_msec,
    config_node_property_string_t *datasource_name,
    config_node_property_array_t *datasource_svc_properties
    ) {
    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t *result = com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_create_internal (
        jdbc_driver_class,
        jdbc_connection_uri,
        jdbc_username,
        jdbc_password,
        jdbc_validation_query,
        default_readonly,
        default_autocommit,
        pool_size,
        pool_max_wait_msec,
        datasource_name,
        datasource_svc_properties
        );
    if (!result) {
    }
    return result;
}

void com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_free(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t *com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties) {
    if(NULL == com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties){
        return ;
    }
    if(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_driver_class) {
        config_node_property_string_free(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_driver_class);
        com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_driver_class = NULL;
    }
    if (com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_connection_uri) {
        config_node_property_string_free(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_connection_uri);
        com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_connection_uri = NULL;
    }
    if (com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_username) {
        config_node_property_string_free(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_username);
        com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_username = NULL;
    }
    if (com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_password) {
        config_node_property_string_free(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_password);
        com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_password = NULL;
    }
    if (com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_validation_query) {
        config_node_property_string_free(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_validation_query);
        com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_validation_query = NULL;
    }
    if (com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_readonly) {
        config_node_property_boolean_free(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_readonly);
        com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_readonly = NULL;
    }
    if (com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_autocommit) {
        config_node_property_boolean_free(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_autocommit);
        com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_autocommit = NULL;
    }
    if (com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_size) {
        config_node_property_integer_free(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_size);
        com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_size = NULL;
    }
    if (com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_max_wait_msec) {
        config_node_property_integer_free(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_max_wait_msec);
        com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_max_wait_msec = NULL;
    }
    if (com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_name) {
        config_node_property_string_free(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_name);
        com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_name = NULL;
    }
    if (com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_svc_properties) {
        config_node_property_array_free(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_svc_properties);
        com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_svc_properties = NULL;
    }
    free(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties);
}

cJSON *com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_convertToJSON(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t *com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_driver_class
    if(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_driver_class) {
    cJSON *jdbc_driver_class_local_JSON = config_node_property_string_convertToJSON(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_driver_class);
    if(jdbc_driver_class_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jdbc.driver.class", jdbc_driver_class_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_connection_uri
    if(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_connection_uri) {
    cJSON *jdbc_connection_uri_local_JSON = config_node_property_string_convertToJSON(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_connection_uri);
    if(jdbc_connection_uri_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jdbc.connection.uri", jdbc_connection_uri_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_username
    if(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_username) {
    cJSON *jdbc_username_local_JSON = config_node_property_string_convertToJSON(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_username);
    if(jdbc_username_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jdbc.username", jdbc_username_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_password
    if(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_password) {
    cJSON *jdbc_password_local_JSON = config_node_property_string_convertToJSON(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_password);
    if(jdbc_password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jdbc.password", jdbc_password_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_validation_query
    if(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_validation_query) {
    cJSON *jdbc_validation_query_local_JSON = config_node_property_string_convertToJSON(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_validation_query);
    if(jdbc_validation_query_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jdbc.validation.query", jdbc_validation_query_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_readonly
    if(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_readonly) {
    cJSON *default_readonly_local_JSON = config_node_property_boolean_convertToJSON(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_readonly);
    if(default_readonly_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.readonly", default_readonly_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_autocommit
    if(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_autocommit) {
    cJSON *default_autocommit_local_JSON = config_node_property_boolean_convertToJSON(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_autocommit);
    if(default_autocommit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.autocommit", default_autocommit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_size
    if(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_size) {
    cJSON *pool_size_local_JSON = config_node_property_integer_convertToJSON(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_size);
    if(pool_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pool.size", pool_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_max_wait_msec
    if(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_max_wait_msec) {
    cJSON *pool_max_wait_msec_local_JSON = config_node_property_integer_convertToJSON(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_max_wait_msec);
    if(pool_max_wait_msec_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pool.max.wait.msec", pool_max_wait_msec_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_name
    if(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_name) {
    cJSON *datasource_name_local_JSON = config_node_property_string_convertToJSON(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_name);
    if(datasource_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "datasource.name", datasource_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_svc_properties
    if(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_svc_properties) {
    cJSON *datasource_svc_properties_local_JSON = config_node_property_array_convertToJSON(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_svc_properties);
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

com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t *com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_parseFromJSON(cJSON *com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertiesJSON){

    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t *com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var = NULL;

    // define the local variable for com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_driver_class
    config_node_property_string_t *jdbc_driver_class_local_nonprim = NULL;

    // define the local variable for com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_connection_uri
    config_node_property_string_t *jdbc_connection_uri_local_nonprim = NULL;

    // define the local variable for com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_username
    config_node_property_string_t *jdbc_username_local_nonprim = NULL;

    // define the local variable for com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_password
    config_node_property_string_t *jdbc_password_local_nonprim = NULL;

    // define the local variable for com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_validation_query
    config_node_property_string_t *jdbc_validation_query_local_nonprim = NULL;

    // define the local variable for com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_readonly
    config_node_property_boolean_t *default_readonly_local_nonprim = NULL;

    // define the local variable for com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_autocommit
    config_node_property_boolean_t *default_autocommit_local_nonprim = NULL;

    // define the local variable for com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_size
    config_node_property_integer_t *pool_size_local_nonprim = NULL;

    // define the local variable for com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_max_wait_msec
    config_node_property_integer_t *pool_max_wait_msec_local_nonprim = NULL;

    // define the local variable for com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_name
    config_node_property_string_t *datasource_name_local_nonprim = NULL;

    // define the local variable for com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_svc_properties
    config_node_property_array_t *datasource_svc_properties_local_nonprim = NULL;

    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_driver_class
    cJSON *jdbc_driver_class = cJSON_GetObjectItemCaseSensitive(com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertiesJSON, "jdbc.driver.class");
    if (cJSON_IsNull(jdbc_driver_class)) {
        jdbc_driver_class = NULL;
    }
    if (jdbc_driver_class) { 
    jdbc_driver_class_local_nonprim = config_node_property_string_parseFromJSON(jdbc_driver_class); //nonprimitive
    }

    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_connection_uri
    cJSON *jdbc_connection_uri = cJSON_GetObjectItemCaseSensitive(com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertiesJSON, "jdbc.connection.uri");
    if (cJSON_IsNull(jdbc_connection_uri)) {
        jdbc_connection_uri = NULL;
    }
    if (jdbc_connection_uri) { 
    jdbc_connection_uri_local_nonprim = config_node_property_string_parseFromJSON(jdbc_connection_uri); //nonprimitive
    }

    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_username
    cJSON *jdbc_username = cJSON_GetObjectItemCaseSensitive(com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertiesJSON, "jdbc.username");
    if (cJSON_IsNull(jdbc_username)) {
        jdbc_username = NULL;
    }
    if (jdbc_username) { 
    jdbc_username_local_nonprim = config_node_property_string_parseFromJSON(jdbc_username); //nonprimitive
    }

    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_password
    cJSON *jdbc_password = cJSON_GetObjectItemCaseSensitive(com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertiesJSON, "jdbc.password");
    if (cJSON_IsNull(jdbc_password)) {
        jdbc_password = NULL;
    }
    if (jdbc_password) { 
    jdbc_password_local_nonprim = config_node_property_string_parseFromJSON(jdbc_password); //nonprimitive
    }

    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->jdbc_validation_query
    cJSON *jdbc_validation_query = cJSON_GetObjectItemCaseSensitive(com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertiesJSON, "jdbc.validation.query");
    if (cJSON_IsNull(jdbc_validation_query)) {
        jdbc_validation_query = NULL;
    }
    if (jdbc_validation_query) { 
    jdbc_validation_query_local_nonprim = config_node_property_string_parseFromJSON(jdbc_validation_query); //nonprimitive
    }

    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_readonly
    cJSON *default_readonly = cJSON_GetObjectItemCaseSensitive(com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertiesJSON, "default.readonly");
    if (cJSON_IsNull(default_readonly)) {
        default_readonly = NULL;
    }
    if (default_readonly) { 
    default_readonly_local_nonprim = config_node_property_boolean_parseFromJSON(default_readonly); //nonprimitive
    }

    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->default_autocommit
    cJSON *default_autocommit = cJSON_GetObjectItemCaseSensitive(com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertiesJSON, "default.autocommit");
    if (cJSON_IsNull(default_autocommit)) {
        default_autocommit = NULL;
    }
    if (default_autocommit) { 
    default_autocommit_local_nonprim = config_node_property_boolean_parseFromJSON(default_autocommit); //nonprimitive
    }

    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_size
    cJSON *pool_size = cJSON_GetObjectItemCaseSensitive(com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertiesJSON, "pool.size");
    if (cJSON_IsNull(pool_size)) {
        pool_size = NULL;
    }
    if (pool_size) { 
    pool_size_local_nonprim = config_node_property_integer_parseFromJSON(pool_size); //nonprimitive
    }

    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->pool_max_wait_msec
    cJSON *pool_max_wait_msec = cJSON_GetObjectItemCaseSensitive(com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertiesJSON, "pool.max.wait.msec");
    if (cJSON_IsNull(pool_max_wait_msec)) {
        pool_max_wait_msec = NULL;
    }
    if (pool_max_wait_msec) { 
    pool_max_wait_msec_local_nonprim = config_node_property_integer_parseFromJSON(pool_max_wait_msec); //nonprimitive
    }

    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_name
    cJSON *datasource_name = cJSON_GetObjectItemCaseSensitive(com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertiesJSON, "datasource.name");
    if (cJSON_IsNull(datasource_name)) {
        datasource_name = NULL;
    }
    if (datasource_name) { 
    datasource_name_local_nonprim = config_node_property_string_parseFromJSON(datasource_name); //nonprimitive
    }

    // com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties->datasource_svc_properties
    cJSON *datasource_svc_properties = cJSON_GetObjectItemCaseSensitive(com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertiesJSON, "datasource.svc.properties");
    if (cJSON_IsNull(datasource_svc_properties)) {
        datasource_svc_properties = NULL;
    }
    if (datasource_svc_properties) { 
    datasource_svc_properties_local_nonprim = config_node_property_array_parseFromJSON(datasource_svc_properties); //nonprimitive
    }



    com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var = com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_create_internal (
        jdbc_driver_class ? jdbc_driver_class_local_nonprim : NULL,
        jdbc_connection_uri ? jdbc_connection_uri_local_nonprim : NULL,
        jdbc_username ? jdbc_username_local_nonprim : NULL,
        jdbc_password ? jdbc_password_local_nonprim : NULL,
        jdbc_validation_query ? jdbc_validation_query_local_nonprim : NULL,
        default_readonly ? default_readonly_local_nonprim : NULL,
        default_autocommit ? default_autocommit_local_nonprim : NULL,
        pool_size ? pool_size_local_nonprim : NULL,
        pool_max_wait_msec ? pool_max_wait_msec_local_nonprim : NULL,
        datasource_name ? datasource_name_local_nonprim : NULL,
        datasource_svc_properties ? datasource_svc_properties_local_nonprim : NULL
        );

    if (!com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var) {
        goto end;
    }

    return com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_local_var;
end:
    if (jdbc_driver_class_local_nonprim) {
        config_node_property_string_free(jdbc_driver_class_local_nonprim);
        jdbc_driver_class_local_nonprim = NULL;
    }
    if (jdbc_connection_uri_local_nonprim) {
        config_node_property_string_free(jdbc_connection_uri_local_nonprim);
        jdbc_connection_uri_local_nonprim = NULL;
    }
    if (jdbc_username_local_nonprim) {
        config_node_property_string_free(jdbc_username_local_nonprim);
        jdbc_username_local_nonprim = NULL;
    }
    if (jdbc_password_local_nonprim) {
        config_node_property_string_free(jdbc_password_local_nonprim);
        jdbc_password_local_nonprim = NULL;
    }
    if (jdbc_validation_query_local_nonprim) {
        config_node_property_string_free(jdbc_validation_query_local_nonprim);
        jdbc_validation_query_local_nonprim = NULL;
    }
    if (default_readonly_local_nonprim) {
        config_node_property_boolean_free(default_readonly_local_nonprim);
        default_readonly_local_nonprim = NULL;
    }
    if (default_autocommit_local_nonprim) {
        config_node_property_boolean_free(default_autocommit_local_nonprim);
        default_autocommit_local_nonprim = NULL;
    }
    if (pool_size_local_nonprim) {
        config_node_property_integer_free(pool_size_local_nonprim);
        pool_size_local_nonprim = NULL;
    }
    if (pool_max_wait_msec_local_nonprim) {
        config_node_property_integer_free(pool_max_wait_msec_local_nonprim);
        pool_max_wait_msec_local_nonprim = NULL;
    }
    if (datasource_name_local_nonprim) {
        config_node_property_string_free(datasource_name_local_nonprim);
        datasource_name_local_nonprim = NULL;
    }
    if (datasource_svc_properties_local_nonprim) {
        config_node_property_array_free(datasource_svc_properties_local_nonprim);
        datasource_svc_properties_local_nonprim = NULL;
    }
    return NULL;

}
