//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_handler_standard_ps_post_script_handler_properties.g.dart';

/// ComDayCqDamHandlerStandardPsPostScriptHandlerProperties
///
/// Properties:
/// * [rasterPeriodAnnotation] 
@BuiltValue()
abstract class ComDayCqDamHandlerStandardPsPostScriptHandlerProperties implements Built<ComDayCqDamHandlerStandardPsPostScriptHandlerProperties, ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'raster.annotation')
  ConfigNodePropertyBoolean? get rasterPeriodAnnotation;

  ComDayCqDamHandlerStandardPsPostScriptHandlerProperties._();

  factory ComDayCqDamHandlerStandardPsPostScriptHandlerProperties([void updates(ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesBuilder b)]) = _$ComDayCqDamHandlerStandardPsPostScriptHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamHandlerStandardPsPostScriptHandlerProperties> get serializer => _$ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesSerializer();
}

class _$ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamHandlerStandardPsPostScriptHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamHandlerStandardPsPostScriptHandlerProperties, _$ComDayCqDamHandlerStandardPsPostScriptHandlerProperties];

  @override
  final String wireName = r'ComDayCqDamHandlerStandardPsPostScriptHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamHandlerStandardPsPostScriptHandlerProperties object, {
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
    ComDayCqDamHandlerStandardPsPostScriptHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesBuilder result,
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
  ComDayCqDamHandlerStandardPsPostScriptHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamHandlerStandardPsPostScriptHandlerPropertiesBuilder();
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

