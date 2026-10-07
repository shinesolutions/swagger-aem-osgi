-module(openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties/0]).

-type openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties() ::
    #{ 'offloading_transporter' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'offloading_cleanup_payload' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'offloading_transporter' := OffloadingTransporter,
          'offloading_cleanup_payload' := OffloadingCleanupPayload
        }) ->
    #{ 'offloading.transporter' => OffloadingTransporter,
       'offloading.cleanup.payload' => OffloadingCleanupPayload
     }.
