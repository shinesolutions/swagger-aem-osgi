//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties.g.dart';

/// ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties
///
/// Properties:
/// * [path] 
/// * [jaasPeriodControlFlag] 
/// * [jaasPeriodRealmName] 
/// * [jaasPeriodRanking] 
/// * [oauthPeriodOfflinePeriodValidation] 
@BuiltValue()
abstract class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties implements Built<ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties, ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder> {
  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  @BuiltValueField(wireName: r'jaas.controlFlag')
  ConfigNodePropertyString? get jaasPeriodControlFlag;

  @BuiltValueField(wireName: r'jaas.realmName')
  ConfigNodePropertyString? get jaasPeriodRealmName;

  @BuiltValueField(wireName: r'jaas.ranking')
  ConfigNodePropertyInteger? get jaasPeriodRanking;

  @BuiltValueField(wireName: r'oauth.offline.validation')
  ConfigNodePropertyBoolean? get oauthPeriodOfflinePeriodValidation;

  ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties._();

  factory ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties([void updates(ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder b)]) = _$ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties> get serializer => _$ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesSerializer();
}

class _$ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties, _$ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties];

  @override
  final String wireName = r'ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jaasPeriodControlFlag != null) {
      yield r'jaas.controlFlag';
      yield serializers.serialize(
        object.jaasPeriodControlFlag,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jaasPeriodRealmName != null) {
      yield r'jaas.realmName';
      yield serializers.serialize(
        object.jaasPeriodRealmName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jaasPeriodRanking != null) {
      yield r'jaas.ranking';
      yield serializers.serialize(
        object.jaasPeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.oauthPeriodOfflinePeriodValidation != null) {
      yield r'oauth.offline.validation';
      yield serializers.serialize(
        object.oauthPeriodOfflinePeriodValidation,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.path.replace(valueDes);
          break;
        case r'jaas.controlFlag':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jaasPeriodControlFlag.replace(valueDes);
          break;
        case r'jaas.realmName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jaasPeriodRealmName.replace(valueDes);
          break;
        case r'jaas.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.jaasPeriodRanking.replace(valueDes);
          break;
        case r'oauth.offline.validation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.oauthPeriodOfflinePeriodValidation.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesBuilder();
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

