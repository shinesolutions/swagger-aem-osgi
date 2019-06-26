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
 * The ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderServiceProperties model module.
 * @module model/ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderServiceProperties
 * @version 1.0.0
 */
class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderServiceProperties {
    /**
     * Constructs a new <code>ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderServiceProperties</code>.
     * @alias module:model/ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderServiceProperties
     */
    constructor() { 
        
        ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderServiceProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderServiceProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderServiceProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderServiceProperties} The populated <code>ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderServiceProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderServiceProperties();

            if (data.hasOwnProperty('operation')) {
                obj['operation'] = ConfigNodePropertyString.constructFromObject(data['operation']);
            }
            if (data.hasOwnProperty('emailEnabled')) {
                obj['emailEnabled'] = ConfigNodePropertyBoolean.constructFromObject(data['emailEnabled']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} operation
 */
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderServiceProperties.prototype['operation'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} emailEnabled
 */
ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderServiceProperties.prototype['emailEnabled'] = undefined;






export default ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderServiceProperties;
