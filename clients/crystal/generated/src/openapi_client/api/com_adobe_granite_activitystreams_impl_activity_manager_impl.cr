require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteActivitystreamsImplActivityManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, aggregate_relationships : Array(String)? = nil, aggregate_descend_virtual : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.activitystreams.impl.ActivityManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "aggregate.relationships" => aggregate_relationships, "aggregate.descend.virtual" => aggregate_descend_virtual },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
