//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_projects_impl_servlet_project_image_servlet_properties.g.dart';

/// ComAdobeCqProjectsImplServletProjectImageServletProperties
///
/// Properties:
/// * [imagePeriodQuality] 
/// * [imagePeriodSupportedPeriodResolutions] 
@BuiltValue()
abstract class ComAdobeCqProjectsImplServletProjectImageServletProperties implements Built<ComAdobeCqProjectsImplServletProjectImageServletProperties, ComAdobeCqProjectsImplServletProjectImageServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'image.quality')
  ConfigNodePropertyString? get imagePeriodQuality;

  @BuiltValueField(wireName: r'image.supported.resolutions')
  ConfigNodePropertyString? get imagePeriodSupportedPeriodResolutions;

  ComAdobeCqProjectsImplServletProjectImageServletProperties._();

  factory ComAdobeCqProjectsImplServletProjectImageServletProperties([void updates(ComAdobeCqProjectsImplServletProjectImageServletPropertiesBuilder b)]) = _$ComAdobeCqProjectsImplServletProjectImageServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqProjectsImplServletProjectImageServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqProjectsImplServletProjectImageServletProperties> get serializer => _$ComAdobeCqProjectsImplServletProjectImageServletPropertiesSerializer();
}

class _$ComAdobeCqProjectsImplServletProjectImageServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqProjectsImplServletProjectImageServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqProjectsImplServletProjectImageServletProperties, _$ComAdobeCqProjectsImplServletProjectImageServletProperties];

  @override
  final String wireName = r'ComAdobeCqProjectsImplServletProjectImageServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqProjectsImplServletProjectImageServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.imagePeriodQuality != null) {
      yield r'image.quality';
      yield serializers.serialize(
        object.imagePeriodQuality,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.imagePeriodSupportedPeriodResolutions != null) {
      yield r'image.supported.resolutions';
      yield serializers.serialize(
        object.imagePeriodSupportedPeriodResolutions,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqProjectsImplServletProjectImageServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqProjectsImplServletProjectImageServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'image.quality':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.imagePeriodQuality.replace(valueDes);
          break;
        case r'image.supported.resolutions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.imagePeriodSupportedPeriodResolutions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqProjectsImplServletProjectImageServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqProjectsImplServletProjectImageServletPropertiesBuilder();
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

