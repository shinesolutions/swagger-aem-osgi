require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, port : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.RmiRegistrationSupport",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "port" => port },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
