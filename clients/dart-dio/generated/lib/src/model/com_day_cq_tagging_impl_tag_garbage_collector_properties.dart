//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_tagging_impl_tag_garbage_collector_properties.g.dart';

/// ComDayCqTaggingImplTagGarbageCollectorProperties
///
/// Properties:
/// * [schedulerPeriodExpression] 
@BuiltValue()
abstract class ComDayCqTaggingImplTagGarbageCollectorProperties implements Built<ComDayCqTaggingImplTagGarbageCollectorProperties, ComDayCqTaggingImplTagGarbageCollectorPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.expression')
  ConfigNodePropertyString? get schedulerPeriodExpression;

  ComDayCqTaggingImplTagGarbageCollectorProperties._();

  factory ComDayCqTaggingImplTagGarbageCollectorProperties([void updates(ComDayCqTaggingImplTagGarbageCollectorPropertiesBuilder b)]) = _$ComDayCqTaggingImplTagGarbageCollectorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqTaggingImplTagGarbageCollectorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqTaggingImplTagGarbageCollectorProperties> get serializer => _$ComDayCqTaggingImplTagGarbageCollectorPropertiesSerializer();
}

class _$ComDayCqTaggingImplTagGarbageCollectorPropertiesSerializer implements PrimitiveSerializer<ComDayCqTaggingImplTagGarbageCollectorProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqTaggingImplTagGarbageCollectorProperties, _$ComDayCqTaggingImplTagGarbageCollectorProperties];

  @override
  final String wireName = r'ComDayCqTaggingImplTagGarbageCollectorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqTaggingImplTagGarbageCollectorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.schedulerPeriodExpression != null) {
      yield r'scheduler.expression';
      yield serializers.serialize(
        object.schedulerPeriodExpression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqTaggingImplTagGarbageCollectorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqTaggingImplTagGarbageCollectorPropertiesBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqTaggingImplTagGarbageCollectorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqTaggingImplTagGarbageCollectorPropertiesBuilder();
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

