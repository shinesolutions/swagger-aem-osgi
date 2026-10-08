require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, pool_size : Int32? = nil, max_pool_size : Int32? = nil, queue_size : Int32? = nil, keep_alive_time : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.AysncReverseReplicatorImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "poolSize" => pool_size, "maxPoolSize" => max_pool_size, "queueSize" => queue_size, "keepAliveTime" => keep_alive_time },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
