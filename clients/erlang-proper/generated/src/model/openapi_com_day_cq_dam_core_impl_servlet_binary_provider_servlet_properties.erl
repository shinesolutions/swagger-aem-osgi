-module(openapi_com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties() ::
  [ {'sling_servlet_resourceTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'sling_servlet_methods', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_dam_drm_enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties() ->
    openapi_com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties([]).

openapi_com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties(Fields) ->
  Default = [ {'sling.servlet.resourceTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'sling.servlet.methods', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.dam.drm.enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

