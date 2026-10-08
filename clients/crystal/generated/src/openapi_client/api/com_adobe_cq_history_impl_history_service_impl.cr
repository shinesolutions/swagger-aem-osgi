require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqHistoryImplHistoryServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, history_service_resource_types : Array(String)? = nil, history_service_path_filter : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqHistoryImplHistoryServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqHistoryImplHistoryServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.history.impl.HistoryServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "history.service.resourceTypes" => history_service_resource_types, "history.service.pathFilter" => history_service_path_filter },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
