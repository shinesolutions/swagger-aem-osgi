require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_social_console_analytics_components : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.site.impl.AnalyticsComponentConfigurationServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.social.console.analytics.components" => cq_social_console_analytics_components },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
