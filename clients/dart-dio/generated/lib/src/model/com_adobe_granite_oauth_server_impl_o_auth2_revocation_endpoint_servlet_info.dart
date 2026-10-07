//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_info.g.dart';

/// ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo implements Built<ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo, ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties? get properties;

  ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo._();

  factory ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo([void updates(ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfoBuilder b)]) = _$ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo> get serializer => _$ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfoSerializer();
}

class _$ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfoSerializer implements PrimitiveSerializer<ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo, _$ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo];

  @override
  final String wireName = r'ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties),
          ) as ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfoBuilder();
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

