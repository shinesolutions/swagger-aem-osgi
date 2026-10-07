require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteI18nImplPreferencesLocaleResolverService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, security_preferences_name : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.i18n.impl.PreferencesLocaleResolverService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "security.preferences.name" => security_preferences_name },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
