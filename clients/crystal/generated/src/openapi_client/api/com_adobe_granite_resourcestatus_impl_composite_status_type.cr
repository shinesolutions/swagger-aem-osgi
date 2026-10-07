require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteResourcestatusImplCompositeStatusType
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, types : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.resourcestatus.impl.CompositeStatusType",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "types" => types },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
