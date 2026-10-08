require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteDistributionCoreImplDiffDiffEventListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, diff_path : String? = nil, service_name : String? = nil, service_user_target : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffEventListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "diffPath" => diff_path, "serviceName" => service_name, "serviceUser.target" => service_user_target },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
