//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_ims_impl_ims_provider_impl_properties.g.dart';

/// ComAdobeGraniteAuthImsImplIMSProviderImplProperties
///
/// Properties:
/// * [oauthPeriodProviderPeriodId] 
/// * [oauthPeriodProviderPeriodImsPeriodAuthorizationPeriodUrl] 
/// * [oauthPeriodProviderPeriodImsPeriodTokenPeriodUrl] 
/// * [oauthPeriodProviderPeriodImsPeriodProfilePeriodUrl] 
/// * [oauthPeriodProviderPeriodImsPeriodExtendedPeriodDetailsPeriodUrls] 
/// * [oauthPeriodProviderPeriodImsPeriodValidatePeriodTokenPeriodUrl] 
/// * [oauthPeriodProviderPeriodImsPeriodSessionPeriodProperty] 
/// * [oauthPeriodProviderPeriodImsPeriodServicePeriodTokenPeriodClientPeriodId] 
/// * [oauthPeriodProviderPeriodImsPeriodServicePeriodTokenPeriodClientPeriodSecret] 
/// * [oauthPeriodProviderPeriodImsPeriodServicePeriodToken] 
/// * [imsPeriodOrgPeriodRef] 
/// * [imsPeriodGroupPeriodMapping] 
/// * [oauthPeriodProviderPeriodImsPeriodOnlyPeriodLicensePeriodGroup] 
@BuiltValue()
abstract class ComAdobeGraniteAuthImsImplIMSProviderImplProperties implements Built<ComAdobeGraniteAuthImsImplIMSProviderImplProperties, ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'oauth.provider.id')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodId;

  @BuiltValueField(wireName: r'oauth.provider.ims.authorization.url')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodImsPeriodAuthorizationPeriodUrl;

  @BuiltValueField(wireName: r'oauth.provider.ims.token.url')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodImsPeriodTokenPeriodUrl;

  @BuiltValueField(wireName: r'oauth.provider.ims.profile.url')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodImsPeriodProfilePeriodUrl;

  @BuiltValueField(wireName: r'oauth.provider.ims.extended.details.urls')
  ConfigNodePropertyArray? get oauthPeriodProviderPeriodImsPeriodExtendedPeriodDetailsPeriodUrls;

  @BuiltValueField(wireName: r'oauth.provider.ims.validate.token.url')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodImsPeriodValidatePeriodTokenPeriodUrl;

  @BuiltValueField(wireName: r'oauth.provider.ims.session.property')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodImsPeriodSessionPeriodProperty;

  @BuiltValueField(wireName: r'oauth.provider.ims.service.token.client.id')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodImsPeriodServicePeriodTokenPeriodClientPeriodId;

  @BuiltValueField(wireName: r'oauth.provider.ims.service.token.client.secret')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodImsPeriodServicePeriodTokenPeriodClientPeriodSecret;

  @BuiltValueField(wireName: r'oauth.provider.ims.service.token')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodImsPeriodServicePeriodToken;

  @BuiltValueField(wireName: r'ims.org.ref')
  ConfigNodePropertyString? get imsPeriodOrgPeriodRef;

  @BuiltValueField(wireName: r'ims.group.mapping')
  ConfigNodePropertyArray? get imsPeriodGroupPeriodMapping;

  @BuiltValueField(wireName: r'oauth.provider.ims.only.license.group')
  ConfigNodePropertyBoolean? get oauthPeriodProviderPeriodImsPeriodOnlyPeriodLicensePeriodGroup;

  ComAdobeGraniteAuthImsImplIMSProviderImplProperties._();

  factory ComAdobeGraniteAuthImsImplIMSProviderImplProperties([void updates(ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder b)]) = _$ComAdobeGraniteAuthImsImplIMSProviderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthImsImplIMSProviderImplProperties> get serializer => _$ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesSerializer();
}

