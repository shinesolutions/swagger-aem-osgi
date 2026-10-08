//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_workflow_core_job_job_handler_properties.g.dart';

/// ComAdobeGraniteWorkflowCoreJobJobHandlerProperties
///
/// Properties:
/// * [jobPeriodTopics] 
/// * [allowPeriodSelfPeriodProcessPeriodTermination] 
@BuiltValue()
abstract class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties implements Built<ComAdobeGraniteWorkflowCoreJobJobHandlerProperties, ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'job.topics')
  ConfigNodePropertyArray? get jobPeriodTopics;

  @BuiltValueField(wireName: r'allow.self.process.termination')
  ConfigNodePropertyBoolean? get allowPeriodSelfPeriodProcessPeriodTermination;

  ComAdobeGraniteWorkflowCoreJobJobHandlerProperties._();

  factory ComAdobeGraniteWorkflowCoreJobJobHandlerProperties([void updates(ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesBuilder b)]) = _$ComAdobeGraniteWorkflowCoreJobJobHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteWorkflowCoreJobJobHandlerProperties> get serializer => _$ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesSerializer();
}

class _$ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteWorkflowCoreJobJobHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteWorkflowCoreJobJobHandlerProperties, _$ComAdobeGraniteWorkflowCoreJobJobHandlerProperties];

  @override
  final String wireName = r'ComAdobeGraniteWorkflowCoreJobJobHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteWorkflowCoreJobJobHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.jobPeriodTopics != null) {
      yield r'job.topics';
      yield serializers.serialize(
        object.jobPeriodTopics,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.allowPeriodSelfPeriodProcessPeriodTermination != null) {
      yield r'allow.self.process.termination';
      yield serializers.serialize(
        object.allowPeriodSelfPeriodProcessPeriodTermination,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteWorkflowCoreJobJobHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'job.topics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.jobPeriodTopics.replace(valueDes);
          break;
        case r'allow.self.process.termination':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.allowPeriodSelfPeriodProcessPeriodTermination.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteWorkflowCoreJobJobHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesBuilder();
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

