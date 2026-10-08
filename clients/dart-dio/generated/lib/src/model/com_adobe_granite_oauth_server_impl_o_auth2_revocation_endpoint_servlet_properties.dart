//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties.g.dart';

/// ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties
///
/// Properties:
/// * [slingPeriodServletPeriodPaths] 
/// * [oauthPeriodRevocationPeriodActive] 
@BuiltValue()
abstract class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties implements Built<ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties, ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.servlet.paths')
  ConfigNodePropertyString? get slingPeriodServletPeriodPaths;

  @BuiltValueField(wireName: r'oauth.revocation.active')
  ConfigNodePropertyBoolean? get oauthPeriodRevocationPeriodActive;

  ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties._();

  factory ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties([void updates(ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesBuilder b)]) = _$ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties> get serializer => _$ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesSerializer();
}

class _$ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties, _$ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties];

  @override
  final String wireName = r'ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodServletPeriodPaths != null) {
      yield r'sling.servlet.paths';
      yield serializers.serialize(
        object.slingPeriodServletPeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodRevocationPeriodActive != null) {
      yield r'oauth.revocation.active';
      yield serializers.serialize(
        object.oauthPeriodRevocationPeriodActive,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.servlet.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodPaths.replace(valueDes);
          break;
        case r'oauth.revocation.active':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.oauthPeriodRevocationPeriodActive.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesBuilder();
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

