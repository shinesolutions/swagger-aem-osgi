# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, event_filter: nil, fontmgr_system_font_dir: nil, fontmgr_adobe_font_dir: nil, fontmgr_customer_font_dir: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.handler.gibson.fontmanager.impl.FontManagerServiceImpl',
          type: OpenapiClient::Models::ComDayCqDamHandlerGibsonFontmanagerImplFontManagerSeH24f33c6b,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'event.filter' => event_filter, 'fontmgr.system.font.dir' => fontmgr_system_font_dir, 'fontmgr.adobe.font.dir' => fontmgr_adobe_font_dir, 'fontmgr.customer.font.dir' => fontmgr_customer_font_dir }
        )
      end
    end
  end
end
