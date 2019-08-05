<?php
/**
 * OrgApacheFelixHttpProperties
 */
namespace app\Models;

/**
 * OrgApacheFelixHttpProperties
 */
class OrgApacheFelixHttpProperties {

    /** @var \app\Models\ConfigNodePropertyString $org_apache_felix_http_host */
    private $org_apache_felix_http_host;

    /** @var \app\Models\ConfigNodePropertyBoolean $org_apache_felix_http_enable */
    private $org_apache_felix_http_enable;

    /** @var \app\Models\ConfigNodePropertyInteger $org_osgi_service_http_port */
    private $org_osgi_service_http_port;

    /** @var \app\Models\ConfigNodePropertyInteger $org_apache_felix_http_timeout */
    private $org_apache_felix_http_timeout;

    /** @var \app\Models\ConfigNodePropertyBoolean $org_apache_felix_https_enable */
    private $org_apache_felix_https_enable;

    /** @var \app\Models\ConfigNodePropertyInteger $org_osgi_service_http_port_secure */
    private $org_osgi_service_http_port_secure;

    /** @var \app\Models\ConfigNodePropertyString $org_apache_felix_https_keystore */
    private $org_apache_felix_https_keystore;

    /** @var \app\Models\ConfigNodePropertyString $org_apache_felix_https_keystore_password */
    private $org_apache_felix_https_keystore_password;

    /** @var \app\Models\ConfigNodePropertyString $org_apache_felix_https_keystore_key_password */
    private $org_apache_felix_https_keystore_key_password;

    /** @var \app\Models\ConfigNodePropertyString $org_apache_felix_https_truststore */
    private $org_apache_felix_https_truststore;

    /** @var \app\Models\ConfigNodePropertyString $org_apache_felix_https_truststore_password */
    private $org_apache_felix_https_truststore_password;

    /** @var \app\Models\ConfigNodePropertyDropDown $org_apache_felix_https_clientcertificate */
    private $org_apache_felix_https_clientcertificate;

    /** @var \app\Models\ConfigNodePropertyString $org_apache_felix_http_context_path */
    private $org_apache_felix_http_context_path;

    /** @var \app\Models\ConfigNodePropertyBoolean $org_apache_felix_http_mbeans */
    private $org_apache_felix_http_mbeans;

    /** @var \app\Models\ConfigNodePropertyInteger $org_apache_felix_http_session_timeout */
    private $org_apache_felix_http_session_timeout;

    /** @var \app\Models\ConfigNodePropertyInteger $org_apache_felix_http_jetty_threadpool_max */
    private $org_apache_felix_http_jetty_threadpool_max;

    /** @var \app\Models\ConfigNodePropertyInteger $org_apache_felix_http_jetty_acceptors */
    private $org_apache_felix_http_jetty_acceptors;

    /** @var \app\Models\ConfigNodePropertyInteger $org_apache_felix_http_jetty_selectors */
    private $org_apache_felix_http_jetty_selectors;

    /** @var \app\Models\ConfigNodePropertyInteger $org_apache_felix_http_jetty_header_buffer_size */
    private $org_apache_felix_http_jetty_header_buffer_size;

    /** @var \app\Models\ConfigNodePropertyInteger $org_apache_felix_http_jetty_request_buffer_size */
    private $org_apache_felix_http_jetty_request_buffer_size;

    /** @var \app\Models\ConfigNodePropertyInteger $org_apache_felix_http_jetty_response_buffer_size */
    private $org_apache_felix_http_jetty_response_buffer_size;

    /** @var \app\Models\ConfigNodePropertyInteger $org_apache_felix_http_jetty_max_form_size */
    private $org_apache_felix_http_jetty_max_form_size;

    /** @var \app\Models\ConfigNodePropertyArray $org_apache_felix_http_path_exclusions */
    private $org_apache_felix_http_path_exclusions;

    /** @var \app\Models\ConfigNodePropertyArray $org_apache_felix_https_jetty_ciphersuites_excluded */
    private $org_apache_felix_https_jetty_ciphersuites_excluded;

    /** @var \app\Models\ConfigNodePropertyArray $org_apache_felix_https_jetty_ciphersuites_included */
    private $org_apache_felix_https_jetty_ciphersuites_included;

    /** @var \app\Models\ConfigNodePropertyBoolean $org_apache_felix_http_jetty_send_server_header */
    private $org_apache_felix_http_jetty_send_server_header;

    /** @var \app\Models\ConfigNodePropertyArray $org_apache_felix_https_jetty_protocols_included */
    private $org_apache_felix_https_jetty_protocols_included;

    /** @var \app\Models\ConfigNodePropertyArray $org_apache_felix_https_jetty_protocols_excluded */
    private $org_apache_felix_https_jetty_protocols_excluded;

