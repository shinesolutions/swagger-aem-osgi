require "json"

module OpenAPIClient
  module Api
  class ComAdobeOctopusNcommBootstrap
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, max_connections : Int32? = nil, max_requests : Int32? = nil, request_timeout : Int32? = nil, request_retries : Int32? = nil, launch_timeout : Int32? = nil) : Response(OpenAPIClient::ComAdobeOctopusNcommBootstrapInfo)
      @conn.request(OpenAPIClient::ComAdobeOctopusNcommBootstrapInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.octopus.ncomm.bootstrap",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "maxConnections" => max_connections, "maxRequests" => max_requests, "requestTimeout" => request_timeout, "requestRetries" => request_retries, "launchTimeout" => launch_timeout },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
