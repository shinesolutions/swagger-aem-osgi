/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
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
 * The ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties model module.
 * @module model/ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties
 * @version 1.0.0
 */
class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties {
    /**
     * Constructs a new <code>ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties</code>.
     * @alias module:model/ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties
     */
    constructor() { 
        
        ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties} The populated <code>ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties();

            if (data.hasOwnProperty('cq.dam.detect.asset.mime.from.content')) {
                obj['cq.dam.detect.asset.mime.from.content'] = ConfigNodePropertyBoolean.constructFromObject(data['cq.dam.detect.asset.mime.from.content']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} cq.dam.detect.asset.mime.from.content
 */
ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.prototype['cq.dam.detect.asset.mime.from.content'] = undefined;






export default ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties;

