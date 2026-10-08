-module(openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_info).

-include("openapi.hrl").

-export([openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_info/0]).

-export([openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_info/1]).

-export_type([openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_info/0]).

-type openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties:openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties() }
  ].


openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_info() ->
    openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_info([]).

openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties:openapi_com_adobe_aem_transaction_core_impl_transaction_recorder_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

