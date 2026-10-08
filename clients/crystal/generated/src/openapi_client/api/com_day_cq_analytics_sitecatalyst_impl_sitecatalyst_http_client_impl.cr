require "json"

module OpenAPIClient
  module Api
  class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_analytics_sitecatalyst_service_datacenter_url : Array(String)? = nil, devhostnamepatterns : Array(String)? = nil, connection_timeout : Int32? = nil, socket_timeout : Int32? = nil) : Response(OpenAPIClient::ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo)
      @conn.request(OpenAPIClient::ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystHttpClientImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.analytics.sitecatalyst.service.datacenter.url" => cq_analytics_sitecatalyst_service_datacenter_url, "devhostnamepatterns" => devhostnamepatterns, "connection.timeout" => connection_timeout, "socket.timeout" => socket_timeout },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
