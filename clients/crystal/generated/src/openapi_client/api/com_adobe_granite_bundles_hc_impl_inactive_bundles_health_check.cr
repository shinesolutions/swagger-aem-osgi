require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, hc_tags : Array(String)? = nil, ignored_bundles : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.InactiveBundlesHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "hc.tags" => hc_tags, "ignored.bundles" => ignored_bundles },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
