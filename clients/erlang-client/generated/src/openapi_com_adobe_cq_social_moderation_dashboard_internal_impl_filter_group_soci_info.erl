-module(openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_info/0]).

-type openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties:openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties()
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
