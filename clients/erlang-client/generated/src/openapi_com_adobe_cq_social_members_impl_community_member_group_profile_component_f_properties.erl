-module(openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties/0]).

-type openapi_com_adobe_cq_social_members_impl_community_member_group_profile_component_f_properties() ::
    #{ 'everyoneLimit' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'priority' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'everyoneLimit' := EveryoneLimit,
          'priority' := Priority
        }) ->
    #{ 'everyoneLimit' => EveryoneLimit,
       'priority' => Priority
     }.
