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
import ConfigNodePropertyArray from './ConfigNodePropertyArray';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties model module.
 * @module model/ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties
 * @version 1.0.0
 */
class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties {
    /**
     * Constructs a new <code>ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties</code>.
     * @alias module:model/ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties
     */
    constructor() { 
        
        ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties} The populated <code>ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties();

            if (data.hasOwnProperty('workflowpackageinfoprovider.filter')) {
                obj['workflowpackageinfoprovider.filter'] = ConfigNodePropertyArray.constructFromObject(data['workflowpackageinfoprovider.filter']);
            }
            if (data.hasOwnProperty('workflowpackageinfoprovider.filter.rootpath')) {
                obj['workflowpackageinfoprovider.filter.rootpath'] = ConfigNodePropertyString.constructFromObject(data['workflowpackageinfoprovider.filter.rootpath']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} workflowpackageinfoprovider.filter
 */
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.prototype['workflowpackageinfoprovider.filter'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} workflowpackageinfoprovider.filter.rootpath
 */
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.prototype['workflowpackageinfoprovider.filter.rootpath'] = undefined;






export default ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties;

