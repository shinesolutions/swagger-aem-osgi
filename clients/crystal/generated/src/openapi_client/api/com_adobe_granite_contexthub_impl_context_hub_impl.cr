require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteContexthubImplContextHubImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, com_adobe_granite_contexthub_silent_mode : Bool? = nil, com_adobe_granite_contexthub_show_ui : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteContexthubImplContextHubImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteContexthubImplContextHubImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.contexthub.impl.ContextHubImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "com.adobe.granite.contexthub.silent_mode" => com_adobe_granite_contexthub_silent_mode, "com.adobe.granite.contexthub.show_ui" => com_adobe_granite_contexthub_show_ui },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
