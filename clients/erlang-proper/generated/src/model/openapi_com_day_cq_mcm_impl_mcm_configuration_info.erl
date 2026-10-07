-module(openapi_com_day_cq_mcm_impl_mcm_configuration_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_mcm_impl_mcm_configuration_info/0]).

-export([openapi_com_day_cq_mcm_impl_mcm_configuration_info/1]).

-export_type([openapi_com_day_cq_mcm_impl_mcm_configuration_info/0]).

-type openapi_com_day_cq_mcm_impl_mcm_configuration_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_mcm_impl_mcm_configuration_properties:openapi_com_day_cq_mcm_impl_mcm_configuration_properties() }
  ].


openapi_com_day_cq_mcm_impl_mcm_configuration_info() ->
    openapi_com_day_cq_mcm_impl_mcm_configuration_info([]).

openapi_com_day_cq_mcm_impl_mcm_configuration_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_mcm_impl_mcm_configuration_properties:openapi_com_day_cq_mcm_impl_mcm_configuration_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

