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
    instance = new NodeSwaggerAemOsgi.ComDayCqAuthImplLoginSelectorHandlerProperties();
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

  describe('ComDayCqAuthImplLoginSelectorHandlerProperties', function() {
    it('should create an instance of ComDayCqAuthImplLoginSelectorHandlerProperties', function() {
      // uncomment below and update the code to test ComDayCqAuthImplLoginSelectorHandlerProperties
      //var instane = new NodeSwaggerAemOsgi.ComDayCqAuthImplLoginSelectorHandlerProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.ComDayCqAuthImplLoginSelectorHandlerProperties);
    });

    it('should have the property path (base name: "path")', function() {
      // uncomment below and update the code to test the property path
      //var instane = new NodeSwaggerAemOsgi.ComDayCqAuthImplLoginSelectorHandlerProperties();
      //expect(instance).to.be();
    });

    it('should have the property serviceRanking (base name: "service.ranking")', function() {
      // uncomment below and update the code to test the property serviceRanking
      //var instane = new NodeSwaggerAemOsgi.ComDayCqAuthImplLoginSelectorHandlerProperties();
      //expect(instance).to.be();
    });

    it('should have the property authLoginselectorMappings (base name: "auth.loginselector.mappings")', function() {
      // uncomment below and update the code to test the property authLoginselectorMappings
      //var instane = new NodeSwaggerAemOsgi.ComDayCqAuthImplLoginSelectorHandlerProperties();
      //expect(instance).to.be();
    });

    it('should have the property authLoginselectorChangepwMappings (base name: "auth.loginselector.changepw.mappings")', function() {
      // uncomment below and update the code to test the property authLoginselectorChangepwMappings
      //var instane = new NodeSwaggerAemOsgi.ComDayCqAuthImplLoginSelectorHandlerProperties();
      //expect(instance).to.be();
    });

    it('should have the property authLoginselectorDefaultloginpage (base name: "auth.loginselector.defaultloginpage")', function() {
      // uncomment below and update the code to test the property authLoginselectorDefaultloginpage
      //var instane = new NodeSwaggerAemOsgi.ComDayCqAuthImplLoginSelectorHandlerProperties();
      //expect(instance).to.be();
    });

    it('should have the property authLoginselectorDefaultchangepwpage (base name: "auth.loginselector.defaultchangepwpage")', function() {
      // uncomment below and update the code to test the property authLoginselectorDefaultchangepwpage
      //var instane = new NodeSwaggerAemOsgi.ComDayCqAuthImplLoginSelectorHandlerProperties();
      //expect(instance).to.be();
    });

    it('should have the property authLoginselectorHandle (base name: "auth.loginselector.handle")', function() {
      // uncomment below and update the code to test the property authLoginselectorHandle
      //var instane = new NodeSwaggerAemOsgi.ComDayCqAuthImplLoginSelectorHandlerProperties();
      //expect(instance).to.be();
    });

    it('should have the property authLoginselectorHandleAllExtensions (base name: "auth.loginselector.handle.all.extensions")', function() {
      // uncomment below and update the code to test the property authLoginselectorHandleAllExtensions
      //var instane = new NodeSwaggerAemOsgi.ComDayCqAuthImplLoginSelectorHandlerProperties();
      //expect(instance).to.be();
    });

  });

}));