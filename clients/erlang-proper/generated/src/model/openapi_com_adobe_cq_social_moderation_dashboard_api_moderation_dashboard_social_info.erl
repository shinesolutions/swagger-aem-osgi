-module(openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_info/0]).

-export([openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_info/1]).

-export_type([openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_info/0]).

-type openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties:openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties() }
  ].


openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_info() ->
    openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_info([]).

openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties:openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

