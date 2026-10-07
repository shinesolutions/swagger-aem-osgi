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

part 'org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties.g.dart';

/// OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties
///
/// Properties:
/// * [name] 
/// * [type] 
/// * [formatPeriodTarget] 
/// * [tempFsFolder] 
/// * [fileThreshold] 
/// * [memoryUnit] 
/// * [useOffHeapMemory] 
/// * [digestAlgorithm] 
/// * [monitoringQueueSize] 
/// * [cleanupDelay] 
/// * [packagePeriodFilters] 
/// * [propertyPeriodFilters] 
@BuiltValue()
abstract class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties implements Built<OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties, OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'type')
  ConfigNodePropertyDropDown? get type;

  @BuiltValueField(wireName: r'format.target')
  ConfigNodePropertyString? get formatPeriodTarget;

  @BuiltValueField(wireName: r'tempFsFolder')
  ConfigNodePropertyString? get tempFsFolder;

  @BuiltValueField(wireName: r'fileThreshold')
  ConfigNodePropertyInteger? get fileThreshold;

  @BuiltValueField(wireName: r'memoryUnit')
  ConfigNodePropertyDropDown? get memoryUnit;

  @BuiltValueField(wireName: r'useOffHeapMemory')
  ConfigNodePropertyBoolean? get useOffHeapMemory;

  @BuiltValueField(wireName: r'digestAlgorithm')
  ConfigNodePropertyDropDown? get digestAlgorithm;

  @BuiltValueField(wireName: r'monitoringQueueSize')
  ConfigNodePropertyInteger? get monitoringQueueSize;

  @BuiltValueField(wireName: r'cleanupDelay')
  ConfigNodePropertyInteger? get cleanupDelay;

  @BuiltValueField(wireName: r'package.filters')
  ConfigNodePropertyArray? get packagePeriodFilters;

  @BuiltValueField(wireName: r'property.filters')
  ConfigNodePropertyArray? get propertyPeriodFilters;

  OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties._();

  factory OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties([void updates(OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder b)]) = _$OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties> get serializer => _$OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesSerializer();
}

class _$OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties, _$OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties object, {
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
    if (object.formatPeriodTarget != null) {
      yield r'format.target';
      yield serializers.serialize(
        object.formatPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.tempFsFolder != null) {
      yield r'tempFsFolder';
      yield serializers.serialize(
        object.tempFsFolder,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.fileThreshold != null) {
      yield r'fileThreshold';
      yield serializers.serialize(
        object.fileThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.memoryUnit != null) {
      yield r'memoryUnit';
      yield serializers.serialize(
        object.memoryUnit,
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
    if (object.cleanupDelay != null) {
      yield r'cleanupDelay';
      yield serializers.serialize(
        object.cleanupDelay,
        specifiedType: const FullType(ConfigNodePropertyInteger),
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
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder result,
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
        case r'format.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.formatPeriodTarget.replace(valueDes);
          break;
        case r'tempFsFolder':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.tempFsFolder.replace(valueDes);
          break;
        case r'fileThreshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.fileThreshold.replace(valueDes);
          break;
        case r'memoryUnit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.memoryUnit.replace(valueDes);
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
        case r'cleanupDelay':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cleanupDelay.replace(valueDes);
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesBuilder();
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

