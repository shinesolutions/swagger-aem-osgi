# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqMcmCampaignImplIntegrationConfigImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, aem_mcm_campaign_form_constraints: nil, aem_mcm_campaign_public_url: nil, aem_mcm_campaign_relaxed_ssl: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.mcm.campaign.impl.IntegrationConfigImpl',
          type: OpenapiClient::Models::ComDayCqMcmCampaignImplIntegrationConfigImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'aem.mcm.campaign.formConstraints' => aem_mcm_campaign_form_constraints, 'aem.mcm.campaign.publicUrl' => aem_mcm_campaign_public_url, 'aem.mcm.campaign.relaxedSSL' => aem_mcm_campaign_relaxed_ssl }
        )
      end
    end
  end
end
