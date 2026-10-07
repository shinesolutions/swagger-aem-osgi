-module(openapi_org_apache_felix_http_properties).

-include("openapi.hrl").

-export([openapi_org_apache_felix_http_properties/0]).

-export([openapi_org_apache_felix_http_properties/1]).

-export_type([openapi_org_apache_felix_http_properties/0]).

-type openapi_org_apache_felix_http_properties() ::
  [ {'org_apache_felix_http_host', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_felix_http_enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'org_osgi_service_http_port', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_http_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_https_enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'org_osgi_service_http_port_secure', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_https_keystore', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_felix_https_keystore_password', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_felix_https_keystore_key_password', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_felix_https_truststore', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_felix_https_truststore_password', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_felix_https_clientcertificate', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'org_apache_felix_http_context_path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_felix_http_mbeans', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'org_apache_felix_http_session_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_http_jetty_threadpool_max', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_http_jetty_acceptors', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_http_jetty_selectors', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_http_jetty_headerBufferSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_http_jetty_requestBufferSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_http_jetty_responseBufferSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_http_jetty_maxFormSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_http_path_exclusions', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'org_apache_felix_https_jetty_ciphersuites_excluded', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'org_apache_felix_https_jetty_ciphersuites_included', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'org_apache_felix_http_jetty_sendServerHeader', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'org_apache_felix_https_jetty_protocols_included', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'org_apache_felix_https_jetty_protocols_excluded', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'org_apache_felix_proxy_load_balancer_connection_enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'org_apache_felix_https_jetty_renegotiateAllowed', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'org_apache_felix_https_jetty_session_cookie_httpOnly', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'org_apache_felix_https_jetty_session_cookie_secure', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'org_eclipse_jetty_servlet_SessionIdPathParameterName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_eclipse_jetty_servlet_CheckingRemoteSessionIdEncoding', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'org_eclipse_jetty_servlet_SessionCookie', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_eclipse_jetty_servlet_SessionDomain', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_eclipse_jetty_servlet_SessionPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_eclipse_jetty_servlet_MaxAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_http_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_felix_jetty_gziphandler_enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'org_apache_felix_jetty_gzip_minGzipSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_jetty_gzip_compressionLevel', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_jetty_gzip_inflateBufferSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_jetty_gzip_syncFlush', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'org_apache_felix_jetty_gzip_excludedUserAgents', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'org_apache_felix_jetty_gzip_includedMethods', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'org_apache_felix_jetty_gzip_excludedMethods', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'org_apache_felix_jetty_gzip_includedPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'org_apache_felix_jetty_gzip_excludedPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'org_apache_felix_jetty_gzip_includedMimeTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'org_apache_felix_jetty_gzip_excludedMimeTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'org_apache_felix_http_session_invalidate', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'org_apache_felix_http_session_uniqueid', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_felix_http_properties() ->
    openapi_org_apache_felix_http_properties([]).

openapi_org_apache_felix_http_properties(Fields) ->
  Default = [ {'org.apache.felix.http.host', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.felix.http.enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'org.osgi.service.http.port', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.http.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.https.enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'org.osgi.service.http.port.secure', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.https.keystore', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.felix.https.keystore.password', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.felix.https.keystore.key.password', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.felix.https.truststore', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.felix.https.truststore.password', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.felix.https.clientcertificate', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'org.apache.felix.http.context_path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.felix.http.mbeans', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'org.apache.felix.http.session.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.http.jetty.threadpool.max', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.http.jetty.acceptors', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.http.jetty.selectors', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.http.jetty.headerBufferSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.http.jetty.requestBufferSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.http.jetty.responseBufferSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.http.jetty.maxFormSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.http.path_exclusions', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'org.apache.felix.https.jetty.ciphersuites.excluded', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'org.apache.felix.https.jetty.ciphersuites.included', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'org.apache.felix.http.jetty.sendServerHeader', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'org.apache.felix.https.jetty.protocols.included', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'org.apache.felix.https.jetty.protocols.excluded', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'org.apache.felix.proxy.load.balancer.connection.enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'org.apache.felix.https.jetty.renegotiateAllowed', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'org.apache.felix.https.jetty.session.cookie.httpOnly', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'org.apache.felix.https.jetty.session.cookie.secure', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'org.eclipse.jetty.servlet.SessionIdPathParameterName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'org.eclipse.jetty.servlet.SessionCookie', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.eclipse.jetty.servlet.SessionDomain', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.eclipse.jetty.servlet.SessionPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.eclipse.jetty.servlet.MaxAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.http.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.felix.jetty.gziphandler.enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'org.apache.felix.jetty.gzip.minGzipSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.jetty.gzip.compressionLevel', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.jetty.gzip.inflateBufferSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.jetty.gzip.syncFlush', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'org.apache.felix.jetty.gzip.excludedUserAgents', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'org.apache.felix.jetty.gzip.includedMethods', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'org.apache.felix.jetty.gzip.excludedMethods', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'org.apache.felix.jetty.gzip.includedPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'org.apache.felix.jetty.gzip.excludedPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'org.apache.felix.jetty.gzip.includedMimeTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'org.apache.felix.jetty.gzip.excludedMimeTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'org.apache.felix.http.session.invalidate', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'org.apache.felix.http.session.uniqueid', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

