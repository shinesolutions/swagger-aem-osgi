-module(openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_componen_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_componen_properties/0]).

-export([openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_componen_properties/1]).

-export_type([openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_componen_properties/0]).

-type openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_componen_properties() ::
  [ {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_componen_properties() ->
    openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_componen_properties([]).

openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_componen_properties(Fields) ->
  Default = [ {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

