# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDamCfmImplComponentComponentConfigImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, dam_cfm_component_resource_type: nil, dam_cfm_component_file_reference_prop: nil, dam_cfm_component_elements_prop: nil, dam_cfm_component_variation_prop: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dam.cfm.impl.component.ComponentConfigImpl',
          type: OpenapiClient::Models::ComAdobeCqDamCfmImplComponentComponentConfigImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'dam.cfm.component.resourceType' => dam_cfm_component_resource_type, 'dam.cfm.component.fileReferenceProp' => dam_cfm_component_file_reference_prop, 'dam.cfm.component.elementsProp' => dam_cfm_component_elements_prop, 'dam.cfm.component.variationProp' => dam_cfm_component_variation_prop }
        )
      end
    end
  end
end
