-module(openapi_com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties/0]).

-export([openapi_com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties/1]).

-export_type([openapi_com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties/0]).

-type openapi_com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties() ::
  [ {'cache_enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cache_rootPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cache_maxSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cache_maxEntries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties() ->
    openapi_com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties([]).

openapi_com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties(Fields) ->
  Default = [ {'cache.enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cache.rootPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cache.maxSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cache.maxEntries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

