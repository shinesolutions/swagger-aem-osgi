require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, htmllibmanager_timing : Bool? = nil, htmllibmanager_debug_init_js : String? = nil, htmllibmanager_minify : Bool? = nil, htmllibmanager_debug : Bool? = nil, htmllibmanager_gzip : Bool? = nil, htmllibmanager_max_data_uri_size : Int32? = nil, htmllibmanager_maxage : Int32? = nil, htmllibmanager_force_cq_url_info : Bool? = nil, htmllibmanager_defaultthemename : String? = nil, htmllibmanager_defaultuserthemename : String? = nil, htmllibmanager_clientmanager : String? = nil, htmllibmanager_path_list : Array(String)? = nil, htmllibmanager_excluded_path_list : Array(String)? = nil, htmllibmanager_processor_js : Array(String)? = nil, htmllibmanager_processor_css : Array(String)? = nil, htmllibmanager_longcache_patterns : Array(String)? = nil, htmllibmanager_longcache_format : String? = nil, htmllibmanager_use_file_system_output_cache : Bool? = nil, htmllibmanager_file_system_output_cache_location : String? = nil, htmllibmanager_disable_replacement : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.ui.clientlibs.impl.HtmlLibraryManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "htmllibmanager.timing" => htmllibmanager_timing, "htmllibmanager.debug.init.js" => htmllibmanager_debug_init_js, "htmllibmanager.minify" => htmllibmanager_minify, "htmllibmanager.debug" => htmllibmanager_debug, "htmllibmanager.gzip" => htmllibmanager_gzip, "htmllibmanager.maxDataUriSize" => htmllibmanager_max_data_uri_size, "htmllibmanager.maxage" => htmllibmanager_maxage, "htmllibmanager.forceCQUrlInfo" => htmllibmanager_force_cq_url_info, "htmllibmanager.defaultthemename" => htmllibmanager_defaultthemename, "htmllibmanager.defaultuserthemename" => htmllibmanager_defaultuserthemename, "htmllibmanager.clientmanager" => htmllibmanager_clientmanager, "htmllibmanager.path.list" => htmllibmanager_path_list, "htmllibmanager.excluded.path.list" => htmllibmanager_excluded_path_list, "htmllibmanager.processor.js" => htmllibmanager_processor_js, "htmllibmanager.processor.css" => htmllibmanager_processor_css, "htmllibmanager.longcache.patterns" => htmllibmanager_longcache_patterns, "htmllibmanager.longcache.format" => htmllibmanager_longcache_format, "htmllibmanager.useFileSystemOutputCache" => htmllibmanager_use_file_system_output_cache, "htmllibmanager.fileSystemOutputCacheLocation" => htmllibmanager_file_system_output_cache_location, "htmllibmanager.disable.replacement" => htmllibmanager_disable_replacement },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
