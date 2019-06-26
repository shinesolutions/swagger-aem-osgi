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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties model module.
 * @module model/ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties
 * @version 1.0.0
 */
class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties {
    /**
     * Constructs a new <code>ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties</code>.
     * @alias module:model/ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties
     */
    constructor() { 
        
        ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties} The populated <code>ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties();

            if (data.hasOwnProperty('cq.dam.image.cache.max.memory')) {
                obj['cq.dam.image.cache.max.memory'] = ConfigNodePropertyInteger.constructFromObject(data['cq.dam.image.cache.max.memory']);
            }
            if (data.hasOwnProperty('cq.dam.image.cache.max.age')) {
                obj['cq.dam.image.cache.max.age'] = ConfigNodePropertyInteger.constructFromObject(data['cq.dam.image.cache.max.age']);
            }
            if (data.hasOwnProperty('cq.dam.image.cache.max.dimension')) {
                obj['cq.dam.image.cache.max.dimension'] = ConfigNodePropertyString.constructFromObject(data['cq.dam.image.cache.max.dimension']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} cq.dam.image.cache.max.memory
 */
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.prototype['cq.dam.image.cache.max.memory'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cq.dam.image.cache.max.age
 */
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.prototype['cq.dam.image.cache.max.age'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} cq.dam.image.cache.max.dimension
 */
ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.prototype['cq.dam.image.cache.max.dimension'] = undefined;






export default ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties;
