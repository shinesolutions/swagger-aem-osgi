require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDatasourceJNDIDataSourceFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, datasource_name : String? = nil, datasource_svc_prop_name : String? = nil, datasource_jndi_name : String? = nil, jndi_properties : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.datasource.JNDIDataSourceFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "datasource.name" => datasource_name, "datasource.svc.prop.name" => datasource_svc_prop_name, "datasource.jndi.name" => datasource_jndi_name, "jndi.properties" => jndi_properties },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
