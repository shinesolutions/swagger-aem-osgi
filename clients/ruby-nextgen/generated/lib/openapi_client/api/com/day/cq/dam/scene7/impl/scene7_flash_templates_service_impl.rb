# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, scene7_flash_templates_rti: nil, scene7_flash_templates_rsi: nil, scene7_flash_templates_rb: nil, scene7_flash_templates_rurl: nil, scene7_flash_template_url_format_parameter: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7FlashTemplatesServiceImpl',
          type: OpenapiClient::Models::ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'scene7FlashTemplates.rti' => scene7_flash_templates_rti, 'scene7FlashTemplates.rsi' => scene7_flash_templates_rsi, 'scene7FlashTemplates.rb' => scene7_flash_templates_rb, 'scene7FlashTemplates.rurl' => scene7_flash_templates_rurl, 'scene7FlashTemplate.urlFormatParameter' => scene7_flash_template_url_format_parameter }
        )
      end
    end
  end
end
