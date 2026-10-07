# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWidgetImplWidgetExtensionProviderImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, extendable_widgets: nil, widgetextensionprovider_debug: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.widget.impl.WidgetExtensionProviderImpl',
          type: OpenapiClient::Models::ComDayCqWidgetImplWidgetExtensionProviderImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'extendable.widgets' => extendable_widgets, 'widgetextensionprovider.debug' => widgetextensionprovider_debug }
        )
      end
    end
  end
end
