-module(openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_info/0]).

-export([openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_info/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_info/0]).

-type openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties:openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties() }
  ].


openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_info() ->
    openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_info([]).

openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties:openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

