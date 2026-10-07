require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, link_expired_prefix : String? = nil, link_expired_remove : Bool? = nil, link_expired_suffix : String? = nil, link_invalid_prefix : String? = nil, link_invalid_remove : Bool? = nil, link_invalid_suffix : String? = nil, link_predated_prefix : String? = nil, link_predated_remove : Bool? = nil, link_predated_suffix : String? = nil, link_wcmmodes : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.LinkCheckerConfigurationFactoryImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "link.expired.prefix" => link_expired_prefix, "link.expired.remove" => link_expired_remove, "link.expired.suffix" => link_expired_suffix, "link.invalid.prefix" => link_invalid_prefix, "link.invalid.remove" => link_invalid_remove, "link.invalid.suffix" => link_invalid_suffix, "link.predated.prefix" => link_predated_prefix, "link.predated.remove" => link_predated_remove, "link.predated.suffix" => link_predated_suffix, "link.wcmmodes" => link_wcmmodes },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
