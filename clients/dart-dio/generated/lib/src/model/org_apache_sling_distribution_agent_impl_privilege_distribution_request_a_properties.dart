//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties.g.dart';

/// OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties
///
/// Properties:
/// * [name] 
/// * [jcrPrivilege] 
@BuiltValue()
abstract class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties implements Built<OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties, OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'jcrPrivilege')
  ConfigNodePropertyString? get jcrPrivilege;

  OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties._();

  factory OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties([void updates(OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesBuilder b)]) = _$OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties> get serializer => _$OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesSerializer();
}

class _$OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties, _$OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jcrPrivilege != null) {
      yield r'jcrPrivilege';
      yield serializers.serialize(
        object.jcrPrivilege,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesBuilder result,
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
        case r'jcrPrivilege':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jcrPrivilege.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesBuilder();
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

