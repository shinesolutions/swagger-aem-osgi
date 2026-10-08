-module(openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_info/0]).

-export([openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_info/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_info/0]).

-type openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties:openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties() }
  ].


openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_info() ->
    openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_info([]).

openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties:openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

