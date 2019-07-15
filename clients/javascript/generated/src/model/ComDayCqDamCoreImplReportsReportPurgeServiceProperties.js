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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqDamCoreImplReportsReportPurgeServiceProperties model module.
 * @module model/ComDayCqDamCoreImplReportsReportPurgeServiceProperties
 * @version 1.0.0
 */
class ComDayCqDamCoreImplReportsReportPurgeServiceProperties {
    /**
     * Constructs a new <code>ComDayCqDamCoreImplReportsReportPurgeServiceProperties</code>.
     * @alias module:model/ComDayCqDamCoreImplReportsReportPurgeServiceProperties
     */
    constructor() { 
        
        ComDayCqDamCoreImplReportsReportPurgeServiceProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamCoreImplReportsReportPurgeServiceProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamCoreImplReportsReportPurgeServiceProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamCoreImplReportsReportPurgeServiceProperties} The populated <code>ComDayCqDamCoreImplReportsReportPurgeServiceProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamCoreImplReportsReportPurgeServiceProperties();

            if (data.hasOwnProperty('scheduler.expression')) {
                obj['scheduler.expression'] = ConfigNodePropertyString.constructFromObject(data['scheduler.expression']);
            }
            if (data.hasOwnProperty('maxSavedReports')) {
                obj['maxSavedReports'] = ConfigNodePropertyInteger.constructFromObject(data['maxSavedReports']);
            }
            if (data.hasOwnProperty('timeDuration')) {
                obj['timeDuration'] = ConfigNodePropertyInteger.constructFromObject(data['timeDuration']);
            }
            if (data.hasOwnProperty('enableReportPurge')) {
                obj['enableReportPurge'] = ConfigNodePropertyBoolean.constructFromObject(data['enableReportPurge']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} scheduler.expression
 */
ComDayCqDamCoreImplReportsReportPurgeServiceProperties.prototype['scheduler.expression'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} maxSavedReports
 */
ComDayCqDamCoreImplReportsReportPurgeServiceProperties.prototype['maxSavedReports'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} timeDuration
 */
ComDayCqDamCoreImplReportsReportPurgeServiceProperties.prototype['timeDuration'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enableReportPurge
 */
ComDayCqDamCoreImplReportsReportPurgeServiceProperties.prototype['enableReportPurge'] = undefined;






export default ComDayCqDamCoreImplReportsReportPurgeServiceProperties;

