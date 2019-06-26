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
 * The ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties model module.
 * @module model/ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties
 * @version 1.0.0
 */
class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties {
    /**
     * Constructs a new <code>ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties</code>.
     * @alias module:model/ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties
     */
    constructor() { 
        
        ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties} The populated <code>ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties();

            if (data.hasOwnProperty('jmx.objectname')) {
                obj['jmx.objectname'] = ConfigNodePropertyString.constructFromObject(data['jmx.objectname']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} jmx.objectname
 */
ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.prototype['jmx.objectname'] = undefined;






export default ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties;

