-module(openapi_com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties/0]).

-type openapi_com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties() ::
    #{ 'forward_requests' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'forward_requests' := ForwardRequests
        }) ->
    #{ 'forward.requests' => ForwardRequests
     }.
