var assert = require('assert');
var NodeSwaggerAemOsgi = require('node-swagger-aem-osgi');

describe('slingDavExServlet', function() {

  describe('orgApacheSlingJcrDavexImplServletsSlingDavExServlet', function() {
    it('should respond without error', function(done) {
      var defaultClient = NodeSwaggerAemOsgi.ApiClient.instance;
      var aemAuth = defaultClient.authentications['aemAuth'];
      aemAuth.username = 'admin';
      aemAuth.password = 'admin';

      var api = new NodeSwaggerAemOsgi.ConfigmgrApi();

      // Stub the underlying HTTP call so no real AEM server is needed
      var calledWith = null;
      api.apiClient.callApi = function() {
        calledWith = { path: arguments[0], httpMethod: arguments[1] };
        var callback = arguments[arguments.length - 1];
        callback(null, { pid: 'org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet' }, { status: 200 });
      };

      var callback = function(error, data, response) {
        if (error) {
          console.error(error);
        } else {
          console.log('API called successfully. Returned data: ' + JSON.stringify(data));
          assert.equal(data.pid, 'org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet');
          assert.equal(calledWith.path, '/system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet');
          assert.equal(calledWith.httpMethod, 'POST');
        }
        done(error);
      };
      api.orgApacheSlingJcrDavexImplServletsSlingDavExServlet({}, callback);
    });
  });

});
