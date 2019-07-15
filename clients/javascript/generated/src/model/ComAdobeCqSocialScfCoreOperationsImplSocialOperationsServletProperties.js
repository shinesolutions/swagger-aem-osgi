/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
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
 * The ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties model module.
 * @module model/ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties</code>.
     * @alias module:model/ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties
     */
    constructor() { 
        
        ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties} The populated <code>ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties();

            if (data.hasOwnProperty('sling.servlet.selectors')) {
                obj['sling.servlet.selectors'] = ConfigNodePropertyString.constructFromObject(data['sling.servlet.selectors']);
            }
            if (data.hasOwnProperty('sling.servlet.extensions')) {
                obj['sling.servlet.extensions'] = ConfigNodePropertyString.constructFromObject(data['sling.servlet.extensions']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} sling.servlet.selectors
 */
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.prototype['sling.servlet.selectors'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} sling.servlet.extensions
 */
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.prototype['sling.servlet.extensions'] = undefined;






export default ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties;

