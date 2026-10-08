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

part 'org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties.g.dart';

/// OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties
///
/// Properties:
/// * [name] 
/// * [title] 
/// * [details] 
/// * [enabled] 
/// * [serviceName] 
/// * [logPeriodLevel] 
/// * [allowedPeriodRoots] 
/// * [requestAuthorizationStrategyPeriodTarget] 
/// * [queueProviderFactoryPeriodTarget] 
/// * [packageBuilderPeriodTarget] 
/// * [triggersPeriodTarget] 
/// * [priorityQueues] 
@BuiltValue()
abstract class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties implements Built<OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties, OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'title')
  ConfigNodePropertyString? get title;

  @BuiltValueField(wireName: r'details')
  ConfigNodePropertyString? get details;

  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  @BuiltValueField(wireName: r'serviceName')
  ConfigNodePropertyString? get serviceName;

  @BuiltValueField(wireName: r'log.level')
  ConfigNodePropertyDropDown? get logPeriodLevel;

  @BuiltValueField(wireName: r'allowed.roots')
  ConfigNodePropertyArray? get allowedPeriodRoots;

  @BuiltValueField(wireName: r'requestAuthorizationStrategy.target')
  ConfigNodePropertyString? get requestAuthorizationStrategyPeriodTarget;

  @BuiltValueField(wireName: r'queueProviderFactory.target')
  ConfigNodePropertyString? get queueProviderFactoryPeriodTarget;

  @BuiltValueField(wireName: r'packageBuilder.target')
  ConfigNodePropertyString? get packageBuilderPeriodTarget;

  @BuiltValueField(wireName: r'triggers.target')
  ConfigNodePropertyString? get triggersPeriodTarget;

  @BuiltValueField(wireName: r'priorityQueues')
  ConfigNodePropertyArray? get priorityQueues;

  OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties._();

  factory OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties([void updates(OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder b)]) = _$OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties> get serializer => _$OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesSerializer();
}

class _$OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties, _$OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.details != null) {
      yield r'details';
      yield serializers.serialize(
        object.details,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.serviceName != null) {
      yield r'serviceName';
      yield serializers.serialize(
        object.serviceName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.logPeriodLevel != null) {
      yield r'log.level';
      yield serializers.serialize(
        object.logPeriodLevel,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.allowedPeriodRoots != null) {
      yield r'allowed.roots';
      yield serializers.serialize(
        object.allowedPeriodRoots,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.requestAuthorizationStrategyPeriodTarget != null) {
      yield r'requestAuthorizationStrategy.target';
      yield serializers.serialize(
        object.requestAuthorizationStrategyPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.queueProviderFactoryPeriodTarget != null) {
      yield r'queueProviderFactory.target';
      yield serializers.serialize(
        object.queueProviderFactoryPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.packageBuilderPeriodTarget != null) {
      yield r'packageBuilder.target';
      yield serializers.serialize(
        object.packageBuilderPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.triggersPeriodTarget != null) {
      yield r'triggers.target';
      yield serializers.serialize(
        object.triggersPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.priorityQueues != null) {
      yield r'priorityQueues';
      yield serializers.serialize(
        object.priorityQueues,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder result,
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
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.title.replace(valueDes);
          break;
        case r'details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.details.replace(valueDes);
          break;
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        case r'serviceName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.serviceName.replace(valueDes);
          break;
        case r'log.level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.logPeriodLevel.replace(valueDes);
          break;
        case r'allowed.roots':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.allowedPeriodRoots.replace(valueDes);
          break;
        case r'requestAuthorizationStrategy.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.requestAuthorizationStrategyPeriodTarget.replace(valueDes);
          break;
        case r'queueProviderFactory.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.queueProviderFactoryPeriodTarget.replace(valueDes);
          break;
        case r'packageBuilder.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.packageBuilderPeriodTarget.replace(valueDes);
          break;
        case r'triggers.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.triggersPeriodTarget.replace(valueDes);
          break;
        case r'priorityQueues':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.priorityQueues.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesBuilder();
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

