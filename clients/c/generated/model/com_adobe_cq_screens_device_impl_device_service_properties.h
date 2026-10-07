/*
 * com_adobe_cq_screens_device_impl_device_service_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_screens_device_impl_device_service_properties_H_
#define _com_adobe_cq_screens_device_impl_device_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_screens_device_impl_device_service_properties_t com_adobe_cq_screens_device_impl_device_service_properties_t;

#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_screens_device_impl_device_service_properties_t {
    struct config_node_property_integer_t *com_adobe_aem_screens_player_pingfrequency; //model
    struct config_node_property_string_t *com_adobe_aem_screens_device_pasword_specialchars; //model
    struct config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minlowercasechars; //model
    struct config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minuppercasechars; //model
    struct config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minnumberchars; //model
    struct config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minspecialchars; //model
    struct config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minlength; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_screens_device_impl_device_service_properties_t;

__attribute__((deprecated)) com_adobe_cq_screens_device_impl_device_service_properties_t *com_adobe_cq_screens_device_impl_device_service_properties_create(
    config_node_property_integer_t *com_adobe_aem_screens_player_pingfrequency,
    config_node_property_string_t *com_adobe_aem_screens_device_pasword_specialchars,
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minlowercasechars,
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minuppercasechars,
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minnumberchars,
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minspecialchars,
    config_node_property_integer_t *com_adobe_aem_screens_device_pasword_minlength
);

void com_adobe_cq_screens_device_impl_device_service_properties_free(com_adobe_cq_screens_device_impl_device_service_properties_t *com_adobe_cq_screens_device_impl_device_service_properties);

com_adobe_cq_screens_device_impl_device_service_properties_t *com_adobe_cq_screens_device_impl_device_service_properties_parseFromJSON(cJSON *com_adobe_cq_screens_device_impl_device_service_propertiesJSON);

cJSON *com_adobe_cq_screens_device_impl_device_service_properties_convertToJSON(com_adobe_cq_screens_device_impl_device_service_properties_t *com_adobe_cq_screens_device_impl_device_service_properties);

#endif /* _com_adobe_cq_screens_device_impl_device_service_properties_H_ */

