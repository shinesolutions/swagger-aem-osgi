/*
 * com_adobe_granite_license_impl_license_check_filter_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_license_impl_license_check_filter_properties_H_
#define _com_adobe_granite_license_impl_license_check_filter_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_license_impl_license_check_filter_properties_t com_adobe_granite_license_impl_license_check_filter_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"



typedef struct com_adobe_granite_license_impl_license_check_filter_properties_t {
    struct config_node_property_integer_t *check_internval; //model
    struct config_node_property_array_t *exclude_ids; //model
    struct config_node_property_boolean_t *encrypt_ping; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_license_impl_license_check_filter_properties_t;

__attribute__((deprecated)) com_adobe_granite_license_impl_license_check_filter_properties_t *com_adobe_granite_license_impl_license_check_filter_properties_create(
    config_node_property_integer_t *check_internval,
    config_node_property_array_t *exclude_ids,
    config_node_property_boolean_t *encrypt_ping
);

void com_adobe_granite_license_impl_license_check_filter_properties_free(com_adobe_granite_license_impl_license_check_filter_properties_t *com_adobe_granite_license_impl_license_check_filter_properties);

com_adobe_granite_license_impl_license_check_filter_properties_t *com_adobe_granite_license_impl_license_check_filter_properties_parseFromJSON(cJSON *com_adobe_granite_license_impl_license_check_filter_propertiesJSON);

cJSON *com_adobe_granite_license_impl_license_check_filter_properties_convertToJSON(com_adobe_granite_license_impl_license_check_filter_properties_t *com_adobe_granite_license_impl_license_check_filter_properties);

#endif /* _com_adobe_granite_license_impl_license_check_filter_properties_H_ */

