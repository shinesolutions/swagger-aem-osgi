//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_info.g.dart';

/// ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo implements Built<ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo, ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties? get properties;

  ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo._();

  factory ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo([void updates(ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder b)]) = _$ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo> get serializer => _$ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoSerializer();
}

class _$ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoSerializer implements PrimitiveSerializer<ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo, _$ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo];

  @override
  final String wireName = r'ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo object, {
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
        specifiedType: const FullType(ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder result,
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
            specifiedType: const FullType.nullable(ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties),
          ) as ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties?;
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
  ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder();
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

