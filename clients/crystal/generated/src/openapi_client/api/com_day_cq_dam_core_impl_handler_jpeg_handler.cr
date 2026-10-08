require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplHandlerJpegHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_enable_ext_meta_extraction : Bool? = nil, large_file_threshold : Int32? = nil, large_comment_threshold : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplHandlerJpegHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplHandlerJpegHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.handler.JpegHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.enable.ext.meta.extraction" => cq_dam_enable_ext_meta_extraction, "large_file_threshold" => large_file_threshold, "large_comment_threshold" => large_comment_threshold },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
