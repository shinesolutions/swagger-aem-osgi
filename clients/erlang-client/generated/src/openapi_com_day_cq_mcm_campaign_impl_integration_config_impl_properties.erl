-module(openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_properties/0]).

-type openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_properties() ::
    #{ 'aem_mcm_campaign_formConstraints' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'aem_mcm_campaign_publicUrl' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'aem_mcm_campaign_relaxedSSL' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'aem_mcm_campaign_formConstraints' := AemMcmCampaignFormConstraints,
          'aem_mcm_campaign_publicUrl' := AemMcmCampaignPublicUrl,
          'aem_mcm_campaign_relaxedSSL' := AemMcmCampaignRelaxedSSL
        }) ->
    #{ 'aem.mcm.campaign.formConstraints' => AemMcmCampaignFormConstraints,
       'aem.mcm.campaign.publicUrl' => AemMcmCampaignPublicUrl,
       'aem.mcm.campaign.relaxedSSL' => AemMcmCampaignRelaxedSSL
     }.
