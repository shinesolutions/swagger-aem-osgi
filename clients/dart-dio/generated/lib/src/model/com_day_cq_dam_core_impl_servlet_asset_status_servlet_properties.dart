//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_servlet_asset_status_servlet_properties.g.dart';

/// ComDayCqDamCoreImplServletAssetStatusServletProperties
///
/// Properties:
/// * [cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets] 
@BuiltValue()
abstract class ComDayCqDamCoreImplServletAssetStatusServletProperties implements Built<ComDayCqDamCoreImplServletAssetStatusServletProperties, ComDayCqDamCoreImplServletAssetStatusServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.batch.status.maxassets')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets;

  ComDayCqDamCoreImplServletAssetStatusServletProperties._();

  factory ComDayCqDamCoreImplServletAssetStatusServletProperties([void updates(ComDayCqDamCoreImplServletAssetStatusServletPropertiesBuilder b)]) = _$ComDayCqDamCoreImplServletAssetStatusServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplServletAssetStatusServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplServletAssetStatusServletProperties> get serializer => _$ComDayCqDamCoreImplServletAssetStatusServletPropertiesSerializer();
}

class _$ComDayCqDamCoreImplServletAssetStatusServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplServletAssetStatusServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplServletAssetStatusServletProperties, _$ComDayCqDamCoreImplServletAssetStatusServletProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplServletAssetStatusServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplServletAssetStatusServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets != null) {
      yield r'cq.dam.batch.status.maxassets';
      yield serializers.serialize(
        object.cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplServletAssetStatusServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplServletAssetStatusServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.batch.status.maxassets':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplServletAssetStatusServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplServletAssetStatusServletPropertiesBuilder();
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

