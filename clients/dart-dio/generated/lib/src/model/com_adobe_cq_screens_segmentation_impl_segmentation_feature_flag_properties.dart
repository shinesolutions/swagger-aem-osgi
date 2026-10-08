//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties.g.dart';

/// ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties
///
/// Properties:
/// * [enableDataTriggeredContent] 
@BuiltValue()
abstract class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties implements Built<ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties, ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesBuilder> {
  @BuiltValueField(wireName: r'enableDataTriggeredContent')
  ConfigNodePropertyBoolean? get enableDataTriggeredContent;

  ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties._();

  factory ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties([void updates(ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesBuilder b)]) = _$ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties> get serializer => _$ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesSerializer();
}

class _$ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties, _$ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties];

  @override
  final String wireName = r'ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enableDataTriggeredContent != null) {
      yield r'enableDataTriggeredContent';
      yield serializers.serialize(
        object.enableDataTriggeredContent,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enableDataTriggeredContent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enableDataTriggeredContent.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesBuilder();
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

