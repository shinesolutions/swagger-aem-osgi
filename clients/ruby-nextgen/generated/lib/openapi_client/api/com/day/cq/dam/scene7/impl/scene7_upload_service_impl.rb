# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamScene7ImplScene7UploadServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_dam_scene7_uploadservice_activejobtimeout_label: nil, cq_dam_scene7_uploadservice_connectionmaxperroute_label: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7UploadServiceImpl',
          type: OpenapiClient::Models::ComDayCqDamScene7ImplScene7UploadServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.dam.scene7.uploadservice.activejobtimeout.label' => cq_dam_scene7_uploadservice_activejobtimeout_label, 'cq.dam.scene7.uploadservice.connectionmaxperroute.label' => cq_dam_scene7_uploadservice_connectionmaxperroute_label }
        )
      end
    end
  end
end
