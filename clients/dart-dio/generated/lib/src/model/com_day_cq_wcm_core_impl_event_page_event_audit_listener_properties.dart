//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties.g.dart';

/// ComDayCqWcmCoreImplEventPageEventAuditListenerProperties
///
/// Properties:
/// * [configured] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplEventPageEventAuditListenerProperties implements Built<ComDayCqWcmCoreImplEventPageEventAuditListenerProperties, ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'configured')
  ConfigNodePropertyString? get configured;

  ComDayCqWcmCoreImplEventPageEventAuditListenerProperties._();

  factory ComDayCqWcmCoreImplEventPageEventAuditListenerProperties([void updates(ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplEventPageEventAuditListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplEventPageEventAuditListenerProperties> get serializer => _$ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplEventPageEventAuditListenerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplEventPageEventAuditListenerProperties, _$ComDayCqWcmCoreImplEventPageEventAuditListenerProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplEventPageEventAuditListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplEventPageEventAuditListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.configured != null) {
      yield r'configured';
      yield serializers.serialize(
        object.configured,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplEventPageEventAuditListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'configured':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.configured.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplEventPageEventAuditListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesBuilder();
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

