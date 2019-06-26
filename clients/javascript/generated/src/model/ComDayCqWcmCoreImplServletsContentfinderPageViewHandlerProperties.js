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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties model module.
 * @module model/ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties
 * @version 1.0.0
 */
class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties {
    /**
     * Constructs a new <code>ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties</code>.
     * @alias module:model/ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties
     */
    constructor() { 
        
        ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties} The populated <code>ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties();

            if (data.hasOwnProperty('guessTotal')) {
                obj['guessTotal'] = ConfigNodePropertyString.constructFromObject(data['guessTotal']);
            }
            if (data.hasOwnProperty('tagTitleSearch')) {
                obj['tagTitleSearch'] = ConfigNodePropertyBoolean.constructFromObject(data['tagTitleSearch']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} guessTotal
 */
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.prototype['guessTotal'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} tagTitleSearch
 */
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.prototype['tagTitleSearch'] = undefined;






export default ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties;

