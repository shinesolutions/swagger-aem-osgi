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
import ConfigNodePropertyArray from './ConfigNodePropertyArray';
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqPollingImporterImplPollingImporterImplProperties model module.
 * @module model/ComDayCqPollingImporterImplPollingImporterImplProperties
 * @version 1.0.0
 */
class ComDayCqPollingImporterImplPollingImporterImplProperties {
    /**
     * Constructs a new <code>ComDayCqPollingImporterImplPollingImporterImplProperties</code>.
     * @alias module:model/ComDayCqPollingImporterImplPollingImporterImplProperties
     */
    constructor() { 
        
        ComDayCqPollingImporterImplPollingImporterImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqPollingImporterImplPollingImporterImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqPollingImporterImplPollingImporterImplProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqPollingImporterImplPollingImporterImplProperties} The populated <code>ComDayCqPollingImporterImplPollingImporterImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqPollingImporterImplPollingImporterImplProperties();

            if (data.hasOwnProperty('importer.min.interval')) {
                obj['importer.min.interval'] = ConfigNodePropertyInteger.constructFromObject(data['importer.min.interval']);
            }
            if (data.hasOwnProperty('importer.user')) {
                obj['importer.user'] = ConfigNodePropertyString.constructFromObject(data['importer.user']);
            }
            if (data.hasOwnProperty('exclude.paths')) {
                obj['exclude.paths'] = ConfigNodePropertyArray.constructFromObject(data['exclude.paths']);
            }
            if (data.hasOwnProperty('include.paths')) {
                obj['include.paths'] = ConfigNodePropertyArray.constructFromObject(data['include.paths']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} importer.min.interval
 */
ComDayCqPollingImporterImplPollingImporterImplProperties.prototype['importer.min.interval'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} importer.user
 */
ComDayCqPollingImporterImplPollingImporterImplProperties.prototype['importer.user'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} exclude.paths
 */
ComDayCqPollingImporterImplPollingImporterImplProperties.prototype['exclude.paths'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} include.paths
 */
ComDayCqPollingImporterImplPollingImporterImplProperties.prototype['include.paths'] = undefined;






export default ComDayCqPollingImporterImplPollingImporterImplProperties;

