//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_image_internal_font_font_helper_properties.g.dart';

/// ComDayCqImageInternalFontFontHelperProperties
///
/// Properties:
/// * [fontpath] 
/// * [oversamplingFactor] 
@BuiltValue()
abstract class ComDayCqImageInternalFontFontHelperProperties implements Built<ComDayCqImageInternalFontFontHelperProperties, ComDayCqImageInternalFontFontHelperPropertiesBuilder> {
  @BuiltValueField(wireName: r'fontpath')
  ConfigNodePropertyArray? get fontpath;

  @BuiltValueField(wireName: r'oversamplingFactor')
  ConfigNodePropertyInteger? get oversamplingFactor;

  ComDayCqImageInternalFontFontHelperProperties._();

  factory ComDayCqImageInternalFontFontHelperProperties([void updates(ComDayCqImageInternalFontFontHelperPropertiesBuilder b)]) = _$ComDayCqImageInternalFontFontHelperProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqImageInternalFontFontHelperPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqImageInternalFontFontHelperProperties> get serializer => _$ComDayCqImageInternalFontFontHelperPropertiesSerializer();
}

class _$ComDayCqImageInternalFontFontHelperPropertiesSerializer implements PrimitiveSerializer<ComDayCqImageInternalFontFontHelperProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqImageInternalFontFontHelperProperties, _$ComDayCqImageInternalFontFontHelperProperties];

  @override
  final String wireName = r'ComDayCqImageInternalFontFontHelperProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqImageInternalFontFontHelperProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fontpath != null) {
      yield r'fontpath';
      yield serializers.serialize(
        object.fontpath,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.oversamplingFactor != null) {
      yield r'oversamplingFactor';
      yield serializers.serialize(
        object.oversamplingFactor,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqImageInternalFontFontHelperProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqImageInternalFontFontHelperPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'fontpath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.fontpath.replace(valueDes);
          break;
        case r'oversamplingFactor':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.oversamplingFactor.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqImageInternalFontFontHelperProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqImageInternalFontFontHelperPropertiesBuilder();
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

