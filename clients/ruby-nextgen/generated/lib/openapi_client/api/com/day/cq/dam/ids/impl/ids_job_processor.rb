# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamIdsImplIDSJobProcessor
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enable_multisession: nil, ids_cc_enable: nil, enable_retry: nil, enable_retry_scripterror: nil, externalizer_domain_cqhost: nil, externalizer_domain_http: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.ids.impl.IDSJobProcessor',
          type: OpenapiClient::Models::ComDayCqDamIdsImplIDSJobProcessorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enable.multisession' => enable_multisession, 'ids.cc.enable' => ids_cc_enable, 'enable.retry' => enable_retry, 'enable.retry.scripterror' => enable_retry_scripterror, 'externalizer.domain.cqhost' => externalizer_domain_cqhost, 'externalizer.domain.http' => externalizer_domain_http }
        )
      end
    end
  end
end
