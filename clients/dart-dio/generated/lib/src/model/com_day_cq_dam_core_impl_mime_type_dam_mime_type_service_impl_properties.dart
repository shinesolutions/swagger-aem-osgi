//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl_properties.g.dart';

/// ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties
///
/// Properties:
/// * [cqPeriodDamPeriodDetectPeriodAssetPeriodMimePeriodFromPeriodContent] 
@BuiltValue()
abstract class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties implements Built<ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties, ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.detect.asset.mime.from.content')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodDetectPeriodAssetPeriodMimePeriodFromPeriodContent;

  ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties._();

  factory ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties([void updates(ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesBuilder b)]) = _$ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties> get serializer => _$ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesSerializer();
}

class _$ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties, _$ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodDetectPeriodAssetPeriodMimePeriodFromPeriodContent != null) {
      yield r'cq.dam.detect.asset.mime.from.content';
      yield serializers.serialize(
        object.cqPeriodDamPeriodDetectPeriodAssetPeriodMimePeriodFromPeriodContent,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.detect.asset.mime.from.content':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodDetectPeriodAssetPeriodMimePeriodFromPeriodContent.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesBuilder();
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

