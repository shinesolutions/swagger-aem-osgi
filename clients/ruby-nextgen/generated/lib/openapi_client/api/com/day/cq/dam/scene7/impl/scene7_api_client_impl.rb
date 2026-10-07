# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamScene7ImplScene7APIClientImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_dam_scene7_apiclient_recordsperpage_nofilter_name: nil, cq_dam_scene7_apiclient_recordsperpage_withfilter_name: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7APIClientImpl',
          type: OpenapiClient::Models::ComDayCqDamScene7ImplScene7APIClientImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.dam.scene7.apiclient.recordsperpage.nofilter.name' => cq_dam_scene7_apiclient_recordsperpage_nofilter_name, 'cq.dam.scene7.apiclient.recordsperpage.withfilter.name' => cq_dam_scene7_apiclient_recordsperpage_withfilter_name }
        )
      end
    end
  end
end
