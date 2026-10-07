//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_engine_impl_auth_sling_authenticator_properties.g.dart';

/// OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties
///
/// Properties:
/// * [osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect] 
/// * [osgiPeriodHttpPeriodWhiteboardPeriodListener] 
/// * [authPeriodSudoPeriodCookie] 
/// * [authPeriodSudoPeriodParameter] 
/// * [authPeriodAnnonymous] 
/// * [slingPeriodAuthPeriodRequirements] 
/// * [slingPeriodAuthPeriodAnonymousPeriodUser] 
/// * [slingPeriodAuthPeriodAnonymousPeriodPassword] 
/// * [authPeriodHttp] 
/// * [authPeriodHttpPeriodRealm] 
/// * [authPeriodUriPeriodSuffix] 
@BuiltValue()
abstract class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties implements Built<OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties, OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder> {
  @BuiltValueField(wireName: r'osgi.http.whiteboard.context.select')
  ConfigNodePropertyString? get osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect;

  @BuiltValueField(wireName: r'osgi.http.whiteboard.listener')
  ConfigNodePropertyString? get osgiPeriodHttpPeriodWhiteboardPeriodListener;

  @BuiltValueField(wireName: r'auth.sudo.cookie')
  ConfigNodePropertyString? get authPeriodSudoPeriodCookie;

  @BuiltValueField(wireName: r'auth.sudo.parameter')
  ConfigNodePropertyString? get authPeriodSudoPeriodParameter;

  @BuiltValueField(wireName: r'auth.annonymous')
  ConfigNodePropertyBoolean? get authPeriodAnnonymous;

  @BuiltValueField(wireName: r'sling.auth.requirements')
  ConfigNodePropertyArray? get slingPeriodAuthPeriodRequirements;

  @BuiltValueField(wireName: r'sling.auth.anonymous.user')
  ConfigNodePropertyString? get slingPeriodAuthPeriodAnonymousPeriodUser;

  @BuiltValueField(wireName: r'sling.auth.anonymous.password')
  ConfigNodePropertyString? get slingPeriodAuthPeriodAnonymousPeriodPassword;

  @BuiltValueField(wireName: r'auth.http')
  ConfigNodePropertyDropDown? get authPeriodHttp;

  @BuiltValueField(wireName: r'auth.http.realm')
  ConfigNodePropertyString? get authPeriodHttpPeriodRealm;

  @BuiltValueField(wireName: r'auth.uri.suffix')
  ConfigNodePropertyArray? get authPeriodUriPeriodSuffix;

  OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties._();

  factory OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties([void updates(OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder b)]) = _$OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties> get serializer => _$OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesSerializer();
}

class _$OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties, _$OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties];

  @override
  final String wireName = r'OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect != null) {
      yield r'osgi.http.whiteboard.context.select';
      yield serializers.serialize(
        object.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.osgiPeriodHttpPeriodWhiteboardPeriodListener != null) {
      yield r'osgi.http.whiteboard.listener';
      yield serializers.serialize(
        object.osgiPeriodHttpPeriodWhiteboardPeriodListener,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodSudoPeriodCookie != null) {
      yield r'auth.sudo.cookie';
      yield serializers.serialize(
        object.authPeriodSudoPeriodCookie,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodSudoPeriodParameter != null) {
      yield r'auth.sudo.parameter';
      yield serializers.serialize(
        object.authPeriodSudoPeriodParameter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodAnnonymous != null) {
      yield r'auth.annonymous';
      yield serializers.serialize(
        object.authPeriodAnnonymous,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.slingPeriodAuthPeriodRequirements != null) {
      yield r'sling.auth.requirements';
      yield serializers.serialize(
        object.slingPeriodAuthPeriodRequirements,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.slingPeriodAuthPeriodAnonymousPeriodUser != null) {
      yield r'sling.auth.anonymous.user';
      yield serializers.serialize(
        object.slingPeriodAuthPeriodAnonymousPeriodUser,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodAuthPeriodAnonymousPeriodPassword != null) {
      yield r'sling.auth.anonymous.password';
      yield serializers.serialize(
        object.slingPeriodAuthPeriodAnonymousPeriodPassword,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodHttp != null) {
      yield r'auth.http';
      yield serializers.serialize(
        object.authPeriodHttp,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.authPeriodHttpPeriodRealm != null) {
      yield r'auth.http.realm';
      yield serializers.serialize(
        object.authPeriodHttpPeriodRealm,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodUriPeriodSuffix != null) {
      yield r'auth.uri.suffix';
      yield serializers.serialize(
        object.authPeriodUriPeriodSuffix,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'osgi.http.whiteboard.context.select':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect.replace(valueDes);
          break;
        case r'osgi.http.whiteboard.listener':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.osgiPeriodHttpPeriodWhiteboardPeriodListener.replace(valueDes);
          break;
        case r'auth.sudo.cookie':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodSudoPeriodCookie.replace(valueDes);
          break;
        case r'auth.sudo.parameter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodSudoPeriodParameter.replace(valueDes);
          break;
        case r'auth.annonymous':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.authPeriodAnnonymous.replace(valueDes);
          break;
        case r'sling.auth.requirements':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.slingPeriodAuthPeriodRequirements.replace(valueDes);
          break;
        case r'sling.auth.anonymous.user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodAuthPeriodAnonymousPeriodUser.replace(valueDes);
          break;
        case r'sling.auth.anonymous.password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodAuthPeriodAnonymousPeriodPassword.replace(valueDes);
          break;
        case r'auth.http':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.authPeriodHttp.replace(valueDes);
          break;
        case r'auth.http.realm':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodHttpPeriodRealm.replace(valueDes);
          break;
        case r'auth.uri.suffix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.authPeriodUriPeriodSuffix.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesBuilder();
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

