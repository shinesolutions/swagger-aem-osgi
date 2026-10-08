/*
 * com_day_crx_security_token_impl_impl_token_authentication_handler_properties.h
 *
 * 
 */

#ifndef _com_day_crx_security_token_impl_impl_token_authentication_handler_properties_H_
#define _com_day_crx_security_token_impl_impl_token_authentication_handler_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_string.h"



typedef struct com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t {
    struct config_node_property_string_t *path; //model
    struct config_node_property_drop_down_t *token_required_attr; //model
    struct config_node_property_string_t *token_alternate_url; //model
    struct config_node_property_boolean_t *token_encapsulated; //model
    struct config_node_property_array_t *skip_token_refresh; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t;

__attribute__((deprecated)) com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t *com_day_crx_security_token_impl_impl_token_authentication_handler_properties_create(
    config_node_property_string_t *path,
    config_node_property_drop_down_t *token_required_attr,
    config_node_property_string_t *token_alternate_url,
    config_node_property_boolean_t *token_encapsulated,
    config_node_property_array_t *skip_token_refresh
);

void com_day_crx_security_token_impl_impl_token_authentication_handler_properties_free(com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t *com_day_crx_security_token_impl_impl_token_authentication_handler_properties);

com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t *com_day_crx_security_token_impl_impl_token_authentication_handler_properties_parseFromJSON(cJSON *com_day_crx_security_token_impl_impl_token_authentication_handler_propertiesJSON);

cJSON *com_day_crx_security_token_impl_impl_token_authentication_handler_properties_convertToJSON(com_day_crx_security_token_impl_impl_token_authentication_handler_properties_t *com_day_crx_security_token_impl_impl_token_authentication_handler_properties);

#endif /* _com_day_crx_security_token_impl_impl_token_authentication_handler_properties_H_ */

