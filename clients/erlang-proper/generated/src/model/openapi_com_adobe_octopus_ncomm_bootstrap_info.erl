-module(openapi_com_adobe_octopus_ncomm_bootstrap_info).

-include("openapi.hrl").

-export([openapi_com_adobe_octopus_ncomm_bootstrap_info/0]).

-export([openapi_com_adobe_octopus_ncomm_bootstrap_info/1]).

-export_type([openapi_com_adobe_octopus_ncomm_bootstrap_info/0]).

-type openapi_com_adobe_octopus_ncomm_bootstrap_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_octopus_ncomm_bootstrap_properties:openapi_com_adobe_octopus_ncomm_bootstrap_properties() }
  ].


openapi_com_adobe_octopus_ncomm_bootstrap_info() ->
    openapi_com_adobe_octopus_ncomm_bootstrap_info([]).

openapi_com_adobe_octopus_ncomm_bootstrap_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_octopus_ncomm_bootstrap_properties:openapi_com_adobe_octopus_ncomm_bootstrap_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

