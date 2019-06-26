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
import ConfigNodePropertyDropDown from './ConfigNodePropertyDropDown';
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqDamCoreImplDamEventPurgeServiceProperties model module.
 * @module model/ComDayCqDamCoreImplDamEventPurgeServiceProperties
 * @version 1.0.0
 */
class ComDayCqDamCoreImplDamEventPurgeServiceProperties {
    /**
     * Constructs a new <code>ComDayCqDamCoreImplDamEventPurgeServiceProperties</code>.
     * @alias module:model/ComDayCqDamCoreImplDamEventPurgeServiceProperties
     */
    constructor() { 
        
        ComDayCqDamCoreImplDamEventPurgeServiceProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamCoreImplDamEventPurgeServiceProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamCoreImplDamEventPurgeServiceProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamCoreImplDamEventPurgeServiceProperties} The populated <code>ComDayCqDamCoreImplDamEventPurgeServiceProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamCoreImplDamEventPurgeServiceProperties();

            if (data.hasOwnProperty('scheduler.expression')) {
                obj['scheduler.expression'] = ConfigNodePropertyString.constructFromObject(data['scheduler.expression']);
            }
            if (data.hasOwnProperty('maxSavedActivities')) {
                obj['maxSavedActivities'] = ConfigNodePropertyInteger.constructFromObject(data['maxSavedActivities']);
            }
            if (data.hasOwnProperty('saveInterval')) {
                obj['saveInterval'] = ConfigNodePropertyInteger.constructFromObject(data['saveInterval']);
            }
            if (data.hasOwnProperty('enableActivityPurge')) {
                obj['enableActivityPurge'] = ConfigNodePropertyBoolean.constructFromObject(data['enableActivityPurge']);
            }
            if (data.hasOwnProperty('eventTypes')) {
                obj['eventTypes'] = ConfigNodePropertyDropDown.constructFromObject(data['eventTypes']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} scheduler.expression
 */
ComDayCqDamCoreImplDamEventPurgeServiceProperties.prototype['scheduler.expression'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} maxSavedActivities
 */
ComDayCqDamCoreImplDamEventPurgeServiceProperties.prototype['maxSavedActivities'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} saveInterval
 */
ComDayCqDamCoreImplDamEventPurgeServiceProperties.prototype['saveInterval'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enableActivityPurge
 */
ComDayCqDamCoreImplDamEventPurgeServiceProperties.prototype['enableActivityPurge'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} eventTypes
 */
ComDayCqDamCoreImplDamEventPurgeServiceProperties.prototype['eventTypes'] = undefined;






export default ComDayCqDamCoreImplDamEventPurgeServiceProperties;

