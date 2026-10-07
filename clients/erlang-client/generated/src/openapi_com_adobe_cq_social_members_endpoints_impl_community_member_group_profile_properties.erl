-module(openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_properties/0]).

-type openapi_com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_properties() ::
    #{ 'fieldWhitelist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'fieldWhitelist' := FieldWhitelist
        }) ->
    #{ 'fieldWhitelist' => FieldWhitelist
     }.
