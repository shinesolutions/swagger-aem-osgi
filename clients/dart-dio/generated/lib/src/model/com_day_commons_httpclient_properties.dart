//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_commons_httpclient_properties.g.dart';

/// ComDayCommonsHttpclientProperties
///
/// Properties:
/// * [proxyPeriodEnabled] 
/// * [proxyPeriodHost] 
/// * [proxyPeriodUser] 
/// * [proxyPeriodPassword] 
/// * [proxyPeriodNtlmPeriodHost] 
/// * [proxyPeriodNtlmPeriodDomain] 
/// * [proxyPeriodExceptions] 
@BuiltValue()
abstract class ComDayCommonsHttpclientProperties implements Built<ComDayCommonsHttpclientProperties, ComDayCommonsHttpclientPropertiesBuilder> {
  @BuiltValueField(wireName: r'proxy.enabled')
  ConfigNodePropertyBoolean? get proxyPeriodEnabled;

  @BuiltValueField(wireName: r'proxy.host')
  ConfigNodePropertyString? get proxyPeriodHost;

  @BuiltValueField(wireName: r'proxy.user')
  ConfigNodePropertyString? get proxyPeriodUser;

  @BuiltValueField(wireName: r'proxy.password')
  ConfigNodePropertyString? get proxyPeriodPassword;

  @BuiltValueField(wireName: r'proxy.ntlm.host')
  ConfigNodePropertyString? get proxyPeriodNtlmPeriodHost;

  @BuiltValueField(wireName: r'proxy.ntlm.domain')
  ConfigNodePropertyString? get proxyPeriodNtlmPeriodDomain;

  @BuiltValueField(wireName: r'proxy.exceptions')
  ConfigNodePropertyArray? get proxyPeriodExceptions;

  ComDayCommonsHttpclientProperties._();

  factory ComDayCommonsHttpclientProperties([void updates(ComDayCommonsHttpclientPropertiesBuilder b)]) = _$ComDayCommonsHttpclientProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCommonsHttpclientPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCommonsHttpclientProperties> get serializer => _$ComDayCommonsHttpclientPropertiesSerializer();
}

class _$ComDayCommonsHttpclientPropertiesSerializer implements PrimitiveSerializer<ComDayCommonsHttpclientProperties> {
  @override
  final Iterable<Type> types = const [ComDayCommonsHttpclientProperties, _$ComDayCommonsHttpclientProperties];

  @override
  final String wireName = r'ComDayCommonsHttpclientProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCommonsHttpclientProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.proxyPeriodEnabled != null) {
      yield r'proxy.enabled';
      yield serializers.serialize(
        object.proxyPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.proxyPeriodHost != null) {
      yield r'proxy.host';
      yield serializers.serialize(
        object.proxyPeriodHost,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.proxyPeriodUser != null) {
      yield r'proxy.user';
      yield serializers.serialize(
        object.proxyPeriodUser,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.proxyPeriodPassword != null) {
      yield r'proxy.password';
      yield serializers.serialize(
        object.proxyPeriodPassword,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.proxyPeriodNtlmPeriodHost != null) {
      yield r'proxy.ntlm.host';
      yield serializers.serialize(
        object.proxyPeriodNtlmPeriodHost,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.proxyPeriodNtlmPeriodDomain != null) {
      yield r'proxy.ntlm.domain';
      yield serializers.serialize(
        object.proxyPeriodNtlmPeriodDomain,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.proxyPeriodExceptions != null) {
      yield r'proxy.exceptions';
      yield serializers.serialize(
        object.proxyPeriodExceptions,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCommonsHttpclientProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCommonsHttpclientPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'proxy.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.proxyPeriodEnabled.replace(valueDes);
          break;
        case r'proxy.host':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.proxyPeriodHost.replace(valueDes);
          break;
        case r'proxy.user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.proxyPeriodUser.replace(valueDes);
          break;
        case r'proxy.password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.proxyPeriodPassword.replace(valueDes);
          break;
        case r'proxy.ntlm.host':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.proxyPeriodNtlmPeriodHost.replace(valueDes);
          break;
        case r'proxy.ntlm.domain':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.proxyPeriodNtlmPeriodDomain.replace(valueDes);
          break;
        case r'proxy.exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.proxyPeriodExceptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCommonsHttpclientProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCommonsHttpclientPropertiesBuilder();
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

