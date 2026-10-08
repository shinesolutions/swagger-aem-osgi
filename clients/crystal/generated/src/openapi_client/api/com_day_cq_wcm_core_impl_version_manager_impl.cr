require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplVersionManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, versionmanager_create_version_on_activation : Bool? = nil, versionmanager_purging_enabled : Bool? = nil, versionmanager_purge_paths : Array(String)? = nil, versionmanager_iv_paths : Array(String)? = nil, versionmanager_max_age_days : Int32? = nil, versionmanager_max_number_versions : Int32? = nil, versionmanager_min_number_versions : Int32? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplVersionManagerImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplVersionManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.VersionManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "versionmanager.createVersionOnActivation" => versionmanager_create_version_on_activation, "versionmanager.purgingEnabled" => versionmanager_purging_enabled, "versionmanager.purgePaths" => versionmanager_purge_paths, "versionmanager.ivPaths" => versionmanager_iv_paths, "versionmanager.maxAgeDays" => versionmanager_max_age_days, "versionmanager.maxNumberVersions" => versionmanager_max_number_versions, "versionmanager.minNumberVersions" => versionmanager_min_number_versions },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
