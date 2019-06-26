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
 * The ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties model module.
 * @module model/ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties
 * @version 1.0.0
 */
class ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties {
    /**
     * Constructs a new <code>ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties</code>.
     * @alias module:model/ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties
     */
    constructor() { 
        
        ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties} The populated <code>ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties();

            if (data.hasOwnProperty('pipeline.type')) {
                obj['pipeline.type'] = ConfigNodePropertyString.constructFromObject(data['pipeline.type']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} pipeline.type
 */
ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties.prototype['pipeline.type'] = undefined;






export default ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties;
