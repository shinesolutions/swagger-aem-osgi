require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDamMacSyncImplDAMSyncServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths : Array(String)? = nil, com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions : Bool? = nil, com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms : Int32? = nil, com_adobe_cq_dam_mac_sync_damsyncservice_platform : String? = nil) : Response(OpenAPIClient::ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dam.mac.sync.impl.DAMSyncServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths" => com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths, "com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions" => com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions, "com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms" => com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms, "com.adobe.cq.dam.mac.sync.damsyncservice.platform" => com_adobe_cq_dam_mac_sync_damsyncservice_platform },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
