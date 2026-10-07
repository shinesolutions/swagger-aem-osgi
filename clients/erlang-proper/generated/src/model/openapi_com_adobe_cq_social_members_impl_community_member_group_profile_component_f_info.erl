-module(openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_info/0]).

-export([openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_info/1]).

-export_type([openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_info/0]).

-type openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties:openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties() }
  ].


openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_info() ->
    openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_info([]).

openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties:openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

