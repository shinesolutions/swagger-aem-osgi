# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDamWebdavImplIoSpecialFilesHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, com_day_cq_dam_core_impl_io_special_files_handler_filepatters: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.SpecialFilesHandler',
          type: OpenapiClient::Models::ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters' => com_day_cq_dam_core_impl_io_special_files_handler_filepatters }
        )
      end
    end
  end
end
