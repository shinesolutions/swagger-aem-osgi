require "json"

module OpenAPIClient
  module Api
  class ComAdobeXmpWorkerFilesNcommXMPFilesNComm
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, max_connections : String? = nil, max_requests : String? = nil, request_timeout : String? = nil, log_dir : String? = nil) : Response(OpenAPIClient::ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo)
      @conn.request(OpenAPIClient::ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.xmp.worker.files.ncomm.XMPFilesNComm",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "maxConnections" => max_connections, "maxRequests" => max_requests, "requestTimeout" => request_timeout, "logDir" => log_dir },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
