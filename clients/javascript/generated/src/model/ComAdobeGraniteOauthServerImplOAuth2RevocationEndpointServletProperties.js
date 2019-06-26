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

import ApiClient from '../ApiClient';
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties model module.
 * @module model/ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties
 * @version 1.0.0
 */
class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties</code>.
     * @alias module:model/ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties
     */
    constructor() { 
        
        ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties} The populated <code>ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties();

            if (data.hasOwnProperty('sling.servlet.paths')) {
                obj['sling.servlet.paths'] = ConfigNodePropertyString.constructFromObject(data['sling.servlet.paths']);
            }
            if (data.hasOwnProperty('oauth.revocation.active')) {
                obj['oauth.revocation.active'] = ConfigNodePropertyBoolean.constructFromObject(data['oauth.revocation.active']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} sling.servlet.paths
 */
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.prototype['sling.servlet.paths'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} oauth.revocation.active
 */
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.prototype['oauth.revocation.active'] = undefined;






export default ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties;
