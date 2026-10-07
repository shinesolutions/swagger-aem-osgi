require "json"

module OpenAPIClient
  module Api
  class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfiguration
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, font_list : Array(String)? = nil) : Response(OpenAPIClient::AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo)
      @conn.request(OpenAPIClient::AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo,
        method: :POST,
        path: "/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Theme Configuration",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "fontList" => font_list },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
