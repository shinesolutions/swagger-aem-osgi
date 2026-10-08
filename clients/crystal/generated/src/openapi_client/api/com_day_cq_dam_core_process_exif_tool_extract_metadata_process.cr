require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreProcessExifToolExtractMetadataProcess
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, process_label : String? = nil, cq_dam_enable_sha1 : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.process.ExifToolExtractMetadataProcess",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "process.label" => process_label, "cq.dam.enable.sha1" => cq_dam_enable_sha1 },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
