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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties model module.
 * @module model/ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties</code>.
     * @alias module:model/ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties
     */
    constructor() { 
        
        ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties} The populated <code>ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties();

            if (data.hasOwnProperty('accepted')) {
                obj['accepted'] = ConfigNodePropertyBoolean.constructFromObject(data['accepted']);
            }
            if (data.hasOwnProperty('ranked')) {
                obj['ranked'] = ConfigNodePropertyInteger.constructFromObject(data['ranked']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} accepted
 */
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.prototype['accepted'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} ranked
 */
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.prototype['ranked'] = undefined;






export default ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties;

