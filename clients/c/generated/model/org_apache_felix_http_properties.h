/*
 * org_apache_felix_http_properties.h
 *
 * 
 */

#ifndef _org_apache_felix_http_properties_H_
#define _org_apache_felix_http_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_felix_http_properties_t org_apache_felix_http_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_felix_http_properties_t {
    struct config_node_property_string_t *org_apache_felix_http_host; //model
    struct config_node_property_boolean_t *org_apache_felix_http_enable; //model
    struct config_node_property_integer_t *org_osgi_service_http_port; //model
    struct config_node_property_integer_t *org_apache_felix_http_timeout; //model
    struct config_node_property_boolean_t *org_apache_felix_https_enable; //model
    struct config_node_property_integer_t *org_osgi_service_http_port_secure; //model
    struct config_node_property_string_t *org_apache_felix_https_keystore; //model
    struct config_node_property_string_t *org_apache_felix_https_keystore_password; //model
    struct config_node_property_string_t *org_apache_felix_https_keystore_key_password; //model
    struct config_node_property_string_t *org_apache_felix_https_truststore; //model
    struct config_node_property_string_t *org_apache_felix_https_truststore_password; //model
    struct config_node_property_drop_down_t *org_apache_felix_https_clientcertificate; //model
    struct config_node_property_string_t *org_apache_felix_http_context_path; //model
    struct config_node_property_boolean_t *org_apache_felix_http_mbeans; //model
    struct config_node_property_integer_t *org_apache_felix_http_session_timeout; //model
    struct config_node_property_integer_t *org_apache_felix_http_jetty_threadpool_max; //model
    struct config_node_property_integer_t *org_apache_felix_http_jetty_acceptors; //model
    struct config_node_property_integer_t *org_apache_felix_http_jetty_selectors; //model
    struct config_node_property_integer_t *org_apache_felix_http_jetty_header_buffer_size; //model
    struct config_node_property_integer_t *org_apache_felix_http_jetty_request_buffer_size; //model
    struct config_node_property_integer_t *org_apache_felix_http_jetty_response_buffer_size; //model
    struct config_node_property_integer_t *org_apache_felix_http_jetty_max_form_size; //model
    struct config_node_property_array_t *org_apache_felix_http_path_exclusions; //model
    struct config_node_property_array_t *org_apache_felix_https_jetty_ciphersuites_excluded; //model
    struct config_node_property_array_t *org_apache_felix_https_jetty_ciphersuites_included; //model
    struct config_node_property_boolean_t *org_apache_felix_http_jetty_send_server_header; //model
    struct config_node_property_array_t *org_apache_felix_https_jetty_protocols_included; //model
    struct config_node_property_array_t *org_apache_felix_https_jetty_protocols_excluded; //model
    struct config_node_property_boolean_t *org_apache_felix_proxy_load_balancer_connection_enable; //model
    struct config_node_property_boolean_t *org_apache_felix_https_jetty_renegotiate_allowed; //model
    struct config_node_property_boolean_t *org_apache_felix_https_jetty_session_cookie_http_only; //model
    struct config_node_property_boolean_t *org_apache_felix_https_jetty_session_cookie_secure; //model
    struct config_node_property_string_t *org_eclipse_jetty_servlet_session_id_path_parameter_name; //model
    struct config_node_property_boolean_t *org_eclipse_jetty_servlet_checking_remote_session_id_encoding; //model
    struct config_node_property_string_t *org_eclipse_jetty_servlet_session_cookie; //model
    struct config_node_property_string_t *org_eclipse_jetty_servlet_session_domain; //model
    struct config_node_property_string_t *org_eclipse_jetty_servlet_session_path; //model
    struct config_node_property_integer_t *org_eclipse_jetty_servlet_max_age; //model
    struct config_node_property_string_t *org_apache_felix_http_name; //model
    struct config_node_property_boolean_t *org_apache_felix_jetty_gziphandler_enable; //model
    struct config_node_property_integer_t *org_apache_felix_jetty_gzip_min_gzip_size; //model
    struct config_node_property_integer_t *org_apache_felix_jetty_gzip_compression_level; //model
    struct config_node_property_integer_t *org_apache_felix_jetty_gzip_inflate_buffer_size; //model
    struct config_node_property_boolean_t *org_apache_felix_jetty_gzip_sync_flush; //model
    struct config_node_property_array_t *org_apache_felix_jetty_gzip_excluded_user_agents; //model
    struct config_node_property_array_t *org_apache_felix_jetty_gzip_included_methods; //model
    struct config_node_property_array_t *org_apache_felix_jetty_gzip_excluded_methods; //model
    struct config_node_property_array_t *org_apache_felix_jetty_gzip_included_paths; //model
    struct config_node_property_array_t *org_apache_felix_jetty_gzip_excluded_paths; //model
    struct config_node_property_array_t *org_apache_felix_jetty_gzip_included_mime_types; //model
    struct config_node_property_array_t *org_apache_felix_jetty_gzip_excluded_mime_types; //model
    struct config_node_property_boolean_t *org_apache_felix_http_session_invalidate; //model
    struct config_node_property_boolean_t *org_apache_felix_http_session_uniqueid; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_felix_http_properties_t;

