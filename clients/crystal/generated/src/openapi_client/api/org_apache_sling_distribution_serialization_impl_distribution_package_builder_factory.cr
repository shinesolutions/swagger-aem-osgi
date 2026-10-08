require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionSerializationImplDistributionPackageBuilderFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, _type : String? = nil, format_target : String? = nil, temp_fs_folder : String? = nil, file_threshold : Int32? = nil, memory_unit : String? = nil, use_off_heap_memory : Bool? = nil, digest_algorithm : String? = nil, monitoring_queue_size : Int32? = nil, cleanup_delay : Int32? = nil, package_filters : Array(String)? = nil, property_filters : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.serialization.impl.DistributionPackageBuilderFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "type" => _type, "format.target" => format_target, "tempFsFolder" => temp_fs_folder, "fileThreshold" => file_threshold, "memoryUnit" => memory_unit, "useOffHeapMemory" => use_off_heap_memory, "digestAlgorithm" => digest_algorithm, "monitoringQueueSize" => monitoring_queue_size, "cleanupDelay" => cleanup_delay, "package.filters" => package_filters, "property.filters" => property_filters },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
