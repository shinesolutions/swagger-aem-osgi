//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties.g.dart';

/// ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties
///
/// Properties:
/// * [cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory] 
/// * [cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge] 
/// * [cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension] 
@BuiltValue()
abstract class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties implements Built<ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties, ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.image.cache.max.memory')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory;

  @BuiltValueField(wireName: r'cq.dam.image.cache.max.age')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge;

  @BuiltValueField(wireName: r'cq.dam.image.cache.max.dimension')
  ConfigNodePropertyString? get cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension;

  ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties._();

  factory ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties([void updates(ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder b)]) = _$ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties> get serializer => _$ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesSerializer();
}

class _$ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties, _$ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory != null) {
      yield r'cq.dam.image.cache.max.memory';
      yield serializers.serialize(
        object.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge != null) {
      yield r'cq.dam.image.cache.max.age';
      yield serializers.serialize(
        object.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension != null) {
      yield r'cq.dam.image.cache.max.dimension';
      yield serializers.serialize(
        object.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.image.cache.max.memory':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory.replace(valueDes);
          break;
        case r'cq.dam.image.cache.max.age':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge.replace(valueDes);
          break;
        case r'cq.dam.image.cache.max.dimension':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplCacheCQBufferedImageCachePropertiesBuilder();
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

