require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, hc_tags : Array(String)? = nil, disk_space_warn_threshold : Int32? = nil, disk_space_error_threshold : Int32? = nil) : Response(OpenAPIClient::ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.repository.hc.impl.DiskSpaceHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "hc.tags" => hc_tags, "disk.space.warn.threshold" => disk_space_warn_threshold, "disk.space.error.threshold" => disk_space_error_threshold },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
