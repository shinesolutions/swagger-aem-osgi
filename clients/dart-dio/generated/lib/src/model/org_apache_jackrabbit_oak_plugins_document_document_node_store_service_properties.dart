//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties.g.dart';

/// OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
///
/// Properties:
/// * [mongouri] 
/// * [db] 
/// * [socketKeepAlive] 
/// * [cache] 
/// * [nodeCachePercentage] 
/// * [prevDocCachePercentage] 
/// * [childrenCachePercentage] 
/// * [diffCachePercentage] 
/// * [cacheSegmentCount] 
/// * [cacheStackMoveDistance] 
/// * [blobCacheSize] 
/// * [persistentCache] 
/// * [journalCache] 
/// * [customBlobStore] 
/// * [journalGCInterval] 
/// * [journalGCMaxAge] 
/// * [prefetchExternalChanges] 
/// * [role] 
/// * [versionGcMaxAgeInSecs] 
/// * [versionGCExpression] 
/// * [versionGCTimeLimitInSecs] 
/// * [blobGcMaxAgeInSecs] 
/// * [blobTrackSnapshotIntervalInSecs] 
/// * [repositoryPeriodHome] 
/// * [maxReplicationLagInSecs] 
/// * [documentStoreType] 
/// * [bundlingDisabled] 
/// * [updateLimit] 
/// * [persistentCacheIncludes] 
/// * [leaseCheckMode] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties implements Built<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties, OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'mongouri')
  ConfigNodePropertyString? get mongouri;

  @BuiltValueField(wireName: r'db')
  ConfigNodePropertyString? get db;

  @BuiltValueField(wireName: r'socketKeepAlive')
  ConfigNodePropertyBoolean? get socketKeepAlive;

  @BuiltValueField(wireName: r'cache')
  ConfigNodePropertyInteger? get cache;

  @BuiltValueField(wireName: r'nodeCachePercentage')
  ConfigNodePropertyInteger? get nodeCachePercentage;

  @BuiltValueField(wireName: r'prevDocCachePercentage')
  ConfigNodePropertyInteger? get prevDocCachePercentage;

  @BuiltValueField(wireName: r'childrenCachePercentage')
  ConfigNodePropertyInteger? get childrenCachePercentage;

  @BuiltValueField(wireName: r'diffCachePercentage')
  ConfigNodePropertyInteger? get diffCachePercentage;

  @BuiltValueField(wireName: r'cacheSegmentCount')
  ConfigNodePropertyInteger? get cacheSegmentCount;

  @BuiltValueField(wireName: r'cacheStackMoveDistance')
  ConfigNodePropertyInteger? get cacheStackMoveDistance;

  @BuiltValueField(wireName: r'blobCacheSize')
  ConfigNodePropertyInteger? get blobCacheSize;

  @BuiltValueField(wireName: r'persistentCache')
  ConfigNodePropertyString? get persistentCache;

  @BuiltValueField(wireName: r'journalCache')
  ConfigNodePropertyString? get journalCache;

  @BuiltValueField(wireName: r'customBlobStore')
  ConfigNodePropertyBoolean? get customBlobStore;

  @BuiltValueField(wireName: r'journalGCInterval')
  ConfigNodePropertyInteger? get journalGCInterval;

  @BuiltValueField(wireName: r'journalGCMaxAge')
  ConfigNodePropertyInteger? get journalGCMaxAge;

  @BuiltValueField(wireName: r'prefetchExternalChanges')
  ConfigNodePropertyBoolean? get prefetchExternalChanges;

  @BuiltValueField(wireName: r'role')
  ConfigNodePropertyString? get role;

  @BuiltValueField(wireName: r'versionGcMaxAgeInSecs')
  ConfigNodePropertyInteger? get versionGcMaxAgeInSecs;

  @BuiltValueField(wireName: r'versionGCExpression')
  ConfigNodePropertyString? get versionGCExpression;

  @BuiltValueField(wireName: r'versionGCTimeLimitInSecs')
  ConfigNodePropertyInteger? get versionGCTimeLimitInSecs;

  @BuiltValueField(wireName: r'blobGcMaxAgeInSecs')
  ConfigNodePropertyInteger? get blobGcMaxAgeInSecs;

  @BuiltValueField(wireName: r'blobTrackSnapshotIntervalInSecs')
  ConfigNodePropertyInteger? get blobTrackSnapshotIntervalInSecs;

  @BuiltValueField(wireName: r'repository.home')
  ConfigNodePropertyString? get repositoryPeriodHome;

  @BuiltValueField(wireName: r'maxReplicationLagInSecs')
  ConfigNodePropertyInteger? get maxReplicationLagInSecs;

  @BuiltValueField(wireName: r'documentStoreType')
  ConfigNodePropertyDropDown? get documentStoreType;

  @BuiltValueField(wireName: r'bundlingDisabled')
  ConfigNodePropertyBoolean? get bundlingDisabled;

  @BuiltValueField(wireName: r'updateLimit')
  ConfigNodePropertyInteger? get updateLimit;

  @BuiltValueField(wireName: r'persistentCacheIncludes')
  ConfigNodePropertyArray? get persistentCacheIncludes;

  @BuiltValueField(wireName: r'leaseCheckMode')
  ConfigNodePropertyDropDown? get leaseCheckMode;

  OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties._();

  factory OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties([void updates(OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder b)]) = _$OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties> get serializer => _$OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesSerializer();
}

