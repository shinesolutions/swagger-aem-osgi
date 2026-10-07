//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties.g.dart';

/// OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties
///
/// Properties:
/// * [name] 
/// * [path] 
/// * [ignoredPathsPatterns] 
/// * [serviceName] 
/// * [deep] 
@BuiltValue()
abstract class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties implements Built<OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties, OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  @BuiltValueField(wireName: r'ignoredPathsPatterns')
  ConfigNodePropertyArray? get ignoredPathsPatterns;

  @BuiltValueField(wireName: r'serviceName')
  ConfigNodePropertyString? get serviceName;

  @BuiltValueField(wireName: r'deep')
  ConfigNodePropertyBoolean? get deep;

  OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties._();

  factory OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties([void updates(OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder b)]) = _$OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties> get serializer => _$OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesSerializer();
}

class _$OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties, _$OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.ignoredPathsPatterns != null) {
      yield r'ignoredPathsPatterns';
      yield serializers.serialize(
        object.ignoredPathsPatterns,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.serviceName != null) {
      yield r'serviceName';
      yield serializers.serialize(
        object.serviceName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.deep != null) {
      yield r'deep';
      yield serializers.serialize(
        object.deep,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder result,
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
        case r'path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.path.replace(valueDes);
          break;
        case r'ignoredPathsPatterns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.ignoredPathsPatterns.replace(valueDes);
          break;
        case r'serviceName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.serviceName.replace(valueDes);
          break;
        case r'deep':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.deep.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder();
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

