require "json"

module OpenAPIClient
  module Api
  class ComDayCqReplicationImplTransportHttp
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, disabled_cipher_suites : Array(String)? = nil, enabled_cipher_suites : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqReplicationImplTransportHttpInfo)
      @conn.request(OpenAPIClient::ComDayCqReplicationImplTransportHttpInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.replication.impl.transport.Http",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "disabled.cipher.suites" => disabled_cipher_suites, "enabled.cipher.suites" => enabled_cipher_suites },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
