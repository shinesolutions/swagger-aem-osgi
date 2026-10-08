require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, batch_commit_size : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceDataHandlerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "batch.commit.size" => batch_commit_size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
