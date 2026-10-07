# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthImsImplImsConfigProviderImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, oauth_configmanager_ims_configid: nil, ims_owning_entity: nil, aem_instance_id: nil, ims_service_code: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.ims.impl.ImsConfigProviderImpl',
          type: OpenapiClient::Models::ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'oauth.configmanager.ims.configid' => oauth_configmanager_ims_configid, 'ims.owningEntity' => ims_owning_entity, 'aem.instanceId' => aem_instance_id, 'ims.serviceCode' => ims_service_code }
        )
      end
    end
  end
end
