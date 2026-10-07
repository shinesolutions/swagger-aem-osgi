require "json"

module OpenAPIClient
  module Api
  class OrgApacheFelixWebconsolePluginsEventInternalPluginServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, max_size : Int32? = nil) : Response(OpenAPIClient::OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo)
      @conn.request(OpenAPIClient::OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.felix.webconsole.plugins.event.internal.PluginServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "max.size" => max_size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
