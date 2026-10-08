require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, org_apache_sling_installer_configuration_persist : Bool? = nil, mode : String? = nil, port : Int32? = nil, primary_host : String? = nil, interval : Int32? = nil, primary_allowed_client_ip_ranges : Array(String)? = nil, secure : Bool? = nil, standby_readtimeout : Int32? = nil, standby_autoclean : Bool? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.segment.standby.store.StandbyStoreService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "org.apache.sling.installer.configuration.persist" => org_apache_sling_installer_configuration_persist, "mode" => mode, "port" => port, "primary.host" => primary_host, "interval" => interval, "primary.allowed-client-ip-ranges" => primary_allowed_client_ip_ranges, "secure" => secure, "standby.readtimeout" => standby_readtimeout, "standby.autoclean" => standby_autoclean },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
