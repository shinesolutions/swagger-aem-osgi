require "json"

module OpenAPIClient
  module Api
  class ComDayCqPollingImporterImplManagedPollingImporterImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, importer_user : String? = nil) : Response(OpenAPIClient::ComDayCqPollingImporterImplManagedPollingImporterImplInfo)
      @conn.request(OpenAPIClient::ComDayCqPollingImporterImplManagedPollingImporterImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollingImporterImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "importer.user" => importer_user },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
