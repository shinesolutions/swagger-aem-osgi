require "json"

module OpenAPIClient
  module Api
  class OrgApacheFelixWebconsoleInternalServletOsgiManager
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, manager_root : String? = nil, http_service_filter : String? = nil, default_render : String? = nil, realm : String? = nil, username : String? = nil, password : String? = nil, category : String? = nil, locale : String? = nil, loglevel : Int32? = nil, plugins : String? = nil) : Response(OpenAPIClient::OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo)
      @conn.request(OpenAPIClient::OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.felix.webconsole.internal.servlet.OsgiManager",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "manager.root" => manager_root, "http.service.filter" => http_service_filter, "default.render" => default_render, "realm" => realm, "username" => username, "password" => password, "category" => category, "locale" => locale, "loglevel" => loglevel, "plugins" => plugins },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
