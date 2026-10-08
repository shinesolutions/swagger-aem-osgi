/*
 * org_apache_felix_eventadmin_impl_event_admin_properties.h
 *
 * 
 */

#ifndef _org_apache_felix_eventadmin_impl_event_admin_properties_H_
#define _org_apache_felix_eventadmin_impl_event_admin_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_felix_eventadmin_impl_event_admin_properties_t org_apache_felix_eventadmin_impl_event_admin_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_float.h"
#include "config_node_property_integer.h"



typedef struct org_apache_felix_eventadmin_impl_event_admin_properties_t {
    struct config_node_property_integer_t *org_apache_felix_eventadmin_thread_pool_size; //model
    struct config_node_property_float_t *org_apache_felix_eventadmin_async_to_sync_thread_ratio; //model
    struct config_node_property_integer_t *org_apache_felix_eventadmin_timeout; //model
    struct config_node_property_boolean_t *org_apache_felix_eventadmin_require_topic; //model
    struct config_node_property_array_t *org_apache_felix_eventadmin_ignore_timeout; //model
    struct config_node_property_array_t *org_apache_felix_eventadmin_ignore_topic; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_felix_eventadmin_impl_event_admin_properties_t;

__attribute__((deprecated)) org_apache_felix_eventadmin_impl_event_admin_properties_t *org_apache_felix_eventadmin_impl_event_admin_properties_create(
    config_node_property_integer_t *org_apache_felix_eventadmin_thread_pool_size,
    config_node_property_float_t *org_apache_felix_eventadmin_async_to_sync_thread_ratio,
    config_node_property_integer_t *org_apache_felix_eventadmin_timeout,
    config_node_property_boolean_t *org_apache_felix_eventadmin_require_topic,
    config_node_property_array_t *org_apache_felix_eventadmin_ignore_timeout,
    config_node_property_array_t *org_apache_felix_eventadmin_ignore_topic
);

void org_apache_felix_eventadmin_impl_event_admin_properties_free(org_apache_felix_eventadmin_impl_event_admin_properties_t *org_apache_felix_eventadmin_impl_event_admin_properties);

org_apache_felix_eventadmin_impl_event_admin_properties_t *org_apache_felix_eventadmin_impl_event_admin_properties_parseFromJSON(cJSON *org_apache_felix_eventadmin_impl_event_admin_propertiesJSON);

cJSON *org_apache_felix_eventadmin_impl_event_admin_properties_convertToJSON(org_apache_felix_eventadmin_impl_event_admin_properties_t *org_apache_felix_eventadmin_impl_event_admin_properties);

#endif /* _org_apache_felix_eventadmin_impl_event_admin_properties_H_ */

