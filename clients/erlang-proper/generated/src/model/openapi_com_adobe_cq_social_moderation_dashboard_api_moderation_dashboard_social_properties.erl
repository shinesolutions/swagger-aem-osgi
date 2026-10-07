-module(openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties/0]).

-export([openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties/1]).

-export_type([openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties/0]).

-type openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties() ::
  [ {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties() ->
    openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties([]).

openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties(Fields) ->
  Default = [ {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

