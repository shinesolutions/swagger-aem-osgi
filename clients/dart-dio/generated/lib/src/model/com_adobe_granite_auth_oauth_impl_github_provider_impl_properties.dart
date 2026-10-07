//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_oauth_impl_github_provider_impl_properties.g.dart';

/// ComAdobeGraniteAuthOauthImplGithubProviderImplProperties
///
/// Properties:
/// * [oauthPeriodProviderPeriodId] 
/// * [oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl] 
/// * [oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl] 
/// * [oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl] 
@BuiltValue()
abstract class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties implements Built<ComAdobeGraniteAuthOauthImplGithubProviderImplProperties, ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'oauth.provider.id')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodId;

  @BuiltValueField(wireName: r'oauth.provider.github.authorization.url')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl;

  @BuiltValueField(wireName: r'oauth.provider.github.token.url')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl;

  @BuiltValueField(wireName: r'oauth.provider.github.profile.url')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl;

  ComAdobeGraniteAuthOauthImplGithubProviderImplProperties._();

  factory ComAdobeGraniteAuthOauthImplGithubProviderImplProperties([void updates(ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder b)]) = _$ComAdobeGraniteAuthOauthImplGithubProviderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthOauthImplGithubProviderImplProperties> get serializer => _$ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesSerializer();
}

class _$ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthOauthImplGithubProviderImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthOauthImplGithubProviderImplProperties, _$ComAdobeGraniteAuthOauthImplGithubProviderImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthOauthImplGithubProviderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthOauthImplGithubProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.oauthPeriodProviderPeriodId != null) {
      yield r'oauth.provider.id';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl != null) {
      yield r'oauth.provider.github.authorization.url';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl != null) {
      yield r'oauth.provider.github.token.url';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl != null) {
      yield r'oauth.provider.github.profile.url';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthOauthImplGithubProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'oauth.provider.id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodId.replace(valueDes);
          break;
        case r'oauth.provider.github.authorization.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl.replace(valueDes);
          break;
        case r'oauth.provider.github.token.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl.replace(valueDes);
          break;
        case r'oauth.provider.github.profile.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthOauthImplGithubProviderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthOauthImplGithubProviderImplPropertiesBuilder();
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

