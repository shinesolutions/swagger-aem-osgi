-module(openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_info/0]).

-export([openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_info/1]).

-export_type([openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_info/0]).

-type openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_properties:openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_properties() }
  ].


openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_info() ->
    openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_info([]).

openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_properties:openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

