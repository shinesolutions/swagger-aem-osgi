//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_properties.g.dart';

/// ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties
///
/// Properties:
/// * [oauthPeriodCookiePeriodLoginPeriodTimeout] 
/// * [oauthPeriodCookiePeriodMaxPeriodAge] 
@BuiltValue()
abstract class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties implements Built<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties, ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesBuilder> {
  @BuiltValueField(wireName: r'oauth.cookie.login.timeout')
  ConfigNodePropertyString? get oauthPeriodCookiePeriodLoginPeriodTimeout;

  @BuiltValueField(wireName: r'oauth.cookie.max.age')
  ConfigNodePropertyString? get oauthPeriodCookiePeriodMaxPeriodAge;

  ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties._();

  factory ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties([void updates(ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesBuilder b)]) = _$ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties> get serializer => _$ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesSerializer();
}

class _$ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties, _$ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties object, {
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
    ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesBuilder result,
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
  ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesBuilder();
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

