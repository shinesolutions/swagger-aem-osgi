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
    instance = new NodeSwaggerAemOsgi.ComAdobeCqScreensDeviceImplDeviceServiceProperties();
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

  describe('ComAdobeCqScreensDeviceImplDeviceServiceProperties', function() {
    it('should create an instance of ComAdobeCqScreensDeviceImplDeviceServiceProperties', function() {
      // uncomment below and update the code to test ComAdobeCqScreensDeviceImplDeviceServiceProperties
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqScreensDeviceImplDeviceServiceProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.ComAdobeCqScreensDeviceImplDeviceServiceProperties);
    });

    it('should have the property comAdobeAemScreensPlayerPingfrequency (base name: "com.adobe.aem.screens.player.pingfrequency")', function() {
      // uncomment below and update the code to test the property comAdobeAemScreensPlayerPingfrequency
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqScreensDeviceImplDeviceServiceProperties();
      //expect(instance).to.be();
    });

    it('should have the property comAdobeAemScreensDevicePaswordSpecialchars (base name: "com.adobe.aem.screens.device.pasword.specialchars")', function() {
      // uncomment below and update the code to test the property comAdobeAemScreensDevicePaswordSpecialchars
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqScreensDeviceImplDeviceServiceProperties();
      //expect(instance).to.be();
    });

    it('should have the property comAdobeAemScreensDevicePaswordMinlowercasechars (base name: "com.adobe.aem.screens.device.pasword.minlowercasechars")', function() {
      // uncomment below and update the code to test the property comAdobeAemScreensDevicePaswordMinlowercasechars
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqScreensDeviceImplDeviceServiceProperties();
      //expect(instance).to.be();
    });

    it('should have the property comAdobeAemScreensDevicePaswordMinuppercasechars (base name: "com.adobe.aem.screens.device.pasword.minuppercasechars")', function() {
      // uncomment below and update the code to test the property comAdobeAemScreensDevicePaswordMinuppercasechars
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqScreensDeviceImplDeviceServiceProperties();
      //expect(instance).to.be();
    });

    it('should have the property comAdobeAemScreensDevicePaswordMinnumberchars (base name: "com.adobe.aem.screens.device.pasword.minnumberchars")', function() {
      // uncomment below and update the code to test the property comAdobeAemScreensDevicePaswordMinnumberchars
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqScreensDeviceImplDeviceServiceProperties();
      //expect(instance).to.be();
    });

    it('should have the property comAdobeAemScreensDevicePaswordMinspecialchars (base name: "com.adobe.aem.screens.device.pasword.minspecialchars")', function() {
      // uncomment below and update the code to test the property comAdobeAemScreensDevicePaswordMinspecialchars
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqScreensDeviceImplDeviceServiceProperties();
      //expect(instance).to.be();
    });

    it('should have the property comAdobeAemScreensDevicePaswordMinlength (base name: "com.adobe.aem.screens.device.pasword.minlength")', function() {
      // uncomment below and update the code to test the property comAdobeAemScreensDevicePaswordMinlength
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqScreensDeviceImplDeviceServiceProperties();
      //expect(instance).to.be();
    });

  });

}));
