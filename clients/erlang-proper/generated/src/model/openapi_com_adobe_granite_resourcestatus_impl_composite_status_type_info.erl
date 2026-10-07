-module(openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_info/0]).

-export([openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_info/1]).

-export_type([openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_info/0]).

-type openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties:openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties() }
  ].


openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_info() ->
    openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_info([]).

openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties:openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

