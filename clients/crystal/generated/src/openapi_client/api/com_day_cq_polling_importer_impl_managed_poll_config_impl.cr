require "json"

module OpenAPIClient
  module Api
  class ComDayCqPollingImporterImplManagedPollConfigImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, id : String? = nil, enabled : Bool? = nil, reference : Bool? = nil, interval : Int32? = nil, expression : String? = nil, source : String? = nil, target : String? = nil, login : String? = nil, password : String? = nil) : Response(OpenAPIClient::ComDayCqPollingImporterImplManagedPollConfigImplInfo)
      @conn.request(OpenAPIClient::ComDayCqPollingImporterImplManagedPollConfigImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollConfigImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "id" => id, "enabled" => enabled, "reference" => reference, "interval" => interval, "expression" => expression, "source" => source, "target" => target, "login" => login, "password" => password },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
