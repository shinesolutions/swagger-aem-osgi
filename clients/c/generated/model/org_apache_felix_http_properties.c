#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_felix_http_properties.h"



static org_apache_felix_http_properties_t *org_apache_felix_http_properties_create_internal(
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
    ) {
    org_apache_felix_http_properties_t *org_apache_felix_http_properties_local_var = malloc(sizeof(org_apache_felix_http_properties_t));
    if (!org_apache_felix_http_properties_local_var) {
        return NULL;
    }
    memset(org_apache_felix_http_properties_local_var, 0, sizeof(org_apache_felix_http_properties_t));
    org_apache_felix_http_properties_local_var->_library_owned = 1;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_host = org_apache_felix_http_host;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_enable = org_apache_felix_http_enable;
    org_apache_felix_http_properties_local_var->org_osgi_service_http_port = org_osgi_service_http_port;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_timeout = org_apache_felix_http_timeout;
    org_apache_felix_http_properties_local_var->org_apache_felix_https_enable = org_apache_felix_https_enable;
    org_apache_felix_http_properties_local_var->org_osgi_service_http_port_secure = org_osgi_service_http_port_secure;
    org_apache_felix_http_properties_local_var->org_apache_felix_https_keystore = org_apache_felix_https_keystore;
    org_apache_felix_http_properties_local_var->org_apache_felix_https_keystore_password = org_apache_felix_https_keystore_password;
    org_apache_felix_http_properties_local_var->org_apache_felix_https_keystore_key_password = org_apache_felix_https_keystore_key_password;
    org_apache_felix_http_properties_local_var->org_apache_felix_https_truststore = org_apache_felix_https_truststore;
    org_apache_felix_http_properties_local_var->org_apache_felix_https_truststore_password = org_apache_felix_https_truststore_password;
    org_apache_felix_http_properties_local_var->org_apache_felix_https_clientcertificate = org_apache_felix_https_clientcertificate;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_context_path = org_apache_felix_http_context_path;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_mbeans = org_apache_felix_http_mbeans;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_session_timeout = org_apache_felix_http_session_timeout;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_jetty_threadpool_max = org_apache_felix_http_jetty_threadpool_max;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_jetty_acceptors = org_apache_felix_http_jetty_acceptors;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_jetty_selectors = org_apache_felix_http_jetty_selectors;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_jetty_header_buffer_size = org_apache_felix_http_jetty_header_buffer_size;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_jetty_request_buffer_size = org_apache_felix_http_jetty_request_buffer_size;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_jetty_response_buffer_size = org_apache_felix_http_jetty_response_buffer_size;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_jetty_max_form_size = org_apache_felix_http_jetty_max_form_size;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_path_exclusions = org_apache_felix_http_path_exclusions;
    org_apache_felix_http_properties_local_var->org_apache_felix_https_jetty_ciphersuites_excluded = org_apache_felix_https_jetty_ciphersuites_excluded;
    org_apache_felix_http_properties_local_var->org_apache_felix_https_jetty_ciphersuites_included = org_apache_felix_https_jetty_ciphersuites_included;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_jetty_send_server_header = org_apache_felix_http_jetty_send_server_header;
    org_apache_felix_http_properties_local_var->org_apache_felix_https_jetty_protocols_included = org_apache_felix_https_jetty_protocols_included;
    org_apache_felix_http_properties_local_var->org_apache_felix_https_jetty_protocols_excluded = org_apache_felix_https_jetty_protocols_excluded;
    org_apache_felix_http_properties_local_var->org_apache_felix_proxy_load_balancer_connection_enable = org_apache_felix_proxy_load_balancer_connection_enable;
    org_apache_felix_http_properties_local_var->org_apache_felix_https_jetty_renegotiate_allowed = org_apache_felix_https_jetty_renegotiate_allowed;
    org_apache_felix_http_properties_local_var->org_apache_felix_https_jetty_session_cookie_http_only = org_apache_felix_https_jetty_session_cookie_http_only;
    org_apache_felix_http_properties_local_var->org_apache_felix_https_jetty_session_cookie_secure = org_apache_felix_https_jetty_session_cookie_secure;
    org_apache_felix_http_properties_local_var->org_eclipse_jetty_servlet_session_id_path_parameter_name = org_eclipse_jetty_servlet_session_id_path_parameter_name;
    org_apache_felix_http_properties_local_var->org_eclipse_jetty_servlet_checking_remote_session_id_encoding = org_eclipse_jetty_servlet_checking_remote_session_id_encoding;
    org_apache_felix_http_properties_local_var->org_eclipse_jetty_servlet_session_cookie = org_eclipse_jetty_servlet_session_cookie;
    org_apache_felix_http_properties_local_var->org_eclipse_jetty_servlet_session_domain = org_eclipse_jetty_servlet_session_domain;
    org_apache_felix_http_properties_local_var->org_eclipse_jetty_servlet_session_path = org_eclipse_jetty_servlet_session_path;
    org_apache_felix_http_properties_local_var->org_eclipse_jetty_servlet_max_age = org_eclipse_jetty_servlet_max_age;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_name = org_apache_felix_http_name;
    org_apache_felix_http_properties_local_var->org_apache_felix_jetty_gziphandler_enable = org_apache_felix_jetty_gziphandler_enable;
    org_apache_felix_http_properties_local_var->org_apache_felix_jetty_gzip_min_gzip_size = org_apache_felix_jetty_gzip_min_gzip_size;
    org_apache_felix_http_properties_local_var->org_apache_felix_jetty_gzip_compression_level = org_apache_felix_jetty_gzip_compression_level;
    org_apache_felix_http_properties_local_var->org_apache_felix_jetty_gzip_inflate_buffer_size = org_apache_felix_jetty_gzip_inflate_buffer_size;
    org_apache_felix_http_properties_local_var->org_apache_felix_jetty_gzip_sync_flush = org_apache_felix_jetty_gzip_sync_flush;
    org_apache_felix_http_properties_local_var->org_apache_felix_jetty_gzip_excluded_user_agents = org_apache_felix_jetty_gzip_excluded_user_agents;
    org_apache_felix_http_properties_local_var->org_apache_felix_jetty_gzip_included_methods = org_apache_felix_jetty_gzip_included_methods;
    org_apache_felix_http_properties_local_var->org_apache_felix_jetty_gzip_excluded_methods = org_apache_felix_jetty_gzip_excluded_methods;
    org_apache_felix_http_properties_local_var->org_apache_felix_jetty_gzip_included_paths = org_apache_felix_jetty_gzip_included_paths;
    org_apache_felix_http_properties_local_var->org_apache_felix_jetty_gzip_excluded_paths = org_apache_felix_jetty_gzip_excluded_paths;
    org_apache_felix_http_properties_local_var->org_apache_felix_jetty_gzip_included_mime_types = org_apache_felix_jetty_gzip_included_mime_types;
    org_apache_felix_http_properties_local_var->org_apache_felix_jetty_gzip_excluded_mime_types = org_apache_felix_jetty_gzip_excluded_mime_types;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_session_invalidate = org_apache_felix_http_session_invalidate;
    org_apache_felix_http_properties_local_var->org_apache_felix_http_session_uniqueid = org_apache_felix_http_session_uniqueid;
    return org_apache_felix_http_properties_local_var;
}

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
    ) {
    org_apache_felix_http_properties_t *result = org_apache_felix_http_properties_create_internal (
        org_apache_felix_http_host,
        org_apache_felix_http_enable,
        org_osgi_service_http_port,
        org_apache_felix_http_timeout,
        org_apache_felix_https_enable,
        org_osgi_service_http_port_secure,
        org_apache_felix_https_keystore,
        org_apache_felix_https_keystore_password,
        org_apache_felix_https_keystore_key_password,
        org_apache_felix_https_truststore,
        org_apache_felix_https_truststore_password,
        org_apache_felix_https_clientcertificate,
        org_apache_felix_http_context_path,
        org_apache_felix_http_mbeans,
        org_apache_felix_http_session_timeout,
        org_apache_felix_http_jetty_threadpool_max,
        org_apache_felix_http_jetty_acceptors,
        org_apache_felix_http_jetty_selectors,
        org_apache_felix_http_jetty_header_buffer_size,
        org_apache_felix_http_jetty_request_buffer_size,
        org_apache_felix_http_jetty_response_buffer_size,
        org_apache_felix_http_jetty_max_form_size,
        org_apache_felix_http_path_exclusions,
        org_apache_felix_https_jetty_ciphersuites_excluded,
        org_apache_felix_https_jetty_ciphersuites_included,
        org_apache_felix_http_jetty_send_server_header,
        org_apache_felix_https_jetty_protocols_included,
        org_apache_felix_https_jetty_protocols_excluded,
        org_apache_felix_proxy_load_balancer_connection_enable,
        org_apache_felix_https_jetty_renegotiate_allowed,
        org_apache_felix_https_jetty_session_cookie_http_only,
        org_apache_felix_https_jetty_session_cookie_secure,
        org_eclipse_jetty_servlet_session_id_path_parameter_name,
        org_eclipse_jetty_servlet_checking_remote_session_id_encoding,
        org_eclipse_jetty_servlet_session_cookie,
        org_eclipse_jetty_servlet_session_domain,
        org_eclipse_jetty_servlet_session_path,
        org_eclipse_jetty_servlet_max_age,
        org_apache_felix_http_name,
        org_apache_felix_jetty_gziphandler_enable,
        org_apache_felix_jetty_gzip_min_gzip_size,
        org_apache_felix_jetty_gzip_compression_level,
        org_apache_felix_jetty_gzip_inflate_buffer_size,
        org_apache_felix_jetty_gzip_sync_flush,
        org_apache_felix_jetty_gzip_excluded_user_agents,
        org_apache_felix_jetty_gzip_included_methods,
        org_apache_felix_jetty_gzip_excluded_methods,
        org_apache_felix_jetty_gzip_included_paths,
        org_apache_felix_jetty_gzip_excluded_paths,
        org_apache_felix_jetty_gzip_included_mime_types,
        org_apache_felix_jetty_gzip_excluded_mime_types,
        org_apache_felix_http_session_invalidate,
        org_apache_felix_http_session_uniqueid
        );
    if (!result) {
    }
    return result;
}

