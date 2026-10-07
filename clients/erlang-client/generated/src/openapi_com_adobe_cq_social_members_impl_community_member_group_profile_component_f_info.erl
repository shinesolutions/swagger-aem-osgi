-module(openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_info/0]).

-type openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties:openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties()
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
