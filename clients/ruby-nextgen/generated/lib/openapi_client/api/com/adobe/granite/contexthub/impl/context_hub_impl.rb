# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteContexthubImplContextHubImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, com_adobe_granite_contexthub_silent_mode: nil, com_adobe_granite_contexthub_show_ui: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.contexthub.impl.ContextHubImpl',
          type: OpenapiClient::Models::ComAdobeGraniteContexthubImplContextHubImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'com.adobe.granite.contexthub.silent_mode' => com_adobe_granite_contexthub_silent_mode, 'com.adobe.granite.contexthub.show_ui' => com_adobe_granite_contexthub_show_ui }
        )
      end
    end
  end
end
