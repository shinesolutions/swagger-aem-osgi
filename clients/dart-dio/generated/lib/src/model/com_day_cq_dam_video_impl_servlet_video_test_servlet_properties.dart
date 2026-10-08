//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_video_impl_servlet_video_test_servlet_properties.g.dart';

/// ComDayCqDamVideoImplServletVideoTestServletProperties
///
/// Properties:
/// * [enabled] 
@BuiltValue()
abstract class ComDayCqDamVideoImplServletVideoTestServletProperties implements Built<ComDayCqDamVideoImplServletVideoTestServletProperties, ComDayCqDamVideoImplServletVideoTestServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  ComDayCqDamVideoImplServletVideoTestServletProperties._();

  factory ComDayCqDamVideoImplServletVideoTestServletProperties([void updates(ComDayCqDamVideoImplServletVideoTestServletPropertiesBuilder b)]) = _$ComDayCqDamVideoImplServletVideoTestServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamVideoImplServletVideoTestServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamVideoImplServletVideoTestServletProperties> get serializer => _$ComDayCqDamVideoImplServletVideoTestServletPropertiesSerializer();
}

class _$ComDayCqDamVideoImplServletVideoTestServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamVideoImplServletVideoTestServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamVideoImplServletVideoTestServletProperties, _$ComDayCqDamVideoImplServletVideoTestServletProperties];

  @override
  final String wireName = r'ComDayCqDamVideoImplServletVideoTestServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamVideoImplServletVideoTestServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    ComDayCqDamVideoImplServletVideoTestServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamVideoImplServletVideoTestServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  ComDayCqDamVideoImplServletVideoTestServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamVideoImplServletVideoTestServletPropertiesBuilder();
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

