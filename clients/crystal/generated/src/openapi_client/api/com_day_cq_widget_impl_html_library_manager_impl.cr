require "json"

module OpenAPIClient
  module Api
  class ComDayCqWidgetImplHtmlLibraryManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, htmllibmanager_clientmanager : String? = nil, htmllibmanager_debug : Bool? = nil, htmllibmanager_debug_console : Bool? = nil, htmllibmanager_debug_init_js : String? = nil, htmllibmanager_defaultthemename : String? = nil, htmllibmanager_defaultuserthemename : String? = nil, htmllibmanager_firebuglite_path : String? = nil, htmllibmanager_force_cq_url_info : Bool? = nil, htmllibmanager_gzip : Bool? = nil, htmllibmanager_maxage : Int32? = nil, htmllibmanager_max_data_uri_size : Int32? = nil, htmllibmanager_minify : Bool? = nil, htmllibmanager_path_list : Array(String)? = nil, htmllibmanager_timing : Bool? = nil) : Response(OpenAPIClient::ComDayCqWidgetImplHtmlLibraryManagerImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWidgetImplHtmlLibraryManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.widget.impl.HtmlLibraryManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "htmllibmanager.clientmanager" => htmllibmanager_clientmanager, "htmllibmanager.debug" => htmllibmanager_debug, "htmllibmanager.debug.console" => htmllibmanager_debug_console, "htmllibmanager.debug.init.js" => htmllibmanager_debug_init_js, "htmllibmanager.defaultthemename" => htmllibmanager_defaultthemename, "htmllibmanager.defaultuserthemename" => htmllibmanager_defaultuserthemename, "htmllibmanager.firebuglite.path" => htmllibmanager_firebuglite_path, "htmllibmanager.forceCQUrlInfo" => htmllibmanager_force_cq_url_info, "htmllibmanager.gzip" => htmllibmanager_gzip, "htmllibmanager.maxage" => htmllibmanager_maxage, "htmllibmanager.maxDataUriSize" => htmllibmanager_max_data_uri_size, "htmllibmanager.minify" => htmllibmanager_minify, "htmllibmanager.path.list" => htmllibmanager_path_list, "htmllibmanager.timing" => htmllibmanager_timing },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
