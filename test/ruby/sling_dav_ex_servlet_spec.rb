require 'swagger_aem_osgi'

describe 'SwaggerAemOsgiClientSlingDavExServlet' do
  before do
  end

  after do
  end

  describe 'test org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet' do
    it 'should call' do
      SwaggerAemOsgiClient.configure do |config|
        config.host = 'localhost:4502'
        config.username = 'admin'
        config.password = 'admin'
      end

      api_instance = SwaggerAemOsgiClient::ConfigmgrApi.new

      # Stub the underlying HTTP call so no real AEM server is needed
      info = SwaggerAemOsgiClient::OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo.new(
        pid: 'org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet'
      )
      allow(api_instance.api_client).to receive(:call_api)
        .with(:POST, '/system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet', anything)
        .and_return([info, 200, {}])

      begin
        result = api_instance.org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet
        expect(result.pid).to eq('org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet')
      rescue SwaggerAemOsgiClient::ApiError => e
        puts "Error when calling ConfigmgrApi->org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet: #{e}"
        fail
      end
    end
  end

end
