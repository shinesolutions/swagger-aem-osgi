-module(openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_info/0]).

-export([openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_info/1]).

-export_type([openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_info/0]).

-type openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties:openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties() }
  ].


openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_info() ->
    openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_info([]).

openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties:openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

