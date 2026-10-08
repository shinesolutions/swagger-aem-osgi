require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enable : Bool? = nil, ttl1 : Int32? = nil, ttl2 : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.accountverification.impl.AccountManagementConfigImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enable" => enable, "ttl1" => ttl1, "ttl2" => ttl2 },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
