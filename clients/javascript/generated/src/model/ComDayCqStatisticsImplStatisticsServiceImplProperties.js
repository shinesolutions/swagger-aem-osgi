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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqStatisticsImplStatisticsServiceImplProperties model module.
 * @module model/ComDayCqStatisticsImplStatisticsServiceImplProperties
 * @version 1.0.0
 */
class ComDayCqStatisticsImplStatisticsServiceImplProperties {
    /**
     * Constructs a new <code>ComDayCqStatisticsImplStatisticsServiceImplProperties</code>.
     * @alias module:model/ComDayCqStatisticsImplStatisticsServiceImplProperties
     */
    constructor() { 
        
        ComDayCqStatisticsImplStatisticsServiceImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqStatisticsImplStatisticsServiceImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqStatisticsImplStatisticsServiceImplProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqStatisticsImplStatisticsServiceImplProperties} The populated <code>ComDayCqStatisticsImplStatisticsServiceImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqStatisticsImplStatisticsServiceImplProperties();

            if (data.hasOwnProperty('scheduler.period')) {
                obj['scheduler.period'] = ConfigNodePropertyInteger.constructFromObject(data['scheduler.period']);
            }
            if (data.hasOwnProperty('scheduler.concurrent')) {
                obj['scheduler.concurrent'] = ConfigNodePropertyBoolean.constructFromObject(data['scheduler.concurrent']);
            }
            if (data.hasOwnProperty('path')) {
                obj['path'] = ConfigNodePropertyString.constructFromObject(data['path']);
            }
            if (data.hasOwnProperty('workspace')) {
                obj['workspace'] = ConfigNodePropertyString.constructFromObject(data['workspace']);
            }
            if (data.hasOwnProperty('keywordsPath')) {
                obj['keywordsPath'] = ConfigNodePropertyString.constructFromObject(data['keywordsPath']);
            }
            if (data.hasOwnProperty('asyncEntries')) {
                obj['asyncEntries'] = ConfigNodePropertyBoolean.constructFromObject(data['asyncEntries']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} scheduler.period
 */
ComDayCqStatisticsImplStatisticsServiceImplProperties.prototype['scheduler.period'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} scheduler.concurrent
 */
ComDayCqStatisticsImplStatisticsServiceImplProperties.prototype['scheduler.concurrent'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} path
 */
ComDayCqStatisticsImplStatisticsServiceImplProperties.prototype['path'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} workspace
 */
ComDayCqStatisticsImplStatisticsServiceImplProperties.prototype['workspace'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} keywordsPath
 */
ComDayCqStatisticsImplStatisticsServiceImplProperties.prototype['keywordsPath'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} asyncEntries
 */
ComDayCqStatisticsImplStatisticsServiceImplProperties.prototype['asyncEntries'] = undefined;






export default ComDayCqStatisticsImplStatisticsServiceImplProperties;
