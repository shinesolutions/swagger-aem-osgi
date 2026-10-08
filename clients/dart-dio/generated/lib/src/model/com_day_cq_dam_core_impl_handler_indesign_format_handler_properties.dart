//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_handler_indesign_format_handler_properties.g.dart';

/// ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties
///
/// Properties:
/// * [mimetype] 
@BuiltValue()
abstract class ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties implements Built<ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties, ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'mimetype')
  ConfigNodePropertyArray? get mimetype;

  ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties._();

  factory ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties([void updates(ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesBuilder b)]) = _$ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties> get serializer => _$ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesSerializer();
}

class _$ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties, _$ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.mimetype != null) {
      yield r'mimetype';
      yield serializers.serialize(
        object.mimetype,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'mimetype':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.mimetype.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesBuilder();
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

