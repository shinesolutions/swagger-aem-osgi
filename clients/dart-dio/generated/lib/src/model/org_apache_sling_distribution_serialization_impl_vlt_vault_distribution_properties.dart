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

part 'org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties.g.dart';

/// OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties
///
/// Properties:
/// * [name] 
/// * [type] 
/// * [importMode] 
/// * [aclHandling] 
/// * [packagePeriodRoots] 
/// * [packagePeriodFilters] 
/// * [propertyPeriodFilters] 
/// * [tempFsFolder] 
/// * [useBinaryReferences] 
/// * [autoSaveThreshold] 
/// * [cleanupDelay] 
/// * [fileThreshold] 
/// * [MEGA_BYTES] 
/// * [useOffHeapMemory] 
/// * [digestAlgorithm] 
/// * [monitoringQueueSize] 
/// * [pathsMapping] 
/// * [strictImport] 
@BuiltValue()
abstract class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties implements Built<OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties, OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'type')
  ConfigNodePropertyDropDown? get type;

  @BuiltValueField(wireName: r'importMode')
  ConfigNodePropertyString? get importMode;

  @BuiltValueField(wireName: r'aclHandling')
  ConfigNodePropertyString? get aclHandling;

  @BuiltValueField(wireName: r'package.roots')
  ConfigNodePropertyString? get packagePeriodRoots;

  @BuiltValueField(wireName: r'package.filters')
  ConfigNodePropertyArray? get packagePeriodFilters;

  @BuiltValueField(wireName: r'property.filters')
  ConfigNodePropertyArray? get propertyPeriodFilters;

  @BuiltValueField(wireName: r'tempFsFolder')
  ConfigNodePropertyString? get tempFsFolder;

  @BuiltValueField(wireName: r'useBinaryReferences')
  ConfigNodePropertyBoolean? get useBinaryReferences;

  @BuiltValueField(wireName: r'autoSaveThreshold')
  ConfigNodePropertyInteger? get autoSaveThreshold;

  @BuiltValueField(wireName: r'cleanupDelay')
  ConfigNodePropertyInteger? get cleanupDelay;

  @BuiltValueField(wireName: r'fileThreshold')
  ConfigNodePropertyInteger? get fileThreshold;

  @BuiltValueField(wireName: r'MEGA_BYTES')
  ConfigNodePropertyDropDown? get MEGA_BYTES;

  @BuiltValueField(wireName: r'useOffHeapMemory')
  ConfigNodePropertyBoolean? get useOffHeapMemory;

  @BuiltValueField(wireName: r'digestAlgorithm')
  ConfigNodePropertyDropDown? get digestAlgorithm;

  @BuiltValueField(wireName: r'monitoringQueueSize')
  ConfigNodePropertyInteger? get monitoringQueueSize;

  @BuiltValueField(wireName: r'pathsMapping')
  ConfigNodePropertyArray? get pathsMapping;

  @BuiltValueField(wireName: r'strictImport')
  ConfigNodePropertyBoolean? get strictImport;

  OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties._();

  factory OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties([void updates(OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder b)]) = _$OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties> get serializer => _$OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesSerializer();
}

class _$OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties, _$OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.importMode != null) {
      yield r'importMode';
      yield serializers.serialize(
        object.importMode,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.aclHandling != null) {
      yield r'aclHandling';
      yield serializers.serialize(
        object.aclHandling,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.packagePeriodRoots != null) {
      yield r'package.roots';
      yield serializers.serialize(
        object.packagePeriodRoots,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.packagePeriodFilters != null) {
      yield r'package.filters';
      yield serializers.serialize(
        object.packagePeriodFilters,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.propertyPeriodFilters != null) {
      yield r'property.filters';
      yield serializers.serialize(
        object.propertyPeriodFilters,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.tempFsFolder != null) {
      yield r'tempFsFolder';
      yield serializers.serialize(
        object.tempFsFolder,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.useBinaryReferences != null) {
      yield r'useBinaryReferences';
      yield serializers.serialize(
        object.useBinaryReferences,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.autoSaveThreshold != null) {
      yield r'autoSaveThreshold';
      yield serializers.serialize(
        object.autoSaveThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cleanupDelay != null) {
      yield r'cleanupDelay';
      yield serializers.serialize(
        object.cleanupDelay,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.fileThreshold != null) {
      yield r'fileThreshold';
      yield serializers.serialize(
        object.fileThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.MEGA_BYTES != null) {
      yield r'MEGA_BYTES';
      yield serializers.serialize(
        object.MEGA_BYTES,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.useOffHeapMemory != null) {
      yield r'useOffHeapMemory';
      yield serializers.serialize(
        object.useOffHeapMemory,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.digestAlgorithm != null) {
      yield r'digestAlgorithm';
      yield serializers.serialize(
        object.digestAlgorithm,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.monitoringQueueSize != null) {
      yield r'monitoringQueueSize';
      yield serializers.serialize(
        object.monitoringQueueSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.pathsMapping != null) {
      yield r'pathsMapping';
      yield serializers.serialize(
        object.pathsMapping,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.strictImport != null) {
      yield r'strictImport';
      yield serializers.serialize(
        object.strictImport,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.name.replace(valueDes);
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.type.replace(valueDes);
          break;
        case r'importMode':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.importMode.replace(valueDes);
          break;
        case r'aclHandling':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.aclHandling.replace(valueDes);
          break;
        case r'package.roots':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.packagePeriodRoots.replace(valueDes);
          break;
        case r'package.filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.packagePeriodFilters.replace(valueDes);
          break;
        case r'property.filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.propertyPeriodFilters.replace(valueDes);
          break;
        case r'tempFsFolder':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.tempFsFolder.replace(valueDes);
          break;
        case r'useBinaryReferences':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.useBinaryReferences.replace(valueDes);
          break;
        case r'autoSaveThreshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.autoSaveThreshold.replace(valueDes);
          break;
        case r'cleanupDelay':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cleanupDelay.replace(valueDes);
          break;
        case r'fileThreshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.fileThreshold.replace(valueDes);
          break;
        case r'MEGA_BYTES':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.MEGA_BYTES.replace(valueDes);
          break;
        case r'useOffHeapMemory':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.useOffHeapMemory.replace(valueDes);
          break;
        case r'digestAlgorithm':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.digestAlgorithm.replace(valueDes);
          break;
        case r'monitoringQueueSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.monitoringQueueSize.replace(valueDes);
          break;
        case r'pathsMapping':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.pathsMapping.replace(valueDes);
          break;
        case r'strictImport':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.strictImport.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesBuilder();
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

