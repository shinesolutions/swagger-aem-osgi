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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties model module.
 * @module model/ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties
 * @version 1.0.0
 */
class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties {
    /**
     * Constructs a new <code>ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties</code>.
     * @alias module:model/ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties
     */
    constructor() { 
        
        ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties} The populated <code>ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties();

            if (data.hasOwnProperty('batch.commit.size')) {
                obj['batch.commit.size'] = ConfigNodePropertyInteger.constructFromObject(data['batch.commit.size']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} batch.commit.size
 */
ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.prototype['batch.commit.size'] = undefined;






export default ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties;
