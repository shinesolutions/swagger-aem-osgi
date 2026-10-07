//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties.g.dart';

/// ComDayCqDamCoreImplEventDamEventAuditListenerProperties
///
/// Properties:
/// * [eventPeriodFilter] 
/// * [enabled] 
@BuiltValue()
abstract class ComDayCqDamCoreImplEventDamEventAuditListenerProperties implements Built<ComDayCqDamCoreImplEventDamEventAuditListenerProperties, ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'event.filter')
  ConfigNodePropertyString? get eventPeriodFilter;

  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  ComDayCqDamCoreImplEventDamEventAuditListenerProperties._();

  factory ComDayCqDamCoreImplEventDamEventAuditListenerProperties([void updates(ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesBuilder b)]) = _$ComDayCqDamCoreImplEventDamEventAuditListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplEventDamEventAuditListenerProperties> get serializer => _$ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesSerializer();
}

class _$ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplEventDamEventAuditListenerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplEventDamEventAuditListenerProperties, _$ComDayCqDamCoreImplEventDamEventAuditListenerProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplEventDamEventAuditListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplEventDamEventAuditListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.eventPeriodFilter != null) {
      yield r'event.filter';
      yield serializers.serialize(
        object.eventPeriodFilter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplEventDamEventAuditListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event.filter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.eventPeriodFilter.replace(valueDes);
          break;
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplEventDamEventAuditListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplEventDamEventAuditListenerPropertiesBuilder();
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

