//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_properties.g.dart';

/// ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties
///
/// Properties:
/// * [oauthPeriodCookiePeriodLoginPeriodTimeout] 
/// * [oauthPeriodCookiePeriodMaxPeriodAge] 
@BuiltValue()
abstract class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties implements Built<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties, ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesBuilder> {
  @BuiltValueField(wireName: r'oauth.cookie.login.timeout')
  ConfigNodePropertyString? get oauthPeriodCookiePeriodLoginPeriodTimeout;

  @BuiltValueField(wireName: r'oauth.cookie.max.age')
  ConfigNodePropertyString? get oauthPeriodCookiePeriodMaxPeriodAge;

  ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties._();

  factory ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties([void updates(ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesBuilder b)]) = _$ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties> get serializer => _$ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesSerializer();
}

class _$ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties, _$ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.oauthPeriodCookiePeriodLoginPeriodTimeout != null) {
      yield r'oauth.cookie.login.timeout';
      yield serializers.serialize(
        object.oauthPeriodCookiePeriodLoginPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodCookiePeriodMaxPeriodAge != null) {
      yield r'oauth.cookie.max.age';
      yield serializers.serialize(
        object.oauthPeriodCookiePeriodMaxPeriodAge,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'oauth.cookie.login.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodCookiePeriodLoginPeriodTimeout.replace(valueDes);
          break;
        case r'oauth.cookie.max.age':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodCookiePeriodMaxPeriodAge.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesBuilder();
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

