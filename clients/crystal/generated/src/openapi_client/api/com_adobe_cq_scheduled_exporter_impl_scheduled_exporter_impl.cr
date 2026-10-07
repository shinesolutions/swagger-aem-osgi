require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqScheduledExporterImplScheduledExporterImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, include_paths : Array(String)? = nil, exporter_user : String? = nil) : Response(OpenAPIClient::ComAdobeCqScheduledExporterImplScheduledExporterImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqScheduledExporterImplScheduledExporterImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.scheduled.exporter.impl.ScheduledExporterImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "include.paths" => include_paths, "exporter.user" => exporter_user },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
