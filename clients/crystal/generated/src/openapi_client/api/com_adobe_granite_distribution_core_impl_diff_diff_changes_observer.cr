require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserver
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enabled : Bool? = nil, agent_name : String? = nil, diff_path : String? = nil, observed_path : String? = nil, service_name : String? = nil, property_names : String? = nil, distribution_delay : Int32? = nil, service_user_target : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffChangesObserver",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enabled" => enabled, "agentName" => agent_name, "diffPath" => diff_path, "observedPath" => observed_path, "serviceName" => service_name, "propertyNames" => property_names, "distributionDelay" => distribution_delay, "serviceUser.target" => service_user_target },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
