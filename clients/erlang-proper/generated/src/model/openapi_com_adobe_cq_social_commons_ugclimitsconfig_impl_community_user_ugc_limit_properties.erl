-module(openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties/0]).

-export([openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties/1]).

-export_type([openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties/0]).

-type openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties() ::
  [ {'enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'UGCLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'ugcLimitDuration', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'domains', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'toList', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties() ->
    openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties([]).

openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties(Fields) ->
  Default = [ {'enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'UGCLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'ugcLimitDuration', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'domains', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'toList', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

