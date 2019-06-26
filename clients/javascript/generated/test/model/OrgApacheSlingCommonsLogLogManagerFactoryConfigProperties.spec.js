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
    instance = new NodeSwaggerAemOsgi.OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties();
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

  describe('OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties', function() {
    it('should create an instance of OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties', function() {
      // uncomment below and update the code to test OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties);
    });

    it('should have the property orgApacheSlingCommonsLogLevel (base name: "org.apache.sling.commons.log.level")', function() {
      // uncomment below and update the code to test the property orgApacheSlingCommonsLogLevel
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property orgApacheSlingCommonsLogFile (base name: "org.apache.sling.commons.log.file")', function() {
      // uncomment below and update the code to test the property orgApacheSlingCommonsLogFile
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property orgApacheSlingCommonsLogPattern (base name: "org.apache.sling.commons.log.pattern")', function() {
      // uncomment below and update the code to test the property orgApacheSlingCommonsLogPattern
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property orgApacheSlingCommonsLogNames (base name: "org.apache.sling.commons.log.names")', function() {
      // uncomment below and update the code to test the property orgApacheSlingCommonsLogNames
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property orgApacheSlingCommonsLogAdditiv (base name: "org.apache.sling.commons.log.additiv")', function() {
      // uncomment below and update the code to test the property orgApacheSlingCommonsLogAdditiv
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties();
      //expect(instance).to.be();
    });

  });

}));
