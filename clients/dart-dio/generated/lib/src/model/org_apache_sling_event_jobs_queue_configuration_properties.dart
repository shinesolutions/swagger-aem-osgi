//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_float.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_event_jobs_queue_configuration_properties.g.dart';

/// OrgApacheSlingEventJobsQueueConfigurationProperties
///
/// Properties:
/// * [queuePeriodName] 
/// * [queuePeriodTopics] 
/// * [queuePeriodType] 
/// * [queuePeriodPriority] 
/// * [queuePeriodRetries] 
/// * [queuePeriodRetrydelay] 
/// * [queuePeriodMaxparallel] 
/// * [queuePeriodKeepJobs] 
/// * [queuePeriodPreferRunOnCreationInstance] 
/// * [queuePeriodThreadPoolSize] 
/// * [servicePeriodRanking] 
@BuiltValue()
abstract class OrgApacheSlingEventJobsQueueConfigurationProperties implements Built<OrgApacheSlingEventJobsQueueConfigurationProperties, OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder> {
  @BuiltValueField(wireName: r'queue.name')
  ConfigNodePropertyString? get queuePeriodName;

  @BuiltValueField(wireName: r'queue.topics')
  ConfigNodePropertyArray? get queuePeriodTopics;

  @BuiltValueField(wireName: r'queue.type')
  ConfigNodePropertyDropDown? get queuePeriodType;

  @BuiltValueField(wireName: r'queue.priority')
  ConfigNodePropertyDropDown? get queuePeriodPriority;

  @BuiltValueField(wireName: r'queue.retries')
  ConfigNodePropertyInteger? get queuePeriodRetries;

  @BuiltValueField(wireName: r'queue.retrydelay')
  ConfigNodePropertyInteger? get queuePeriodRetrydelay;

  @BuiltValueField(wireName: r'queue.maxparallel')
  ConfigNodePropertyFloat? get queuePeriodMaxparallel;

  @BuiltValueField(wireName: r'queue.keepJobs')
  ConfigNodePropertyBoolean? get queuePeriodKeepJobs;

  @BuiltValueField(wireName: r'queue.preferRunOnCreationInstance')
  ConfigNodePropertyBoolean? get queuePeriodPreferRunOnCreationInstance;

  @BuiltValueField(wireName: r'queue.threadPoolSize')
  ConfigNodePropertyInteger? get queuePeriodThreadPoolSize;

  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  OrgApacheSlingEventJobsQueueConfigurationProperties._();

  factory OrgApacheSlingEventJobsQueueConfigurationProperties([void updates(OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder b)]) = _$OrgApacheSlingEventJobsQueueConfigurationProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingEventJobsQueueConfigurationProperties> get serializer => _$OrgApacheSlingEventJobsQueueConfigurationPropertiesSerializer();
}

class _$OrgApacheSlingEventJobsQueueConfigurationPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingEventJobsQueueConfigurationProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingEventJobsQueueConfigurationProperties, _$OrgApacheSlingEventJobsQueueConfigurationProperties];

  @override
  final String wireName = r'OrgApacheSlingEventJobsQueueConfigurationProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingEventJobsQueueConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.queuePeriodName != null) {
      yield r'queue.name';
      yield serializers.serialize(
        object.queuePeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.queuePeriodTopics != null) {
      yield r'queue.topics';
      yield serializers.serialize(
        object.queuePeriodTopics,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.queuePeriodType != null) {
      yield r'queue.type';
      yield serializers.serialize(
        object.queuePeriodType,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.queuePeriodPriority != null) {
      yield r'queue.priority';
      yield serializers.serialize(
        object.queuePeriodPriority,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.queuePeriodRetries != null) {
      yield r'queue.retries';
      yield serializers.serialize(
        object.queuePeriodRetries,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.queuePeriodRetrydelay != null) {
      yield r'queue.retrydelay';
      yield serializers.serialize(
        object.queuePeriodRetrydelay,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.queuePeriodMaxparallel != null) {
      yield r'queue.maxparallel';
      yield serializers.serialize(
        object.queuePeriodMaxparallel,
        specifiedType: const FullType(ConfigNodePropertyFloat),
      );
    }
    if (object.queuePeriodKeepJobs != null) {
      yield r'queue.keepJobs';
      yield serializers.serialize(
        object.queuePeriodKeepJobs,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.queuePeriodPreferRunOnCreationInstance != null) {
      yield r'queue.preferRunOnCreationInstance';
      yield serializers.serialize(
        object.queuePeriodPreferRunOnCreationInstance,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.queuePeriodThreadPoolSize != null) {
      yield r'queue.threadPoolSize';
      yield serializers.serialize(
        object.queuePeriodThreadPoolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingEventJobsQueueConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'queue.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.queuePeriodName.replace(valueDes);
          break;
        case r'queue.topics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.queuePeriodTopics.replace(valueDes);
          break;
        case r'queue.type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.queuePeriodType.replace(valueDes);
          break;
        case r'queue.priority':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.queuePeriodPriority.replace(valueDes);
          break;
        case r'queue.retries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.queuePeriodRetries.replace(valueDes);
          break;
        case r'queue.retrydelay':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.queuePeriodRetrydelay.replace(valueDes);
          break;
        case r'queue.maxparallel':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyFloat),
          ) as ConfigNodePropertyFloat?;
          if (valueDes == null) continue;
          result.queuePeriodMaxparallel.replace(valueDes);
          break;
        case r'queue.keepJobs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.queuePeriodKeepJobs.replace(valueDes);
          break;
        case r'queue.preferRunOnCreationInstance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.queuePeriodPreferRunOnCreationInstance.replace(valueDes);
          break;
        case r'queue.threadPoolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.queuePeriodThreadPoolSize.replace(valueDes);
          break;
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingEventJobsQueueConfigurationProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingEventJobsQueueConfigurationPropertiesBuilder();
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

