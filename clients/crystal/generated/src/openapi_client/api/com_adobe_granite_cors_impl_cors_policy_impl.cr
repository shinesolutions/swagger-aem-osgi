require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteCorsImplCORSPolicyImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, alloworigin : Array(String)? = nil, alloworiginregexp : Array(String)? = nil, allowedpaths : Array(String)? = nil, exposedheaders : Array(String)? = nil, maxage : Int32? = nil, supportedheaders : Array(String)? = nil, supportedmethods : Array(String)? = nil, supportscredentials : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteCorsImplCORSPolicyImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteCorsImplCORSPolicyImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.cors.impl.CORSPolicyImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "alloworigin" => alloworigin, "alloworiginregexp" => alloworiginregexp, "allowedpaths" => allowedpaths, "exposedheaders" => exposedheaders, "maxage" => maxage, "supportedheaders" => supportedheaders, "supportedmethods" => supportedmethods, "supportscredentials" => supportscredentials },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
