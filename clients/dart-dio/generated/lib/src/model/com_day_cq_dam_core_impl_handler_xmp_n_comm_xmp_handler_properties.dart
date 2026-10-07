//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties.g.dart';

/// ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties
///
/// Properties:
/// * [xmphandlerPeriodCqPeriodFormats] 
@BuiltValue()
abstract class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties implements Built<ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties, ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'xmphandler.cq.formats')
  ConfigNodePropertyArray? get xmphandlerPeriodCqPeriodFormats;

  ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties._();

  factory ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties([void updates(ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesBuilder b)]) = _$ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties> get serializer => _$ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesSerializer();
}

class _$ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties, _$ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.xmphandlerPeriodCqPeriodFormats != null) {
      yield r'xmphandler.cq.formats';
      yield serializers.serialize(
        object.xmphandlerPeriodCqPeriodFormats,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'xmphandler.cq.formats':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.xmphandlerPeriodCqPeriodFormats.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesBuilder();
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

