require "json"

module OpenAPIClient
  module Api
  class OrgApacheFelixSystemreadyImplComponentsCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, components_list : Array(String)? = nil, _type : String? = nil) : Response(OpenAPIClient::OrgApacheFelixSystemreadyImplComponentsCheckInfo)
      @conn.request(OpenAPIClient::OrgApacheFelixSystemreadyImplComponentsCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.felix.systemready.impl.ComponentsCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "components.list" => components_list, "type" => _type },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
