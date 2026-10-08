/*
 * com_day_cq_wcm_foundation_impl_http_auth_handler_properties.h
 *
 * 
 */

#ifndef _com_day_cq_wcm_foundation_impl_http_auth_handler_properties_H_
#define _com_day_cq_wcm_foundation_impl_http_auth_handler_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t {
    struct config_node_property_string_t *path; //model
    struct config_node_property_boolean_t *auth_http_nologin; //model
    struct config_node_property_string_t *auth_http_realm; //model
    struct config_node_property_string_t *auth_default_loginpage; //model
    struct config_node_property_array_t *auth_cred_form; //model
    struct config_node_property_array_t *auth_cred_utf8; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t;

__attribute__((deprecated)) com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t *com_day_cq_wcm_foundation_impl_http_auth_handler_properties_create(
    config_node_property_string_t *path,
    config_node_property_boolean_t *auth_http_nologin,
    config_node_property_string_t *auth_http_realm,
    config_node_property_string_t *auth_default_loginpage,
    config_node_property_array_t *auth_cred_form,
    config_node_property_array_t *auth_cred_utf8
);

void com_day_cq_wcm_foundation_impl_http_auth_handler_properties_free(com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t *com_day_cq_wcm_foundation_impl_http_auth_handler_properties);

com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t *com_day_cq_wcm_foundation_impl_http_auth_handler_properties_parseFromJSON(cJSON *com_day_cq_wcm_foundation_impl_http_auth_handler_propertiesJSON);

cJSON *com_day_cq_wcm_foundation_impl_http_auth_handler_properties_convertToJSON(com_day_cq_wcm_foundation_impl_http_auth_handler_properties_t *com_day_cq_wcm_foundation_impl_http_auth_handler_properties);

#endif /* _com_day_cq_wcm_foundation_impl_http_auth_handler_properties_H_ */

