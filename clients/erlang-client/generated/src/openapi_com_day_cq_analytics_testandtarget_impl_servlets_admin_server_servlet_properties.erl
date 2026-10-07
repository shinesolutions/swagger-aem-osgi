-module(openapi_com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet_properties/0]).

-type openapi_com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet_properties() ::
    #{ 'testandtarget_endpoint_url' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'testandtarget_endpoint_url' := TestandtargetEndpointUrl
        }) ->
    #{ 'testandtarget.endpoint.url' => TestandtargetEndpointUrl
     }.
