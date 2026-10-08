//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_oauth_accesstoken_provider_properties.g.dart';

/// ComAdobeGraniteAuthOauthAccesstokenProviderProperties
///
/// Properties:
/// * [name] 
/// * [authPeriodTokenPeriodProviderPeriodTitle] 
/// * [authPeriodTokenPeriodProviderPeriodDefaultPeriodClaims] 
/// * [authPeriodTokenPeriodProviderPeriodEndpoint] 
/// * [authPeriodAccessPeriodTokenPeriodRequest] 
/// * [authPeriodTokenPeriodProviderPeriodKeypairPeriodAlias] 
/// * [authPeriodTokenPeriodProviderPeriodConnPeriodTimeout] 
/// * [authPeriodTokenPeriodProviderPeriodSoPeriodTimeout] 
/// * [authPeriodTokenPeriodProviderPeriodClientPeriodId] 
/// * [authPeriodTokenPeriodProviderPeriodScope] 
/// * [authPeriodTokenPeriodProviderPeriodReusePeriodAccessPeriodToken] 
/// * [authPeriodTokenPeriodProviderPeriodRelaxedPeriodSsl] 
/// * [tokenPeriodRequestPeriodCustomizerPeriodType] 
/// * [authPeriodTokenPeriodValidatorPeriodType] 
@BuiltValue()
abstract class ComAdobeGraniteAuthOauthAccesstokenProviderProperties implements Built<ComAdobeGraniteAuthOauthAccesstokenProviderProperties, ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'auth.token.provider.title')
  ConfigNodePropertyString? get authPeriodTokenPeriodProviderPeriodTitle;

  @BuiltValueField(wireName: r'auth.token.provider.default.claims')
  ConfigNodePropertyArray? get authPeriodTokenPeriodProviderPeriodDefaultPeriodClaims;

  @BuiltValueField(wireName: r'auth.token.provider.endpoint')
  ConfigNodePropertyString? get authPeriodTokenPeriodProviderPeriodEndpoint;

  @BuiltValueField(wireName: r'auth.access.token.request')
  ConfigNodePropertyString? get authPeriodAccessPeriodTokenPeriodRequest;

  @BuiltValueField(wireName: r'auth.token.provider.keypair.alias')
  ConfigNodePropertyString? get authPeriodTokenPeriodProviderPeriodKeypairPeriodAlias;

  @BuiltValueField(wireName: r'auth.token.provider.conn.timeout')
  ConfigNodePropertyInteger? get authPeriodTokenPeriodProviderPeriodConnPeriodTimeout;

  @BuiltValueField(wireName: r'auth.token.provider.so.timeout')
  ConfigNodePropertyInteger? get authPeriodTokenPeriodProviderPeriodSoPeriodTimeout;

  @BuiltValueField(wireName: r'auth.token.provider.client.id')
  ConfigNodePropertyString? get authPeriodTokenPeriodProviderPeriodClientPeriodId;

  @BuiltValueField(wireName: r'auth.token.provider.scope')
  ConfigNodePropertyString? get authPeriodTokenPeriodProviderPeriodScope;

  @BuiltValueField(wireName: r'auth.token.provider.reuse.access.token')
  ConfigNodePropertyBoolean? get authPeriodTokenPeriodProviderPeriodReusePeriodAccessPeriodToken;

  @BuiltValueField(wireName: r'auth.token.provider.relaxed.ssl')
  ConfigNodePropertyBoolean? get authPeriodTokenPeriodProviderPeriodRelaxedPeriodSsl;

  @BuiltValueField(wireName: r'token.request.customizer.type')
  ConfigNodePropertyString? get tokenPeriodRequestPeriodCustomizerPeriodType;

  @BuiltValueField(wireName: r'auth.token.validator.type')
  ConfigNodePropertyString? get authPeriodTokenPeriodValidatorPeriodType;

  ComAdobeGraniteAuthOauthAccesstokenProviderProperties._();

  factory ComAdobeGraniteAuthOauthAccesstokenProviderProperties([void updates(ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder b)]) = _$ComAdobeGraniteAuthOauthAccesstokenProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthOauthAccesstokenProviderProperties> get serializer => _$ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesSerializer();
}

