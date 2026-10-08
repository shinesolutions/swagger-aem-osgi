/*
 * org_apache_sling_commons_log_log_manager_factory_writer_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_commons_log_log_manager_factory_writer_properties_H_
#define _org_apache_sling_commons_log_log_manager_factory_writer_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_commons_log_log_manager_factory_writer_properties_t org_apache_sling_commons_log_log_manager_factory_writer_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_commons_log_log_manager_factory_writer_properties_t {
    struct config_node_property_string_t *org_apache_sling_commons_log_file; //model
    struct config_node_property_integer_t *org_apache_sling_commons_log_file_number; //model
    struct config_node_property_string_t *org_apache_sling_commons_log_file_size; //model
    struct config_node_property_boolean_t *org_apache_sling_commons_log_file_buffered; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_commons_log_log_manager_factory_writer_properties_t;

__attribute__((deprecated)) org_apache_sling_commons_log_log_manager_factory_writer_properties_t *org_apache_sling_commons_log_log_manager_factory_writer_properties_create(
    config_node_property_string_t *org_apache_sling_commons_log_file,
    config_node_property_integer_t *org_apache_sling_commons_log_file_number,
    config_node_property_string_t *org_apache_sling_commons_log_file_size,
    config_node_property_boolean_t *org_apache_sling_commons_log_file_buffered
);

void org_apache_sling_commons_log_log_manager_factory_writer_properties_free(org_apache_sling_commons_log_log_manager_factory_writer_properties_t *org_apache_sling_commons_log_log_manager_factory_writer_properties);

org_apache_sling_commons_log_log_manager_factory_writer_properties_t *org_apache_sling_commons_log_log_manager_factory_writer_properties_parseFromJSON(cJSON *org_apache_sling_commons_log_log_manager_factory_writer_propertiesJSON);

cJSON *org_apache_sling_commons_log_log_manager_factory_writer_properties_convertToJSON(org_apache_sling_commons_log_log_manager_factory_writer_properties_t *org_apache_sling_commons_log_log_manager_factory_writer_properties);

#endif /* _org_apache_sling_commons_log_log_manager_factory_writer_properties_H_ */

