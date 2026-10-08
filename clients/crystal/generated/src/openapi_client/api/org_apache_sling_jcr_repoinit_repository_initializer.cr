require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingJcrRepoinitRepositoryInitializer
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, references : Array(String)? = nil, scripts : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingJcrRepoinitRepositoryInitializerInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingJcrRepoinitRepositoryInitializerInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.jcr.repoinit.RepositoryInitializer",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "references" => references, "scripts" => scripts },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
