#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties.h"



static org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_create_internal(
    config_node_property_string_t *solr_http_url,
    config_node_property_string_t *solr_zk_host,
    config_node_property_string_t *solr_collection,
    config_node_property_integer_t *solr_socket_timeout,
    config_node_property_integer_t *solr_connection_timeout,
    config_node_property_integer_t *solr_shards_no,
    config_node_property_integer_t *solr_replication_factor,
    config_node_property_string_t *solr_conf_dir
    ) {
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t));
    if (!org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t));
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var->solr_http_url = solr_http_url;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var->solr_zk_host = solr_zk_host;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var->solr_collection = solr_collection;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var->solr_socket_timeout = solr_socket_timeout;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var->solr_connection_timeout = solr_connection_timeout;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var->solr_shards_no = solr_shards_no;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var->solr_replication_factor = solr_replication_factor;
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var->solr_conf_dir = solr_conf_dir;
    return org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_create(
    config_node_property_string_t *solr_http_url,
    config_node_property_string_t *solr_zk_host,
    config_node_property_string_t *solr_collection,
    config_node_property_integer_t *solr_socket_timeout,
    config_node_property_integer_t *solr_connection_timeout,
    config_node_property_integer_t *solr_shards_no,
    config_node_property_integer_t *solr_replication_factor,
    config_node_property_string_t *solr_conf_dir
    ) {
    org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t *result = org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_create_internal (
        solr_http_url,
        solr_zk_host,
        solr_collection,
        solr_socket_timeout,
        solr_connection_timeout,
        solr_shards_no,
        solr_replication_factor,
        solr_conf_dir
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties) {
    if(NULL == org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_http_url) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_http_url);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_http_url = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_zk_host) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_zk_host);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_zk_host = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_collection) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_collection);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_collection = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_socket_timeout) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_socket_timeout);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_socket_timeout = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_connection_timeout) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_connection_timeout);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_connection_timeout = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_shards_no) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_shards_no);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_shards_no = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_replication_factor) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_replication_factor);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_replication_factor = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_conf_dir) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_conf_dir);
        org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_conf_dir = NULL;
    }
    free(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties);
}

