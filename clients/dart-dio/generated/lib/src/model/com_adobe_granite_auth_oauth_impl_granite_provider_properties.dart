//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_oauth_impl_granite_provider_properties.g.dart';

/// ComAdobeGraniteAuthOauthImplGraniteProviderProperties
///
/// Properties:
/// * [oauthPeriodProviderPeriodId] 
/// * [oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl] 
/// * [oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl] 
/// * [oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl] 
/// * [oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls] 
@BuiltValue()
abstract class ComAdobeGraniteAuthOauthImplGraniteProviderProperties implements Built<ComAdobeGraniteAuthOauthImplGraniteProviderProperties, ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'oauth.provider.id')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodId;

  @BuiltValueField(wireName: r'oauth.provider.granite.authorization.url')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl;

  @BuiltValueField(wireName: r'oauth.provider.granite.token.url')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl;

  @BuiltValueField(wireName: r'oauth.provider.granite.profile.url')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl;

  @BuiltValueField(wireName: r'oauth.provider.granite.extended.details.urls')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls;

  ComAdobeGraniteAuthOauthImplGraniteProviderProperties._();

  factory ComAdobeGraniteAuthOauthImplGraniteProviderProperties([void updates(ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder b)]) = _$ComAdobeGraniteAuthOauthImplGraniteProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthOauthImplGraniteProviderProperties> get serializer => _$ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesSerializer();
}

class _$ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthOauthImplGraniteProviderProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthOauthImplGraniteProviderProperties, _$ComAdobeGraniteAuthOauthImplGraniteProviderProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthOauthImplGraniteProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthOauthImplGraniteProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.oauthPeriodProviderPeriodId != null) {
      yield r'oauth.provider.id';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl != null) {
      yield r'oauth.provider.granite.authorization.url';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl != null) {
      yield r'oauth.provider.granite.token.url';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl != null) {
      yield r'oauth.provider.granite.profile.url';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls != null) {
      yield r'oauth.provider.granite.extended.details.urls';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthOauthImplGraniteProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder result,
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
        case r'oauth.provider.granite.authorization.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl.replace(valueDes);
          break;
        case r'oauth.provider.granite.token.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl.replace(valueDes);
          break;
        case r'oauth.provider.granite.profile.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl.replace(valueDes);
          break;
        case r'oauth.provider.granite.extended.details.urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthOauthImplGraniteProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthOauthImplGraniteProviderPropertiesBuilder();
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

