-module(openapi_org_apache_felix_http_sslfilter_ssl_filter_properties).

-export([encode/1]).

-export_type([openapi_org_apache_felix_http_sslfilter_ssl_filter_properties/0]).

-type openapi_org_apache_felix_http_sslfilter_ssl_filter_properties() ::
    #{ 'ssl_forward_header' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'ssl_forward_value' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'ssl_forward_cert_header' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'rewrite_absolute_urls' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'ssl_forward_header' := SslForwardHeader,
          'ssl_forward_value' := SslForwardValue,
          'ssl_forward_cert_header' := SslForwardCertHeader,
          'rewrite_absolute_urls' := RewriteAbsoluteUrls
        }) ->
    #{ 'ssl-forward.header' => SslForwardHeader,
       'ssl-forward.value' => SslForwardValue,
       'ssl-forward-cert.header' => SslForwardCertHeader,
       'rewrite.absolute.urls' => RewriteAbsoluteUrls
     }.
