//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_caconfig_impl_configuration_bindings_value_provider_properties.g.dart';

/// OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties
///
/// Properties:
/// * [enabled] 
@BuiltValue()
abstract class OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties implements Built<OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties, OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties._();

  factory OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties([void updates(OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesBuilder b)]) = _$OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties> get serializer => _$OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesSerializer();
}

class _$OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties, _$OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties];

  @override
  final String wireName = r'OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesBuilder();
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

