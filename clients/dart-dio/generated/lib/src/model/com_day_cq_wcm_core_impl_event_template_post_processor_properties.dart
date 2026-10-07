//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_event_template_post_processor_properties.g.dart';

/// ComDayCqWcmCoreImplEventTemplatePostProcessorProperties
///
/// Properties:
/// * [paths] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplEventTemplatePostProcessorProperties implements Built<ComDayCqWcmCoreImplEventTemplatePostProcessorProperties, ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesBuilder> {
  @BuiltValueField(wireName: r'paths')
  ConfigNodePropertyString? get paths;

  ComDayCqWcmCoreImplEventTemplatePostProcessorProperties._();

  factory ComDayCqWcmCoreImplEventTemplatePostProcessorProperties([void updates(ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplEventTemplatePostProcessorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplEventTemplatePostProcessorProperties> get serializer => _$ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplEventTemplatePostProcessorProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplEventTemplatePostProcessorProperties, _$ComDayCqWcmCoreImplEventTemplatePostProcessorProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplEventTemplatePostProcessorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplEventTemplatePostProcessorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.paths != null) {
      yield r'paths';
      yield serializers.serialize(
        object.paths,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplEventTemplatePostProcessorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.paths.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplEventTemplatePostProcessorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesBuilder();
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

