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
    instance = new NodeSwaggerAemOsgi.ComAdobeCqAccountImplAccountManagementServletProperties();
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

  describe('ComAdobeCqAccountImplAccountManagementServletProperties', function() {
    it('should create an instance of ComAdobeCqAccountImplAccountManagementServletProperties', function() {
      // uncomment below and update the code to test ComAdobeCqAccountImplAccountManagementServletProperties
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqAccountImplAccountManagementServletProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.ComAdobeCqAccountImplAccountManagementServletProperties);
    });

    it('should have the property cqAccountmanagerConfigInformnewaccountMail (base name: "cq.accountmanager.config.informnewaccount.mail")', function() {
      // uncomment below and update the code to test the property cqAccountmanagerConfigInformnewaccountMail
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqAccountImplAccountManagementServletProperties();
      //expect(instance).to.be();
    });

    it('should have the property cqAccountmanagerConfigInformnewpwdMail (base name: "cq.accountmanager.config.informnewpwd.mail")', function() {
      // uncomment below and update the code to test the property cqAccountmanagerConfigInformnewpwdMail
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqAccountImplAccountManagementServletProperties();
      //expect(instance).to.be();
    });

  });

}));