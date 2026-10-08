/*
 * com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_H_
#define _com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t;

#include "config_node_property_string.h"



typedef struct com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t {
    struct config_node_property_string_t *oauth_configmanager_ims_configid; //model
    struct config_node_property_string_t *ims_owning_entity; //model
    struct config_node_property_string_t *aem_instance_id; //model
    struct config_node_property_string_t *ims_service_code; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t;

__attribute__((deprecated)) com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_create(
    config_node_property_string_t *oauth_configmanager_ims_configid,
    config_node_property_string_t *ims_owning_entity,
    config_node_property_string_t *aem_instance_id,
    config_node_property_string_t *ims_service_code
);

void com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_free(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties);

com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_parseFromJSON(cJSON *com_adobe_granite_auth_ims_impl_ims_config_provider_impl_propertiesJSON);

cJSON *com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_convertToJSON(com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties);

#endif /* _com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties_H_ */

