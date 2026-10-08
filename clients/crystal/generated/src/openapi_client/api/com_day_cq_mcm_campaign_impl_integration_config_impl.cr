require "json"

module OpenAPIClient
  module Api
  class ComDayCqMcmCampaignImplIntegrationConfigImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, aem_mcm_campaign_form_constraints : Array(String)? = nil, aem_mcm_campaign_public_url : String? = nil, aem_mcm_campaign_relaxed_ssl : Bool? = nil) : Response(OpenAPIClient::ComDayCqMcmCampaignImplIntegrationConfigImplInfo)
      @conn.request(OpenAPIClient::ComDayCqMcmCampaignImplIntegrationConfigImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.mcm.campaign.impl.IntegrationConfigImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "aem.mcm.campaign.formConstraints" => aem_mcm_campaign_form_constraints, "aem.mcm.campaign.publicUrl" => aem_mcm_campaign_public_url, "aem.mcm.campaign.relaxedSSL" => aem_mcm_campaign_relaxed_ssl },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
