//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_handler_eps_format_handler_properties.g.dart';

/// ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties
///
/// Properties:
/// * [mimetype] 
@BuiltValue()
abstract class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties implements Built<ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties, ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'mimetype')
  ConfigNodePropertyString? get mimetype;

  ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties._();

  factory ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties([void updates(ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesBuilder b)]) = _$ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties> get serializer => _$ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesSerializer();
}

class _$ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties, _$ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.mimetype != null) {
      yield r'mimetype';
      yield serializers.serialize(
        object.mimetype,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'mimetype':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
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
  ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesBuilder();
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

