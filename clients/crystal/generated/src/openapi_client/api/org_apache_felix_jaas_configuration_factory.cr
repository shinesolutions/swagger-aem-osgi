require "json"

module OpenAPIClient
  module Api
  class OrgApacheFelixJaasConfigurationFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, jaas_control_flag : String? = nil, jaas_ranking : Int32? = nil, jaas_realm_name : String? = nil, jaas_classname : String? = nil, jaas_options : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheFelixJaasConfigurationFactoryInfo)
      @conn.request(OpenAPIClient::OrgApacheFelixJaasConfigurationFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.felix.jaas.Configuration.factory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "jaas.controlFlag" => jaas_control_flag, "jaas.ranking" => jaas_ranking, "jaas.realmName" => jaas_realm_name, "jaas.classname" => jaas_classname, "jaas.options" => jaas_options },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
