require "json"

module OpenAPIClient
  module Api
  class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageConfigurator
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, felix_memoryusage_dump_threshold : Int32? = nil, felix_memoryusage_dump_interval : Int32? = nil, felix_memoryusage_dump_location : String? = nil) : Response(OpenAPIClient::OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo)
      @conn.request(OpenAPIClient::OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.felix.webconsole.plugins.memoryusage.internal.MemoryUsageConfigurator",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "felix.memoryusage.dump.threshold" => felix_memoryusage_dump_threshold, "felix.memoryusage.dump.interval" => felix_memoryusage_dump_interval, "felix.memoryusage.dump.location" => felix_memoryusage_dump_location },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
