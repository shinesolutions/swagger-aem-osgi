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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheSlingDiscoveryOakConfigProperties model module.
 * @module model/OrgApacheSlingDiscoveryOakConfigProperties
 * @version 1.0.0
 */
class OrgApacheSlingDiscoveryOakConfigProperties {
    /**
     * Constructs a new <code>OrgApacheSlingDiscoveryOakConfigProperties</code>.
     * @alias module:model/OrgApacheSlingDiscoveryOakConfigProperties
     */
    constructor() { 
        
        OrgApacheSlingDiscoveryOakConfigProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingDiscoveryOakConfigProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingDiscoveryOakConfigProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingDiscoveryOakConfigProperties} The populated <code>OrgApacheSlingDiscoveryOakConfigProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingDiscoveryOakConfigProperties();

            if (data.hasOwnProperty('connectorPingTimeout')) {
                obj['connectorPingTimeout'] = ConfigNodePropertyInteger.constructFromObject(data['connectorPingTimeout']);
            }
            if (data.hasOwnProperty('connectorPingInterval')) {
                obj['connectorPingInterval'] = ConfigNodePropertyInteger.constructFromObject(data['connectorPingInterval']);
            }
            if (data.hasOwnProperty('discoveryLiteCheckInterval')) {
                obj['discoveryLiteCheckInterval'] = ConfigNodePropertyInteger.constructFromObject(data['discoveryLiteCheckInterval']);
            }
            if (data.hasOwnProperty('clusterSyncServiceTimeout')) {
                obj['clusterSyncServiceTimeout'] = ConfigNodePropertyInteger.constructFromObject(data['clusterSyncServiceTimeout']);
            }
            if (data.hasOwnProperty('clusterSyncServiceInterval')) {
                obj['clusterSyncServiceInterval'] = ConfigNodePropertyInteger.constructFromObject(data['clusterSyncServiceInterval']);
            }
            if (data.hasOwnProperty('enableSyncToken')) {
                obj['enableSyncToken'] = ConfigNodePropertyBoolean.constructFromObject(data['enableSyncToken']);
            }
            if (data.hasOwnProperty('minEventDelay')) {
                obj['minEventDelay'] = ConfigNodePropertyInteger.constructFromObject(data['minEventDelay']);
            }
            if (data.hasOwnProperty('socketConnectTimeout')) {
                obj['socketConnectTimeout'] = ConfigNodePropertyInteger.constructFromObject(data['socketConnectTimeout']);
            }
            if (data.hasOwnProperty('soTimeout')) {
                obj['soTimeout'] = ConfigNodePropertyInteger.constructFromObject(data['soTimeout']);
            }
            if (data.hasOwnProperty('topologyConnectorUrls')) {
                obj['topologyConnectorUrls'] = ConfigNodePropertyArray.constructFromObject(data['topologyConnectorUrls']);
            }
            if (data.hasOwnProperty('topologyConnectorWhitelist')) {
                obj['topologyConnectorWhitelist'] = ConfigNodePropertyArray.constructFromObject(data['topologyConnectorWhitelist']);
            }
            if (data.hasOwnProperty('autoStopLocalLoopEnabled')) {
                obj['autoStopLocalLoopEnabled'] = ConfigNodePropertyBoolean.constructFromObject(data['autoStopLocalLoopEnabled']);
            }
            if (data.hasOwnProperty('gzipConnectorRequestsEnabled')) {
                obj['gzipConnectorRequestsEnabled'] = ConfigNodePropertyBoolean.constructFromObject(data['gzipConnectorRequestsEnabled']);
            }
            if (data.hasOwnProperty('hmacEnabled')) {
                obj['hmacEnabled'] = ConfigNodePropertyBoolean.constructFromObject(data['hmacEnabled']);
            }
            if (data.hasOwnProperty('enableEncryption')) {
                obj['enableEncryption'] = ConfigNodePropertyBoolean.constructFromObject(data['enableEncryption']);
            }
            if (data.hasOwnProperty('sharedKey')) {
                obj['sharedKey'] = ConfigNodePropertyString.constructFromObject(data['sharedKey']);
            }
            if (data.hasOwnProperty('hmacSharedKeyTTL')) {
                obj['hmacSharedKeyTTL'] = ConfigNodePropertyInteger.constructFromObject(data['hmacSharedKeyTTL']);
            }
            if (data.hasOwnProperty('backoffStandbyFactor')) {
                obj['backoffStandbyFactor'] = ConfigNodePropertyString.constructFromObject(data['backoffStandbyFactor']);
            }
            if (data.hasOwnProperty('backoffStableFactor')) {
                obj['backoffStableFactor'] = ConfigNodePropertyString.constructFromObject(data['backoffStableFactor']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} connectorPingTimeout
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['connectorPingTimeout'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} connectorPingInterval
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['connectorPingInterval'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} discoveryLiteCheckInterval
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['discoveryLiteCheckInterval'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} clusterSyncServiceTimeout
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['clusterSyncServiceTimeout'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} clusterSyncServiceInterval
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['clusterSyncServiceInterval'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enableSyncToken
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['enableSyncToken'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} minEventDelay
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['minEventDelay'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} socketConnectTimeout
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['socketConnectTimeout'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} soTimeout
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['soTimeout'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} topologyConnectorUrls
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['topologyConnectorUrls'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} topologyConnectorWhitelist
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['topologyConnectorWhitelist'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} autoStopLocalLoopEnabled
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['autoStopLocalLoopEnabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} gzipConnectorRequestsEnabled
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['gzipConnectorRequestsEnabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} hmacEnabled
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['hmacEnabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enableEncryption
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['enableEncryption'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} sharedKey
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['sharedKey'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} hmacSharedKeyTTL
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['hmacSharedKeyTTL'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} backoffStandbyFactor
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['backoffStandbyFactor'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} backoffStableFactor
 */
OrgApacheSlingDiscoveryOakConfigProperties.prototype['backoffStableFactor'] = undefined;






export default OrgApacheSlingDiscoveryOakConfigProperties;

