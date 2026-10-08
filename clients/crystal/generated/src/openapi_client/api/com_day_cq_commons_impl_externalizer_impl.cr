require "json"

module OpenAPIClient
  module Api
  class ComDayCqCommonsImplExternalizerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, externalizer_domains : Array(String)? = nil, externalizer_host : String? = nil, externalizer_contextpath : String? = nil, externalizer_encodedpath : Bool? = nil) : Response(OpenAPIClient::ComDayCqCommonsImplExternalizerImplInfo)
      @conn.request(OpenAPIClient::ComDayCqCommonsImplExternalizerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.commons.impl.ExternalizerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "externalizer.domains" => externalizer_domains, "externalizer.host" => externalizer_host, "externalizer.contextpath" => externalizer_contextpath, "externalizer.encodedpath" => externalizer_encodedpath },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
