//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_featureflags_feature_properties.g.dart';

/// OrgApacheSlingFeatureflagsFeatureProperties
///
/// Properties:
/// * [name] 
/// * [description] 
/// * [enabled] 
@BuiltValue()
abstract class OrgApacheSlingFeatureflagsFeatureProperties implements Built<OrgApacheSlingFeatureflagsFeatureProperties, OrgApacheSlingFeatureflagsFeaturePropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'description')
  ConfigNodePropertyString? get description;

  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  OrgApacheSlingFeatureflagsFeatureProperties._();

  factory OrgApacheSlingFeatureflagsFeatureProperties([void updates(OrgApacheSlingFeatureflagsFeaturePropertiesBuilder b)]) = _$OrgApacheSlingFeatureflagsFeatureProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingFeatureflagsFeaturePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingFeatureflagsFeatureProperties> get serializer => _$OrgApacheSlingFeatureflagsFeaturePropertiesSerializer();
}

class _$OrgApacheSlingFeatureflagsFeaturePropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingFeatureflagsFeatureProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingFeatureflagsFeatureProperties, _$OrgApacheSlingFeatureflagsFeatureProperties];

  @override
  final String wireName = r'OrgApacheSlingFeatureflagsFeatureProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingFeatureflagsFeatureProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingFeatureflagsFeatureProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingFeatureflagsFeaturePropertiesBuilder result,
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
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.description.replace(valueDes);
          break;
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingFeatureflagsFeatureProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingFeatureflagsFeaturePropertiesBuilder();
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

