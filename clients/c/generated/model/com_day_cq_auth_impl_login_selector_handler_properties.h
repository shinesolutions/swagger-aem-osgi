/*
 * com_day_cq_auth_impl_login_selector_handler_properties.h
 *
 * 
 */

#ifndef _com_day_cq_auth_impl_login_selector_handler_properties_H_
#define _com_day_cq_auth_impl_login_selector_handler_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_auth_impl_login_selector_handler_properties_t com_day_cq_auth_impl_login_selector_handler_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_auth_impl_login_selector_handler_properties_t {
    struct config_node_property_string_t *path; //model
    struct config_node_property_integer_t *service_ranking; //model
    struct config_node_property_array_t *auth_loginselector_mappings; //model
    struct config_node_property_array_t *auth_loginselector_changepw_mappings; //model
    struct config_node_property_string_t *auth_loginselector_defaultloginpage; //model
    struct config_node_property_string_t *auth_loginselector_defaultchangepwpage; //model
    struct config_node_property_array_t *auth_loginselector_handle; //model
    struct config_node_property_boolean_t *auth_loginselector_handle_all_extensions; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_auth_impl_login_selector_handler_properties_t;

__attribute__((deprecated)) com_day_cq_auth_impl_login_selector_handler_properties_t *com_day_cq_auth_impl_login_selector_handler_properties_create(
    config_node_property_string_t *path,
    config_node_property_integer_t *service_ranking,
    config_node_property_array_t *auth_loginselector_mappings,
    config_node_property_array_t *auth_loginselector_changepw_mappings,
    config_node_property_string_t *auth_loginselector_defaultloginpage,
    config_node_property_string_t *auth_loginselector_defaultchangepwpage,
    config_node_property_array_t *auth_loginselector_handle,
    config_node_property_boolean_t *auth_loginselector_handle_all_extensions
);

void com_day_cq_auth_impl_login_selector_handler_properties_free(com_day_cq_auth_impl_login_selector_handler_properties_t *com_day_cq_auth_impl_login_selector_handler_properties);

com_day_cq_auth_impl_login_selector_handler_properties_t *com_day_cq_auth_impl_login_selector_handler_properties_parseFromJSON(cJSON *com_day_cq_auth_impl_login_selector_handler_propertiesJSON);

cJSON *com_day_cq_auth_impl_login_selector_handler_properties_convertToJSON(com_day_cq_auth_impl_login_selector_handler_properties_t *com_day_cq_auth_impl_login_selector_handler_properties);

#endif /* _com_day_cq_auth_impl_login_selector_handler_properties_H_ */

