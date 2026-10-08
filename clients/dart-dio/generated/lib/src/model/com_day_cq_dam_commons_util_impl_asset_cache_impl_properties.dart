//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_commons_util_impl_asset_cache_impl_properties.g.dart';

/// ComDayCqDamCommonsUtilImplAssetCacheImplProperties
///
/// Properties:
/// * [largePeriodFilePeriodMin] 
/// * [cachePeriodApply] 
/// * [mimePeriodTypes] 
@BuiltValue()
abstract class ComDayCqDamCommonsUtilImplAssetCacheImplProperties implements Built<ComDayCqDamCommonsUtilImplAssetCacheImplProperties, ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'large.file.min')
  ConfigNodePropertyInteger? get largePeriodFilePeriodMin;

  @BuiltValueField(wireName: r'cache.apply')
  ConfigNodePropertyBoolean? get cachePeriodApply;

  @BuiltValueField(wireName: r'mime.types')
  ConfigNodePropertyArray? get mimePeriodTypes;

  ComDayCqDamCommonsUtilImplAssetCacheImplProperties._();

  factory ComDayCqDamCommonsUtilImplAssetCacheImplProperties([void updates(ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder b)]) = _$ComDayCqDamCommonsUtilImplAssetCacheImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCommonsUtilImplAssetCacheImplProperties> get serializer => _$ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesSerializer();
}

class _$ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCommonsUtilImplAssetCacheImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCommonsUtilImplAssetCacheImplProperties, _$ComDayCqDamCommonsUtilImplAssetCacheImplProperties];

  @override
  final String wireName = r'ComDayCqDamCommonsUtilImplAssetCacheImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCommonsUtilImplAssetCacheImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.largePeriodFilePeriodMin != null) {
      yield r'large.file.min';
      yield serializers.serialize(
        object.largePeriodFilePeriodMin,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cachePeriodApply != null) {
      yield r'cache.apply';
      yield serializers.serialize(
        object.cachePeriodApply,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.mimePeriodTypes != null) {
      yield r'mime.types';
      yield serializers.serialize(
        object.mimePeriodTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCommonsUtilImplAssetCacheImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'large.file.min':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.largePeriodFilePeriodMin.replace(valueDes);
          break;
        case r'cache.apply':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cachePeriodApply.replace(valueDes);
          break;
        case r'mime.types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.mimePeriodTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCommonsUtilImplAssetCacheImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCommonsUtilImplAssetCacheImplPropertiesBuilder();
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