class _$OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties, _$OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.mongouri != null) {
      yield r'mongouri';
      yield serializers.serialize(
        object.mongouri,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.db != null) {
      yield r'db';
      yield serializers.serialize(
        object.db,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.socketKeepAlive != null) {
      yield r'socketKeepAlive';
      yield serializers.serialize(
        object.socketKeepAlive,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cache != null) {
      yield r'cache';
      yield serializers.serialize(
        object.cache,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.nodeCachePercentage != null) {
      yield r'nodeCachePercentage';
      yield serializers.serialize(
        object.nodeCachePercentage,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.prevDocCachePercentage != null) {
      yield r'prevDocCachePercentage';
      yield serializers.serialize(
        object.prevDocCachePercentage,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.childrenCachePercentage != null) {
      yield r'childrenCachePercentage';
      yield serializers.serialize(
        object.childrenCachePercentage,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.diffCachePercentage != null) {
      yield r'diffCachePercentage';
      yield serializers.serialize(
        object.diffCachePercentage,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cacheSegmentCount != null) {
      yield r'cacheSegmentCount';
      yield serializers.serialize(
        object.cacheSegmentCount,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cacheStackMoveDistance != null) {
      yield r'cacheStackMoveDistance';
      yield serializers.serialize(
        object.cacheStackMoveDistance,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.blobCacheSize != null) {
      yield r'blobCacheSize';
      yield serializers.serialize(
        object.blobCacheSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.persistentCache != null) {
      yield r'persistentCache';
      yield serializers.serialize(
        object.persistentCache,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.journalCache != null) {
      yield r'journalCache';
      yield serializers.serialize(
        object.journalCache,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.customBlobStore != null) {
      yield r'customBlobStore';
      yield serializers.serialize(
        object.customBlobStore,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.journalGCInterval != null) {
      yield r'journalGCInterval';
      yield serializers.serialize(
        object.journalGCInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.journalGCMaxAge != null) {
      yield r'journalGCMaxAge';
      yield serializers.serialize(
        object.journalGCMaxAge,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.prefetchExternalChanges != null) {
      yield r'prefetchExternalChanges';
      yield serializers.serialize(
        object.prefetchExternalChanges,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.role != null) {
      yield r'role';
      yield serializers.serialize(
        object.role,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.versionGcMaxAgeInSecs != null) {
      yield r'versionGcMaxAgeInSecs';
      yield serializers.serialize(
        object.versionGcMaxAgeInSecs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.versionGCExpression != null) {
      yield r'versionGCExpression';
      yield serializers.serialize(
        object.versionGCExpression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.versionGCTimeLimitInSecs != null) {
      yield r'versionGCTimeLimitInSecs';
      yield serializers.serialize(
        object.versionGCTimeLimitInSecs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.blobGcMaxAgeInSecs != null) {
      yield r'blobGcMaxAgeInSecs';
      yield serializers.serialize(
        object.blobGcMaxAgeInSecs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.blobTrackSnapshotIntervalInSecs != null) {
      yield r'blobTrackSnapshotIntervalInSecs';
      yield serializers.serialize(
        object.blobTrackSnapshotIntervalInSecs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.repositoryPeriodHome != null) {
      yield r'repository.home';
      yield serializers.serialize(
        object.repositoryPeriodHome,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.maxReplicationLagInSecs != null) {
      yield r'maxReplicationLagInSecs';
      yield serializers.serialize(
        object.maxReplicationLagInSecs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.documentStoreType != null) {
      yield r'documentStoreType';
      yield serializers.serialize(
        object.documentStoreType,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.bundlingDisabled != null) {
      yield r'bundlingDisabled';
      yield serializers.serialize(
        object.bundlingDisabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.updateLimit != null) {
      yield r'updateLimit';
      yield serializers.serialize(
        object.updateLimit,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.persistentCacheIncludes != null) {
      yield r'persistentCacheIncludes';
      yield serializers.serialize(
        object.persistentCacheIncludes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.leaseCheckMode != null) {
      yield r'leaseCheckMode';
      yield serializers.serialize(
        object.leaseCheckMode,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'mongouri':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.mongouri.replace(valueDes);
          break;
        case r'db':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.db.replace(valueDes);
          break;
        case r'socketKeepAlive':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.socketKeepAlive.replace(valueDes);
          break;
        case r'cache':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cache.replace(valueDes);
          break;
        case r'nodeCachePercentage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.nodeCachePercentage.replace(valueDes);
          break;
        case r'prevDocCachePercentage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.prevDocCachePercentage.replace(valueDes);
          break;
        case r'childrenCachePercentage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.childrenCachePercentage.replace(valueDes);
          break;
        case r'diffCachePercentage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.diffCachePercentage.replace(valueDes);
          break;
        case r'cacheSegmentCount':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cacheSegmentCount.replace(valueDes);
          break;
        case r'cacheStackMoveDistance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cacheStackMoveDistance.replace(valueDes);
          break;
        case r'blobCacheSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.blobCacheSize.replace(valueDes);
          break;
        case r'persistentCache':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.persistentCache.replace(valueDes);
          break;
        case r'journalCache':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.journalCache.replace(valueDes);
          break;
        case r'customBlobStore':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.customBlobStore.replace(valueDes);
          break;
        case r'journalGCInterval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.journalGCInterval.replace(valueDes);
          break;
        case r'journalGCMaxAge':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.journalGCMaxAge.replace(valueDes);
          break;
        case r'prefetchExternalChanges':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.prefetchExternalChanges.replace(valueDes);
          break;
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.role.replace(valueDes);
          break;
        case r'versionGcMaxAgeInSecs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.versionGcMaxAgeInSecs.replace(valueDes);
          break;
        case r'versionGCExpression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.versionGCExpression.replace(valueDes);
          break;
        case r'versionGCTimeLimitInSecs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.versionGCTimeLimitInSecs.replace(valueDes);
          break;
        case r'blobGcMaxAgeInSecs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.blobGcMaxAgeInSecs.replace(valueDes);
          break;
        case r'blobTrackSnapshotIntervalInSecs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.blobTrackSnapshotIntervalInSecs.replace(valueDes);
          break;
        case r'repository.home':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.repositoryPeriodHome.replace(valueDes);
          break;
        case r'maxReplicationLagInSecs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxReplicationLagInSecs.replace(valueDes);
          break;
        case r'documentStoreType':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.documentStoreType.replace(valueDes);
          break;
        case r'bundlingDisabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.bundlingDisabled.replace(valueDes);
          break;
        case r'updateLimit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.updateLimit.replace(valueDes);
          break;
        case r'persistentCacheIncludes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.persistentCacheIncludes.replace(valueDes);
          break;
        case r'leaseCheckMode':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.leaseCheckMode.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

