/*
 * org_apache_sling_engine_impl_log_request_logger_service_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_engine_impl_log_request_logger_service_properties_H_
#define _org_apache_sling_engine_impl_log_request_logger_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_engine_impl_log_request_logger_service_properties_t org_apache_sling_engine_impl_log_request_logger_service_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_engine_impl_log_request_logger_service_properties_t {
    struct config_node_property_string_t *request_log_service_format; //model
    struct config_node_property_string_t *request_log_service_output; //model
    struct config_node_property_drop_down_t *request_log_service_outputtype; //model
    struct config_node_property_boolean_t *request_log_service_onentry; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_engine_impl_log_request_logger_service_properties_t;

__attribute__((deprecated)) org_apache_sling_engine_impl_log_request_logger_service_properties_t *org_apache_sling_engine_impl_log_request_logger_service_properties_create(
    config_node_property_string_t *request_log_service_format,
    config_node_property_string_t *request_log_service_output,
    config_node_property_drop_down_t *request_log_service_outputtype,
    config_node_property_boolean_t *request_log_service_onentry
);

void org_apache_sling_engine_impl_log_request_logger_service_properties_free(org_apache_sling_engine_impl_log_request_logger_service_properties_t *org_apache_sling_engine_impl_log_request_logger_service_properties);

org_apache_sling_engine_impl_log_request_logger_service_properties_t *org_apache_sling_engine_impl_log_request_logger_service_properties_parseFromJSON(cJSON *org_apache_sling_engine_impl_log_request_logger_service_propertiesJSON);

cJSON *org_apache_sling_engine_impl_log_request_logger_service_properties_convertToJSON(org_apache_sling_engine_impl_log_request_logger_service_properties_t *org_apache_sling_engine_impl_log_request_logger_service_properties);

#endif /* _org_apache_sling_engine_impl_log_request_logger_service_properties_H_ */

