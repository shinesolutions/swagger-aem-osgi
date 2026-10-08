//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_handler_standard_psd_psd_handler_properties.g.dart';

/// ComDayCqDamHandlerStandardPsdPsdHandlerProperties
///
/// Properties:
/// * [largeFileThreshold] 
@BuiltValue()
abstract class ComDayCqDamHandlerStandardPsdPsdHandlerProperties implements Built<ComDayCqDamHandlerStandardPsdPsdHandlerProperties, ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'large_file_threshold')
  ConfigNodePropertyInteger? get largeFileThreshold;

  ComDayCqDamHandlerStandardPsdPsdHandlerProperties._();

  factory ComDayCqDamHandlerStandardPsdPsdHandlerProperties([void updates(ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesBuilder b)]) = _$ComDayCqDamHandlerStandardPsdPsdHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamHandlerStandardPsdPsdHandlerProperties> get serializer => _$ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesSerializer();
}

class _$ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamHandlerStandardPsdPsdHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamHandlerStandardPsdPsdHandlerProperties, _$ComDayCqDamHandlerStandardPsdPsdHandlerProperties];

  @override
  final String wireName = r'ComDayCqDamHandlerStandardPsdPsdHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamHandlerStandardPsdPsdHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.largeFileThreshold != null) {
      yield r'large_file_threshold';
      yield serializers.serialize(
        object.largeFileThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamHandlerStandardPsdPsdHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'large_file_threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.largeFileThreshold.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamHandlerStandardPsdPsdHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesBuilder();
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

