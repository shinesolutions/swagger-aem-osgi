//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_oauth_provider_properties.g.dart';

/// ComAdobeGraniteAuthOauthProviderProperties
///
/// Properties:
/// * [oauthPeriodConfigPeriodId] 
/// * [oauthPeriodClientPeriodId] 
/// * [oauthPeriodClientPeriodSecret] 
/// * [oauthPeriodScope] 
/// * [oauthPeriodConfigPeriodProviderPeriodId] 
/// * [oauthPeriodCreatePeriodUsers] 
/// * [oauthPeriodUseridPeriodProperty] 
/// * [forcePeriodStrictPeriodUsernamePeriodMatching] 
/// * [oauthPeriodEncodePeriodUserids] 
/// * [oauthPeriodHashPeriodUserids] 
/// * [oauthPeriodCallBackUrl] 
/// * [oauthPeriodAccessPeriodTokenPeriodPersist] 
/// * [oauthPeriodAccessPeriodTokenPeriodPersistPeriodCookie] 
/// * [oauthPeriodCsrfPeriodStatePeriodProtection] 
/// * [oauthPeriodRedirectPeriodRequestPeriodParams] 
/// * [oauthPeriodConfigPeriodSiblingsPeriodAllow] 
@BuiltValue()
abstract class ComAdobeGraniteAuthOauthProviderProperties implements Built<ComAdobeGraniteAuthOauthProviderProperties, ComAdobeGraniteAuthOauthProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'oauth.config.id')
  ConfigNodePropertyString? get oauthPeriodConfigPeriodId;

  @BuiltValueField(wireName: r'oauth.client.id')
  ConfigNodePropertyString? get oauthPeriodClientPeriodId;

  @BuiltValueField(wireName: r'oauth.client.secret')
  ConfigNodePropertyString? get oauthPeriodClientPeriodSecret;

  @BuiltValueField(wireName: r'oauth.scope')
  ConfigNodePropertyArray? get oauthPeriodScope;

  @BuiltValueField(wireName: r'oauth.config.provider.id')
  ConfigNodePropertyString? get oauthPeriodConfigPeriodProviderPeriodId;

  @BuiltValueField(wireName: r'oauth.create.users')
  ConfigNodePropertyBoolean? get oauthPeriodCreatePeriodUsers;

  @BuiltValueField(wireName: r'oauth.userid.property')
  ConfigNodePropertyString? get oauthPeriodUseridPeriodProperty;

  @BuiltValueField(wireName: r'force.strict.username.matching')
  ConfigNodePropertyBoolean? get forcePeriodStrictPeriodUsernamePeriodMatching;

  @BuiltValueField(wireName: r'oauth.encode.userids')
  ConfigNodePropertyBoolean? get oauthPeriodEncodePeriodUserids;

  @BuiltValueField(wireName: r'oauth.hash.userids')
  ConfigNodePropertyBoolean? get oauthPeriodHashPeriodUserids;

  @BuiltValueField(wireName: r'oauth.callBackUrl')
  ConfigNodePropertyString? get oauthPeriodCallBackUrl;

  @BuiltValueField(wireName: r'oauth.access.token.persist')
  ConfigNodePropertyBoolean? get oauthPeriodAccessPeriodTokenPeriodPersist;

  @BuiltValueField(wireName: r'oauth.access.token.persist.cookie')
  ConfigNodePropertyBoolean? get oauthPeriodAccessPeriodTokenPeriodPersistPeriodCookie;

  @BuiltValueField(wireName: r'oauth.csrf.state.protection')
  ConfigNodePropertyBoolean? get oauthPeriodCsrfPeriodStatePeriodProtection;

  @BuiltValueField(wireName: r'oauth.redirect.request.params')
  ConfigNodePropertyBoolean? get oauthPeriodRedirectPeriodRequestPeriodParams;

  @BuiltValueField(wireName: r'oauth.config.siblings.allow')
  ConfigNodePropertyBoolean? get oauthPeriodConfigPeriodSiblingsPeriodAllow;

  ComAdobeGraniteAuthOauthProviderProperties._();

  factory ComAdobeGraniteAuthOauthProviderProperties([void updates(ComAdobeGraniteAuthOauthProviderPropertiesBuilder b)]) = _$ComAdobeGraniteAuthOauthProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthOauthProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthOauthProviderProperties> get serializer => _$ComAdobeGraniteAuthOauthProviderPropertiesSerializer();
}

