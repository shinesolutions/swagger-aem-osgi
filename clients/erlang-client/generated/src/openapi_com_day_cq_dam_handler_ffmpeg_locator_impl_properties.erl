-module(openapi_com_day_cq_dam_handler_ffmpeg_locator_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_handler_ffmpeg_locator_impl_properties/0]).

-type openapi_com_day_cq_dam_handler_ffmpeg_locator_impl_properties() ::
    #{ 'executable_searchpath' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'executable_searchpath' := ExecutableSearchpath
        }) ->
    #{ 'executable.searchpath' => ExecutableSearchpath
     }.
