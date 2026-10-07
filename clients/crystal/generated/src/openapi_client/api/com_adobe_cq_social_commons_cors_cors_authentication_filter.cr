require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cors_enabling : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.commons.cors.CORSAuthenticationFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cors.enabling" => cors_enabling },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
