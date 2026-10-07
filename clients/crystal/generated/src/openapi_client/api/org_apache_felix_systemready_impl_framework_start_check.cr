require "json"

module OpenAPIClient
  module Api
  class OrgApacheFelixSystemreadyImplFrameworkStartCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, timeout : Int32? = nil, target_start_level : Int32? = nil, target_start_level_prop_name : String? = nil, _type : String? = nil) : Response(OpenAPIClient::OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo)
      @conn.request(OpenAPIClient::OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.felix.systemready.impl.FrameworkStartCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "timeout" => timeout, "target.start.level" => target_start_level, "target.start.level.prop.name" => target_start_level_prop_name, "type" => _type },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
