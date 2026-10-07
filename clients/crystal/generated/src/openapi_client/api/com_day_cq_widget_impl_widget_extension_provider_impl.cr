require "json"

module OpenAPIClient
  module Api
  class ComDayCqWidgetImplWidgetExtensionProviderImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, extendable_widgets : Array(String)? = nil, widgetextensionprovider_debug : Bool? = nil) : Response(OpenAPIClient::ComDayCqWidgetImplWidgetExtensionProviderImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWidgetImplWidgetExtensionProviderImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.widget.impl.WidgetExtensionProviderImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "extendable.widgets" => extendable_widgets, "widgetextensionprovider.debug" => widgetextensionprovider_debug },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
