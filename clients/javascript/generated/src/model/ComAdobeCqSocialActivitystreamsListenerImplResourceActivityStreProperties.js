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
 * The ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties model module.
 * @module model/ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties
 * @version 1.0.0
 */
class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties {
    /**
     * Constructs a new <code>ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties</code>.
     * @alias module:model/ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties
     */
    constructor() { 
        
        ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties} The populated <code>ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties();

            if (data.hasOwnProperty('streamPath')) {
                obj['streamPath'] = ConfigNodePropertyString.constructFromObject(data['streamPath']);
            }
            if (data.hasOwnProperty('streamName')) {
                obj['streamName'] = ConfigNodePropertyString.constructFromObject(data['streamName']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} streamPath
 */
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.prototype['streamPath'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} streamName
 */
ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.prototype['streamName'] = undefined;






export default ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties;
