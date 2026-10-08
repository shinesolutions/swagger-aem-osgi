-module(openapi_com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties/0]).

-type openapi_com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties() ::
  [ {'skip_bufferedcache', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties() ->
    openapi_com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties([]).

openapi_com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties(Fields) ->
  Default = [ {'skip.bufferedcache', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

