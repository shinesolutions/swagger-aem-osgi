/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.NodeSwaggerAemOsgi);
  }
}(this, function(expect, NodeSwaggerAemOsgi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplLogRequestLoggerServiceProperties();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('OrgApacheSlingEngineImplLogRequestLoggerServiceProperties', function() {
    it('should create an instance of OrgApacheSlingEngineImplLogRequestLoggerServiceProperties', function() {
      // uncomment below and update the code to test OrgApacheSlingEngineImplLogRequestLoggerServiceProperties
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplLogRequestLoggerServiceProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.OrgApacheSlingEngineImplLogRequestLoggerServiceProperties);
    });

    it('should have the property requestLogServiceFormat (base name: "request.log.service.format")', function() {
      // uncomment below and update the code to test the property requestLogServiceFormat
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplLogRequestLoggerServiceProperties();
      //expect(instance).to.be();
    });

    it('should have the property requestLogServiceOutput (base name: "request.log.service.output")', function() {
      // uncomment below and update the code to test the property requestLogServiceOutput
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplLogRequestLoggerServiceProperties();
      //expect(instance).to.be();
    });

    it('should have the property requestLogServiceOutputtype (base name: "request.log.service.outputtype")', function() {
      // uncomment below and update the code to test the property requestLogServiceOutputtype
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplLogRequestLoggerServiceProperties();
      //expect(instance).to.be();
    });

    it('should have the property requestLogServiceOnentry (base name: "request.log.service.onentry")', function() {
      // uncomment below and update the code to test the property requestLogServiceOnentry
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplLogRequestLoggerServiceProperties();
      //expect(instance).to.be();
    });

  });

}));
