require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteTranslationCoreImplTranslationManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, default_connector_name : String? = nil, default_category : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.translation.core.impl.TranslationManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "defaultConnectorName" => default_connector_name, "defaultCategory" => default_category },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
