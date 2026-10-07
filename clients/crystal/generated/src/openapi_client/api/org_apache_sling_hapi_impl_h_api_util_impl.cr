require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingHapiImplHApiUtilImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, org_apache_sling_hapi_tools_resourcetype : String? = nil, org_apache_sling_hapi_tools_collectionresourcetype : String? = nil, org_apache_sling_hapi_tools_searchpaths : Array(String)? = nil, org_apache_sling_hapi_tools_externalurl : String? = nil, org_apache_sling_hapi_tools_enabled : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingHapiImplHApiUtilImplInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingHapiImplHApiUtilImplInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.hapi.impl.HApiUtilImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "org.apache.sling.hapi.tools.resourcetype" => org_apache_sling_hapi_tools_resourcetype, "org.apache.sling.hapi.tools.collectionresourcetype" => org_apache_sling_hapi_tools_collectionresourcetype, "org.apache.sling.hapi.tools.searchpaths" => org_apache_sling_hapi_tools_searchpaths, "org.apache.sling.hapi.tools.externalurl" => org_apache_sling_hapi_tools_externalurl, "org.apache.sling.hapi.tools.enabled" => org_apache_sling_hapi_tools_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
