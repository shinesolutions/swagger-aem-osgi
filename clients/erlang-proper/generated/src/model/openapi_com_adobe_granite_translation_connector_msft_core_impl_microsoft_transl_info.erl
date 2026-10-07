-module(openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_info/0]).

-export([openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_info/1]).

-export_type([openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_info/0]).

-type openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties:openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties() }
  ].


openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_info() ->
    openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_info([]).

openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties:openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

