-module(openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties/0]).

-export([openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties/1]).

-export_type([openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties/0]).

-type openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties() ::
  [ {'isTransactionRecordingEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties() ->
    openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties([]).

openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties(Fields) ->
  Default = [ {'isTransactionRecordingEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

