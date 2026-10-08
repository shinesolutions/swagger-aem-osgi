//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties.g.dart';

/// OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties
///
/// Properties:
/// * [name] 
/// * [queue] 
/// * [dropPeriodInvalidPeriodItems] 
/// * [agentPeriodTarget] 
@BuiltValue()
abstract class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties implements Built<OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties, OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'queue')
  ConfigNodePropertyString? get queue;

  @BuiltValueField(wireName: r'drop.invalid.items')
  ConfigNodePropertyBoolean? get dropPeriodInvalidPeriodItems;

  @BuiltValueField(wireName: r'agent.target')
  ConfigNodePropertyString? get agentPeriodTarget;

  OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties._();

  factory OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties([void updates(OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder b)]) = _$OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties> get serializer => _$OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesSerializer();
}

class _$OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties, _$OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.queue != null) {
      yield r'queue';
      yield serializers.serialize(
        object.queue,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.dropPeriodInvalidPeriodItems != null) {
      yield r'drop.invalid.items';
      yield serializers.serialize(
        object.dropPeriodInvalidPeriodItems,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.agentPeriodTarget != null) {
      yield r'agent.target';
      yield serializers.serialize(
        object.agentPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder result,
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
        case r'queue':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.queue.replace(valueDes);
          break;
        case r'drop.invalid.items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.dropPeriodInvalidPeriodItems.replace(valueDes);
          break;
        case r'agent.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.agentPeriodTarget.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesBuilder();
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

