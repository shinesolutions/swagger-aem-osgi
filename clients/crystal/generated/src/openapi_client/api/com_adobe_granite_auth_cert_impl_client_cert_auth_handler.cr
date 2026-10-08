require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthCertImplClientCertAuthHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, path : String? = nil, service_ranking : Int32? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.cert.impl.ClientCertAuthHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "path" => path, "service.ranking" => service_ranking },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
