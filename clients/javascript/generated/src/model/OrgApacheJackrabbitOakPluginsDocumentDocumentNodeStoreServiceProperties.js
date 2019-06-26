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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyDropDown from './ConfigNodePropertyDropDown';
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties model module.
 * @module model/OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
 * @version 1.0.0
 */
class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties {
    /**
     * Constructs a new <code>OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties</code>.
     * @alias module:model/OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
     */
    constructor() { 
        
        OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties} The populated <code>OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties();

            if (data.hasOwnProperty('mongouri')) {
                obj['mongouri'] = ConfigNodePropertyString.constructFromObject(data['mongouri']);
            }
            if (data.hasOwnProperty('db')) {
                obj['db'] = ConfigNodePropertyString.constructFromObject(data['db']);
            }
            if (data.hasOwnProperty('socketKeepAlive')) {
                obj['socketKeepAlive'] = ConfigNodePropertyBoolean.constructFromObject(data['socketKeepAlive']);
            }
            if (data.hasOwnProperty('cache')) {
                obj['cache'] = ConfigNodePropertyInteger.constructFromObject(data['cache']);
            }
            if (data.hasOwnProperty('nodeCachePercentage')) {
                obj['nodeCachePercentage'] = ConfigNodePropertyInteger.constructFromObject(data['nodeCachePercentage']);
            }
            if (data.hasOwnProperty('prevDocCachePercentage')) {
                obj['prevDocCachePercentage'] = ConfigNodePropertyInteger.constructFromObject(data['prevDocCachePercentage']);
            }
            if (data.hasOwnProperty('childrenCachePercentage')) {
                obj['childrenCachePercentage'] = ConfigNodePropertyInteger.constructFromObject(data['childrenCachePercentage']);
            }
            if (data.hasOwnProperty('diffCachePercentage')) {
                obj['diffCachePercentage'] = ConfigNodePropertyInteger.constructFromObject(data['diffCachePercentage']);
            }
            if (data.hasOwnProperty('cacheSegmentCount')) {
                obj['cacheSegmentCount'] = ConfigNodePropertyInteger.constructFromObject(data['cacheSegmentCount']);
            }
            if (data.hasOwnProperty('cacheStackMoveDistance')) {
                obj['cacheStackMoveDistance'] = ConfigNodePropertyInteger.constructFromObject(data['cacheStackMoveDistance']);
            }
            if (data.hasOwnProperty('blobCacheSize')) {
                obj['blobCacheSize'] = ConfigNodePropertyInteger.constructFromObject(data['blobCacheSize']);
            }
            if (data.hasOwnProperty('persistentCache')) {
                obj['persistentCache'] = ConfigNodePropertyString.constructFromObject(data['persistentCache']);
            }
            if (data.hasOwnProperty('journalCache')) {
                obj['journalCache'] = ConfigNodePropertyString.constructFromObject(data['journalCache']);
            }
            if (data.hasOwnProperty('customBlobStore')) {
                obj['customBlobStore'] = ConfigNodePropertyBoolean.constructFromObject(data['customBlobStore']);
            }
            if (data.hasOwnProperty('journalGCInterval')) {
                obj['journalGCInterval'] = ConfigNodePropertyInteger.constructFromObject(data['journalGCInterval']);
            }
            if (data.hasOwnProperty('journalGCMaxAge')) {
                obj['journalGCMaxAge'] = ConfigNodePropertyInteger.constructFromObject(data['journalGCMaxAge']);
            }
            if (data.hasOwnProperty('prefetchExternalChanges')) {
                obj['prefetchExternalChanges'] = ConfigNodePropertyBoolean.constructFromObject(data['prefetchExternalChanges']);
            }
            if (data.hasOwnProperty('role')) {
                obj['role'] = ConfigNodePropertyString.constructFromObject(data['role']);
            }
            if (data.hasOwnProperty('versionGcMaxAgeInSecs')) {
                obj['versionGcMaxAgeInSecs'] = ConfigNodePropertyInteger.constructFromObject(data['versionGcMaxAgeInSecs']);
            }
            if (data.hasOwnProperty('versionGCExpression')) {
                obj['versionGCExpression'] = ConfigNodePropertyString.constructFromObject(data['versionGCExpression']);
            }
            if (data.hasOwnProperty('versionGCTimeLimitInSecs')) {
                obj['versionGCTimeLimitInSecs'] = ConfigNodePropertyInteger.constructFromObject(data['versionGCTimeLimitInSecs']);
            }
            if (data.hasOwnProperty('blobGcMaxAgeInSecs')) {
                obj['blobGcMaxAgeInSecs'] = ConfigNodePropertyInteger.constructFromObject(data['blobGcMaxAgeInSecs']);
            }
            if (data.hasOwnProperty('blobTrackSnapshotIntervalInSecs')) {
                obj['blobTrackSnapshotIntervalInSecs'] = ConfigNodePropertyInteger.constructFromObject(data['blobTrackSnapshotIntervalInSecs']);
            }
            if (data.hasOwnProperty('repository.home')) {
                obj['repository.home'] = ConfigNodePropertyString.constructFromObject(data['repository.home']);
            }
            if (data.hasOwnProperty('maxReplicationLagInSecs')) {
                obj['maxReplicationLagInSecs'] = ConfigNodePropertyInteger.constructFromObject(data['maxReplicationLagInSecs']);
            }
            if (data.hasOwnProperty('documentStoreType')) {
                obj['documentStoreType'] = ConfigNodePropertyDropDown.constructFromObject(data['documentStoreType']);
            }
            if (data.hasOwnProperty('bundlingDisabled')) {
                obj['bundlingDisabled'] = ConfigNodePropertyBoolean.constructFromObject(data['bundlingDisabled']);
            }
            if (data.hasOwnProperty('updateLimit')) {
                obj['updateLimit'] = ConfigNodePropertyInteger.constructFromObject(data['updateLimit']);
            }
            if (data.hasOwnProperty('persistentCacheIncludes')) {
                obj['persistentCacheIncludes'] = ConfigNodePropertyArray.constructFromObject(data['persistentCacheIncludes']);
            }
            if (data.hasOwnProperty('leaseCheckMode')) {
                obj['leaseCheckMode'] = ConfigNodePropertyDropDown.constructFromObject(data['leaseCheckMode']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} mongouri
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['mongouri'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} db
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['db'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} socketKeepAlive
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['socketKeepAlive'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cache
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['cache'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} nodeCachePercentage
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['nodeCachePercentage'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} prevDocCachePercentage
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['prevDocCachePercentage'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} childrenCachePercentage
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['childrenCachePercentage'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} diffCachePercentage
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['diffCachePercentage'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cacheSegmentCount
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['cacheSegmentCount'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cacheStackMoveDistance
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['cacheStackMoveDistance'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} blobCacheSize
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['blobCacheSize'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} persistentCache
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['persistentCache'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} journalCache
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['journalCache'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} customBlobStore
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['customBlobStore'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} journalGCInterval
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['journalGCInterval'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} journalGCMaxAge
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['journalGCMaxAge'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} prefetchExternalChanges
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['prefetchExternalChanges'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} role
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['role'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} versionGcMaxAgeInSecs
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['versionGcMaxAgeInSecs'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} versionGCExpression
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['versionGCExpression'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} versionGCTimeLimitInSecs
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['versionGCTimeLimitInSecs'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} blobGcMaxAgeInSecs
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['blobGcMaxAgeInSecs'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} blobTrackSnapshotIntervalInSecs
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['blobTrackSnapshotIntervalInSecs'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} repository.home
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['repository.home'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} maxReplicationLagInSecs
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['maxReplicationLagInSecs'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} documentStoreType
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['documentStoreType'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} bundlingDisabled
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['bundlingDisabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} updateLimit
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['updateLimit'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} persistentCacheIncludes
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['persistentCacheIncludes'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} leaseCheckMode
 */
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.prototype['leaseCheckMode'] = undefined;






export default OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties;
