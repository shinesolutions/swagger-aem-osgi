/*
 * com_day_cq_widget_impl_html_library_manager_impl_properties.h
 *
 * 
 */

#ifndef _com_day_cq_widget_impl_html_library_manager_impl_properties_H_
#define _com_day_cq_widget_impl_html_library_manager_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_widget_impl_html_library_manager_impl_properties_t com_day_cq_widget_impl_html_library_manager_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_day_cq_widget_impl_html_library_manager_impl_properties_t {
    struct config_node_property_string_t *htmllibmanager_clientmanager; //model
    struct config_node_property_boolean_t *htmllibmanager_debug; //model
    struct config_node_property_boolean_t *htmllibmanager_debug_console; //model
    struct config_node_property_string_t *htmllibmanager_debug_init_js; //model
    struct config_node_property_string_t *htmllibmanager_defaultthemename; //model
    struct config_node_property_string_t *htmllibmanager_defaultuserthemename; //model
    struct config_node_property_string_t *htmllibmanager_firebuglite_path; //model
    struct config_node_property_boolean_t *htmllibmanager_force_cq_url_info; //model
    struct config_node_property_boolean_t *htmllibmanager_gzip; //model
    struct config_node_property_integer_t *htmllibmanager_maxage; //model
    struct config_node_property_integer_t *htmllibmanager_max_data_uri_size; //model
    struct config_node_property_boolean_t *htmllibmanager_minify; //model
    struct config_node_property_array_t *htmllibmanager_path_list; //model
    struct config_node_property_boolean_t *htmllibmanager_timing; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_widget_impl_html_library_manager_impl_properties_t;

__attribute__((deprecated)) com_day_cq_widget_impl_html_library_manager_impl_properties_t *com_day_cq_widget_impl_html_library_manager_impl_properties_create(
    config_node_property_string_t *htmllibmanager_clientmanager,
    config_node_property_boolean_t *htmllibmanager_debug,
    config_node_property_boolean_t *htmllibmanager_debug_console,
    config_node_property_string_t *htmllibmanager_debug_init_js,
    config_node_property_string_t *htmllibmanager_defaultthemename,
    config_node_property_string_t *htmllibmanager_defaultuserthemename,
    config_node_property_string_t *htmllibmanager_firebuglite_path,
    config_node_property_boolean_t *htmllibmanager_force_cq_url_info,
    config_node_property_boolean_t *htmllibmanager_gzip,
    config_node_property_integer_t *htmllibmanager_maxage,
    config_node_property_integer_t *htmllibmanager_max_data_uri_size,
    config_node_property_boolean_t *htmllibmanager_minify,
    config_node_property_array_t *htmllibmanager_path_list,
    config_node_property_boolean_t *htmllibmanager_timing
);

void com_day_cq_widget_impl_html_library_manager_impl_properties_free(com_day_cq_widget_impl_html_library_manager_impl_properties_t *com_day_cq_widget_impl_html_library_manager_impl_properties);

com_day_cq_widget_impl_html_library_manager_impl_properties_t *com_day_cq_widget_impl_html_library_manager_impl_properties_parseFromJSON(cJSON *com_day_cq_widget_impl_html_library_manager_impl_propertiesJSON);

cJSON *com_day_cq_widget_impl_html_library_manager_impl_properties_convertToJSON(com_day_cq_widget_impl_html_library_manager_impl_properties_t *com_day_cq_widget_impl_html_library_manager_impl_properties);

#endif /* _com_day_cq_widget_impl_html_library_manager_impl_properties_H_ */

