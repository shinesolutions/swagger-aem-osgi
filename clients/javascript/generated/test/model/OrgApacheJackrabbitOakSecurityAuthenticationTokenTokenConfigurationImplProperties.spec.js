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
    instance = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImplProperties();
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

  describe('OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImplProperties', function() {
    it('should create an instance of OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImplProperties', function() {
      // uncomment below and update the code to test OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImplProperties
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImplProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImplProperties);
    });

    it('should have the property tokenExpiration (base name: "tokenExpiration")', function() {
      // uncomment below and update the code to test the property tokenExpiration
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property tokenLength (base name: "tokenLength")', function() {
      // uncomment below and update the code to test the property tokenLength
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property tokenRefresh (base name: "tokenRefresh")', function() {
      // uncomment below and update the code to test the property tokenRefresh
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property tokenCleanupThreshold (base name: "tokenCleanupThreshold")', function() {
      // uncomment below and update the code to test the property tokenCleanupThreshold
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property passwordHashAlgorithm (base name: "passwordHashAlgorithm")', function() {
      // uncomment below and update the code to test the property passwordHashAlgorithm
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property passwordHashIterations (base name: "passwordHashIterations")', function() {
      // uncomment below and update the code to test the property passwordHashIterations
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property passwordSaltSize (base name: "passwordSaltSize")', function() {
      // uncomment below and update the code to test the property passwordSaltSize
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImplProperties();
      //expect(instance).to.be();
    });

  });

}));