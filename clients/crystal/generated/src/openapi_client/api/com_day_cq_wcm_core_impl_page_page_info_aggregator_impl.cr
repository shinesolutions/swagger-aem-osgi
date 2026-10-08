require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplPagePageInfoAggregatorImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, page_info_provider_property_regex_default : String? = nil, page_info_provider_property_name : String? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.page.PageInfoAggregatorImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "page.info.provider.property.regex.default" => page_info_provider_property_regex_default, "page.info.provider.property.name" => page_info_provider_property_name },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
