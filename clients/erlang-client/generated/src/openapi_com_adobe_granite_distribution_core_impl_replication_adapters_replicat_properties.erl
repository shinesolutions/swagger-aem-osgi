-module(openapi_com_adobe_granite_distribution_core_impl_replication_adapters_replicat_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_replication_adapters_replicat_properties/0]).

-type openapi_com_adobe_granite_distribution_core_impl_replication_adapters_replicat_properties() ::
    #{ 'providerName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'forward_requests' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'providerName' := ProviderName,
          'forward_requests' := ForwardRequests
        }) ->
    #{ 'providerName' => ProviderName,
       'forward.requests' => ForwardRequests
     }.
