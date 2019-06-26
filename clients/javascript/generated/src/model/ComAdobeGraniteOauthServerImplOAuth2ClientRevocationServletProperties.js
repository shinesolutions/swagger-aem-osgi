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

/**
 * The ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties model module.
 * @module model/ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties
 * @version 1.0.0
 */
class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties</code>.
     * @alias module:model/ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties
     */
    constructor() { 
        
        ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties} The populated <code>ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties();

            if (data.hasOwnProperty('oauth.client.revocation.active')) {
                obj['oauth.client.revocation.active'] = ConfigNodePropertyBoolean.constructFromObject(data['oauth.client.revocation.active']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} oauth.client.revocation.active
 */
ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.prototype['oauth.client.revocation.active'] = undefined;






export default ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties;

