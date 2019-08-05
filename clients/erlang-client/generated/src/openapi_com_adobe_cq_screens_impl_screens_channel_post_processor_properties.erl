-module(openapi_com_adobe_cq_screens_impl_screens_channel_post_processor_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_screens_impl_screens_channel_post_processor_properties/0]).

-type openapi_com_adobe_cq_screens_impl_screens_channel_post_processor_properties() ::
    #{ 'screens_channels_properties_to_remove' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'screens_channels_properties_to_remove' := ScreensChannelsPropertiesToRemove
        }) ->
    #{ 'screens.channels.properties.to.remove' => ScreensChannelsPropertiesToRemove
     }.
