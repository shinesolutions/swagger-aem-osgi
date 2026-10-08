require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sling_servlet_extensions : String? = nil, sling_servlet_paths : String? = nil, sling_servlet_methods : String? = nil) : Response(OpenAPIClient::ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.user.endpoints.impl.UsersGroupFromPublishServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "sling.servlet.extensions" => sling_servlet_extensions, "sling.servlet.paths" => sling_servlet_paths, "sling.servlet.methods" => sling_servlet_methods },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
