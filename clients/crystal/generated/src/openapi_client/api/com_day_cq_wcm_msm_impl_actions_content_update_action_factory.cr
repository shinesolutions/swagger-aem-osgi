require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmMsmImplActionsContentUpdateActionFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_wcm_msm_action_excludednodetypes : Array(String)? = nil, cq_wcm_msm_action_excludedparagraphitems : Array(String)? = nil, cq_wcm_msm_action_excludedprops : Array(String)? = nil, cq_wcm_msm_action_ignored_mixin : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentUpdateActionFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.wcm.msm.action.excludednodetypes" => cq_wcm_msm_action_excludednodetypes, "cq.wcm.msm.action.excludedparagraphitems" => cq_wcm_msm_action_excludedparagraphitems, "cq.wcm.msm.action.excludedprops" => cq_wcm_msm_action_excludedprops, "cq.wcm.msm.action.ignoredMixin" => cq_wcm_msm_action_ignored_mixin },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
