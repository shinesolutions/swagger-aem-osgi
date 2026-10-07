require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, auth_ims_client_secret : String? = nil, customizer_type : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSAccessTokenRequestCustomizerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "auth.ims.client.secret" => auth_ims_client_secret, "customizer.type" => customizer_type },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
