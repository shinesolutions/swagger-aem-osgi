/*
 * org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties.h
 *
 * 
 */

#ifndef _org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_H_
#define _org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t;

#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t {
    struct config_node_property_string_t *solr_http_url; //model
    struct config_node_property_string_t *solr_zk_host; //model
    struct config_node_property_string_t *solr_collection; //model
    struct config_node_property_integer_t *solr_socket_timeout; //model
    struct config_node_property_integer_t *solr_connection_timeout; //model
    struct config_node_property_integer_t *solr_shards_no; //model
    struct config_node_property_integer_t *solr_replication_factor; //model
    struct config_node_property_string_t *solr_conf_dir; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t;

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_create(
    config_node_property_string_t *solr_http_url,
    config_node_property_string_t *solr_zk_host,
    config_node_property_string_t *solr_collection,
    config_node_property_integer_t *solr_socket_timeout,
    config_node_property_integer_t *solr_connection_timeout,
    config_node_property_integer_t *solr_shards_no,
    config_node_property_integer_t *solr_replication_factor,
    config_node_property_string_t *solr_conf_dir
);

void org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties);

org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_propertiesJSON);

cJSON *org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties);

#endif /* _org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_H_ */

