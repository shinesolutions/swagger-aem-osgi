-module(openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_info/0]).

-export([openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_info/1]).

-export_type([openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_info/0]).

-type openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties:openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties() }
  ].


openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_info() ->
    openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_info([]).

openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties:openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

