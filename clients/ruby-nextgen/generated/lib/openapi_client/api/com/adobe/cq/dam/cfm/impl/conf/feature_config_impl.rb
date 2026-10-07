# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDamCfmImplConfFeatureConfigImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, dam_cfm_resource_types: nil, dam_cfm_reference_properties: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dam.cfm.impl.conf.FeatureConfigImpl',
          type: OpenapiClient::Models::ComAdobeCqDamCfmImplConfFeatureConfigImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'dam.cfm.resourceTypes' => dam_cfm_resource_types, 'dam.cfm.referenceProperties' => dam_cfm_reference_properties }
        )
      end
    end
  end
end
