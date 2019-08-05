-module(openapi_com_adobe_cq_social_enablement_services_impl_author_marker_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_enablement_services_impl_author_marker_impl_properties/0]).

-type openapi_com_adobe_cq_social_enablement_services_impl_author_marker_impl_properties() ::
    #{ 'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'service_ranking' := ServiceRanking
        }) ->
    #{ 'service.ranking' => ServiceRanking
     }.
