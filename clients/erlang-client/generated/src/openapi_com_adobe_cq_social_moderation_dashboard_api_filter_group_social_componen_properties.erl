-module(openapi_com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen_properties/0]).

-type openapi_com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen_properties() ::
    #{ 'resourceType_filters' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'priority' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'resourceType_filters' := ResourceTypeFilters,
          'priority' := Priority
        }) ->
    #{ 'resourceType.filters' => ResourceTypeFilters,
       'priority' => Priority
     }.
