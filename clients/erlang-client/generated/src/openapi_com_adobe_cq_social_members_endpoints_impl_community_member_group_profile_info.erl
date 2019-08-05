-module(openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_info/0]).

-type openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_properties:openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_properties()
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
