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
 * The OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties model module.
 * @module model/OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties
 * @version 1.0.0
 */
class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties {
    /**
     * Constructs a new <code>OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties</code>.
     * @alias module:model/OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties
     */
    constructor() { 
        
        OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties} The populated <code>OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ConfigNodePropertyString.constructFromObject(data['name']);
            }
            if (data.hasOwnProperty('minPoolSize')) {
                obj['minPoolSize'] = ConfigNodePropertyInteger.constructFromObject(data['minPoolSize']);
            }
            if (data.hasOwnProperty('maxPoolSize')) {
                obj['maxPoolSize'] = ConfigNodePropertyInteger.constructFromObject(data['maxPoolSize']);
            }
            if (data.hasOwnProperty('queueSize')) {
                obj['queueSize'] = ConfigNodePropertyInteger.constructFromObject(data['queueSize']);
            }
            if (data.hasOwnProperty('maxThreadAge')) {
                obj['maxThreadAge'] = ConfigNodePropertyInteger.constructFromObject(data['maxThreadAge']);
            }
            if (data.hasOwnProperty('keepAliveTime')) {
                obj['keepAliveTime'] = ConfigNodePropertyInteger.constructFromObject(data['keepAliveTime']);
            }
            if (data.hasOwnProperty('blockPolicy')) {
                obj['blockPolicy'] = ConfigNodePropertyDropDown.constructFromObject(data['blockPolicy']);
            }
            if (data.hasOwnProperty('shutdownGraceful')) {
                obj['shutdownGraceful'] = ConfigNodePropertyBoolean.constructFromObject(data['shutdownGraceful']);
            }
            if (data.hasOwnProperty('daemon')) {
                obj['daemon'] = ConfigNodePropertyBoolean.constructFromObject(data['daemon']);
            }
            if (data.hasOwnProperty('shutdownWaitTime')) {
                obj['shutdownWaitTime'] = ConfigNodePropertyInteger.constructFromObject(data['shutdownWaitTime']);
            }
            if (data.hasOwnProperty('priority')) {
                obj['priority'] = ConfigNodePropertyDropDown.constructFromObject(data['priority']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} name
 */
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.prototype['name'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} minPoolSize
 */
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.prototype['minPoolSize'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} maxPoolSize
 */
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.prototype['maxPoolSize'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} queueSize
 */
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.prototype['queueSize'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} maxThreadAge
 */
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.prototype['maxThreadAge'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} keepAliveTime
 */
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.prototype['keepAliveTime'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} blockPolicy
 */
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.prototype['blockPolicy'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} shutdownGraceful
 */
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.prototype['shutdownGraceful'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} daemon
 */
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.prototype['daemon'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} shutdownWaitTime
 */
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.prototype['shutdownWaitTime'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} priority
 */
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.prototype['priority'] = undefined;






export default OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties;
