# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheFelixHttpSslfilterSslFilter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, ssl_forward_header: nil, ssl_forward_value: nil, ssl_forward_cert_header: nil, rewrite_absolute_urls: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.felix.http.sslfilter.SslFilter',
          type: OpenapiClient::Models::OrgApacheFelixHttpSslfilterSslFilterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'ssl-forward.header' => ssl_forward_header, 'ssl-forward.value' => ssl_forward_value, 'ssl-forward-cert.header' => ssl_forward_cert_header, 'rewrite.absolute.urls' => rewrite_absolute_urls }
        )
      end
    end
  end
end
