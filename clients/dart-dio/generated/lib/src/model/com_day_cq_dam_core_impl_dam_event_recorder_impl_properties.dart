//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_dam_event_recorder_impl_properties.g.dart';

/// ComDayCqDamCoreImplDamEventRecorderImplProperties
///
/// Properties:
/// * [eventPeriodFilter] 
/// * [eventPeriodQueuePeriodLength] 
/// * [eventrecorderPeriodEnabled] 
/// * [eventrecorderPeriodBlacklist] 
/// * [eventrecorderPeriodEventtypes] 
@BuiltValue()
abstract class ComDayCqDamCoreImplDamEventRecorderImplProperties implements Built<ComDayCqDamCoreImplDamEventRecorderImplProperties, ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'event.filter')
  ConfigNodePropertyString? get eventPeriodFilter;

  @BuiltValueField(wireName: r'event.queue.length')
  ConfigNodePropertyInteger? get eventPeriodQueuePeriodLength;

  @BuiltValueField(wireName: r'eventrecorder.enabled')
  ConfigNodePropertyBoolean? get eventrecorderPeriodEnabled;

  @BuiltValueField(wireName: r'eventrecorder.blacklist')
  ConfigNodePropertyArray? get eventrecorderPeriodBlacklist;

  @BuiltValueField(wireName: r'eventrecorder.eventtypes')
  ConfigNodePropertyDropDown? get eventrecorderPeriodEventtypes;

  ComDayCqDamCoreImplDamEventRecorderImplProperties._();

  factory ComDayCqDamCoreImplDamEventRecorderImplProperties([void updates(ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder b)]) = _$ComDayCqDamCoreImplDamEventRecorderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplDamEventRecorderImplProperties> get serializer => _$ComDayCqDamCoreImplDamEventRecorderImplPropertiesSerializer();
}

class _$ComDayCqDamCoreImplDamEventRecorderImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplDamEventRecorderImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplDamEventRecorderImplProperties, _$ComDayCqDamCoreImplDamEventRecorderImplProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplDamEventRecorderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplDamEventRecorderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.eventPeriodFilter != null) {
      yield r'event.filter';
      yield serializers.serialize(
        object.eventPeriodFilter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.eventPeriodQueuePeriodLength != null) {
      yield r'event.queue.length';
      yield serializers.serialize(
        object.eventPeriodQueuePeriodLength,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.eventrecorderPeriodEnabled != null) {
      yield r'eventrecorder.enabled';
      yield serializers.serialize(
        object.eventrecorderPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.eventrecorderPeriodBlacklist != null) {
      yield r'eventrecorder.blacklist';
      yield serializers.serialize(
        object.eventrecorderPeriodBlacklist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.eventrecorderPeriodEventtypes != null) {
      yield r'eventrecorder.eventtypes';
      yield serializers.serialize(
        object.eventrecorderPeriodEventtypes,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplDamEventRecorderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder result,
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
        case r'event.queue.length':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.eventPeriodQueuePeriodLength.replace(valueDes);
          break;
        case r'eventrecorder.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.eventrecorderPeriodEnabled.replace(valueDes);
          break;
        case r'eventrecorder.blacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.eventrecorderPeriodBlacklist.replace(valueDes);
          break;
        case r'eventrecorder.eventtypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.eventrecorderPeriodEventtypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplDamEventRecorderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplDamEventRecorderImplPropertiesBuilder();
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

