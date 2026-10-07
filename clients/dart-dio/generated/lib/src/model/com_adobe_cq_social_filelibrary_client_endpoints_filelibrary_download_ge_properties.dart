//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_properties.g.dart';

/// ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties
///
/// Properties:
/// * [slingPeriodServletPeriodSelectors] 
/// * [slingPeriodServletPeriodExtensions] 
@BuiltValue()
abstract class ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties implements Built<ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties, ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.servlet.selectors')
  ConfigNodePropertyString? get slingPeriodServletPeriodSelectors;

  @BuiltValueField(wireName: r'sling.servlet.extensions')
  ConfigNodePropertyString? get slingPeriodServletPeriodExtensions;

  ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties._();

  factory ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties([void updates(ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesBuilder b)]) = _$ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties> get serializer => _$ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesSerializer();
}

class _$ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties, _$ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties];

  @override
  final String wireName = r'ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodServletPeriodSelectors != null) {
      yield r'sling.servlet.selectors';
      yield serializers.serialize(
        object.slingPeriodServletPeriodSelectors,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodServletPeriodExtensions != null) {
      yield r'sling.servlet.extensions';
      yield serializers.serialize(
        object.slingPeriodServletPeriodExtensions,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.servlet.selectors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodSelectors.replace(valueDes);
          break;
        case r'sling.servlet.extensions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodExtensions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesBuilder();
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

