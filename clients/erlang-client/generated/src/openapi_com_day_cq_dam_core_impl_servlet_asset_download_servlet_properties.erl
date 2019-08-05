-module(openapi_com_day_cq_dam_core_impl_servlet_asset_download_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_asset_download_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_asset_download_servlet_properties() ::
    #{ 'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'enabled' := Enabled
        }) ->
    #{ 'enabled' => Enabled
     }.
