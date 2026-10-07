require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialEnablementServicesImplAuthorMarkerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, service_ranking : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.enablement.services.impl.AuthorMarkerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "service.ranking" => service_ranking },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
