# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_dam_scene7_assetmimetypeservice_mapping: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7AssetMimeTypeServiceImpl',
          type: OpenapiClient::Models::ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.dam.scene7.assetmimetypeservice.mapping' => cq_dam_scene7_assetmimetypeservice_mapping }
        )
      end
    end
  end
end
