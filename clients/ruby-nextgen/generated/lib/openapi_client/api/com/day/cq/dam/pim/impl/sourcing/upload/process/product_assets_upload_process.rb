# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProcess
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, delete_zip_file: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.pim.impl.sourcing.upload.process.ProductAssetsUploadProcess',
          type: OpenapiClient::Models::ComDayCqDamPimImplSourcingUploadProcessProductAssetsH7400e1d4,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'delete.zip.file' => delete_zip_file }
        )
      end
    end
  end
end
