/*
 * org_apache_felix_webconsole_internal_servlet_osgi_manager_properties.h
 *
 * 
 */

#ifndef _org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_H_
#define _org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t;

#include "config_node_property_drop_down.h"
#include "config_node_property_string.h"



typedef struct org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t {
    struct config_node_property_string_t *manager_root; //model
    struct config_node_property_string_t *http_service_filter; //model
    struct config_node_property_string_t *default_render; //model
    struct config_node_property_string_t *realm; //model
    struct config_node_property_string_t *username; //model
    struct config_node_property_string_t *password; //model
    struct config_node_property_string_t *category; //model
    struct config_node_property_string_t *locale; //model
    struct config_node_property_drop_down_t *loglevel; //model
    struct config_node_property_drop_down_t *plugins; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t;

__attribute__((deprecated)) org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t *org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_create(
    config_node_property_string_t *manager_root,
    config_node_property_string_t *http_service_filter,
    config_node_property_string_t *default_render,
    config_node_property_string_t *realm,
    config_node_property_string_t *username,
    config_node_property_string_t *password,
    config_node_property_string_t *category,
    config_node_property_string_t *locale,
    config_node_property_drop_down_t *loglevel,
    config_node_property_drop_down_t *plugins
);

void org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_free(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t *org_apache_felix_webconsole_internal_servlet_osgi_manager_properties);

org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t *org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_parseFromJSON(cJSON *org_apache_felix_webconsole_internal_servlet_osgi_manager_propertiesJSON);

cJSON *org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_convertToJSON(org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_t *org_apache_felix_webconsole_internal_servlet_osgi_manager_properties);

#endif /* _org_apache_felix_webconsole_internal_servlet_osgi_manager_properties_H_ */

