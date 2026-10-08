require "json"

module OpenAPIClient
  module Api
  class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, communities_integration_livefyre_sling_event_filter : String? = nil) : Response(OpenAPIClient::ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo)
      @conn.request(OpenAPIClient::ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.social.integrations.livefyre.user.pingforpull.impl.PingPullServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "communities.integration.livefyre.sling.event.filter" => communities_integration_livefyre_sling_event_filter },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
