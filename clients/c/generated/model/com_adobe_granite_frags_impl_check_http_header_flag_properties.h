/*
 * com_adobe_granite_frags_impl_check_http_header_flag_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_frags_impl_check_http_header_flag_properties_H_
#define _com_adobe_granite_frags_impl_check_http_header_flag_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_frags_impl_check_http_header_flag_properties_t com_adobe_granite_frags_impl_check_http_header_flag_properties_t;

#include "config_node_property_string.h"



typedef struct com_adobe_granite_frags_impl_check_http_header_flag_properties_t {
    struct config_node_property_string_t *feature_name; //model
    struct config_node_property_string_t *feature_description; //model
    struct config_node_property_string_t *http_header_name; //model
    struct config_node_property_string_t *http_header_valuepattern; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_frags_impl_check_http_header_flag_properties_t;

__attribute__((deprecated)) com_adobe_granite_frags_impl_check_http_header_flag_properties_t *com_adobe_granite_frags_impl_check_http_header_flag_properties_create(
    config_node_property_string_t *feature_name,
    config_node_property_string_t *feature_description,
    config_node_property_string_t *http_header_name,
    config_node_property_string_t *http_header_valuepattern
);

void com_adobe_granite_frags_impl_check_http_header_flag_properties_free(com_adobe_granite_frags_impl_check_http_header_flag_properties_t *com_adobe_granite_frags_impl_check_http_header_flag_properties);

com_adobe_granite_frags_impl_check_http_header_flag_properties_t *com_adobe_granite_frags_impl_check_http_header_flag_properties_parseFromJSON(cJSON *com_adobe_granite_frags_impl_check_http_header_flag_propertiesJSON);

cJSON *com_adobe_granite_frags_impl_check_http_header_flag_properties_convertToJSON(com_adobe_granite_frags_impl_check_http_header_flag_properties_t *com_adobe_granite_frags_impl_check_http_header_flag_properties);

#endif /* _com_adobe_granite_frags_impl_check_http_header_flag_properties_H_ */

