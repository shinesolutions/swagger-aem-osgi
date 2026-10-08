//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_servlet_collections_servlet_properties.g.dart';

/// ComDayCqDamCoreImplServletCollectionsServletProperties
///
/// Properties:
/// * [cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties] 
/// * [cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit] 
@BuiltValue()
abstract class ComDayCqDamCoreImplServletCollectionsServletProperties implements Built<ComDayCqDamCoreImplServletCollectionsServletProperties, ComDayCqDamCoreImplServletCollectionsServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.batch.collections.properties')
  ConfigNodePropertyArray? get cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties;

  @BuiltValueField(wireName: r'cq.dam.batch.collections.limit')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit;

  ComDayCqDamCoreImplServletCollectionsServletProperties._();

  factory ComDayCqDamCoreImplServletCollectionsServletProperties([void updates(ComDayCqDamCoreImplServletCollectionsServletPropertiesBuilder b)]) = _$ComDayCqDamCoreImplServletCollectionsServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplServletCollectionsServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplServletCollectionsServletProperties> get serializer => _$ComDayCqDamCoreImplServletCollectionsServletPropertiesSerializer();
}

class _$ComDayCqDamCoreImplServletCollectionsServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplServletCollectionsServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplServletCollectionsServletProperties, _$ComDayCqDamCoreImplServletCollectionsServletProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplServletCollectionsServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplServletCollectionsServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties != null) {
      yield r'cq.dam.batch.collections.properties';
      yield serializers.serialize(
        object.cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit != null) {
      yield r'cq.dam.batch.collections.limit';
      yield serializers.serialize(
        object.cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplServletCollectionsServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplServletCollectionsServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.batch.collections.properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties.replace(valueDes);
          break;
        case r'cq.dam.batch.collections.limit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplServletCollectionsServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplServletCollectionsServletPropertiesBuilder();
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