__attribute__((deprecated)) org_apache_felix_http_properties_t *org_apache_felix_http_properties_create(
    config_node_property_string_t *org_apache_felix_http_host,
    config_node_property_boolean_t *org_apache_felix_http_enable,
    config_node_property_integer_t *org_osgi_service_http_port,
    config_node_property_integer_t *org_apache_felix_http_timeout,
    config_node_property_boolean_t *org_apache_felix_https_enable,
    config_node_property_integer_t *org_osgi_service_http_port_secure,
    config_node_property_string_t *org_apache_felix_https_keystore,
    config_node_property_string_t *org_apache_felix_https_keystore_password,
    config_node_property_string_t *org_apache_felix_https_keystore_key_password,
    config_node_property_string_t *org_apache_felix_https_truststore,
    config_node_property_string_t *org_apache_felix_https_truststore_password,
    config_node_property_drop_down_t *org_apache_felix_https_clientcertificate,
    config_node_property_string_t *org_apache_felix_http_context_path,
    config_node_property_boolean_t *org_apache_felix_http_mbeans,
    config_node_property_integer_t *org_apache_felix_http_session_timeout,
    config_node_property_integer_t *org_apache_felix_http_jetty_threadpool_max,
    config_node_property_integer_t *org_apache_felix_http_jetty_acceptors,
    config_node_property_integer_t *org_apache_felix_http_jetty_selectors,
    config_node_property_integer_t *org_apache_felix_http_jetty_header_buffer_size,
    config_node_property_integer_t *org_apache_felix_http_jetty_request_buffer_size,
    config_node_property_integer_t *org_apache_felix_http_jetty_response_buffer_size,
    config_node_property_integer_t *org_apache_felix_http_jetty_max_form_size,
    config_node_property_array_t *org_apache_felix_http_path_exclusions,
    config_node_property_array_t *org_apache_felix_https_jetty_ciphersuites_excluded,
    config_node_property_array_t *org_apache_felix_https_jetty_ciphersuites_included,
    config_node_property_boolean_t *org_apache_felix_http_jetty_send_server_header,
    config_node_property_array_t *org_apache_felix_https_jetty_protocols_included,
    config_node_property_array_t *org_apache_felix_https_jetty_protocols_excluded,
    config_node_property_boolean_t *org_apache_felix_proxy_load_balancer_connection_enable,
    config_node_property_boolean_t *org_apache_felix_https_jetty_renegotiate_allowed,
    config_node_property_boolean_t *org_apache_felix_https_jetty_session_cookie_http_only,
    config_node_property_boolean_t *org_apache_felix_https_jetty_session_cookie_secure,
    config_node_property_string_t *org_eclipse_jetty_servlet_session_id_path_parameter_name,
    config_node_property_boolean_t *org_eclipse_jetty_servlet_checking_remote_session_id_encoding,
    config_node_property_string_t *org_eclipse_jetty_servlet_session_cookie,
    config_node_property_string_t *org_eclipse_jetty_servlet_session_domain,
    config_node_property_string_t *org_eclipse_jetty_servlet_session_path,
    config_node_property_integer_t *org_eclipse_jetty_servlet_max_age,
    config_node_property_string_t *org_apache_felix_http_name,
    config_node_property_boolean_t *org_apache_felix_jetty_gziphandler_enable,
    config_node_property_integer_t *org_apache_felix_jetty_gzip_min_gzip_size,
    config_node_property_integer_t *org_apache_felix_jetty_gzip_compression_level,
    config_node_property_integer_t *org_apache_felix_jetty_gzip_inflate_buffer_size,
    config_node_property_boolean_t *org_apache_felix_jetty_gzip_sync_flush,
    config_node_property_array_t *org_apache_felix_jetty_gzip_excluded_user_agents,
    config_node_property_array_t *org_apache_felix_jetty_gzip_included_methods,
    config_node_property_array_t *org_apache_felix_jetty_gzip_excluded_methods,
    config_node_property_array_t *org_apache_felix_jetty_gzip_included_paths,
    config_node_property_array_t *org_apache_felix_jetty_gzip_excluded_paths,
    config_node_property_array_t *org_apache_felix_jetty_gzip_included_mime_types,
    config_node_property_array_t *org_apache_felix_jetty_gzip_excluded_mime_types,
    config_node_property_boolean_t *org_apache_felix_http_session_invalidate,
    config_node_property_boolean_t *org_apache_felix_http_session_uniqueid
);

void org_apache_felix_http_properties_free(org_apache_felix_http_properties_t *org_apache_felix_http_properties);

org_apache_felix_http_properties_t *org_apache_felix_http_properties_parseFromJSON(cJSON *org_apache_felix_http_propertiesJSON);

cJSON *org_apache_felix_http_properties_convertToJSON(org_apache_felix_http_properties_t *org_apache_felix_http_properties);

#endif /* _org_apache_felix_http_properties_H_ */

