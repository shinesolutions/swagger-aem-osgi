require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialSyncImplGroupSyncListenerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, nodetypes : Array(String)? = nil, ignorableprops : Array(String)? = nil, ignorablenodes : String? = nil, enabled : Bool? = nil, distfolders : String? = nil) : Response(OpenAPIClient::ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.sync.impl.GroupSyncListenerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "nodetypes" => nodetypes, "ignorableprops" => ignorableprops, "ignorablenodes" => ignorablenodes, "enabled" => enabled, "distfolders" => distfolders },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
