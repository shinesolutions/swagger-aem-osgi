require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteI18nImplBundlePseudoTranslations
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, pseudo_patterns : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.i18n.impl.bundle.PseudoTranslations",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "pseudo.patterns" => pseudo_patterns },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
