//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr_properties.g.dart';

/// OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties
///
/// Properties:
/// * [name] 
/// * [path] 
@BuiltValue()
abstract class OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties implements Built<OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties, OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties._();

  factory OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties([void updates(OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesBuilder b)]) = _$OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties> get serializer => _$OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesSerializer();
}

class _$OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties, _$OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties object, {
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
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesBuilder();
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

