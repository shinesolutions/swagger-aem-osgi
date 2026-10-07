# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, com_adobe_granite_jetty_ssl_port: nil, com_adobe_granite_jetty_ssl_keystore_user: nil, com_adobe_granite_jetty_ssl_keystore_password: nil, com_adobe_granite_jetty_ssl_ciphersuites_excluded: nil, com_adobe_granite_jetty_ssl_ciphersuites_included: nil, com_adobe_granite_jetty_ssl_client_certificate: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.jetty.ssl.internal.GraniteSslConnectorFactory',
          type: OpenapiClient::Models::ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'com.adobe.granite.jetty.ssl.port' => com_adobe_granite_jetty_ssl_port, 'com.adobe.granite.jetty.ssl.keystore.user' => com_adobe_granite_jetty_ssl_keystore_user, 'com.adobe.granite.jetty.ssl.keystore.password' => com_adobe_granite_jetty_ssl_keystore_password, 'com.adobe.granite.jetty.ssl.ciphersuites.excluded' => com_adobe_granite_jetty_ssl_ciphersuites_excluded, 'com.adobe.granite.jetty.ssl.ciphersuites.included' => com_adobe_granite_jetty_ssl_ciphersuites_included, 'com.adobe.granite.jetty.ssl.client.certificate' => com_adobe_granite_jetty_ssl_client_certificate }
        )
      end
    end
  end
end
