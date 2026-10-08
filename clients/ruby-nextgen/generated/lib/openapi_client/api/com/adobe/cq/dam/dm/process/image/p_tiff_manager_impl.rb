# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDamDmProcessImagePTiffManagerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, max_memory: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dam.dm.process.image.PTiffManagerImpl',
          type: OpenapiClient::Models::ComAdobeCqDamDmProcessImagePTiffManagerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'maxMemory' => max_memory }
        )
      end
    end
  end
end
