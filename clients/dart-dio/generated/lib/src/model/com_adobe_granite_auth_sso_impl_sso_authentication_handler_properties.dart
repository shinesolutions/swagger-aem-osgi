//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_sso_impl_sso_authentication_handler_properties.g.dart';

/// ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties
///
/// Properties:
/// * [path] 
/// * [servicePeriodRanking] 
/// * [jaasPeriodControlFlag] 
/// * [jaasPeriodRealmName] 
/// * [jaasPeriodRanking] 
/// * [headers] 
/// * [cookies] 
/// * [parameters] 
/// * [usermap] 
/// * [format] 
/// * [trustedCredentialsAttribute] 
@BuiltValue()
abstract class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties implements Built<ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties, ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  @BuiltValueField(wireName: r'jaas.controlFlag')
  ConfigNodePropertyString? get jaasPeriodControlFlag;

  @BuiltValueField(wireName: r'jaas.realmName')
  ConfigNodePropertyString? get jaasPeriodRealmName;

  @BuiltValueField(wireName: r'jaas.ranking')
  ConfigNodePropertyInteger? get jaasPeriodRanking;

  @BuiltValueField(wireName: r'headers')
  ConfigNodePropertyArray? get headers;

  @BuiltValueField(wireName: r'cookies')
  ConfigNodePropertyArray? get cookies;

  @BuiltValueField(wireName: r'parameters')
  ConfigNodePropertyArray? get parameters;

  @BuiltValueField(wireName: r'usermap')
  ConfigNodePropertyArray? get usermap;

  @BuiltValueField(wireName: r'format')
  ConfigNodePropertyString? get format;

  @BuiltValueField(wireName: r'trustedCredentialsAttribute')
  ConfigNodePropertyString? get trustedCredentialsAttribute;

  ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties._();

  factory ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties([void updates(ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder b)]) = _$ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties> get serializer => _$ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesSerializer();
}

class _$ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties, _$ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
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
    if (object.headers != null) {
      yield r'headers';
      yield serializers.serialize(
        object.headers,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cookies != null) {
      yield r'cookies';
      yield serializers.serialize(
        object.cookies,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.parameters != null) {
      yield r'parameters';
      yield serializers.serialize(
        object.parameters,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.usermap != null) {
      yield r'usermap';
      yield serializers.serialize(
        object.usermap,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.format != null) {
      yield r'format';
      yield serializers.serialize(
        object.format,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.trustedCredentialsAttribute != null) {
      yield r'trustedCredentialsAttribute';
      yield serializers.serialize(
        object.trustedCredentialsAttribute,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder result,
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
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
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
        case r'headers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.headers.replace(valueDes);
          break;
        case r'cookies':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cookies.replace(valueDes);
          break;
        case r'parameters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.parameters.replace(valueDes);
          break;
        case r'usermap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.usermap.replace(valueDes);
          break;
        case r'format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.format.replace(valueDes);
          break;
        case r'trustedCredentialsAttribute':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.trustedCredentialsAttribute.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesBuilder();
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

