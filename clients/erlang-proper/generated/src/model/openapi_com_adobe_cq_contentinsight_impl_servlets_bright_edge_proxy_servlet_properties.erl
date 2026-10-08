-module(openapi_com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties/0]).

-export([openapi_com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties/1]).

-export_type([openapi_com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties/0]).

-type openapi_com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties() ::
  [ {'brightedge_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties() ->
    openapi_com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties([]).

openapi_com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties(Fields) ->
  Default = [ {'brightedge.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

