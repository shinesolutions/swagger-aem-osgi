-module(openapi_com_adobe_granite_offloading_impl_offloading_configurator_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_offloading_impl_offloading_configurator_info/0]).

-export([openapi_com_adobe_granite_offloading_impl_offloading_configurator_info/1]).

-export_type([openapi_com_adobe_granite_offloading_impl_offloading_configurator_info/0]).

-type openapi_com_adobe_granite_offloading_impl_offloading_configurator_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties:openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties() }
  ].


openapi_com_adobe_granite_offloading_impl_offloading_configurator_info() ->
    openapi_com_adobe_granite_offloading_impl_offloading_configurator_info([]).

openapi_com_adobe_granite_offloading_impl_offloading_configurator_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties:openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

