-module(openapi_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_properties/0]).

-type openapi_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_properties() ::
    #{ 'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'hc_tags' := HcTags
        }) ->
    #{ 'hc.tags' => HcTags
     }.