require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialSyncImplUserSyncListenerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, nodetypes : Array(String)? = nil, ignorableprops : Array(String)? = nil, ignorablenodes : Array(String)? = nil, enabled : Bool? = nil, distfolders : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqSocialSyncImplUserSyncListenerImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialSyncImplUserSyncListenerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.sync.impl.UserSyncListenerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "nodetypes" => nodetypes, "ignorableprops" => ignorableprops, "ignorablenodes" => ignorablenodes, "enabled" => enabled, "distfolders" => distfolders },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
