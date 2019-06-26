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
 * The ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties model module.
 * @module model/ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties
 * @version 1.0.0
 */
class ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties {
    /**
     * Constructs a new <code>ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties</code>.
     * @alias module:model/ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties
     */
    constructor() { 
        
        ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties} The populated <code>ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties();

            if (data.hasOwnProperty('wcmdevmodefilter.enabled')) {
                obj['wcmdevmodefilter.enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['wcmdevmodefilter.enabled']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} wcmdevmodefilter.enabled
 */
ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties.prototype['wcmdevmodefilter.enabled'] = undefined;






export default ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties;

