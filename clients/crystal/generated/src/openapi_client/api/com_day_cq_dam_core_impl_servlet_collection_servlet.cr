require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplServletCollectionServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_batch_collection_properties : Array(String)? = nil, cq_dam_batch_collection_maxcollections : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplServletCollectionServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplServletCollectionServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.batch.collection.properties" => cq_dam_batch_collection_properties, "cq.dam.batch.collection.maxcollections" => cq_dam_batch_collection_maxcollections },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
