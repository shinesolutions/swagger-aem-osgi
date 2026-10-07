require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqHcContentPackagesHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, hc_name : String? = nil, hc_tags : Array(String)? = nil, hc_mbean_name : String? = nil, package_names : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqHcContentPackagesHealthCheckInfo)
      @conn.request(OpenAPIClient::ComAdobeCqHcContentPackagesHealthCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.hc.ContentPackagesHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "hc.name" => hc_name, "hc.tags" => hc_tags, "hc.mbean.name" => hc_mbean_name, "package.names" => package_names },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
