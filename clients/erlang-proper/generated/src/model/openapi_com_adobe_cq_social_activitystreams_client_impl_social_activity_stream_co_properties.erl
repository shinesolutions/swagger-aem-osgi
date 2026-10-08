-module(openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties/0]).

-export([openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties/1]).

-export_type([openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties/0]).

-type openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties() ::
  [ {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties() ->
    openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties([]).

openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties(Fields) ->
  Default = [ {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

