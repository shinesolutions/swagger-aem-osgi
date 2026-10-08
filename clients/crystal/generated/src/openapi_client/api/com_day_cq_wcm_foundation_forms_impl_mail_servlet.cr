require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmFoundationFormsImplMailServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sling_servlet_resource_types : String? = nil, sling_servlet_selectors : String? = nil, resource_whitelist : Array(String)? = nil, resource_blacklist : String? = nil) : Response(OpenAPIClient::ComDayCqWcmFoundationFormsImplMailServletInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmFoundationFormsImplMailServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.MailServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "sling.servlet.resourceTypes" => sling_servlet_resource_types, "sling.servlet.selectors" => sling_servlet_selectors, "resource.whitelist" => resource_whitelist, "resource.blacklist" => resource_blacklist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
