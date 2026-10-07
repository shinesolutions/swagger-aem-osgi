require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteFragsImplRandomFeature
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, feature_name : String? = nil, feature_description : String? = nil, active_percentage : String? = nil, cookie_name : String? = nil, cookie_max_age : Int32? = nil) : Response(OpenAPIClient::ComAdobeGraniteFragsImplRandomFeatureInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteFragsImplRandomFeatureInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.frags.impl.RandomFeature",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "feature.name" => feature_name, "feature.description" => feature_description, "active.percentage" => active_percentage, "cookie.name" => cookie_name, "cookie.maxAge" => cookie_max_age },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
