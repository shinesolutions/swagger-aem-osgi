//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties.g.dart';

/// ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties
///
/// Properties:
/// * [path] 
/// * [oauthPeriodClientIdsPeriodAllowed] 
/// * [authPeriodBearerPeriodSyncPeriodIms] 
/// * [authPeriodTokenRequestParameter] 
/// * [oauthPeriodBearerPeriodConfigid] 
/// * [oauthPeriodJwtPeriodSupport] 
@BuiltValue()
abstract class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties implements Built<ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties, ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  @BuiltValueField(wireName: r'oauth.clientIds.allowed')
  ConfigNodePropertyArray? get oauthPeriodClientIdsPeriodAllowed;

  @BuiltValueField(wireName: r'auth.bearer.sync.ims')
  ConfigNodePropertyBoolean? get authPeriodBearerPeriodSyncPeriodIms;

  @BuiltValueField(wireName: r'auth.tokenRequestParameter')
  ConfigNodePropertyString? get authPeriodTokenRequestParameter;

  @BuiltValueField(wireName: r'oauth.bearer.configid')
  ConfigNodePropertyString? get oauthPeriodBearerPeriodConfigid;

  @BuiltValueField(wireName: r'oauth.jwt.support')
  ConfigNodePropertyBoolean? get oauthPeriodJwtPeriodSupport;

  ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties._();

  factory ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties([void updates(ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder b)]) = _$ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties> get serializer => _$ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesSerializer();
}

class _$ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties, _$ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodClientIdsPeriodAllowed != null) {
      yield r'oauth.clientIds.allowed';
      yield serializers.serialize(
        object.oauthPeriodClientIdsPeriodAllowed,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.authPeriodBearerPeriodSyncPeriodIms != null) {
      yield r'auth.bearer.sync.ims';
      yield serializers.serialize(
        object.authPeriodBearerPeriodSyncPeriodIms,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.authPeriodTokenRequestParameter != null) {
      yield r'auth.tokenRequestParameter';
      yield serializers.serialize(
        object.authPeriodTokenRequestParameter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodBearerPeriodConfigid != null) {
      yield r'oauth.bearer.configid';
      yield serializers.serialize(
        object.oauthPeriodBearerPeriodConfigid,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodJwtPeriodSupport != null) {
      yield r'oauth.jwt.support';
      yield serializers.serialize(
        object.oauthPeriodJwtPeriodSupport,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder result,
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
        case r'oauth.clientIds.allowed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.oauthPeriodClientIdsPeriodAllowed.replace(valueDes);
          break;
        case r'auth.bearer.sync.ims':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.authPeriodBearerPeriodSyncPeriodIms.replace(valueDes);
          break;
        case r'auth.tokenRequestParameter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodTokenRequestParameter.replace(valueDes);
          break;
        case r'oauth.bearer.configid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodBearerPeriodConfigid.replace(valueDes);
          break;
        case r'oauth.jwt.support':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.oauthPeriodJwtPeriodSupport.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesBuilder();
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

