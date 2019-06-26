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
 * The ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties model module.
 * @module model/ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties
 * @version 1.0.0
 */
class ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties {
    /**
     * Constructs a new <code>ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties</code>.
     * @alias module:model/ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties
     */
    constructor() { 
        
        ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties} The populated <code>ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties();

            if (data.hasOwnProperty('sling.post.operation')) {
                obj['sling.post.operation'] = ConfigNodePropertyString.constructFromObject(data['sling.post.operation']);
            }
            if (data.hasOwnProperty('sling.servlet.methods')) {
                obj['sling.servlet.methods'] = ConfigNodePropertyString.constructFromObject(data['sling.servlet.methods']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} sling.post.operation
 */
ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.prototype['sling.post.operation'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} sling.servlet.methods
 */
ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.prototype['sling.servlet.methods'] = undefined;






export default ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties;

