-module(openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_info).

-export([encode/1]).

-export_type([openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_info/0]).

-type openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties:openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
