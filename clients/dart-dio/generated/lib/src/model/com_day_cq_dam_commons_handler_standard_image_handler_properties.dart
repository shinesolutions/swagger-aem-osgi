//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_commons_handler_standard_image_handler_properties.g.dart';

/// ComDayCqDamCommonsHandlerStandardImageHandlerProperties
///
/// Properties:
/// * [largeFileThreshold] 
/// * [largeCommentThreshold] 
/// * [cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction] 
@BuiltValue()
abstract class ComDayCqDamCommonsHandlerStandardImageHandlerProperties implements Built<ComDayCqDamCommonsHandlerStandardImageHandlerProperties, ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'large_file_threshold')
  ConfigNodePropertyInteger? get largeFileThreshold;

  @BuiltValueField(wireName: r'large_comment_threshold')
  ConfigNodePropertyInteger? get largeCommentThreshold;

  @BuiltValueField(wireName: r'cq.dam.enable.ext.meta.extraction')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction;

  ComDayCqDamCommonsHandlerStandardImageHandlerProperties._();

  factory ComDayCqDamCommonsHandlerStandardImageHandlerProperties([void updates(ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder b)]) = _$ComDayCqDamCommonsHandlerStandardImageHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCommonsHandlerStandardImageHandlerProperties> get serializer => _$ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesSerializer();
}

class _$ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCommonsHandlerStandardImageHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCommonsHandlerStandardImageHandlerProperties, _$ComDayCqDamCommonsHandlerStandardImageHandlerProperties];

  @override
  final String wireName = r'ComDayCqDamCommonsHandlerStandardImageHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCommonsHandlerStandardImageHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    if (object.cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction != null) {
      yield r'cq.dam.enable.ext.meta.extraction';
      yield serializers.serialize(
        object.cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCommonsHandlerStandardImageHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder result,
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
        case r'large_comment_threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.largeCommentThreshold.replace(valueDes);
          break;
        case r'cq.dam.enable.ext.meta.extraction':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCommonsHandlerStandardImageHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCommonsHandlerStandardImageHandlerPropertiesBuilder();
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

