//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties.g.dart';

/// ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties
///
/// Properties:
/// * [batchPeriodCommitPeriodSize] 
@BuiltValue()
abstract class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties implements Built<ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties, ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'batch.commit.size')
  ConfigNodePropertyInteger? get batchPeriodCommitPeriodSize;

  ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties._();

  factory ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties([void updates(ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesBuilder b)]) = _$ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties> get serializer => _$ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesSerializer();
}

class _$ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties, _$ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties];

  @override
  final String wireName = r'ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.batchPeriodCommitPeriodSize != null) {
      yield r'batch.commit.size';
      yield serializers.serialize(
        object.batchPeriodCommitPeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'batch.commit.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.batchPeriodCommitPeriodSize.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesBuilder();
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

