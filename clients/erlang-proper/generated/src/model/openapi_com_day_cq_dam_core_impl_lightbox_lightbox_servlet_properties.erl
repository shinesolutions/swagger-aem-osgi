-module(openapi_com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties() ::
  [ {'sling_servlet_paths', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sling_servlet_methods', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_dam_enable_anonymous', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties() ->
    openapi_com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties([]).

openapi_com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties(Fields) ->
  Default = [ {'sling.servlet.paths', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sling.servlet.methods', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.dam.enable.anonymous', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

