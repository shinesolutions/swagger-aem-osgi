-module(openapi_com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet_properties/0]).

-export([openapi_com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet_properties/1]).

-export_type([openapi_com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet_properties/0]).

-type openapi_com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet_properties() ::
  [ {'testandtarget_endpoint_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet_properties() ->
    openapi_com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet_properties([]).

openapi_com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet_properties(Fields) ->
  Default = [ {'testandtarget.endpoint.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

