//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_properties.g.dart';

/// ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties
///
/// Properties:
/// * [oauthPeriodIssuer] 
/// * [oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn] 
/// * [osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern] 
/// * [osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect] 
@BuiltValue()
abstract class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties implements Built<ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties, ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'oauth.issuer')
  ConfigNodePropertyString? get oauthPeriodIssuer;

  @BuiltValueField(wireName: r'oauth.access.token.expires.in')
  ConfigNodePropertyString? get oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn;

  @BuiltValueField(wireName: r'osgi.http.whiteboard.servlet.pattern')
  ConfigNodePropertyString? get osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern;

  @BuiltValueField(wireName: r'osgi.http.whiteboard.context.select')
  ConfigNodePropertyString? get osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect;

  ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties._();

  factory ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties([void updates(ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder b)]) = _$ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties> get serializer => _$ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesSerializer();
}

class _$ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties, _$ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties];

  @override
  final String wireName = r'ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.oauthPeriodIssuer != null) {
      yield r'oauth.issuer';
      yield serializers.serialize(
        object.oauthPeriodIssuer,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn != null) {
      yield r'oauth.access.token.expires.in';
      yield serializers.serialize(
        object.oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern != null) {
      yield r'osgi.http.whiteboard.servlet.pattern';
      yield serializers.serialize(
        object.osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect != null) {
      yield r'osgi.http.whiteboard.context.select';
      yield serializers.serialize(
        object.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'oauth.issuer':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodIssuer.replace(valueDes);
          break;
        case r'oauth.access.token.expires.in':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn.replace(valueDes);
          break;
        case r'osgi.http.whiteboard.servlet.pattern':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern.replace(valueDes);
          break;
        case r'osgi.http.whiteboard.context.select':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesBuilder();
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

