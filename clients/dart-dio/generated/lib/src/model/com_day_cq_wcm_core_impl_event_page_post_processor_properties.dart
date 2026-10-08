//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_event_page_post_processor_properties.g.dart';

/// ComDayCqWcmCoreImplEventPagePostProcessorProperties
///
/// Properties:
/// * [paths] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplEventPagePostProcessorProperties implements Built<ComDayCqWcmCoreImplEventPagePostProcessorProperties, ComDayCqWcmCoreImplEventPagePostProcessorPropertiesBuilder> {
  @BuiltValueField(wireName: r'paths')
  ConfigNodePropertyArray? get paths;

  ComDayCqWcmCoreImplEventPagePostProcessorProperties._();

  factory ComDayCqWcmCoreImplEventPagePostProcessorProperties([void updates(ComDayCqWcmCoreImplEventPagePostProcessorPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplEventPagePostProcessorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplEventPagePostProcessorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplEventPagePostProcessorProperties> get serializer => _$ComDayCqWcmCoreImplEventPagePostProcessorPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplEventPagePostProcessorPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplEventPagePostProcessorProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplEventPagePostProcessorProperties, _$ComDayCqWcmCoreImplEventPagePostProcessorProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplEventPagePostProcessorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplEventPagePostProcessorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.paths != null) {
      yield r'paths';
      yield serializers.serialize(
        object.paths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplEventPagePostProcessorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplEventPagePostProcessorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
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
  ComDayCqWcmCoreImplEventPagePostProcessorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplEventPagePostProcessorPropertiesBuilder();
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

