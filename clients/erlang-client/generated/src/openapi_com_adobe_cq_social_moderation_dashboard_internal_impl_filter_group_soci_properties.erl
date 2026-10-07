-module(openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties/0]).

-type openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties() ::
    #{ 'resourceType_filters' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'priority' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'resourceType_filters' := ResourceTypeFilters,
          'priority' := Priority
        }) ->
    #{ 'resourceType.filters' => ResourceTypeFilters,
       'priority' => Priority
     }.
