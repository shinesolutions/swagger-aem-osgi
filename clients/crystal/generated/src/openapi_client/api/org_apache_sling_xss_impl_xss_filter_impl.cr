require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingXssImplXSSFilterImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, policy_path : String? = nil) : Response(OpenAPIClient::OrgApacheSlingXssImplXSSFilterImplInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingXssImplXSSFilterImplInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.xss.impl.XSSFilterImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "policyPath" => policy_path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
