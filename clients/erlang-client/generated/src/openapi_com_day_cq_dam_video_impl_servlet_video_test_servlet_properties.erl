-module(openapi_com_day_cq_dam_video_impl_servlet_video_test_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_video_impl_servlet_video_test_servlet_properties/0]).

-type openapi_com_day_cq_dam_video_impl_servlet_video_test_servlet_properties() ::
    #{ 'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'enabled' := Enabled
        }) ->
    #{ 'enabled' => Enabled
     }.