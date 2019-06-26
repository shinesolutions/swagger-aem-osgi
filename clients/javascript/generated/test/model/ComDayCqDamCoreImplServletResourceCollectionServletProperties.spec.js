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
    instance = new NodeSwaggerAemOsgi.ComDayCqDamCoreImplServletResourceCollectionServletProperties();
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

  describe('ComDayCqDamCoreImplServletResourceCollectionServletProperties', function() {
    it('should create an instance of ComDayCqDamCoreImplServletResourceCollectionServletProperties', function() {
      // uncomment below and update the code to test ComDayCqDamCoreImplServletResourceCollectionServletProperties
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCoreImplServletResourceCollectionServletProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.ComDayCqDamCoreImplServletResourceCollectionServletProperties);
    });

    it('should have the property slingServletResourceTypes (base name: "sling.servlet.resourceTypes")', function() {
      // uncomment below and update the code to test the property slingServletResourceTypes
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCoreImplServletResourceCollectionServletProperties();
      //expect(instance).to.be();
    });

    it('should have the property slingServletMethods (base name: "sling.servlet.methods")', function() {
      // uncomment below and update the code to test the property slingServletMethods
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCoreImplServletResourceCollectionServletProperties();
      //expect(instance).to.be();
    });

    it('should have the property slingServletSelectors (base name: "sling.servlet.selectors")', function() {
      // uncomment below and update the code to test the property slingServletSelectors
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCoreImplServletResourceCollectionServletProperties();
      //expect(instance).to.be();
    });

    it('should have the property downloadConfig (base name: "download.config")', function() {
      // uncomment below and update the code to test the property downloadConfig
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCoreImplServletResourceCollectionServletProperties();
      //expect(instance).to.be();
    });

    it('should have the property viewSelector (base name: "view.selector")', function() {
      // uncomment below and update the code to test the property viewSelector
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCoreImplServletResourceCollectionServletProperties();
      //expect(instance).to.be();
    });

    it('should have the property sendEmail (base name: "send_email")', function() {
      // uncomment below and update the code to test the property sendEmail
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCoreImplServletResourceCollectionServletProperties();
      //expect(instance).to.be();
    });

  });

}));