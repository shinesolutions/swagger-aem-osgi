//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_handler_standard_pdf_pdf_handler_properties.g.dart';

/// ComDayCqDamHandlerStandardPdfPdfHandlerProperties
///
/// Properties:
/// * [rasterPeriodAnnotation] 
@BuiltValue()
abstract class ComDayCqDamHandlerStandardPdfPdfHandlerProperties implements Built<ComDayCqDamHandlerStandardPdfPdfHandlerProperties, ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'raster.annotation')
  ConfigNodePropertyBoolean? get rasterPeriodAnnotation;

  ComDayCqDamHandlerStandardPdfPdfHandlerProperties._();

  factory ComDayCqDamHandlerStandardPdfPdfHandlerProperties([void updates(ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesBuilder b)]) = _$ComDayCqDamHandlerStandardPdfPdfHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamHandlerStandardPdfPdfHandlerProperties> get serializer => _$ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesSerializer();
}

class _$ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamHandlerStandardPdfPdfHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamHandlerStandardPdfPdfHandlerProperties, _$ComDayCqDamHandlerStandardPdfPdfHandlerProperties];

  @override
  final String wireName = r'ComDayCqDamHandlerStandardPdfPdfHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamHandlerStandardPdfPdfHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.rasterPeriodAnnotation != null) {
      yield r'raster.annotation';
      yield serializers.serialize(
        object.rasterPeriodAnnotation,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamHandlerStandardPdfPdfHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'raster.annotation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.rasterPeriodAnnotation.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamHandlerStandardPdfPdfHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamHandlerStandardPdfPdfHandlerPropertiesBuilder();
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

