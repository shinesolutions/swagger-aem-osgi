require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, provider_type : String? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.metric.StatisticsProviderFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "providerType" => provider_type },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
