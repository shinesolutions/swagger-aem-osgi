/*
 * com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties.h
 *
 * 
 */

#ifndef _com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_H_
#define _com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t {
    struct config_node_property_string_t *jdbc_driver_class; //model
    struct config_node_property_string_t *jdbc_connection_uri; //model
    struct config_node_property_string_t *jdbc_username; //model
    struct config_node_property_string_t *jdbc_password; //model
    struct config_node_property_string_t *jdbc_validation_query; //model
    struct config_node_property_boolean_t *default_readonly; //model
    struct config_node_property_boolean_t *default_autocommit; //model
    struct config_node_property_integer_t *pool_size; //model
    struct config_node_property_integer_t *pool_max_wait_msec; //model
    struct config_node_property_string_t *datasource_name; //model
    struct config_node_property_array_t *datasource_svc_properties; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t;

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
);

void com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_free(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t *com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties);

com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t *com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_parseFromJSON(cJSON *com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertiesJSON);

cJSON *com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_convertToJSON(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_t *com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties);

#endif /* _com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_H_ */

