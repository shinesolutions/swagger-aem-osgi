//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_hc_core_impl_jmx_attribute_health_check_properties.g.dart';

/// OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties
///
/// Properties:
/// * [hcPeriodName] 
/// * [hcPeriodTags] 
/// * [hcPeriodMbeanPeriodName] 
/// * [mbeanPeriodName] 
/// * [attributePeriodName] 
/// * [attributePeriodValuePeriodConstraint] 
@BuiltValue()
abstract class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties implements Built<OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties, OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.name')
  ConfigNodePropertyString? get hcPeriodName;

  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  @BuiltValueField(wireName: r'hc.mbean.name')
  ConfigNodePropertyString? get hcPeriodMbeanPeriodName;

  @BuiltValueField(wireName: r'mbean.name')
  ConfigNodePropertyString? get mbeanPeriodName;

  @BuiltValueField(wireName: r'attribute.name')
  ConfigNodePropertyString? get attributePeriodName;

  @BuiltValueField(wireName: r'attribute.value.constraint')
  ConfigNodePropertyString? get attributePeriodValuePeriodConstraint;

  OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties._();

  factory OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties([void updates(OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder b)]) = _$OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties> get serializer => _$OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesSerializer();
}

class _$OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties, _$OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties];

  @override
  final String wireName = r'OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodName != null) {
      yield r'hc.name';
      yield serializers.serialize(
        object.hcPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.hcPeriodMbeanPeriodName != null) {
      yield r'hc.mbean.name';
      yield serializers.serialize(
        object.hcPeriodMbeanPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.mbeanPeriodName != null) {
      yield r'mbean.name';
      yield serializers.serialize(
        object.mbeanPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.attributePeriodName != null) {
      yield r'attribute.name';
      yield serializers.serialize(
        object.attributePeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.attributePeriodValuePeriodConstraint != null) {
      yield r'attribute.value.constraint';
      yield serializers.serialize(
        object.attributePeriodValuePeriodConstraint,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hc.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.hcPeriodName.replace(valueDes);
          break;
        case r'hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.hcPeriodTags.replace(valueDes);
          break;
        case r'hc.mbean.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.hcPeriodMbeanPeriodName.replace(valueDes);
          break;
        case r'mbean.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.mbeanPeriodName.replace(valueDes);
          break;
        case r'attribute.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.attributePeriodName.replace(valueDes);
          break;
        case r'attribute.value.constraint':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.attributePeriodValuePeriodConstraint.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder();
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

