-module(openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_info/0]).

-export([openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_info/1]).

-export_type([openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_info/0]).

-type openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties:openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties() }
  ].


openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_info() ->
    openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_info([]).

openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties:openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

