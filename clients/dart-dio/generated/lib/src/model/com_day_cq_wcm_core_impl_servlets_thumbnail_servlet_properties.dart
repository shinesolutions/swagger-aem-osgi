//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties.g.dart';

/// ComDayCqWcmCoreImplServletsThumbnailServletProperties
///
/// Properties:
/// * [workspace] 
/// * [dimensions] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplServletsThumbnailServletProperties implements Built<ComDayCqWcmCoreImplServletsThumbnailServletProperties, ComDayCqWcmCoreImplServletsThumbnailServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'workspace')
  ConfigNodePropertyString? get workspace;

  @BuiltValueField(wireName: r'dimensions')
  ConfigNodePropertyArray? get dimensions;

  ComDayCqWcmCoreImplServletsThumbnailServletProperties._();

  factory ComDayCqWcmCoreImplServletsThumbnailServletProperties([void updates(ComDayCqWcmCoreImplServletsThumbnailServletPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplServletsThumbnailServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplServletsThumbnailServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplServletsThumbnailServletProperties> get serializer => _$ComDayCqWcmCoreImplServletsThumbnailServletPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplServletsThumbnailServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplServletsThumbnailServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplServletsThumbnailServletProperties, _$ComDayCqWcmCoreImplServletsThumbnailServletProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplServletsThumbnailServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplServletsThumbnailServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.workspace != null) {
      yield r'workspace';
      yield serializers.serialize(
        object.workspace,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.dimensions != null) {
      yield r'dimensions';
      yield serializers.serialize(
        object.dimensions,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplServletsThumbnailServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplServletsThumbnailServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'workspace':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.workspace.replace(valueDes);
          break;
        case r'dimensions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.dimensions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplServletsThumbnailServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplServletsThumbnailServletPropertiesBuilder();
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

