//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties.g.dart';

/// OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties
///
/// Properties:
/// * [protectExternalId] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties implements Built<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesBuilder> {
  @BuiltValueField(wireName: r'protectExternalId')
  ConfigNodePropertyBoolean? get protectExternalId;

  OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties._();

  factory OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties([void updates(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties> get serializer => _$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties, _$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.protectExternalId != null) {
      yield r'protectExternalId';
      yield serializers.serialize(
        object.protectExternalId,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'protectExternalId':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.protectExternalId.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesBuilder();
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

