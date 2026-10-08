-module(openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_properties/0]).

-export([openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_properties/1]).

-export_type([openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_properties/0]).

-type openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_properties() ::
  [ {'offloading_jobcloner_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_properties() ->
    openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_properties([]).

openapi_com_adobe_granite_offloading_impl_offloading_job_cloner_properties(Fields) ->
  Default = [ {'offloading.jobcloner.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

