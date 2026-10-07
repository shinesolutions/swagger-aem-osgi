-module(openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_info/0]).

-type openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties:openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
