require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitor
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, jmx_objectname : String? = nil, property_measure_enabled : Bool? = nil, property_name : String? = nil, property_max_wait_ms : Int32? = nil, property_max_rate : Float64? = nil, fulltext_measure_enabled : Bool? = nil, fulltext_name : String? = nil, fulltext_max_wait_ms : Int32? = nil, fulltext_max_rate : Float64? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetIndexUpdateMonitor",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "jmx.objectname" => jmx_objectname, "property.measure.enabled" => property_measure_enabled, "property.name" => property_name, "property.max.wait.ms" => property_max_wait_ms, "property.max.rate" => property_max_rate, "fulltext.measure.enabled" => fulltext_measure_enabled, "fulltext.name" => fulltext_name, "fulltext.max.wait.ms" => fulltext_max_wait_ms, "fulltext.max.rate" => fulltext_max_rate },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
