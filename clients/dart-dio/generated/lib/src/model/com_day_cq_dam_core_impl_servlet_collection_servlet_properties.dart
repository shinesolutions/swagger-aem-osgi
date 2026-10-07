//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_servlet_collection_servlet_properties.g.dart';

/// ComDayCqDamCoreImplServletCollectionServletProperties
///
/// Properties:
/// * [cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties] 
/// * [cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections] 
@BuiltValue()
abstract class ComDayCqDamCoreImplServletCollectionServletProperties implements Built<ComDayCqDamCoreImplServletCollectionServletProperties, ComDayCqDamCoreImplServletCollectionServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.batch.collection.properties')
  ConfigNodePropertyArray? get cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties;

  @BuiltValueField(wireName: r'cq.dam.batch.collection.maxcollections')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections;

  ComDayCqDamCoreImplServletCollectionServletProperties._();

  factory ComDayCqDamCoreImplServletCollectionServletProperties([void updates(ComDayCqDamCoreImplServletCollectionServletPropertiesBuilder b)]) = _$ComDayCqDamCoreImplServletCollectionServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplServletCollectionServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplServletCollectionServletProperties> get serializer => _$ComDayCqDamCoreImplServletCollectionServletPropertiesSerializer();
}

class _$ComDayCqDamCoreImplServletCollectionServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplServletCollectionServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplServletCollectionServletProperties, _$ComDayCqDamCoreImplServletCollectionServletProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplServletCollectionServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplServletCollectionServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties != null) {
      yield r'cq.dam.batch.collection.properties';
      yield serializers.serialize(
        object.cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections != null) {
      yield r'cq.dam.batch.collection.maxcollections';
      yield serializers.serialize(
        object.cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplServletCollectionServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplServletCollectionServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.batch.collection.properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties.replace(valueDes);
          break;
        case r'cq.dam.batch.collection.maxcollections':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplServletCollectionServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplServletCollectionServletPropertiesBuilder();
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

