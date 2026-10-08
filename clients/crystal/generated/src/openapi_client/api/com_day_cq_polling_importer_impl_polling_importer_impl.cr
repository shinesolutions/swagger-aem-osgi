require "json"

module OpenAPIClient
  module Api
  class ComDayCqPollingImporterImplPollingImporterImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, importer_min_interval : Int32? = nil, importer_user : String? = nil, exclude_paths : Array(String)? = nil, include_paths : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqPollingImporterImplPollingImporterImplInfo)
      @conn.request(OpenAPIClient::ComDayCqPollingImporterImplPollingImporterImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.polling.importer.impl.PollingImporterImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "importer.min.interval" => importer_min_interval, "importer.user" => importer_user, "exclude.paths" => exclude_paths, "include.paths" => include_paths },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
