require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sling_servlet_selectors : Array(String)? = nil, sling_servlet_extensions : String? = nil) : Response(OpenAPIClient::ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.scf.endpoints.impl.DefaultSocialGetServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "sling.servlet.selectors" => sling_servlet_selectors, "sling.servlet.extensions" => sling_servlet_extensions },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
