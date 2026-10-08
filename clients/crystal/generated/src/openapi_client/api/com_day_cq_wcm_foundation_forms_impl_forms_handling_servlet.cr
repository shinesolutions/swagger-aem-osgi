require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmFoundationFormsImplFormsHandlingServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name_whitelist : String? = nil, allow_expressions : Bool? = nil) : Response(OpenAPIClient::ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormsHandlingServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name.whitelist" => name_whitelist, "allow.expressions" => allow_expressions },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
