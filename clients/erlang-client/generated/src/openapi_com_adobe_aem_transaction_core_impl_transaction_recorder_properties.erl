-module(openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties/0]).

-type openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties() ::
    #{ 'isTransactionRecordingEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'isTransactionRecordingEnabled' := IsTransactionRecordingEnabled
        }) ->
    #{ 'isTransactionRecordingEnabled' => IsTransactionRecordingEnabled
     }.
