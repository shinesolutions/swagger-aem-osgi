require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplServletBatchMetadataServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_batch_metadata_asset_default : Array(String)? = nil, cq_dam_batch_metadata_collection_default : Array(String)? = nil, cq_dam_batch_metadata_maxresources : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplServletBatchMetadataServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplServletBatchMetadataServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.BatchMetadataServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.batch.metadata.asset.default" => cq_dam_batch_metadata_asset_default, "cq.dam.batch.metadata.collection.default" => cq_dam_batch_metadata_collection_default, "cq.dam.batch.metadata.maxresources" => cq_dam_batch_metadata_maxresources },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
