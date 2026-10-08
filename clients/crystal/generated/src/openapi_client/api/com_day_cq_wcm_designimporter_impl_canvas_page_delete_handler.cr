require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, min_thread_pool_size : Int32? = nil, max_thread_pool_size : Int32? = nil) : Response(OpenAPIClient::ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasPageDeleteHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "minThreadPoolSize" => min_thread_pool_size, "maxThreadPoolSize" => max_thread_pool_size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
