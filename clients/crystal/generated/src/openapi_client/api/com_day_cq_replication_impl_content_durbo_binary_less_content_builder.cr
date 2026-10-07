require "json"

module OpenAPIClient
  module Api
  class ComDayCqReplicationImplContentDurboBinaryLessContentBuilder
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, binary_threshold : Int32? = nil) : Response(OpenAPIClient::ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo)
      @conn.request(OpenAPIClient::ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.replication.impl.content.durbo.BinaryLessContentBuilder",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "binary.threshold" => binary_threshold },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
