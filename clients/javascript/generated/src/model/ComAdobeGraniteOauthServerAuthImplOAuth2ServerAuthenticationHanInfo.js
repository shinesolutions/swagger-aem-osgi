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
import ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties from './ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties';

/**
 * The ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo model module.
 * @module model/ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo
 * @version 1.0.0
 */
class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo {
    /**
     * Constructs a new <code>ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo</code>.
     * @alias module:model/ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo
     */
    constructor() { 
        
        ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo} The populated <code>ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo();

            if (data.hasOwnProperty('pid')) {
                obj['pid'] = ApiClient.convertToType(data['pid'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('properties')) {
                obj['properties'] = ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties} properties
 */
ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.prototype['properties'] = undefined;






export default ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo;

