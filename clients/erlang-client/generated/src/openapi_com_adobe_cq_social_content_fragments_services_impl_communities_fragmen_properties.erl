-module(openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties/0]).

-type openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties() ::
    #{ 'cq_social_content_fragments_services_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cq_social_content_fragments_services_waitTimeSeconds' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_social_content_fragments_services_enabled' := CqSocialContentFragmentsServicesEnabled,
          'cq_social_content_fragments_services_waitTimeSeconds' := CqSocialContentFragmentsServicesWaitTimeSeconds
        }) ->
    #{ 'cq.social.content.fragments.services.enabled' => CqSocialContentFragmentsServicesEnabled,
       'cq.social.content.fragments.services.waitTimeSeconds' => CqSocialContentFragmentsServicesWaitTimeSeconds
     }.
