//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_featureflags_impl_configured_feature_properties.g.dart';

/// OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties
///
/// Properties:
/// * [name] 
/// * [description] 
/// * [enabled] 
@BuiltValue()
abstract class OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties implements Built<OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties, OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'description')
  ConfigNodePropertyString? get description;

  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties._();

  factory OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties([void updates(OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder b)]) = _$OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties> get serializer => _$OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesSerializer();
}

class _$OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties, _$OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties];

  @override
  final String wireName = r'OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties object, {
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
    OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder result,
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
  OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder();
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

