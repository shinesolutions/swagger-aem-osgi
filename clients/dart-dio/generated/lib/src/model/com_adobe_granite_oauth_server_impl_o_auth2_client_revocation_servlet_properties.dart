//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet_properties.g.dart';

/// ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties
///
/// Properties:
/// * [oauthPeriodClientPeriodRevocationPeriodActive] 
@BuiltValue()
abstract class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties implements Built<ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties, ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'oauth.client.revocation.active')
  ConfigNodePropertyBoolean? get oauthPeriodClientPeriodRevocationPeriodActive;

  ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties._();

  factory ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties([void updates(ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesBuilder b)]) = _$ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties> get serializer => _$ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesSerializer();
}

class _$ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties, _$ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties];

  @override
  final String wireName = r'ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.oauthPeriodClientPeriodRevocationPeriodActive != null) {
      yield r'oauth.client.revocation.active';
      yield serializers.serialize(
        object.oauthPeriodClientPeriodRevocationPeriodActive,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'oauth.client.revocation.active':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.oauthPeriodClientPeriodRevocationPeriodActive.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesBuilder();
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

