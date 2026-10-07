//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_properties.g.dart';

/// ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties
///
/// Properties:
/// * [slingPeriodServletPeriodSelectors] 
/// * [slingPeriodServletPeriodExtensions] 
@BuiltValue()
abstract class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties implements Built<ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties, ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.servlet.selectors')
  ConfigNodePropertyArray? get slingPeriodServletPeriodSelectors;

  @BuiltValueField(wireName: r'sling.servlet.extensions')
  ConfigNodePropertyString? get slingPeriodServletPeriodExtensions;

  ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties._();

  factory ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties([void updates(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesBuilder b)]) = _$ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties> get serializer => _$ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesSerializer();
}

class _$ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties, _$ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties];

  @override
  final String wireName = r'ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodServletPeriodSelectors != null) {
      yield r'sling.servlet.selectors';
      yield serializers.serialize(
        object.slingPeriodServletPeriodSelectors,
        specifiedType: const FullType(ConfigNodePropertyArray),
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
    ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.servlet.selectors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
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
  ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesBuilder();
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

