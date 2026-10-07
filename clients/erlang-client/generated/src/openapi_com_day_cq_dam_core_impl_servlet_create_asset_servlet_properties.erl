-module(openapi_com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties() ::
    #{ 'detect_duplicate' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'detect_duplicate' := DetectDuplicate
        }) ->
    #{ 'detect_duplicate' => DetectDuplicate
     }.
