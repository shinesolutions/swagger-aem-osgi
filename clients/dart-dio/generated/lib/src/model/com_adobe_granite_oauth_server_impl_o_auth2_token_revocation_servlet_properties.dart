//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties.g.dart';

/// ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties
///
/// Properties:
/// * [oauthPeriodTokenPeriodRevocationPeriodActive] 
@BuiltValue()
abstract class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties implements Built<ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties, ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'oauth.token.revocation.active')
  ConfigNodePropertyBoolean? get oauthPeriodTokenPeriodRevocationPeriodActive;

  ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties._();

  factory ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties([void updates(ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesBuilder b)]) = _$ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties> get serializer => _$ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesSerializer();
}

class _$ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties, _$ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties];

  @override
  final String wireName = r'ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.oauthPeriodTokenPeriodRevocationPeriodActive != null) {
      yield r'oauth.token.revocation.active';
      yield serializers.serialize(
        object.oauthPeriodTokenPeriodRevocationPeriodActive,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'oauth.token.revocation.active':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.oauthPeriodTokenPeriodRevocationPeriodActive.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesBuilder();
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

