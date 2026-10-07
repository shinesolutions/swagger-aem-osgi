/*
 * com_adobe_granite_security_user_user_properties_service_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_security_user_user_properties_service_properties_H_
#define _com_adobe_granite_security_user_user_properties_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_security_user_user_properties_service_properties_t com_adobe_granite_security_user_user_properties_service_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_string.h"



typedef struct com_adobe_granite_security_user_user_properties_service_properties_t {
    struct config_node_property_string_t *adapter_condition; //model
    struct config_node_property_array_t *granite_userproperties_nodetypes; //model
    struct config_node_property_array_t *granite_userproperties_resourcetypes; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_security_user_user_properties_service_properties_t;

__attribute__((deprecated)) com_adobe_granite_security_user_user_properties_service_properties_t *com_adobe_granite_security_user_user_properties_service_properties_create(
    config_node_property_string_t *adapter_condition,
    config_node_property_array_t *granite_userproperties_nodetypes,
    config_node_property_array_t *granite_userproperties_resourcetypes
);

void com_adobe_granite_security_user_user_properties_service_properties_free(com_adobe_granite_security_user_user_properties_service_properties_t *com_adobe_granite_security_user_user_properties_service_properties);

com_adobe_granite_security_user_user_properties_service_properties_t *com_adobe_granite_security_user_user_properties_service_properties_parseFromJSON(cJSON *com_adobe_granite_security_user_user_properties_service_propertiesJSON);

cJSON *com_adobe_granite_security_user_user_properties_service_properties_convertToJSON(com_adobe_granite_security_user_user_properties_service_properties_t *com_adobe_granite_security_user_user_properties_service_properties);

#endif /* _com_adobe_granite_security_user_user_properties_service_properties_H_ */

