//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_extwidget_servlets_image_sprite_servlet_properties.g.dart';

/// ComDayCqExtwidgetServletsImageSpriteServletProperties
///
/// Properties:
/// * [maxWidth] 
/// * [maxHeight] 
@BuiltValue()
abstract class ComDayCqExtwidgetServletsImageSpriteServletProperties implements Built<ComDayCqExtwidgetServletsImageSpriteServletProperties, ComDayCqExtwidgetServletsImageSpriteServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'maxWidth')
  ConfigNodePropertyInteger? get maxWidth;

  @BuiltValueField(wireName: r'maxHeight')
  ConfigNodePropertyInteger? get maxHeight;

  ComDayCqExtwidgetServletsImageSpriteServletProperties._();

  factory ComDayCqExtwidgetServletsImageSpriteServletProperties([void updates(ComDayCqExtwidgetServletsImageSpriteServletPropertiesBuilder b)]) = _$ComDayCqExtwidgetServletsImageSpriteServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqExtwidgetServletsImageSpriteServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqExtwidgetServletsImageSpriteServletProperties> get serializer => _$ComDayCqExtwidgetServletsImageSpriteServletPropertiesSerializer();
}

class _$ComDayCqExtwidgetServletsImageSpriteServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqExtwidgetServletsImageSpriteServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqExtwidgetServletsImageSpriteServletProperties, _$ComDayCqExtwidgetServletsImageSpriteServletProperties];

  @override
  final String wireName = r'ComDayCqExtwidgetServletsImageSpriteServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqExtwidgetServletsImageSpriteServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxWidth != null) {
      yield r'maxWidth';
      yield serializers.serialize(
        object.maxWidth,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxHeight != null) {
      yield r'maxHeight';
      yield serializers.serialize(
        object.maxHeight,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqExtwidgetServletsImageSpriteServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqExtwidgetServletsImageSpriteServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'maxWidth':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxWidth.replace(valueDes);
          break;
        case r'maxHeight':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxHeight.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqExtwidgetServletsImageSpriteServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqExtwidgetServletsImageSpriteServletPropertiesBuilder();
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

