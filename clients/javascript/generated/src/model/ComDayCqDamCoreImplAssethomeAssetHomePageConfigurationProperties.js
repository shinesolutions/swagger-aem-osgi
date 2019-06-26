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

/**
 * The ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties model module.
 * @module model/ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties
 * @version 1.0.0
 */
class ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties {
    /**
     * Constructs a new <code>ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties</code>.
     * @alias module:model/ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties
     */
    constructor() { 
        
        ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties} The populated <code>ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties();

            if (data.hasOwnProperty('isEnabled')) {
                obj['isEnabled'] = ConfigNodePropertyBoolean.constructFromObject(data['isEnabled']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} isEnabled
 */
ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties.prototype['isEnabled'] = undefined;






export default ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties;
