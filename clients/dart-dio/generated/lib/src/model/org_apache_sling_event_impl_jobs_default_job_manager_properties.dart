//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_event_impl_jobs_default_job_manager_properties.g.dart';

/// OrgApacheSlingEventImplJobsDefaultJobManagerProperties
///
/// Properties:
/// * [queuePeriodPriority] 
/// * [queuePeriodRetries] 
/// * [queuePeriodRetrydelay] 
/// * [queuePeriodMaxparallel] 
@BuiltValue()
abstract class OrgApacheSlingEventImplJobsDefaultJobManagerProperties implements Built<OrgApacheSlingEventImplJobsDefaultJobManagerProperties, OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder> {
  @BuiltValueField(wireName: r'queue.priority')
  ConfigNodePropertyDropDown? get queuePeriodPriority;

  @BuiltValueField(wireName: r'queue.retries')
  ConfigNodePropertyInteger? get queuePeriodRetries;

  @BuiltValueField(wireName: r'queue.retrydelay')
  ConfigNodePropertyInteger? get queuePeriodRetrydelay;

  @BuiltValueField(wireName: r'queue.maxparallel')
  ConfigNodePropertyInteger? get queuePeriodMaxparallel;

  OrgApacheSlingEventImplJobsDefaultJobManagerProperties._();

  factory OrgApacheSlingEventImplJobsDefaultJobManagerProperties([void updates(OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder b)]) = _$OrgApacheSlingEventImplJobsDefaultJobManagerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingEventImplJobsDefaultJobManagerProperties> get serializer => _$OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesSerializer();
}

class _$OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingEventImplJobsDefaultJobManagerProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingEventImplJobsDefaultJobManagerProperties, _$OrgApacheSlingEventImplJobsDefaultJobManagerProperties];

  @override
  final String wireName = r'OrgApacheSlingEventImplJobsDefaultJobManagerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingEventImplJobsDefaultJobManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingEventImplJobsDefaultJobManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.queuePeriodMaxparallel.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingEventImplJobsDefaultJobManagerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingEventImplJobsDefaultJobManagerPropertiesBuilder();
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

