# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqCommonsImplExternalizerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, externalizer_domains: nil, externalizer_host: nil, externalizer_contextpath: nil, externalizer_encodedpath: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.commons.impl.ExternalizerImpl',
          type: OpenapiClient::Models::ComDayCqCommonsImplExternalizerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'externalizer.domains' => externalizer_domains, 'externalizer.host' => externalizer_host, 'externalizer.contextpath' => externalizer_contextpath, 'externalizer.encodedpath' => externalizer_encodedpath }
        )
      end
    end
  end
end
