require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDistributionPackagingImplExporterLocalDistributionPackageExporterFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, package_builder_target : String? = nil) : Response(OpenAPIClient::OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.LocalDistributionPackageExporterFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "packageBuilder.target" => package_builder_target },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
