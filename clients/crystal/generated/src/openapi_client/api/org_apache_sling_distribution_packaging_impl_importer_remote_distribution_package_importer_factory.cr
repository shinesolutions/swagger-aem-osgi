require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributionPackageImporterFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, endpoints : Array(String)? = nil, transport_secret_provider_target : String? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RemoteDistributionPackageImporterFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "endpoints" => endpoints, "transportSecretProvider.target" => transport_secret_provider_target },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
