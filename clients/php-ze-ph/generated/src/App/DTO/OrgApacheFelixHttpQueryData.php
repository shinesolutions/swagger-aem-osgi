<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for orgApacheFelixHttp
 */
class OrgApacheFelixHttpQueryData
{
    /**
     * @DTA\Data(field="org.apache.felix.http.jetty.sendServerHeader", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $org_apache_felix_http_jetty_send_server_header;
    /**
     * @DTA\Data(field="org.apache.felix.jetty.gzip.includedPaths", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $org_apache_felix_jetty_gzip_included_paths;
    /**
     * @DTA\Data(field="org.apache.felix.http.enable", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $org_apache_felix_http_enable;
    /**
     * @DTA\Data(field="org.osgi.service.http.port", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $org_osgi_service_http_port;
    /**
     * @DTA\Data(field="org.apache.felix.http.jetty.selectors", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $org_apache_felix_http_jetty_selectors;
    /**
     * @DTA\Data(field="org.apache.felix.http.jetty.maxFormSize", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $org_apache_felix_http_jetty_max_form_size;
    /**
     * @DTA\Data(field="org.apache.felix.jetty.gzip.minGzipSize", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $org_apache_felix_jetty_gzip_min_gzip_size;
    /**
     * @DTA\Data(field="org.apache.felix.jetty.gzip.compressionLevel", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $org_apache_felix_jetty_gzip_compression_level;
    /**
     * @DTA\Data(field="org.apache.felix.http.host", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $org_apache_felix_http_host;
    /**
     * @DTA\Data(field="org.apache.felix.http.session.timeout", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $org_apache_felix_http_session_timeout;
    /**
     * @DTA\Data(field="post", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $post;
    /**
     * @DTA\Data(field="org.apache.felix.jetty.gziphandler.enable", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $org_apache_felix_jetty_gziphandler_enable;
    /**
     * @DTA\Data(field="org.apache.felix.https.truststore.password", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $org_apache_felix_https_truststore_password;
    /**
     * @DTA\Data(field="org.eclipse.jetty.servlet.SessionIdPathParameterName", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $org_eclipse_jetty_servlet_session_id_path_parameter_name;
    /**
     * @DTA\Data(field="org.apache.felix.http.timeout", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $org_apache_felix_http_timeout;
    /**
     * @DTA\Data(field="action", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $action;
    /**
     * @DTA\Data(field="org.eclipse.jetty.servlet.SessionCookie", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $org_eclipse_jetty_servlet_session_cookie;
    /**
     * @DTA\Data(field="org.apache.felix.jetty.gzip.inflateBufferSize", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $org_apache_felix_jetty_gzip_inflate_buffer_size;
    /**
     * @DTA\Data(field="org.apache.felix.jetty.gzip.includedMimeTypes", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $org_apache_felix_jetty_gzip_included_mime_types;
    /**
     * @DTA\Data(field="org.apache.felix.jetty.gzip.includedMethods", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $org_apache_felix_jetty_gzip_included_methods;
    /**
     * @DTA\Data(field="org.apache.felix.jetty.gzip.excludedMimeTypes", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $org_apache_felix_jetty_gzip_excluded_mime_types;
    /**
     * @DTA\Data(field="org.apache.felix.http.jetty.headerBufferSize", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $org_apache_felix_http_jetty_header_buffer_size;
    /**
     * @DTA\Data(field="org.apache.felix.https.jetty.ciphersuites.excluded", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $org_apache_felix_https_jetty_ciphersuites_excluded;
    /**
     * @DTA\Data(field="$location", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $location;
    /**
     * @DTA\Data(field="org.apache.felix.https.truststore", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $org_apache_felix_https_truststore;
    /**
     * @DTA\Data(field="org.apache.felix.jetty.gzip.excludedMethods", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $org_apache_felix_jetty_gzip_excluded_methods;
    /**
     * @DTA\Data(field="org.apache.felix.https.keystore.password", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $org_apache_felix_https_keystore_password;
    /**
     * @DTA\Data(field="org.apache.felix.http.mbeans", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $org_apache_felix_http_mbeans;
    /**
     * @DTA\Data(field="org.apache.felix.jetty.gzip.excludedPaths", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $org_apache_felix_jetty_gzip_excluded_paths;
    /**
     * @DTA\Data(field="org.apache.felix.http.context_path", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $org_apache_felix_http_context_path;
    /**
     * @DTA\Data(field="org.apache.felix.http.session.invalidate", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $org_apache_felix_http_session_invalidate;
    /**
     * @DTA\Data(field="org.apache.felix.https.jetty.ciphersuites.included", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $org_apache_felix_https_jetty_ciphersuites_included;
    /**
     * @DTA\Data(field="org.apache.felix.http.session.uniqueid", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $org_apache_felix_http_session_uniqueid;
    /**
     * @DTA\Data(field="delete", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $delete;
    /**
     * @DTA\Data(field="org.eclipse.jetty.servlet.SessionDomain", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $org_eclipse_jetty_servlet_session_domain;
    /**
     * @DTA\Data(field="org.apache.felix.http.jetty.responseBufferSize", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $org_apache_felix_http_jetty_response_buffer_size;
    /**
     * @DTA\Data(field="org.apache.felix.http.path_exclusions", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $org_apache_felix_http_path_exclusions;
    /**
     * @DTA\Data(field="org.eclipse.jetty.servlet.MaxAge", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $org_eclipse_jetty_servlet_max_age;
    /**
     * @DTA\Data(field="org.apache.felix.http.jetty.threadpool.max", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $org_apache_felix_http_jetty_threadpool_max;
    /**
     * @DTA\Data(field="org.osgi.service.http.port.secure", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $org_osgi_service_http_port_secure;
    /**
     * @DTA\Data(field="org.apache.felix.jetty.gzip.excludedUserAgents", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $org_apache_felix_jetty_gzip_excluded_user_agents;
    /**
     * @DTA\Data(field="org.apache.felix.http.jetty.requestBufferSize", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $org_apache_felix_http_jetty_request_buffer_size;
    /**
     * @DTA\Data(field="org.apache.felix.https.enable", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $org_apache_felix_https_enable;
    /**
     * @DTA\Data(field="org.apache.felix.https.jetty.session.cookie.httpOnly", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $org_apache_felix_https_jetty_session_cookie_http_only;
    /**
     * @DTA\Data(field="apply", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $apply;
    /**
     * @DTA\Data(field="org.apache.felix.https.keystore.key.password", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $org_apache_felix_https_keystore_key_password;
    /**
     * @DTA\Data(field="org.apache.felix.http.name", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $org_apache_felix_http_name;
    /**
     * @DTA\Data(field="org.apache.felix.jetty.gzip.syncFlush", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $org_apache_felix_jetty_gzip_sync_flush;
    /**
     * @DTA\Data(field="org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $org_eclipse_jetty_servlet_checking_remote_session_id_encoding;
    /**
     * @DTA\Data(field="org.apache.felix.https.jetty.protocols.excluded", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $org_apache_felix_https_jetty_protocols_excluded;
    /**
     * @DTA\Data(field="org.eclipse.jetty.servlet.SessionPath", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $org_eclipse_jetty_servlet_session_path;
    /**
     * @DTA\Data(field="org.apache.felix.https.keystore", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $org_apache_felix_https_keystore;
    /**
     * @DTA\Data(field="org.apache.felix.http.jetty.acceptors", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $org_apache_felix_http_jetty_acceptors;
    /**
     * @DTA\Data(field="org.apache.felix.https.jetty.renegotiateAllowed", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $org_apache_felix_https_jetty_renegotiate_allowed;
    /**
     * @DTA\Data(field="org.apache.felix.https.jetty.session.cookie.secure", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $org_apache_felix_https_jetty_session_cookie_secure;
    /**
     * @DTA\Data(field="propertylist", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"csv"})
     * @var string[]
     */
    public $propertylist;
    /**
     * @DTA\Data(field="org.apache.felix.https.clientcertificate", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $org_apache_felix_https_clientcertificate;
    /**
     * @DTA\Data(field="org.apache.felix.proxy.load.balancer.connection.enable", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $org_apache_felix_proxy_load_balancer_connection_enable;
    /**
     * @DTA\Data(field="org.apache.felix.https.jetty.protocols.included", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $org_apache_felix_https_jetty_protocols_included;
}
