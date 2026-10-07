<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for orgApacheFelixHttp
 */
class OrgApacheFelixHttpParameterData
{
    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.jetty.sendServerHeader", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $org_apache_felix_http_jetty_send_server_header = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.jetty.gzip.includedPaths", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $org_apache_felix_jetty_gzip_included_paths = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.enable", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $org_apache_felix_http_enable = null;

    /**
     * @DTA\Data(subset="query", field="org.osgi.service.http.port", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $org_osgi_service_http_port = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.jetty.selectors", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $org_apache_felix_http_jetty_selectors = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.jetty.maxFormSize", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $org_apache_felix_http_jetty_max_form_size = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.jetty.gzip.minGzipSize", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $org_apache_felix_jetty_gzip_min_gzip_size = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.jetty.gzip.compressionLevel", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $org_apache_felix_jetty_gzip_compression_level = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.host", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_http_host = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.session.timeout", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $org_apache_felix_http_session_timeout = null;

    /**
     * @DTA\Data(subset="query", field="post", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $post = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.jetty.gziphandler.enable", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $org_apache_felix_jetty_gziphandler_enable = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.truststore.password", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_truststore_password = null;

    /**
     * @DTA\Data(subset="query", field="org.eclipse.jetty.servlet.SessionIdPathParameterName", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_eclipse_jetty_servlet_session_id_path_parameter_name = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.timeout", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $org_apache_felix_http_timeout = null;

    /**
     * @DTA\Data(subset="query", field="action", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $action = null;

    /**
     * @DTA\Data(subset="query", field="org.eclipse.jetty.servlet.SessionCookie", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_eclipse_jetty_servlet_session_cookie = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.jetty.gzip.inflateBufferSize", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $org_apache_felix_jetty_gzip_inflate_buffer_size = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.jetty.gzip.includedMimeTypes", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $org_apache_felix_jetty_gzip_included_mime_types = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.jetty.gzip.includedMethods", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $org_apache_felix_jetty_gzip_included_methods = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.jetty.gzip.excludedMimeTypes", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $org_apache_felix_jetty_gzip_excluded_mime_types = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.jetty.headerBufferSize", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $org_apache_felix_http_jetty_header_buffer_size = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.jetty.ciphersuites.excluded", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $org_apache_felix_https_jetty_ciphersuites_excluded = null;

    /**
     * @DTA\Data(subset="query", field="$location", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $location = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.truststore", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_truststore = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.jetty.gzip.excludedMethods", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $org_apache_felix_jetty_gzip_excluded_methods = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.keystore.password", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_keystore_password = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.mbeans", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $org_apache_felix_http_mbeans = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.jetty.gzip.excludedPaths", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $org_apache_felix_jetty_gzip_excluded_paths = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.context_path", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_http_context_path = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.session.invalidate", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $org_apache_felix_http_session_invalidate = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.jetty.ciphersuites.included", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $org_apache_felix_https_jetty_ciphersuites_included = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.session.uniqueid", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $org_apache_felix_http_session_uniqueid = null;

    /**
     * @DTA\Data(subset="query", field="delete", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $delete = null;

    /**
     * @DTA\Data(subset="query", field="org.eclipse.jetty.servlet.SessionDomain", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_eclipse_jetty_servlet_session_domain = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.jetty.responseBufferSize", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $org_apache_felix_http_jetty_response_buffer_size = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.path_exclusions", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $org_apache_felix_http_path_exclusions = null;

    /**
     * @DTA\Data(subset="query", field="org.eclipse.jetty.servlet.MaxAge", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $org_eclipse_jetty_servlet_max_age = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.jetty.threadpool.max", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $org_apache_felix_http_jetty_threadpool_max = null;

    /**
     * @DTA\Data(subset="query", field="org.osgi.service.http.port.secure", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $org_osgi_service_http_port_secure = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.jetty.gzip.excludedUserAgents", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $org_apache_felix_jetty_gzip_excluded_user_agents = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.jetty.requestBufferSize", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $org_apache_felix_http_jetty_request_buffer_size = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.enable", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $org_apache_felix_https_enable = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.jetty.session.cookie.httpOnly", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $org_apache_felix_https_jetty_session_cookie_http_only = null;

    /**
     * @DTA\Data(subset="query", field="apply", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $apply = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.keystore.key.password", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_keystore_key_password = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.name", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_http_name = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.jetty.gzip.syncFlush", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $org_apache_felix_jetty_gzip_sync_flush = null;

    /**
     * @DTA\Data(subset="query", field="org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $org_eclipse_jetty_servlet_checking_remote_session_id_encoding = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.jetty.protocols.excluded", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $org_apache_felix_https_jetty_protocols_excluded = null;

    /**
     * @DTA\Data(subset="query", field="org.eclipse.jetty.servlet.SessionPath", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_eclipse_jetty_servlet_session_path = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.keystore", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_keystore = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.http.jetty.acceptors", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $org_apache_felix_http_jetty_acceptors = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.jetty.renegotiateAllowed", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $org_apache_felix_https_jetty_renegotiate_allowed = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.jetty.session.cookie.secure", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $org_apache_felix_https_jetty_session_cookie_secure = null;

    /**
     * @DTA\Data(subset="query", field="propertylist", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     */
    public ?array $propertylist = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.clientcertificate", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_clientcertificate = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.proxy.load.balancer.connection.enable", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $org_apache_felix_proxy_load_balancer_connection_enable = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.jetty.protocols.included", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $org_apache_felix_https_jetty_protocols_included = null;

}
