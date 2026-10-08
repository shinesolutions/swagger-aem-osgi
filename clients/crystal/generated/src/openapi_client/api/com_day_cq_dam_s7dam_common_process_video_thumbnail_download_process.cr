require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, process_label : String? = nil) : Response(OpenAPIClient::ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo)
      @conn.request(OpenAPIClient::ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.s7dam.common.process.VideoThumbnailDownloadProcess",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "process.label" => process_label },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
