//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties.g.dart';

/// OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties
///
/// Properties:
/// * [repositoryPeriodHome] 
/// * [tarmkPeriodMode] 
/// * [tarmkPeriodSize] 
/// * [segmentCachePeriodSize] 
/// * [stringCachePeriodSize] 
/// * [templateCachePeriodSize] 
/// * [stringDeduplicationCachePeriodSize] 
/// * [templateDeduplicationCachePeriodSize] 
/// * [nodeDeduplicationCachePeriodSize] 
/// * [pauseCompaction] 
/// * [compactionPeriodRetryCount] 
/// * [compactionPeriodForcePeriodTimeout] 
/// * [compactionPeriodSizeDeltaEstimation] 
/// * [compactionPeriodDisableEstimation] 
/// * [compactionPeriodRetainedGenerations] 
/// * [compactionPeriodMemoryThreshold] 
/// * [compactionPeriodProgressLog] 
/// * [standby] 
/// * [customBlobStore] 
/// * [customSegmentStore] 
/// * [splitPersistence] 
/// * [repositoryPeriodBackupPeriodDir] 
/// * [blobGcMaxAgeInSecs] 
/// * [blobTrackSnapshotIntervalInSecs] 
/// * [role] 
/// * [registerDescriptors] 
/// * [dispatchChanges] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties implements Built<OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties, OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'repository.home')
  ConfigNodePropertyString? get repositoryPeriodHome;

  @BuiltValueField(wireName: r'tarmk.mode')
  ConfigNodePropertyString? get tarmkPeriodMode;

  @BuiltValueField(wireName: r'tarmk.size')
  ConfigNodePropertyInteger? get tarmkPeriodSize;

  @BuiltValueField(wireName: r'segmentCache.size')
  ConfigNodePropertyInteger? get segmentCachePeriodSize;

  @BuiltValueField(wireName: r'stringCache.size')
  ConfigNodePropertyInteger? get stringCachePeriodSize;

  @BuiltValueField(wireName: r'templateCache.size')
  ConfigNodePropertyInteger? get templateCachePeriodSize;

  @BuiltValueField(wireName: r'stringDeduplicationCache.size')
  ConfigNodePropertyInteger? get stringDeduplicationCachePeriodSize;

  @BuiltValueField(wireName: r'templateDeduplicationCache.size')
  ConfigNodePropertyInteger? get templateDeduplicationCachePeriodSize;

  @BuiltValueField(wireName: r'nodeDeduplicationCache.size')
  ConfigNodePropertyInteger? get nodeDeduplicationCachePeriodSize;

  @BuiltValueField(wireName: r'pauseCompaction')
  ConfigNodePropertyBoolean? get pauseCompaction;

  @BuiltValueField(wireName: r'compaction.retryCount')
  ConfigNodePropertyInteger? get compactionPeriodRetryCount;

  @BuiltValueField(wireName: r'compaction.force.timeout')
  ConfigNodePropertyInteger? get compactionPeriodForcePeriodTimeout;

  @BuiltValueField(wireName: r'compaction.sizeDeltaEstimation')
  ConfigNodePropertyInteger? get compactionPeriodSizeDeltaEstimation;

  @BuiltValueField(wireName: r'compaction.disableEstimation')
  ConfigNodePropertyBoolean? get compactionPeriodDisableEstimation;

  @BuiltValueField(wireName: r'compaction.retainedGenerations')
  ConfigNodePropertyInteger? get compactionPeriodRetainedGenerations;

  @BuiltValueField(wireName: r'compaction.memoryThreshold')
  ConfigNodePropertyInteger? get compactionPeriodMemoryThreshold;

  @BuiltValueField(wireName: r'compaction.progressLog')
  ConfigNodePropertyInteger? get compactionPeriodProgressLog;

  @BuiltValueField(wireName: r'standby')
  ConfigNodePropertyBoolean? get standby;

  @BuiltValueField(wireName: r'customBlobStore')
  ConfigNodePropertyBoolean? get customBlobStore;

  @BuiltValueField(wireName: r'customSegmentStore')
  ConfigNodePropertyBoolean? get customSegmentStore;

  @BuiltValueField(wireName: r'splitPersistence')
  ConfigNodePropertyBoolean? get splitPersistence;

  @BuiltValueField(wireName: r'repository.backup.dir')
  ConfigNodePropertyString? get repositoryPeriodBackupPeriodDir;

  @BuiltValueField(wireName: r'blobGcMaxAgeInSecs')
  ConfigNodePropertyInteger? get blobGcMaxAgeInSecs;

  @BuiltValueField(wireName: r'blobTrackSnapshotIntervalInSecs')
  ConfigNodePropertyInteger? get blobTrackSnapshotIntervalInSecs;

  @BuiltValueField(wireName: r'role')
  ConfigNodePropertyString? get role;

  @BuiltValueField(wireName: r'registerDescriptors')
  ConfigNodePropertyBoolean? get registerDescriptors;

  @BuiltValueField(wireName: r'dispatchChanges')
  ConfigNodePropertyBoolean? get dispatchChanges;

  OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties._();

  factory OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties([void updates(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties> get serializer => _$OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties, _$OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.repositoryPeriodHome != null) {
      yield r'repository.home';
      yield serializers.serialize(
        object.repositoryPeriodHome,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.tarmkPeriodMode != null) {
      yield r'tarmk.mode';
      yield serializers.serialize(
        object.tarmkPeriodMode,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.tarmkPeriodSize != null) {
      yield r'tarmk.size';
      yield serializers.serialize(
        object.tarmkPeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.segmentCachePeriodSize != null) {
      yield r'segmentCache.size';
      yield serializers.serialize(
        object.segmentCachePeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.stringCachePeriodSize != null) {
      yield r'stringCache.size';
      yield serializers.serialize(
        object.stringCachePeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.templateCachePeriodSize != null) {
      yield r'templateCache.size';
      yield serializers.serialize(
        object.templateCachePeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.stringDeduplicationCachePeriodSize != null) {
      yield r'stringDeduplicationCache.size';
      yield serializers.serialize(
        object.stringDeduplicationCachePeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.templateDeduplicationCachePeriodSize != null) {
      yield r'templateDeduplicationCache.size';
      yield serializers.serialize(
        object.templateDeduplicationCachePeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.nodeDeduplicationCachePeriodSize != null) {
      yield r'nodeDeduplicationCache.size';
      yield serializers.serialize(
        object.nodeDeduplicationCachePeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.pauseCompaction != null) {
      yield r'pauseCompaction';
      yield serializers.serialize(
        object.pauseCompaction,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.compactionPeriodRetryCount != null) {
      yield r'compaction.retryCount';
      yield serializers.serialize(
        object.compactionPeriodRetryCount,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.compactionPeriodForcePeriodTimeout != null) {
      yield r'compaction.force.timeout';
      yield serializers.serialize(
        object.compactionPeriodForcePeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.compactionPeriodSizeDeltaEstimation != null) {
      yield r'compaction.sizeDeltaEstimation';
      yield serializers.serialize(
        object.compactionPeriodSizeDeltaEstimation,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.compactionPeriodDisableEstimation != null) {
      yield r'compaction.disableEstimation';
      yield serializers.serialize(
        object.compactionPeriodDisableEstimation,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.compactionPeriodRetainedGenerations != null) {
      yield r'compaction.retainedGenerations';
      yield serializers.serialize(
        object.compactionPeriodRetainedGenerations,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.compactionPeriodMemoryThreshold != null) {
      yield r'compaction.memoryThreshold';
      yield serializers.serialize(
        object.compactionPeriodMemoryThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.compactionPeriodProgressLog != null) {
      yield r'compaction.progressLog';
      yield serializers.serialize(
        object.compactionPeriodProgressLog,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.standby != null) {
      yield r'standby';
      yield serializers.serialize(
        object.standby,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.customBlobStore != null) {
      yield r'customBlobStore';
      yield serializers.serialize(
        object.customBlobStore,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.customSegmentStore != null) {
      yield r'customSegmentStore';
      yield serializers.serialize(
        object.customSegmentStore,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.splitPersistence != null) {
      yield r'splitPersistence';
      yield serializers.serialize(
        object.splitPersistence,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.repositoryPeriodBackupPeriodDir != null) {
      yield r'repository.backup.dir';
      yield serializers.serialize(
        object.repositoryPeriodBackupPeriodDir,
        specifiedType: const FullType(ConfigNodePropertyString),
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
    if (object.role != null) {
      yield r'role';
      yield serializers.serialize(
        object.role,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.registerDescriptors != null) {
      yield r'registerDescriptors';
      yield serializers.serialize(
        object.registerDescriptors,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.dispatchChanges != null) {
      yield r'dispatchChanges';
      yield serializers.serialize(
        object.dispatchChanges,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'repository.home':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.repositoryPeriodHome.replace(valueDes);
          break;
        case r'tarmk.mode':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.tarmkPeriodMode.replace(valueDes);
          break;
        case r'tarmk.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.tarmkPeriodSize.replace(valueDes);
          break;
        case r'segmentCache.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.segmentCachePeriodSize.replace(valueDes);
          break;
        case r'stringCache.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.stringCachePeriodSize.replace(valueDes);
          break;
        case r'templateCache.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.templateCachePeriodSize.replace(valueDes);
          break;
        case r'stringDeduplicationCache.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.stringDeduplicationCachePeriodSize.replace(valueDes);
          break;
        case r'templateDeduplicationCache.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.templateDeduplicationCachePeriodSize.replace(valueDes);
          break;
        case r'nodeDeduplicationCache.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.nodeDeduplicationCachePeriodSize.replace(valueDes);
          break;
        case r'pauseCompaction':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.pauseCompaction.replace(valueDes);
          break;
        case r'compaction.retryCount':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.compactionPeriodRetryCount.replace(valueDes);
          break;
        case r'compaction.force.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.compactionPeriodForcePeriodTimeout.replace(valueDes);
          break;
        case r'compaction.sizeDeltaEstimation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.compactionPeriodSizeDeltaEstimation.replace(valueDes);
          break;
        case r'compaction.disableEstimation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.compactionPeriodDisableEstimation.replace(valueDes);
          break;
        case r'compaction.retainedGenerations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.compactionPeriodRetainedGenerations.replace(valueDes);
          break;
        case r'compaction.memoryThreshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.compactionPeriodMemoryThreshold.replace(valueDes);
          break;
        case r'compaction.progressLog':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.compactionPeriodProgressLog.replace(valueDes);
          break;
        case r'standby':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.standby.replace(valueDes);
          break;
        case r'customBlobStore':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.customBlobStore.replace(valueDes);
          break;
        case r'customSegmentStore':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.customSegmentStore.replace(valueDes);
          break;
        case r'splitPersistence':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.splitPersistence.replace(valueDes);
          break;
        case r'repository.backup.dir':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.repositoryPeriodBackupPeriodDir.replace(valueDes);
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
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.role.replace(valueDes);
          break;
        case r'registerDescriptors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.registerDescriptors.replace(valueDes);
          break;
        case r'dispatchChanges':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.dispatchChanges.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBuilder();
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

