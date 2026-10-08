# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqInboxImplTypeproviderItemTypeProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, inbox_impl_typeprovider_registrypaths: nil, inbox_impl_typeprovider_legacypaths: nil, inbox_impl_typeprovider_defaulturl_failureitem: nil, inbox_impl_typeprovider_defaulturl_workitem: nil, inbox_impl_typeprovider_defaulturl_task: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.inbox.impl.typeprovider.ItemTypeProvider',
          type: OpenapiClient::Models::ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'inbox.impl.typeprovider.registrypaths' => inbox_impl_typeprovider_registrypaths, 'inbox.impl.typeprovider.legacypaths' => inbox_impl_typeprovider_legacypaths, 'inbox.impl.typeprovider.defaulturl.failureitem' => inbox_impl_typeprovider_defaulturl_failureitem, 'inbox.impl.typeprovider.defaulturl.workitem' => inbox_impl_typeprovider_defaulturl_workitem, 'inbox.impl.typeprovider.defaulturl.task' => inbox_impl_typeprovider_defaulturl_task }
        )
      end
    end
  end
end
