//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties.g.dart';

/// ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties
///
/// Properties:
/// * [jobPeriodTopics] 
@BuiltValue()
abstract class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties implements Built<ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties, ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesBuilder> {
  @BuiltValueField(wireName: r'job.topics')
  ConfigNodePropertyString? get jobPeriodTopics;

  ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties._();

  factory ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties([void updates(ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesBuilder b)]) = _$ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties> get serializer => _$ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesSerializer();
}

class _$ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties, _$ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties];

  @override
  final String wireName = r'ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.jobPeriodTopics != null) {
      yield r'job.topics';
      yield serializers.serialize(
        object.jobPeriodTopics,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesBuilder();
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

