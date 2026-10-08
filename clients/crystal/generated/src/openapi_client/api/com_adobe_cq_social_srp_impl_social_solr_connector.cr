require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialSrpImplSocialSolrConnector
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, srp_type : String? = nil) : Response(OpenAPIClient::ComAdobeCqSocialSrpImplSocialSolrConnectorInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialSrpImplSocialSolrConnectorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.srp.impl.SocialSolrConnector",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "srp.type" => srp_type },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
