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
 * The ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties model module.
 * @module model/ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties
 * @version 1.0.0
 */
class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties {
    /**
     * Constructs a new <code>ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties</code>.
     * @alias module:model/ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties
     */
    constructor() { 
        
        ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties} The populated <code>ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties();

            if (data.hasOwnProperty('default.externalizer.domain')) {
                obj['default.externalizer.domain'] = ConfigNodePropertyString.constructFromObject(data['default.externalizer.domain']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} default.externalizer.domain
 */
ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.prototype['default.externalizer.domain'] = undefined;






export default ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties;

