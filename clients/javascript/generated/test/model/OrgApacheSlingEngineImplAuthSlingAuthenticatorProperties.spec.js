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
    instance = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();
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

  describe('OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties', function() {
    it('should create an instance of OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties', function() {
      // uncomment below and update the code to test OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties);
    });

    it('should have the property osgiHttpWhiteboardContextSelect (base name: "osgi.http.whiteboard.context.select")', function() {
      // uncomment below and update the code to test the property osgiHttpWhiteboardContextSelect
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();
      //expect(instance).to.be();
    });

    it('should have the property osgiHttpWhiteboardListener (base name: "osgi.http.whiteboard.listener")', function() {
      // uncomment below and update the code to test the property osgiHttpWhiteboardListener
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();
      //expect(instance).to.be();
    });

    it('should have the property authSudoCookie (base name: "auth.sudo.cookie")', function() {
      // uncomment below and update the code to test the property authSudoCookie
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();
      //expect(instance).to.be();
    });

    it('should have the property authSudoParameter (base name: "auth.sudo.parameter")', function() {
      // uncomment below and update the code to test the property authSudoParameter
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();
      //expect(instance).to.be();
    });

    it('should have the property authAnnonymous (base name: "auth.annonymous")', function() {
      // uncomment below and update the code to test the property authAnnonymous
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();
      //expect(instance).to.be();
    });

    it('should have the property slingAuthRequirements (base name: "sling.auth.requirements")', function() {
      // uncomment below and update the code to test the property slingAuthRequirements
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();
      //expect(instance).to.be();
    });

    it('should have the property slingAuthAnonymousUser (base name: "sling.auth.anonymous.user")', function() {
      // uncomment below and update the code to test the property slingAuthAnonymousUser
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();
      //expect(instance).to.be();
    });

    it('should have the property slingAuthAnonymousPassword (base name: "sling.auth.anonymous.password")', function() {
      // uncomment below and update the code to test the property slingAuthAnonymousPassword
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();
      //expect(instance).to.be();
    });

    it('should have the property authHttp (base name: "auth.http")', function() {
      // uncomment below and update the code to test the property authHttp
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();
      //expect(instance).to.be();
    });

    it('should have the property authHttpRealm (base name: "auth.http.realm")', function() {
      // uncomment below and update the code to test the property authHttpRealm
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();
      //expect(instance).to.be();
    });

    it('should have the property authUriSuffix (base name: "auth.uri.suffix")', function() {
      // uncomment below and update the code to test the property authUriSuffix
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();
      //expect(instance).to.be();
    });

  });

}));
