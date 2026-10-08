import unittest
from unittest.mock import patch
import urllib3
import swaggeraemosgi
from swaggeraemosgi.api import configmgr_api

class TestSlingDavExServlet(unittest.TestCase):

    @patch.object(urllib3.PoolManager, 'request')
    def test_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet(self, mock_request):

      # Stub the underlying HTTP call so no real AEM server is needed
      mock_request.return_value = urllib3.HTTPResponse(
          body=b'{"pid": "org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet"}',
          status=200,
          headers={'Content-Type': 'application/json'}
      )

      configuration = swaggeraemosgi.Configuration(
          host = "http://localhost:4502",
          username = "admin",
          password = "admin"
      )

      with swaggeraemosgi.ApiClient(configuration) as api_client:

          api_instance = configmgr_api.ConfigmgrApi(api_client)

          try:
              api_response = api_instance.org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet()
              print("The response of ConfigmgrApi->org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet:\n")
              print(api_response)
              assert api_response.pid == 'org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet'
              method, url = mock_request.call_args[0]
              assert method == 'POST'
              assert url.endswith('/system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet')
          except swaggeraemosgi.ApiException as e:
              self.fail('Exception when calling ConfigmgrApi->org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet: %s\n' % e)
