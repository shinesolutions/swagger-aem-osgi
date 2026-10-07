require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthIms
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, configid : String? = nil, scope : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthImsInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthImsInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.ims",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "configid" => configid, "scope" => scope },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
