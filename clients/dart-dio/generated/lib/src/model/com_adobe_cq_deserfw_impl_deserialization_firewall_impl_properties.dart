//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties.g.dart';

/// ComAdobeCqDeserfwImplDeserializationFirewallImplProperties
///
/// Properties:
/// * [firewallPeriodDeserializationPeriodWhitelist] 
/// * [firewallPeriodDeserializationPeriodBlacklist] 
/// * [firewallPeriodDeserializationPeriodDiagnostics] 
@BuiltValue()
abstract class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties implements Built<ComAdobeCqDeserfwImplDeserializationFirewallImplProperties, ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'firewall.deserialization.whitelist')
  ConfigNodePropertyArray? get firewallPeriodDeserializationPeriodWhitelist;

  @BuiltValueField(wireName: r'firewall.deserialization.blacklist')
  ConfigNodePropertyArray? get firewallPeriodDeserializationPeriodBlacklist;

  @BuiltValueField(wireName: r'firewall.deserialization.diagnostics')
  ConfigNodePropertyString? get firewallPeriodDeserializationPeriodDiagnostics;

  ComAdobeCqDeserfwImplDeserializationFirewallImplProperties._();

  factory ComAdobeCqDeserfwImplDeserializationFirewallImplProperties([void updates(ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder b)]) = _$ComAdobeCqDeserfwImplDeserializationFirewallImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDeserfwImplDeserializationFirewallImplProperties> get serializer => _$ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesSerializer();
}

class _$ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDeserfwImplDeserializationFirewallImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDeserfwImplDeserializationFirewallImplProperties, _$ComAdobeCqDeserfwImplDeserializationFirewallImplProperties];

  @override
  final String wireName = r'ComAdobeCqDeserfwImplDeserializationFirewallImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDeserfwImplDeserializationFirewallImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.firewallPeriodDeserializationPeriodWhitelist != null) {
      yield r'firewall.deserialization.whitelist';
      yield serializers.serialize(
        object.firewallPeriodDeserializationPeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.firewallPeriodDeserializationPeriodBlacklist != null) {
      yield r'firewall.deserialization.blacklist';
      yield serializers.serialize(
        object.firewallPeriodDeserializationPeriodBlacklist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.firewallPeriodDeserializationPeriodDiagnostics != null) {
      yield r'firewall.deserialization.diagnostics';
      yield serializers.serialize(
        object.firewallPeriodDeserializationPeriodDiagnostics,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDeserfwImplDeserializationFirewallImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'firewall.deserialization.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.firewallPeriodDeserializationPeriodWhitelist.replace(valueDes);
          break;
        case r'firewall.deserialization.blacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.firewallPeriodDeserializationPeriodBlacklist.replace(valueDes);
          break;
        case r'firewall.deserialization.diagnostics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.firewallPeriodDeserializationPeriodDiagnostics.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDeserfwImplDeserializationFirewallImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDeserfwImplDeserializationFirewallImplPropertiesBuilder();
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

