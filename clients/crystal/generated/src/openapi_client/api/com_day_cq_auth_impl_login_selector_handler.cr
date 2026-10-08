require "json"

module OpenAPIClient
  module Api
  class ComDayCqAuthImplLoginSelectorHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, path : String? = nil, service_ranking : Int32? = nil, auth_loginselector_mappings : Array(String)? = nil, auth_loginselector_changepw_mappings : Array(String)? = nil, auth_loginselector_defaultloginpage : String? = nil, auth_loginselector_defaultchangepwpage : String? = nil, auth_loginselector_handle : Array(String)? = nil, auth_loginselector_handle_all_extensions : Bool? = nil) : Response(OpenAPIClient::ComDayCqAuthImplLoginSelectorHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqAuthImplLoginSelectorHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.auth.impl.LoginSelectorHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "path" => path, "service.ranking" => service_ranking, "auth.loginselector.mappings" => auth_loginselector_mappings, "auth.loginselector.changepw.mappings" => auth_loginselector_changepw_mappings, "auth.loginselector.defaultloginpage" => auth_loginselector_defaultloginpage, "auth.loginselector.defaultchangepwpage" => auth_loginselector_defaultchangepwpage, "auth.loginselector.handle" => auth_loginselector_handle, "auth.loginselector.handle.all.extensions" => auth_loginselector_handle_all_extensions },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