cJSON *org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_http_url
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_http_url) {
    cJSON *solr_http_url_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_http_url);
    if(solr_http_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "solr.http.url", solr_http_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_zk_host
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_zk_host) {
    cJSON *solr_zk_host_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_zk_host);
    if(solr_zk_host_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "solr.zk.host", solr_zk_host_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_collection
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_collection) {
    cJSON *solr_collection_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_collection);
    if(solr_collection_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "solr.collection", solr_collection_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_socket_timeout
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_socket_timeout) {
    cJSON *solr_socket_timeout_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_socket_timeout);
    if(solr_socket_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "solr.socket.timeout", solr_socket_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_connection_timeout
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_connection_timeout) {
    cJSON *solr_connection_timeout_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_connection_timeout);
    if(solr_connection_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "solr.connection.timeout", solr_connection_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_shards_no
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_shards_no) {
    cJSON *solr_shards_no_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_shards_no);
    if(solr_shards_no_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "solr.shards.no", solr_shards_no_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_replication_factor
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_replication_factor) {
    cJSON *solr_replication_factor_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_replication_factor);
    if(solr_replication_factor_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "solr.replication.factor", solr_replication_factor_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_conf_dir
    if(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_conf_dir) {
    cJSON *solr_conf_dir_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_conf_dir);
    if(solr_conf_dir_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "solr.conf.dir", solr_conf_dir_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_propertiesJSON){

    org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_t *org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_http_url
    config_node_property_string_t *solr_http_url_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_zk_host
    config_node_property_string_t *solr_zk_host_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_collection
    config_node_property_string_t *solr_collection_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_socket_timeout
    config_node_property_integer_t *solr_socket_timeout_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_connection_timeout
    config_node_property_integer_t *solr_connection_timeout_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_shards_no
    config_node_property_integer_t *solr_shards_no_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_replication_factor
    config_node_property_integer_t *solr_replication_factor_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_conf_dir
    config_node_property_string_t *solr_conf_dir_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_http_url
    cJSON *solr_http_url = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_propertiesJSON, "solr.http.url");
    if (cJSON_IsNull(solr_http_url)) {
        solr_http_url = NULL;
    }
    if (solr_http_url) { 
    solr_http_url_local_nonprim = config_node_property_string_parseFromJSON(solr_http_url); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_zk_host
    cJSON *solr_zk_host = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_propertiesJSON, "solr.zk.host");
    if (cJSON_IsNull(solr_zk_host)) {
        solr_zk_host = NULL;
    }
    if (solr_zk_host) { 
    solr_zk_host_local_nonprim = config_node_property_string_parseFromJSON(solr_zk_host); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_collection
    cJSON *solr_collection = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_propertiesJSON, "solr.collection");
    if (cJSON_IsNull(solr_collection)) {
        solr_collection = NULL;
    }
    if (solr_collection) { 
    solr_collection_local_nonprim = config_node_property_string_parseFromJSON(solr_collection); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_socket_timeout
    cJSON *solr_socket_timeout = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_propertiesJSON, "solr.socket.timeout");
    if (cJSON_IsNull(solr_socket_timeout)) {
        solr_socket_timeout = NULL;
    }
    if (solr_socket_timeout) { 
    solr_socket_timeout_local_nonprim = config_node_property_integer_parseFromJSON(solr_socket_timeout); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_connection_timeout
    cJSON *solr_connection_timeout = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_propertiesJSON, "solr.connection.timeout");
    if (cJSON_IsNull(solr_connection_timeout)) {
        solr_connection_timeout = NULL;
    }
    if (solr_connection_timeout) { 
    solr_connection_timeout_local_nonprim = config_node_property_integer_parseFromJSON(solr_connection_timeout); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_shards_no
    cJSON *solr_shards_no = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_propertiesJSON, "solr.shards.no");
    if (cJSON_IsNull(solr_shards_no)) {
        solr_shards_no = NULL;
    }
    if (solr_shards_no) { 
    solr_shards_no_local_nonprim = config_node_property_integer_parseFromJSON(solr_shards_no); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_replication_factor
    cJSON *solr_replication_factor = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_propertiesJSON, "solr.replication.factor");
    if (cJSON_IsNull(solr_replication_factor)) {
        solr_replication_factor = NULL;
    }
    if (solr_replication_factor) { 
    solr_replication_factor_local_nonprim = config_node_property_integer_parseFromJSON(solr_replication_factor); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties->solr_conf_dir
    cJSON *solr_conf_dir = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_propertiesJSON, "solr.conf.dir");
    if (cJSON_IsNull(solr_conf_dir)) {
        solr_conf_dir = NULL;
    }
    if (solr_conf_dir) { 
    solr_conf_dir_local_nonprim = config_node_property_string_parseFromJSON(solr_conf_dir); //nonprimitive
    }



    org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var = org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_create_internal (
        solr_http_url ? solr_http_url_local_nonprim : NULL,
        solr_zk_host ? solr_zk_host_local_nonprim : NULL,
        solr_collection ? solr_collection_local_nonprim : NULL,
        solr_socket_timeout ? solr_socket_timeout_local_nonprim : NULL,
        solr_connection_timeout ? solr_connection_timeout_local_nonprim : NULL,
        solr_shards_no ? solr_shards_no_local_nonprim : NULL,
        solr_replication_factor ? solr_replication_factor_local_nonprim : NULL,
        solr_conf_dir ? solr_conf_dir_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties_local_var;
end:
    if (solr_http_url_local_nonprim) {
        config_node_property_string_free(solr_http_url_local_nonprim);
        solr_http_url_local_nonprim = NULL;
    }
    if (solr_zk_host_local_nonprim) {
        config_node_property_string_free(solr_zk_host_local_nonprim);
        solr_zk_host_local_nonprim = NULL;
    }
    if (solr_collection_local_nonprim) {
        config_node_property_string_free(solr_collection_local_nonprim);
        solr_collection_local_nonprim = NULL;
    }
    if (solr_socket_timeout_local_nonprim) {
        config_node_property_integer_free(solr_socket_timeout_local_nonprim);
        solr_socket_timeout_local_nonprim = NULL;
    }
    if (solr_connection_timeout_local_nonprim) {
        config_node_property_integer_free(solr_connection_timeout_local_nonprim);
        solr_connection_timeout_local_nonprim = NULL;
    }
    if (solr_shards_no_local_nonprim) {
        config_node_property_integer_free(solr_shards_no_local_nonprim);
        solr_shards_no_local_nonprim = NULL;
    }
    if (solr_replication_factor_local_nonprim) {
        config_node_property_integer_free(solr_replication_factor_local_nonprim);
        solr_replication_factor_local_nonprim = NULL;
    }
    if (solr_conf_dir_local_nonprim) {
        config_node_property_string_free(solr_conf_dir_local_nonprim);
        solr_conf_dir_local_nonprim = NULL;
    }
    return NULL;

}
