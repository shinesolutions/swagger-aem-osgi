require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteCsrfImplCSRFFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, filter_methods : Array(String)? = nil, filter_enable_safe_user_agents : Bool? = nil, filter_safe_user_agents : Array(String)? = nil, filter_excluded_paths : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteCsrfImplCSRFFilterInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteCsrfImplCSRFFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "filter.methods" => filter_methods, "filter.enable.safe.user.agents" => filter_enable_safe_user_agents, "filter.safe.user.agents" => filter_safe_user_agents, "filter.excluded.paths" => filter_excluded_paths },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
