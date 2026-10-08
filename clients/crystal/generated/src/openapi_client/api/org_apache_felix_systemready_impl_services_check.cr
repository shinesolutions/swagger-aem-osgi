require "json"

module OpenAPIClient
  module Api
  class OrgApacheFelixSystemreadyImplServicesCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, services_list : Array(String)? = nil, _type : String? = nil) : Response(OpenAPIClient::OrgApacheFelixSystemreadyImplServicesCheckInfo)
      @conn.request(OpenAPIClient::OrgApacheFelixSystemreadyImplServicesCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.felix.systemready.impl.ServicesCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "services.list" => services_list, "type" => _type },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
