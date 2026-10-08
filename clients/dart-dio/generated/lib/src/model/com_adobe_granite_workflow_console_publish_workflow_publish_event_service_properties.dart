//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_workflow_console_publish_workflow_publish_event_service_properties.g.dart';

/// ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties
///
/// Properties:
/// * [granitePeriodWorkflowPeriodWorkflowPublishEventServicePeriodEnabled] 
@BuiltValue()
abstract class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties implements Built<ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties, ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'granite.workflow.WorkflowPublishEventService.enabled')
  ConfigNodePropertyBoolean? get granitePeriodWorkflowPeriodWorkflowPublishEventServicePeriodEnabled;

  ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties._();

  factory ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties([void updates(ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesBuilder b)]) = _$ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties> get serializer => _$ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesSerializer();
}

class _$ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties, _$ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties];

  @override
  final String wireName = r'ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.granitePeriodWorkflowPeriodWorkflowPublishEventServicePeriodEnabled != null) {
      yield r'granite.workflow.WorkflowPublishEventService.enabled';
      yield serializers.serialize(
        object.granitePeriodWorkflowPeriodWorkflowPublishEventServicePeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'granite.workflow.WorkflowPublishEventService.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.granitePeriodWorkflowPeriodWorkflowPublishEventServicePeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesBuilder();
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

