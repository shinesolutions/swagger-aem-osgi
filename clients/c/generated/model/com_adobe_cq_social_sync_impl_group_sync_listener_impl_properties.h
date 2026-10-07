/*
 * com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_H_
#define _com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t {
    struct config_node_property_array_t *nodetypes; //model
    struct config_node_property_array_t *ignorableprops; //model
    struct config_node_property_string_t *ignorablenodes; //model
    struct config_node_property_boolean_t *enabled; //model
    struct config_node_property_string_t *distfolders; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t;

__attribute__((deprecated)) com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t *com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_create(
    config_node_property_array_t *nodetypes,
    config_node_property_array_t *ignorableprops,
    config_node_property_string_t *ignorablenodes,
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *distfolders
);

void com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_free(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t *com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties);

com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t *com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_parseFromJSON(cJSON *com_adobe_cq_social_sync_impl_group_sync_listener_impl_propertiesJSON);

cJSON *com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_convertToJSON(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t *com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties);

#endif /* _com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_H_ */

