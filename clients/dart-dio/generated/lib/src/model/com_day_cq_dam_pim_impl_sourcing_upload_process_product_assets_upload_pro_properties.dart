//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_properties.g.dart';

/// ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties
///
/// Properties:
/// * [deletePeriodZipPeriodFile] 
@BuiltValue()
abstract class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties implements Built<ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties, ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesBuilder> {
  @BuiltValueField(wireName: r'delete.zip.file')
  ConfigNodePropertyBoolean? get deletePeriodZipPeriodFile;

  ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties._();

  factory ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties([void updates(ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesBuilder b)]) = _$ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties> get serializer => _$ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesSerializer();
}

class _$ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties, _$ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties];

  @override
  final String wireName = r'ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.deletePeriodZipPeriodFile != null) {
      yield r'delete.zip.file';
      yield serializers.serialize(
        object.deletePeriodZipPeriodFile,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'delete.zip.file':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.deletePeriodZipPeriodFile.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesBuilder();
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

