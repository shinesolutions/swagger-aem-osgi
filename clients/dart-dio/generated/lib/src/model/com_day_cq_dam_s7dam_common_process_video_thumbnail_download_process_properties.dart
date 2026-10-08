//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process_properties.g.dart';

/// ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties
///
/// Properties:
/// * [processPeriodLabel] 
@BuiltValue()
abstract class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties implements Built<ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties, ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesBuilder> {
  @BuiltValueField(wireName: r'process.label')
  ConfigNodePropertyString? get processPeriodLabel;

  ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties._();

  factory ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties([void updates(ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesBuilder b)]) = _$ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties> get serializer => _$ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesSerializer();
}

class _$ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties, _$ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties];

  @override
  final String wireName = r'ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.processPeriodLabel != null) {
      yield r'process.label';
      yield serializers.serialize(
        object.processPeriodLabel,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'process.label':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.processPeriodLabel.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesBuilder();
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

