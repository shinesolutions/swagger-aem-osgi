require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCommonsHandlerStandardImageHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, large_file_threshold : Int32? = nil, large_comment_threshold : Int32? = nil, cq_dam_enable_ext_meta_extraction : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCommonsHandlerStandardImageHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCommonsHandlerStandardImageHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.commons.handler.StandardImageHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "large_file_threshold" => large_file_threshold, "large_comment_threshold" => large_comment_threshold, "cq.dam.enable.ext.meta.extraction" => cq_dam_enable_ext_meta_extraction },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
