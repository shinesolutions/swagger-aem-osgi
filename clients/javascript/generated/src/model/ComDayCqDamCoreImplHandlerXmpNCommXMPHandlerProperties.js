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
 * The ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties model module.
 * @module model/ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties
 * @version 1.0.0
 */
class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties {
    /**
     * Constructs a new <code>ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties</code>.
     * @alias module:model/ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties
     */
    constructor() { 
        
        ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties} The populated <code>ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties();

            if (data.hasOwnProperty('xmphandler.cq.formats')) {
                obj['xmphandler.cq.formats'] = ConfigNodePropertyArray.constructFromObject(data['xmphandler.cq.formats']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} xmphandler.cq.formats
 */
ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.prototype['xmphandler.cq.formats'] = undefined;






export default ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties;

