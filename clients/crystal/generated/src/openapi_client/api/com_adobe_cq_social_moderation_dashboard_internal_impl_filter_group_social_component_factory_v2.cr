require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSocialComponentFactoryV2
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, resource_type_filters : Array(String)? = nil, priority : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.internal.impl.FilterGroupSocialComponentFactoryV2",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "resourceType.filters" => resource_type_filters, "priority" => priority },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
