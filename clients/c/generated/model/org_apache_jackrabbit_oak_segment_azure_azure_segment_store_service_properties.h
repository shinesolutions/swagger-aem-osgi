/*
 * org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties.h
 *
 * 
 */

#ifndef _org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_H_
#define _org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t;

#include "config_node_property_string.h"



typedef struct org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t {
    struct config_node_property_string_t *account_name; //model
    struct config_node_property_string_t *container_name; //model
    struct config_node_property_string_t *access_key; //model
    struct config_node_property_string_t *root_path; //model
    struct config_node_property_string_t *connection_url; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t;

__attribute__((deprecated)) org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t *org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_create(
    config_node_property_string_t *account_name,
    config_node_property_string_t *container_name,
    config_node_property_string_t *access_key,
    config_node_property_string_t *root_path,
    config_node_property_string_t *connection_url
);

void org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_free(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t *org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties);

org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t *org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_propertiesJSON);

cJSON *org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_convertToJSON(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_t *org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties);

#endif /* _org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_H_ */

