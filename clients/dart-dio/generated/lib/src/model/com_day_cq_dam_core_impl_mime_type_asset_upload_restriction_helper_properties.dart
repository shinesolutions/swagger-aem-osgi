//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties.g.dart';

/// ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties
///
/// Properties:
/// * [cqPeriodDamPeriodAllowPeriodAllPeriodMime] 
/// * [cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes] 
@BuiltValue()
abstract class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties implements Built<ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties, ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.allow.all.mime')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodAllowPeriodAllPeriodMime;

  @BuiltValueField(wireName: r'cq.dam.allowed.asset.mimes')
  ConfigNodePropertyArray? get cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes;

  ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties._();

  factory ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties([void updates(ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesBuilder b)]) = _$ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties> get serializer => _$ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesSerializer();
}

class _$ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties, _$ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodAllowPeriodAllPeriodMime != null) {
      yield r'cq.dam.allow.all.mime';
      yield serializers.serialize(
        object.cqPeriodDamPeriodAllowPeriodAllPeriodMime,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes != null) {
      yield r'cq.dam.allowed.asset.mimes';
      yield serializers.serialize(
        object.cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.allow.all.mime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodAllowPeriodAllPeriodMime.replace(valueDes);
          break;
        case r'cq.dam.allowed.asset.mimes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesBuilder();
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

