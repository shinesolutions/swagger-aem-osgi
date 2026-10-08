//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_replication_impl_agent_manager_impl_properties.g.dart';

/// ComDayCqReplicationImplAgentManagerImplProperties
///
/// Properties:
/// * [jobPeriodTopics] 
/// * [serviceUserPeriodTarget] 
/// * [agentProviderPeriodTarget] 
@BuiltValue()
abstract class ComDayCqReplicationImplAgentManagerImplProperties implements Built<ComDayCqReplicationImplAgentManagerImplProperties, ComDayCqReplicationImplAgentManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'job.topics')
  ConfigNodePropertyString? get jobPeriodTopics;

  @BuiltValueField(wireName: r'serviceUser.target')
  ConfigNodePropertyString? get serviceUserPeriodTarget;

  @BuiltValueField(wireName: r'agentProvider.target')
  ConfigNodePropertyString? get agentProviderPeriodTarget;

  ComDayCqReplicationImplAgentManagerImplProperties._();

  factory ComDayCqReplicationImplAgentManagerImplProperties([void updates(ComDayCqReplicationImplAgentManagerImplPropertiesBuilder b)]) = _$ComDayCqReplicationImplAgentManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqReplicationImplAgentManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqReplicationImplAgentManagerImplProperties> get serializer => _$ComDayCqReplicationImplAgentManagerImplPropertiesSerializer();
}

class _$ComDayCqReplicationImplAgentManagerImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqReplicationImplAgentManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqReplicationImplAgentManagerImplProperties, _$ComDayCqReplicationImplAgentManagerImplProperties];

  @override
  final String wireName = r'ComDayCqReplicationImplAgentManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqReplicationImplAgentManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.jobPeriodTopics != null) {
      yield r'job.topics';
      yield serializers.serialize(
        object.jobPeriodTopics,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.serviceUserPeriodTarget != null) {
      yield r'serviceUser.target';
      yield serializers.serialize(
        object.serviceUserPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.agentProviderPeriodTarget != null) {
      yield r'agentProvider.target';
      yield serializers.serialize(
        object.agentProviderPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqReplicationImplAgentManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqReplicationImplAgentManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'job.topics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jobPeriodTopics.replace(valueDes);
          break;
        case r'serviceUser.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.serviceUserPeriodTarget.replace(valueDes);
          break;
        case r'agentProvider.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.agentProviderPeriodTarget.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqReplicationImplAgentManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqReplicationImplAgentManagerImplPropertiesBuilder();
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

