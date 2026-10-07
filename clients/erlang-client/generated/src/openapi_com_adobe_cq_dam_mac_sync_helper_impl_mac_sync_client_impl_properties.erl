-module(openapi_com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties/0]).

-type openapi_com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties() ::
    #{ 'com_adobe_dam_mac_sync_client_so_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'com_adobe_dam_mac_sync_client_so_timeout' := ComAdobeDamMacSyncClientSoTimeout
        }) ->
    #{ 'com.adobe.dam.mac.sync.client.so.timeout' => ComAdobeDamMacSyncClientSoTimeout
     }.
