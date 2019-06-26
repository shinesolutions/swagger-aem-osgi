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
 * The ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViewHandlerProperties model module.
 * @module model/ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViewHandlerProperties
 * @version 1.0.0
 */
class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViewHandlerProperties {
    /**
     * Constructs a new <code>ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViewHandlerProperties</code>.
     * @alias module:model/ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViewHandlerProperties
     */
    constructor() { 
        
        ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViewHandlerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViewHandlerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViewHandlerProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViewHandlerProperties} The populated <code>ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViewHandlerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViewHandlerProperties();

            if (data.hasOwnProperty('item.resource.types')) {
                obj['item.resource.types'] = ConfigNodePropertyArray.constructFromObject(data['item.resource.types']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} item.resource.types
 */
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViewHandlerProperties.prototype['item.resource.types'] = undefined;






export default ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViewHandlerProperties;
