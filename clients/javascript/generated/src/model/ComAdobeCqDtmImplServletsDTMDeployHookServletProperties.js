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
import ConfigNodePropertyArray from './ConfigNodePropertyArray';

/**
 * The ComAdobeCqDtmImplServletsDTMDeployHookServletProperties model module.
 * @module model/ComAdobeCqDtmImplServletsDTMDeployHookServletProperties
 * @version 1.0.0
 */
class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties {
    /**
     * Constructs a new <code>ComAdobeCqDtmImplServletsDTMDeployHookServletProperties</code>.
     * @alias module:model/ComAdobeCqDtmImplServletsDTMDeployHookServletProperties
     */
    constructor() { 
        
        ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqDtmImplServletsDTMDeployHookServletProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqDtmImplServletsDTMDeployHookServletProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqDtmImplServletsDTMDeployHookServletProperties} The populated <code>ComAdobeCqDtmImplServletsDTMDeployHookServletProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqDtmImplServletsDTMDeployHookServletProperties();

            if (data.hasOwnProperty('dtm.staging.ip.whitelist')) {
                obj['dtm.staging.ip.whitelist'] = ConfigNodePropertyArray.constructFromObject(data['dtm.staging.ip.whitelist']);
            }
            if (data.hasOwnProperty('dtm.production.ip.whitelist')) {
                obj['dtm.production.ip.whitelist'] = ConfigNodePropertyArray.constructFromObject(data['dtm.production.ip.whitelist']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} dtm.staging.ip.whitelist
 */
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.prototype['dtm.staging.ip.whitelist'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} dtm.production.ip.whitelist
 */
ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.prototype['dtm.production.ip.whitelist'] = undefined;






export default ComAdobeCqDtmImplServletsDTMDeployHookServletProperties;

