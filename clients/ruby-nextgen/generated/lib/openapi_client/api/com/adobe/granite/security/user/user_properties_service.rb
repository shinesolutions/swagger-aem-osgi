# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteSecurityUserUserPropertiesService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, adapter_condition: nil, granite_userproperties_nodetypes: nil, granite_userproperties_resourcetypes: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.security.user.UserPropertiesService',
          type: OpenapiClient::Models::ComAdobeGraniteSecurityUserUserPropertiesServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'adapter.condition' => adapter_condition, 'granite.userproperties.nodetypes' => granite_userproperties_nodetypes, 'granite.userproperties.resourcetypes' => granite_userproperties_resourcetypes }
        )
      end
    end
  end
end
