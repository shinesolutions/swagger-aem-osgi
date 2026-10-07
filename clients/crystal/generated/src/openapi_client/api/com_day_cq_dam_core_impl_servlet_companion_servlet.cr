require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplServletCompanionServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, more_info : String? = nil, _mnt_overlay_dam_gui_content_assets_moreinfo_html_path : String? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplServletCompanionServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplServletCompanionServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CompanionServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "More Info" => more_info, "/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}" => _mnt_overlay_dam_gui_content_assets_moreinfo_html_path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
