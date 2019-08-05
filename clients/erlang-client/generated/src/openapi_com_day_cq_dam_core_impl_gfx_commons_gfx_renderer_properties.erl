-module(openapi_com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties/0]).

-type openapi_com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties() ::
    #{ 'skip_bufferedcache' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'skip_bufferedcache' := SkipBufferedcache
        }) ->
    #{ 'skip.bufferedcache' => SkipBufferedcache
     }.
