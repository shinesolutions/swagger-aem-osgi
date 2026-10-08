require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, create_preview_enabled : Bool? = nil, update_preview_enabled : Bool? = nil, queue_size : Int32? = nil, folder_preview_rendition_regex : String? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.ui.preview.FolderPreviewUpdaterImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "createPreviewEnabled" => create_preview_enabled, "updatePreviewEnabled" => update_preview_enabled, "queueSize" => queue_size, "folderPreviewRenditionRegex" => folder_preview_rendition_regex },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
