//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_properties.g.dart';

/// ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties
///
/// Properties:
/// * [schedulerPeriodExpression] 
/// * [jobPeriodPurgePeriodThreshold] 
/// * [jobPeriodPurgePeriodMaxPeriodJobs] 
@BuiltValue()
abstract class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties implements Built<ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties, ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.expression')
  ConfigNodePropertyString? get schedulerPeriodExpression;

  @BuiltValueField(wireName: r'job.purge.threshold')
  ConfigNodePropertyInteger? get jobPeriodPurgePeriodThreshold;

  @BuiltValueField(wireName: r'job.purge.max.jobs')
  ConfigNodePropertyInteger? get jobPeriodPurgePeriodMaxPeriodJobs;

  ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties._();

  factory ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties([void updates(ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder b)]) = _$ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties> get serializer => _$ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesSerializer();
}

class _$ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties, _$ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties];

  @override
  final String wireName = r'ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.schedulerPeriodExpression != null) {
      yield r'scheduler.expression';
      yield serializers.serialize(
        object.schedulerPeriodExpression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jobPeriodPurgePeriodThreshold != null) {
      yield r'job.purge.threshold';
      yield serializers.serialize(
        object.jobPeriodPurgePeriodThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.jobPeriodPurgePeriodMaxPeriodJobs != null) {
      yield r'job.purge.max.jobs';
      yield serializers.serialize(
        object.jobPeriodPurgePeriodMaxPeriodJobs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scheduler.expression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.schedulerPeriodExpression.replace(valueDes);
          break;
        case r'job.purge.threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.jobPeriodPurgePeriodThreshold.replace(valueDes);
          break;
        case r'job.purge.max.jobs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.jobPeriodPurgePeriodMaxPeriodJobs.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder();
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

