require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteCsrfImplCSRFServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, csrf_token_expires_in : Int32? = nil, sling_auth_requirements : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteCsrfImplCSRFServletInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteCsrfImplCSRFServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "csrf.token.expires.in" => csrf_token_expires_in, "sling.auth.requirements" => sling_auth_requirements },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
