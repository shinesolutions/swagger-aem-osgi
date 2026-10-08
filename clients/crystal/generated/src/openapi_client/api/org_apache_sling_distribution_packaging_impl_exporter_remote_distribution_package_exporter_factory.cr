require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributionPackageExporterFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, endpoints : Array(String)? = nil, pull_items : Int32? = nil, package_builder_target : String? = nil, transport_secret_provider_target : String? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.RemoteDistributionPackageExporterFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "endpoints" => endpoints, "pull.items" => pull_items, "packageBuilder.target" => package_builder_target, "transportSecretProvider.target" => transport_secret_provider_target },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
