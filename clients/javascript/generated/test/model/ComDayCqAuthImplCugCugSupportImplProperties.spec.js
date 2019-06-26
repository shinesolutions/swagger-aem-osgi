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
    instance = new NodeSwaggerAemOsgi.ComDayCqAuthImplCugCugSupportImplProperties();
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

  describe('ComDayCqAuthImplCugCugSupportImplProperties', function() {
    it('should create an instance of ComDayCqAuthImplCugCugSupportImplProperties', function() {
      // uncomment below and update the code to test ComDayCqAuthImplCugCugSupportImplProperties
      //var instane = new NodeSwaggerAemOsgi.ComDayCqAuthImplCugCugSupportImplProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.ComDayCqAuthImplCugCugSupportImplProperties);
    });

    it('should have the property cugExemptedPrincipals (base name: "cug.exempted.principals")', function() {
      // uncomment below and update the code to test the property cugExemptedPrincipals
      //var instane = new NodeSwaggerAemOsgi.ComDayCqAuthImplCugCugSupportImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property cugEnabled (base name: "cug.enabled")', function() {
      // uncomment below and update the code to test the property cugEnabled
      //var instane = new NodeSwaggerAemOsgi.ComDayCqAuthImplCugCugSupportImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property cugPrincipalsRegex (base name: "cug.principals.regex")', function() {
      // uncomment below and update the code to test the property cugPrincipalsRegex
      //var instane = new NodeSwaggerAemOsgi.ComDayCqAuthImplCugCugSupportImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property cugPrincipalsReplacement (base name: "cug.principals.replacement")', function() {
      // uncomment below and update the code to test the property cugPrincipalsReplacement
      //var instane = new NodeSwaggerAemOsgi.ComDayCqAuthImplCugCugSupportImplProperties();
      //expect(instance).to.be();
    });

  });

}));