    /** @var \app\Models\ConfigNodePropertyBoolean $org_apache_felix_proxy_load_balancer_connection_enable */
    private $org_apache_felix_proxy_load_balancer_connection_enable;

    /** @var \app\Models\ConfigNodePropertyBoolean $org_apache_felix_https_jetty_renegotiate_allowed */
    private $org_apache_felix_https_jetty_renegotiate_allowed;

    /** @var \app\Models\ConfigNodePropertyBoolean $org_apache_felix_https_jetty_session_cookie_http_only */
    private $org_apache_felix_https_jetty_session_cookie_http_only;

    /** @var \app\Models\ConfigNodePropertyBoolean $org_apache_felix_https_jetty_session_cookie_secure */
    private $org_apache_felix_https_jetty_session_cookie_secure;

    /** @var \app\Models\ConfigNodePropertyString $org_eclipse_jetty_servlet_session_id_path_parameter_name */
    private $org_eclipse_jetty_servlet_session_id_path_parameter_name;

    /** @var \app\Models\ConfigNodePropertyBoolean $org_eclipse_jetty_servlet_checking_remote_session_id_encoding */
    private $org_eclipse_jetty_servlet_checking_remote_session_id_encoding;

    /** @var \app\Models\ConfigNodePropertyString $org_eclipse_jetty_servlet_session_cookie */
    private $org_eclipse_jetty_servlet_session_cookie;

    /** @var \app\Models\ConfigNodePropertyString $org_eclipse_jetty_servlet_session_domain */
    private $org_eclipse_jetty_servlet_session_domain;

    /** @var \app\Models\ConfigNodePropertyString $org_eclipse_jetty_servlet_session_path */
    private $org_eclipse_jetty_servlet_session_path;

    /** @var \app\Models\ConfigNodePropertyInteger $org_eclipse_jetty_servlet_max_age */
    private $org_eclipse_jetty_servlet_max_age;

    /** @var \app\Models\ConfigNodePropertyString $org_apache_felix_http_name */
    private $org_apache_felix_http_name;

    /** @var \app\Models\ConfigNodePropertyBoolean $org_apache_felix_jetty_gziphandler_enable */
    private $org_apache_felix_jetty_gziphandler_enable;

    /** @var \app\Models\ConfigNodePropertyInteger $org_apache_felix_jetty_gzip_min_gzip_size */
    private $org_apache_felix_jetty_gzip_min_gzip_size;

    /** @var \app\Models\ConfigNodePropertyInteger $org_apache_felix_jetty_gzip_compression_level */
    private $org_apache_felix_jetty_gzip_compression_level;

    /** @var \app\Models\ConfigNodePropertyInteger $org_apache_felix_jetty_gzip_inflate_buffer_size */
    private $org_apache_felix_jetty_gzip_inflate_buffer_size;

    /** @var \app\Models\ConfigNodePropertyBoolean $org_apache_felix_jetty_gzip_sync_flush */
    private $org_apache_felix_jetty_gzip_sync_flush;

    /** @var \app\Models\ConfigNodePropertyArray $org_apache_felix_jetty_gzip_excluded_user_agents */
    private $org_apache_felix_jetty_gzip_excluded_user_agents;

    /** @var \app\Models\ConfigNodePropertyArray $org_apache_felix_jetty_gzip_included_methods */
    private $org_apache_felix_jetty_gzip_included_methods;

    /** @var \app\Models\ConfigNodePropertyArray $org_apache_felix_jetty_gzip_excluded_methods */
    private $org_apache_felix_jetty_gzip_excluded_methods;

    /** @var \app\Models\ConfigNodePropertyArray $org_apache_felix_jetty_gzip_included_paths */
    private $org_apache_felix_jetty_gzip_included_paths;

    /** @var \app\Models\ConfigNodePropertyArray $org_apache_felix_jetty_gzip_excluded_paths */
    private $org_apache_felix_jetty_gzip_excluded_paths;

    /** @var \app\Models\ConfigNodePropertyArray $org_apache_felix_jetty_gzip_included_mime_types */
    private $org_apache_felix_jetty_gzip_included_mime_types;

    /** @var \app\Models\ConfigNodePropertyArray $org_apache_felix_jetty_gzip_excluded_mime_types */
    private $org_apache_felix_jetty_gzip_excluded_mime_types;

    /** @var \app\Models\ConfigNodePropertyBoolean $org_apache_felix_http_session_invalidate */
    private $org_apache_felix_http_session_invalidate;

    /** @var \app\Models\ConfigNodePropertyBoolean $org_apache_felix_http_session_uniqueid */
    private $org_apache_felix_http_session_uniqueid;

}
