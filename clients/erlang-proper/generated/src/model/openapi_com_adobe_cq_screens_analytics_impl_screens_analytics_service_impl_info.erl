-module(openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_info/0]).

-export([openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_info/1]).

-export_type([openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_info/0]).

-type openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties:openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties() }
  ].


openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_info() ->
    openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_info([]).

openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties:openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

