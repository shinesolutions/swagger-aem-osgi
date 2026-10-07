//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_search_impl_builder_query_builder_impl_properties.g.dart';

/// ComDayCqSearchImplBuilderQueryBuilderImplProperties
///
/// Properties:
/// * [excerptPeriodProperties] 
/// * [cachePeriodMaxPeriodEntries] 
/// * [cachePeriodEntryPeriodLifetime] 
/// * [xpathPeriodUnion] 
@BuiltValue()
abstract class ComDayCqSearchImplBuilderQueryBuilderImplProperties implements Built<ComDayCqSearchImplBuilderQueryBuilderImplProperties, ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'excerpt.properties')
  ConfigNodePropertyArray? get excerptPeriodProperties;

  @BuiltValueField(wireName: r'cache.max.entries')
  ConfigNodePropertyInteger? get cachePeriodMaxPeriodEntries;

  @BuiltValueField(wireName: r'cache.entry.lifetime')
  ConfigNodePropertyInteger? get cachePeriodEntryPeriodLifetime;

  @BuiltValueField(wireName: r'xpath.union')
  ConfigNodePropertyBoolean? get xpathPeriodUnion;

  ComDayCqSearchImplBuilderQueryBuilderImplProperties._();

  factory ComDayCqSearchImplBuilderQueryBuilderImplProperties([void updates(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder b)]) = _$ComDayCqSearchImplBuilderQueryBuilderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqSearchImplBuilderQueryBuilderImplProperties> get serializer => _$ComDayCqSearchImplBuilderQueryBuilderImplPropertiesSerializer();
}

class _$ComDayCqSearchImplBuilderQueryBuilderImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqSearchImplBuilderQueryBuilderImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqSearchImplBuilderQueryBuilderImplProperties, _$ComDayCqSearchImplBuilderQueryBuilderImplProperties];

  @override
  final String wireName = r'ComDayCqSearchImplBuilderQueryBuilderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqSearchImplBuilderQueryBuilderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.excerptPeriodProperties != null) {
      yield r'excerpt.properties';
      yield serializers.serialize(
        object.excerptPeriodProperties,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cachePeriodMaxPeriodEntries != null) {
      yield r'cache.max.entries';
      yield serializers.serialize(
        object.cachePeriodMaxPeriodEntries,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cachePeriodEntryPeriodLifetime != null) {
      yield r'cache.entry.lifetime';
      yield serializers.serialize(
        object.cachePeriodEntryPeriodLifetime,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.xpathPeriodUnion != null) {
      yield r'xpath.union';
      yield serializers.serialize(
        object.xpathPeriodUnion,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqSearchImplBuilderQueryBuilderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'excerpt.properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.excerptPeriodProperties.replace(valueDes);
          break;
        case r'cache.max.entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cachePeriodMaxPeriodEntries.replace(valueDes);
          break;
        case r'cache.entry.lifetime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cachePeriodEntryPeriodLifetime.replace(valueDes);
          break;
        case r'xpath.union':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.xpathPeriodUnion.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqSearchImplBuilderQueryBuilderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder();
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

