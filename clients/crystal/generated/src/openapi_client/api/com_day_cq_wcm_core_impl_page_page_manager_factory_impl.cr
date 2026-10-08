require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplPagePageManagerFactoryImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, illegal_char_mapping : String? = nil, page_sub_tree_activation_check : Bool? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.page.PageManagerFactoryImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "illegalCharMapping" => illegal_char_mapping, "pageSubTreeActivationCheck" => page_sub_tree_activation_check },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
