require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplMetadataEditorSelectComponentHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, granite_data : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.metadata.editor.SelectComponentHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "granite:data" => granite_data },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
