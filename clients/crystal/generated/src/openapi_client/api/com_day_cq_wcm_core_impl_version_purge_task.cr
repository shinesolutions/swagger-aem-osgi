require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplVersionPurgeTask
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, versionpurge_paths : Array(String)? = nil, versionpurge_recursive : Bool? = nil, versionpurge_max_versions : Int32? = nil, versionpurge_min_versions : Int32? = nil, versionpurge_max_age_days : Int32? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplVersionPurgeTaskInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplVersionPurgeTaskInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.VersionPurgeTask",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "versionpurge.paths" => versionpurge_paths, "versionpurge.recursive" => versionpurge_recursive, "versionpurge.maxVersions" => versionpurge_max_versions, "versionpurge.minVersions" => versionpurge_min_versions, "versionpurge.maxAgeDays" => versionpurge_max_age_days },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
