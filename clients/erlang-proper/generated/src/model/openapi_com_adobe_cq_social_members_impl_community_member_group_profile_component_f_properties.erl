-module(openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties/0]).

-export([openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties/1]).

-export_type([openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties/0]).

-type openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties() ::
  [ {'everyoneLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties() ->
    openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties([]).

openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties(Fields) ->
  Default = [ {'everyoneLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

