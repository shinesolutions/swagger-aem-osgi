//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_logging_impl_log_analyser_impl_properties.g.dart';

/// ComAdobeGraniteLoggingImplLogAnalyserImplProperties
///
/// Properties:
/// * [messagesPeriodQueuePeriodSize] 
/// * [loggerPeriodConfig] 
/// * [messagesPeriodSize] 
@BuiltValue()
abstract class ComAdobeGraniteLoggingImplLogAnalyserImplProperties implements Built<ComAdobeGraniteLoggingImplLogAnalyserImplProperties, ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'messages.queue.size')
  ConfigNodePropertyInteger? get messagesPeriodQueuePeriodSize;

  @BuiltValueField(wireName: r'logger.config')
  ConfigNodePropertyArray? get loggerPeriodConfig;

  @BuiltValueField(wireName: r'messages.size')
  ConfigNodePropertyInteger? get messagesPeriodSize;

  ComAdobeGraniteLoggingImplLogAnalyserImplProperties._();

  factory ComAdobeGraniteLoggingImplLogAnalyserImplProperties([void updates(ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder b)]) = _$ComAdobeGraniteLoggingImplLogAnalyserImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteLoggingImplLogAnalyserImplProperties> get serializer => _$ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesSerializer();
}

class _$ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteLoggingImplLogAnalyserImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteLoggingImplLogAnalyserImplProperties, _$ComAdobeGraniteLoggingImplLogAnalyserImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteLoggingImplLogAnalyserImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteLoggingImplLogAnalyserImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.messagesPeriodQueuePeriodSize != null) {
      yield r'messages.queue.size';
      yield serializers.serialize(
        object.messagesPeriodQueuePeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.loggerPeriodConfig != null) {
      yield r'logger.config';
      yield serializers.serialize(
        object.loggerPeriodConfig,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.messagesPeriodSize != null) {
      yield r'messages.size';
      yield serializers.serialize(
        object.messagesPeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteLoggingImplLogAnalyserImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'messages.queue.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.messagesPeriodQueuePeriodSize.replace(valueDes);
          break;
        case r'logger.config':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.loggerPeriodConfig.replace(valueDes);
          break;
        case r'messages.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.messagesPeriodSize.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteLoggingImplLogAnalyserImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder();
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

