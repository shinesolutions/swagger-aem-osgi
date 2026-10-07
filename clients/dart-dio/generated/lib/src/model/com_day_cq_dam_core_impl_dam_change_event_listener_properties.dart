//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_dam_change_event_listener_properties.g.dart';

/// ComDayCqDamCoreImplDamChangeEventListenerProperties
///
/// Properties:
/// * [changeeventlistenerPeriodObservedPeriodPaths] 
@BuiltValue()
abstract class ComDayCqDamCoreImplDamChangeEventListenerProperties implements Built<ComDayCqDamCoreImplDamChangeEventListenerProperties, ComDayCqDamCoreImplDamChangeEventListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'changeeventlistener.observed.paths')
  ConfigNodePropertyArray? get changeeventlistenerPeriodObservedPeriodPaths;

  ComDayCqDamCoreImplDamChangeEventListenerProperties._();

  factory ComDayCqDamCoreImplDamChangeEventListenerProperties([void updates(ComDayCqDamCoreImplDamChangeEventListenerPropertiesBuilder b)]) = _$ComDayCqDamCoreImplDamChangeEventListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplDamChangeEventListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplDamChangeEventListenerProperties> get serializer => _$ComDayCqDamCoreImplDamChangeEventListenerPropertiesSerializer();
}

class _$ComDayCqDamCoreImplDamChangeEventListenerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplDamChangeEventListenerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplDamChangeEventListenerProperties, _$ComDayCqDamCoreImplDamChangeEventListenerProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplDamChangeEventListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplDamChangeEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.changeeventlistenerPeriodObservedPeriodPaths != null) {
      yield r'changeeventlistener.observed.paths';
      yield serializers.serialize(
        object.changeeventlistenerPeriodObservedPeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplDamChangeEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplDamChangeEventListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'changeeventlistener.observed.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.changeeventlistenerPeriodObservedPeriodPaths.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplDamChangeEventListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplDamChangeEventListenerPropertiesBuilder();
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

