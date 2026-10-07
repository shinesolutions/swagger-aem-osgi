//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_properties.g.dart';

/// ComDayCqDamCoreImplGfxCommonsGfxRendererProperties
///
/// Properties:
/// * [skipPeriodBufferedcache] 
@BuiltValue()
abstract class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties implements Built<ComDayCqDamCoreImplGfxCommonsGfxRendererProperties, ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesBuilder> {
  @BuiltValueField(wireName: r'skip.bufferedcache')
  ConfigNodePropertyBoolean? get skipPeriodBufferedcache;

  ComDayCqDamCoreImplGfxCommonsGfxRendererProperties._();

  factory ComDayCqDamCoreImplGfxCommonsGfxRendererProperties([void updates(ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesBuilder b)]) = _$ComDayCqDamCoreImplGfxCommonsGfxRendererProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplGfxCommonsGfxRendererProperties> get serializer => _$ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesSerializer();
}

class _$ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplGfxCommonsGfxRendererProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplGfxCommonsGfxRendererProperties, _$ComDayCqDamCoreImplGfxCommonsGfxRendererProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplGfxCommonsGfxRendererProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplGfxCommonsGfxRendererProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.skipPeriodBufferedcache != null) {
      yield r'skip.bufferedcache';
      yield serializers.serialize(
        object.skipPeriodBufferedcache,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplGfxCommonsGfxRendererProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'skip.bufferedcache':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.skipPeriodBufferedcache.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplGfxCommonsGfxRendererProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplGfxCommonsGfxRendererPropertiesBuilder();
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

