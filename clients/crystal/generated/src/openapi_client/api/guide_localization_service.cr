require "json"

module OpenAPIClient
  module Api
  class GuideLocalizationService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, supported_locales : Array(String)? = nil, localizable_properties : Array(String)? = nil) : Response(OpenAPIClient::GuideLocalizationServiceInfo)
      @conn.request(OpenAPIClient::GuideLocalizationServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/Guide Localization Service",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "supportedLocales" => supported_locales, "Localizable Properties" => localizable_properties },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
