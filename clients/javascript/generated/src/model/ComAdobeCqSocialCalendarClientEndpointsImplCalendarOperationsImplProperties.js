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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImplProperties model module.
 * @module model/ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImplProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImplProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImplProperties</code>.
     * @alias module:model/ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImplProperties
     */
    constructor() { 
        
        ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImplProperties} The populated <code>ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImplProperties();

            if (data.hasOwnProperty('MaxRetry')) {
                obj['MaxRetry'] = ConfigNodePropertyInteger.constructFromObject(data['MaxRetry']);
            }
            if (data.hasOwnProperty('fieldWhitelist')) {
                obj['fieldWhitelist'] = ConfigNodePropertyArray.constructFromObject(data['fieldWhitelist']);
            }
            if (data.hasOwnProperty('attachmentTypeBlacklist')) {
                obj['attachmentTypeBlacklist'] = ConfigNodePropertyArray.constructFromObject(data['attachmentTypeBlacklist']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} MaxRetry
 */
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImplProperties.prototype['MaxRetry'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} fieldWhitelist
 */
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImplProperties.prototype['fieldWhitelist'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} attachmentTypeBlacklist
 */
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImplProperties.prototype['attachmentTypeBlacklist'] = undefined;






export default ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImplProperties;
