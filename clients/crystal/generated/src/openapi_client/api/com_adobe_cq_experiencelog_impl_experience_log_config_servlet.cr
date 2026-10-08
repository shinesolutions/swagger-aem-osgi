require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqExperiencelogImplExperienceLogConfigServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enabled : Bool? = nil, disabled_for_groups : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo)
      @conn.request(OpenAPIClient::ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.experiencelog.impl.ExperienceLogConfigServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enabled" => enabled, "disabledForGroups" => disabled_for_groups },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
