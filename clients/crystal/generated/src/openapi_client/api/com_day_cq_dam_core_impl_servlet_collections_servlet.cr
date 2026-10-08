require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplServletCollectionsServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_batch_collections_properties : Array(String)? = nil, cq_dam_batch_collections_limit : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplServletCollectionsServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplServletCollectionsServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionsServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.batch.collections.properties" => cq_dam_batch_collections_properties, "cq.dam.batch.collections.limit" => cq_dam_batch_collections_limit },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