void org_apache_felix_http_properties_free(org_apache_felix_http_properties_t *org_apache_felix_http_properties) {
    if(NULL == org_apache_felix_http_properties){
        return ;
    }
    if(org_apache_felix_http_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_felix_http_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_felix_http_properties->org_apache_felix_http_host) {
        config_node_property_string_free(org_apache_felix_http_properties->org_apache_felix_http_host);
        org_apache_felix_http_properties->org_apache_felix_http_host = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_enable) {
        config_node_property_boolean_free(org_apache_felix_http_properties->org_apache_felix_http_enable);
        org_apache_felix_http_properties->org_apache_felix_http_enable = NULL;
    }
    if (org_apache_felix_http_properties->org_osgi_service_http_port) {
        config_node_property_integer_free(org_apache_felix_http_properties->org_osgi_service_http_port);
        org_apache_felix_http_properties->org_osgi_service_http_port = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_timeout) {
        config_node_property_integer_free(org_apache_felix_http_properties->org_apache_felix_http_timeout);
        org_apache_felix_http_properties->org_apache_felix_http_timeout = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_https_enable) {
        config_node_property_boolean_free(org_apache_felix_http_properties->org_apache_felix_https_enable);
        org_apache_felix_http_properties->org_apache_felix_https_enable = NULL;
    }
    if (org_apache_felix_http_properties->org_osgi_service_http_port_secure) {
        config_node_property_integer_free(org_apache_felix_http_properties->org_osgi_service_http_port_secure);
        org_apache_felix_http_properties->org_osgi_service_http_port_secure = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_https_keystore) {
        config_node_property_string_free(org_apache_felix_http_properties->org_apache_felix_https_keystore);
        org_apache_felix_http_properties->org_apache_felix_https_keystore = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_https_keystore_password) {
        config_node_property_string_free(org_apache_felix_http_properties->org_apache_felix_https_keystore_password);
        org_apache_felix_http_properties->org_apache_felix_https_keystore_password = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_https_keystore_key_password) {
        config_node_property_string_free(org_apache_felix_http_properties->org_apache_felix_https_keystore_key_password);
        org_apache_felix_http_properties->org_apache_felix_https_keystore_key_password = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_https_truststore) {
        config_node_property_string_free(org_apache_felix_http_properties->org_apache_felix_https_truststore);
        org_apache_felix_http_properties->org_apache_felix_https_truststore = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_https_truststore_password) {
        config_node_property_string_free(org_apache_felix_http_properties->org_apache_felix_https_truststore_password);
        org_apache_felix_http_properties->org_apache_felix_https_truststore_password = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_https_clientcertificate) {
        config_node_property_drop_down_free(org_apache_felix_http_properties->org_apache_felix_https_clientcertificate);
        org_apache_felix_http_properties->org_apache_felix_https_clientcertificate = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_context_path) {
        config_node_property_string_free(org_apache_felix_http_properties->org_apache_felix_http_context_path);
        org_apache_felix_http_properties->org_apache_felix_http_context_path = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_mbeans) {
        config_node_property_boolean_free(org_apache_felix_http_properties->org_apache_felix_http_mbeans);
        org_apache_felix_http_properties->org_apache_felix_http_mbeans = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_session_timeout) {
        config_node_property_integer_free(org_apache_felix_http_properties->org_apache_felix_http_session_timeout);
        org_apache_felix_http_properties->org_apache_felix_http_session_timeout = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_jetty_threadpool_max) {
        config_node_property_integer_free(org_apache_felix_http_properties->org_apache_felix_http_jetty_threadpool_max);
        org_apache_felix_http_properties->org_apache_felix_http_jetty_threadpool_max = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_jetty_acceptors) {
        config_node_property_integer_free(org_apache_felix_http_properties->org_apache_felix_http_jetty_acceptors);
        org_apache_felix_http_properties->org_apache_felix_http_jetty_acceptors = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_jetty_selectors) {
        config_node_property_integer_free(org_apache_felix_http_properties->org_apache_felix_http_jetty_selectors);
        org_apache_felix_http_properties->org_apache_felix_http_jetty_selectors = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_jetty_header_buffer_size) {
        config_node_property_integer_free(org_apache_felix_http_properties->org_apache_felix_http_jetty_header_buffer_size);
        org_apache_felix_http_properties->org_apache_felix_http_jetty_header_buffer_size = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_jetty_request_buffer_size) {
        config_node_property_integer_free(org_apache_felix_http_properties->org_apache_felix_http_jetty_request_buffer_size);
        org_apache_felix_http_properties->org_apache_felix_http_jetty_request_buffer_size = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_jetty_response_buffer_size) {
        config_node_property_integer_free(org_apache_felix_http_properties->org_apache_felix_http_jetty_response_buffer_size);
        org_apache_felix_http_properties->org_apache_felix_http_jetty_response_buffer_size = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_jetty_max_form_size) {
        config_node_property_integer_free(org_apache_felix_http_properties->org_apache_felix_http_jetty_max_form_size);
        org_apache_felix_http_properties->org_apache_felix_http_jetty_max_form_size = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_path_exclusions) {
        config_node_property_array_free(org_apache_felix_http_properties->org_apache_felix_http_path_exclusions);
        org_apache_felix_http_properties->org_apache_felix_http_path_exclusions = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_excluded) {
        config_node_property_array_free(org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_excluded);
        org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_excluded = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_included) {
        config_node_property_array_free(org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_included);
        org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_included = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_jetty_send_server_header) {
        config_node_property_boolean_free(org_apache_felix_http_properties->org_apache_felix_http_jetty_send_server_header);
        org_apache_felix_http_properties->org_apache_felix_http_jetty_send_server_header = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_included) {
        config_node_property_array_free(org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_included);
        org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_included = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_excluded) {
        config_node_property_array_free(org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_excluded);
        org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_excluded = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_proxy_load_balancer_connection_enable) {
        config_node_property_boolean_free(org_apache_felix_http_properties->org_apache_felix_proxy_load_balancer_connection_enable);
        org_apache_felix_http_properties->org_apache_felix_proxy_load_balancer_connection_enable = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_https_jetty_renegotiate_allowed) {
        config_node_property_boolean_free(org_apache_felix_http_properties->org_apache_felix_https_jetty_renegotiate_allowed);
        org_apache_felix_http_properties->org_apache_felix_https_jetty_renegotiate_allowed = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_http_only) {
        config_node_property_boolean_free(org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_http_only);
        org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_http_only = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_secure) {
        config_node_property_boolean_free(org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_secure);
        org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_secure = NULL;
    }
    if (org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_id_path_parameter_name) {
        config_node_property_string_free(org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_id_path_parameter_name);
        org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_id_path_parameter_name = NULL;
    }
    if (org_apache_felix_http_properties->org_eclipse_jetty_servlet_checking_remote_session_id_encoding) {
        config_node_property_boolean_free(org_apache_felix_http_properties->org_eclipse_jetty_servlet_checking_remote_session_id_encoding);
        org_apache_felix_http_properties->org_eclipse_jetty_servlet_checking_remote_session_id_encoding = NULL;
    }
    if (org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_cookie) {
        config_node_property_string_free(org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_cookie);
        org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_cookie = NULL;
    }
    if (org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_domain) {
        config_node_property_string_free(org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_domain);
        org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_domain = NULL;
    }
    if (org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_path) {
        config_node_property_string_free(org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_path);
        org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_path = NULL;
    }
    if (org_apache_felix_http_properties->org_eclipse_jetty_servlet_max_age) {
        config_node_property_integer_free(org_apache_felix_http_properties->org_eclipse_jetty_servlet_max_age);
        org_apache_felix_http_properties->org_eclipse_jetty_servlet_max_age = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_name) {
        config_node_property_string_free(org_apache_felix_http_properties->org_apache_felix_http_name);
        org_apache_felix_http_properties->org_apache_felix_http_name = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_jetty_gziphandler_enable) {
        config_node_property_boolean_free(org_apache_felix_http_properties->org_apache_felix_jetty_gziphandler_enable);
        org_apache_felix_http_properties->org_apache_felix_jetty_gziphandler_enable = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_jetty_gzip_min_gzip_size) {
        config_node_property_integer_free(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_min_gzip_size);
        org_apache_felix_http_properties->org_apache_felix_jetty_gzip_min_gzip_size = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_jetty_gzip_compression_level) {
        config_node_property_integer_free(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_compression_level);
        org_apache_felix_http_properties->org_apache_felix_jetty_gzip_compression_level = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_jetty_gzip_inflate_buffer_size) {
        config_node_property_integer_free(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_inflate_buffer_size);
        org_apache_felix_http_properties->org_apache_felix_jetty_gzip_inflate_buffer_size = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_jetty_gzip_sync_flush) {
        config_node_property_boolean_free(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_sync_flush);
        org_apache_felix_http_properties->org_apache_felix_jetty_gzip_sync_flush = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_user_agents) {
        config_node_property_array_free(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_user_agents);
        org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_user_agents = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_methods) {
        config_node_property_array_free(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_methods);
        org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_methods = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_methods) {
        config_node_property_array_free(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_methods);
        org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_methods = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_paths) {
        config_node_property_array_free(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_paths);
        org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_paths = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_paths) {
        config_node_property_array_free(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_paths);
        org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_paths = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_mime_types) {
        config_node_property_array_free(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_mime_types);
        org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_mime_types = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_mime_types) {
        config_node_property_array_free(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_mime_types);
        org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_mime_types = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_session_invalidate) {
        config_node_property_boolean_free(org_apache_felix_http_properties->org_apache_felix_http_session_invalidate);
        org_apache_felix_http_properties->org_apache_felix_http_session_invalidate = NULL;
    }
    if (org_apache_felix_http_properties->org_apache_felix_http_session_uniqueid) {
        config_node_property_boolean_free(org_apache_felix_http_properties->org_apache_felix_http_session_uniqueid);
        org_apache_felix_http_properties->org_apache_felix_http_session_uniqueid = NULL;
    }
    free(org_apache_felix_http_properties);
}

