//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet_properties.g.dart';

/// ComDayCqDamCoreImplServletAssetXMPSearchServletProperties
///
/// Properties:
/// * [cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets] 
@BuiltValue()
abstract class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties implements Built<ComDayCqDamCoreImplServletAssetXMPSearchServletProperties, ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.batch.indesign.maxassets')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets;

  ComDayCqDamCoreImplServletAssetXMPSearchServletProperties._();

  factory ComDayCqDamCoreImplServletAssetXMPSearchServletProperties([void updates(ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesBuilder b)]) = _$ComDayCqDamCoreImplServletAssetXMPSearchServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplServletAssetXMPSearchServletProperties> get serializer => _$ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesSerializer();
}

class _$ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplServletAssetXMPSearchServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplServletAssetXMPSearchServletProperties, _$ComDayCqDamCoreImplServletAssetXMPSearchServletProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplServletAssetXMPSearchServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplServletAssetXMPSearchServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets != null) {
      yield r'cq.dam.batch.indesign.maxassets';
      yield serializers.serialize(
        object.cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplServletAssetXMPSearchServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.batch.indesign.maxassets':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplServletAssetXMPSearchServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesBuilder();
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

