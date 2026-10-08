# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, parameter_whitelist: nil, parameter_whitelist_prefixes: nil, binary_parameter_whitelist: nil, modifier_whitelist: nil, operation_whitelist: nil, operation_whitelist_prefixes: nil, typehint_whitelist: nil, resourcetype_whitelist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.foundation.security.impl.SaferSlingPostValidatorImpl',
          type: OpenapiClient::Models::ComDayCqWcmFoundationSecurityImplSaferSlingPostValidH0f165b4c,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'parameter.whitelist' => parameter_whitelist, 'parameter.whitelist.prefixes' => parameter_whitelist_prefixes, 'binary.parameter.whitelist' => binary_parameter_whitelist, 'modifier.whitelist' => modifier_whitelist, 'operation.whitelist' => operation_whitelist, 'operation.whitelist.prefixes' => operation_whitelist_prefixes, 'typehint.whitelist' => typehint_whitelist, 'resourcetype.whitelist' => resourcetype_whitelist }
        )
      end
    end
  end
end
