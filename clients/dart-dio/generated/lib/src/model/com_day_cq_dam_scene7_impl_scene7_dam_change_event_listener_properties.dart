//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_properties.g.dart';

/// ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties
///
/// Properties:
/// * [cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled] 
/// * [cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths] 
@BuiltValue()
abstract class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties implements Built<ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties, ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.scene7.damchangeeventlistener.enabled')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled;

  @BuiltValueField(wireName: r'cq.dam.scene7.damchangeeventlistener.observed.paths')
  ConfigNodePropertyArray? get cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths;

  ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties._();

  factory ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties([void updates(ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesBuilder b)]) = _$ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties> get serializer => _$ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesSerializer();
}

class _$ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties, _$ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties];

  @override
  final String wireName = r'ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled != null) {
      yield r'cq.dam.scene7.damchangeeventlistener.enabled';
      yield serializers.serialize(
        object.cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths != null) {
      yield r'cq.dam.scene7.damchangeeventlistener.observed.paths';
      yield serializers.serialize(
        object.cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.scene7.damchangeeventlistener.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodEnabled.replace(valueDes);
          break;
        case r'cq.dam.scene7.damchangeeventlistener.observed.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodScene7PeriodDamchangeeventlistenerPeriodObservedPeriodPaths.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesBuilder();
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

