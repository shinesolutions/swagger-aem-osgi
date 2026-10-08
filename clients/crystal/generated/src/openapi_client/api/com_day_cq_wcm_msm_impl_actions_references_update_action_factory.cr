require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_wcm_msm_action_excludednodetypes : Array(String)? = nil, cq_wcm_msm_action_excludedparagraphitems : Array(String)? = nil, cq_wcm_msm_action_excludedprops : Array(String)? = nil, cq_wcm_msm_impl_action_referencesupdate_prop_update_nested : Bool? = nil) : Response(OpenAPIClient::ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ReferencesUpdateActionFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.wcm.msm.action.excludednodetypes" => cq_wcm_msm_action_excludednodetypes, "cq.wcm.msm.action.excludedparagraphitems" => cq_wcm_msm_action_excludedparagraphitems, "cq.wcm.msm.action.excludedprops" => cq_wcm_msm_action_excludedprops, "cq.wcm.msm.impl.action.referencesupdate.prop_updateNested" => cq_wcm_msm_impl_action_referencesupdate_prop_update_nested },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
