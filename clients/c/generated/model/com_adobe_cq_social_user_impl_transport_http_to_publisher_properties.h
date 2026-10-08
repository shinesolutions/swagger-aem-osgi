/*
 * com_adobe_cq_social_user_impl_transport_http_to_publisher_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_H_
#define _com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t {
    struct config_node_property_boolean_t *enable; //model
    struct config_node_property_array_t *agent_configuration; //model
    struct config_node_property_string_t *context_path; //model
    struct config_node_property_array_t *disabled_cipher_suites; //model
    struct config_node_property_array_t *enabled_cipher_suites; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t;

__attribute__((deprecated)) com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t *com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_create(
    config_node_property_boolean_t *enable,
    config_node_property_array_t *agent_configuration,
    config_node_property_string_t *context_path,
    config_node_property_array_t *disabled_cipher_suites,
    config_node_property_array_t *enabled_cipher_suites
);

void com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_free(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t *com_adobe_cq_social_user_impl_transport_http_to_publisher_properties);

com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t *com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_parseFromJSON(cJSON *com_adobe_cq_social_user_impl_transport_http_to_publisher_propertiesJSON);

cJSON *com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_convertToJSON(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t *com_adobe_cq_social_user_impl_transport_http_to_publisher_properties);

#endif /* _com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_H_ */

