//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_handler_jpeg_handler_properties.g.dart';

/// ComDayCqDamCoreImplHandlerJpegHandlerProperties
///
/// Properties:
/// * [cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction] 
/// * [largeFileThreshold] 
/// * [largeCommentThreshold] 
@BuiltValue()
abstract class ComDayCqDamCoreImplHandlerJpegHandlerProperties implements Built<ComDayCqDamCoreImplHandlerJpegHandlerProperties, ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.enable.ext.meta.extraction')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction;

  @BuiltValueField(wireName: r'large_file_threshold')
  ConfigNodePropertyInteger? get largeFileThreshold;

  @BuiltValueField(wireName: r'large_comment_threshold')
  ConfigNodePropertyInteger? get largeCommentThreshold;

  ComDayCqDamCoreImplHandlerJpegHandlerProperties._();

  factory ComDayCqDamCoreImplHandlerJpegHandlerProperties([void updates(ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder b)]) = _$ComDayCqDamCoreImplHandlerJpegHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplHandlerJpegHandlerProperties> get serializer => _$ComDayCqDamCoreImplHandlerJpegHandlerPropertiesSerializer();
}

class _$ComDayCqDamCoreImplHandlerJpegHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplHandlerJpegHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplHandlerJpegHandlerProperties, _$ComDayCqDamCoreImplHandlerJpegHandlerProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplHandlerJpegHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplHandlerJpegHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction != null) {
      yield r'cq.dam.enable.ext.meta.extraction';
      yield serializers.serialize(
        object.cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.largeFileThreshold != null) {
      yield r'large_file_threshold';
      yield serializers.serialize(
        object.largeFileThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.largeCommentThreshold != null) {
      yield r'large_comment_threshold';
      yield serializers.serialize(
        object.largeCommentThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplHandlerJpegHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.enable.ext.meta.extraction':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction.replace(valueDes);
          break;
        case r'large_file_threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.largeFileThreshold.replace(valueDes);
          break;
        case r'large_comment_threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.largeCommentThreshold.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplHandlerJpegHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplHandlerJpegHandlerPropertiesBuilder();
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