cJSON *org_apache_felix_http_properties_convertToJSON(org_apache_felix_http_properties_t *org_apache_felix_http_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_felix_http_properties->org_apache_felix_http_host
    if(org_apache_felix_http_properties->org_apache_felix_http_host) {
    cJSON *org_apache_felix_http_host_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_host);
    if(org_apache_felix_http_host_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.host", org_apache_felix_http_host_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_enable
    if(org_apache_felix_http_properties->org_apache_felix_http_enable) {
    cJSON *org_apache_felix_http_enable_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_enable);
    if(org_apache_felix_http_enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.enable", org_apache_felix_http_enable_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_osgi_service_http_port
    if(org_apache_felix_http_properties->org_osgi_service_http_port) {
    cJSON *org_osgi_service_http_port_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_http_properties->org_osgi_service_http_port);
    if(org_osgi_service_http_port_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.osgi.service.http.port", org_osgi_service_http_port_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_timeout
    if(org_apache_felix_http_properties->org_apache_felix_http_timeout) {
    cJSON *org_apache_felix_http_timeout_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_timeout);
    if(org_apache_felix_http_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.timeout", org_apache_felix_http_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_https_enable
    if(org_apache_felix_http_properties->org_apache_felix_https_enable) {
    cJSON *org_apache_felix_https_enable_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_http_properties->org_apache_felix_https_enable);
    if(org_apache_felix_https_enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.https.enable", org_apache_felix_https_enable_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_osgi_service_http_port_secure
    if(org_apache_felix_http_properties->org_osgi_service_http_port_secure) {
    cJSON *org_osgi_service_http_port_secure_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_http_properties->org_osgi_service_http_port_secure);
    if(org_osgi_service_http_port_secure_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.osgi.service.http.port.secure", org_osgi_service_http_port_secure_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_https_keystore
    if(org_apache_felix_http_properties->org_apache_felix_https_keystore) {
    cJSON *org_apache_felix_https_keystore_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_http_properties->org_apache_felix_https_keystore);
    if(org_apache_felix_https_keystore_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.https.keystore", org_apache_felix_https_keystore_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_https_keystore_password
    if(org_apache_felix_http_properties->org_apache_felix_https_keystore_password) {
    cJSON *org_apache_felix_https_keystore_password_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_http_properties->org_apache_felix_https_keystore_password);
    if(org_apache_felix_https_keystore_password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.https.keystore.password", org_apache_felix_https_keystore_password_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_https_keystore_key_password
    if(org_apache_felix_http_properties->org_apache_felix_https_keystore_key_password) {
    cJSON *org_apache_felix_https_keystore_key_password_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_http_properties->org_apache_felix_https_keystore_key_password);
    if(org_apache_felix_https_keystore_key_password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.https.keystore.key.password", org_apache_felix_https_keystore_key_password_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_https_truststore
    if(org_apache_felix_http_properties->org_apache_felix_https_truststore) {
    cJSON *org_apache_felix_https_truststore_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_http_properties->org_apache_felix_https_truststore);
    if(org_apache_felix_https_truststore_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.https.truststore", org_apache_felix_https_truststore_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_https_truststore_password
    if(org_apache_felix_http_properties->org_apache_felix_https_truststore_password) {
    cJSON *org_apache_felix_https_truststore_password_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_http_properties->org_apache_felix_https_truststore_password);
    if(org_apache_felix_https_truststore_password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.https.truststore.password", org_apache_felix_https_truststore_password_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_https_clientcertificate
    if(org_apache_felix_http_properties->org_apache_felix_https_clientcertificate) {
    cJSON *org_apache_felix_https_clientcertificate_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_felix_http_properties->org_apache_felix_https_clientcertificate);
    if(org_apache_felix_https_clientcertificate_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.https.clientcertificate", org_apache_felix_https_clientcertificate_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_context_path
    if(org_apache_felix_http_properties->org_apache_felix_http_context_path) {
    cJSON *org_apache_felix_http_context_path_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_context_path);
    if(org_apache_felix_http_context_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.context_path", org_apache_felix_http_context_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_mbeans
    if(org_apache_felix_http_properties->org_apache_felix_http_mbeans) {
    cJSON *org_apache_felix_http_mbeans_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_mbeans);
    if(org_apache_felix_http_mbeans_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.mbeans", org_apache_felix_http_mbeans_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_session_timeout
    if(org_apache_felix_http_properties->org_apache_felix_http_session_timeout) {
    cJSON *org_apache_felix_http_session_timeout_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_session_timeout);
    if(org_apache_felix_http_session_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.session.timeout", org_apache_felix_http_session_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_jetty_threadpool_max
    if(org_apache_felix_http_properties->org_apache_felix_http_jetty_threadpool_max) {
    cJSON *org_apache_felix_http_jetty_threadpool_max_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_jetty_threadpool_max);
    if(org_apache_felix_http_jetty_threadpool_max_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.jetty.threadpool.max", org_apache_felix_http_jetty_threadpool_max_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_jetty_acceptors
    if(org_apache_felix_http_properties->org_apache_felix_http_jetty_acceptors) {
    cJSON *org_apache_felix_http_jetty_acceptors_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_jetty_acceptors);
    if(org_apache_felix_http_jetty_acceptors_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.jetty.acceptors", org_apache_felix_http_jetty_acceptors_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_jetty_selectors
    if(org_apache_felix_http_properties->org_apache_felix_http_jetty_selectors) {
    cJSON *org_apache_felix_http_jetty_selectors_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_jetty_selectors);
    if(org_apache_felix_http_jetty_selectors_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.jetty.selectors", org_apache_felix_http_jetty_selectors_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_jetty_header_buffer_size
    if(org_apache_felix_http_properties->org_apache_felix_http_jetty_header_buffer_size) {
    cJSON *org_apache_felix_http_jetty_header_buffer_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_jetty_header_buffer_size);
    if(org_apache_felix_http_jetty_header_buffer_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.jetty.headerBufferSize", org_apache_felix_http_jetty_header_buffer_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_jetty_request_buffer_size
    if(org_apache_felix_http_properties->org_apache_felix_http_jetty_request_buffer_size) {
    cJSON *org_apache_felix_http_jetty_request_buffer_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_jetty_request_buffer_size);
    if(org_apache_felix_http_jetty_request_buffer_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.jetty.requestBufferSize", org_apache_felix_http_jetty_request_buffer_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_jetty_response_buffer_size
    if(org_apache_felix_http_properties->org_apache_felix_http_jetty_response_buffer_size) {
    cJSON *org_apache_felix_http_jetty_response_buffer_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_jetty_response_buffer_size);
    if(org_apache_felix_http_jetty_response_buffer_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.jetty.responseBufferSize", org_apache_felix_http_jetty_response_buffer_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_jetty_max_form_size
    if(org_apache_felix_http_properties->org_apache_felix_http_jetty_max_form_size) {
    cJSON *org_apache_felix_http_jetty_max_form_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_jetty_max_form_size);
    if(org_apache_felix_http_jetty_max_form_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.jetty.maxFormSize", org_apache_felix_http_jetty_max_form_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_path_exclusions
    if(org_apache_felix_http_properties->org_apache_felix_http_path_exclusions) {
    cJSON *org_apache_felix_http_path_exclusions_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_path_exclusions);
    if(org_apache_felix_http_path_exclusions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.path_exclusions", org_apache_felix_http_path_exclusions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_excluded
    if(org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_excluded) {
    cJSON *org_apache_felix_https_jetty_ciphersuites_excluded_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_excluded);
    if(org_apache_felix_https_jetty_ciphersuites_excluded_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.https.jetty.ciphersuites.excluded", org_apache_felix_https_jetty_ciphersuites_excluded_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_included
    if(org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_included) {
    cJSON *org_apache_felix_https_jetty_ciphersuites_included_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_included);
    if(org_apache_felix_https_jetty_ciphersuites_included_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.https.jetty.ciphersuites.included", org_apache_felix_https_jetty_ciphersuites_included_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_jetty_send_server_header
    if(org_apache_felix_http_properties->org_apache_felix_http_jetty_send_server_header) {
    cJSON *org_apache_felix_http_jetty_send_server_header_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_jetty_send_server_header);
    if(org_apache_felix_http_jetty_send_server_header_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.jetty.sendServerHeader", org_apache_felix_http_jetty_send_server_header_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_included
    if(org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_included) {
    cJSON *org_apache_felix_https_jetty_protocols_included_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_included);
    if(org_apache_felix_https_jetty_protocols_included_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.https.jetty.protocols.included", org_apache_felix_https_jetty_protocols_included_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_excluded
    if(org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_excluded) {
    cJSON *org_apache_felix_https_jetty_protocols_excluded_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_excluded);
    if(org_apache_felix_https_jetty_protocols_excluded_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.https.jetty.protocols.excluded", org_apache_felix_https_jetty_protocols_excluded_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_proxy_load_balancer_connection_enable
    if(org_apache_felix_http_properties->org_apache_felix_proxy_load_balancer_connection_enable) {
    cJSON *org_apache_felix_proxy_load_balancer_connection_enable_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_http_properties->org_apache_felix_proxy_load_balancer_connection_enable);
    if(org_apache_felix_proxy_load_balancer_connection_enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.proxy.load.balancer.connection.enable", org_apache_felix_proxy_load_balancer_connection_enable_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_https_jetty_renegotiate_allowed
    if(org_apache_felix_http_properties->org_apache_felix_https_jetty_renegotiate_allowed) {
    cJSON *org_apache_felix_https_jetty_renegotiate_allowed_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_http_properties->org_apache_felix_https_jetty_renegotiate_allowed);
    if(org_apache_felix_https_jetty_renegotiate_allowed_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.https.jetty.renegotiateAllowed", org_apache_felix_https_jetty_renegotiate_allowed_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_http_only
    if(org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_http_only) {
    cJSON *org_apache_felix_https_jetty_session_cookie_http_only_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_http_only);
    if(org_apache_felix_https_jetty_session_cookie_http_only_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.https.jetty.session.cookie.httpOnly", org_apache_felix_https_jetty_session_cookie_http_only_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_secure
    if(org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_secure) {
    cJSON *org_apache_felix_https_jetty_session_cookie_secure_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_secure);
    if(org_apache_felix_https_jetty_session_cookie_secure_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.https.jetty.session.cookie.secure", org_apache_felix_https_jetty_session_cookie_secure_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_id_path_parameter_name
    if(org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_id_path_parameter_name) {
    cJSON *org_eclipse_jetty_servlet_session_id_path_parameter_name_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_id_path_parameter_name);
    if(org_eclipse_jetty_servlet_session_id_path_parameter_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.eclipse.jetty.servlet.SessionIdPathParameterName", org_eclipse_jetty_servlet_session_id_path_parameter_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_eclipse_jetty_servlet_checking_remote_session_id_encoding
    if(org_apache_felix_http_properties->org_eclipse_jetty_servlet_checking_remote_session_id_encoding) {
    cJSON *org_eclipse_jetty_servlet_checking_remote_session_id_encoding_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_http_properties->org_eclipse_jetty_servlet_checking_remote_session_id_encoding);
    if(org_eclipse_jetty_servlet_checking_remote_session_id_encoding_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding", org_eclipse_jetty_servlet_checking_remote_session_id_encoding_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_cookie
    if(org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_cookie) {
    cJSON *org_eclipse_jetty_servlet_session_cookie_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_cookie);
    if(org_eclipse_jetty_servlet_session_cookie_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.eclipse.jetty.servlet.SessionCookie", org_eclipse_jetty_servlet_session_cookie_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_domain
    if(org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_domain) {
    cJSON *org_eclipse_jetty_servlet_session_domain_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_domain);
    if(org_eclipse_jetty_servlet_session_domain_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.eclipse.jetty.servlet.SessionDomain", org_eclipse_jetty_servlet_session_domain_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_path
    if(org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_path) {
    cJSON *org_eclipse_jetty_servlet_session_path_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_path);
    if(org_eclipse_jetty_servlet_session_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.eclipse.jetty.servlet.SessionPath", org_eclipse_jetty_servlet_session_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_eclipse_jetty_servlet_max_age
    if(org_apache_felix_http_properties->org_eclipse_jetty_servlet_max_age) {
    cJSON *org_eclipse_jetty_servlet_max_age_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_http_properties->org_eclipse_jetty_servlet_max_age);
    if(org_eclipse_jetty_servlet_max_age_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.eclipse.jetty.servlet.MaxAge", org_eclipse_jetty_servlet_max_age_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_name
    if(org_apache_felix_http_properties->org_apache_felix_http_name) {
    cJSON *org_apache_felix_http_name_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_name);
    if(org_apache_felix_http_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.name", org_apache_felix_http_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_jetty_gziphandler_enable
    if(org_apache_felix_http_properties->org_apache_felix_jetty_gziphandler_enable) {
    cJSON *org_apache_felix_jetty_gziphandler_enable_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_http_properties->org_apache_felix_jetty_gziphandler_enable);
    if(org_apache_felix_jetty_gziphandler_enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.jetty.gziphandler.enable", org_apache_felix_jetty_gziphandler_enable_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_min_gzip_size
    if(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_min_gzip_size) {
    cJSON *org_apache_felix_jetty_gzip_min_gzip_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_min_gzip_size);
    if(org_apache_felix_jetty_gzip_min_gzip_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.jetty.gzip.minGzipSize", org_apache_felix_jetty_gzip_min_gzip_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_compression_level
    if(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_compression_level) {
    cJSON *org_apache_felix_jetty_gzip_compression_level_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_compression_level);
    if(org_apache_felix_jetty_gzip_compression_level_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.jetty.gzip.compressionLevel", org_apache_felix_jetty_gzip_compression_level_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_inflate_buffer_size
    if(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_inflate_buffer_size) {
    cJSON *org_apache_felix_jetty_gzip_inflate_buffer_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_inflate_buffer_size);
    if(org_apache_felix_jetty_gzip_inflate_buffer_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.jetty.gzip.inflateBufferSize", org_apache_felix_jetty_gzip_inflate_buffer_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_sync_flush
    if(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_sync_flush) {
    cJSON *org_apache_felix_jetty_gzip_sync_flush_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_sync_flush);
    if(org_apache_felix_jetty_gzip_sync_flush_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.jetty.gzip.syncFlush", org_apache_felix_jetty_gzip_sync_flush_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_user_agents
    if(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_user_agents) {
    cJSON *org_apache_felix_jetty_gzip_excluded_user_agents_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_user_agents);
    if(org_apache_felix_jetty_gzip_excluded_user_agents_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.jetty.gzip.excludedUserAgents", org_apache_felix_jetty_gzip_excluded_user_agents_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_methods
    if(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_methods) {
    cJSON *org_apache_felix_jetty_gzip_included_methods_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_methods);
    if(org_apache_felix_jetty_gzip_included_methods_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.jetty.gzip.includedMethods", org_apache_felix_jetty_gzip_included_methods_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_methods
    if(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_methods) {
    cJSON *org_apache_felix_jetty_gzip_excluded_methods_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_methods);
    if(org_apache_felix_jetty_gzip_excluded_methods_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.jetty.gzip.excludedMethods", org_apache_felix_jetty_gzip_excluded_methods_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_paths
    if(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_paths) {
    cJSON *org_apache_felix_jetty_gzip_included_paths_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_paths);
    if(org_apache_felix_jetty_gzip_included_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.jetty.gzip.includedPaths", org_apache_felix_jetty_gzip_included_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_paths
    if(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_paths) {
    cJSON *org_apache_felix_jetty_gzip_excluded_paths_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_paths);
    if(org_apache_felix_jetty_gzip_excluded_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.jetty.gzip.excludedPaths", org_apache_felix_jetty_gzip_excluded_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_mime_types
    if(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_mime_types) {
    cJSON *org_apache_felix_jetty_gzip_included_mime_types_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_mime_types);
    if(org_apache_felix_jetty_gzip_included_mime_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.jetty.gzip.includedMimeTypes", org_apache_felix_jetty_gzip_included_mime_types_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_mime_types
    if(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_mime_types) {
    cJSON *org_apache_felix_jetty_gzip_excluded_mime_types_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_mime_types);
    if(org_apache_felix_jetty_gzip_excluded_mime_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.jetty.gzip.excludedMimeTypes", org_apache_felix_jetty_gzip_excluded_mime_types_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_session_invalidate
    if(org_apache_felix_http_properties->org_apache_felix_http_session_invalidate) {
    cJSON *org_apache_felix_http_session_invalidate_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_session_invalidate);
    if(org_apache_felix_http_session_invalidate_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.session.invalidate", org_apache_felix_http_session_invalidate_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_http_properties->org_apache_felix_http_session_uniqueid
    if(org_apache_felix_http_properties->org_apache_felix_http_session_uniqueid) {
    cJSON *org_apache_felix_http_session_uniqueid_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_http_properties->org_apache_felix_http_session_uniqueid);
    if(org_apache_felix_http_session_uniqueid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.http.session.uniqueid", org_apache_felix_http_session_uniqueid_local_JSON);
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

org_apache_felix_http_properties_t *org_apache_felix_http_properties_parseFromJSON(cJSON *org_apache_felix_http_propertiesJSON){

    org_apache_felix_http_properties_t *org_apache_felix_http_properties_local_var = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_host
    config_node_property_string_t *org_apache_felix_http_host_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_enable
    config_node_property_boolean_t *org_apache_felix_http_enable_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_osgi_service_http_port
    config_node_property_integer_t *org_osgi_service_http_port_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_timeout
    config_node_property_integer_t *org_apache_felix_http_timeout_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_https_enable
    config_node_property_boolean_t *org_apache_felix_https_enable_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_osgi_service_http_port_secure
    config_node_property_integer_t *org_osgi_service_http_port_secure_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_https_keystore
    config_node_property_string_t *org_apache_felix_https_keystore_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_https_keystore_password
    config_node_property_string_t *org_apache_felix_https_keystore_password_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_https_keystore_key_password
    config_node_property_string_t *org_apache_felix_https_keystore_key_password_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_https_truststore
    config_node_property_string_t *org_apache_felix_https_truststore_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_https_truststore_password
    config_node_property_string_t *org_apache_felix_https_truststore_password_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_https_clientcertificate
    config_node_property_drop_down_t *org_apache_felix_https_clientcertificate_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_context_path
    config_node_property_string_t *org_apache_felix_http_context_path_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_mbeans
    config_node_property_boolean_t *org_apache_felix_http_mbeans_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_session_timeout
    config_node_property_integer_t *org_apache_felix_http_session_timeout_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_jetty_threadpool_max
    config_node_property_integer_t *org_apache_felix_http_jetty_threadpool_max_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_jetty_acceptors
    config_node_property_integer_t *org_apache_felix_http_jetty_acceptors_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_jetty_selectors
    config_node_property_integer_t *org_apache_felix_http_jetty_selectors_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_jetty_header_buffer_size
    config_node_property_integer_t *org_apache_felix_http_jetty_header_buffer_size_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_jetty_request_buffer_size
    config_node_property_integer_t *org_apache_felix_http_jetty_request_buffer_size_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_jetty_response_buffer_size
    config_node_property_integer_t *org_apache_felix_http_jetty_response_buffer_size_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_jetty_max_form_size
    config_node_property_integer_t *org_apache_felix_http_jetty_max_form_size_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_path_exclusions
    config_node_property_array_t *org_apache_felix_http_path_exclusions_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_excluded
    config_node_property_array_t *org_apache_felix_https_jetty_ciphersuites_excluded_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_included
    config_node_property_array_t *org_apache_felix_https_jetty_ciphersuites_included_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_jetty_send_server_header
    config_node_property_boolean_t *org_apache_felix_http_jetty_send_server_header_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_included
    config_node_property_array_t *org_apache_felix_https_jetty_protocols_included_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_excluded
    config_node_property_array_t *org_apache_felix_https_jetty_protocols_excluded_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_proxy_load_balancer_connection_enable
    config_node_property_boolean_t *org_apache_felix_proxy_load_balancer_connection_enable_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_https_jetty_renegotiate_allowed
    config_node_property_boolean_t *org_apache_felix_https_jetty_renegotiate_allowed_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_http_only
    config_node_property_boolean_t *org_apache_felix_https_jetty_session_cookie_http_only_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_secure
    config_node_property_boolean_t *org_apache_felix_https_jetty_session_cookie_secure_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_id_path_parameter_name
    config_node_property_string_t *org_eclipse_jetty_servlet_session_id_path_parameter_name_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_eclipse_jetty_servlet_checking_remote_session_id_encoding
    config_node_property_boolean_t *org_eclipse_jetty_servlet_checking_remote_session_id_encoding_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_cookie
    config_node_property_string_t *org_eclipse_jetty_servlet_session_cookie_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_domain
    config_node_property_string_t *org_eclipse_jetty_servlet_session_domain_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_path
    config_node_property_string_t *org_eclipse_jetty_servlet_session_path_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_eclipse_jetty_servlet_max_age
    config_node_property_integer_t *org_eclipse_jetty_servlet_max_age_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_name
    config_node_property_string_t *org_apache_felix_http_name_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_jetty_gziphandler_enable
    config_node_property_boolean_t *org_apache_felix_jetty_gziphandler_enable_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_jetty_gzip_min_gzip_size
    config_node_property_integer_t *org_apache_felix_jetty_gzip_min_gzip_size_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_jetty_gzip_compression_level
    config_node_property_integer_t *org_apache_felix_jetty_gzip_compression_level_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_jetty_gzip_inflate_buffer_size
    config_node_property_integer_t *org_apache_felix_jetty_gzip_inflate_buffer_size_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_jetty_gzip_sync_flush
    config_node_property_boolean_t *org_apache_felix_jetty_gzip_sync_flush_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_user_agents
    config_node_property_array_t *org_apache_felix_jetty_gzip_excluded_user_agents_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_methods
    config_node_property_array_t *org_apache_felix_jetty_gzip_included_methods_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_methods
    config_node_property_array_t *org_apache_felix_jetty_gzip_excluded_methods_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_paths
    config_node_property_array_t *org_apache_felix_jetty_gzip_included_paths_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_paths
    config_node_property_array_t *org_apache_felix_jetty_gzip_excluded_paths_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_mime_types
    config_node_property_array_t *org_apache_felix_jetty_gzip_included_mime_types_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_mime_types
    config_node_property_array_t *org_apache_felix_jetty_gzip_excluded_mime_types_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_session_invalidate
    config_node_property_boolean_t *org_apache_felix_http_session_invalidate_local_nonprim = NULL;

    // define the local variable for org_apache_felix_http_properties->org_apache_felix_http_session_uniqueid
    config_node_property_boolean_t *org_apache_felix_http_session_uniqueid_local_nonprim = NULL;

    // org_apache_felix_http_properties->org_apache_felix_http_host
    cJSON *org_apache_felix_http_host = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.host");
    if (cJSON_IsNull(org_apache_felix_http_host)) {
        org_apache_felix_http_host = NULL;
    }
    if (org_apache_felix_http_host) { 
    org_apache_felix_http_host_local_nonprim = config_node_property_string_parseFromJSON(org_apache_felix_http_host); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_enable
    cJSON *org_apache_felix_http_enable = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.enable");
    if (cJSON_IsNull(org_apache_felix_http_enable)) {
        org_apache_felix_http_enable = NULL;
    }
    if (org_apache_felix_http_enable) { 
    org_apache_felix_http_enable_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_felix_http_enable); //nonprimitive
    }

    // org_apache_felix_http_properties->org_osgi_service_http_port
    cJSON *org_osgi_service_http_port = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.osgi.service.http.port");
    if (cJSON_IsNull(org_osgi_service_http_port)) {
        org_osgi_service_http_port = NULL;
    }
    if (org_osgi_service_http_port) { 
    org_osgi_service_http_port_local_nonprim = config_node_property_integer_parseFromJSON(org_osgi_service_http_port); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_timeout
    cJSON *org_apache_felix_http_timeout = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.timeout");
    if (cJSON_IsNull(org_apache_felix_http_timeout)) {
        org_apache_felix_http_timeout = NULL;
    }
    if (org_apache_felix_http_timeout) { 
    org_apache_felix_http_timeout_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_felix_http_timeout); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_https_enable
    cJSON *org_apache_felix_https_enable = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.https.enable");
    if (cJSON_IsNull(org_apache_felix_https_enable)) {
        org_apache_felix_https_enable = NULL;
    }
    if (org_apache_felix_https_enable) { 
    org_apache_felix_https_enable_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_felix_https_enable); //nonprimitive
    }

    // org_apache_felix_http_properties->org_osgi_service_http_port_secure
    cJSON *org_osgi_service_http_port_secure = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.osgi.service.http.port.secure");
    if (cJSON_IsNull(org_osgi_service_http_port_secure)) {
        org_osgi_service_http_port_secure = NULL;
    }
    if (org_osgi_service_http_port_secure) { 
    org_osgi_service_http_port_secure_local_nonprim = config_node_property_integer_parseFromJSON(org_osgi_service_http_port_secure); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_https_keystore
    cJSON *org_apache_felix_https_keystore = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.https.keystore");
    if (cJSON_IsNull(org_apache_felix_https_keystore)) {
        org_apache_felix_https_keystore = NULL;
    }
    if (org_apache_felix_https_keystore) { 
    org_apache_felix_https_keystore_local_nonprim = config_node_property_string_parseFromJSON(org_apache_felix_https_keystore); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_https_keystore_password
    cJSON *org_apache_felix_https_keystore_password = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.https.keystore.password");
    if (cJSON_IsNull(org_apache_felix_https_keystore_password)) {
        org_apache_felix_https_keystore_password = NULL;
    }
    if (org_apache_felix_https_keystore_password) { 
    org_apache_felix_https_keystore_password_local_nonprim = config_node_property_string_parseFromJSON(org_apache_felix_https_keystore_password); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_https_keystore_key_password
    cJSON *org_apache_felix_https_keystore_key_password = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.https.keystore.key.password");
    if (cJSON_IsNull(org_apache_felix_https_keystore_key_password)) {
        org_apache_felix_https_keystore_key_password = NULL;
    }
    if (org_apache_felix_https_keystore_key_password) { 
    org_apache_felix_https_keystore_key_password_local_nonprim = config_node_property_string_parseFromJSON(org_apache_felix_https_keystore_key_password); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_https_truststore
    cJSON *org_apache_felix_https_truststore = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.https.truststore");
    if (cJSON_IsNull(org_apache_felix_https_truststore)) {
        org_apache_felix_https_truststore = NULL;
    }
    if (org_apache_felix_https_truststore) { 
    org_apache_felix_https_truststore_local_nonprim = config_node_property_string_parseFromJSON(org_apache_felix_https_truststore); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_https_truststore_password
    cJSON *org_apache_felix_https_truststore_password = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.https.truststore.password");
    if (cJSON_IsNull(org_apache_felix_https_truststore_password)) {
        org_apache_felix_https_truststore_password = NULL;
    }
    if (org_apache_felix_https_truststore_password) { 
    org_apache_felix_https_truststore_password_local_nonprim = config_node_property_string_parseFromJSON(org_apache_felix_https_truststore_password); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_https_clientcertificate
    cJSON *org_apache_felix_https_clientcertificate = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.https.clientcertificate");
    if (cJSON_IsNull(org_apache_felix_https_clientcertificate)) {
        org_apache_felix_https_clientcertificate = NULL;
    }
    if (org_apache_felix_https_clientcertificate) { 
    org_apache_felix_https_clientcertificate_local_nonprim = config_node_property_drop_down_parseFromJSON(org_apache_felix_https_clientcertificate); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_context_path
    cJSON *org_apache_felix_http_context_path = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.context_path");
    if (cJSON_IsNull(org_apache_felix_http_context_path)) {
        org_apache_felix_http_context_path = NULL;
    }
    if (org_apache_felix_http_context_path) { 
    org_apache_felix_http_context_path_local_nonprim = config_node_property_string_parseFromJSON(org_apache_felix_http_context_path); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_mbeans
    cJSON *org_apache_felix_http_mbeans = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.mbeans");
    if (cJSON_IsNull(org_apache_felix_http_mbeans)) {
        org_apache_felix_http_mbeans = NULL;
    }
    if (org_apache_felix_http_mbeans) { 
    org_apache_felix_http_mbeans_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_felix_http_mbeans); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_session_timeout
    cJSON *org_apache_felix_http_session_timeout = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.session.timeout");
    if (cJSON_IsNull(org_apache_felix_http_session_timeout)) {
        org_apache_felix_http_session_timeout = NULL;
    }
    if (org_apache_felix_http_session_timeout) { 
    org_apache_felix_http_session_timeout_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_felix_http_session_timeout); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_jetty_threadpool_max
    cJSON *org_apache_felix_http_jetty_threadpool_max = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.jetty.threadpool.max");
    if (cJSON_IsNull(org_apache_felix_http_jetty_threadpool_max)) {
        org_apache_felix_http_jetty_threadpool_max = NULL;
    }
    if (org_apache_felix_http_jetty_threadpool_max) { 
    org_apache_felix_http_jetty_threadpool_max_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_felix_http_jetty_threadpool_max); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_jetty_acceptors
    cJSON *org_apache_felix_http_jetty_acceptors = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.jetty.acceptors");
    if (cJSON_IsNull(org_apache_felix_http_jetty_acceptors)) {
        org_apache_felix_http_jetty_acceptors = NULL;
    }
    if (org_apache_felix_http_jetty_acceptors) { 
    org_apache_felix_http_jetty_acceptors_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_felix_http_jetty_acceptors); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_jetty_selectors
    cJSON *org_apache_felix_http_jetty_selectors = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.jetty.selectors");
    if (cJSON_IsNull(org_apache_felix_http_jetty_selectors)) {
        org_apache_felix_http_jetty_selectors = NULL;
    }
    if (org_apache_felix_http_jetty_selectors) { 
    org_apache_felix_http_jetty_selectors_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_felix_http_jetty_selectors); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_jetty_header_buffer_size
    cJSON *org_apache_felix_http_jetty_header_buffer_size = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.jetty.headerBufferSize");
    if (cJSON_IsNull(org_apache_felix_http_jetty_header_buffer_size)) {
        org_apache_felix_http_jetty_header_buffer_size = NULL;
    }
    if (org_apache_felix_http_jetty_header_buffer_size) { 
    org_apache_felix_http_jetty_header_buffer_size_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_felix_http_jetty_header_buffer_size); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_jetty_request_buffer_size
    cJSON *org_apache_felix_http_jetty_request_buffer_size = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.jetty.requestBufferSize");
    if (cJSON_IsNull(org_apache_felix_http_jetty_request_buffer_size)) {
        org_apache_felix_http_jetty_request_buffer_size = NULL;
    }
    if (org_apache_felix_http_jetty_request_buffer_size) { 
    org_apache_felix_http_jetty_request_buffer_size_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_felix_http_jetty_request_buffer_size); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_jetty_response_buffer_size
    cJSON *org_apache_felix_http_jetty_response_buffer_size = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.jetty.responseBufferSize");
    if (cJSON_IsNull(org_apache_felix_http_jetty_response_buffer_size)) {
        org_apache_felix_http_jetty_response_buffer_size = NULL;
    }
    if (org_apache_felix_http_jetty_response_buffer_size) { 
    org_apache_felix_http_jetty_response_buffer_size_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_felix_http_jetty_response_buffer_size); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_jetty_max_form_size
    cJSON *org_apache_felix_http_jetty_max_form_size = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.jetty.maxFormSize");
    if (cJSON_IsNull(org_apache_felix_http_jetty_max_form_size)) {
        org_apache_felix_http_jetty_max_form_size = NULL;
    }
    if (org_apache_felix_http_jetty_max_form_size) { 
    org_apache_felix_http_jetty_max_form_size_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_felix_http_jetty_max_form_size); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_path_exclusions
    cJSON *org_apache_felix_http_path_exclusions = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.path_exclusions");
    if (cJSON_IsNull(org_apache_felix_http_path_exclusions)) {
        org_apache_felix_http_path_exclusions = NULL;
    }
    if (org_apache_felix_http_path_exclusions) { 
    org_apache_felix_http_path_exclusions_local_nonprim = config_node_property_array_parseFromJSON(org_apache_felix_http_path_exclusions); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_excluded
    cJSON *org_apache_felix_https_jetty_ciphersuites_excluded = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.https.jetty.ciphersuites.excluded");
    if (cJSON_IsNull(org_apache_felix_https_jetty_ciphersuites_excluded)) {
        org_apache_felix_https_jetty_ciphersuites_excluded = NULL;
    }
    if (org_apache_felix_https_jetty_ciphersuites_excluded) { 
    org_apache_felix_https_jetty_ciphersuites_excluded_local_nonprim = config_node_property_array_parseFromJSON(org_apache_felix_https_jetty_ciphersuites_excluded); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_https_jetty_ciphersuites_included
    cJSON *org_apache_felix_https_jetty_ciphersuites_included = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.https.jetty.ciphersuites.included");
    if (cJSON_IsNull(org_apache_felix_https_jetty_ciphersuites_included)) {
        org_apache_felix_https_jetty_ciphersuites_included = NULL;
    }
    if (org_apache_felix_https_jetty_ciphersuites_included) { 
    org_apache_felix_https_jetty_ciphersuites_included_local_nonprim = config_node_property_array_parseFromJSON(org_apache_felix_https_jetty_ciphersuites_included); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_jetty_send_server_header
    cJSON *org_apache_felix_http_jetty_send_server_header = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.jetty.sendServerHeader");
    if (cJSON_IsNull(org_apache_felix_http_jetty_send_server_header)) {
        org_apache_felix_http_jetty_send_server_header = NULL;
    }
    if (org_apache_felix_http_jetty_send_server_header) { 
    org_apache_felix_http_jetty_send_server_header_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_felix_http_jetty_send_server_header); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_included
    cJSON *org_apache_felix_https_jetty_protocols_included = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.https.jetty.protocols.included");
    if (cJSON_IsNull(org_apache_felix_https_jetty_protocols_included)) {
        org_apache_felix_https_jetty_protocols_included = NULL;
    }
    if (org_apache_felix_https_jetty_protocols_included) { 
    org_apache_felix_https_jetty_protocols_included_local_nonprim = config_node_property_array_parseFromJSON(org_apache_felix_https_jetty_protocols_included); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_https_jetty_protocols_excluded
    cJSON *org_apache_felix_https_jetty_protocols_excluded = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.https.jetty.protocols.excluded");
    if (cJSON_IsNull(org_apache_felix_https_jetty_protocols_excluded)) {
        org_apache_felix_https_jetty_protocols_excluded = NULL;
    }
    if (org_apache_felix_https_jetty_protocols_excluded) { 
    org_apache_felix_https_jetty_protocols_excluded_local_nonprim = config_node_property_array_parseFromJSON(org_apache_felix_https_jetty_protocols_excluded); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_proxy_load_balancer_connection_enable
    cJSON *org_apache_felix_proxy_load_balancer_connection_enable = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.proxy.load.balancer.connection.enable");
    if (cJSON_IsNull(org_apache_felix_proxy_load_balancer_connection_enable)) {
        org_apache_felix_proxy_load_balancer_connection_enable = NULL;
    }
    if (org_apache_felix_proxy_load_balancer_connection_enable) { 
    org_apache_felix_proxy_load_balancer_connection_enable_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_felix_proxy_load_balancer_connection_enable); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_https_jetty_renegotiate_allowed
    cJSON *org_apache_felix_https_jetty_renegotiate_allowed = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.https.jetty.renegotiateAllowed");
    if (cJSON_IsNull(org_apache_felix_https_jetty_renegotiate_allowed)) {
        org_apache_felix_https_jetty_renegotiate_allowed = NULL;
    }
    if (org_apache_felix_https_jetty_renegotiate_allowed) { 
    org_apache_felix_https_jetty_renegotiate_allowed_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_felix_https_jetty_renegotiate_allowed); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_http_only
    cJSON *org_apache_felix_https_jetty_session_cookie_http_only = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.https.jetty.session.cookie.httpOnly");
    if (cJSON_IsNull(org_apache_felix_https_jetty_session_cookie_http_only)) {
        org_apache_felix_https_jetty_session_cookie_http_only = NULL;
    }
    if (org_apache_felix_https_jetty_session_cookie_http_only) { 
    org_apache_felix_https_jetty_session_cookie_http_only_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_felix_https_jetty_session_cookie_http_only); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_https_jetty_session_cookie_secure
    cJSON *org_apache_felix_https_jetty_session_cookie_secure = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.https.jetty.session.cookie.secure");
    if (cJSON_IsNull(org_apache_felix_https_jetty_session_cookie_secure)) {
        org_apache_felix_https_jetty_session_cookie_secure = NULL;
    }
    if (org_apache_felix_https_jetty_session_cookie_secure) { 
    org_apache_felix_https_jetty_session_cookie_secure_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_felix_https_jetty_session_cookie_secure); //nonprimitive
    }

    // org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_id_path_parameter_name
    cJSON *org_eclipse_jetty_servlet_session_id_path_parameter_name = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.eclipse.jetty.servlet.SessionIdPathParameterName");
    if (cJSON_IsNull(org_eclipse_jetty_servlet_session_id_path_parameter_name)) {
        org_eclipse_jetty_servlet_session_id_path_parameter_name = NULL;
    }
    if (org_eclipse_jetty_servlet_session_id_path_parameter_name) { 
    org_eclipse_jetty_servlet_session_id_path_parameter_name_local_nonprim = config_node_property_string_parseFromJSON(org_eclipse_jetty_servlet_session_id_path_parameter_name); //nonprimitive
    }

    // org_apache_felix_http_properties->org_eclipse_jetty_servlet_checking_remote_session_id_encoding
    cJSON *org_eclipse_jetty_servlet_checking_remote_session_id_encoding = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding");
    if (cJSON_IsNull(org_eclipse_jetty_servlet_checking_remote_session_id_encoding)) {
        org_eclipse_jetty_servlet_checking_remote_session_id_encoding = NULL;
    }
    if (org_eclipse_jetty_servlet_checking_remote_session_id_encoding) { 
    org_eclipse_jetty_servlet_checking_remote_session_id_encoding_local_nonprim = config_node_property_boolean_parseFromJSON(org_eclipse_jetty_servlet_checking_remote_session_id_encoding); //nonprimitive
    }

    // org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_cookie
    cJSON *org_eclipse_jetty_servlet_session_cookie = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.eclipse.jetty.servlet.SessionCookie");
    if (cJSON_IsNull(org_eclipse_jetty_servlet_session_cookie)) {
        org_eclipse_jetty_servlet_session_cookie = NULL;
    }
    if (org_eclipse_jetty_servlet_session_cookie) { 
    org_eclipse_jetty_servlet_session_cookie_local_nonprim = config_node_property_string_parseFromJSON(org_eclipse_jetty_servlet_session_cookie); //nonprimitive
    }

    // org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_domain
    cJSON *org_eclipse_jetty_servlet_session_domain = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.eclipse.jetty.servlet.SessionDomain");
    if (cJSON_IsNull(org_eclipse_jetty_servlet_session_domain)) {
        org_eclipse_jetty_servlet_session_domain = NULL;
    }
    if (org_eclipse_jetty_servlet_session_domain) { 
    org_eclipse_jetty_servlet_session_domain_local_nonprim = config_node_property_string_parseFromJSON(org_eclipse_jetty_servlet_session_domain); //nonprimitive
    }

    // org_apache_felix_http_properties->org_eclipse_jetty_servlet_session_path
    cJSON *org_eclipse_jetty_servlet_session_path = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.eclipse.jetty.servlet.SessionPath");
    if (cJSON_IsNull(org_eclipse_jetty_servlet_session_path)) {
        org_eclipse_jetty_servlet_session_path = NULL;
    }
    if (org_eclipse_jetty_servlet_session_path) { 
    org_eclipse_jetty_servlet_session_path_local_nonprim = config_node_property_string_parseFromJSON(org_eclipse_jetty_servlet_session_path); //nonprimitive
    }

    // org_apache_felix_http_properties->org_eclipse_jetty_servlet_max_age
    cJSON *org_eclipse_jetty_servlet_max_age = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.eclipse.jetty.servlet.MaxAge");
    if (cJSON_IsNull(org_eclipse_jetty_servlet_max_age)) {
        org_eclipse_jetty_servlet_max_age = NULL;
    }
    if (org_eclipse_jetty_servlet_max_age) { 
    org_eclipse_jetty_servlet_max_age_local_nonprim = config_node_property_integer_parseFromJSON(org_eclipse_jetty_servlet_max_age); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_name
    cJSON *org_apache_felix_http_name = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.name");
    if (cJSON_IsNull(org_apache_felix_http_name)) {
        org_apache_felix_http_name = NULL;
    }
    if (org_apache_felix_http_name) { 
    org_apache_felix_http_name_local_nonprim = config_node_property_string_parseFromJSON(org_apache_felix_http_name); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_jetty_gziphandler_enable
    cJSON *org_apache_felix_jetty_gziphandler_enable = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.jetty.gziphandler.enable");
    if (cJSON_IsNull(org_apache_felix_jetty_gziphandler_enable)) {
        org_apache_felix_jetty_gziphandler_enable = NULL;
    }
    if (org_apache_felix_jetty_gziphandler_enable) { 
    org_apache_felix_jetty_gziphandler_enable_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_felix_jetty_gziphandler_enable); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_min_gzip_size
    cJSON *org_apache_felix_jetty_gzip_min_gzip_size = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.jetty.gzip.minGzipSize");
    if (cJSON_IsNull(org_apache_felix_jetty_gzip_min_gzip_size)) {
        org_apache_felix_jetty_gzip_min_gzip_size = NULL;
    }
    if (org_apache_felix_jetty_gzip_min_gzip_size) { 
    org_apache_felix_jetty_gzip_min_gzip_size_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_felix_jetty_gzip_min_gzip_size); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_compression_level
    cJSON *org_apache_felix_jetty_gzip_compression_level = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.jetty.gzip.compressionLevel");
    if (cJSON_IsNull(org_apache_felix_jetty_gzip_compression_level)) {
        org_apache_felix_jetty_gzip_compression_level = NULL;
    }
    if (org_apache_felix_jetty_gzip_compression_level) { 
    org_apache_felix_jetty_gzip_compression_level_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_felix_jetty_gzip_compression_level); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_inflate_buffer_size
    cJSON *org_apache_felix_jetty_gzip_inflate_buffer_size = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.jetty.gzip.inflateBufferSize");
    if (cJSON_IsNull(org_apache_felix_jetty_gzip_inflate_buffer_size)) {
        org_apache_felix_jetty_gzip_inflate_buffer_size = NULL;
    }
    if (org_apache_felix_jetty_gzip_inflate_buffer_size) { 
    org_apache_felix_jetty_gzip_inflate_buffer_size_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_felix_jetty_gzip_inflate_buffer_size); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_sync_flush
    cJSON *org_apache_felix_jetty_gzip_sync_flush = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.jetty.gzip.syncFlush");
    if (cJSON_IsNull(org_apache_felix_jetty_gzip_sync_flush)) {
        org_apache_felix_jetty_gzip_sync_flush = NULL;
    }
    if (org_apache_felix_jetty_gzip_sync_flush) { 
    org_apache_felix_jetty_gzip_sync_flush_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_felix_jetty_gzip_sync_flush); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_user_agents
    cJSON *org_apache_felix_jetty_gzip_excluded_user_agents = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.jetty.gzip.excludedUserAgents");
    if (cJSON_IsNull(org_apache_felix_jetty_gzip_excluded_user_agents)) {
        org_apache_felix_jetty_gzip_excluded_user_agents = NULL;
    }
    if (org_apache_felix_jetty_gzip_excluded_user_agents) { 
    org_apache_felix_jetty_gzip_excluded_user_agents_local_nonprim = config_node_property_array_parseFromJSON(org_apache_felix_jetty_gzip_excluded_user_agents); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_methods
    cJSON *org_apache_felix_jetty_gzip_included_methods = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.jetty.gzip.includedMethods");
    if (cJSON_IsNull(org_apache_felix_jetty_gzip_included_methods)) {
        org_apache_felix_jetty_gzip_included_methods = NULL;
    }
    if (org_apache_felix_jetty_gzip_included_methods) { 
    org_apache_felix_jetty_gzip_included_methods_local_nonprim = config_node_property_array_parseFromJSON(org_apache_felix_jetty_gzip_included_methods); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_methods
    cJSON *org_apache_felix_jetty_gzip_excluded_methods = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.jetty.gzip.excludedMethods");
    if (cJSON_IsNull(org_apache_felix_jetty_gzip_excluded_methods)) {
        org_apache_felix_jetty_gzip_excluded_methods = NULL;
    }
    if (org_apache_felix_jetty_gzip_excluded_methods) { 
    org_apache_felix_jetty_gzip_excluded_methods_local_nonprim = config_node_property_array_parseFromJSON(org_apache_felix_jetty_gzip_excluded_methods); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_paths
    cJSON *org_apache_felix_jetty_gzip_included_paths = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.jetty.gzip.includedPaths");
    if (cJSON_IsNull(org_apache_felix_jetty_gzip_included_paths)) {
        org_apache_felix_jetty_gzip_included_paths = NULL;
    }
    if (org_apache_felix_jetty_gzip_included_paths) { 
    org_apache_felix_jetty_gzip_included_paths_local_nonprim = config_node_property_array_parseFromJSON(org_apache_felix_jetty_gzip_included_paths); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_paths
    cJSON *org_apache_felix_jetty_gzip_excluded_paths = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.jetty.gzip.excludedPaths");
    if (cJSON_IsNull(org_apache_felix_jetty_gzip_excluded_paths)) {
        org_apache_felix_jetty_gzip_excluded_paths = NULL;
    }
    if (org_apache_felix_jetty_gzip_excluded_paths) { 
    org_apache_felix_jetty_gzip_excluded_paths_local_nonprim = config_node_property_array_parseFromJSON(org_apache_felix_jetty_gzip_excluded_paths); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_included_mime_types
    cJSON *org_apache_felix_jetty_gzip_included_mime_types = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.jetty.gzip.includedMimeTypes");
    if (cJSON_IsNull(org_apache_felix_jetty_gzip_included_mime_types)) {
        org_apache_felix_jetty_gzip_included_mime_types = NULL;
    }
    if (org_apache_felix_jetty_gzip_included_mime_types) { 
    org_apache_felix_jetty_gzip_included_mime_types_local_nonprim = config_node_property_array_parseFromJSON(org_apache_felix_jetty_gzip_included_mime_types); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_jetty_gzip_excluded_mime_types
    cJSON *org_apache_felix_jetty_gzip_excluded_mime_types = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.jetty.gzip.excludedMimeTypes");
    if (cJSON_IsNull(org_apache_felix_jetty_gzip_excluded_mime_types)) {
        org_apache_felix_jetty_gzip_excluded_mime_types = NULL;
    }
    if (org_apache_felix_jetty_gzip_excluded_mime_types) { 
    org_apache_felix_jetty_gzip_excluded_mime_types_local_nonprim = config_node_property_array_parseFromJSON(org_apache_felix_jetty_gzip_excluded_mime_types); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_session_invalidate
    cJSON *org_apache_felix_http_session_invalidate = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.session.invalidate");
    if (cJSON_IsNull(org_apache_felix_http_session_invalidate)) {
        org_apache_felix_http_session_invalidate = NULL;
    }
    if (org_apache_felix_http_session_invalidate) { 
    org_apache_felix_http_session_invalidate_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_felix_http_session_invalidate); //nonprimitive
    }

    // org_apache_felix_http_properties->org_apache_felix_http_session_uniqueid
    cJSON *org_apache_felix_http_session_uniqueid = cJSON_GetObjectItemCaseSensitive(org_apache_felix_http_propertiesJSON, "org.apache.felix.http.session.uniqueid");
    if (cJSON_IsNull(org_apache_felix_http_session_uniqueid)) {
        org_apache_felix_http_session_uniqueid = NULL;
    }
    if (org_apache_felix_http_session_uniqueid) { 
    org_apache_felix_http_session_uniqueid_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_felix_http_session_uniqueid); //nonprimitive
    }



    org_apache_felix_http_properties_local_var = org_apache_felix_http_properties_create_internal (
        org_apache_felix_http_host ? org_apache_felix_http_host_local_nonprim : NULL,
        org_apache_felix_http_enable ? org_apache_felix_http_enable_local_nonprim : NULL,
        org_osgi_service_http_port ? org_osgi_service_http_port_local_nonprim : NULL,
        org_apache_felix_http_timeout ? org_apache_felix_http_timeout_local_nonprim : NULL,
        org_apache_felix_https_enable ? org_apache_felix_https_enable_local_nonprim : NULL,
        org_osgi_service_http_port_secure ? org_osgi_service_http_port_secure_local_nonprim : NULL,
        org_apache_felix_https_keystore ? org_apache_felix_https_keystore_local_nonprim : NULL,
        org_apache_felix_https_keystore_password ? org_apache_felix_https_keystore_password_local_nonprim : NULL,
        org_apache_felix_https_keystore_key_password ? org_apache_felix_https_keystore_key_password_local_nonprim : NULL,
        org_apache_felix_https_truststore ? org_apache_felix_https_truststore_local_nonprim : NULL,
        org_apache_felix_https_truststore_password ? org_apache_felix_https_truststore_password_local_nonprim : NULL,
        org_apache_felix_https_clientcertificate ? org_apache_felix_https_clientcertificate_local_nonprim : NULL,
        org_apache_felix_http_context_path ? org_apache_felix_http_context_path_local_nonprim : NULL,
        org_apache_felix_http_mbeans ? org_apache_felix_http_mbeans_local_nonprim : NULL,
        org_apache_felix_http_session_timeout ? org_apache_felix_http_session_timeout_local_nonprim : NULL,
        org_apache_felix_http_jetty_threadpool_max ? org_apache_felix_http_jetty_threadpool_max_local_nonprim : NULL,
        org_apache_felix_http_jetty_acceptors ? org_apache_felix_http_jetty_acceptors_local_nonprim : NULL,
        org_apache_felix_http_jetty_selectors ? org_apache_felix_http_jetty_selectors_local_nonprim : NULL,
        org_apache_felix_http_jetty_header_buffer_size ? org_apache_felix_http_jetty_header_buffer_size_local_nonprim : NULL,
        org_apache_felix_http_jetty_request_buffer_size ? org_apache_felix_http_jetty_request_buffer_size_local_nonprim : NULL,
        org_apache_felix_http_jetty_response_buffer_size ? org_apache_felix_http_jetty_response_buffer_size_local_nonprim : NULL,
        org_apache_felix_http_jetty_max_form_size ? org_apache_felix_http_jetty_max_form_size_local_nonprim : NULL,
        org_apache_felix_http_path_exclusions ? org_apache_felix_http_path_exclusions_local_nonprim : NULL,
        org_apache_felix_https_jetty_ciphersuites_excluded ? org_apache_felix_https_jetty_ciphersuites_excluded_local_nonprim : NULL,
        org_apache_felix_https_jetty_ciphersuites_included ? org_apache_felix_https_jetty_ciphersuites_included_local_nonprim : NULL,
        org_apache_felix_http_jetty_send_server_header ? org_apache_felix_http_jetty_send_server_header_local_nonprim : NULL,
        org_apache_felix_https_jetty_protocols_included ? org_apache_felix_https_jetty_protocols_included_local_nonprim : NULL,
        org_apache_felix_https_jetty_protocols_excluded ? org_apache_felix_https_jetty_protocols_excluded_local_nonprim : NULL,
        org_apache_felix_proxy_load_balancer_connection_enable ? org_apache_felix_proxy_load_balancer_connection_enable_local_nonprim : NULL,
        org_apache_felix_https_jetty_renegotiate_allowed ? org_apache_felix_https_jetty_renegotiate_allowed_local_nonprim : NULL,
        org_apache_felix_https_jetty_session_cookie_http_only ? org_apache_felix_https_jetty_session_cookie_http_only_local_nonprim : NULL,
        org_apache_felix_https_jetty_session_cookie_secure ? org_apache_felix_https_jetty_session_cookie_secure_local_nonprim : NULL,
        org_eclipse_jetty_servlet_session_id_path_parameter_name ? org_eclipse_jetty_servlet_session_id_path_parameter_name_local_nonprim : NULL,
        org_eclipse_jetty_servlet_checking_remote_session_id_encoding ? org_eclipse_jetty_servlet_checking_remote_session_id_encoding_local_nonprim : NULL,
        org_eclipse_jetty_servlet_session_cookie ? org_eclipse_jetty_servlet_session_cookie_local_nonprim : NULL,
        org_eclipse_jetty_servlet_session_domain ? org_eclipse_jetty_servlet_session_domain_local_nonprim : NULL,
        org_eclipse_jetty_servlet_session_path ? org_eclipse_jetty_servlet_session_path_local_nonprim : NULL,
        org_eclipse_jetty_servlet_max_age ? org_eclipse_jetty_servlet_max_age_local_nonprim : NULL,
        org_apache_felix_http_name ? org_apache_felix_http_name_local_nonprim : NULL,
        org_apache_felix_jetty_gziphandler_enable ? org_apache_felix_jetty_gziphandler_enable_local_nonprim : NULL,
        org_apache_felix_jetty_gzip_min_gzip_size ? org_apache_felix_jetty_gzip_min_gzip_size_local_nonprim : NULL,
        org_apache_felix_jetty_gzip_compression_level ? org_apache_felix_jetty_gzip_compression_level_local_nonprim : NULL,
        org_apache_felix_jetty_gzip_inflate_buffer_size ? org_apache_felix_jetty_gzip_inflate_buffer_size_local_nonprim : NULL,
        org_apache_felix_jetty_gzip_sync_flush ? org_apache_felix_jetty_gzip_sync_flush_local_nonprim : NULL,
        org_apache_felix_jetty_gzip_excluded_user_agents ? org_apache_felix_jetty_gzip_excluded_user_agents_local_nonprim : NULL,
        org_apache_felix_jetty_gzip_included_methods ? org_apache_felix_jetty_gzip_included_methods_local_nonprim : NULL,
        org_apache_felix_jetty_gzip_excluded_methods ? org_apache_felix_jetty_gzip_excluded_methods_local_nonprim : NULL,
        org_apache_felix_jetty_gzip_included_paths ? org_apache_felix_jetty_gzip_included_paths_local_nonprim : NULL,
        org_apache_felix_jetty_gzip_excluded_paths ? org_apache_felix_jetty_gzip_excluded_paths_local_nonprim : NULL,
        org_apache_felix_jetty_gzip_included_mime_types ? org_apache_felix_jetty_gzip_included_mime_types_local_nonprim : NULL,
        org_apache_felix_jetty_gzip_excluded_mime_types ? org_apache_felix_jetty_gzip_excluded_mime_types_local_nonprim : NULL,
        org_apache_felix_http_session_invalidate ? org_apache_felix_http_session_invalidate_local_nonprim : NULL,
        org_apache_felix_http_session_uniqueid ? org_apache_felix_http_session_uniqueid_local_nonprim : NULL
        );

    if (!org_apache_felix_http_properties_local_var) {
        goto end;
    }

    return org_apache_felix_http_properties_local_var;
end:
    if (org_apache_felix_http_host_local_nonprim) {
        config_node_property_string_free(org_apache_felix_http_host_local_nonprim);
        org_apache_felix_http_host_local_nonprim = NULL;
    }
    if (org_apache_felix_http_enable_local_nonprim) {
        config_node_property_boolean_free(org_apache_felix_http_enable_local_nonprim);
        org_apache_felix_http_enable_local_nonprim = NULL;
    }
    if (org_osgi_service_http_port_local_nonprim) {
        config_node_property_integer_free(org_osgi_service_http_port_local_nonprim);
        org_osgi_service_http_port_local_nonprim = NULL;
    }
    if (org_apache_felix_http_timeout_local_nonprim) {
        config_node_property_integer_free(org_apache_felix_http_timeout_local_nonprim);
        org_apache_felix_http_timeout_local_nonprim = NULL;
    }
    if (org_apache_felix_https_enable_local_nonprim) {
        config_node_property_boolean_free(org_apache_felix_https_enable_local_nonprim);
        org_apache_felix_https_enable_local_nonprim = NULL;
    }
    if (org_osgi_service_http_port_secure_local_nonprim) {
        config_node_property_integer_free(org_osgi_service_http_port_secure_local_nonprim);
        org_osgi_service_http_port_secure_local_nonprim = NULL;
    }
    if (org_apache_felix_https_keystore_local_nonprim) {
        config_node_property_string_free(org_apache_felix_https_keystore_local_nonprim);
        org_apache_felix_https_keystore_local_nonprim = NULL;
    }
    if (org_apache_felix_https_keystore_password_local_nonprim) {
        config_node_property_string_free(org_apache_felix_https_keystore_password_local_nonprim);
        org_apache_felix_https_keystore_password_local_nonprim = NULL;
    }
    if (org_apache_felix_https_keystore_key_password_local_nonprim) {
        config_node_property_string_free(org_apache_felix_https_keystore_key_password_local_nonprim);
        org_apache_felix_https_keystore_key_password_local_nonprim = NULL;
    }
    if (org_apache_felix_https_truststore_local_nonprim) {
        config_node_property_string_free(org_apache_felix_https_truststore_local_nonprim);
        org_apache_felix_https_truststore_local_nonprim = NULL;
    }
    if (org_apache_felix_https_truststore_password_local_nonprim) {
        config_node_property_string_free(org_apache_felix_https_truststore_password_local_nonprim);
        org_apache_felix_https_truststore_password_local_nonprim = NULL;
    }
    if (org_apache_felix_https_clientcertificate_local_nonprim) {
        config_node_property_drop_down_free(org_apache_felix_https_clientcertificate_local_nonprim);
        org_apache_felix_https_clientcertificate_local_nonprim = NULL;
    }
    if (org_apache_felix_http_context_path_local_nonprim) {
        config_node_property_string_free(org_apache_felix_http_context_path_local_nonprim);
        org_apache_felix_http_context_path_local_nonprim = NULL;
    }
    if (org_apache_felix_http_mbeans_local_nonprim) {
        config_node_property_boolean_free(org_apache_felix_http_mbeans_local_nonprim);
        org_apache_felix_http_mbeans_local_nonprim = NULL;
    }
    if (org_apache_felix_http_session_timeout_local_nonprim) {
        config_node_property_integer_free(org_apache_felix_http_session_timeout_local_nonprim);
        org_apache_felix_http_session_timeout_local_nonprim = NULL;
    }
    if (org_apache_felix_http_jetty_threadpool_max_local_nonprim) {
        config_node_property_integer_free(org_apache_felix_http_jetty_threadpool_max_local_nonprim);
        org_apache_felix_http_jetty_threadpool_max_local_nonprim = NULL;
    }
    if (org_apache_felix_http_jetty_acceptors_local_nonprim) {
        config_node_property_integer_free(org_apache_felix_http_jetty_acceptors_local_nonprim);
        org_apache_felix_http_jetty_acceptors_local_nonprim = NULL;
    }
    if (org_apache_felix_http_jetty_selectors_local_nonprim) {
        config_node_property_integer_free(org_apache_felix_http_jetty_selectors_local_nonprim);
        org_apache_felix_http_jetty_selectors_local_nonprim = NULL;
    }
    if (org_apache_felix_http_jetty_header_buffer_size_local_nonprim) {
        config_node_property_integer_free(org_apache_felix_http_jetty_header_buffer_size_local_nonprim);
        org_apache_felix_http_jetty_header_buffer_size_local_nonprim = NULL;
    }
    if (org_apache_felix_http_jetty_request_buffer_size_local_nonprim) {
        config_node_property_integer_free(org_apache_felix_http_jetty_request_buffer_size_local_nonprim);
        org_apache_felix_http_jetty_request_buffer_size_local_nonprim = NULL;
    }
    if (org_apache_felix_http_jetty_response_buffer_size_local_nonprim) {
        config_node_property_integer_free(org_apache_felix_http_jetty_response_buffer_size_local_nonprim);
        org_apache_felix_http_jetty_response_buffer_size_local_nonprim = NULL;
    }
    if (org_apache_felix_http_jetty_max_form_size_local_nonprim) {
        config_node_property_integer_free(org_apache_felix_http_jetty_max_form_size_local_nonprim);
        org_apache_felix_http_jetty_max_form_size_local_nonprim = NULL;
    }
    if (org_apache_felix_http_path_exclusions_local_nonprim) {
        config_node_property_array_free(org_apache_felix_http_path_exclusions_local_nonprim);
        org_apache_felix_http_path_exclusions_local_nonprim = NULL;
    }
    if (org_apache_felix_https_jetty_ciphersuites_excluded_local_nonprim) {
        config_node_property_array_free(org_apache_felix_https_jetty_ciphersuites_excluded_local_nonprim);
        org_apache_felix_https_jetty_ciphersuites_excluded_local_nonprim = NULL;
    }
    if (org_apache_felix_https_jetty_ciphersuites_included_local_nonprim) {
        config_node_property_array_free(org_apache_felix_https_jetty_ciphersuites_included_local_nonprim);
        org_apache_felix_https_jetty_ciphersuites_included_local_nonprim = NULL;
    }
    if (org_apache_felix_http_jetty_send_server_header_local_nonprim) {
        config_node_property_boolean_free(org_apache_felix_http_jetty_send_server_header_local_nonprim);
        org_apache_felix_http_jetty_send_server_header_local_nonprim = NULL;
    }
    if (org_apache_felix_https_jetty_protocols_included_local_nonprim) {
        config_node_property_array_free(org_apache_felix_https_jetty_protocols_included_local_nonprim);
        org_apache_felix_https_jetty_protocols_included_local_nonprim = NULL;
    }
    if (org_apache_felix_https_jetty_protocols_excluded_local_nonprim) {
        config_node_property_array_free(org_apache_felix_https_jetty_protocols_excluded_local_nonprim);
        org_apache_felix_https_jetty_protocols_excluded_local_nonprim = NULL;
    }
    if (org_apache_felix_proxy_load_balancer_connection_enable_local_nonprim) {
        config_node_property_boolean_free(org_apache_felix_proxy_load_balancer_connection_enable_local_nonprim);
        org_apache_felix_proxy_load_balancer_connection_enable_local_nonprim = NULL;
    }
    if (org_apache_felix_https_jetty_renegotiate_allowed_local_nonprim) {
        config_node_property_boolean_free(org_apache_felix_https_jetty_renegotiate_allowed_local_nonprim);
        org_apache_felix_https_jetty_renegotiate_allowed_local_nonprim = NULL;
    }
    if (org_apache_felix_https_jetty_session_cookie_http_only_local_nonprim) {
        config_node_property_boolean_free(org_apache_felix_https_jetty_session_cookie_http_only_local_nonprim);
        org_apache_felix_https_jetty_session_cookie_http_only_local_nonprim = NULL;
    }
    if (org_apache_felix_https_jetty_session_cookie_secure_local_nonprim) {
        config_node_property_boolean_free(org_apache_felix_https_jetty_session_cookie_secure_local_nonprim);
        org_apache_felix_https_jetty_session_cookie_secure_local_nonprim = NULL;
    }
    if (org_eclipse_jetty_servlet_session_id_path_parameter_name_local_nonprim) {
        config_node_property_string_free(org_eclipse_jetty_servlet_session_id_path_parameter_name_local_nonprim);
        org_eclipse_jetty_servlet_session_id_path_parameter_name_local_nonprim = NULL;
    }
    if (org_eclipse_jetty_servlet_checking_remote_session_id_encoding_local_nonprim) {
        config_node_property_boolean_free(org_eclipse_jetty_servlet_checking_remote_session_id_encoding_local_nonprim);
        org_eclipse_jetty_servlet_checking_remote_session_id_encoding_local_nonprim = NULL;
    }
    if (org_eclipse_jetty_servlet_session_cookie_local_nonprim) {
        config_node_property_string_free(org_eclipse_jetty_servlet_session_cookie_local_nonprim);
        org_eclipse_jetty_servlet_session_cookie_local_nonprim = NULL;
    }
    if (org_eclipse_jetty_servlet_session_domain_local_nonprim) {
        config_node_property_string_free(org_eclipse_jetty_servlet_session_domain_local_nonprim);
        org_eclipse_jetty_servlet_session_domain_local_nonprim = NULL;
    }
    if (org_eclipse_jetty_servlet_session_path_local_nonprim) {
        config_node_property_string_free(org_eclipse_jetty_servlet_session_path_local_nonprim);
        org_eclipse_jetty_servlet_session_path_local_nonprim = NULL;
    }
    if (org_eclipse_jetty_servlet_max_age_local_nonprim) {
        config_node_property_integer_free(org_eclipse_jetty_servlet_max_age_local_nonprim);
        org_eclipse_jetty_servlet_max_age_local_nonprim = NULL;
    }
    if (org_apache_felix_http_name_local_nonprim) {
        config_node_property_string_free(org_apache_felix_http_name_local_nonprim);
        org_apache_felix_http_name_local_nonprim = NULL;
    }
    if (org_apache_felix_jetty_gziphandler_enable_local_nonprim) {
        config_node_property_boolean_free(org_apache_felix_jetty_gziphandler_enable_local_nonprim);
        org_apache_felix_jetty_gziphandler_enable_local_nonprim = NULL;
    }
    if (org_apache_felix_jetty_gzip_min_gzip_size_local_nonprim) {
        config_node_property_integer_free(org_apache_felix_jetty_gzip_min_gzip_size_local_nonprim);
        org_apache_felix_jetty_gzip_min_gzip_size_local_nonprim = NULL;
    }
    if (org_apache_felix_jetty_gzip_compression_level_local_nonprim) {
        config_node_property_integer_free(org_apache_felix_jetty_gzip_compression_level_local_nonprim);
        org_apache_felix_jetty_gzip_compression_level_local_nonprim = NULL;
    }
    if (org_apache_felix_jetty_gzip_inflate_buffer_size_local_nonprim) {
        config_node_property_integer_free(org_apache_felix_jetty_gzip_inflate_buffer_size_local_nonprim);
        org_apache_felix_jetty_gzip_inflate_buffer_size_local_nonprim = NULL;
    }
    if (org_apache_felix_jetty_gzip_sync_flush_local_nonprim) {
        config_node_property_boolean_free(org_apache_felix_jetty_gzip_sync_flush_local_nonprim);
        org_apache_felix_jetty_gzip_sync_flush_local_nonprim = NULL;
    }
    if (org_apache_felix_jetty_gzip_excluded_user_agents_local_nonprim) {
        config_node_property_array_free(org_apache_felix_jetty_gzip_excluded_user_agents_local_nonprim);
        org_apache_felix_jetty_gzip_excluded_user_agents_local_nonprim = NULL;
    }
    if (org_apache_felix_jetty_gzip_included_methods_local_nonprim) {
        config_node_property_array_free(org_apache_felix_jetty_gzip_included_methods_local_nonprim);
        org_apache_felix_jetty_gzip_included_methods_local_nonprim = NULL;
    }
    if (org_apache_felix_jetty_gzip_excluded_methods_local_nonprim) {
        config_node_property_array_free(org_apache_felix_jetty_gzip_excluded_methods_local_nonprim);
        org_apache_felix_jetty_gzip_excluded_methods_local_nonprim = NULL;
    }
    if (org_apache_felix_jetty_gzip_included_paths_local_nonprim) {
        config_node_property_array_free(org_apache_felix_jetty_gzip_included_paths_local_nonprim);
        org_apache_felix_jetty_gzip_included_paths_local_nonprim = NULL;
    }
    if (org_apache_felix_jetty_gzip_excluded_paths_local_nonprim) {
        config_node_property_array_free(org_apache_felix_jetty_gzip_excluded_paths_local_nonprim);
        org_apache_felix_jetty_gzip_excluded_paths_local_nonprim = NULL;
    }
    if (org_apache_felix_jetty_gzip_included_mime_types_local_nonprim) {
        config_node_property_array_free(org_apache_felix_jetty_gzip_included_mime_types_local_nonprim);
        org_apache_felix_jetty_gzip_included_mime_types_local_nonprim = NULL;
    }
    if (org_apache_felix_jetty_gzip_excluded_mime_types_local_nonprim) {
        config_node_property_array_free(org_apache_felix_jetty_gzip_excluded_mime_types_local_nonprim);
        org_apache_felix_jetty_gzip_excluded_mime_types_local_nonprim = NULL;
    }
    if (org_apache_felix_http_session_invalidate_local_nonprim) {
        config_node_property_boolean_free(org_apache_felix_http_session_invalidate_local_nonprim);
        org_apache_felix_http_session_invalidate_local_nonprim = NULL;
    }
    if (org_apache_felix_http_session_uniqueid_local_nonprim) {
        config_node_property_boolean_free(org_apache_felix_http_session_uniqueid_local_nonprim);
        org_apache_felix_http_session_uniqueid_local_nonprim = NULL;
    }
    return NULL;

}
