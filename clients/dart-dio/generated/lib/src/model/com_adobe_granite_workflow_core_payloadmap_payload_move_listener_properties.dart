//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties.g.dart';

/// ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties
///
/// Properties:
/// * [payloadPeriodMovePeriodWhitePeriodList] 
/// * [payloadPeriodMovePeriodHandlePeriodFromPeriodWorkflowPeriodProcess] 
@BuiltValue()
abstract class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties implements Built<ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties, ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'payload.move.white.list')
  ConfigNodePropertyArray? get payloadPeriodMovePeriodWhitePeriodList;

  @BuiltValueField(wireName: r'payload.move.handle.from.workflow.process')
  ConfigNodePropertyBoolean? get payloadPeriodMovePeriodHandlePeriodFromPeriodWorkflowPeriodProcess;

  ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties._();

  factory ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties([void updates(ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesBuilder b)]) = _$ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties> get serializer => _$ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesSerializer();
}

class _$ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties, _$ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties];

  @override
  final String wireName = r'ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.payloadPeriodMovePeriodWhitePeriodList != null) {
      yield r'payload.move.white.list';
      yield serializers.serialize(
        object.payloadPeriodMovePeriodWhitePeriodList,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.payloadPeriodMovePeriodHandlePeriodFromPeriodWorkflowPeriodProcess != null) {
      yield r'payload.move.handle.from.workflow.process';
      yield serializers.serialize(
        object.payloadPeriodMovePeriodHandlePeriodFromPeriodWorkflowPeriodProcess,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'payload.move.white.list':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.payloadPeriodMovePeriodWhitePeriodList.replace(valueDes);
          break;
        case r'payload.move.handle.from.workflow.process':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.payloadPeriodMovePeriodHandlePeriodFromPeriodWorkflowPeriodProcess.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesBuilder();
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

