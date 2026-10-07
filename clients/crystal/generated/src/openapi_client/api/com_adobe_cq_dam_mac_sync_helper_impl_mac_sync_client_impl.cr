require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDamMacSyncHelperImplMACSyncClientImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, com_adobe_dam_mac_sync_client_so_timeout : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dam.mac.sync.helper.impl.MACSyncClientImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "com.adobe.dam.mac.sync.client.so.timeout" => com_adobe_dam_mac_sync_client_so_timeout },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
