require "json"

module OpenAPIClient
  module Api
  class ComDayCqAnalyticsImplStorePropertiesChangeListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_store_listener_additional_store_paths : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo)
      @conn.request(OpenAPIClient::ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.analytics.impl.StorePropertiesChangeListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.store.listener.additionalStorePaths" => cq_store_listener_additional_store_paths },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
