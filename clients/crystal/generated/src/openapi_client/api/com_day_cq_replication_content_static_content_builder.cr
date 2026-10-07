require "json"

module OpenAPIClient
  module Api
  class ComDayCqReplicationContentStaticContentBuilder
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, host : String? = nil, port : Int32? = nil) : Response(OpenAPIClient::ComDayCqReplicationContentStaticContentBuilderInfo)
      @conn.request(OpenAPIClient::ComDayCqReplicationContentStaticContentBuilderInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.replication.content.StaticContentBuilder",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "host" => host, "port" => port },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
