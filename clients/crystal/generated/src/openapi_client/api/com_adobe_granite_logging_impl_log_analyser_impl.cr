require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteLoggingImplLogAnalyserImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, messages_queue_size : Int32? = nil, logger_config : Array(String)? = nil, messages_size : Int32? = nil) : Response(OpenAPIClient::ComAdobeGraniteLoggingImplLogAnalyserImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteLoggingImplLogAnalyserImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.logging.impl.LogAnalyserImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "messages.queue.size" => messages_queue_size, "logger.config" => logger_config, "messages.size" => messages_size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
