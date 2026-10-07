# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_commerce_cataloggenerator_bucketsize: nil, cq_commerce_cataloggenerator_bucketname: nil, cq_commerce_cataloggenerator_excludedtemplateproperties: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.commerce.pim.impl.cataloggenerator.CatalogGeneratorImpl',
          type: OpenapiClient::Models::ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneraH4fa5f454,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.commerce.cataloggenerator.bucketsize' => cq_commerce_cataloggenerator_bucketsize, 'cq.commerce.cataloggenerator.bucketname' => cq_commerce_cataloggenerator_bucketname, 'cq.commerce.cataloggenerator.excludedtemplateproperties' => cq_commerce_cataloggenerator_excludedtemplateproperties }
        )
      end
    end
  end
end
