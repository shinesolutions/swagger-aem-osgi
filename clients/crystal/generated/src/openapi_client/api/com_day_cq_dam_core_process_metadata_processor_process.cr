require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreProcessMetadataProcessorProcess
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, process_label : String? = nil, cq_dam_enable_sha1 : Bool? = nil, cq_dam_metadata_xssprotected_properties : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqDamCoreProcessMetadataProcessorProcessInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreProcessMetadataProcessorProcessInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.process.MetadataProcessorProcess",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "process.label" => process_label, "cq.dam.enable.sha1" => cq_dam_enable_sha1, "cq.dam.metadata.xssprotected.properties" => cq_dam_metadata_xssprotected_properties },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
