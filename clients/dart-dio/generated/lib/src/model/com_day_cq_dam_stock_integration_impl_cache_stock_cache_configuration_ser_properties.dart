//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_properties.g.dart';

/// ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties
///
/// Properties:
/// * [getCacheExpirationUnit] 
/// * [getCacheExpirationValue] 
@BuiltValue()
abstract class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties implements Built<ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties, ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesBuilder> {
  @BuiltValueField(wireName: r'getCacheExpirationUnit')
  ConfigNodePropertyDropDown? get getCacheExpirationUnit;

  @BuiltValueField(wireName: r'getCacheExpirationValue')
  ConfigNodePropertyInteger? get getCacheExpirationValue;

  ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties._();

  factory ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties([void updates(ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesBuilder b)]) = _$ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties> get serializer => _$ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesSerializer();
}

class _$ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties, _$ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties];

  @override
  final String wireName = r'ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.getCacheExpirationUnit != null) {
      yield r'getCacheExpirationUnit';
      yield serializers.serialize(
        object.getCacheExpirationUnit,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.getCacheExpirationValue != null) {
      yield r'getCacheExpirationValue';
      yield serializers.serialize(
        object.getCacheExpirationValue,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'getCacheExpirationUnit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.getCacheExpirationUnit.replace(valueDes);
          break;
        case r'getCacheExpirationValue':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.getCacheExpirationValue.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesBuilder();
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

