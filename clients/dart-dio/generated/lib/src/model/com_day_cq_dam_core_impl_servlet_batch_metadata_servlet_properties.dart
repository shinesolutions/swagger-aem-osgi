//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties.g.dart';

/// ComDayCqDamCoreImplServletBatchMetadataServletProperties
///
/// Properties:
/// * [cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault] 
/// * [cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault] 
/// * [cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources] 
@BuiltValue()
abstract class ComDayCqDamCoreImplServletBatchMetadataServletProperties implements Built<ComDayCqDamCoreImplServletBatchMetadataServletProperties, ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.batch.metadata.asset.default')
  ConfigNodePropertyArray? get cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault;

  @BuiltValueField(wireName: r'cq.dam.batch.metadata.collection.default')
  ConfigNodePropertyArray? get cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault;

  @BuiltValueField(wireName: r'cq.dam.batch.metadata.maxresources')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources;

  ComDayCqDamCoreImplServletBatchMetadataServletProperties._();

  factory ComDayCqDamCoreImplServletBatchMetadataServletProperties([void updates(ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder b)]) = _$ComDayCqDamCoreImplServletBatchMetadataServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplServletBatchMetadataServletProperties> get serializer => _$ComDayCqDamCoreImplServletBatchMetadataServletPropertiesSerializer();
}

class _$ComDayCqDamCoreImplServletBatchMetadataServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplServletBatchMetadataServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplServletBatchMetadataServletProperties, _$ComDayCqDamCoreImplServletBatchMetadataServletProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplServletBatchMetadataServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplServletBatchMetadataServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault != null) {
      yield r'cq.dam.batch.metadata.asset.default';
      yield serializers.serialize(
        object.cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault != null) {
      yield r'cq.dam.batch.metadata.collection.default';
      yield serializers.serialize(
        object.cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources != null) {
      yield r'cq.dam.batch.metadata.maxresources';
      yield serializers.serialize(
        object.cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplServletBatchMetadataServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.batch.metadata.asset.default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault.replace(valueDes);
          break;
        case r'cq.dam.batch.metadata.collection.default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault.replace(valueDes);
          break;
        case r'cq.dam.batch.metadata.maxresources':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplServletBatchMetadataServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder();
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