class _$ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthImsImplIMSProviderImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthImsImplIMSProviderImplProperties, _$ComAdobeGraniteAuthImsImplIMSProviderImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthImsImplIMSProviderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthImsImplIMSProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.oauthPeriodProviderPeriodId != null) {
      yield r'oauth.provider.id';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodProviderPeriodImsPeriodAuthorizationPeriodUrl != null) {
      yield r'oauth.provider.ims.authorization.url';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodImsPeriodAuthorizationPeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodProviderPeriodImsPeriodTokenPeriodUrl != null) {
      yield r'oauth.provider.ims.token.url';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodImsPeriodTokenPeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodProviderPeriodImsPeriodProfilePeriodUrl != null) {
      yield r'oauth.provider.ims.profile.url';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodImsPeriodProfilePeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodProviderPeriodImsPeriodExtendedPeriodDetailsPeriodUrls != null) {
      yield r'oauth.provider.ims.extended.details.urls';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodImsPeriodExtendedPeriodDetailsPeriodUrls,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.oauthPeriodProviderPeriodImsPeriodValidatePeriodTokenPeriodUrl != null) {
      yield r'oauth.provider.ims.validate.token.url';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodImsPeriodValidatePeriodTokenPeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodProviderPeriodImsPeriodSessionPeriodProperty != null) {
      yield r'oauth.provider.ims.session.property';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodImsPeriodSessionPeriodProperty,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodProviderPeriodImsPeriodServicePeriodTokenPeriodClientPeriodId != null) {
      yield r'oauth.provider.ims.service.token.client.id';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodImsPeriodServicePeriodTokenPeriodClientPeriodId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodProviderPeriodImsPeriodServicePeriodTokenPeriodClientPeriodSecret != null) {
      yield r'oauth.provider.ims.service.token.client.secret';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodImsPeriodServicePeriodTokenPeriodClientPeriodSecret,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodProviderPeriodImsPeriodServicePeriodToken != null) {
      yield r'oauth.provider.ims.service.token';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodImsPeriodServicePeriodToken,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.imsPeriodOrgPeriodRef != null) {
      yield r'ims.org.ref';
      yield serializers.serialize(
        object.imsPeriodOrgPeriodRef,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.imsPeriodGroupPeriodMapping != null) {
      yield r'ims.group.mapping';
      yield serializers.serialize(
        object.imsPeriodGroupPeriodMapping,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.oauthPeriodProviderPeriodImsPeriodOnlyPeriodLicensePeriodGroup != null) {
      yield r'oauth.provider.ims.only.license.group';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodImsPeriodOnlyPeriodLicensePeriodGroup,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthImsImplIMSProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder result,
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
        case r'oauth.provider.ims.authorization.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodImsPeriodAuthorizationPeriodUrl.replace(valueDes);
          break;
        case r'oauth.provider.ims.token.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodImsPeriodTokenPeriodUrl.replace(valueDes);
          break;
        case r'oauth.provider.ims.profile.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodImsPeriodProfilePeriodUrl.replace(valueDes);
          break;
        case r'oauth.provider.ims.extended.details.urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodImsPeriodExtendedPeriodDetailsPeriodUrls.replace(valueDes);
          break;
        case r'oauth.provider.ims.validate.token.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodImsPeriodValidatePeriodTokenPeriodUrl.replace(valueDes);
          break;
        case r'oauth.provider.ims.session.property':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodImsPeriodSessionPeriodProperty.replace(valueDes);
          break;
        case r'oauth.provider.ims.service.token.client.id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodImsPeriodServicePeriodTokenPeriodClientPeriodId.replace(valueDes);
          break;
        case r'oauth.provider.ims.service.token.client.secret':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodImsPeriodServicePeriodTokenPeriodClientPeriodSecret.replace(valueDes);
          break;
        case r'oauth.provider.ims.service.token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodImsPeriodServicePeriodToken.replace(valueDes);
          break;
        case r'ims.org.ref':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.imsPeriodOrgPeriodRef.replace(valueDes);
          break;
        case r'ims.group.mapping':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.imsPeriodGroupPeriodMapping.replace(valueDes);
          break;
        case r'oauth.provider.ims.only.license.group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodImsPeriodOnlyPeriodLicensePeriodGroup.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthImsImplIMSProviderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthImsImplIMSProviderImplPropertiesBuilder();
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

