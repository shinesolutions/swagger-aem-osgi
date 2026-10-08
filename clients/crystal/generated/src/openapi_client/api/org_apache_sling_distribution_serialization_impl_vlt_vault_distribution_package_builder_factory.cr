require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, _type : String? = nil, import_mode : String? = nil, acl_handling : String? = nil, package_roots : String? = nil, package_filters : Array(String)? = nil, property_filters : Array(String)? = nil, temp_fs_folder : String? = nil, use_binary_references : Bool? = nil, auto_save_threshold : Int32? = nil, cleanup_delay : Int32? = nil, file_threshold : Int32? = nil, mega_bytes : String? = nil, use_off_heap_memory : Bool? = nil, digest_algorithm : String? = nil, monitoring_queue_size : Int32? = nil, paths_mapping : Array(String)? = nil, strict_import : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.serialization.impl.vlt.VaultDistributionPackageBuilderFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "type" => _type, "importMode" => import_mode, "aclHandling" => acl_handling, "package.roots" => package_roots, "package.filters" => package_filters, "property.filters" => property_filters, "tempFsFolder" => temp_fs_folder, "useBinaryReferences" => use_binary_references, "autoSaveThreshold" => auto_save_threshold, "cleanupDelay" => cleanup_delay, "fileThreshold" => file_threshold, "MEGA_BYTES" => mega_bytes, "useOffHeapMemory" => use_off_heap_memory, "digestAlgorithm" => digest_algorithm, "monitoringQueueSize" => monitoring_queue_size, "pathsMapping" => paths_mapping, "strictImport" => strict_import },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
