require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistributionPackageImporterFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, service_name : String? = nil, path : String? = nil, privilege_name : String? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RepositoryDistributionPackageImporterFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "service.name" => service_name, "path" => path, "privilege.name" => privilege_name },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
