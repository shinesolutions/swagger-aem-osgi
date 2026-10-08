require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmMobileCoreImplRedirectRedirectFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, redirect_enabled : Bool? = nil, redirect_stats_enabled : Bool? = nil, redirect_extensions : Array(String)? = nil, redirect_paths : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.mobile.core.impl.redirect.RedirectFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "redirect.enabled" => redirect_enabled, "redirect.stats.enabled" => redirect_stats_enabled, "redirect.extensions" => redirect_extensions, "redirect.paths" => redirect_paths },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
