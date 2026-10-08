require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, granite_maintenance_mandatory : Bool? = nil, job_topics : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.DataStoreGarbageCollectionTask",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "granite.maintenance.mandatory" => granite_maintenance_mandatory, "job.topics" => job_topics },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
