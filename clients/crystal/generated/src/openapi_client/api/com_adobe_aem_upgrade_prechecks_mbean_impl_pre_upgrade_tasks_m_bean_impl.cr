require "json"

module OpenAPIClient
  module Api
  class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, pre_upgrade_maintenance_tasks : Array(String)? = nil, pre_upgrade_hc_tags : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo)
      @conn.request(OpenAPIClient::ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.mbean.impl.PreUpgradeTasksMBeanImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "pre-upgrade.maintenance.tasks" => pre_upgrade_maintenance_tasks, "pre-upgrade.hc.tags" => pre_upgrade_hc_tags },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