class _$ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthOauthAccesstokenProviderProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthOauthAccesstokenProviderProperties, _$ComAdobeGraniteAuthOauthAccesstokenProviderProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthOauthAccesstokenProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthOauthAccesstokenProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodTokenPeriodProviderPeriodTitle != null) {
      yield r'auth.token.provider.title';
      yield serializers.serialize(
        object.authPeriodTokenPeriodProviderPeriodTitle,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodTokenPeriodProviderPeriodDefaultPeriodClaims != null) {
      yield r'auth.token.provider.default.claims';
      yield serializers.serialize(
        object.authPeriodTokenPeriodProviderPeriodDefaultPeriodClaims,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.authPeriodTokenPeriodProviderPeriodEndpoint != null) {
      yield r'auth.token.provider.endpoint';
      yield serializers.serialize(
        object.authPeriodTokenPeriodProviderPeriodEndpoint,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodAccessPeriodTokenPeriodRequest != null) {
      yield r'auth.access.token.request';
      yield serializers.serialize(
        object.authPeriodAccessPeriodTokenPeriodRequest,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodTokenPeriodProviderPeriodKeypairPeriodAlias != null) {
      yield r'auth.token.provider.keypair.alias';
      yield serializers.serialize(
        object.authPeriodTokenPeriodProviderPeriodKeypairPeriodAlias,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodTokenPeriodProviderPeriodConnPeriodTimeout != null) {
      yield r'auth.token.provider.conn.timeout';
      yield serializers.serialize(
        object.authPeriodTokenPeriodProviderPeriodConnPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.authPeriodTokenPeriodProviderPeriodSoPeriodTimeout != null) {
      yield r'auth.token.provider.so.timeout';
      yield serializers.serialize(
        object.authPeriodTokenPeriodProviderPeriodSoPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.authPeriodTokenPeriodProviderPeriodClientPeriodId != null) {
      yield r'auth.token.provider.client.id';
      yield serializers.serialize(
        object.authPeriodTokenPeriodProviderPeriodClientPeriodId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodTokenPeriodProviderPeriodScope != null) {
      yield r'auth.token.provider.scope';
      yield serializers.serialize(
        object.authPeriodTokenPeriodProviderPeriodScope,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodTokenPeriodProviderPeriodReusePeriodAccessPeriodToken != null) {
      yield r'auth.token.provider.reuse.access.token';
      yield serializers.serialize(
        object.authPeriodTokenPeriodProviderPeriodReusePeriodAccessPeriodToken,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.authPeriodTokenPeriodProviderPeriodRelaxedPeriodSsl != null) {
      yield r'auth.token.provider.relaxed.ssl';
      yield serializers.serialize(
        object.authPeriodTokenPeriodProviderPeriodRelaxedPeriodSsl,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.tokenPeriodRequestPeriodCustomizerPeriodType != null) {
      yield r'token.request.customizer.type';
      yield serializers.serialize(
        object.tokenPeriodRequestPeriodCustomizerPeriodType,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodTokenPeriodValidatorPeriodType != null) {
      yield r'auth.token.validator.type';
      yield serializers.serialize(
        object.authPeriodTokenPeriodValidatorPeriodType,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthOauthAccesstokenProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.name.replace(valueDes);
          break;
        case r'auth.token.provider.title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodTokenPeriodProviderPeriodTitle.replace(valueDes);
          break;
        case r'auth.token.provider.default.claims':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.authPeriodTokenPeriodProviderPeriodDefaultPeriodClaims.replace(valueDes);
          break;
        case r'auth.token.provider.endpoint':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodTokenPeriodProviderPeriodEndpoint.replace(valueDes);
          break;
        case r'auth.access.token.request':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodAccessPeriodTokenPeriodRequest.replace(valueDes);
          break;
        case r'auth.token.provider.keypair.alias':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodTokenPeriodProviderPeriodKeypairPeriodAlias.replace(valueDes);
          break;
        case r'auth.token.provider.conn.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.authPeriodTokenPeriodProviderPeriodConnPeriodTimeout.replace(valueDes);
          break;
        case r'auth.token.provider.so.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.authPeriodTokenPeriodProviderPeriodSoPeriodTimeout.replace(valueDes);
          break;
        case r'auth.token.provider.client.id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodTokenPeriodProviderPeriodClientPeriodId.replace(valueDes);
          break;
        case r'auth.token.provider.scope':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodTokenPeriodProviderPeriodScope.replace(valueDes);
          break;
        case r'auth.token.provider.reuse.access.token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.authPeriodTokenPeriodProviderPeriodReusePeriodAccessPeriodToken.replace(valueDes);
          break;
        case r'auth.token.provider.relaxed.ssl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.authPeriodTokenPeriodProviderPeriodRelaxedPeriodSsl.replace(valueDes);
          break;
        case r'token.request.customizer.type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.tokenPeriodRequestPeriodCustomizerPeriodType.replace(valueDes);
          break;
        case r'auth.token.validator.type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodTokenPeriodValidatorPeriodType.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthOauthAccesstokenProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthOauthAccesstokenProviderPropertiesBuilder();
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

