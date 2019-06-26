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
    instance = new NodeSwaggerAemOsgi.ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();
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

  describe('ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties', function() {
    it('should create an instance of ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties', function() {
      // uncomment below and update the code to test ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties);
    });

    it('should have the property oauthProviderId (base name: "oauth.provider.id")', function() {
      // uncomment below and update the code to test the property oauthProviderId
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property oauthCloudConfigRoot (base name: "oauth.cloud.config.root")', function() {
      // uncomment below and update the code to test the property oauthCloudConfigRoot
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property providerConfigRoot (base name: "provider.config.root")', function() {
      // uncomment below and update the code to test the property providerConfigRoot
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property providerConfigUserFolder (base name: "provider.config.user.folder")', function() {
      // uncomment below and update the code to test the property providerConfigUserFolder
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property providerConfigTwitterEnableParams (base name: "provider.config.twitter.enable.params")', function() {
      // uncomment below and update the code to test the property providerConfigTwitterEnableParams
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property providerConfigTwitterParams (base name: "provider.config.twitter.params")', function() {
      // uncomment below and update the code to test the property providerConfigTwitterParams
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property providerConfigRefreshUserdataEnabled (base name: "provider.config.refresh.userdata.enabled")', function() {
      // uncomment below and update the code to test the property providerConfigRefreshUserdataEnabled
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();
      //expect(instance).to.be();
    });

  });

}));