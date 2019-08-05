-module(openapi_com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties/0]).

-type openapi_com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_properties() ::
    #{ 'brightedge_url' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'brightedge_url' := BrightedgeUrl
        }) ->
    #{ 'brightedge.url' => BrightedgeUrl
     }.
