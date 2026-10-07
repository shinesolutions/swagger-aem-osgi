//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_workflow_core_job_external_process_job_handler_properties.g.dart';

/// ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties
///
/// Properties:
/// * [defaultPeriodTimeout] 
/// * [maxPeriodTimeout] 
/// * [defaultPeriodPeriod] 
@BuiltValue()
abstract class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties implements Built<ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties, ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'default.timeout')
  ConfigNodePropertyInteger? get defaultPeriodTimeout;

  @BuiltValueField(wireName: r'max.timeout')
  ConfigNodePropertyInteger? get maxPeriodTimeout;

  @BuiltValueField(wireName: r'default.period')
  ConfigNodePropertyInteger? get defaultPeriodPeriod;

  ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties._();

  factory ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties([void updates(ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder b)]) = _$ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties> get serializer => _$ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesSerializer();
}

class _$ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties, _$ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties];

  @override
  final String wireName = r'ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.defaultPeriodTimeout != null) {
      yield r'default.timeout';
      yield serializers.serialize(
        object.defaultPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxPeriodTimeout != null) {
      yield r'max.timeout';
      yield serializers.serialize(
        object.maxPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.defaultPeriodPeriod != null) {
      yield r'default.period';
      yield serializers.serialize(
        object.defaultPeriodPeriod,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'default.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.defaultPeriodTimeout.replace(valueDes);
          break;
        case r'max.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxPeriodTimeout.replace(valueDes);
          break;
        case r'default.period':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.defaultPeriodPeriod.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesBuilder();
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

