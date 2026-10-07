//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_dam_event_purge_service_properties.g.dart';

/// ComDayCqDamCoreImplDamEventPurgeServiceProperties
///
/// Properties:
/// * [schedulerPeriodExpression] 
/// * [maxSavedActivities] 
/// * [saveInterval] 
/// * [enableActivityPurge] 
/// * [eventTypes] 
@BuiltValue()
abstract class ComDayCqDamCoreImplDamEventPurgeServiceProperties implements Built<ComDayCqDamCoreImplDamEventPurgeServiceProperties, ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.expression')
  ConfigNodePropertyString? get schedulerPeriodExpression;

  @BuiltValueField(wireName: r'maxSavedActivities')
  ConfigNodePropertyInteger? get maxSavedActivities;

  @BuiltValueField(wireName: r'saveInterval')
  ConfigNodePropertyInteger? get saveInterval;

  @BuiltValueField(wireName: r'enableActivityPurge')
  ConfigNodePropertyBoolean? get enableActivityPurge;

  @BuiltValueField(wireName: r'eventTypes')
  ConfigNodePropertyDropDown? get eventTypes;

  ComDayCqDamCoreImplDamEventPurgeServiceProperties._();

  factory ComDayCqDamCoreImplDamEventPurgeServiceProperties([void updates(ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder b)]) = _$ComDayCqDamCoreImplDamEventPurgeServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplDamEventPurgeServiceProperties> get serializer => _$ComDayCqDamCoreImplDamEventPurgeServicePropertiesSerializer();
}

class _$ComDayCqDamCoreImplDamEventPurgeServicePropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplDamEventPurgeServiceProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplDamEventPurgeServiceProperties, _$ComDayCqDamCoreImplDamEventPurgeServiceProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplDamEventPurgeServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplDamEventPurgeServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.schedulerPeriodExpression != null) {
      yield r'scheduler.expression';
      yield serializers.serialize(
        object.schedulerPeriodExpression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.maxSavedActivities != null) {
      yield r'maxSavedActivities';
      yield serializers.serialize(
        object.maxSavedActivities,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.saveInterval != null) {
      yield r'saveInterval';
      yield serializers.serialize(
        object.saveInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.enableActivityPurge != null) {
      yield r'enableActivityPurge';
      yield serializers.serialize(
        object.enableActivityPurge,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.eventTypes != null) {
      yield r'eventTypes';
      yield serializers.serialize(
        object.eventTypes,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplDamEventPurgeServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder result,
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
        case r'maxSavedActivities':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxSavedActivities.replace(valueDes);
          break;
        case r'saveInterval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.saveInterval.replace(valueDes);
          break;
        case r'enableActivityPurge':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enableActivityPurge.replace(valueDes);
          break;
        case r'eventTypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.eventTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplDamEventPurgeServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplDamEventPurgeServicePropertiesBuilder();
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