class _$ComAdobeGraniteAuthOauthProviderPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthOauthProviderProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthOauthProviderProperties, _$ComAdobeGraniteAuthOauthProviderProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthOauthProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthOauthProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.oauthPeriodConfigPeriodId != null) {
      yield r'oauth.config.id';
      yield serializers.serialize(
        object.oauthPeriodConfigPeriodId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodClientPeriodId != null) {
      yield r'oauth.client.id';
      yield serializers.serialize(
        object.oauthPeriodClientPeriodId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodClientPeriodSecret != null) {
      yield r'oauth.client.secret';
      yield serializers.serialize(
        object.oauthPeriodClientPeriodSecret,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodScope != null) {
      yield r'oauth.scope';
      yield serializers.serialize(
        object.oauthPeriodScope,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.oauthPeriodConfigPeriodProviderPeriodId != null) {
      yield r'oauth.config.provider.id';
      yield serializers.serialize(
        object.oauthPeriodConfigPeriodProviderPeriodId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodCreatePeriodUsers != null) {
      yield r'oauth.create.users';
      yield serializers.serialize(
        object.oauthPeriodCreatePeriodUsers,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.oauthPeriodUseridPeriodProperty != null) {
      yield r'oauth.userid.property';
      yield serializers.serialize(
        object.oauthPeriodUseridPeriodProperty,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.forcePeriodStrictPeriodUsernamePeriodMatching != null) {
      yield r'force.strict.username.matching';
      yield serializers.serialize(
        object.forcePeriodStrictPeriodUsernamePeriodMatching,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.oauthPeriodEncodePeriodUserids != null) {
      yield r'oauth.encode.userids';
      yield serializers.serialize(
        object.oauthPeriodEncodePeriodUserids,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.oauthPeriodHashPeriodUserids != null) {
      yield r'oauth.hash.userids';
      yield serializers.serialize(
        object.oauthPeriodHashPeriodUserids,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.oauthPeriodCallBackUrl != null) {
      yield r'oauth.callBackUrl';
      yield serializers.serialize(
        object.oauthPeriodCallBackUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodAccessPeriodTokenPeriodPersist != null) {
      yield r'oauth.access.token.persist';
      yield serializers.serialize(
        object.oauthPeriodAccessPeriodTokenPeriodPersist,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.oauthPeriodAccessPeriodTokenPeriodPersistPeriodCookie != null) {
      yield r'oauth.access.token.persist.cookie';
      yield serializers.serialize(
        object.oauthPeriodAccessPeriodTokenPeriodPersistPeriodCookie,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.oauthPeriodCsrfPeriodStatePeriodProtection != null) {
      yield r'oauth.csrf.state.protection';
      yield serializers.serialize(
        object.oauthPeriodCsrfPeriodStatePeriodProtection,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.oauthPeriodRedirectPeriodRequestPeriodParams != null) {
      yield r'oauth.redirect.request.params';
      yield serializers.serialize(
        object.oauthPeriodRedirectPeriodRequestPeriodParams,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.oauthPeriodConfigPeriodSiblingsPeriodAllow != null) {
      yield r'oauth.config.siblings.allow';
      yield serializers.serialize(
        object.oauthPeriodConfigPeriodSiblingsPeriodAllow,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthOauthProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthOauthProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'oauth.config.id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodConfigPeriodId.replace(valueDes);
          break;
        case r'oauth.client.id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodClientPeriodId.replace(valueDes);
          break;
        case r'oauth.client.secret':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodClientPeriodSecret.replace(valueDes);
          break;
        case r'oauth.scope':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.oauthPeriodScope.replace(valueDes);
          break;
        case r'oauth.config.provider.id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodConfigPeriodProviderPeriodId.replace(valueDes);
          break;
        case r'oauth.create.users':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.oauthPeriodCreatePeriodUsers.replace(valueDes);
          break;
        case r'oauth.userid.property':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodUseridPeriodProperty.replace(valueDes);
          break;
        case r'force.strict.username.matching':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.forcePeriodStrictPeriodUsernamePeriodMatching.replace(valueDes);
          break;
        case r'oauth.encode.userids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.oauthPeriodEncodePeriodUserids.replace(valueDes);
          break;
        case r'oauth.hash.userids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.oauthPeriodHashPeriodUserids.replace(valueDes);
          break;
        case r'oauth.callBackUrl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodCallBackUrl.replace(valueDes);
          break;
        case r'oauth.access.token.persist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.oauthPeriodAccessPeriodTokenPeriodPersist.replace(valueDes);
          break;
        case r'oauth.access.token.persist.cookie':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.oauthPeriodAccessPeriodTokenPeriodPersistPeriodCookie.replace(valueDes);
          break;
        case r'oauth.csrf.state.protection':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.oauthPeriodCsrfPeriodStatePeriodProtection.replace(valueDes);
          break;
        case r'oauth.redirect.request.params':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.oauthPeriodRedirectPeriodRequestPeriodParams.replace(valueDes);
          break;
        case r'oauth.config.siblings.allow':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.oauthPeriodConfigPeriodSiblingsPeriodAllow.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthOauthProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthOauthProviderPropertiesBuilder();
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

