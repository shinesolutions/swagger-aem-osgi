require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, event_filter : String? = nil, fontmgr_system_font_dir : Array(String)? = nil, fontmgr_adobe_font_dir : String? = nil, fontmgr_customer_font_dir : String? = nil) : Response(OpenAPIClient::ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.handler.gibson.fontmanager.impl.FontManagerServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "event.filter" => event_filter, "fontmgr.system.font.dir" => fontmgr_system_font_dir, "fontmgr.adobe.font.dir" => fontmgr_adobe_font_dir, "fontmgr.customer.font.dir" => fontmgr_customer_font_dir },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
