require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqHistoryImplHistoryRequestFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, history_request_filter_excluded_selectors : Array(String)? = nil, history_request_filter_excluded_extensions : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqHistoryImplHistoryRequestFilterInfo)
      @conn.request(OpenAPIClient::ComAdobeCqHistoryImplHistoryRequestFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.history.impl.HistoryRequestFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "history.requestFilter.excludedSelectors" => history_request_filter_excluded_selectors, "history.requestFilter.excludedExtensions" => history_request_filter_excluded_extensions },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
