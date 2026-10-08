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

part 'org_apache_http_proxyconfigurator_properties.g.dart';

/// OrgApacheHttpProxyconfiguratorProperties
///
/// Properties:
/// * [proxyPeriodEnabled] 
/// * [proxyPeriodHost] 
/// * [proxyPeriodPort] 
/// * [proxyPeriodUser] 
/// * [proxyPeriodPassword] 
/// * [proxyPeriodExceptions] 
@BuiltValue()
abstract class OrgApacheHttpProxyconfiguratorProperties implements Built<OrgApacheHttpProxyconfiguratorProperties, OrgApacheHttpProxyconfiguratorPropertiesBuilder> {
  @BuiltValueField(wireName: r'proxy.enabled')
  ConfigNodePropertyBoolean? get proxyPeriodEnabled;

  @BuiltValueField(wireName: r'proxy.host')
  ConfigNodePropertyString? get proxyPeriodHost;

  @BuiltValueField(wireName: r'proxy.port')
  ConfigNodePropertyInteger? get proxyPeriodPort;

  @BuiltValueField(wireName: r'proxy.user')
  ConfigNodePropertyString? get proxyPeriodUser;

  @BuiltValueField(wireName: r'proxy.password')
  ConfigNodePropertyString? get proxyPeriodPassword;

  @BuiltValueField(wireName: r'proxy.exceptions')
  ConfigNodePropertyArray? get proxyPeriodExceptions;

  OrgApacheHttpProxyconfiguratorProperties._();

  factory OrgApacheHttpProxyconfiguratorProperties([void updates(OrgApacheHttpProxyconfiguratorPropertiesBuilder b)]) = _$OrgApacheHttpProxyconfiguratorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheHttpProxyconfiguratorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheHttpProxyconfiguratorProperties> get serializer => _$OrgApacheHttpProxyconfiguratorPropertiesSerializer();
}

class _$OrgApacheHttpProxyconfiguratorPropertiesSerializer implements PrimitiveSerializer<OrgApacheHttpProxyconfiguratorProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheHttpProxyconfiguratorProperties, _$OrgApacheHttpProxyconfiguratorProperties];

  @override
  final String wireName = r'OrgApacheHttpProxyconfiguratorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheHttpProxyconfiguratorProperties object, {
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
    if (object.proxyPeriodPort != null) {
      yield r'proxy.port';
      yield serializers.serialize(
        object.proxyPeriodPort,
        specifiedType: const FullType(ConfigNodePropertyInteger),
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
    OrgApacheHttpProxyconfiguratorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheHttpProxyconfiguratorPropertiesBuilder result,
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
        case r'proxy.port':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.proxyPeriodPort.replace(valueDes);
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
  OrgApacheHttpProxyconfiguratorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheHttpProxyconfiguratorPropertiesBuilder();
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

