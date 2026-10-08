require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingEventImplEventingThreadPool
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, min_pool_size : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingEventImplEventingThreadPoolInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingEventImplEventingThreadPoolInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.event.impl.EventingThreadPool",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "minPoolSize" => min_pool_size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
