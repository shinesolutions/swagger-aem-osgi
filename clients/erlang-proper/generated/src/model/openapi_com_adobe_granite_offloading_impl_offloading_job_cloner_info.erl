-module(openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_info/0]).

-export([openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_info/1]).

-export_type([openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_info/0]).

-type openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_properties:openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_properties() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_info() ->
    openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_info([]).

openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_properties:openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_properties() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

