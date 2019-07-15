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
 * The ComDayCrxSecurityTokenImplTokenCleanupTaskProperties model module.
 * @module model/ComDayCrxSecurityTokenImplTokenCleanupTaskProperties
 * @version 1.0.0
 */
class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties {
    /**
     * Constructs a new <code>ComDayCrxSecurityTokenImplTokenCleanupTaskProperties</code>.
     * @alias module:model/ComDayCrxSecurityTokenImplTokenCleanupTaskProperties
     */
    constructor() { 
        
        ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCrxSecurityTokenImplTokenCleanupTaskProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCrxSecurityTokenImplTokenCleanupTaskProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCrxSecurityTokenImplTokenCleanupTaskProperties} The populated <code>ComDayCrxSecurityTokenImplTokenCleanupTaskProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCrxSecurityTokenImplTokenCleanupTaskProperties();

            if (data.hasOwnProperty('enable.token.cleanup.task')) {
                obj['enable.token.cleanup.task'] = ConfigNodePropertyBoolean.constructFromObject(data['enable.token.cleanup.task']);
            }
            if (data.hasOwnProperty('scheduler.expression')) {
                obj['scheduler.expression'] = ConfigNodePropertyString.constructFromObject(data['scheduler.expression']);
            }
            if (data.hasOwnProperty('batch.size')) {
                obj['batch.size'] = ConfigNodePropertyInteger.constructFromObject(data['batch.size']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} enable.token.cleanup.task
 */
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.prototype['enable.token.cleanup.task'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} scheduler.expression
 */
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.prototype['scheduler.expression'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} batch.size
 */
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.prototype['batch.size'] = undefined;






export default ComDayCrxSecurityTokenImplTokenCleanupTaskProperties;

