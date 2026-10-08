//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties.g.dart';

/// OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties
///
/// Properties:
/// * [port] 
@BuiltValue()
abstract class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties implements Built<OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties, OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesBuilder> {
  @BuiltValueField(wireName: r'port')
  ConfigNodePropertyInteger? get port;

  OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties._();

  factory OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties([void updates(OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesBuilder b)]) = _$OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties> get serializer => _$OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesSerializer();
}

class _$OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties, _$OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties];

  @override
  final String wireName = r'OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.port != null) {
      yield r'port';
      yield serializers.serialize(
        object.port,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'port':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.port.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesBuilder();
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

