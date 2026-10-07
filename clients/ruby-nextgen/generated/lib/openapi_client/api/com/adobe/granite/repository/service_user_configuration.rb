# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteRepositoryServiceUserConfiguration
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, service_ranking: nil, serviceusers_simple_subject_population: nil, serviceusers_list: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.repository.ServiceUserConfiguration',
          type: OpenapiClient::Models::ComAdobeGraniteRepositoryServiceUserConfigurationInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'service.ranking' => service_ranking, 'serviceusers.simpleSubjectPopulation' => serviceusers_simple_subject_population, 'serviceusers.list' => serviceusers_list }
        )
      end
    end
  end
end
