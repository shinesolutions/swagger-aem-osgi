//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties.g.dart';

/// ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties
///
/// Properties:
/// * [cqPeriodDamPeriodScene7PeriodAssetmimetypeservicePeriodMapping] 
@BuiltValue()
abstract class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties implements Built<ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties, ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.scene7.assetmimetypeservice.mapping')
  ConfigNodePropertyArray? get cqPeriodDamPeriodScene7PeriodAssetmimetypeservicePeriodMapping;

  ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties._();

  factory ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties([void updates(ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesBuilder b)]) = _$ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties> get serializer => _$ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesSerializer();
}

class _$ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties, _$ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties];

  @override
  final String wireName = r'ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodScene7PeriodAssetmimetypeservicePeriodMapping != null) {
      yield r'cq.dam.scene7.assetmimetypeservice.mapping';
      yield serializers.serialize(
        object.cqPeriodDamPeriodScene7PeriodAssetmimetypeservicePeriodMapping,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.scene7.assetmimetypeservice.mapping':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodScene7PeriodAssetmimetypeservicePeriodMapping.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesBuilder();
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

