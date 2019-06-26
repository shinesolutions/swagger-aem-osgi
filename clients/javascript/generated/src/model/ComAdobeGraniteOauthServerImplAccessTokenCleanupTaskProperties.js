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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties model module.
 * @module model/ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties
 * @version 1.0.0
 */
class ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties</code>.
     * @alias module:model/ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties
     */
    constructor() { 
        
        ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties} The populated <code>ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties();

            if (data.hasOwnProperty('scheduler.expression')) {
                obj['scheduler.expression'] = ConfigNodePropertyString.constructFromObject(data['scheduler.expression']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} scheduler.expression
 */
ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties.prototype['scheduler.expression'] = undefined;






export default ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties;

