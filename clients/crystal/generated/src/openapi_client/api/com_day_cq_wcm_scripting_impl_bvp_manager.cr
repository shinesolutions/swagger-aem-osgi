require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmScriptingImplBVPManager
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, com_day_cq_wcm_scripting_bvp_script_engines : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmScriptingImplBVPManagerInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmScriptingImplBVPManagerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.scripting.impl.BVPManager",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "com.day.cq.wcm.scripting.bvp.script.engines" => com_day_cq_wcm_scripting_bvp_script_engines },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
