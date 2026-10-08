//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_handler_ffmpeg_locator_impl_properties.g.dart';

/// ComDayCqDamHandlerFfmpegLocatorImplProperties
///
/// Properties:
/// * [executablePeriodSearchpath] 
@BuiltValue()
abstract class ComDayCqDamHandlerFfmpegLocatorImplProperties implements Built<ComDayCqDamHandlerFfmpegLocatorImplProperties, ComDayCqDamHandlerFfmpegLocatorImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'executable.searchpath')
  ConfigNodePropertyArray? get executablePeriodSearchpath;

  ComDayCqDamHandlerFfmpegLocatorImplProperties._();

  factory ComDayCqDamHandlerFfmpegLocatorImplProperties([void updates(ComDayCqDamHandlerFfmpegLocatorImplPropertiesBuilder b)]) = _$ComDayCqDamHandlerFfmpegLocatorImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamHandlerFfmpegLocatorImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamHandlerFfmpegLocatorImplProperties> get serializer => _$ComDayCqDamHandlerFfmpegLocatorImplPropertiesSerializer();
}

class _$ComDayCqDamHandlerFfmpegLocatorImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamHandlerFfmpegLocatorImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamHandlerFfmpegLocatorImplProperties, _$ComDayCqDamHandlerFfmpegLocatorImplProperties];

  @override
  final String wireName = r'ComDayCqDamHandlerFfmpegLocatorImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamHandlerFfmpegLocatorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.executablePeriodSearchpath != null) {
      yield r'executable.searchpath';
      yield serializers.serialize(
        object.executablePeriodSearchpath,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamHandlerFfmpegLocatorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamHandlerFfmpegLocatorImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'executable.searchpath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.executablePeriodSearchpath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamHandlerFfmpegLocatorImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamHandlerFfmpegLocatorImplPropertiesBuilder();
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

