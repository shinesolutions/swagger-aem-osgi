/*
 * com_day_commons_httpclient_properties.h
 *
 * 
 */

#ifndef _com_day_commons_httpclient_properties_H_
#define _com_day_commons_httpclient_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_commons_httpclient_properties_t com_day_commons_httpclient_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_day_commons_httpclient_properties_t {
    struct config_node_property_boolean_t *proxy_enabled; //model
    struct config_node_property_string_t *proxy_host; //model
    struct config_node_property_string_t *proxy_user; //model
    struct config_node_property_string_t *proxy_password; //model
    struct config_node_property_string_t *proxy_ntlm_host; //model
    struct config_node_property_string_t *proxy_ntlm_domain; //model
    struct config_node_property_array_t *proxy_exceptions; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_commons_httpclient_properties_t;

__attribute__((deprecated)) com_day_commons_httpclient_properties_t *com_day_commons_httpclient_properties_create(
    config_node_property_boolean_t *proxy_enabled,
    config_node_property_string_t *proxy_host,
    config_node_property_string_t *proxy_user,
    config_node_property_string_t *proxy_password,
    config_node_property_string_t *proxy_ntlm_host,
    config_node_property_string_t *proxy_ntlm_domain,
    config_node_property_array_t *proxy_exceptions
);

void com_day_commons_httpclient_properties_free(com_day_commons_httpclient_properties_t *com_day_commons_httpclient_properties);

com_day_commons_httpclient_properties_t *com_day_commons_httpclient_properties_parseFromJSON(cJSON *com_day_commons_httpclient_propertiesJSON);

cJSON *com_day_commons_httpclient_properties_convertToJSON(com_day_commons_httpclient_properties_t *com_day_commons_httpclient_properties);

#endif /* _com_day_commons_httpclient_properties_H_ */

