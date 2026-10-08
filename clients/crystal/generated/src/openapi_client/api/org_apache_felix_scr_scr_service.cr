require "json"

module OpenAPIClient
  module Api
  class OrgApacheFelixScrScrService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, ds_loglevel : Int32? = nil, ds_factory_enabled : Bool? = nil, ds_delayed_keep_instances : Bool? = nil, ds_lock_timeout_milliseconds : Int32? = nil, ds_stop_timeout_milliseconds : Int32? = nil, ds_global_extender : Bool? = nil) : Response(OpenAPIClient::OrgApacheFelixScrScrServiceInfo)
      @conn.request(OpenAPIClient::OrgApacheFelixScrScrServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.felix.scr.ScrService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "ds.loglevel" => ds_loglevel, "ds.factory.enabled" => ds_factory_enabled, "ds.delayed.keepInstances" => ds_delayed_keep_instances, "ds.lock.timeout.milliseconds" => ds_lock_timeout_milliseconds, "ds.stop.timeout.milliseconds" => ds_stop_timeout_milliseconds, "ds.global.extender" => ds_global_extender },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
