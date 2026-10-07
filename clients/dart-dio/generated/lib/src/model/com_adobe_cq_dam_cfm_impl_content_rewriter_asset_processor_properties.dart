//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_properties.g.dart';

/// ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties
///
/// Properties:
/// * [pipelinePeriodType] 
@BuiltValue()
abstract class ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties implements Built<ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties, ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesBuilder> {
  @BuiltValueField(wireName: r'pipeline.type')
  ConfigNodePropertyString? get pipelinePeriodType;

  ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties._();

  factory ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties([void updates(ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesBuilder b)]) = _$ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties> get serializer => _$ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesSerializer();
}

class _$ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties, _$ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties];

  @override
  final String wireName = r'ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pipelinePeriodType != null) {
      yield r'pipeline.type';
      yield serializers.serialize(
        object.pipelinePeriodType,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pipeline.type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.pipelinePeriodType.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesBuilder();
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

