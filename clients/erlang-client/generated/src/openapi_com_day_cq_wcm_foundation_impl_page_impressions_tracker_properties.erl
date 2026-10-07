-module(openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties/0]).

-type openapi_com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties() ::
    #{ 'sling_auth_requirements' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'sling_auth_requirements' := SlingAuthRequirements
        }) ->
    #{ 'sling.auth.requirements' => SlingAuthRequirements
     }.
