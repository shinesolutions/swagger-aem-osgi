//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_screens_impl_screens_channel_post_processor_properties.g.dart';

/// ComAdobeCqScreensImplScreensChannelPostProcessorProperties
///
/// Properties:
/// * [screensPeriodChannelsPeriodPropertiesPeriodToPeriodRemove] 
@BuiltValue()
abstract class ComAdobeCqScreensImplScreensChannelPostProcessorProperties implements Built<ComAdobeCqScreensImplScreensChannelPostProcessorProperties, ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesBuilder> {
  @BuiltValueField(wireName: r'screens.channels.properties.to.remove')
  ConfigNodePropertyArray? get screensPeriodChannelsPeriodPropertiesPeriodToPeriodRemove;

  ComAdobeCqScreensImplScreensChannelPostProcessorProperties._();

  factory ComAdobeCqScreensImplScreensChannelPostProcessorProperties([void updates(ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesBuilder b)]) = _$ComAdobeCqScreensImplScreensChannelPostProcessorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqScreensImplScreensChannelPostProcessorProperties> get serializer => _$ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesSerializer();
}

class _$ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqScreensImplScreensChannelPostProcessorProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqScreensImplScreensChannelPostProcessorProperties, _$ComAdobeCqScreensImplScreensChannelPostProcessorProperties];

  @override
  final String wireName = r'ComAdobeCqScreensImplScreensChannelPostProcessorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqScreensImplScreensChannelPostProcessorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.screensPeriodChannelsPeriodPropertiesPeriodToPeriodRemove != null) {
      yield r'screens.channels.properties.to.remove';
      yield serializers.serialize(
        object.screensPeriodChannelsPeriodPropertiesPeriodToPeriodRemove,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqScreensImplScreensChannelPostProcessorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'screens.channels.properties.to.remove':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.screensPeriodChannelsPeriodPropertiesPeriodToPeriodRemove.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqScreensImplScreensChannelPostProcessorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesBuilder();
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

