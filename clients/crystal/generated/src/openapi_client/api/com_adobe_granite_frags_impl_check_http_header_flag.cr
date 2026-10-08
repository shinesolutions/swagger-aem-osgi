require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteFragsImplCheckHttpHeaderFlag
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, feature_name : String? = nil, feature_description : String? = nil, http_header_name : String? = nil, http_header_valuepattern : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.frags.impl.CheckHttpHeaderFlag",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "feature.name" => feature_name, "feature.description" => feature_description, "http.header.name" => http_header_name, "http.header.valuepattern" => http_header_valuepattern },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
