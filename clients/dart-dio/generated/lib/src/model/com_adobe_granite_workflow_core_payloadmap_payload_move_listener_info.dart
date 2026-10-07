//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_workflow_core_payloadmap_payload_move_listener_info.g.dart';

/// ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo implements Built<ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo, ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties? get properties;

  ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo._();

  factory ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo([void updates(ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder b)]) = _$ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo> get serializer => _$ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoSerializer();
}

class _$ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoSerializer implements PrimitiveSerializer<ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo, _$ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo];

  @override
  final String wireName = r'ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties),
          ) as ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder();
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

