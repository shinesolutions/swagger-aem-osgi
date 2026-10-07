-module(openapi_org_apache_felix_http_sslfilter_ssl_filter_properties).

-include("openapi.hrl").

-export([openapi_org_apache_felix_http_sslfilter_ssl_filter_properties/0]).

-export([openapi_org_apache_felix_http_sslfilter_ssl_filter_properties/1]).

-export_type([openapi_org_apache_felix_http_sslfilter_ssl_filter_properties/0]).

-type openapi_org_apache_felix_http_sslfilter_ssl_filter_properties() ::
  [ {'ssl_forward_header', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'ssl_forward_value', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'ssl_forward_cert_header', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'rewrite_absolute_urls', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_felix_http_sslfilter_ssl_filter_properties() ->
    openapi_org_apache_felix_http_sslfilter_ssl_filter_properties([]).

openapi_org_apache_felix_http_sslfilter_ssl_filter_properties(Fields) ->
  Default = [ {'ssl-forward.header', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'ssl-forward.value', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'ssl-forward-cert.header', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'rewrite.absolute.urls', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

